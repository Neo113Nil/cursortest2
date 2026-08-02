package defpackage;

/* loaded from: classes15.dex */
public final class qq1 {
    public final CharSequence a;
    public final Integer b;
    public final tls c;
    public final int d;
    public final tls e;
    public final boolean f;

    public qq1(Integer num, tls tlsVar, int i, int i2) {
        num = (i2 & 2) != 0 ? null : num;
        int i3 = 21;
        tlsVar = (i2 & 4) != 0 ? new j01(i3) : tlsVar;
        i = (i2 & 8) != 0 ? crg0.black_night : i;
        j01 j01Var = new j01(i3);
        this.a = null;
        this.b = num;
        this.c = tlsVar;
        this.d = i;
        this.e = j01Var;
        this.f = true;
    }

    public qq1() {
        this(null, null, 0, 511);
    }
}
