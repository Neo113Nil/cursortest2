package defpackage;

import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes9.dex */
public final class um3 {
    public final Events$Zalogin$LoginContext a;
    public final nk3 b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ um3(Events$Zalogin$LoginContext events$Zalogin$LoginContext, nk3 nk3Var, boolean z, boolean z2, int i) {
        this(events$Zalogin$LoginContext, (i & 2) != 0 ? nk3.a : nk3Var, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }

    public static um3 a(um3 um3Var, Events$Zalogin$LoginContext events$Zalogin$LoginContext, nk3 nk3Var, int i) {
        if ((i & 1) != 0) {
            events$Zalogin$LoginContext = um3Var.a;
        }
        if ((i & 2) != 0) {
            nk3Var = um3Var.b;
        }
        boolean z = um3Var.c;
        boolean z2 = um3Var.d;
        um3Var.getClass();
        um3Var.getClass();
        return new um3(events$Zalogin$LoginContext, nk3Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um3)) {
            return false;
        }
        um3 um3Var = (um3) obj;
        return this.a == um3Var.a && jl40.l(this.b, um3Var.b) && this.c == um3Var.c && this.d == um3Var.d;
    }

    public final int hashCode() {
        return unr0.e(unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationConfig(loginContext=");
        sb.append(this.a);
        sb.append(", authResultListener=");
        sb.append(this.b);
        sb.append(", needLaunchRequestAfterAuth=");
        return smw0.k(", hideBackButton=", ", origin=null)", sb, this.c, this.d);
    }

    public um3(Events$Zalogin$LoginContext events$Zalogin$LoginContext, nk3 nk3Var, boolean z, boolean z2) {
        this.a = events$Zalogin$LoginContext;
        this.b = nk3Var;
        this.c = z;
        this.d = z2;
    }
}
