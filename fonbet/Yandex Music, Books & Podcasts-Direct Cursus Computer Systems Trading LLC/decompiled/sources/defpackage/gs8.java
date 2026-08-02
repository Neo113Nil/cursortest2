package defpackage;

/* loaded from: classes5.dex */
public final class gs8 {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public gs8(jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
    }

    public final void a(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        jyr jyrVar = k3j.e;
        if (ixf.x()) {
            ((oi5) this.a.getValue()).g(str, str2, str3);
        } else {
            ((pi5) this.b.getValue()).d(str2, str3);
        }
    }
}
