package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yqi implements cri {
    public final kus0 a;
    public final String b;
    public final String c;

    public yqi(kus0 kus0Var, String str, String str2) {
        this.a = kus0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqi)) {
            return false;
        }
        yqi yqiVar = (yqi) obj;
        return this.a.equals(yqiVar.a) && jl40.l(this.b, yqiVar.b) && jl40.l(this.c, yqiVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(slot=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
