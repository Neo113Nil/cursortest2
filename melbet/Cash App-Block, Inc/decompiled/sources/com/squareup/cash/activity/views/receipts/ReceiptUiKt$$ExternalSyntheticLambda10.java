package com.squareup.cash.activity.views.receipts;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.viewmodels.ReactionsState;
import com.squareup.cash.activity.viewmodels.ReceiptViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.ReceiptSection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIterator;

/* loaded from: classes5.dex */
public final /* synthetic */ class ReceiptUiKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReceiptViewModel.Loaded f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ReceiptUiKt$$ExternalSyntheticLambda10(ReceiptViewModel.Loaded loaded, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = loaded;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        int i = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$1;
        ReceiptViewModel.Loaded loaded = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(navigationBarsPadding, 16.0f);
                    ReactionsState reactionsState = loaded.reactionsState;
                    PaymentHistoryButton paymentHistoryButton = loaded.primaryButton;
                    PaymentHistoryButton paymentHistoryButton2 = loaded.secondaryButton;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(18, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier reactionsAnchor = AvatarsKt.reactionsAnchor(m298padding3ABfNKs, reactionsState, (Function1) rememberedValue);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, reactionsAnchor);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (paymentHistoryButton2 == null) {
                        gapComposer.startReplaceGroup(1958565438);
                    } else {
                        gapComposer.startReplaceGroup(1958565439);
                        ReceiptUiKt.ReceiptButtonCta(paymentHistoryButton2, function1, gapComposer, 0);
                    }
                    gapComposer.end(false);
                    if (paymentHistoryButton == null || paymentHistoryButton2 == null) {
                        gapComposer.startReplaceGroup(1958748370);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1958694554);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    }
                    if (paymentHistoryButton == null) {
                        gapComposer.startReplaceGroup(1958783678);
                    } else {
                        gapComposer.startReplaceGroup(1958783679);
                        ReceiptUiKt.ReceiptButtonCta(paymentHistoryButton, function1, gapComposer, 0);
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function0);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ReceiptUiKt.ReceiptHeader(loaded, function1, gapComposer2, 0);
                    List list = loaded.receiptSections;
                    boolean changed2 = gapComposer2.changed(list);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == obj3) {
                        IndexingIterable withIndex = CollectionsKt.withIndex(list);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = withIndex.iterator();
                        while (true) {
                            ArrayIterator arrayIterator = (ArrayIterator) it;
                            if (((Iterator) arrayIterator.f1520array).hasNext()) {
                                Object next = arrayIterator.next();
                                List<ReceiptSection.Entry> list2 = ((ReceiptSection) ((IndexedValue) next).value).entries;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator<T> it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        ReceiptSection.Entry.Type type2 = ((ReceiptSection.Entry) it2.next()).type;
                                        if ((type2 instanceof ReceiptSection.Entry.Type.Upsell) || (type2 instanceof ReceiptSection.Entry.Type.ImageRow)) {
                                            arrayList.add(next);
                                        }
                                    }
                                }
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    linkedHashSet.add(Integer.valueOf(((IndexedValue) it3.next()).index));
                                }
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
                                Iterator it4 = linkedHashSet.iterator();
                                while (it4.hasNext()) {
                                    int intValue3 = ((Number) it4.next()).intValue() + 1;
                                    int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
                                    if (intValue3 > lastIndex) {
                                        intValue3 = lastIndex;
                                    }
                                    arrayList2.add(Integer.valueOf(intValue3));
                                }
                                rememberedValue2 = SetsKt___SetsKt.plus((Set) linkedHashSet, (Iterable) arrayList2);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            }
                        }
                    }
                    Set set = (Set) rememberedValue2;
                    gapComposer2.startReplaceGroup(-1094894416);
                    int i2 = 0;
                    for (Object obj4 : loaded.receiptSections) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        ReceiptSection receiptSection = (ReceiptSection) obj4;
                        if (set.contains(Integer.valueOf(i2))) {
                            gapComposer2.startReplaceGroup(-785949694);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(-786422506);
                            String str = receiptSection.title;
                            if (str == null || str.length() == 0) {
                                gapComposer2.startReplaceGroup(-25365594);
                                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                gapComposer2.end(false);
                                f = 16.0f;
                            } else {
                                gapComposer2.startReplaceGroup(-25363995);
                                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                gapComposer2.end(false);
                                f = 32.0f;
                            }
                            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
                            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                            DefaultSizes.spacing.getClass();
                            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                            ModalKt.HorizontalDivider(0, 0, gapComposer2, SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 16.0f, 16.0f, f));
                            gapComposer2.end(false);
                        }
                        ReceiptUiKt.Section(receiptSection, function1, gapComposer2, 0);
                        i2 = i3;
                    }
                    gapComposer2.end(false);
                    gapComposer2.end(true);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                    ReceiptSection.TimelineEntry.EventDetailsOverlay eventDetailsOverlay = loaded.timelineDetailsOverlay;
                    if (eventDetailsOverlay == null) {
                        gapComposer2.startReplaceGroup(1449873358);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1449873359);
                        boolean changed3 = gapComposer2.changed(function1);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue3 == obj3) {
                            rememberedValue3 = new ReceiptUiKt$$ExternalSyntheticLambda3(6, function1);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        SheetKt.Sheet((Function0) rememberedValue3, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(41300500, new BalanceFeedKt$$ExternalSyntheticLambda9(eventDetailsOverlay, 7), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ReceiptUiKt.Receipt(loaded, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ReceiptUiKt.ReceiptHeader(loaded, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ReceiptUiKt$$ExternalSyntheticLambda10(ReceiptViewModel.Loaded loaded, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = loaded;
        this.f$1 = function1;
    }
}
