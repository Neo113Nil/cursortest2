package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class r5a implements s5a {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public r5a(String str, CharSequence charSequence, CharSequence charSequence2, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.s5a
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5a)) {
            return false;
        }
        r5a r5aVar = (r5a) obj;
        return jl40.l(this.a, r5aVar.a) && jl40.l(this.b, r5aVar.b) && jl40.l(this.c, r5aVar.c) && jl40.l(this.d, r5aVar.d) && this.e == r5aVar.e && this.f == r5aVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(unr0.b(smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Leasing(orderId=", this.a, ", primaryLabel=", ", secondaryLabel=");
        t.append((Object) this.c);
        t.append(", powerBankIconUrl=");
        t.append(this.d);
        t.append(", showSeparator=");
        return smw0.k(", showChevron=", Extension.C_BRAKE, t, this.e, this.f);
    }
}
