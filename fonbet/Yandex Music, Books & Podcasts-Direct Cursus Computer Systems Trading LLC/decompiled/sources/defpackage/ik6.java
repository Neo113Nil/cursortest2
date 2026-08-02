package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ik6 implements ttf {
    public final hk6 a;
    public final sk6 b;

    public ik6(hk6 hk6Var, sk6 sk6Var) {
        hk6Var.getClass();
        this.a = hk6Var;
        this.b = sk6Var;
    }

    @Override // defpackage.ttf
    public final int a() {
        return this.a.G().b;
    }

    @Override // defpackage.ttf
    public final void b(int i, Object obj, hq5 hq5Var, int i2) {
        obj.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2072604499);
        int i3 = (oq5Var.d(i) ? 4 : 2) | i2 | (oq5Var.h(obj) ? 32 : 16) | (oq5Var.f(this) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else if (!(obj instanceof geh)) {
            xq0.x("Invalid key type");
            return;
        } else {
            dxe z = this.a.k.z(i);
            int i4 = z.a;
            ((gk6) z.c).c.invoke(obj, oq5Var, Integer.valueOf((i3 >> 3) & 14));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(this, i, obj, i2);
        }
    }

    @Override // defpackage.ttf
    public final int d(Object obj) {
        obj.getClass();
        if (obj instanceof geh) {
            return this.b.a((geh) obj);
        }
        xq0.x("Invalid key type");
        return 0;
    }

    @Override // defpackage.ttf
    public final Object e(int i) {
        return (geh) uah.c(Integer.valueOf(i), this.b.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik6)) {
            return false;
        }
        return Intrinsics.d(this.a, ((ik6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
