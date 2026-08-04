package com.gamericefishpro.space.d4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public int a;
    public int b;
    public int c = 0;
    public Object d;

    public z(o0 o0Var) {
        Charset charset = com.gamericefishpro.space.q4.u.a;
        this.d = o0Var;
        o0Var.e = this;
    }

    public boolean A() {
        int i;
        o0 o0Var = (o0) this.d;
        if (o0Var.c() || (i = this.a) == this.b) {
            return false;
        }
        return o0Var.C(i);
    }

    public void a(com.gamericefishpro.space.u5.f fVar) {
        Object[] objArr = (Object[]) this.d;
        int i = this.b;
        objArr[i] = fVar;
        int i2 = this.c & (i + 1);
        this.b = i2;
        int i3 = this.a;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i5];
            com.gamericefishpro.space.ph.u.d(0, i3, length, objArr, objArr2);
            com.gamericefishpro.space.ph.u.d(i4, 0, this.a, (Object[]) this.d, objArr2);
            this.d = objArr2;
            this.a = 0;
            this.b = length;
            this.c = i5 - 1;
        }
    }

    public int b() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            this.a = ((o0) this.d).z();
        }
        int i2 = this.a;
        if (i2 == 0 || i2 == this.b) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public int c(int i) {
        return ((com.gamericefishpro.space.u0.l0) this.d).e[this.b + i];
    }

    public Object d(int i) {
        return ((com.gamericefishpro.space.u0.l0) this.d).g[this.c + i];
    }

    public void e(Object obj, com.gamericefishpro.space.q4.t0 t0Var, com.gamericefishpro.space.q4.k kVar) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            t0Var.g(obj, this, kVar);
            if (this.a != this.b) {
                throw new com.gamericefishpro.space.q4.w("Failed to parse the message.");
            }
            this.b = i;
        } catch (Throwable th) {
            this.b = i;
            throw th;
        }
    }

    public void f(Object obj, com.gamericefishpro.space.q4.t0 t0Var, com.gamericefishpro.space.q4.k kVar) throws com.gamericefishpro.space.q4.w {
        o0 o0Var = (o0) this.d;
        int iA = o0Var.A();
        if (o0Var.d >= 100) {
            throw new com.gamericefishpro.space.q4.w("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = o0Var.i(iA);
        o0Var.d++;
        t0Var.g(obj, this, kVar);
        o0Var.a(0);
        o0Var.d--;
        o0Var.h(i);
    }

    public void g(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Boolean.valueOf(o0Var.j()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iB = o0Var.b() + o0Var.A();
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Boolean.valueOf(o0Var.j()));
        } while (o0Var.b() < iB);
        y(iB);
    }

    public com.gamericefishpro.space.q4.f h() throws com.gamericefishpro.space.q4.v {
        z(2);
        return ((o0) this.d).k();
    }

    public void i(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.v {
        int iZ;
        o0 o0Var = (o0) this.d;
        if ((this.a & 7) != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(h());
            if (o0Var.c()) {
                return;
            } else {
                iZ = o0Var.z();
            }
        } while (iZ == this.a);
        this.c = iZ;
    }

    public void j(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Double.valueOf(o0Var.m()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iA = o0Var.A();
        if ((iA & 7) != 0) {
            throw new com.gamericefishpro.space.q4.w("Failed to parse the message.");
        }
        int iB = o0Var.b() + iA;
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Double.valueOf(o0Var.m()));
        } while (o0Var.b() < iB);
    }

    public void k(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.n()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iB = o0Var.b() + o0Var.A();
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.n()));
        } while (o0Var.b() < iB);
        y(iB);
    }

    public Object l(com.gamericefishpro.space.q4.m1 m1Var, Class cls, com.gamericefishpro.space.q4.k kVar) throws com.gamericefishpro.space.q4.w {
        o0 o0Var = (o0) this.d;
        switch (m1Var.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z(1);
                return Double.valueOf(o0Var.m());
            case 1:
                z(5);
                return Float.valueOf(o0Var.q());
            case 2:
                z(0);
                return Long.valueOf(o0Var.s());
            case 3:
                z(0);
                return Long.valueOf(o0Var.B());
            case 4:
                z(0);
                return Integer.valueOf(o0Var.r());
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                z(1);
                return Long.valueOf(o0Var.p());
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                z(5);
                return Integer.valueOf(o0Var.o());
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                z(0);
                return Boolean.valueOf(o0Var.j());
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                z(2);
                return o0Var.y();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                z(2);
                com.gamericefishpro.space.q4.t0 t0VarA = com.gamericefishpro.space.q4.q0.c.a(cls);
                com.gamericefishpro.space.q4.s sVarH = t0VarA.h();
                f(sVarH, t0VarA, kVar);
                t0VarA.c(sVarH);
                return sVarH;
            case RequestError.STOP_TRACKING /* 11 */:
                return h();
            case 12:
                z(0);
                return Integer.valueOf(o0Var.A());
            case 13:
                z(0);
                return Integer.valueOf(o0Var.n());
            case 14:
                z(5);
                return Integer.valueOf(o0Var.t());
            case 15:
                z(1);
                return Long.valueOf(o0Var.u());
            case 16:
                z(0);
                return Integer.valueOf(o0Var.v());
            case 17:
                z(0);
                return Long.valueOf(o0Var.w());
        }
    }

    public void m(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iA = o0Var.A();
            if ((iA & 3) != 0) {
                throw new com.gamericefishpro.space.q4.w("Failed to parse the message.");
            }
            int iB = o0Var.b() + iA;
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.o()));
            } while (o0Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.o()));
            if (o0Var.c()) {
                return;
            } else {
                iZ = o0Var.z();
            }
        } while (iZ == this.a);
        this.c = iZ;
    }

    public void n(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.p()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iA = o0Var.A();
        if ((iA & 7) != 0) {
            throw new com.gamericefishpro.space.q4.w("Failed to parse the message.");
        }
        int iB = o0Var.b() + iA;
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.p()));
        } while (o0Var.b() < iB);
    }

    public void o(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iA = o0Var.A();
            if ((iA & 3) != 0) {
                throw new com.gamericefishpro.space.q4.w("Failed to parse the message.");
            }
            int iB = o0Var.b() + iA;
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Float.valueOf(o0Var.q()));
            } while (o0Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Float.valueOf(o0Var.q()));
            if (o0Var.c()) {
                return;
            } else {
                iZ = o0Var.z();
            }
        } while (iZ == this.a);
        this.c = iZ;
    }

    public void p(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.r()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iB = o0Var.b() + o0Var.A();
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.r()));
        } while (o0Var.b() < iB);
        y(iB);
    }

    public void q(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.s()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iB = o0Var.b() + o0Var.A();
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.s()));
        } while (o0Var.b() < iB);
        y(iB);
    }

    public void r(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iA = o0Var.A();
            if ((iA & 3) != 0) {
                throw new com.gamericefishpro.space.q4.w("Failed to parse the message.");
            }
            int iB = o0Var.b() + iA;
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.t()));
            } while (o0Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.t()));
            if (o0Var.c()) {
                return;
            } else {
                iZ = o0Var.z();
            }
        } while (iZ == this.a);
        this.c = iZ;
    }

    public void s(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.u()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iA = o0Var.A();
        if ((iA & 7) != 0) {
            throw new com.gamericefishpro.space.q4.w("Failed to parse the message.");
        }
        int iB = o0Var.b() + iA;
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.u()));
        } while (o0Var.b() < iB);
    }

    public void t(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.v()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iB = o0Var.b() + o0Var.A();
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.v()));
        } while (o0Var.b() < iB);
        y(iB);
    }

    public void u(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.w()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iB = o0Var.b() + o0Var.A();
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.w()));
        } while (o0Var.b() < iB);
        y(iB);
    }

    public void v(com.gamericefishpro.space.q4.t tVar, boolean z) throws com.gamericefishpro.space.q4.v {
        String strX;
        int iZ;
        o0 o0Var = (o0) this.d;
        if ((this.a & 7) != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        do {
            if (z) {
                z(2);
                strX = o0Var.y();
            } else {
                z(2);
                strX = o0Var.x();
            }
            ((com.gamericefishpro.space.q4.r0) tVar).add(strX);
            if (o0Var.c()) {
                return;
            } else {
                iZ = o0Var.z();
            }
        } while (iZ == this.a);
        this.c = iZ;
    }

    public void w(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.A()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iB = o0Var.b() + o0Var.A();
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Integer.valueOf(o0Var.A()));
        } while (o0Var.b() < iB);
        y(iB);
    }

    public void x(com.gamericefishpro.space.q4.t tVar) throws com.gamericefishpro.space.q4.w {
        int iZ;
        o0 o0Var = (o0) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.B()));
                if (o0Var.c()) {
                    return;
                } else {
                    iZ = o0Var.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i != 2) {
            throw com.gamericefishpro.space.q4.w.b();
        }
        int iB = o0Var.b() + o0Var.A();
        do {
            ((com.gamericefishpro.space.q4.r0) tVar).add(Long.valueOf(o0Var.B()));
        } while (o0Var.b() < iB);
        y(iB);
    }

    public void y(int i) throws com.gamericefishpro.space.q4.w {
        if (((o0) this.d).b() != i) {
            throw com.gamericefishpro.space.q4.w.e();
        }
    }

    public void z(int i) throws com.gamericefishpro.space.q4.v {
        if ((this.a & 7) != i) {
            throw com.gamericefishpro.space.q4.w.b();
        }
    }
}
