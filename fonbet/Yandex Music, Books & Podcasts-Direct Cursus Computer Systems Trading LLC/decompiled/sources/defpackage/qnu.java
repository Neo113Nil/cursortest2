package defpackage;

/* loaded from: classes6.dex */
public final class qnu {
    public final wst a;
    public final tf6 b;
    public rar c;
    public final xdr d;

    public qnu(frt frtVar, wst wstVar) {
        this.a = wstVar;
        tf6 e = gld.e(dm6.b);
        this.b = e;
        float floatValue = ((Number) wstVar.a(frtVar.c()).f(jy4.e)).floatValue();
        this.d = ydr.a(floatValue >= 0.0f ? Float.valueOf((floatValue + 280) % 360) : null);
        ox6.B(frtVar.g(), e, new pnu(this, 0));
    }
}
