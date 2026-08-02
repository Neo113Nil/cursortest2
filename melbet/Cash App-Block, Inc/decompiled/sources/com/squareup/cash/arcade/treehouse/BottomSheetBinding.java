package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.sheet.BottomSheet;
import com.squareup.cash.sheet.ComposeBottomSheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.BottomSheetConfig;

/* loaded from: classes7.dex */
public final class BottomSheetBinding implements Widget {
    public final BottomSheet bottomSheet;
    public boolean isLocked;
    public boolean isSnapping;
    public boolean isVisible;
    public Modifier modifier;
    public GraphLoop$processingQueue$1 onSheetPositionChanged;
    public PageFetcher$generateNewPagingSource$3 onUserHidden;
    public OverlayLayer.Session overlaySession;
    public final FrameLayout sheetContent;
    public final BottomSheetBreadcrumb value;

    public final class BottomSheetBreadcrumb extends View {
        public boolean isAttached;

        public BottomSheetBreadcrumb(Context context) {
            super(context);
            setVisibility(8);
        }

        @Override // android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.isAttached = true;
            BottomSheetBinding.this.updateOverlaySession();
        }

        @Override // android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.isAttached = false;
            BottomSheetBinding.this.updateOverlaySession();
        }

        public final void setAttached(boolean z) {
            this.isAttached = z;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.cash.arcade.treehouse.BottomSheetBinding$bottomSheet$1] */
    public BottomSheetBinding(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.sheetContent = frameLayout;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.value = new BottomSheetBreadcrumb(context);
        BottomSheet bottomSheet = new BottomSheet(context, frameLayout, new BottomSheetConfig() { // from class: com.squareup.cash.arcade.treehouse.BottomSheetBinding$bottomSheet$1
            @Override // com.squareup.cash.ui.BottomSheetConfig
            public final boolean isLocked() {
                return BottomSheetBinding.this.isLocked;
            }

            @Override // com.squareup.cash.ui.BottomSheetConfig
            public final boolean isSnapping() {
                return BottomSheetBinding.this.isSnapping;
            }

            @Override // com.squareup.cash.ui.BottomSheetConfig
            public final void onSheetPositionChanged(int i) {
                GraphLoop$processingQueue$1 graphLoop$processingQueue$1;
                BottomSheetBinding bottomSheetBinding = BottomSheetBinding.this;
                if (bottomSheetBinding.overlaySession == null || (graphLoop$processingQueue$1 = bottomSheetBinding.onSheetPositionChanged) == null) {
                    return;
                }
                graphLoop$processingQueue$1.invoke(Integer.valueOf(i));
            }
        }, 56);
        bottomSheet.addOnStateChangeListener(new ComposeBottomSheetKt$$ExternalSyntheticLambda6(this, 1));
        this.bottomSheet = bottomSheet;
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

    public final void updateOverlaySession() {
        boolean z = this.isVisible;
        BottomSheetBreadcrumb bottomSheetBreadcrumb = this.value;
        boolean z2 = z && bottomSheetBreadcrumb.isAttached;
        OverlayLayer.Session session = this.overlaySession;
        boolean z3 = session != null;
        if (!z3 && z2) {
            this.overlaySession = OverlaysKt.getOverlayLayer(bottomSheetBreadcrumb).show(this.bottomSheet);
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
