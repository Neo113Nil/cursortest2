package g;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3012b;

    public /* synthetic */ d(l lVar, int i2) {
        this.f3011a = i2;
        this.f3012b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f3011a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3011a) {
            case 0:
                g gVar = (g) this.f3012b;
                ViewTreeObserver viewTreeObserver = gVar.f3041x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f3041x = view.getViewTreeObserver();
                    }
                    gVar.f3041x.removeGlobalOnLayoutListener(gVar.f3027i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.f3012b;
                ViewTreeObserver viewTreeObserver2 = sVar.f3123o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f3123o = view.getViewTreeObserver();
                    }
                    sVar.f3123o.removeGlobalOnLayoutListener(sVar.f3117i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
