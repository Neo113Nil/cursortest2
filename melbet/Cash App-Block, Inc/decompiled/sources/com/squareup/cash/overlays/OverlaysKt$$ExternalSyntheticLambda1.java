package com.squareup.cash.overlays;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class OverlaysKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposableLambdaImpl f$0;

    public /* synthetic */ OverlaysKt$$ExternalSyntheticLambda1(int i, int i2, ComposableLambdaImpl composableLambdaImpl) {
        this.$r8$classId = i2;
        this.f$0 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        ComposableLambdaImpl composableLambdaImpl = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                OverlaysKt.WithOverlayLayer(composableLambdaImpl, composer, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 1:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer, (Object) 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer2, (Object) 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                int intValue3 = num.intValue();
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer3, (Object) 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                int intValue4 = num.intValue();
                GapComposer gapComposer4 = (GapComposer) composer;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer4, (Object) 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                int intValue5 = num.intValue();
                GapComposer gapComposer5 = (GapComposer) composer;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer5, (Object) 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                int intValue6 = num.intValue();
                GapComposer gapComposer6 = (GapComposer) composer;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer6, (Object) 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                int intValue7 = num.intValue();
                GapComposer gapComposer7 = (GapComposer) composer;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) RowScopeInstance.INSTANCE, (Object) gapComposer7, (Object) 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                int intValue8 = num.intValue();
                GapComposer gapComposer8 = (GapComposer) composer;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer8, (Object) 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                int intValue9 = num.intValue();
                GapComposer gapComposer9 = (GapComposer) composer;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer9, (Object) 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                int intValue10 = num.intValue();
                GapComposer gapComposer10 = (GapComposer) composer;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer10, (Object) 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                int intValue11 = num.intValue();
                GapComposer gapComposer11 = (GapComposer) composer;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer11, (Object) 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                int intValue12 = num.intValue();
                GapComposer gapComposer12 = (GapComposer) composer;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer12, (Object) 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                int intValue13 = num.intValue();
                GapComposer gapComposer13 = (GapComposer) composer;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer13, (Object) 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                int intValue14 = num.intValue();
                GapComposer gapComposer14 = (GapComposer) composer;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    if (!(((double) 1.0f) > 0.0d)) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier then = SpacerKt.m300paddingVpY3zN4$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), RecyclerView.DECELERATION_RATE, 4.0f, 1).then(new VerticalAlignElement(Alignment.Companion.CenterVertically));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer14, then);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke((Object) BoxScopeInstance.INSTANCE, (Object) gapComposer14, (Object) 6);
                    gapComposer14.end(true);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                num.getClass();
                CustomizeUtils.TransparentCellTheme(composableLambdaImpl, composer, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 16:
                int intValue15 = num.intValue();
                GapComposer gapComposer15 = (GapComposer) composer;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.Top, gapComposer15, 6);
                    int hashCode2 = Long.hashCode(gapComposer15.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer15.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer15, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer15.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer15.startReusableNode();
                    if (gapComposer15.inserting) {
                        gapComposer15.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer15.useNode();
                    }
                    Updater.m576setimpl(gapComposer15, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer15, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer15, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer15, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer15, true);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                int intValue16 = num.intValue();
                GapComposer gapComposer16 = (GapComposer) composer;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer16, (Object) 0);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                num.getClass();
                MoneybotScaffoldViewKt.ScaffoldCard(composableLambdaImpl, composer, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 19:
                int intValue17 = num.intValue();
                GapComposer gapComposer17 = (GapComposer) composer;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer17.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer17.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer17, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer17.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer17.startReusableNode();
                    if (gapComposer17.inserting) {
                        gapComposer17.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer17.useNode();
                    }
                    Updater.m576setimpl(gapComposer17, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer17, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer17, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer17, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer17, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer17, true);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                int intValue18 = num.intValue();
                GapComposer gapComposer18 = (GapComposer) composer;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode4 = Long.hashCode(gapComposer18.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer18.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer18, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer18.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer18.startReusableNode();
                    if (gapComposer18.inserting) {
                        gapComposer18.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer18.useNode();
                    }
                    Updater.m576setimpl(gapComposer18, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer18, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer18, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer18, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer18, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer18, true);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                int intValue19 = num.intValue();
                GapComposer gapComposer19 = (GapComposer) composer;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(MooncakeTheme.getColors(gapComposer19).label, ComposeMooncakeThemeKt.LocalTextColor), ComposeMooncakeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(MooncakeTheme.getTypography(gapComposer19).mainTitle)}, Expect_jvmKt.rememberComposableLambda(-522582086, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, 22), gapComposer19), gapComposer19, 56);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                int intValue20 = num.intValue();
                GapComposer gapComposer20 = (GapComposer) composer;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer20, (Object) 0);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                int intValue21 = num.intValue();
                GapComposer gapComposer21 = (GapComposer) composer;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer21, (Object) 0);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                int intValue22 = num.intValue();
                GapComposer gapComposer22 = (GapComposer) composer;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer22, (Object) 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                int intValue23 = num.intValue();
                GapComposer gapComposer23 = (GapComposer) composer;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer23, (Object) 6);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                num.getClass();
                FakeOverlayLayerKt.WithFakeOverlayLayer(composableLambdaImpl, composer, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 27:
                num.getClass();
                FakeOverlayLayerKt.FullWidthPopup(composableLambdaImpl, composer, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 28:
                int intValue24 = num.intValue();
                GapComposer gapComposer24 = (GapComposer) composer;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) SizeKt.fillMaxWidth(companion, 1.0f), (Object) gapComposer24, (Object) 6);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                int intValue25 = num.intValue();
                GapComposer gapComposer25 = (GapComposer) composer;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer25, (Object) 6);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OverlaysKt$$ExternalSyntheticLambda1(ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = composableLambdaImpl;
    }
}
