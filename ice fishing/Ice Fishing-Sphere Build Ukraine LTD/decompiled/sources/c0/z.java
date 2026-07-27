package c0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1778a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0098A f1779b;

    public z(C0098A c0098a) {
        this.f1779b = c0098a;
    }

    public final void a(boolean z2) {
        if (this.f1778a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f1778a = true;
        C0098A c0098a = this.f1779b;
        int i2 = c0098a.f1659b - 1;
        c0098a.f1659b = i2;
        boolean z3 = z2 | c0098a.f1660c;
        c0098a.f1660c = z3;
        if (i2 != 0 || z3) {
            return;
        }
        c0098a.f1661d.F(c0098a.f1658a);
    }
}
