package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f4277h;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f4276g = i10;
        this.f4277h = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4276g) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4277h;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f421z = actionBarOverlayLayout.f404i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.A);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4277h;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f421z = actionBarOverlayLayout2.f404i.animate().translationY(-actionBarOverlayLayout2.f404i.getHeight()).setListener(actionBarOverlayLayout2.A);
                break;
        }
    }
}
