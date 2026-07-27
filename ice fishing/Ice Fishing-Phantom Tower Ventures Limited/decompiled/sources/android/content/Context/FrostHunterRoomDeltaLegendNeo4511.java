package android.content.Context;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRoomDeltaLegendNeo4511 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final Runnable FrostHunterAlertDialogAuroraDelta3200;
    public final View FrostHunterCameraXPixelTurboCosmos9814;
    public ViewTreeObserver FrostHunterFlowMaxDragonHero5809;

    public FrostHunterRoomDeltaLegendNeo4511(View view, Runnable runnable) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = view;
        this.FrostHunterFlowMaxDragonHero5809 = view.getViewTreeObserver();
        this.FrostHunterAlertDialogAuroraDelta3200 = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.FrostHunterFlowMaxDragonHero5809.isAlive();
        View view = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (isAlive) {
            this.FrostHunterFlowMaxDragonHero5809.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.FrostHunterAlertDialogAuroraDelta3200.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.FrostHunterFlowMaxDragonHero5809 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.FrostHunterFlowMaxDragonHero5809.isAlive();
        View view2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (isAlive) {
            this.FrostHunterFlowMaxDragonHero5809.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
