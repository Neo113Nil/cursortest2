package defpackage;

/* loaded from: classes3.dex */
public final class t5n {
    public final n6n a;
    public final qzc b;
    public final dn9 c;
    public final ail d;
    public final boolean e;

    public t5n(n6n n6nVar, qzc qzcVar, dn9 dn9Var) {
        this.a = n6nVar;
        this.b = qzcVar;
        this.c = dn9Var;
        this.d = n6nVar.m;
        this.e = n6nVar.l;
    }

    public static snb a(uft uftVar) {
        int ordinal = uftVar.ordinal();
        if (ordinal == 0) {
            return snb.LOSSLESS;
        }
        if (ordinal == 1) {
            return snb.NORMAL;
        }
        if (ordinal == 2) {
            return snb.LOW;
        }
        if (ordinal == 3) {
            return snb.NORMAL;
        }
        b6e.s();
        return null;
    }
}
