package defpackage;

/* loaded from: classes2.dex */
public final class wv5 {
    public tls a;
    public Object b = zoy0.c;

    public wv5(tls tlsVar) {
        this.a = tlsVar;
    }

    public final Object a(kgx kgxVar) {
        if (this.b == zoy0.c) {
            this.b = this.a.invoke(kgxVar);
            this.a = null;
        }
        return this.b;
    }
}
