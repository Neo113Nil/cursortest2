package defpackage;

/* loaded from: classes7.dex */
public final class rs71 extends cn81 {
    public static final Object y = new Object();
    public final Object w;
    public final Object x;

    public rs71(yn81 yn81Var, Object obj, Object obj2) {
        super(yn81Var);
        this.w = obj;
        this.x = obj2;
    }

    @Override // defpackage.yn81
    public final ie81 a(int i, ie81 ie81Var, boolean z) {
        this.a.a(i, ie81Var, z);
        if (rf71.o(ie81Var.b, this.x) && z) {
            ie81Var.b = y;
        }
        return ie81Var;
    }

    @Override // defpackage.yn81
    public final uk81 a(int i, uk81 uk81Var, long j) {
        this.a.a(i, uk81Var, j);
        if (rf71.o(uk81Var.a, this.w)) {
            uk81Var.a = uk81.J;
        }
        return uk81Var;
    }

    @Override // defpackage.cn81, defpackage.yn81
    public final int a(Object obj) {
        Object obj2;
        if (y == obj && (obj2 = this.x) != null) {
            obj = obj2;
        }
        return this.a.a(obj);
    }

    @Override // defpackage.cn81, defpackage.yn81
    public final Object a(int i) {
        Object a = this.a.a(i);
        return rf71.o(a, this.x) ? y : a;
    }
}
