package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v8q0 implements b151 {
    public final r9x0 a;
    public final r9x0 b;
    public final String c;
    public final Object d;
    public final x2s e;

    public v8q0(r9x0 r9x0Var, r9x0 r9x0Var2, String str, Object obj, x2s x2sVar) {
        this.a = r9x0Var;
        this.b = r9x0Var2;
        this.c = str;
        this.d = obj;
        this.e = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8q0)) {
            return false;
        }
        v8q0 v8q0Var = (v8q0) obj;
        return jl40.l(this.a, v8q0Var.a) && jl40.l(this.b, v8q0Var.b) && jl40.l(this.c, v8q0Var.c) && jl40.l(this.d, v8q0Var.d) && jl40.l(this.e, v8q0Var.e);
    }

    public final int hashCode() {
        r9x0 r9x0Var = this.a;
        int hashCode = (r9x0Var == null ? 0 : r9x0Var.hashCode()) * 31;
        r9x0 r9x0Var2 = this.b;
        int b = unr0.b((hashCode + (r9x0Var2 == null ? 0 : r9x0Var2.hashCode())) * 31, 31, this.c);
        Object obj = this.d;
        int hashCode2 = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        x2s x2sVar = this.e;
        return hashCode2 + (x2sVar != null ? x2sVar.hashCode() : 0);
    }

    public final String toString() {
        return "SegmentWidgetAction(selectionAction=" + this.a + ", prevAction=" + this.b + ", formStateKey=" + this.c + ", value=" + this.d + ", analyticsData=" + this.e + Extension.C_BRAKE;
    }
}
