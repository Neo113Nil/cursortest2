package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qmp0 {
    public final String a;
    public final String b;
    public final String c;
    public final bj70 d;
    public final boolean e;
    public final ynv0 f;
    public final b7p0 g;
    public final npb h;
    public final sls i;

    public qmp0(String str, String str2, String str3, bj70 bj70Var, boolean z, ynv0 ynv0Var, b7p0 b7p0Var, npb npbVar, sls slsVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bj70Var;
        this.e = z;
        this.f = ynv0Var;
        this.g = b7p0Var;
        this.h = npbVar;
        this.i = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qmp0) {
            qmp0 qmp0Var = (qmp0) obj;
            if (jl40.l(this.a, qmp0Var.a) && jl40.l(this.b, qmp0Var.b) && jl40.l(this.c, qmp0Var.c) && jl40.l(this.d, qmp0Var.d) && this.e == qmp0Var.e && jl40.l(this.f, qmp0Var.f) && this.g == qmp0Var.g && this.h == qmp0Var.h && this.i.equals(qmp0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        bj70 bj70Var = this.d;
        int e = unr0.e((b + (bj70Var == null ? 0 : bj70Var.hashCode())) * 31, 31, this.e);
        ynv0 ynv0Var = this.f;
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((e + (ynv0Var != null ? ynv0Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SdcSourcePickerParam(title=", this.a, ", subtitle=", this.b, ", buttonText=");
        v.append(this.c);
        v.append(", buttonStyle=");
        v.append(this.d);
        v.append(", fromDestinationPicker=");
        v.append(this.e);
        v.append(", origin=");
        v.append(this.f);
        v.append(", onReceive=");
        v.append(this.g);
        v.append(", onNext=");
        v.append(this.h);
        v.append(", onDismiss=");
        return ly3.r(v, this.i, Extension.C_BRAKE);
    }
}
