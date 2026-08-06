package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class s81 implements defpackage.k8, defpackage.it1 {
    public static final defpackage.rg1 e6mdH7fiFuta = new defpackage.rg1();
    public java.lang.Object P05cfTpS5W5L;
    public java.lang.Object QiMR8OkAhezm;
    public java.lang.Object WDYagTQQm9ns;
    public java.lang.Object oh71FJcDz6S2;

    public s81(android.graphics.Typeface typeface, defpackage.kl0 kl0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.P05cfTpS5W5L = typeface;
        this.WDYagTQQm9ns = kl0Var;
        this.QiMR8OkAhezm = new defpackage.ll0(1024);
        int ZpBGe2uQfcn8 = kl0Var.ZpBGe2uQfcn8(6);
        if (ZpBGe2uQfcn8 != 0) {
            int i5 = ZpBGe2uQfcn8 + kl0Var.WDYagTQQm9ns;
            i = ((java.nio.ByteBuffer) kl0Var.P05cfTpS5W5L).getInt(((java.nio.ByteBuffer) kl0Var.P05cfTpS5W5L).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.oh71FJcDz6S2 = new char[i * 2];
        int ZpBGe2uQfcn82 = kl0Var.ZpBGe2uQfcn8(6);
        if (ZpBGe2uQfcn82 != 0) {
            int i6 = ZpBGe2uQfcn82 + kl0Var.WDYagTQQm9ns;
            i2 = ((java.nio.ByteBuffer) kl0Var.P05cfTpS5W5L).getInt(((java.nio.ByteBuffer) kl0Var.P05cfTpS5W5L).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            defpackage.zq1 zq1Var = new defpackage.zq1(this, i7);
            defpackage.jl0 giKS3J6vZuNy = zq1Var.giKS3J6vZuNy();
            int ZpBGe2uQfcn83 = giKS3J6vZuNy.ZpBGe2uQfcn8(4);
            java.lang.Character.toChars(ZpBGe2uQfcn83 != 0 ? ((java.nio.ByteBuffer) giKS3J6vZuNy.P05cfTpS5W5L).getInt(ZpBGe2uQfcn83 + giKS3J6vZuNy.WDYagTQQm9ns) : 0, (char[]) this.oh71FJcDz6S2, i7 * 2);
            defpackage.jl0 giKS3J6vZuNy2 = zq1Var.giKS3J6vZuNy();
            int ZpBGe2uQfcn84 = giKS3J6vZuNy2.ZpBGe2uQfcn8(16);
            if (ZpBGe2uQfcn84 != 0) {
                int i8 = ZpBGe2uQfcn84 + giKS3J6vZuNy2.WDYagTQQm9ns;
                i3 = ((java.nio.ByteBuffer) giKS3J6vZuNy2.P05cfTpS5W5L).getInt(((java.nio.ByteBuffer) giKS3J6vZuNy2.P05cfTpS5W5L).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                defpackage.h7.w7APNrr0aGRc("invalid metadata codepoint length");
                throw null;
            }
            defpackage.ll0 ll0Var = (defpackage.ll0) this.QiMR8OkAhezm;
            defpackage.jl0 giKS3J6vZuNy3 = zq1Var.giKS3J6vZuNy();
            int ZpBGe2uQfcn85 = giKS3J6vZuNy3.ZpBGe2uQfcn8(16);
            if (ZpBGe2uQfcn85 != 0) {
                int i9 = ZpBGe2uQfcn85 + giKS3J6vZuNy3.WDYagTQQm9ns;
                i4 = ((java.nio.ByteBuffer) giKS3J6vZuNy3.P05cfTpS5W5L).getInt(((java.nio.ByteBuffer) giKS3J6vZuNy3.P05cfTpS5W5L).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            ll0Var.ZpBGe2uQfcn8(zq1Var, 0, i4 - 1);
        }
    }

    public static void fWTAfUmVKrZq(defpackage.s81 s81Var, defpackage.rq0 rq0Var) {
        s81Var.getClass();
        rq0Var.getClass();
        if (((java.util.LinkedHashSet) s81Var.QiMR8OkAhezm).add(rq0Var)) {
            defpackage.uq0 uq0Var = (defpackage.uq0) s81Var.oh71FJcDz6S2;
            uq0Var.getClass();
            if (rq0Var.fWTAfUmVKrZq != null) {
                defpackage.p81.JhCgjQRTAOCT("Handler '", rq0Var, "' is already registered with a dispatcher");
                return;
            }
            uq0Var.WDYagTQQm9ns.addFirst(rq0Var);
            rq0Var.fWTAfUmVKrZq = s81Var;
            uq0Var.giKS3J6vZuNy();
        }
    }

    public defpackage.sm GE9mJIPrb8gP() {
        defpackage.sm smVar = (defpackage.sm) ((defpackage.n10) this.QiMR8OkAhezm).ZpBGe2uQfcn8();
        if (smVar != null) {
            return smVar;
        }
        defpackage.h7.P05cfTpS5W5L("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public void JhCgjQRTAOCT(defpackage.tq0 tq0Var) {
        if (((java.util.LinkedHashSet) this.P05cfTpS5W5L).add(tq0Var)) {
            ((defpackage.uq0) this.oh71FJcDz6S2).ZpBGe2uQfcn8(this, tq0Var, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object P05cfTpS5W5L(long j, long j2, defpackage.ll llVar) {
        defpackage.dr0 dr0Var;
        int i;
        long j3;
        if (llVar instanceof defpackage.dr0) {
            dr0Var = (defpackage.dr0) llVar;
            int i2 = dr0Var.GE9mJIPrb8gP;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dr0Var.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                defpackage.dr0 dr0Var2 = dr0Var;
                java.lang.Object obj = dr0Var2.P05cfTpS5W5L;
                i = dr0Var2.GE9mJIPrb8gP;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.hr0 hr0Var = (defpackage.hr0) this.WDYagTQQm9ns;
                    defpackage.hr0 xbkEJUK1coRZ = hr0Var != null ? hr0Var.xbkEJUK1coRZ() : null;
                    j3 = 0;
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (xbkEJUK1coRZ == null) {
                        defpackage.hr0 hr0Var2 = (defpackage.hr0) this.oh71FJcDz6S2;
                        if (hr0Var2 != null) {
                            dr0Var2.GE9mJIPrb8gP = 1;
                            obj = hr0Var2.I9id0xDxCgYV(j, j2, dr0Var2);
                        }
                    } else {
                        defpackage.hr0 hr0Var3 = (defpackage.hr0) this.WDYagTQQm9ns;
                        defpackage.hr0 xbkEJUK1coRZ2 = hr0Var3 != null ? hr0Var3.xbkEJUK1coRZ() : null;
                        if (xbkEJUK1coRZ2 != null) {
                            dr0Var2.GE9mJIPrb8gP = 2;
                            obj = xbkEJUK1coRZ2.I9id0xDxCgYV(j, j2, dr0Var2);
                        }
                    }
                } else if (i == 1) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    j3 = ((defpackage.jt1) obj).ZpBGe2uQfcn8;
                } else {
                    if (i != 2) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    j3 = ((defpackage.jt1) obj).ZpBGe2uQfcn8;
                }
                return new defpackage.jt1(j3);
            }
        }
        dr0Var = new defpackage.dr0(this, llVar);
        defpackage.dr0 dr0Var22 = dr0Var;
        java.lang.Object obj2 = dr0Var22.P05cfTpS5W5L;
        i = dr0Var22.GE9mJIPrb8gP;
        if (i != 0) {
        }
        return new defpackage.jt1(j3);
    }

    public void QiMR8OkAhezm(defpackage.tq0 tq0Var, defpackage.pq0 pq0Var) {
        defpackage.uq0 uq0Var = (defpackage.uq0) this.oh71FJcDz6S2;
        uq0Var.getClass();
        if (uq0Var.QiMR8OkAhezm != 0) {
            return;
        }
        defpackage.rq0 fWTAfUmVKrZq = uq0Var.fWTAfUmVKrZq(-1);
        uq0Var.oh71FJcDz6S2 = fWTAfUmVKrZq;
        uq0Var.QiMR8OkAhezm = -1;
        uq0Var.P05cfTpS5W5L = tq0Var;
        if (pq0Var != null) {
            if (fWTAfUmVKrZq != null) {
                fWTAfUmVKrZq.JhCgjQRTAOCT(pq0Var);
            }
            defpackage.gg1 gg1Var = uq0Var.ZpBGe2uQfcn8;
            defpackage.wq0 wq0Var = new defpackage.wq0(pq0Var);
            gg1Var.getClass();
            gg1Var.GE9mJIPrb8gP(null, wq0Var);
        }
    }

    @Override // defpackage.ft1
    public defpackage.g6 T1fB7bDYiVJQ(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        if (((defpackage.g6) this.oh71FJcDz6S2) == null) {
            this.oh71FJcDz6S2 = g6Var.fWTAfUmVKrZq();
        }
        defpackage.g6 g6Var4 = (defpackage.g6) this.oh71FJcDz6S2;
        if (g6Var4 == null) {
            defpackage.ma0.hH0RRJrNssvh("valueVector");
            throw null;
        }
        int giKS3J6vZuNy = g6Var4.giKS3J6vZuNy();
        int i = 0;
        while (true) {
            defpackage.g6 g6Var5 = (defpackage.g6) this.oh71FJcDz6S2;
            if (i >= giKS3J6vZuNy) {
                if (g6Var5 != null) {
                    return g6Var5;
                }
                defpackage.ma0.hH0RRJrNssvh("valueVector");
                throw null;
            }
            if (g6Var5 == null) {
                defpackage.ma0.hH0RRJrNssvh("valueVector");
                throw null;
            }
            g6Var5.WDYagTQQm9ns(((defpackage.ci1) this.WDYagTQQm9ns).JhCgjQRTAOCT(i).giKS3J6vZuNy(j, g6Var.ZpBGe2uQfcn8(i), g6Var2.ZpBGe2uQfcn8(i), g6Var3.ZpBGe2uQfcn8(i)), i);
            i++;
        }
    }

    public void WDYagTQQm9ns(defpackage.dt0 dt0Var, int i) {
        if (i != 1 && i != 0) {
            defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Unsupported priority value: ", i));
        } else if (((java.util.LinkedHashSet) this.P05cfTpS5W5L).add(dt0Var)) {
            ((defpackage.uq0) this.oh71FJcDz6S2).ZpBGe2uQfcn8(this, dt0Var, i);
        }
    }

    public defpackage.iu1 WmetiUbpKU9I(defpackage.ne neVar, java.lang.String str) {
        defpackage.iu1 iu1Var;
        defpackage.iu1 ZpBGe2uQfcn8;
        synchronized (((defpackage.l21) this.P05cfTpS5W5L)) {
            try {
                iu1Var = (defpackage.iu1) ((defpackage.qu1) this.WDYagTQQm9ns).ZpBGe2uQfcn8.get(str);
                if (neVar.JhCgjQRTAOCT(iu1Var)) {
                    defpackage.mu1 mu1Var = (defpackage.mu1) this.oh71FJcDz6S2;
                    if (mu1Var instanceof defpackage.c81) {
                        defpackage.c81 c81Var = (defpackage.c81) mu1Var;
                        iu1Var.getClass();
                        defpackage.zg0 zg0Var = c81Var.JhCgjQRTAOCT;
                        if (zg0Var != null) {
                            defpackage.n80 n80Var = c81Var.WDYagTQQm9ns;
                            n80Var.getClass();
                            defpackage.j80.P05cfTpS5W5L(iu1Var, n80Var, zg0Var);
                        }
                    }
                    iu1Var.getClass();
                } else {
                    defpackage.dn0 dn0Var = new defpackage.dn0((defpackage.ym) this.QiMR8OkAhezm);
                    dn0Var.ZpBGe2uQfcn8.put(defpackage.ma0.pf0OXpZQoaz3, str);
                    defpackage.mu1 mu1Var2 = (defpackage.mu1) this.oh71FJcDz6S2;
                    mu1Var2.getClass();
                    try {
                        try {
                            ZpBGe2uQfcn8 = mu1Var2.fWTAfUmVKrZq(neVar, dn0Var);
                        } catch (java.lang.AbstractMethodError unused) {
                            java.lang.Class cls = neVar.ZpBGe2uQfcn8;
                            cls.getClass();
                            ZpBGe2uQfcn8 = mu1Var2.ZpBGe2uQfcn8(cls);
                        }
                    } catch (java.lang.AbstractMethodError unused2) {
                        java.lang.Class cls2 = neVar.ZpBGe2uQfcn8;
                        cls2.getClass();
                        ZpBGe2uQfcn8 = mu1Var2.giKS3J6vZuNy(cls2, dn0Var);
                    }
                    iu1Var = ZpBGe2uQfcn8;
                    defpackage.qu1 qu1Var = (defpackage.qu1) this.WDYagTQQm9ns;
                    qu1Var.getClass();
                    iu1Var.getClass();
                    defpackage.iu1 iu1Var2 = (defpackage.iu1) qu1Var.ZpBGe2uQfcn8.put(str, iu1Var);
                    if (iu1Var2 != null) {
                        iu1Var2.giKS3J6vZuNy();
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iu1Var;
    }

    @Override // defpackage.ft1
    public defpackage.g6 XntWc4eZSQ8j(defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        if (((defpackage.g6) this.P05cfTpS5W5L) == null) {
            this.P05cfTpS5W5L = g6Var3.fWTAfUmVKrZq();
        }
        defpackage.g6 g6Var4 = (defpackage.g6) this.P05cfTpS5W5L;
        if (g6Var4 == null) {
            defpackage.ma0.hH0RRJrNssvh("endVelocityVector");
            throw null;
        }
        int giKS3J6vZuNy = g6Var4.giKS3J6vZuNy();
        int i = 0;
        while (true) {
            defpackage.g6 g6Var5 = (defpackage.g6) this.P05cfTpS5W5L;
            if (i >= giKS3J6vZuNy) {
                if (g6Var5 != null) {
                    return g6Var5;
                }
                defpackage.ma0.hH0RRJrNssvh("endVelocityVector");
                throw null;
            }
            if (g6Var5 == null) {
                defpackage.ma0.hH0RRJrNssvh("endVelocityVector");
                throw null;
            }
            g6Var5.WDYagTQQm9ns(((defpackage.ci1) this.WDYagTQQm9ns).JhCgjQRTAOCT(i).WDYagTQQm9ns(g6Var.ZpBGe2uQfcn8(i), g6Var2.ZpBGe2uQfcn8(i), g6Var3.ZpBGe2uQfcn8(i)), i);
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object e6mdH7fiFuta(long j, defpackage.ll llVar) {
        defpackage.er0 er0Var;
        int i;
        long j2;
        if (llVar instanceof defpackage.er0) {
            er0Var = (defpackage.er0) llVar;
            int i2 = er0Var.GE9mJIPrb8gP;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                er0Var.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = er0Var.P05cfTpS5W5L;
                i = er0Var.GE9mJIPrb8gP;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.hr0 hr0Var = (defpackage.hr0) this.WDYagTQQm9ns;
                    defpackage.hr0 xbkEJUK1coRZ = hr0Var != null ? hr0Var.xbkEJUK1coRZ() : null;
                    if (xbkEJUK1coRZ == null) {
                        j2 = 0;
                        return new defpackage.jt1(j2);
                    }
                    er0Var.GE9mJIPrb8gP = 1;
                    obj = xbkEJUK1coRZ.KN4muQto0Nd5(j, er0Var);
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (obj == tmVar) {
                        return tmVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                j2 = ((defpackage.jt1) obj).ZpBGe2uQfcn8;
                return new defpackage.jt1(j2);
            }
        }
        er0Var = new defpackage.er0(this, llVar);
        java.lang.Object obj2 = er0Var.P05cfTpS5W5L;
        i = er0Var.GE9mJIPrb8gP;
        if (i != 0) {
        }
        j2 = ((defpackage.jt1) obj2).ZpBGe2uQfcn8;
        return new defpackage.jt1(j2);
    }

    @Override // defpackage.ft1
    public defpackage.g6 fNwYGHIYeJcR(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        if (((defpackage.g6) this.QiMR8OkAhezm) == null) {
            this.QiMR8OkAhezm = g6Var3.fWTAfUmVKrZq();
        }
        defpackage.g6 g6Var4 = (defpackage.g6) this.QiMR8OkAhezm;
        if (g6Var4 == null) {
            defpackage.ma0.hH0RRJrNssvh("velocityVector");
            throw null;
        }
        int giKS3J6vZuNy = g6Var4.giKS3J6vZuNy();
        int i = 0;
        while (true) {
            defpackage.g6 g6Var5 = (defpackage.g6) this.QiMR8OkAhezm;
            if (i >= giKS3J6vZuNy) {
                if (g6Var5 != null) {
                    return g6Var5;
                }
                defpackage.ma0.hH0RRJrNssvh("velocityVector");
                throw null;
            }
            if (g6Var5 == null) {
                defpackage.ma0.hH0RRJrNssvh("velocityVector");
                throw null;
            }
            g6Var5.WDYagTQQm9ns(((defpackage.ci1) this.WDYagTQQm9ns).JhCgjQRTAOCT(i).fWTAfUmVKrZq(j, g6Var.ZpBGe2uQfcn8(i), g6Var2.ZpBGe2uQfcn8(i), g6Var3.ZpBGe2uQfcn8(i)), i);
            i++;
        }
    }

    @Override // defpackage.ft1
    public long giKS3J6vZuNy(defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        int giKS3J6vZuNy = g6Var.giKS3J6vZuNy();
        long j = 0;
        for (int i = 0; i < giKS3J6vZuNy; i++) {
            j = java.lang.Math.max(j, ((defpackage.ci1) this.WDYagTQQm9ns).JhCgjQRTAOCT(i).JhCgjQRTAOCT(g6Var.ZpBGe2uQfcn8(i), g6Var2.ZpBGe2uQfcn8(i), g6Var3.ZpBGe2uQfcn8(i)));
        }
        return j;
    }

    public defpackage.g6 h3m55N1URyyK(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2) {
        if (((defpackage.g6) this.QiMR8OkAhezm) == null) {
            this.QiMR8OkAhezm = g6Var.fWTAfUmVKrZq();
        }
        defpackage.g6 g6Var3 = (defpackage.g6) this.QiMR8OkAhezm;
        if (g6Var3 == null) {
            defpackage.ma0.hH0RRJrNssvh("velocityVector");
            throw null;
        }
        int giKS3J6vZuNy = g6Var3.giKS3J6vZuNy();
        int i = 0;
        while (true) {
            defpackage.g6 g6Var4 = (defpackage.g6) this.QiMR8OkAhezm;
            if (i >= giKS3J6vZuNy) {
                if (g6Var4 != null) {
                    return g6Var4;
                }
                defpackage.ma0.hH0RRJrNssvh("velocityVector");
                throw null;
            }
            if (g6Var4 == null) {
                defpackage.ma0.hH0RRJrNssvh("velocityVector");
                throw null;
            }
            defpackage.k0 k0Var = (defpackage.k0) this.WDYagTQQm9ns;
            g6Var.getClass();
            long j2 = j / 1000000;
            defpackage.hx ZpBGe2uQfcn8 = ((defpackage.ix) k0Var.oh71FJcDz6S2).ZpBGe2uQfcn8(g6Var2.ZpBGe2uQfcn8(i));
            long j3 = ZpBGe2uQfcn8.fWTAfUmVKrZq;
            g6Var4.WDYagTQQm9ns((((java.lang.Math.signum(ZpBGe2uQfcn8.ZpBGe2uQfcn8) * defpackage.q1.ZpBGe2uQfcn8(j3 > 0 ? j2 / j3 : 1.0f).giKS3J6vZuNy) * ZpBGe2uQfcn8.giKS3J6vZuNy) / j3) * 1000.0f, i);
            i++;
        }
    }

    public void oh71FJcDz6S2(java.lang.String str, java.lang.String str2) {
        this.P05cfTpS5W5L = ((java.lang.String) this.P05cfTpS5W5L) + (((java.lang.String) this.P05cfTpS5W5L).length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    public s81(defpackage.hu huVar, defpackage.q81 q81Var, defpackage.ne neVar, defpackage.jw0 jw0Var) {
        huVar.getClass();
        q81Var.getClass();
        this.WDYagTQQm9ns = huVar;
        this.P05cfTpS5W5L = q81Var;
        this.oh71FJcDz6S2 = neVar;
        this.QiMR8OkAhezm = jw0Var;
        defpackage.mb0.ZpBGe2uQfcn8(neVar);
    }

    public s81(defpackage.qu1 qu1Var, defpackage.mu1 mu1Var, defpackage.ym ymVar) {
        qu1Var.getClass();
        mu1Var.getClass();
        ymVar.getClass();
        this.WDYagTQQm9ns = qu1Var;
        this.oh71FJcDz6S2 = mu1Var;
        this.QiMR8OkAhezm = ymVar;
        this.P05cfTpS5W5L = new defpackage.l21(14);
    }

    public s81(defpackage.rb0 rb0Var) {
        this.QiMR8OkAhezm = "";
        this.P05cfTpS5W5L = "";
        this.WDYagTQQm9ns = rb0Var;
        this.oh71FJcDz6S2 = rb0Var.giKS3J6vZuNy().ZpBGe2uQfcn8();
    }

    public /* synthetic */ s81(java.lang.Object obj) {
        this.WDYagTQQm9ns = obj;
    }

    public s81(defpackage.mx mxVar) {
        this(new defpackage.ci1(5, mxVar));
    }
}
