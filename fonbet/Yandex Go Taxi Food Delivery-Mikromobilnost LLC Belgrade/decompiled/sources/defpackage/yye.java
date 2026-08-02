package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yye {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final String d;
    public final r9x0 e;
    public final r9x0 f;

    public yye(String str, ArrayList arrayList, int i, String str2, r9x0 r9x0Var, r9x0 r9x0Var2) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = str2;
        this.e = r9x0Var;
        this.f = r9x0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yye)) {
            return false;
        }
        yye yyeVar = (yye) obj;
        return jl40.l(this.a, yyeVar.a) && this.b.equals(yyeVar.b) && this.c == yyeVar.c && jl40.l(this.d, yyeVar.d) && jl40.l(this.e, yyeVar.e) && jl40.l(this.f, yyeVar.f);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, ly3.b(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        r9x0 r9x0Var = this.e;
        int hashCode2 = (hashCode + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        r9x0 r9x0Var2 = this.f;
        return hashCode2 + (r9x0Var2 != null ? r9x0Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = x4e.m("CounterActionModel(formStateKey=", this.a, ", options=", ", defaultIndex=", this.b);
        smw0.t(this.c, ", metricaLabel=", this.d, ", actionOnIncrease=", m);
        m.append(this.e);
        m.append(", actionOnDecrease=");
        m.append(this.f);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
