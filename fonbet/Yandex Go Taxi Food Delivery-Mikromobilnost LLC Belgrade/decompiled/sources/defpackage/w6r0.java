package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class w6r0 extends s120 {
    public final g720 a;
    public final boolean b;
    public final String c = "Messaging.Arguments.Key.Settings";

    public w6r0(g720 g720Var, boolean z) {
        this.a = g720Var;
        this.b = z;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.c;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6r0)) {
            return false;
        }
        w6r0 w6r0Var = (w6r0) obj;
        return jl40.l(this.a, w6r0Var.a) && this.b == w6r0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SettingsArguments(source=" + this.a + ", invalidateUser=" + this.b + Extension.C_BRAKE;
    }
}
