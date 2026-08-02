package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class xjm0 implements zjm0 {
    public final u1m a;
    public final String b;
    public final String c;
    public final Throwable d;

    public xjm0(u1m u1mVar, String str, String str2, Throwable th) {
        this.a = u1mVar;
        this.b = str;
        this.c = str2;
        this.d = th;
    }

    public final u1m a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final Throwable c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xjm0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xjm0 xjm0Var = (xjm0) obj;
        return jl40.l(this.a, xjm0Var.a) && jl40.l(this.b, xjm0Var.b) && jl40.l(this.c, xjm0Var.c) && this.d.equals(xjm0Var.d);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = (u1mVar != null ? u1mVar.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Corrupted(query=" + this.a + ", requestId=" + this.b + ", scaffoldType=" + this.c + ", throwable=" + this.d + Extension.C_BRAKE;
    }
}
