package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class yx20 extends zx20 {
    public final String a;
    public final zxs0 b;

    public yx20(String str, zxs0 zxs0Var) {
        this.a = str;
        this.b = zxs0Var;
    }

    @Override // defpackage.zx20
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yx20) {
            yx20 yx20Var = (yx20) obj;
            return jl40.l(this.a, yx20Var.a) && this.b == yx20Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SortingModal(id=" + this.a + ", block=" + this.b + Extension.C_BRAKE;
    }
}
