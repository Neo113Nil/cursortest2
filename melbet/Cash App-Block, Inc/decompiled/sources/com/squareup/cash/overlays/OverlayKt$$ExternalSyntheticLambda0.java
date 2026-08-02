package com.squareup.cash.overlays;

import android.content.Context;
import android.os.Build;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.DpCornerSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import app.cash.trifle.Trifle;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonValues;
import com.squareup.cash.arcade.components.input.InputChipGridScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldScopeInstance;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScopeInstance;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.compose.SquircleShape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class OverlayKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposableLambdaImpl f$0;

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda0(ButtonValues buttonValues, ComposableLambdaImpl composableLambdaImpl) {
        this.$r8$classId = 3;
        this.f$0 = composableLambdaImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:362:0x07e7  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        int i;
        Object rememberedValue2;
        int i2 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 6;
        int i4 = 1;
        i4 = 1;
        ComposableLambdaImpl composableLambdaImpl = this.f$0;
        switch (i2) {
            case 0:
                OverlayLayer overlayLayer = (OverlayLayer) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                overlayLayer.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((GapComposer) composer).changed(overlayLayer) : ((GapComposer) composer).changedInstance(overlayLayer) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    CompositionLocalContext compositionLocalContext = new CompositionLocalContext(gapComposer.buildContext().getCompositionLocalScope$runtime());
                    if (!((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
                        String str = Build.FINGERPRINT;
                        str.getClass();
                        if (!StringsKt.contains((CharSequence) str, (CharSequence) "layoutlib", false) && !str.equals("robolectric")) {
                            z = false;
                            rememberedValue = gapComposer.rememberedValue();
                            neverEqualPolicy = Composer.Companion.Empty;
                            if (rememberedValue == neverEqualPolicy) {
                                rememberedValue = new MutableTransitionState(Boolean.valueOf(z));
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
                            Unit unit = Unit.INSTANCE;
                            if ((intValue & 14) != 4 && ((intValue & 8) == 0 || !gapComposer.changedInstance(overlayLayer))) {
                                i4 = 0;
                            }
                            int i5 = (gapComposer.changedInstance(context) ? 1 : 0) | i4 | (gapComposer.changedInstance(mutableTransitionState) ? 1 : 0) | (gapComposer.changed(compositionLocalContext) ? 1 : 0);
                            ComposableLambdaImpl composableLambdaImpl2 = this.f$0;
                            i = (gapComposer.changed(composableLambdaImpl2) ? 1 : 0) | i5;
                            rememberedValue2 = gapComposer.rememberedValue();
                            if (i == 0 || rememberedValue2 == neverEqualPolicy) {
                                OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(overlayLayer, context, mutableTransitionState, compositionLocalContext, composableLambdaImpl2, 0);
                                gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                                rememberedValue2 = overlayKt$$ExternalSyntheticLambda3;
                            }
                            Updater.DisposableEffect(unit, (Function1) rememberedValue2, gapComposer);
                        }
                    }
                    z = true;
                    rememberedValue = gapComposer.rememberedValue();
                    neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                    }
                    MutableTransitionState mutableTransitionState2 = (MutableTransitionState) rememberedValue;
                    Unit unit2 = Unit.INSTANCE;
                    if ((intValue & 14) != 4) {
                        i4 = 0;
                    }
                    int i52 = (gapComposer.changedInstance(context) ? 1 : 0) | i4 | (gapComposer.changedInstance(mutableTransitionState2) ? 1 : 0) | (gapComposer.changed(compositionLocalContext) ? 1 : 0);
                    ComposableLambdaImpl composableLambdaImpl22 = this.f$0;
                    i = (gapComposer.changed(composableLambdaImpl22) ? 1 : 0) | i52;
                    rememberedValue2 = gapComposer.rememberedValue();
                    if (i == 0) {
                    }
                    OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda32 = new OverlayKt$$ExternalSyntheticLambda3(overlayLayer, context, mutableTransitionState2, compositionLocalContext, composableLambdaImpl22, 0);
                    gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda32);
                    rememberedValue2 = overlayKt$$ExternalSyntheticLambda32;
                    Updater.DisposableEffect(unit2, (Function1) rememberedValue2, gapComposer);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer2, (Object) 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Object obj4 = (AdaptiveStackScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                obj4.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(obj4) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    composableLambdaImpl.invoke(obj4, gapComposer3, Integer.valueOf(intValue3 & 14));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                RowScope rowScope = (RowScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                rowScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(rowScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Modifier weight = rowScope.weight(1.0f, companion, false);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, i4)), Alignment.Companion.CenterVertically, gapComposer4, 48);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, weight);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke(RowScopeInstance.INSTANCE, (Object) gapComposer4, (Object) 6);
                    gapComposer4.end(true);
                    Trace.m1191Iconww6aTOc(Icons.SubtleExpand16, (String) null, (Modifier) null, 0L, gapComposer4, 54, 12);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Function0 function0 = (Function0) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                function0.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changedInstance(function0) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    SizeKt.ButtonCompact(function0, null, null, false, false, null, this.f$0, gapComposer5, intValue5 & 14, 62);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer6, (Object) 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Object obj5 = (RowScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                obj5.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(obj5) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    composableLambdaImpl.invoke(obj5, gapComposer7, Integer.valueOf(intValue7 & 14));
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                FlowRowScope flowRowScope = (FlowRowScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                flowRowScope.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(flowRowScope) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    composableLambdaImpl.invoke(new InputChipGridScope(flowRowScope), (Object) gapComposer8, (Object) 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer9, (Object) 6);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Object obj6 = (CollapsingToolbarScopeInstance) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                obj6.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= (intValue10 & 8) == 0 ? ((GapComposer) composer10).changed(obj6) : ((GapComposer) composer10).changedInstance(obj6) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    composableLambdaImpl.invoke(obj6, gapComposer10, Integer.valueOf(intValue10 & 14));
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer11, (Object) 6);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer12, (Object) 6);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Object obj7 = (RowScope) obj;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                obj7.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer13).changed(obj7) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    composableLambdaImpl.invoke(obj7, gapComposer13, Integer.valueOf(48 | (intValue13 & 14)));
                    SpacerKt.Spacer(gapComposer13, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 24.0f));
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer14, (Object) 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj3).getClass();
                ((CollapsingToolbarScaffoldScopeInstance) obj).getClass();
                composableLambdaImpl.invoke(obj2, (Object) 0);
                return Unit.INSTANCE;
            case 15:
                Object obj8 = (AnimatedVisibilityScope) obj;
                int intValue15 = ((Integer) obj3).intValue();
                obj8.getClass();
                composableLambdaImpl.invoke(obj8, (Composer) obj2, Integer.valueOf(intValue15 & 14));
                return Unit.INSTANCE;
            case 16:
                Object obj9 = (RowScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                obj9.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer15).changed(obj9) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    composableLambdaImpl.invoke(obj9, gapComposer15, Integer.valueOf(intValue16 & 14));
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Object obj10 = (RowScope) obj;
                Composer composer16 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                obj10.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer16).changed(obj10) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    composableLambdaImpl.invoke(obj10, gapComposer16, Integer.valueOf(intValue17 & 14));
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer17 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer17, (Object) 6);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer18 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer18, (Object) 6);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer19 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer19, (Object) 6);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer20 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer20, (Object) 6);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer21 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer21, (Object) 6);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                composableLambdaImpl.invoke(obj2, (Object) 6);
                return Unit.INSTANCE;
            case 24:
                Object obj11 = (OverlayLayer) obj;
                Composer composer22 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                obj11.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= (intValue23 & 8) == 0 ? ((GapComposer) composer22).changed(obj11) : ((GapComposer) composer22).changedInstance(obj11) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue23 & 1, (intValue23 & 19) != 18)) {
                    SpacerKt.Spacer(gapComposer22, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 1.0f));
                    composableLambdaImpl.invoke(obj11, gapComposer22, Integer.valueOf(intValue23 & 14));
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer23 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer23, (Object) 0);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                composableLambdaImpl.invoke(obj2, (Object) 6);
                return Unit.INSTANCE;
            case 27:
                CoreFlowBasicShieetScope coreFlowBasicShieetScope = (CoreFlowBasicShieetScope) obj;
                Composer composer24 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                coreFlowBasicShieetScope.getClass();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= ((GapComposer) composer24).changed(coreFlowBasicShieetScope) ? 4 : 2;
                }
                int i6 = intValue25;
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(i6 & 1, (i6 & 19) != 18)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer24.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer24, -1762997026, gapComposer24, false);
                    } else {
                        gapComposer24.startReplaceGroup(-1762997739);
                        gapComposer24.end(false);
                    }
                    coreFlowBasicShieetScope.m3707Dimmer3JVO9M((i6 << 6) & 896, colors.component.ui.dimmer.background, gapComposer24, null);
                    DpCornerSize dpCornerSize = new DpCornerSize(40.0f);
                    Trifle trifle = CornerSizeKt.ZeroCornerSize;
                    SquircleShape squircleShape = new SquircleShape(dpCornerSize, dpCornerSize, trifle, trifle);
                    Colors colors2 = (Colors) gapComposer24.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer24, -1762997026, gapComposer24, false);
                    } else {
                        gapComposer24.startReplaceGroup(-1762997739);
                        gapComposer24.end(false);
                    }
                    coreFlowBasicShieetScope.m3709SheetContainerZPw9REg$views(colors2.component.sheet.background, squircleShape, Expect_jvmKt.rememberComposableLambda(738795407, new PdfPreviewViewKt$$ExternalSyntheticLambda2(coreFlowBasicShieetScope, i3), gapComposer24), null, this.f$0, gapComposer24, ((i6 << 18) & 3670016) | MLKEMEngine.KyberPolyBytes);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer25 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer25, 54);
                    int hashCode2 = Long.hashCode(gapComposer25.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer25.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer25, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer25.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer25.startReusableNode();
                    if (gapComposer25.inserting) {
                        gapComposer25.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer25.useNode();
                    }
                    Updater.m576setimpl(gapComposer25, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer25, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer25, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer25, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer25, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline1.m(6, composableLambdaImpl, ColumnScopeInstance.INSTANCE, gapComposer25, true);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer26 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) gapComposer26, (Object) 0);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda0(ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = composableLambdaImpl;
    }
}
