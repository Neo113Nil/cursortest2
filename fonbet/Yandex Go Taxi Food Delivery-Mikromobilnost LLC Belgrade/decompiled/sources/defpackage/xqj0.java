package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xqj0 implements rqj0 {
    public final mq01 a;
    public final Boolean b;
    public final boolean c;

    public xqj0(mq01 mq01Var, Boolean bool, boolean z) {
        this.a = mq01Var;
        this.b = bool;
        this.c = z;
    }

    public static xqj0 c(xqj0 xqj0Var, Boolean bool, boolean z, int i) {
        mq01 mq01Var = xqj0Var.a;
        if ((i & 2) != 0) {
            bool = xqj0Var.b;
        }
        xqj0Var.getClass();
        return new xqj0(mq01Var, bool, z);
    }

    @Override // defpackage.rqj0
    public final rqj0 a(crj0 crj0Var) {
        return c(this, null, this.b == null, 3);
    }

    @Override // defpackage.rqj0
    public final mq01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqj0)) {
            return false;
        }
        xqj0 xqj0Var = (xqj0) obj;
        return jl40.l(this.a, xqj0Var.a) && jl40.l(this.b, xqj0Var.b) && this.c == xqj0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequisiteVatChipsItem(formItemType=");
        sb.append(this.a);
        sb.append(", vatIncluded=");
        sb.append(this.b);
        sb.append(", hasError=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
