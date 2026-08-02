package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ton implements won {
    public final boolean a;
    public final rr51 b;

    public ton(rr51 rr51Var, boolean z) {
        this.a = z;
        this.b = rr51Var;
    }

    @Override // defpackage.won
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ton)) {
            return false;
        }
        ton tonVar = (ton) obj;
        return this.a == tonVar.a && jl40.l(this.b, tonVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        rr51 rr51Var = this.b;
        return hashCode + (rr51Var == null ? 0 : rr51Var.hashCode());
    }

    public final String toString() {
        return "EducationFullscreenContentEntity(showCross=" + this.a + ", divkitData=" + this.b + Extension.C_BRAKE;
    }
}
