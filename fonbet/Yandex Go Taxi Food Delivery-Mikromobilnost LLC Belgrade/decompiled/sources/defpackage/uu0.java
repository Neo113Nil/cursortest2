package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uu0 implements vu0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public uu0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu0)) {
            return false;
        }
        uu0 uu0Var = (uu0) obj;
        return jl40.l(this.a, uu0Var.a) && jl40.l(this.b, uu0Var.b) && jl40.l(this.c, uu0Var.c) && this.d == uu0Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return nnm.i(this.c, ", enableMapSelection=", Extension.C_BRAKE, b64.v("Suggest(currentMode=", this.a, ", selectedClass=", this.b, ", hint="), this.d);
    }

    public /* synthetic */ uu0(int i) {
        this(null, null, null, true);
    }

    public uu0() {
        this(0);
    }
}
