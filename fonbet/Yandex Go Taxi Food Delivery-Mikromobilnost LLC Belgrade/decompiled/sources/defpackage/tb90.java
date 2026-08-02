package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class tb90 implements ub90 {
    public final String a;
    public final zzs b;
    public final Double c;
    public final String d;

    public tb90(String str, zzs zzsVar, Double d, String str2) {
        this.a = str;
        this.b = zzsVar;
        this.c = d;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb90)) {
            return false;
        }
        tb90 tb90Var = (tb90) obj;
        return jl40.l(this.a, tb90Var.a) && jl40.l(this.b, tb90Var.b) && jl40.l(this.c, tb90Var.c) && this.d.equals(tb90Var.d);
    }

    public final int hashCode() {
        int b = nnm.b(this.b, this.a.hashCode() * 31, 31);
        Double d = this.c;
        return this.d.hashCode() + ((b + (d == null ? 0 : d.hashCode())) * 31);
    }

    public final String toString() {
        return "PanoramaIdData(id=" + this.a + ", lookAtPoint=" + this.b + ", distance=" + this.c + ", photoPreviewUrl=" + this.d + Extension.C_BRAKE;
    }
}
