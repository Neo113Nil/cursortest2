package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ypb {
    public final CharSequence a;
    public final kdc b;
    public final boolean c;
    public final CharSequence d;
    public final kdc e;
    public final k7v f;

    public ypb(CharSequence charSequence, kdc kdcVar, boolean z, CharSequence charSequence2, kdc kdcVar2, k7v k7vVar) {
        this.a = charSequence;
        this.b = kdcVar;
        this.c = z;
        this.d = charSequence2;
        this.e = kdcVar2;
        this.f = k7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypb)) {
            return false;
        }
        ypb ypbVar = (ypb) obj;
        return jl40.l(this.a, ypbVar.a) && jl40.l(this.b, ypbVar.b) && this.c == ypbVar.c && jl40.l(this.d, ypbVar.d) && jl40.l(this.e, ypbVar.e) && jl40.l(this.f, ypbVar.f);
    }

    public final int hashCode() {
        int e = unr0.e(smw0.d(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        CharSequence charSequence = this.d;
        int hashCode = (e + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        kdc kdcVar = this.e;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        k7v k7vVar = this.f;
        return hashCode2 + (k7vVar != null ? k7vVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChipAppearance(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", isTriggered=" + this.c + ", selectedTitle=" + ((Object) this.d) + ", selectedBackgroundColor=" + this.e + ", selectedCrossImage=" + this.f + Extension.C_BRAKE;
    }
}
