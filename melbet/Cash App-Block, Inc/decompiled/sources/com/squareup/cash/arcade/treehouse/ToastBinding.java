package com.squareup.cash.arcade.treehouse;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.overlays.Overlay;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.util.android.animation.Interpolators;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ToastBinding implements Widget {
    public boolean isVisible;
    public OverlayLayer.Session overlaySession;
    public final ToastBreadcrumb value;
    public Modifier modifier = Modifier.Companion.$$INSTANCE;
    public final ParcelableSnapshotMutableState headline$delegate = Updater.mutableStateOf$default("");
    public final ParcelableSnapshotMutableState icon$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState iconContentDescription$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState body$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState actionText$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState actionOnClick$delegate = Updater.mutableStateOf$default(null);

    public final class ToastBreadcrumb extends View {
        public boolean isAttached;

        public ToastBreadcrumb(Context context) {
            super(context);
            setVisibility(8);
        }

        @Override // android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.isAttached = true;
            ToastBinding.this.updateOverlaySession$2();
        }

        @Override // android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.isAttached = false;
            ToastBinding.this.updateOverlaySession$2();
        }

        public final void setAttached(boolean z) {
            this.isAttached = z;
        }
    }

    /* loaded from: classes7.dex */
    public final class ToastView extends AbstractComposeView implements Overlay {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ToastView() {
            super(r4, null, 6, 0);
            Context context = ToastBinding.this.value.getContext();
            context.getClass();
        }

        @Override // androidx.compose.ui.platform.AbstractComposeView
        public final void Content(Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(1666534171);
            int i2 = i & 1;
            int i3 = 0;
            if (gapComposer.shouldExecute(i2, i2 != 0)) {
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-766041424, new ToastBinding$ToastView$$ExternalSyntheticLambda0(ToastBinding.this, i3), gapComposer), gapComposer, 3072, 7);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 29);
            }
        }

        @Override // com.squareup.cash.overlays.Overlay
        public final Animator enterAnimator() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", RecyclerView.DECELERATION_RATE, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(Interpolators.DECEL);
            return ofFloat;
        }

        @Override // com.squareup.cash.overlays.Overlay
        public final Animator exitAnimator() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", RecyclerView.DECELERATION_RATE);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(Interpolators.ACCEL);
            return ofFloat;
        }

        @Override // com.squareup.cash.overlays.Overlay
        public final View getAsView() {
            return this;
        }

        @Override // com.squareup.cash.overlays.Overlay
        public final OnBackListener getBackListener() {
            return null;
        }

        public void setOnClickOutsideListener(Function0<Unit> function0) {
            function0.getClass();
        }
    }

    public ToastBinding(Context context) {
        this.value = new ToastBreadcrumb(context);
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }

    public final void updateOverlaySession$2() {
        boolean z = this.isVisible;
        ToastBreadcrumb toastBreadcrumb = this.value;
        boolean z2 = z && toastBreadcrumb.isAttached;
        OverlayLayer.Session session = this.overlaySession;
        boolean z3 = session != null;
        if (!z3 && z2) {
            this.overlaySession = OverlaysKt.getOverlayLayer(toastBreadcrumb).show(new ToastView());
        } else {
            if (!z3 || z2) {
                return;
            }
            if (session != null) {
                session.dismiss();
            }
            this.overlaySession = null;
        }
    }
}
