package defpackage;

/* loaded from: classes10.dex */
public final class wls0 {
    public final String a;
    public final rms0 b;
    public final tls c;

    public wls0(String str, rms0 rms0Var, tls tlsVar) {
        this.a = str;
        this.b = rms0Var;
        this.c = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wls0) {
            return jl40.l(((wls0) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
