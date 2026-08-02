package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class von implements won {
    public final boolean a;
    public final String b;
    public final rr51 c;

    public von(boolean z, String str, rr51 rr51Var) {
        this.a = z;
        this.b = str;
        this.c = rr51Var;
    }

    @Override // defpackage.won
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof von)) {
            return false;
        }
        von vonVar = (von) obj;
        return this.a == vonVar.a && jl40.l(this.b, vonVar.b) && jl40.l(this.c, vonVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        rr51 rr51Var = this.c;
        return b + (rr51Var == null ? 0 : rr51Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = ly3.v("EducationVideoContentEntity(showCross=", ", url=", this.b, ", divkitData=", this.a);
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
