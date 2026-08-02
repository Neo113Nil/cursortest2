package com.squareup.cash.paychecks.common.presenters;

import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.cdf.featurerestrictionbanner.Location;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.backend.api.GeneralPaychecksException;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.util.money.Moneys;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntProgressionIterator;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class UtilsKt {
    public static final Location access$toAnalyticsLocation(KybEligibilityWarning.RestrictedFeature restrictedFeature) {
        switch (restrictedFeature.ordinal()) {
            case 1:
                return Location.STOCKS;
            case 2:
                return Location.BITCOIN;
            case 3:
                return Location.MONEY;
            case 4:
                return Location.FAMILIES;
            case 5:
                return Location.CARD;
            case 6:
                return Location.DIRECT_DEPOSIT;
            case 7:
                return Location.PAYCHECKS;
            default:
                return null;
        }
    }

    public static final boolean calculateIfHorizontallyStacked(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = EmptyList.INSTANCE;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    SemanticsNode semanticsNode = (SemanticsNode) obj2;
                    SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (semanticsNode2.getBoundsInRoot().m633getCenterF1C5BW0() >> 32)) - Float.intBitsToFloat((int) (semanticsNode.getBoundsInRoot().m633getCenterF1C5BW0() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (semanticsNode2.getBoundsInRoot().m633getCenterF1C5BW0() & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (semanticsNode.getBoundsInRoot().m633getCenterF1C5BW0() & BodyPartID.bodyIdMax)));
                    arrayList2.add(new Offset((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & BodyPartID.bodyIdMax)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((Offset) CollectionsKt.first(list)).packedValue;
            } else {
                if (list.isEmpty()) {
                    ListUtilsKt.throwUnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object first = CollectionsKt.first(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        first = new Offset(Offset.m626plusMKHz9U(((Offset) first).packedValue, ((Offset) list.get(i2)).packedValue));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((Offset) first).packedValue;
            }
            if (Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final PaychecksUiConfiguration.PaychecksDestinationUi.DestinationUiConfiguration getConfigForDestination(PaychecksUiConfiguration paychecksUiConfiguration, AllocationDestination allocationDestination) {
        allocationDestination.getClass();
        try {
            Object obj = null;
            boolean z = false;
            for (Object obj2 : paychecksUiConfiguration.destinationUiConfigs) {
                if (((PaychecksUiConfiguration.PaychecksDestinationUi) obj2).destination.getClass() == allocationDestination.getClass()) {
                    if (z) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z = true;
                    obj = obj2;
                }
            }
            if (z) {
                return ((PaychecksUiConfiguration.PaychecksDestinationUi) obj).destinationUiConfig;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception e) {
            throw new GeneralPaychecksException(Recorder$$ExternalSyntheticOutline2.m("Could find paychecks UI config for destination: ", Reflection.factory.getOrCreateKotlinClass(allocationDestination.getClass()).getSimpleName()), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean getHasNonCashBalanceAllocations(PaycheckAllocationDistribution paycheckAllocationDistribution) {
        int i;
        List list;
        if (paycheckAllocationDistribution != null && (list = paycheckAllocationDistribution.allocations) != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((PaycheckAllocationDistribution.DestinationAndShare) it.next()).destination instanceof AllocationDestination.CashBalanceDestination) && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                        throw null;
                    }
                }
                return i == 0;
            }
        }
        i = 0;
        if (i == 0) {
        }
    }

    public static final PaycheckAllocationDistribution.DestinationAndShare getHighestAllocation(PaycheckAllocationDistribution paycheckAllocationDistribution) {
        Iterator it = paycheckAllocationDistribution.allocations.iterator();
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((PaycheckAllocationDistribution.DestinationAndShare) next).shareInBasisPoints;
            do {
                Object next2 = it.next();
                long j2 = ((PaycheckAllocationDistribution.DestinationAndShare) next2).shareInBasisPoints;
                if (j < j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        return (PaycheckAllocationDistribution.DestinationAndShare) next;
    }

    public static final Money getTotalAmount(PaychecksUiState.TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation) {
        timeBoundedPaychecksAggregation.getClass();
        return Moneys.plus(sumAmounts(timeBoundedPaychecksAggregation.deductions, new HelpSheetViewKt$$ExternalSyntheticLambda4(1)), sumAmounts(timeBoundedPaychecksAggregation.realizedAllocationAmounts, new HelpSheetViewKt$$ExternalSyntheticLambda4(3)));
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        Object obj = semanticsNode.getConfig().props.get(SemanticsProperties.CollectionInfo);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            return true;
        }
        Object obj2 = semanticsNode.getConfig().props.get(SemanticsProperties.SelectableGroup);
        return (obj2 != null ? obj2 : null) != null;
    }

    public static final String percentageString(PaycheckAllocationDistribution.DestinationAndShare destinationAndShare, NumberFormat numberFormat) {
        destinationAndShare.getClass();
        numberFormat.getClass();
        String format2 = numberFormat.format(Float.valueOf(destinationAndShare.shareInBasisPoints / 10000.0f));
        format2.getClass();
        return format2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r2 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List productTintWheelPalette(PaychecksUiConfiguration paychecksUiConfiguration, List list, Function1 function1) {
        Object next;
        List list2;
        Object obj;
        ArrayList arrayList = paychecksUiConfiguration.productTintWheelColorLists;
        list.getClass();
        if (list.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((List) obj).size() == list.size()) {
                    break;
                }
            }
            list2 = (List) obj;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int size = ((List) next).size();
                do {
                    Object next2 = it2.next();
                    int size2 = ((List) next2).size();
                    if (size < size2) {
                        next = next2;
                        size = size2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        list2 = (List) next;
        if (list2 == null) {
            return EmptyList.INSTANCE;
        }
        int size3 = list.size();
        ArrayList arrayList3 = new ArrayList(size3);
        for (int i = 0; i < size3; i++) {
            arrayList3.add(null);
        }
        Iterator it3 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i2 = -1;
                break;
            }
            if (function1.invoke(it3.next()) instanceof AllocationDestination.CashBalanceDestination) {
                break;
            }
            i2++;
        }
        int i3 = i2 != -1 ? 1 : 0;
        IntProgressionIterator it4 = CollectionsKt__CollectionsKt.getIndices(list).iterator();
        while (it4.hasNext) {
            int nextInt = it4.nextInt();
            arrayList3.set(nextInt, (Color) (nextInt == i2 ? CollectionsKt.firstOrNull(list2) : CollectionsKt.getOrNull(i3, list2)));
            i3++;
        }
        return arrayList3;
    }

    public static final void setCollectionInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Object obj = semanticsNode.getConfig().props.get(SemanticsProperties.CollectionInfo);
        if (obj == null) {
            obj = null;
        }
        CollectionInfo collectionInfo = (CollectionInfo) obj;
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(Toolbar.AnonymousClass1.obtain(collectionInfo.rowCount, collectionInfo.columnCount, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object obj2 = semanticsNode.getConfig().props.get(SemanticsProperties.SelectableGroup);
        if ((obj2 != null ? obj2 : null) != null) {
            List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, 4);
            int size = children$ui$default.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) children$ui$default.get(i);
                if (semanticsNode2.getConfig().props.containsKey(SemanticsProperties.Selected)) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        accessibilityNodeInfoCompat.setCollectionInfo(Toolbar.AnonymousClass1.obtain(calculateIfHorizontallyStacked ? 1 : arrayList.size(), calculateIfHorizontallyStacked ? arrayList.size() : 1, 0));
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Object obj = semanticsNode.getConfig().props.get(SemanticsProperties.CollectionItemInfo);
        if (obj == null) {
            obj = null;
        }
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) obj;
        if (collectionItemInfo != null) {
            int i = collectionItemInfo.rowIndex;
            int i2 = collectionItemInfo.rowSpan;
            int i3 = collectionItemInfo.columnIndex;
            Object obj2 = semanticsNode.getConfig().props.get(SemanticsProperties.Selected);
            if (obj2 == null) {
                obj2 = Boolean.FALSE;
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(((Boolean) obj2).booleanValue(), i, i2, i3, 1));
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent == null) {
            return;
        }
        Object obj3 = parent.getConfig().props.get(SemanticsProperties.SelectableGroup);
        if (obj3 == null) {
            obj3 = null;
        }
        if (obj3 != null) {
            Object obj4 = parent.getConfig().props.get(SemanticsProperties.CollectionInfo);
            CollectionInfo collectionInfo = (CollectionInfo) (obj4 != null ? obj4 : null);
            if (collectionInfo == null || (collectionInfo.rowCount >= 0 && collectionInfo.columnCount >= 0)) {
                if (semanticsNode.getConfig().props.containsKey(SemanticsProperties.Selected)) {
                    ArrayList arrayList = new ArrayList();
                    List children$ui$default = SemanticsNode.getChildren$ui$default(parent, false, 4);
                    int size = children$ui$default.size();
                    int i4 = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        SemanticsNode semanticsNode2 = (SemanticsNode) children$ui$default.get(i5);
                        if (semanticsNode2.getConfig().props.containsKey(SemanticsProperties.Selected)) {
                            arrayList.add(semanticsNode2);
                            if (semanticsNode2.layoutNode.getPlaceOrder$ui() < semanticsNode.layoutNode.getPlaceOrder$ui()) {
                                i4++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
                    int i6 = calculateIfHorizontallyStacked ? 0 : i4;
                    int i7 = calculateIfHorizontallyStacked ? i4 : 0;
                    Object obj5 = semanticsNode.getConfig().props.get(SemanticsProperties.Selected);
                    if (obj5 == null) {
                        obj5 = Boolean.FALSE;
                    }
                    accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(((Boolean) obj5).booleanValue(), i6, 1, i7, 1));
                }
            }
        }
    }

    public static final boolean sortOrderForDistributionWheel(AllocationDestination allocationDestination) {
        allocationDestination.getClass();
        allocationDestination.getClass();
        return allocationDestination instanceof AllocationDestination.CashBalanceDestination;
    }

    public static final Money sumAmounts(ArrayList arrayList, Function1 function1) {
        Money money = new Money((Long) 0L, (CurrencyCode) null, 6);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Money money2 = (Money) function1.invoke(it.next());
            Long l = money.amount;
            l.getClass();
            long longValue = l.longValue();
            Long l2 = money2.amount;
            l2.getClass();
            money = Money.copy$default(money, Long.valueOf(l2.longValue() + longValue), money2.currency_code, null, 4);
        }
        return money;
    }

    public static final List toWheelAllocations(ArrayList arrayList, Long l, PaychecksUiConfiguration paychecksUiConfiguration) {
        if (l == null || l.longValue() == 0) {
            return EmptyList.INSTANCE;
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList, new LinkedHashTreeMap.AnonymousClass1(1));
        if (sortedWith == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : sortedWith) {
            if (((PaychecksUiState.RealizedAllocationAmount) obj).realizedAmount.amount != null) {
                arrayList2.add(obj);
            }
        }
        List productTintWheelPalette = productTintWheelPalette(paychecksUiConfiguration, arrayList2, new OffersStyledTextKt$$ExternalSyntheticLambda0(29));
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            PaychecksUiState.RealizedAllocationAmount realizedAllocationAmount = (PaychecksUiState.RealizedAllocationAmount) next;
            Color color = (Color) CollectionsKt.getOrNull(i, productTintWheelPalette);
            if (color == null) {
                color = getConfigForDestination(paychecksUiConfiguration, realizedAllocationAmount.destination).tint;
            }
            DistributionWheelViewModel.SingleAllocation singleAllocation = realizedAllocationAmount.realizedAmount.amount != null ? new DistributionWheelViewModel.SingleAllocation(r3.longValue() / l.longValue(), color) : null;
            if (singleAllocation != null) {
                arrayList3.add(singleAllocation);
            }
            i = i2;
        }
        return arrayList3;
    }

    public static final ArrayList toWheelAllocations(PaycheckAllocationDistribution paycheckAllocationDistribution, PaychecksUiConfiguration paychecksUiConfiguration) {
        paycheckAllocationDistribution.getClass();
        List sortedWith = CollectionsKt.sortedWith(paycheckAllocationDistribution.allocations, new b.C0008b(29));
        List productTintWheelPalette = productTintWheelPalette(paychecksUiConfiguration, sortedWith, new HelpSheetViewKt$$ExternalSyntheticLambda4(2));
        List list = sortedWith;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            PaycheckAllocationDistribution.DestinationAndShare destinationAndShare = (PaycheckAllocationDistribution.DestinationAndShare) obj;
            Color color = (Color) CollectionsKt.getOrNull(i, productTintWheelPalette);
            if (color == null) {
                color = getConfigForDestination(paychecksUiConfiguration, destinationAndShare.destination).tint;
            }
            arrayList.add(new DistributionWheelViewModel.SingleAllocation(destinationAndShare.shareInBasisPoints / 10000.0f, color));
            i = i2;
        }
        return arrayList;
    }
}
