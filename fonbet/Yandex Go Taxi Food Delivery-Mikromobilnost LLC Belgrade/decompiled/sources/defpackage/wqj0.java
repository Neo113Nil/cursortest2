package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wqj0 implements rqj0 {
    public final mq01 a;
    public final boolean b;
    public final Text.Resource c;

    public wqj0(mq01 mq01Var, boolean z, Text.Resource resource) {
        this.a = mq01Var;
        this.b = z;
        this.c = resource;
    }

    public static wqj0 c(wqj0 wqj0Var, boolean z) {
        mq01 mq01Var = wqj0Var.a;
        Text.Resource resource = wqj0Var.c;
        wqj0Var.getClass();
        return new wqj0(mq01Var, z, resource);
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
        if (!(obj instanceof wqj0)) {
            return false;
        }
        wqj0 wqj0Var = (wqj0) obj;
        return jl40.l(this.a, wqj0Var.a) && this.b == wqj0Var.b && this.c.equals(wqj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RequisiteRadioButtonItem(formItemType=" + this.a + ", selected=" + this.b + ", labelText=" + this.c + Extension.C_BRAKE;
    }
}
