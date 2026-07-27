package c0;

import android.view.ViewTreeObserver;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0106h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f1688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0107i f1689g;

    public ViewTreeObserverOnPreDrawListenerC0106h(C0107i c0107i, r rVar) {
        this.f1689g = c0107i;
        this.f1688f = rVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0107i c0107i = this.f1689g;
        if (c0107i.f1697h && c0107i.f1695f != null) {
            this.f1688f.getViewTreeObserver().removeOnPreDrawListener(this);
            c0107i.f1695f = null;
        }
        return c0107i.f1697h;
    }
}
