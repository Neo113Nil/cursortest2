package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4727c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39392n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f39393u;

    public /* synthetic */ RunnableC4727c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f39392n = i;
        this.f39393u = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39392n) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f39393u;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f4661P = actionBarOverlayLayout.f4670w.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4662Q);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f39393u;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f4661P = actionBarOverlayLayout2.f4670w.animate().translationY(-actionBarOverlayLayout2.f4670w.getHeight()).setListener(actionBarOverlayLayout2.f4662Q);
                break;
        }
    }
}
