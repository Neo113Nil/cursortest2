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
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.components.MooncakeLargeIconHelperKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.recurringpayments.viewmodels.CadenceOption;
import com.squareup.cash.recurringpayments.viewmodels.SelectCadenceViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SelectCadenceView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SelectCadenceViewModel f$1;
    public final /* synthetic */ SelectCadenceView f$2;

    public /* synthetic */ SelectCadenceView$$ExternalSyntheticLambda1(SelectCadenceView selectCadenceView, SelectCadenceViewModel selectCadenceViewModel, Function1 function1, int i) {
        this.f$2 = selectCadenceView;
        this.f$1 = selectCadenceViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier modifier;
        NeverEqualPolicy neverEqualPolicy;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        SelectCadenceViewModel selectCadenceViewModel = this.f$1;
        SelectCadenceView selectCadenceView = this.f$2;
        switch (i) {
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
                        modifier = m177backgroundbw27NRU2;
                        rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(2, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    } else {
                        modifier = m177backgroundbw27NRU2;
                    }
                    SelectCadenceView selectCadenceView2 = selectCadenceView;
                    Function1 function12 = function1;
                    NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy2;
                    KeypadKt.m3654ToolbarA_Dysh8(null, modifier, navigationIconType, 0L, (Function0) rememberedValue, null, gapComposer, 24582, 364);
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
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                    MooncakeLargeIcon.Icon mooncakeLargeIcon = MooncakeLargeIconHelperKt.toMooncakeLargeIcon(selectCadenceViewModel.icon);
                    mooncakeLargeIcon.getClass();
                    KeypadKt.MooncakeLargeIcon(mooncakeLargeIcon, m302paddingqDBjuR0$default, gapComposer, 48, 0);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 10), MooncakeTheme.getTypography(gapComposer).header3, (TextLineBalancing) null, selectCadenceViewModel.title, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).tertiaryLabel, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 12.0f, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 10), MooncakeTheme.getTypography(gapComposer).mainBody, (TextLineBalancing) null, selectCadenceViewModel.subtitle, (Map) null, (Function1) null, false);
                    GapComposer gapComposer2 = gapComposer;
                    SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 34.0f));
                    gapComposer2.startReplaceGroup(717441314);
                    ArrayList<CadenceOption> arrayList = selectCadenceViewModel.cadenceOptions;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    for (CadenceOption cadenceOption : arrayList) {
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, 80.0f);
                        String str = cadenceOption.title;
                        SelectCadenceView selectCadenceView3 = selectCadenceView2;
                        RealImageLoader realImageLoader = selectCadenceView3.imageLoader;
                        Function1 function13 = function12;
                        boolean changed2 = gapComposer2.changed(function13) | gapComposer2.changedInstance(cadenceOption);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2) {
                            neverEqualPolicy = neverEqualPolicy3;
                        } else {
                            neverEqualPolicy = neverEqualPolicy3;
                            if (rememberedValue2 != neverEqualPolicy) {
                                GapComposer gapComposer3 = gapComposer2;
                                TraceCompat$Api29Impl.m1099SelectablePillRowsXL4qRs(m277height3ABfNKs, str, null, true, realImageLoader, 0, (Function0) rememberedValue2, gapComposer3, 3462, 96);
                                gapComposer2 = gapComposer3;
                                SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 22.0f));
                                arrayList2.add(Unit.INSTANCE);
                                selectCadenceView2 = selectCadenceView3;
                                function12 = function13;
                                neverEqualPolicy3 = neverEqualPolicy;
                            }
                        }
                        rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda11(29, function13, cadenceOption);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                        GapComposer gapComposer32 = gapComposer2;
                        TraceCompat$Api29Impl.m1099SelectablePillRowsXL4qRs(m277height3ABfNKs, str, null, true, realImageLoader, 0, (Function0) rememberedValue2, gapComposer32, 3462, 96);
                        gapComposer2 = gapComposer32;
                        SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 22.0f));
                        arrayList2.add(Unit.INSTANCE);
                        selectCadenceView2 = selectCadenceView3;
                        function12 = function13;
                        neverEqualPolicy3 = neverEqualPolicy;
                    }
                    Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, false, companion, 12.0f, gapComposer2);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                selectCadenceView.Content(selectCadenceViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SelectCadenceView$$ExternalSyntheticLambda1(Function1 function1, SelectCadenceViewModel selectCadenceViewModel, SelectCadenceView selectCadenceView) {
        this.f$0 = function1;
        this.f$1 = selectCadenceViewModel;
        this.f$2 = selectCadenceView;
    }
}
