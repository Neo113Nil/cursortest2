package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tli0 {
    public final String a;
    public final boolean b;
    public final Expansion c;
    public final String d;
    public final Map e;
    public final apf f;
    public final boolean g;
    public final ynv0 h;

    public /* synthetic */ tli0(String str, boolean z, Expansion expansion, String str2, boolean z2, ynv0 ynv0Var, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? Expansion.ANCHORED : expansion, (i & 8) != 0 ? null : str2, b.f(), null, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : ynv0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tli0)) {
            return false;
        }
        tli0 tli0Var = (tli0) obj;
        return jl40.l(this.a, tli0Var.a) && this.b == tli0Var.b && this.c == tli0Var.c && jl40.l(this.d, tli0Var.d) && jl40.l(this.e, tli0Var.e) && jl40.l(this.f, tli0Var.f) && this.g == tli0Var.g && jl40.l(this.h, tli0Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31;
        String str2 = this.d;
        int d = unr0.d((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        apf apfVar = this.f;
        int e = unr0.e((d + (apfVar == null ? 0 : apfVar.hashCode())) * 31, 31, this.g);
        ynv0 ynv0Var = this.h;
        return e + (ynv0Var != null ? ynv0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("RedirectOptions(vertical=", this.a, ", verticalTrap=", ", expansion=", this.b);
        l.append(this.c);
        l.append(", tariff=");
        l.append(this.d);
        l.append(", requirements=");
        l.append(this.e);
        l.append(", destination=");
        l.append(this.f);
        l.append(", isPaymentChange=");
        l.append(this.g);
        l.append(", origin=");
        l.append(this.h);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public tli0(String str, boolean z, Expansion expansion, String str2, Map map, apf apfVar, boolean z2, ynv0 ynv0Var) {
        this.a = str;
        this.b = z;
        this.c = expansion;
        this.d = str2;
        this.e = map;
        this.f = apfVar;
        this.g = z2;
        this.h = ynv0Var;
    }

    public tli0() {
        this(null, false, null, null, false, null, 255);
    }
}
