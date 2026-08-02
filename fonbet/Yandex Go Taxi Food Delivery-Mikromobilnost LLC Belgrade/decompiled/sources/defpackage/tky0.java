package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tky0 {
    public final String a;
    public final boolean b;
    public final zpy0 c;
    public final String d;
    public final String e;

    public tky0(String str, boolean z, zpy0 zpy0Var, String str2, String str3) {
        this.a = str;
        this.b = z;
        this.c = zpy0Var;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tky0)) {
            return false;
        }
        tky0 tky0Var = (tky0) obj;
        return jl40.l(this.a, tky0Var.a) && this.b == tky0Var.b && jl40.l(this.c, tky0Var.c) && jl40.l(this.d, tky0Var.d) && jl40.l(this.e, tky0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        zpy0 zpy0Var = this.c;
        int b = unr0.b((e + (zpy0Var == null ? 0 : zpy0Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("TextChangeWidgetAction(formStateKey=", this.a, ", debounce=", ", stopWordsConfig=", this.b);
        l.append(this.c);
        l.append(", widgetId=");
        l.append(this.d);
        l.append(", metricaLabel=");
        return oyr.t(l, this.e, Extension.C_BRAKE);
    }
}
