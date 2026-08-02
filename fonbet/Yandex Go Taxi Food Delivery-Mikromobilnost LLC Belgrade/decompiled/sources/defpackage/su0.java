package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class su0 implements vu0 {
    public final String a;
    public final String b;
    public final boolean c;

    public su0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su0)) {
            return false;
        }
        su0 su0Var = (su0) obj;
        return jl40.l(this.a, su0Var.a) && jl40.l(this.b, su0Var.b) && this.c == su0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("PickupPoint(tariffClass=", this.a, ", currentMode=", this.b, ", enabledCourierFlow="), this.c, Extension.C_BRAKE);
    }
}
