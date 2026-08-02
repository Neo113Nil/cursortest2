package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xjj extends n351 {
    public final String c;
    public final boolean d;
    public final ekj e;
    public final tky0 f;
    public final String g;

    public xjj(String str, boolean z, ekj ekjVar, tky0 tky0Var, String str2) {
        super("digits-input", false, 14);
        this.c = str;
        this.d = z;
        this.e = ekjVar;
        this.f = tky0Var;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjj)) {
            return false;
        }
        xjj xjjVar = (xjj) obj;
        return this.c.equals(xjjVar.c) && this.d == xjjVar.d && this.e.equals(xjjVar.e) && this.f.equals(xjjVar.f) && jl40.l(this.g, xjjVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + unr0.e(this.c.hashCode() * 31, 31, this.d)) * 31)) * 31;
        String str = this.g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder l = oo31.l("DigitsInputModel(text=", this.c, ", forceOpenKeyboard=", ", inputType=", this.d);
        l.append(this.e);
        l.append(", widgetAction=");
        l.append(this.f);
        l.append(", metricaLabel=");
        return oyr.t(l, this.g, Extension.C_BRAKE);
    }
}
