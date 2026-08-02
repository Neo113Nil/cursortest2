package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class yxc0 {
    public final Object a;
    public final int b;
    public final fe10 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        x4e.x(0, 1, 2, 3, 4);
        tw21.Q(5);
        tw21.Q(6);
    }

    public yxc0(Object obj, int i, fe10 fe10Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = fe10Var;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yxc0.class == obj.getClass()) {
            yxc0 yxc0Var = (yxc0) obj;
            if (this.b == yxc0Var.b && this.e == yxc0Var.e && this.f == yxc0Var.f && this.g == yxc0Var.g && this.h == yxc0Var.h && this.i == yxc0Var.i && Objects.equals(this.c, yxc0Var.c) && Objects.equals(this.a, yxc0Var.a) && Objects.equals(this.d, yxc0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }
}
