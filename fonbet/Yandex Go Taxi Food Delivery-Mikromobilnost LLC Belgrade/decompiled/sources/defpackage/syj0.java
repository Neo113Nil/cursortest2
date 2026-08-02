package defpackage;

/* loaded from: classes8.dex */
public abstract class syj0 {
    public final syj0 a(tls tlsVar) {
        if (this instanceof lyj0) {
            return this;
        }
        if (this instanceof jyj0) {
            return new jyj0(tlsVar.invoke(((jyj0) this).a));
        }
        w511.b();
        return null;
    }

    public final syj0 b(tls tlsVar) {
        if (this instanceof lyj0) {
            return new lyj0(tlsVar.invoke(((lyj0) this).a));
        }
        if (this instanceof jyj0) {
            return this;
        }
        w511.b();
        return null;
    }
}
