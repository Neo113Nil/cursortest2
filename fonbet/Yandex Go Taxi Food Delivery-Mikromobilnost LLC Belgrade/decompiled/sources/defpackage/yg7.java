package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class yg7 {
    public static final xg7 Companion = new xg7();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ yg7(int i, boolean z, boolean z2, boolean z3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, wg7.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg7)) {
            return false;
        }
        yg7 yg7Var = (yg7) obj;
        return this.a == yg7Var.a && this.b == yg7Var.b && this.c == yg7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("CallExperimentsArgs(isRegsConnectionRetryEnabled=", ", isHangupConfirmationEnabled=", ", isVoipCallUiRedesignEnabled=", this.a, this.b), this.c, Extension.C_BRAKE);
    }

    public yg7(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
