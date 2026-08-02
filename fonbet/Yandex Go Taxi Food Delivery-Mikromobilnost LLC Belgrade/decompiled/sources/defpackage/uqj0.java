package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uqj0 implements rqj0 {
    public final mq01 a;
    public final rr51 b;

    public uqj0(mq01 mq01Var, rr51 rr51Var) {
        this.a = mq01Var;
        this.b = rr51Var;
    }

    @Override // defpackage.rqj0
    public final rqj0 a(crj0 crj0Var) {
        return this;
    }

    @Override // defpackage.rqj0
    public final mq01 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqj0)) {
            return false;
        }
        uqj0 uqj0Var = (uqj0) obj;
        return jl40.l(this.a, uqj0Var.a) && this.b.equals(uqj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequisiteDivkitWidgetItem(formItemType=" + this.a + ", divkitData=" + this.b + Extension.C_BRAKE;
    }
}
