package app.cash.local.backend.real;

import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.core.os.BundleKt;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderKey;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.DiscountCodeKt;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.LocationMenuKt;
import app.cash.local.primitives.LocationToken;
import app.cash.local.service.LocalService;
import app.cash.molecule.RecompositionMode;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.local.client.v1.CreateCartRequest;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.LocalShoppingCart;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealCartBuilderManager implements CartBuilderManager {
    public final Analytics analytics;
    public final BuyerIntentManager buyerIntentManager;
    public final BuyerIntentSyncManager buyerIntentSyncManager;
    public final CalculateLineItemsManager calculateLineItemsManager;
    public final RealLocalBrandRepository localBrandRepository;
    public final LocalService service;
    public final SessionManager sessionManager;
    public final ConcurrentHashMap carts = new ConcurrentHashMap();
    public final ConcurrentHashMap seededIntentTokens = new ConcurrentHashMap();

    public RealCartBuilderManager(LocalService localService, RealLocalBrandRepository realLocalBrandRepository, Analytics analytics, SessionManager sessionManager, CalculateLineItemsManager calculateLineItemsManager, BuyerIntentSyncManager buyerIntentSyncManager, BuyerIntentManager buyerIntentManager) {
        this.service = localService;
        this.localBrandRepository = realLocalBrandRepository;
        this.analytics = analytics;
        this.sessionManager = sessionManager;
        this.calculateLineItemsManager = calculateLineItemsManager;
        this.buyerIntentSyncManager = buyerIntentSyncManager;
        this.buyerIntentManager = buyerIntentManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createCart(BrandSpot brandSpot, FulfillmentConfiguration fulfillmentConfiguration, AttributionKey attributionKey, BuyerIntentScope buyerIntentScope, ContinuationImpl continuationImpl) {
        RealCartBuilderManager$createCart$1 realCartBuilderManager$createCart$1;
        int i;
        BrandSpot brandSpot2;
        if (continuationImpl instanceof RealCartBuilderManager$createCart$1) {
            realCartBuilderManager$createCart$1 = (RealCartBuilderManager$createCart$1) continuationImpl;
            int i2 = realCartBuilderManager$createCart$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCartBuilderManager$createCart$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealCartBuilderManager$createCart$1 realCartBuilderManager$createCart$12 = realCartBuilderManager$createCart$1;
                Object obj = realCartBuilderManager$createCart$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCartBuilderManager$createCart$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (buyerIntentScope == null || (brandSpot2 = buyerIntentScope.brandSpot) == null) {
                        brandSpot2 = brandSpot;
                    }
                    CartBuilder builder = buyerIntentScope != null ? getBuilder(buyerIntentScope) : getBuilder(brandSpot);
                    realCartBuilderManager$createCart$12.label = 1;
                    obj = createCartRequest(brandSpot2, attributionKey, fulfillmentConfiguration, builder, realCartBuilderManager$createCart$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Success) {
                            return ((ApiResult.Success) apiResult).response;
                        }
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                        if (failure instanceof ApiResult.Failure.HttpFailure) {
                            Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HttpFailure creating cart [", "]"), new Object[0]);
                            return null;
                        }
                        if (failure instanceof ApiResult.Failure.NetworkFailure) {
                            Timber.Forest.e("NetworkFailure creating cart", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                            return null;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                realCartBuilderManager$createCart$12.label = 2;
                obj = this.service.createCart((CreateCartRequest) obj, realCartBuilderManager$createCart$12);
            }
        }
        realCartBuilderManager$createCart$1 = new RealCartBuilderManager$createCart$1(this, continuationImpl);
        RealCartBuilderManager$createCart$1 realCartBuilderManager$createCart$122 = realCartBuilderManager$createCart$1;
        Object obj2 = realCartBuilderManager$createCart$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCartBuilderManager$createCart$122.label;
        if (i != 0) {
        }
        realCartBuilderManager$createCart$122.label = 2;
        obj2 = this.service.createCart((CreateCartRequest) obj2, realCartBuilderManager$createCart$122);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02c2 A[LOOP:0: B:12:0x02b9->B:14:0x02c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02d0 A[EDGE_INSN: B:15:0x02d0->B:16:0x02d0 BREAK  A[LOOP:0: B:12:0x02b9->B:14:0x02c2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb A[EDGE_INSN: B:36:0x00cb->B:37:0x00cb BREAK  A[LOOP:1: B:27:0x00b1->B:34:0x00b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable createCartRequest(BrandSpot brandSpot, AttributionKey attributionKey, FulfillmentConfiguration fulfillmentConfiguration, CartBuilder cartBuilder, ContinuationImpl continuationImpl) {
        RealCartBuilderManager$createCartRequest$1 realCartBuilderManager$createCartRequest$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        AttributionKey attributionKey2;
        FulfillmentConfiguration fulfillmentConfiguration2;
        BrandSpot brandSpot2;
        CartBuilder cartBuilder2;
        Object obj;
        String str;
        ListIterator listIterator;
        StateListIterator stateListIterator;
        Iterator it;
        String str2;
        Object first;
        String str3;
        CartBuilder cartBuilder3;
        AttributionKey attributionKey3;
        BrandSpot brandSpot3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ListIterator listIterator2;
        StateListIterator stateListIterator2;
        if (continuationImpl instanceof RealCartBuilderManager$createCartRequest$1) {
            realCartBuilderManager$createCartRequest$1 = (RealCartBuilderManager$createCartRequest$1) continuationImpl;
            int i2 = realCartBuilderManager$createCartRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCartBuilderManager$createCartRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realCartBuilderManager$createCartRequest$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCartBuilderManager$createCartRequest$1.label;
                String str4 = null;
                int i3 = 10;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    String str5 = brandSpot.locationToken;
                    if ((str5 != null ? new LocationToken(str5) : null) == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    ChannelFlowTransformLatest brand = this.localBrandRepository.brand(brandSpot);
                    realCartBuilderManager$createCartRequest$1.L$0 = brandSpot;
                    attributionKey2 = attributionKey;
                    realCartBuilderManager$createCartRequest$1.L$1 = attributionKey2;
                    fulfillmentConfiguration2 = fulfillmentConfiguration;
                    realCartBuilderManager$createCartRequest$1.L$2 = fulfillmentConfiguration2;
                    realCartBuilderManager$createCartRequest$1.L$3 = cartBuilder;
                    realCartBuilderManager$createCartRequest$1.L$4 = null;
                    realCartBuilderManager$createCartRequest$1.label = 1;
                    Object first2 = FlowKt.first(brand, realCartBuilderManager$createCartRequest$1);
                    if (first2 != coroutineSingletons) {
                        brandSpot2 = brandSpot;
                        cartBuilder2 = cartBuilder;
                        obj = first2;
                        str = null;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ArrayList arrayList3 = realCartBuilderManager$createCartRequest$1.L$6;
                    String str6 = realCartBuilderManager$createCartRequest$1.L$4;
                    cartBuilder3 = realCartBuilderManager$createCartRequest$1.L$3;
                    fulfillmentConfiguration2 = realCartBuilderManager$createCartRequest$1.L$2;
                    attributionKey3 = realCartBuilderManager$createCartRequest$1.L$1;
                    brandSpot3 = realCartBuilderManager$createCartRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    arrayList = arrayList3;
                    str3 = str6;
                    str2 = null;
                    String str7 = brandSpot3.brandToken;
                    String str8 = brandSpot3.locationToken;
                    str8.getClass();
                    LocalMoney localMoneyProto = LocalMoneyKt.toLocalMoneyProto((app.cash.local.primitives.LocalMoney) obj2);
                    String str9 = attributionKey3.value;
                    SnapshotStateList snapshotStateList = ((RealCartBuilder) cartBuilder3).discountCodes;
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                    listIterator2 = snapshotStateList.listIterator();
                    while (true) {
                        stateListIterator2 = (StateListIterator) listIterator2;
                        if (stateListIterator2.hasNext()) {
                            break;
                        }
                        arrayList2.add(((DiscountCode) stateListIterator2.next()).getCode());
                    }
                    RealCartBuilder realCartBuilder = (RealCartBuilder) cartBuilder3;
                    String offerToken = DiscountCodeKt.getOfferToken(realCartBuilder.discountCodes);
                    return new CreateCartRequest(str7, str8, arrayList, localMoneyProto, str9, realCartBuilder.checkoutFlowToken, arrayList2, FulfillmentConfigurationKt.toProtoFulfillment(fulfillmentConfiguration2), str3, offerToken != null ? str2 : offerToken, null, null, null, 63504);
                }
                str = realCartBuilderManager$createCartRequest$1.L$4;
                cartBuilder2 = realCartBuilderManager$createCartRequest$1.L$3;
                fulfillmentConfiguration2 = realCartBuilderManager$createCartRequest$1.L$2;
                AttributionKey attributionKey4 = realCartBuilderManager$createCartRequest$1.L$1;
                brandSpot2 = realCartBuilderManager$createCartRequest$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                obj = obj2;
                attributionKey2 = attributionKey4;
                LocalLocationDetail localLocationDetail = ((LocalBrand) obj).selected_location;
                localLocationDetail.getClass();
                LocalMenu localMenu = localLocationDetail.menu;
                localMenu.getClass();
                LocationMenu locationMenu = LocationMenuKt.toLocationMenu(localMenu);
                SnapshotStateList snapshotStateList2 = ((RealCartBuilder) cartBuilder2).selections;
                ArrayList arrayList4 = new ArrayList();
                listIterator = snapshotStateList2.listIterator();
                while (true) {
                    stateListIterator = (StateListIterator) listIterator;
                    if (stateListIterator.hasNext()) {
                        break;
                    }
                    Object next = stateListIterator.next();
                    if (((CartEntryWithQuantity) next).getQuantity() > 0) {
                        arrayList4.add(next);
                    }
                }
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) it.next();
                    CartEntry cartEntry = cartEntryWithQuantity.getCartEntry();
                    String str10 = cartEntry.menuItemToken;
                    String str11 = str4;
                    Integer num = new Integer(cartEntryWithQuantity.getQuantity());
                    String str12 = cartEntry.variationToken;
                    String str13 = str12 == null ? str11 : str12;
                    SortedSet<CartEntry.ModifierSelection> sortedSet = cartEntry.modifierSelections;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet, i3));
                    for (CartEntry.ModifierSelection modifierSelection : sortedSet) {
                        modifierSelection.getClass();
                        arrayList6.add(new LocalCart.Line.Selection.Modifier(modifierSelection.selectionToken, modifierSelection.quantity, null, null, null, null, 60, null));
                    }
                    SortedSet<CartEntry.ModifierFreeEntry> sortedSet2 = cartEntry.freeTextEntries;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet2, 10));
                    for (CartEntry.ModifierFreeEntry modifierFreeEntry : sortedSet2) {
                        modifierFreeEntry.getClass();
                        arrayList7.add(new LocalCart.Line.Selection.TextModifier(modifierFreeEntry.listToken, modifierFreeEntry.input, null, null, 12, null));
                    }
                    List list = cartEntry.comboSlotSelections;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        CartEntry.ComboSlotSelection comboSlotSelection = (CartEntry.ComboSlotSelection) it2.next();
                        String str14 = comboSlotSelection.comboSlotToken;
                        Iterator it3 = it2;
                        String str15 = comboSlotSelection.menuItemToken;
                        String str16 = comboSlotSelection.variationToken;
                        String str17 = str16 == null ? str11 : str16;
                        SortedSet<CartEntry.ModifierSelection> sortedSet3 = comboSlotSelection.modifierSelections;
                        ArrayList arrayList9 = arrayList7;
                        Iterator it4 = it;
                        ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet3, 10));
                        for (CartEntry.ModifierSelection modifierSelection2 : sortedSet3) {
                            modifierSelection2.getClass();
                            arrayList10.add(new LocalCart.Line.Selection.Modifier(modifierSelection2.selectionToken, modifierSelection2.quantity, null, null, null, null, 60, null));
                        }
                        SortedSet<CartEntry.ModifierFreeEntry> sortedSet4 = comboSlotSelection.freeTextEntries;
                        ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet4, 10));
                        for (CartEntry.ModifierFreeEntry modifierFreeEntry2 : sortedSet4) {
                            modifierFreeEntry2.getClass();
                            arrayList11.add(new LocalCart.Line.Selection.TextModifier(modifierFreeEntry2.listToken, modifierFreeEntry2.input, null, null, 12, null));
                        }
                        arrayList8.add(new LocalCart.Line.Selection.ComboSlot(str14, str15, str17, arrayList10, arrayList11, null, null, null, 224, null));
                        it2 = it3;
                        it = it4;
                        arrayList7 = arrayList9;
                    }
                    arrayList5.add(new LocalCart.Line.Selection(str10, num, str13, arrayList6, arrayList7, arrayList8, null, 64, null));
                    str4 = str11;
                    i3 = 10;
                }
                str2 = str4;
                RecompositionMode recompositionMode = RecompositionMode.ContextClock;
                Flow moleculeFlow$default = BundleKt.moleculeFlow$default(new TextKt$$ExternalSyntheticLambda0(28, cartBuilder2, locationMenu));
                realCartBuilderManager$createCartRequest$1.L$0 = brandSpot2;
                realCartBuilderManager$createCartRequest$1.L$1 = attributionKey2;
                realCartBuilderManager$createCartRequest$1.L$2 = fulfillmentConfiguration2;
                realCartBuilderManager$createCartRequest$1.L$3 = cartBuilder2;
                realCartBuilderManager$createCartRequest$1.L$4 = str;
                realCartBuilderManager$createCartRequest$1.L$6 = arrayList5;
                realCartBuilderManager$createCartRequest$1.label = 2;
                first = FlowKt.first(moleculeFlow$default, realCartBuilderManager$createCartRequest$1);
                if (first != coroutineSingletons) {
                    str3 = str;
                    cartBuilder3 = cartBuilder2;
                    attributionKey3 = attributionKey2;
                    obj2 = first;
                    brandSpot3 = brandSpot2;
                    arrayList = arrayList5;
                    String str72 = brandSpot3.brandToken;
                    String str82 = brandSpot3.locationToken;
                    str82.getClass();
                    LocalMoney localMoneyProto2 = LocalMoneyKt.toLocalMoneyProto((app.cash.local.primitives.LocalMoney) obj2);
                    String str92 = attributionKey3.value;
                    SnapshotStateList snapshotStateList3 = ((RealCartBuilder) cartBuilder3).discountCodes;
                    arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList3, 10));
                    listIterator2 = snapshotStateList3.listIterator();
                    while (true) {
                        stateListIterator2 = (StateListIterator) listIterator2;
                        if (stateListIterator2.hasNext()) {
                        }
                        arrayList2.add(((DiscountCode) stateListIterator2.next()).getCode());
                    }
                    RealCartBuilder realCartBuilder2 = (RealCartBuilder) cartBuilder3;
                    String offerToken2 = DiscountCodeKt.getOfferToken(realCartBuilder2.discountCodes);
                    return new CreateCartRequest(str72, str82, arrayList, localMoneyProto2, str92, realCartBuilder2.checkoutFlowToken, arrayList2, FulfillmentConfigurationKt.toProtoFulfillment(fulfillmentConfiguration2), str3, offerToken2 != null ? str2 : offerToken2, null, null, null, 63504);
                }
                return coroutineSingletons;
            }
        }
        realCartBuilderManager$createCartRequest$1 = new RealCartBuilderManager$createCartRequest$1(this, continuationImpl);
        Object obj22 = realCartBuilderManager$createCartRequest$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCartBuilderManager$createCartRequest$1.label;
        String str42 = null;
        int i32 = 10;
        if (i != 0) {
        }
        LocalLocationDetail localLocationDetail2 = ((LocalBrand) obj).selected_location;
        localLocationDetail2.getClass();
        LocalMenu localMenu2 = localLocationDetail2.menu;
        localMenu2.getClass();
        LocationMenu locationMenu2 = LocationMenuKt.toLocationMenu(localMenu2);
        SnapshotStateList snapshotStateList22 = ((RealCartBuilder) cartBuilder2).selections;
        ArrayList arrayList42 = new ArrayList();
        listIterator = snapshotStateList22.listIterator();
        while (true) {
            stateListIterator = (StateListIterator) listIterator;
            if (stateListIterator.hasNext()) {
            }
        }
        ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList42, 10));
        it = arrayList42.iterator();
        while (it.hasNext()) {
        }
        str2 = str42;
        RecompositionMode recompositionMode2 = RecompositionMode.ContextClock;
        Flow moleculeFlow$default2 = BundleKt.moleculeFlow$default(new TextKt$$ExternalSyntheticLambda0(28, cartBuilder2, locationMenu2));
        realCartBuilderManager$createCartRequest$1.L$0 = brandSpot2;
        realCartBuilderManager$createCartRequest$1.L$1 = attributionKey2;
        realCartBuilderManager$createCartRequest$1.L$2 = fulfillmentConfiguration2;
        realCartBuilderManager$createCartRequest$1.L$3 = cartBuilder2;
        realCartBuilderManager$createCartRequest$1.L$4 = str;
        realCartBuilderManager$createCartRequest$1.L$6 = arrayList52;
        realCartBuilderManager$createCartRequest$1.label = 2;
        first = FlowKt.first(moleculeFlow$default2, realCartBuilderManager$createCartRequest$1);
        if (first != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final CartBuilder getBuilder(CartBuilderKey cartBuilderKey, BrandSpot brandSpot) {
        BuyerIntentScope buyerIntentScope;
        BuyerIntentState current;
        Job job;
        boolean z = cartBuilderKey instanceof CartBuilderKey.BuyerIntent;
        if (z) {
            CalculateLineItemsManager calculateLineItemsManager = this.calculateLineItemsManager;
            calculateLineItemsManager.stopObserving(brandSpot);
            Set keySet = this.carts.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (obj instanceof CartBuilderKey.Legacy) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((CartBuilderKey.Legacy) it.next()).brandSpot);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                BrandSpot brandSpot2 = (BrandSpot) next;
                if (!Intrinsics.areEqual(brandSpot2, brandSpot) && ((RealBuyerIntentManager) this.buyerIntentManager).hasActiveBrandSpot(brandSpot2)) {
                    arrayList3.add(next);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                calculateLineItemsManager.stopObserving((BrandSpot) it3.next());
            }
        }
        Object computeIfAbsent = this.carts.computeIfAbsent(cartBuilderKey, new RealCartBuilderManager$$ExternalSyntheticLambda1(0, new RealBadger2$$ExternalSyntheticLambda0(9, this, brandSpot)));
        computeIfAbsent.getClass();
        CartBuilder cartBuilder = (CartBuilder) computeIfAbsent;
        Continuation continuation = null;
        if (z && (current = ((RealBuyerIntentManager) this.buyerIntentManager).current((buyerIntentScope = ((CartBuilderKey.BuyerIntent) cartBuilderKey).scope))) != null) {
            LocalShoppingCart shoppingCart = current.getShoppingCart();
            if (shoppingCart == null || ((shoppingCart.lines.isEmpty() && shoppingCart.applied_discount_codes.isEmpty()) || Intrinsics.areEqual(this.seededIntentTokens.get(buyerIntentScope), current.intentToken))) {
                this.buyerIntentSyncManager.observeAndApplyMutations(buyerIntentScope, cartBuilder);
            } else {
                BuyerIntentSyncManager buyerIntentSyncManager = this.buyerIntentSyncManager;
                synchronized (buyerIntentSyncManager.lock) {
                    job = (Job) buyerIntentSyncManager.syncJobs.remove(buyerIntentScope);
                }
                if (job != null) {
                    job.cancel(null);
                }
            }
        }
        if (!(cartBuilderKey instanceof CartBuilderKey.Legacy)) {
            return cartBuilder;
        }
        boolean hasActiveBrandSpot = ((RealBuyerIntentManager) this.buyerIntentManager).hasActiveBrandSpot(brandSpot);
        CalculateLineItemsManager calculateLineItemsManager2 = this.calculateLineItemsManager;
        if (hasActiveBrandSpot) {
            calculateLineItemsManager2.stopObserving(brandSpot);
            return cartBuilder;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (calculateLineItemsManager2.lock) {
            Job job2 = (Job) calculateLineItemsManager2.observationJobs.get(((RealCartBuilder) cartBuilder).brandSpot);
            if (job2 != null && job2.isActive()) {
                return cartBuilder;
            }
            StandaloneCoroutine launch$default = JobKt.launch$default(calculateLineItemsManager2.scope, null, null, new ZiplineLoader$ModuleJob$run$3(calculateLineItemsManager2, cartBuilder, continuation, 4), 3);
            ref$ObjectRef.element = launch$default;
            calculateLineItemsManager2.observationJobs.put(((RealCartBuilder) cartBuilder).brandSpot, launch$default);
            if (job2 != null) {
                job2.cancel(null);
            }
            ((Job) ref$ObjectRef.element).invokeOnCompletion(new MenuKt$$ExternalSyntheticLambda0(28, calculateLineItemsManager2, cartBuilder, ref$ObjectRef));
            return cartBuilder;
        }
    }

    public final CartBuilder getBuilder(BuyerIntentScope buyerIntentScope) {
        buyerIntentScope.getClass();
        BrandSpot brandSpot = buyerIntentScope.brandSpot;
        String str = brandSpot.locationToken;
        if ((str != null ? new LocationToken(str) : null) != null) {
            return getBuilder(new CartBuilderKey.BuyerIntent(buyerIntentScope), brandSpot);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }

    public final CartBuilder getBuilder(BrandSpot brandSpot) {
        brandSpot.getClass();
        String str = brandSpot.locationToken;
        if ((str != null ? new LocationToken(str) : null) != null) {
            return getBuilder(new CartBuilderKey.Legacy(brandSpot), brandSpot);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }
}
