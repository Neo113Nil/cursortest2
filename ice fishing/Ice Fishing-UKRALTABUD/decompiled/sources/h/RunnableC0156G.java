package h;

import java.lang.reflect.Field;

/* renamed from: h.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0156G implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ J f2086g;

    public /* synthetic */ RunnableC0156G(J j2, int i2) {
        this.f2085f = i2;
        this.f2086g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J j2 = this.f2086g;
        switch (this.f2085f) {
            case 0:
                L l2 = j2.f2094h;
                if (l2 != null) {
                    l2.setListSelectionHidden(true);
                    l2.requestLayout();
                    break;
                }
                break;
            default:
                L l3 = j2.f2094h;
                if (l3 != null) {
                    Field field = w.x.f3069a;
                    if (l3.isAttachedToWindow() && j2.f2094h.getCount() > j2.f2094h.getChildCount() && j2.f2094h.getChildCount() <= Integer.MAX_VALUE) {
                        j2.f2091A.setInputMethodMode(2);
                        j2.f();
                        break;
                    }
                }
                break;
        }
    }
}
