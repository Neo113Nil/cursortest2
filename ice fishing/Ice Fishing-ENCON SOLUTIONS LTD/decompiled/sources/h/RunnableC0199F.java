package h;

import java.lang.reflect.Field;

/* renamed from: h.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0199F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0202I f3153b;

    public /* synthetic */ RunnableC0199F(AbstractC0202I abstractC0202I, int i2) {
        this.f3152a = i2;
        this.f3153b = abstractC0202I;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0202I abstractC0202I = this.f3153b;
        switch (this.f3152a) {
            case 0:
                C0204K c0204k = abstractC0202I.f3160c;
                if (c0204k != null) {
                    c0204k.setListSelectionHidden(true);
                    c0204k.requestLayout();
                    break;
                }
                break;
            default:
                C0204K c0204k2 = abstractC0202I.f3160c;
                if (c0204k2 != null) {
                    Field field = y.x.f8596a;
                    if (c0204k2.isAttachedToWindow() && abstractC0202I.f3160c.getCount() > abstractC0202I.f3160c.getChildCount() && abstractC0202I.f3160c.getChildCount() <= Integer.MAX_VALUE) {
                        abstractC0202I.f3178v.setInputMethodMode(2);
                        abstractC0202I.c();
                        break;
                    }
                }
                break;
        }
    }
}
