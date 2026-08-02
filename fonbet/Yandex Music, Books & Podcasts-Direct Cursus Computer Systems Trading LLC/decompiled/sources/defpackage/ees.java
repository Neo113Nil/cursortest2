package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ees extends xci implements epf, ipa, ofp {
    public String o;
    public ges p;
    public ppc q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public a95 v;
    public HashMap w;
    public w5k x;
    public des y;
    public ces z;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // defpackage.epf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int E(twg twgVar, ffh ffhVar, int i) {
        w5k S0;
        ces cesVar = this.z;
        if (cesVar != null) {
            if (!cesVar.c) {
                cesVar = null;
            }
            if (cesVar != null) {
                S0 = cesVar.d;
            }
        }
        S0 = S0();
        S0.c(twgVar);
        return S0.a(i, twgVar.getLayoutDirection());
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // defpackage.epf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(twg twgVar, ffh ffhVar, int i) {
        w5k S0;
        ces cesVar = this.z;
        if (cesVar != null) {
            if (!cesVar.c) {
                cesVar = null;
            }
            if (cesVar != null) {
                S0 = cesVar.d;
            }
        }
        S0 = S0();
        S0.c(twgVar);
        return wxf.n(S0.d(twgVar.getLayoutDirection()).c());
    }

    public final w5k S0() {
        if (this.x == null) {
            this.x = new w5k(this.o, this.p, this.q, this.r, this.s, this.t, this.u);
        }
        w5k w5kVar = this.x;
        w5kVar.getClass();
        return w5kVar;
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        des desVar = this.y;
        if (desVar == null) {
            desVar = new des(this, 0);
            this.y = desVar;
        }
        wfp.u(jfpVar, new mn0(this.o));
        ces cesVar = this.z;
        if (cesVar != null) {
            boolean z = cesVar.c;
            xfp xfpVar = ufp.B;
            s9f[] s9fVarArr = wfp.a;
            s9f s9fVar = s9fVarArr[15];
            Boolean valueOf = Boolean.valueOf(z);
            xfpVar.getClass();
            jfpVar.o(xfpVar, valueOf);
            mn0 mn0Var = new mn0(cesVar.b);
            xfp xfpVar2 = ufp.A;
            s9f s9fVar2 = s9fVarArr[14];
            xfpVar2.getClass();
            jfpVar.o(xfpVar2, mn0Var);
        }
        jfpVar.o(hfp.k, new sa(null, new des(this, 1)));
        jfpVar.o(hfp.l, new sa(null, new des(this, 2)));
        jfpVar.o(hfp.m, new sa(null, new ncs(2, this)));
        wfp.d(jfpVar, desVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // defpackage.epf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(twg twgVar, ffh ffhVar, int i) {
        w5k S0;
        ces cesVar = this.z;
        if (cesVar != null) {
            if (!cesVar.c) {
                cesVar = null;
            }
            if (cesVar != null) {
                S0 = cesVar.d;
            }
        }
        S0 = S0();
        S0.c(twgVar);
        return wxf.n(S0.d(twgVar.getLayoutDirection()).b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0090, code lost:
    
        if (((defpackage.ads) r4.d).d != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017e  */
    @Override // defpackage.epf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        w5k S0;
        v5k v5kVar;
        long j2;
        boolean z;
        v5k v5kVar2;
        ces cesVar = this.z;
        if (cesVar != null) {
            if (!cesVar.c) {
                cesVar = null;
            }
            if (cesVar != null) {
                S0 = cesVar.d;
            }
        }
        S0 = S0();
        S0.c(mfhVar);
        xof layoutDirection = mfhVar.getLayoutDirection();
        long e = S0.g > 1 ? w5k.e(S0, j, layoutDirection) : j;
        ih0 ih0Var = S0.j;
        if (ih0Var != null && (v5kVar = S0.n) != null && !v5kVar.a() && layoutDirection == S0.o) {
            if (ga6.c(e, S0.p)) {
                j2 = 4294967295L;
            } else {
                j2 = 4294967295L;
                if (ga6.i(e) == ga6.i(S0.p)) {
                    if (ga6.k(e) == ga6.k(S0.p)) {
                        if (ga6.h(e) >= ih0Var.b()) {
                        }
                    }
                }
            }
            if (!ga6.c(e, S0.p)) {
                ih0 ih0Var2 = S0.j;
                ih0Var2.getClass();
                long d = ia6.d(e, (wxf.n(ih0Var2.b()) & j2) | (wxf.n(Math.min(((mh0) ih0Var2.c).i.c(), ih0Var2.d())) << 32));
                S0.l = d;
                S0.k = S0.d != 3 && (((float) ((int) (d >> 32))) < ih0Var2.d() || ((float) ((int) (d & j2))) < ih0Var2.b());
                S0.p = e;
            }
            z = false;
            v5kVar2 = S0.n;
            if (v5kVar2 != null) {
                v5kVar2.a();
            }
            ih0 ih0Var3 = S0.j;
            ih0Var3.getClass();
            ads adsVar = (ads) ih0Var3.d;
            long j3 = S0.l;
            if (z) {
                bcx.D(this, 2).i1();
                HashMap hashMap = this.w;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.w = hashMap;
                }
                hashMap.put(j40.a, Integer.valueOf(Math.round(adsVar.d(0))));
                hashMap.put(j40.b, Integer.valueOf(Math.round(adsVar.d(adsVar.g - 1))));
            }
            int i = (int) (j3 >> 32);
            int i2 = (int) (j3 & j2);
            ksk M = ffhVar.M(qld.A(i, i, i2, i2));
            HashMap hashMap2 = this.w;
            hashMap2.getClass();
            return mfhVar.w0(i, i2, hashMap2, new ai0(M, 18));
        }
        j2 = 4294967295L;
        v5k d2 = S0.d(layoutDirection);
        long s = q6k.s(d2.b(), S0.d, e, S0.e);
        boolean z2 = S0.e;
        int i3 = S0.d;
        int i4 = S0.f;
        ih0 ih0Var4 = new ih0((mh0) d2, ((z2 || !(i3 == 2 || i3 == 4 || i3 == 5)) && i4 >= 1) ? i4 : 1, i3, s);
        S0.p = e;
        long d3 = ia6.d(e, (wxf.n(ih0Var4.b()) & j2) | (wxf.n(ih0Var4.d()) << 32));
        S0.l = d3;
        S0.k = S0.d != 3 && (((float) ((int) (d3 >> 32))) < ih0Var4.d() || ((float) ((int) (d3 & j2))) < ih0Var4.b());
        S0.j = ih0Var4;
        z = true;
        v5kVar2 = S0.n;
        if (v5kVar2 != null) {
        }
        ih0 ih0Var32 = S0.j;
        ih0Var32.getClass();
        ads adsVar2 = (ads) ih0Var32.d;
        long j32 = S0.l;
        if (z) {
        }
        int i5 = (int) (j32 >> 32);
        int i22 = (int) (j32 & j2);
        ksk M2 = ffhVar.M(qld.A(i5, i5, i22, i22));
        HashMap hashMap22 = this.w;
        hashMap22.getClass();
        return mfhVar.w0(i5, i22, hashMap22, new ai0(M2, 18));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // defpackage.epf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        w5k S0;
        ces cesVar = this.z;
        if (cesVar != null) {
            if (!cesVar.c) {
                cesVar = null;
            }
            if (cesVar != null) {
                S0 = cesVar.d;
            }
        }
        S0 = S0();
        S0.c(twgVar);
        return S0.a(i, twgVar.getLayoutDirection());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // defpackage.ipa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(opf opfVar) {
        w5k S0;
        if (this.n) {
            ces cesVar = this.z;
            if (cesVar != null) {
                if (!cesVar.c) {
                    cesVar = null;
                }
                if (cesVar != null) {
                    S0 = cesVar.d;
                }
            }
            S0 = S0();
            ih0 ih0Var = S0.j;
            if (ih0Var == null) {
                vme.b("no paragraph (layoutCache=" + this.x + ", textSubstitution=" + this.z + ')');
                rj7.f();
                return;
            }
            mu3 s = opfVar.a.b.s();
            boolean z = S0.k;
            if (z) {
                long j = S0.l;
                s.r();
                s.i(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                c4r c4rVar = this.p.a;
                aas aasVar = c4rVar.m;
                if (aasVar == null) {
                    aasVar = aas.b;
                }
                aas aasVar2 = aasVar;
                otp otpVar = c4rVar.n;
                if (otpVar == null) {
                    otpVar = otp.d;
                }
                otp otpVar2 = otpVar;
                kpa kpaVar = c4rVar.p;
                if (kpaVar == null) {
                    kpaVar = dbc.a;
                }
                kpa kpaVar2 = kpaVar;
                ai3 c = c4rVar.a.c();
                if (c != null) {
                    ih0Var.g(s, c, this.p.a.a.b(), otpVar2, aasVar2, kpaVar2);
                } else {
                    a95 a95Var = this.v;
                    long a = a95Var != null ? a95Var.a() : d85.n;
                    if (a == 16) {
                        a = this.p.c() != 16 ? this.p.c() : d85.b;
                    }
                    ih0Var.f(s, a, otpVar2, aasVar2, kpaVar2, 3);
                }
                if (z) {
                    s.k();
                }
            } catch (Throwable th) {
                if (z) {
                    s.k();
                }
                throw th;
            }
        }
    }
}
