package h;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0207c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3218b;

    public /* synthetic */ RunnableC0207c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f3217a = i2;
        this.f3218b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3217a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3218b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.t = actionBarOverlayLayout.f2092c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2109u);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3218b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.t = actionBarOverlayLayout2.f2092c.animate().translationY(-actionBarOverlayLayout2.f2092c.getHeight()).setListener(actionBarOverlayLayout2.f2109u);
                break;
        }
    }
}
