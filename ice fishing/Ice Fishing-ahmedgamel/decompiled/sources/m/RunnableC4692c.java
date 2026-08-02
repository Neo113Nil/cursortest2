package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4692c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39190n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f39191u;

    public /* synthetic */ RunnableC4692c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f39190n = i;
        this.f39191u = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39190n) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f39191u;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f4514P = actionBarOverlayLayout.f4523w.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4515Q);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f39191u;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f4514P = actionBarOverlayLayout2.f4523w.animate().translationY(-actionBarOverlayLayout2.f4523w.getHeight()).setListener(actionBarOverlayLayout2.f4515Q);
                break;
        }
    }
}
