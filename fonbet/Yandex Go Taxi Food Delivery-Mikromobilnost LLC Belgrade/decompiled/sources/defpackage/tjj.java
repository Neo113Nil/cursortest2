package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tjj implements pre {
    public final String a;
    public final String b;
    public final hkj c;
    public final boolean d;
    public final String e;

    public tjj(String str, String str2, hkj hkjVar, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = hkjVar;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjj)) {
            return false;
        }
        tjj tjjVar = (tjj) obj;
        return jl40.l(this.a, tjjVar.a) && jl40.l(this.b, tjjVar.b) && this.c.equals(tjjVar.c) && this.d == tjjVar.d && jl40.l(this.e, tjjVar.e);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "digits-input";
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("DigitsInputCoreWidget(id=", this.a, ", formStateKey=", this.b, ", inputType=");
        v.append(this.c);
        v.append(", forceOpenKeyboard=");
        v.append(this.d);
        v.append(", metricaLabel=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
