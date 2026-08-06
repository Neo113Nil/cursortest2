package P0;

import android.view.ViewTreeObserver;

/* renamed from: P0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0074g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f1415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0075h f1416b;

    public ViewTreeObserverOnPreDrawListenerC0074g(C0075h c0075h, t tVar) {
        this.f1416b = c0075h;
        this.f1415a = tVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0075h c0075h = this.f1416b;
        if (c0075h.f1424h && c0075h.f1422f != null) {
            this.f1415a.getViewTreeObserver().removeOnPreDrawListener(this);
            c0075h.f1422f = null;
        }
        return c0075h.f1424h;
    }
}
