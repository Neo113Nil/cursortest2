package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ti7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final zh7 d;
    public final boolean e;

    public ti7(boolean z, boolean z2, boolean z3, zh7 zh7Var, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = zh7Var;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti7)) {
            return false;
        }
        ti7 ti7Var = (ti7) obj;
        return this.a == ti7Var.a && this.b == ti7Var.b && this.c == ti7Var.c && jl40.l(this.d, ti7Var.d) && this.e == ti7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("CallListUiState(organizationsVisibility=", ", contactsButtonVisibility=", ", scheduleButtonEnabled=", this.a, this.b);
        u.append(this.c);
        u.append(", calls=");
        u.append(this.d);
        u.append(", isFabVisible=");
        return x4e.i(u, this.e, Extension.C_BRAKE);
    }

    public ti7() {
        this(0);
    }

    public /* synthetic */ ti7(int i) {
        this(false, false, true, yh7.a, true);
    }
}
