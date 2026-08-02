package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.MooncakeDialog;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.overlays.OverlaysKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class LegacyDialogBinding implements Widget {
    public final AlertDialogView alertDialogView;
    public PageFetcher$generateNewPagingSource$3 cancelActionOnClick;
    public final MooncakeDialog dialog;
    public boolean isVisible;
    public OverlayLayer.Session overlaySession;
    public final AlertDialogBreadcrumb value;
    public Function0 confirmActionOnClick = new MotionKt$$ExternalSyntheticLambda0(29);
    public Function0 onClickOutside = new SsnViewKt$$ExternalSyntheticLambda0(1);
    public Modifier modifier = Modifier.Companion.$$INSTANCE;

    public final class AlertDialogBreadcrumb extends View {
        public boolean isAttached;

        public AlertDialogBreadcrumb(Context context) {
            super(context);
            setVisibility(8);
        }

        @Override // android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.isAttached = true;
            LegacyDialogBinding.this.updateOverlaySession$1();
        }

        @Override // android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.isAttached = false;
            LegacyDialogBinding.this.updateOverlaySession$1();
        }

        public final void setAttached(boolean z) {
            this.isAttached = z;
        }
    }

    public LegacyDialogBinding(Context context) {
        this.value = new AlertDialogBreadcrumb(context);
        AlertDialogView alertDialogView = new AlertDialogView(context, null, false, 6);
        this.alertDialogView = alertDialogView;
        MooncakeDialog mooncakeDialog = new MooncakeDialog(new ContextThemeWrapper(context, R.style.Theme_Cash_Dialog));
        mooncakeDialog.content.addView(alertDialogView);
        mooncakeDialog.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 22));
        this.dialog = mooncakeDialog;
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

    public final void updateOverlaySession$1() {
        boolean z = this.isVisible;
        AlertDialogBreadcrumb alertDialogBreadcrumb = this.value;
        boolean z2 = z && alertDialogBreadcrumb.isAttached;
        OverlayLayer.Session session = this.overlaySession;
        boolean z3 = session != null;
        if (!z3 && z2) {
            this.overlaySession = OverlaysKt.getOverlayLayer(alertDialogBreadcrumb).show(this.dialog);
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
