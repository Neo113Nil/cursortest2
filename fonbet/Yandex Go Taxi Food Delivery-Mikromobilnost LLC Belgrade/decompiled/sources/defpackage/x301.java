package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x301 implements zb5 {
    public final String a;
    public final zn70 b;

    public x301(String str, zn70 zn70Var) {
        this.a = str;
        this.b = zn70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x301)) {
            return false;
        }
        x301 x301Var = (x301) obj;
        return jl40.l(this.a, x301Var.a) && jl40.l(this.b, x301Var.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.zb5
    public final zn70 l() {
        return this.b;
    }

    public final String toString() {
        return "TrackingCardItemUiState(id=" + this.a + ", card=" + this.b + Extension.C_BRAKE;
    }
}
