package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yv9 implements dw9 {
    public final String a;
    public final CharSequence b;
    public final List c;
    public final uo9 d;
    public final vv9 e;
    public final ir9 f;
    public final ArrayList g;

    public yv9(String str, CharSequence charSequence, List list, uo9 uo9Var, vv9 vv9Var, ir9 ir9Var) {
        this.a = str;
        this.b = charSequence;
        this.c = list;
        this.d = uo9Var;
        this.e = vv9Var;
        this.f = ir9Var;
        List<wv9> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (wv9 wv9Var : list2) {
            String name = wv9Var.a.name();
            arrayList.add(new nwa(wv9Var.d, wv9Var.b, name));
        }
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv9)) {
            return false;
        }
        yv9 yv9Var = (yv9) obj;
        return this.a.equals(yv9Var.a) && jl40.l(this.b, yv9Var.b) && jl40.l(this.c, yv9Var.c) && jl40.l(this.d, yv9Var.d) && jl40.l(this.e, yv9Var.e) && jl40.l(this.f, yv9Var.f);
    }

    public final int hashCode() {
        int c = unr0.c(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        uo9 uo9Var = this.d;
        int hashCode = (c + (uo9Var == null ? 0 : uo9Var.hashCode())) * 31;
        vv9 vv9Var = this.e;
        int hashCode2 = (hashCode + (vv9Var == null ? 0 : vv9Var.hashCode())) * 31;
        ir9 ir9Var = this.f;
        return hashCode2 + (ir9Var != null ? ir9Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Content(traceId=", this.a, ", header=", ", tabs=");
        t.append(this.c);
        t.append(", button=");
        t.append(this.d);
        t.append(", notification=");
        t.append(this.e);
        t.append(", defaultDiscount=");
        t.append(this.f);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
