package h;

import java.lang.reflect.Field;

/* renamed from: h.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0156G implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J f2095f;

    public /* synthetic */ RunnableC0156G(J j2, int i2) {
        this.f2094e = i2;
        this.f2095f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J j2 = this.f2095f;
        switch (this.f2094e) {
            case 0:
                L l2 = j2.f2102g;
                if (l2 != null) {
                    l2.setListSelectionHidden(true);
                    l2.requestLayout();
                    break;
                }
                break;
            default:
                L l3 = j2.f2102g;
                if (l3 != null) {
                    Field field = w.x.f3074a;
                    if (l3.isAttachedToWindow() && j2.f2102g.getCount() > j2.f2102g.getChildCount() && j2.f2102g.getChildCount() <= Integer.MAX_VALUE) {
                        j2.f2120z.setInputMethodMode(2);
                        j2.f();
                        break;
                    }
                }
                break;
        }
    }
}
