package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0246c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3922b;

    public /* synthetic */ RunnableC0246c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3921a = i;
        this.f3922b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3921a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3922b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1818w = actionBarOverlayLayout.f1802d.animate().translationY(RecyclerView.f2111C0).setListener(actionBarOverlayLayout.f1819x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3922b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1818w = actionBarOverlayLayout2.f1802d.animate().translationY(-actionBarOverlayLayout2.f1802d.getHeight()).setListener(actionBarOverlayLayout2.f1819x);
                break;
        }
    }
}
