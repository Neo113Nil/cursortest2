package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uvs0 implements fws0, hz {
    public final sbv a;
    public final String b;
    public final r9x0 c;
    public final String d;
    public final x2s e;

    public uvs0(sbv sbvVar, String str, r9x0 r9x0Var, String str2, x2s x2sVar) {
        this.a = sbvVar;
        this.b = str;
        this.c = r9x0Var;
        this.d = str2;
        this.e = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvs0)) {
            return false;
        }
        uvs0 uvs0Var = (uvs0) obj;
        return this.a.equals(uvs0Var.a) && jl40.l(this.b, uvs0Var.b) && this.c.equals(uvs0Var.c) && jl40.l(this.d, uvs0Var.d) && this.e.equals(uvs0Var.e);
    }

    @Override // defpackage.hz
    public final r9x0 getAction() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "TrailIconButton(image=" + this.a + ", accessibilityLabel=" + this.b + ", action=" + this.c + ", presentationId=" + this.d + ", analyticsData=" + this.e + Extension.C_BRAKE;
    }
}
