package com.squareup.cash.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.mooncake.themes.HasThemeInfo;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.overlays.Overlay;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.util.android.Views;
import com.squareup.util.android.animation.Interpolators;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes6.dex */
public final class ArcadeModal extends AbstractComposeView implements Overlay, DesignSystemDialog {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ArcadeModal asView;
    public final FrameLayout content;
    public boolean exiting;
    public final boolean showDimmer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public ArcadeModal(Context context, boolean z, boolean z2) {
        super(context, null, 6, 0);
        ThemeInfo themeInfo;
        context.getClass();
        this.showDimmer = z;
        this.asView = this;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setOnClickListener(new ArcadeModal$$ExternalSyntheticLambda0(0));
        frameLayout.setSoundEffectsEnabled(false);
        if (z2) {
            frameLayout.setClipToOutline(true);
            ContextWrapper contextWrapper = context;
            while (!(contextWrapper instanceof HasThemeInfo)) {
                if (contextWrapper instanceof ContextWrapper) {
                    ContextWrapper contextWrapper2 = contextWrapper;
                    if (contextWrapper2.getBaseContext() != contextWrapper) {
                        Context baseContext = contextWrapper2.getBaseContext();
                        baseContext.getClass();
                        contextWrapper = baseContext;
                    }
                }
                themeInfo = (contextWrapper.getResources().getConfiguration().uiMode & 48) == 32 ? Trace.moonCakeDark(contextWrapper) : Trace.moonCakeLight(contextWrapper);
                frameLayout.setBackground(PlatformKt.getDrawableCompat(context, R.drawable.dialog_background, Integer.valueOf(ColorKt.m694toArgb8_81llA(themeInfo.arcadeColors.component.modal.background))));
            }
            themeInfo = ((HasThemeInfo) contextWrapper).getThemeInfo();
            frameLayout.setBackground(PlatformKt.getDrawableCompat(context, R.drawable.dialog_background, Integer.valueOf(ColorKt.m694toArgb8_81llA(themeInfo.arcadeColors.component.modal.background))));
        }
        this.content = frameLayout;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1597244355);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.showDimmer;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(436132540);
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                boolean z2 = (i2 & 14) == 4;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ArcadeModal$$ExternalSyntheticLambda2(this, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ModalKt.Dimmer(fillMaxSize, (Function0) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(1795768361, new ArcadeModal$$ExternalSyntheticLambda3(this, 0), gapComposer), gapComposer, 3078, 4);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(436276411);
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f)), 32.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                boolean z3 = (i2 & 14) == 4;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ArcadeModal$$ExternalSyntheticLambda4(this, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AndroidView_androidKt.AndroidView((Function1) rememberedValue2, null, null, gapComposer, 0, 6);
                gapComposer.end(true);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(this, i, 0);
        }
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final Animator enterAnimator() {
        return ArcadeModal2Kt.createInAnimator(this, getAsView());
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final Animator exitAnimator() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.content, Views.SCALE, 1.05f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.asView, "alpha", RecyclerView.DECELERATION_RATE);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(Interpolators.ACCEL);
        return animatorSet;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final View getAsView() {
        return this.asView;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final OnBackListener getBackListener() {
        Object singleOrNull = SequencesKt___SequencesKt.singleOrNull(new ViewGroupKt$children$1(this.content));
        if (singleOrNull instanceof OnBackListener) {
            return (OnBackListener) singleOrNull;
        }
        return null;
    }

    @Override // com.squareup.cash.dialog.DesignSystemDialog
    public final ViewGroup getContent() {
        return this.content;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final void onEnterDone() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        setLayoutTransition(layoutTransition);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.exiting || super.onInterceptTouchEvent(motionEvent);
    }

    public void setExiting(boolean z) {
        this.exiting = z;
    }

    public void setOnClickOutsideListener(Function0<Unit> function0) {
        function0.getClass();
        setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(20, this, function0));
    }
}
