package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;

/* loaded from: classes10.dex */
public final class sej {
    public final boolean a;
    public final boolean b;
    public final SecureFlagPolicy c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public sej(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        secureFlagPolicy = (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy;
        z3 = (i & 8) != 0 ? true : z3;
        this.a = z;
        this.b = z2;
        this.c = secureFlagPolicy;
        this.d = z3;
        this.e = true;
        this.f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sej)) {
            return false;
        }
        sej sejVar = (sej) obj;
        return this.a == sejVar.a && this.b == sejVar.b && this.c == sejVar.c && this.d == sejVar.d && this.e == sejVar.e && this.g == sejVar.g;
    }

    public final int hashCode() {
        return (unr0.e(unr0.e((this.c.hashCode() + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }

    public sej() {
        this(false, false, null, false, 255);
    }

    public sej(int i) {
        this(true, true, SecureFlagPolicy.Inherit, (i & 4) != 0, 224);
    }
}
