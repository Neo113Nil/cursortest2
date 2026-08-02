package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wye {
    public final CharSequence a;
    public final int b;
    public final long c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;

    public wye(CharSequence charSequence, int i, long j, int i2, boolean z, boolean z2, String str, String str2, String str3) {
        this.a = charSequence;
        this.b = i;
        this.c = j;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = str;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wye)) {
            return false;
        }
        wye wyeVar = (wye) obj;
        return jl40.l(this.a, wyeVar.a) && this.b == wyeVar.b && e3n.d(this.c, wyeVar.c) && this.d == wyeVar.d && this.e == wyeVar.e && this.f == wyeVar.f && jl40.l(this.g, wyeVar.g) && jl40.l(this.h, wyeVar.h) && jl40.l(this.i, wyeVar.i);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int b = oyr.b(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
        o430 o430Var = e3n.b;
        int e = unr0.e(unr0.e(oyr.b(this.d, qv10.c(b, 31, this.c), 31), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String p = e3n.p(this.c);
        StringBuilder sb = new StringBuilder("Counter(title=");
        sb.append((Object) this.a);
        sb.append(", currentValue=");
        sb.append(this.b);
        sb.append(", debounce=");
        b64.A(this.d, p, ", maxValue=", ", enabled=", sb);
        nnm.v(", isHidden=", ", vehicleId=", sb, this.e, this.f);
        g8e.D(sb, this.g, ", qrUrl=", this.h, ", destinationStopId=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
