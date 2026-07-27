package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4679c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39128n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f39129u;

    public /* synthetic */ RunnableC4679c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f39128n = i;
        this.f39129u = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39128n) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f39129u;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f4546P = actionBarOverlayLayout.f4555w.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4547Q);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f39129u;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f4546P = actionBarOverlayLayout2.f4555w.animate().translationY(-actionBarOverlayLayout2.f4555w.getHeight()).setListener(actionBarOverlayLayout2.f4547Q);
                break;
        }
    }
}
