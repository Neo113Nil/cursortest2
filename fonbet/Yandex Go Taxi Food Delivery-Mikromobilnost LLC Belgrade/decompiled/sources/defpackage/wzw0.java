package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wzw0 implements b151 {
    public final boolean a;
    public final r9x0 b;
    public final r9x0 c;
    public final String d;
    public final Object e;
    public final x2s f;

    public wzw0(boolean z, r9x0 r9x0Var, r9x0 r9x0Var2, String str, Object obj, x2s x2sVar) {
        this.a = z;
        this.b = r9x0Var;
        this.c = r9x0Var2;
        this.d = str;
        this.e = obj;
        this.f = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzw0)) {
            return false;
        }
        wzw0 wzw0Var = (wzw0) obj;
        return this.a == wzw0Var.a && jl40.l(this.b, wzw0Var.b) && jl40.l(this.c, wzw0Var.c) && jl40.l(this.d, wzw0Var.d) && jl40.l(this.e, wzw0Var.e) && this.f.equals(wzw0Var.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        r9x0 r9x0Var = this.b;
        int hashCode2 = (hashCode + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        r9x0 r9x0Var2 = this.c;
        int b = unr0.b((hashCode2 + (r9x0Var2 == null ? 0 : r9x0Var2.hashCode())) * 31, 31, this.d);
        Object obj = this.e;
        return this.f.hashCode() + ((b + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SwitchWidgetAction(isChecked=" + this.a + ", actionOnSelect=" + this.b + ", actionOnUnselect=" + this.c + ", formStateKey=" + this.d + ", value=" + this.e + ", analyticsData=" + this.f + Extension.C_BRAKE;
    }
}
