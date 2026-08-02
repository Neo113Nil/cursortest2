package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class re10 {
    public static final re10 B = new re10(new qe10());
    public final ImmutableList A;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final Integer z;

    static {
        x4e.x(0, 1, 2, 3, 4);
        x4e.x(5, 6, 8, 9, 10);
        x4e.x(11, 12, 13, 14, 15);
        x4e.x(16, 17, 18, 19, 20);
        x4e.x(21, 22, 23, 24, 25);
        x4e.x(26, 27, 28, 29, 30);
        x4e.x(31, 32, 33, 34, 1000);
    }

    public re10(qe10 qe10Var) {
        Boolean bool = qe10Var.k;
        Integer num = qe10Var.j;
        Integer num2 = qe10Var.y;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.a = qe10Var.a;
        this.b = qe10Var.b;
        this.c = qe10Var.c;
        this.d = qe10Var.d;
        this.e = qe10Var.e;
        this.f = qe10Var.f;
        this.g = qe10Var.g;
        this.h = qe10Var.h;
        this.i = qe10Var.i;
        this.j = num;
        this.k = bool;
        Integer num3 = qe10Var.l;
        this.l = num3;
        this.m = num3;
        this.n = qe10Var.m;
        this.o = qe10Var.n;
        this.p = qe10Var.o;
        this.q = qe10Var.p;
        this.r = qe10Var.q;
        this.s = qe10Var.r;
        this.t = qe10Var.s;
        this.u = qe10Var.t;
        this.v = qe10Var.u;
        this.w = qe10Var.v;
        this.x = qe10Var.w;
        this.y = qe10Var.x;
        this.z = num2;
        this.A = qe10Var.z;
    }

    public final qe10 a() {
        qe10 qe10Var = new qe10();
        qe10Var.a = this.a;
        qe10Var.b = this.b;
        qe10Var.c = this.c;
        qe10Var.d = this.d;
        qe10Var.e = this.e;
        qe10Var.f = this.f;
        qe10Var.g = this.g;
        qe10Var.h = this.h;
        qe10Var.i = this.i;
        qe10Var.j = this.j;
        qe10Var.k = this.k;
        qe10Var.l = this.m;
        qe10Var.m = this.n;
        qe10Var.n = this.o;
        qe10Var.o = this.p;
        qe10Var.p = this.q;
        qe10Var.q = this.r;
        qe10Var.r = this.s;
        qe10Var.s = this.t;
        qe10Var.t = this.u;
        qe10Var.u = this.v;
        qe10Var.v = this.w;
        qe10Var.w = this.x;
        qe10Var.x = this.y;
        qe10Var.y = this.z;
        qe10Var.z = this.A;
        return qe10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || re10.class != obj.getClass()) {
            return false;
        }
        re10 re10Var = (re10) obj;
        return Objects.equals(this.a, re10Var.a) && Objects.equals(this.b, re10Var.b) && Objects.equals(this.c, re10Var.c) && Objects.equals(this.d, re10Var.d) && Objects.equals(this.e, re10Var.e) && Arrays.equals(this.f, re10Var.f) && Objects.equals(this.g, re10Var.g) && Objects.equals(this.h, re10Var.h) && Objects.equals(this.i, re10Var.i) && Objects.equals(this.j, re10Var.j) && Objects.equals(this.k, re10Var.k) && Objects.equals(this.m, re10Var.m) && Objects.equals(this.n, re10Var.n) && Objects.equals(this.o, re10Var.o) && Objects.equals(this.p, re10Var.p) && Objects.equals(this.q, re10Var.q) && Objects.equals(this.r, re10Var.r) && Objects.equals(this.s, re10Var.s) && Objects.equals(this.t, re10Var.t) && Objects.equals(this.u, re10Var.u) && Objects.equals(this.v, re10Var.v) && Objects.equals(this.w, re10Var.w) && Objects.equals(this.x, re10Var.x) && Objects.equals(this.y, re10Var.y) && Objects.equals(this.z, re10Var.z) && Objects.equals(this.A, re10Var.A);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, true, this.A);
    }
}
