package com.squareup.cash.core.navigationcontainer;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.UpdatesWindowFlags$TabConfig;
import app.cash.molecule.PlatformKt;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.ScaffoldState;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.core.navigationcontainer.models.ContainerUiModel;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$TabTreatment;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.ui.MainContainerDelegate$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes.dex */
public final /* synthetic */ class UiContainer$$ExternalSyntheticLambda34 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ float f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ UiContainer$$ExternalSyntheticLambda34(Modifier modifier, NavigationType navigationType, Modifier modifier2, Function0 function0, Function3 function3, float f, Function2 function2) {
        this.f$1 = modifier;
        this.f$2 = navigationType;
        this.f$3 = modifier2;
        this.f$4 = function0;
        this.f$6 = function3;
        this.f$5 = f;
        this.f$7 = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        NeverEqualPolicy neverEqualPolicy;
        Integer num;
        boolean z;
        Modifier modifier;
        boolean z2;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        Object obj3 = this.f$7;
        Object obj4 = this.f$6;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        switch (i) {
            case 0:
                UiContainer uiContainer = (UiContainer) obj8;
                ContainerUiModel.Chrome chrome = ((ContainerUiModel) obj7).chrome;
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = (NavigationModel.Ready.FullScreenLocation) obj6;
                ImmutableList immutableList = (ImmutableList) obj5;
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
                    ElementBoundsRegistry elementBoundsRegistry = uiContainer.elementBoundsRegistry;
                    MainContainerDelegate$$ExternalSyntheticLambda0 mainContainerDelegate$$ExternalSyntheticLambda0 = uiContainer.eventReceiver;
                    boolean z3 = chrome.flatTabs;
                    UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig = uiContainer.fullScreenConfigAggregator.getMergedConfig().tabConfig;
                    MainScreensViewModel$TabTreatment mainScreensViewModel$TabTreatment = chrome.tabTreatment;
                    SplashScreenAnimationObserver splashScreenAnimationObserver = uiContainer.splashScreenAnimationObserver;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy2) {
                        rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(4, mutableState);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(5, mutableState2);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    UiContainerKt.Tabs(elementBoundsRegistry, mainContainerDelegate$$ExternalSyntheticLambda0, function1, (Function1) rememberedValue2, fullScreenLocation, mainScreensViewModel$TabTreatment, immutableList, false, z3, updatesWindowFlags$TabConfig, splashScreenAnimationObserver, this.f$5, align, null, null, gapComposer, 3456, 0, 24576);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Modifier modifier2 = (Modifier) obj8;
                NavigationType navigationType = (NavigationType) obj7;
                Modifier modifier3 = (Modifier) obj6;
                Function0 function0 = (Function0) obj5;
                Function3 function3 = (Function3) obj4;
                Function2 function2 = (Function2) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.statusBarsPadding(modifier2), 52.0f, RecyclerView.DECELERATION_RATE, 2);
                    BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                    Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m279heightInVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    DBUtil.NavigationIcon(navigationType, modifier3, function0, gapComposer2, 0, 0);
                    ScaffoldState scaffoldState = (ScaffoldState) gapComposer2.consume(ScreenScaffoldKt.LocalScaffoldState);
                    float floatValue = scaffoldState != null ? scaffoldState.titleBarVisibility$delegate.getFloatValue() : 1.0f;
                    float lerp = TransactorKt.lerp(2.2f, RecyclerView.DECELERATION_RATE, floatValue);
                    if (!(((double) 1.0f) > 0.0d)) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier then = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).then(new VerticalAlignElement(Alignment.Companion.CenterVertically));
                    boolean changed = gapComposer2.changed(lerp) | gapComposer2.changed(floatValue);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed) {
                        neverEqualPolicy = neverEqualPolicy2;
                    } else {
                        neverEqualPolicy = neverEqualPolicy2;
                        if (rememberedValue3 != neverEqualPolicy) {
                            num = 0;
                            Modifier graphicsLayer = ColorKt.graphicsLayer(then, (Function1) rememberedValue3);
                            if (floatValue > RecyclerView.DECELERATION_RATE) {
                                gapComposer2.startReplaceGroup(-2083714907);
                                Object rememberedValue4 = gapComposer2.rememberedValue();
                                if (rememberedValue4 == neverEqualPolicy) {
                                    rememberedValue4 = new SvgDecoder$$ExternalSyntheticLambda0(19);
                                    gapComposer2.updateRememberedValue(rememberedValue4);
                                }
                                modifier = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue4);
                                z = false;
                                gapComposer2.end(false);
                            } else {
                                z = false;
                                gapComposer2.startReplaceGroup(-2083625968);
                                gapComposer2.end(false);
                                modifier = companion;
                            }
                            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(graphicsLayer.then(modifier), RecyclerView.DECELERATION_RATE, 4.0f, 1);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
                            gapComposer2.startReusableNode();
                            if (gapComposer2.inserting) {
                                gapComposer2.useNode();
                            } else {
                                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                            }
                            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                            Integer num2 = num;
                            function2.invoke(gapComposer2, num2);
                            gapComposer2.end(true);
                            float f = this.f$5;
                            if (function3 == null) {
                                gapComposer2.startReplaceGroup(-2083459653);
                                float f2 = f - 12.0f;
                                SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f2));
                                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer2, 0);
                                int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, companion);
                                gapComposer2.startReusableNode();
                                if (gapComposer2.inserting) {
                                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer2.useNode();
                                }
                                Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                                Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                                function3.invoke(new TitleBarActionScope(), gapComposer2, num2);
                                z2 = true;
                                gapComposer2.end(true);
                                SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f2));
                                gapComposer2.end(false);
                            } else {
                                z2 = true;
                                gapComposer2.startReplaceGroup(-2083083623);
                                SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, f));
                                gapComposer2.end(false);
                            }
                            gapComposer2.end(z2);
                        }
                    }
                    num = 0;
                    rememberedValue3 = new PaddingKt$$ExternalSyntheticLambda1(lerp, floatValue, 1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                    Modifier graphicsLayer2 = ColorKt.graphicsLayer(then, (Function1) rememberedValue3);
                    if (floatValue > RecyclerView.DECELERATION_RATE) {
                    }
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(graphicsLayer2.then(modifier), RecyclerView.DECELERATION_RATE, 4.0f, 1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                    int hashCode22 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default2);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope22, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode22, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier22, composeUiNode$Companion$SetModifier$14);
                    Integer num22 = num;
                    function2.invoke(gapComposer2, num22);
                    gapComposer2.end(true);
                    float f3 = this.f$5;
                    if (function3 == null) {
                    }
                    gapComposer2.end(z2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ UiContainer$$ExternalSyntheticLambda34(UiContainer uiContainer, ContainerUiModel containerUiModel, NavigationModel.Ready.FullScreenLocation fullScreenLocation, ImmutableList immutableList, float f, MutableState mutableState, MutableState mutableState2) {
        this.f$1 = uiContainer;
        this.f$2 = containerUiModel;
        this.f$3 = fullScreenLocation;
        this.f$4 = immutableList;
        this.f$5 = f;
        this.f$6 = mutableState;
        this.f$7 = mutableState2;
    }
}
