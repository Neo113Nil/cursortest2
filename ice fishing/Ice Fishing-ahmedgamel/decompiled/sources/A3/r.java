package A3;

import s2.f1;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f184a;

    /* renamed from: b, reason: collision with root package name */
    public int f185b;

    /* renamed from: c, reason: collision with root package name */
    public int f186c;

    public r() {
        this.f184a = 0;
        this.f185b = 0;
        this.f186c = 0;
    }

    public static r a(f1 f1Var) {
        return f1Var.f40444w ? new r(3, 0, 0) : f1Var.f40433B ? new r(2, 0, 0) : f1Var.f40432A ? new r(0, 0, 0) : new r(1, f1Var.f40446y, f1Var.f40443v);
    }

    public boolean b() {
        return this.f184a == 3;
    }

    public r(int i, int i4, int i6) {
        this.f184a = i;
        this.f186c = i4;
        this.f185b = i6;
    }

    public /* synthetic */ r(int i, int i4, int i6, boolean z6) {
        this.f184a = i;
        this.f185b = i4;
        this.f186c = i6;
    }
}
