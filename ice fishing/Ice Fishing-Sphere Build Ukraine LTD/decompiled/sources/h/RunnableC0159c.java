package h;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0159c implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2155f;

    public /* synthetic */ RunnableC0159c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f2154e = i2;
        this.f2155f = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2154e) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2155f;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1155x = actionBarOverlayLayout.f1139g.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1156y);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2155f;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1155x = actionBarOverlayLayout2.f1139g.animate().translationY(-actionBarOverlayLayout2.f1139g.getHeight()).setListener(actionBarOverlayLayout2.f1156y);
                break;
        }
    }
}
