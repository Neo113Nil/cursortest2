package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ql8 extends sl8 {
    public final vk11 b;

    public ql8(vk11 vk11Var) {
        this.b = vk11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql8) && jl40.l(this.b, ((ql8) obj).b);
    }

    public final int hashCode() {
        vk11 vk11Var = this.b;
        if (vk11Var == null) {
            return 0;
        }
        return vk11Var.hashCode();
    }

    public final String toString() {
        return "Loading(twoFactorData=" + this.b + Extension.C_BRAKE;
    }

    public ql8() {
        this(null);
    }
}
