package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x9x0 implements b151 {
    public final r9x0 a;
    public final String b;
    public final Object c;
    public final x2s d;

    public /* synthetic */ x9x0(r9x0 r9x0Var, String str, Object obj, x2s x2sVar, int i) {
        this((i & 1) != 0 ? null : r9x0Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : x2sVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9x0)) {
            return false;
        }
        x9x0 x9x0Var = (x9x0) obj;
        return jl40.l(this.a, x9x0Var.a) && jl40.l(this.b, x9x0Var.b) && jl40.l(this.c, x9x0Var.c) && jl40.l(this.d, x9x0Var.d);
    }

    public final int hashCode() {
        r9x0 r9x0Var = this.a;
        int hashCode = (r9x0Var == null ? 0 : r9x0Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.c;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        x2s x2sVar = this.d;
        return hashCode3 + (x2sVar != null ? x2sVar.hashCode() : 0);
    }

    public final String toString() {
        return "TapWidgetAction(action=" + this.a + ", formStateKey=" + this.b + ", value=" + this.c + ", analyticsData=" + this.d + Extension.C_BRAKE;
    }

    public x9x0(r9x0 r9x0Var, String str, Object obj, x2s x2sVar) {
        this.a = r9x0Var;
        this.b = str;
        this.c = obj;
        this.d = x2sVar;
    }

    public x9x0() {
        this(null, null, null, null, 15);
    }
}
