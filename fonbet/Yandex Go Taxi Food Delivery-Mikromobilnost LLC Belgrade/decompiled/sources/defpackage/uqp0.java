package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uqp0 extends crp0 {
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final Throwable g;
    public final Object h;

    public uqp0(String str, Integer num, Integer num2, String str2, Throwable th, Object obj) {
        super("SamsungPay");
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = str2;
        this.g = th;
        this.h = obj;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.g;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.h;
    }

    public final Integer e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqp0)) {
            return false;
        }
        uqp0 uqp0Var = (uqp0) obj;
        return this.c.equals(uqp0Var.c) && jl40.l(this.d, uqp0Var.d) && jl40.l(this.e, uqp0Var.e) && jl40.l(this.f, uqp0Var.f) && jl40.l(this.g, uqp0Var.g) && jl40.l(this.h, uqp0Var.h);
    }

    public final String f() {
        return this.c;
    }

    public final Integer g() {
        return this.e;
    }

    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.g;
        int hashCode5 = (hashCode4 + (th == null ? 0 : th.hashCode())) * 31;
        Object obj = this.h;
        return hashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = n.q("SamsungPay(message=", this.d, this.c, ", errorCode=", ", reasonCode=");
        tse0.w(this.e, ", reasonMessage=", this.f, ", exception=", q);
        q.append(this.g);
        q.append(", payload=");
        q.append(this.h);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
