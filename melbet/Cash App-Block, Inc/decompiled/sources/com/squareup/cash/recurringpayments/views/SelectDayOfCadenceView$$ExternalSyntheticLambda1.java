package com.squareup.cash.recurringpayments.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.core.os.TraceCompat$Api29Impl;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.recurringpayments.viewmodels.DayOfCadenceOption;
import com.squareup.cash.recurringpayments.viewmodels.SelectDayOfCadenceViewModel;
import com.squareup.cash.recurringpayments.views.SelectDayOfCadenceView;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SelectDayOfCadenceView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SelectDayOfCadenceViewModel f$1;
    public final /* synthetic */ SelectDayOfCadenceView f$2;

    public /* synthetic */ SelectDayOfCadenceView$$ExternalSyntheticLambda1(SelectDayOfCadenceView selectDayOfCadenceView, SelectDayOfCadenceViewModel selectDayOfCadenceViewModel, Function1 function1, int i) {
        this.f$2 = selectDayOfCadenceView;
        this.f$1 = selectDayOfCadenceViewModel;
        this.f$0 = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0268  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean changedInstance;
        NeverEqualPolicy neverEqualPolicy;
        int i2 = this.$r8$classId;
        Function1 function1 = this.f$0;
        SelectDayOfCadenceViewModel selectDayOfCadenceViewModel = this.f$1;
        SelectDayOfCadenceView selectDayOfCadenceView = this.f$2;
        switch (i2) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(OffsetKt.height(SpacerKt.systemBarsPadding(companion), IntrinsicSize.Max), 1.0f);
                    long j = MooncakeTheme.getColors(gapComposer).background;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, j, rectangleShapeKt$RectangleShape$1);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(companion, MooncakeTheme.getColors(gapComposer).background, rectangleShapeKt$RectangleShape$1);
                    NavigationIconType navigationIconType = NavigationIconType.CLOSE;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy2) {
                        rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(4, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SelectDayOfCadenceView selectDayOfCadenceView2 = selectDayOfCadenceView;
                    Function1 function12 = function1;
                    NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
                    KeypadKt.m3654ToolbarA_Dysh8(null, m177backgroundbw27NRU2, navigationIconType, 0L, (Function0) rememberedValue, null, gapComposer, 24582, 364);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.m300paddingVpY3zN4$default(ImageKt.verticalScroll$default(ImageKt.m177backgroundbw27NRU(companion, MooncakeTheme.getColors(gapComposer).background, rectangleShapeKt$RectangleShape$1), ImageKt.rememberScrollState(gapComposer), false, 14), 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 48);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    float f = 12.0f;
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 10), MooncakeTheme.getTypography(gapComposer).header3, (TextLineBalancing) null, selectDayOfCadenceViewModel.title, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).tertiaryLabel, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 10), MooncakeTheme.getTypography(gapComposer).mainBody, (TextLineBalancing) null, selectDayOfCadenceViewModel.subtitle, (Map) null, (Function1) null, false);
                    GapComposer gapComposer2 = gapComposer;
                    SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 24.0f));
                    gapComposer2.startReplaceGroup(143460889);
                    ArrayList<DayOfCadenceOption> arrayList = selectDayOfCadenceViewModel.dayOfCadenceOptions;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    for (DayOfCadenceOption dayOfCadenceOption : arrayList) {
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, dayOfCadenceOption.icon == null ? 64.0f : 80.0f);
                        String str = dayOfCadenceOption.title;
                        Image image = dayOfCadenceOption.icon;
                        boolean z = dayOfCadenceOption.shouldDisplayDayPicker;
                        SelectDayOfCadenceView selectDayOfCadenceView3 = selectDayOfCadenceView2;
                        RealImageLoader realImageLoader = selectDayOfCadenceView3.imageLoader;
                        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment textAlignment = dayOfCadenceOption.titleHorizontalAlignment;
                        int i3 = textAlignment == null ? -1 : SelectDayOfCadenceView.WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
                        if (i3 != -1 && i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    i = 3;
                                } else {
                                    if (i3 != 4) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    i = 2;
                                }
                                Function1 function13 = function12;
                                changedInstance = gapComposer2.changedInstance(dayOfCadenceOption) | gapComposer2.changed(function13);
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                if (changedInstance) {
                                    neverEqualPolicy = neverEqualPolicy3;
                                    if (rememberedValue2 != neverEqualPolicy) {
                                        GapComposer gapComposer3 = gapComposer2;
                                        TraceCompat$Api29Impl.m1099SelectablePillRowsXL4qRs(m277height3ABfNKs, str, image, z, realImageLoader, i, (Function0) rememberedValue2, gapComposer3, 0, 64);
                                        gapComposer2 = gapComposer3;
                                        f = 12.0f;
                                        SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 12.0f));
                                        arrayList2.add(Unit.INSTANCE);
                                        selectDayOfCadenceView2 = selectDayOfCadenceView3;
                                        neverEqualPolicy3 = neverEqualPolicy;
                                        function12 = function13;
                                    }
                                } else {
                                    neverEqualPolicy = neverEqualPolicy3;
                                }
                                rememberedValue2 = new ShareSheetViewKt$$ExternalSyntheticLambda5(1, (Object) dayOfCadenceOption, function13);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                                GapComposer gapComposer32 = gapComposer2;
                                TraceCompat$Api29Impl.m1099SelectablePillRowsXL4qRs(m277height3ABfNKs, str, image, z, realImageLoader, i, (Function0) rememberedValue2, gapComposer32, 0, 64);
                                gapComposer2 = gapComposer32;
                                f = 12.0f;
                                SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 12.0f));
                                arrayList2.add(Unit.INSTANCE);
                                selectDayOfCadenceView2 = selectDayOfCadenceView3;
                                neverEqualPolicy3 = neverEqualPolicy;
                                function12 = function13;
                            }
                        }
                        i = 1;
                        Function1 function132 = function12;
                        changedInstance = gapComposer2.changedInstance(dayOfCadenceOption) | gapComposer2.changed(function132);
                        Object rememberedValue22 = gapComposer2.rememberedValue();
                        if (changedInstance) {
                        }
                        rememberedValue22 = new ShareSheetViewKt$$ExternalSyntheticLambda5(1, (Object) dayOfCadenceOption, function132);
                        gapComposer2.updateRememberedValue(rememberedValue22);
                        GapComposer gapComposer322 = gapComposer2;
                        TraceCompat$Api29Impl.m1099SelectablePillRowsXL4qRs(m277height3ABfNKs, str, image, z, realImageLoader, i, (Function0) rememberedValue22, gapComposer322, 0, 64);
                        gapComposer2 = gapComposer322;
                        f = 12.0f;
                        SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 12.0f));
                        arrayList2.add(Unit.INSTANCE);
                        selectDayOfCadenceView2 = selectDayOfCadenceView3;
                        neverEqualPolicy3 = neverEqualPolicy;
                        function12 = function132;
                    }
                    Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, companion, f, gapComposer2);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                selectDayOfCadenceView.Content(selectDayOfCadenceViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SelectDayOfCadenceView$$ExternalSyntheticLambda1(Function1 function1, SelectDayOfCadenceViewModel selectDayOfCadenceViewModel, SelectDayOfCadenceView selectDayOfCadenceView) {
        this.f$0 = function1;
        this.f$1 = selectDayOfCadenceViewModel;
        this.f$2 = selectDayOfCadenceView;
    }
}
