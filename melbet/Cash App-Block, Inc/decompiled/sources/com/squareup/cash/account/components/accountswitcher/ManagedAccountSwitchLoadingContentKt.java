package com.squareup.cash.account.components.accountswitcher;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.ManagedAccountFlipDirection;
import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.arcade.components.RadioKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreVisualizationKt$$ExternalSyntheticLambda10;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$12$1;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.ReversedList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public abstract class ManagedAccountSwitchLoadingContentKt {
    public static final CubicBezierEasing BounceYEasing = new CubicBezierEasing(0.64f, -0.11f, 0.34f, 0.75f);
    public static final CubicBezierEasing BounceScaleEasing = new CubicBezierEasing(0.64f, -0.17f, 0.34f, 0.81f);
    public static final float FRAME_WIDTH = 126.0f;
    public static final float FRAME_HEIGHT = 106.0f;
    public static final CubicBezierEasing FrameSequenceEasing = new CubicBezierEasing(0.72f, RecyclerView.DECELERATION_RATE, 0.11f, 1.0f);
    public static final int[] FRAME_RES_IDS = {R.drawable.account_switch_frame_00, R.drawable.account_switch_frame_01, R.drawable.account_switch_frame_02, R.drawable.account_switch_frame_03, R.drawable.account_switch_frame_04, R.drawable.account_switch_frame_05, R.drawable.account_switch_frame_06, R.drawable.account_switch_frame_07, R.drawable.account_switch_frame_08, R.drawable.account_switch_frame_09, R.drawable.account_switch_frame_10, R.drawable.account_switch_frame_11, R.drawable.account_switch_frame_12, R.drawable.account_switch_frame_13, R.drawable.account_switch_frame_14, R.drawable.account_switch_frame_15, R.drawable.account_switch_frame_16, R.drawable.account_switch_frame_17, R.drawable.account_switch_frame_18, R.drawable.account_switch_frame_19, R.drawable.account_switch_frame_20, R.drawable.account_switch_frame_21, R.drawable.account_switch_frame_22, R.drawable.account_switch_frame_23, R.drawable.account_switch_frame_24, R.drawable.account_switch_frame_25, R.drawable.account_switch_frame_26, R.drawable.account_switch_frame_27, R.drawable.account_switch_frame_28, R.drawable.account_switch_frame_29, R.drawable.account_switch_frame_30, R.drawable.account_switch_frame_31, R.drawable.account_switch_frame_32, R.drawable.account_switch_frame_33, R.drawable.account_switch_frame_34, R.drawable.account_switch_frame_35, R.drawable.account_switch_frame_36, R.drawable.account_switch_frame_37, R.drawable.account_switch_frame_38, R.drawable.account_switch_frame_39, R.drawable.account_switch_frame_40, R.drawable.account_switch_frame_41, R.drawable.account_switch_frame_42, R.drawable.account_switch_frame_43, R.drawable.account_switch_frame_44, R.drawable.account_switch_frame_45, R.drawable.account_switch_frame_46, R.drawable.account_switch_frame_47, R.drawable.account_switch_frame_48, R.drawable.account_switch_frame_49, R.drawable.account_switch_frame_50, R.drawable.account_switch_frame_51, R.drawable.account_switch_frame_52, R.drawable.account_switch_frame_53, R.drawable.account_switch_frame_54, R.drawable.account_switch_frame_55, R.drawable.account_switch_frame_56, R.drawable.account_switch_frame_57, R.drawable.account_switch_frame_58, R.drawable.account_switch_frame_59, R.drawable.account_switch_frame_60};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [kotlin.collections.ReversedList] */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    public static final void ManagedAccountSwitchLoadingContent(ManagedAccountAnimationInfo managedAccountAnimationInfo, boolean z, Function0 function0, Composer composer, int i) {
        Continuation continuation;
        Animatable animatable;
        MutableState mutableState;
        ?? r20;
        boolean z2;
        Modifier.Companion companion;
        float f;
        Animatable animatable2;
        Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        managedAccountAnimationInfo.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1603197191);
        int i2 = i | (gapComposer.changedInstance(managedAccountAnimationInfo) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z6 = managedAccountAnimationInfo.flipDirection == ManagedAccountFlipDirection.TO_SPONSOR;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(AnimationPhase.LOADING);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(z), gapComposer);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(function0, gapComposer);
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            int[] iArr = FRAME_RES_IDS;
            ArrayList arrayList = new ArrayList(iArr.length);
            gapComposer.startReplaceGroup(1220778119);
            for (int i3 : iArr) {
                arrayList.add(Countries.painterResource(i3, 0, gapComposer));
            }
            gapComposer.end(false);
            if (z6) {
                arrayList = new ReversedList(arrayList);
            }
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Animatable animatable3 = (Animatable) rememberedValue2;
            Unit unit = Unit.INSTANCE;
            boolean changed = gapComposer.changed(booleanValue) | gapComposer.changedInstance(animatable3);
            Object rememberedValue3 = gapComposer.rememberedValue();
            Continuation continuation2 = null;
            if (changed || rememberedValue3 == obj2) {
                rememberedValue3 = new RoomDatabase$performClear$1(booleanValue, animatable3, mutableState2, continuation2, 6);
                continuation = null;
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                continuation = null;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj2) {
                rememberedValue4 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Animatable animatable4 = (Animatable) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj2) {
                rememberedValue5 = AnimatableKt.Animatable(1.0f, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Animatable animatable5 = (Animatable) rememberedValue5;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
            Density density = (Density) gapComposer.consume(staticProvidableCompositionLocal);
            boolean changed2 = gapComposer.changed(density);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue6 == obj2) {
                rememberedValue6 = Float.valueOf(density.mo236toPx0680j_4(20.0f));
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            float floatValue = ((Number) rememberedValue6).floatValue();
            AnimationPhase animationPhase = (AnimationPhase) mutableState2.getValue();
            boolean changed3 = gapComposer.changed(rememberUpdatedState) | gapComposer.changedInstance(animatable4) | gapComposer.changed(floatValue) | gapComposer.changedInstance(animatable5);
            boolean z7 = z6;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue7 == obj2) {
                rememberedValue7 = new DefaultFlingBehavior$performFling$2(rememberUpdatedState, mutableState2, animatable4, floatValue, animatable5, null, 2);
                mutableState2 = mutableState2;
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            Updater.LaunchedEffect(gapComposer, animationPhase, (Function2) rememberedValue7);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (rememberedValue8 == obj2) {
                rememberedValue8 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            Animatable animatable6 = (Animatable) rememberedValue8;
            AnimationPhase animationPhase2 = (AnimationPhase) mutableState2.getValue();
            boolean changedInstance = gapComposer.changedInstance(animatable6) | gapComposer.changed(rememberUpdatedState2);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue9 == obj2) {
                animatable = animatable6;
                Continuation continuation3 = continuation;
                rememberedValue9 = new CoreInteractiveCardKt$InteractiveCardEffect$12$1(animatable, rememberUpdatedState2, mutableState2, continuation3, 1);
                mutableState = mutableState2;
                gapComposer.updateRememberedValue(rememberedValue9);
                r20 = continuation3;
            } else {
                animatable = animatable6;
                mutableState = mutableState2;
                r20 = continuation;
            }
            Updater.LaunchedEffect(gapComposer, animationPhase2, (Function2) rememberedValue9);
            gapComposer.startReplaceGroup(1220864101);
            Density density2 = (Density) gapComposer.consume(staticProvidableCompositionLocal);
            long j = Strings.getTypography(gapComposer).sectionTitle.paragraphStyle.lineHeight;
            if (TextUnit.m1057equalsimpl0(j, TextUnit.Unspecified)) {
                gapComposer.startReplaceGroup(1412365414);
                j = Strings.getTypography(gapComposer).sectionTitle.spanStyle.fontSize;
                z2 = false;
                gapComposer.end(false);
            } else {
                z2 = false;
                gapComposer.startReplaceGroup(1412435784);
                gapComposer.end(false);
            }
            float mo231toDpGaN1DYA = density2.mo231toDpGaN1DYA(j);
            gapComposer.end(z2);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion2, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 24.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, false, new StreamSharing$$ExternalSyntheticLambda1(Alignment.Companion.CenterVertically, 17)), Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw r20;
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
            float f2 = FRAME_HEIGHT;
            float f3 = FRAME_WIDTH;
            if (booleanValue) {
                gapComposer.startReplaceGroup(628810892);
                ImageKt.Image(Countries.painterResource(z7 ? R.drawable.account_switch_frame_60 : R.drawable.account_switch_frame_00, 0, gapComposer), null, SizeKt.m287sizeVpY3zN4(companion2, f3, f2), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 432, 120);
                gapComposer.end(false);
                z3 = false;
                companion = companion2;
                f = mo231toDpGaN1DYA;
                animatable2 = animatable;
                obj = obj2;
                z4 = true;
            } else {
                companion = companion2;
                f = mo231toDpGaN1DYA;
                animatable2 = animatable;
                obj = obj2;
                z3 = false;
                gapComposer.startReplaceGroup(629216806);
                Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, f3, f2);
                boolean changedInstance2 = gapComposer.changedInstance(animatable4) | gapComposer.changedInstance(animatable5);
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue10 == obj) {
                    z4 = true;
                    rememberedValue10 = new ScoreVisualizationKt$$ExternalSyntheticLambda10(animatable4, animatable5, 1);
                    gapComposer.updateRememberedValue(rememberedValue10);
                } else {
                    z4 = true;
                }
                Modifier graphicsLayer = ColorKt.graphicsLayer(m287sizeVpY3zN4, (Function1) rememberedValue10);
                boolean changedInstance3 = gapComposer.changedInstance(animatable3) | gapComposer.changedInstance(arrayList);
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue11 == obj) {
                    rememberedValue11 = new UtilsKt$$ExternalSyntheticLambda0(14, animatable3, arrayList, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue11);
                }
                BoxKt.Box(ClipKt.drawBehind(graphicsLayer, (Function1) rememberedValue11), gapComposer, 0);
                gapComposer.end(false);
            }
            if (((AnimationPhase) mutableState.getValue()) == AnimationPhase.SETTLING || ((AnimationPhase) mutableState.getValue()) == AnimationPhase.FINISHED) {
                gapComposer.startReplaceGroup(630068190);
                z5 = z4;
                String str = managedAccountAnimationInfo.welcomeMessage;
                TextStyle textStyle = Strings.getTypography(gapComposer).sectionTitle;
                long j2 = Strings.getColors(gapComposer).semantic.text.standard;
                boolean changedInstance4 = gapComposer.changedInstance(animatable2);
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (changedInstance4 || rememberedValue12 == obj) {
                    rememberedValue12 = new RadioKt$$ExternalSyntheticLambda1(animatable2, 6);
                    gapComposer.updateRememberedValue(rememberedValue12);
                }
                TextKt.m561TextNvy7gAk(str, ColorKt.graphicsLayer(companion, (Function1) rememberedValue12), j2, 0L, null, 0L, new TextAlign(3), 0L, 0, false, 0, 0, textStyle, gapComposer, 0, 0, 130040);
                gapComposer = gapComposer;
                gapComposer.end(z3);
            } else {
                re$$ExternalSyntheticOutline0.m(gapComposer, 630502159, companion, f, gapComposer);
                gapComposer.end(z3);
                z5 = z4;
            }
            gapComposer.end(z5);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(managedAccountAnimationInfo, z, function0, i, 5);
        }
    }
}
