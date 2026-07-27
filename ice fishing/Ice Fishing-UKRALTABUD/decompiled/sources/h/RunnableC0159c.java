package h;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0159c implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2147g;

    public /* synthetic */ RunnableC0159c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f2146f = i2;
        this.f2147g = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2146f) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2147g;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1148y = actionBarOverlayLayout.f1132h.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1149z);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2147g;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1148y = actionBarOverlayLayout2.f1132h.animate().translationY(-actionBarOverlayLayout2.f1132h.getHeight()).setListener(actionBarOverlayLayout2.f1149z);
                break;
        }
    }
}
