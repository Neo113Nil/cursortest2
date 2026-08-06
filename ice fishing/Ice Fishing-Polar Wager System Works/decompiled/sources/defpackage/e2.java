package defpackage;

/* loaded from: classes.dex */
public final class e2 {
    public long AARZUJiTa;
    public long EXtogiMhuM;
    public final defpackage.qt0 F7NU4MC0GW;
    public final defpackage.qn IHQe1A4L2xu;
    public final boolean adDC3e2L;
    public long oh6vYeIP = 9205357640488583168L;
    public final defpackage.gs r1MBDhnF;
    public final defpackage.ln riuEU0zW4;
    public boolean xiZrDbcSW0;

    public e2(android.content.Context context, defpackage.qn qnVar, long j, defpackage.at0 at0Var) {
        this.IHQe1A4L2xu = qnVar;
        defpackage.gs gsVar = new defpackage.gs(context, defpackage.w70.yIx6ChFVk(j));
        this.r1MBDhnF = gsVar;
        this.F7NU4MC0GW = new defpackage.qt0(defpackage.ok1.IHQe1A4L2xu, defpackage.n.QPwENk36pDC);
        this.adDC3e2L = true;
        this.AARZUJiTa = 0L;
        this.EXtogiMhuM = -1L;
        defpackage.d2 d2Var = new defpackage.d2(this);
        defpackage.ov0 ov0Var = defpackage.ee1.IHQe1A4L2xu;
        defpackage.ge1 ge1Var = new defpackage.ge1(null, null, d2Var);
        this.riuEU0zW4 = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.o20(ge1Var, this, gsVar) : new defpackage.o20(ge1Var, this, gsVar, at0Var);
    }

    public final float AARZUJiTa(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (r1MBDhnF() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa >> 32));
        android.widget.EdgeEffect F7NU4MC0GW = this.r1MBDhnF.F7NU4MC0GW();
        float f = -intBitsToFloat2;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = defpackage.t5.F7NU4MC0GW(F7NU4MC0GW, f, intBitsToFloat);
        } else {
            F7NU4MC0GW.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? defpackage.t5.r1MBDhnF(F7NU4MC0GW) : 0.0f) == 0.0f ? java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa >> 32)) * (-f) : java.lang.Float.intBitsToFloat(i);
    }

    public final float EXtogiMhuM(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (r1MBDhnF() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa & 4294967295L));
        android.widget.EdgeEffect adDC3e2L = this.r1MBDhnF.adDC3e2L();
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = defpackage.t5.F7NU4MC0GW(adDC3e2L, intBitsToFloat2, intBitsToFloat);
        } else {
            adDC3e2L.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? defpackage.t5.r1MBDhnF(adDC3e2L) : 0.0f) == 0.0f ? java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa & 4294967295L)) * intBitsToFloat2 : java.lang.Float.intBitsToFloat(i);
    }

    public final void F7NU4MC0GW() {
        if (this.adDC3e2L) {
            this.F7NU4MC0GW.setValue(defpackage.ok1.IHQe1A4L2xu);
        }
    }

    public final void IHQe1A4L2xu() {
        boolean z;
        defpackage.gs gsVar = this.r1MBDhnF;
        android.widget.EdgeEffect edgeEffect = gsVar.F7NU4MC0GW;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        android.widget.EdgeEffect edgeEffect2 = gsVar.adDC3e2L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        android.widget.EdgeEffect edgeEffect3 = gsVar.xiZrDbcSW0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        android.widget.EdgeEffect edgeEffect4 = gsVar.AARZUJiTa;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            F7NU4MC0GW();
        }
    }

    public final float adDC3e2L(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (r1MBDhnF() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa & 4294967295L));
        android.widget.EdgeEffect oh6vYeIP = this.r1MBDhnF.oh6vYeIP();
        float f = -intBitsToFloat2;
        float f2 = 1.0f - intBitsToFloat;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = defpackage.t5.F7NU4MC0GW(oh6vYeIP, f, f2);
        } else {
            oh6vYeIP.onPull(f, f2);
        }
        return (i2 >= 31 ? defpackage.t5.r1MBDhnF(oh6vYeIP) : 0.0f) == 0.0f ? java.lang.Float.intBitsToFloat((int) (4294967295L & this.AARZUJiTa)) * (-f) : java.lang.Float.intBitsToFloat(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object oh6vYeIP(long j, defpackage.h61 h61Var, defpackage.fj fjVar) {
        defpackage.b2 b2Var;
        int i;
        long F7NU4MC0GW;
        long F7NU4MC0GW2;
        if (fjVar instanceof defpackage.b2) {
            b2Var = (defpackage.b2) fjVar;
            int i2 = b2Var.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b2Var.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = b2Var.riuEU0zW4;
                i = b2Var.ez2rX8ReCYw;
                defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                defpackage.gs gsVar = this.r1MBDhnF;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    boolean r1MBDhnF = defpackage.z91.r1MBDhnF(this.AARZUJiTa);
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (r1MBDhnF) {
                        b2Var.ez2rX8ReCYw = 1;
                        h61Var.getClass();
                        defpackage.h61 h61Var2 = new defpackage.h61(h61Var.JlrlGoKF, b2Var);
                        h61Var2.ez2rX8ReCYw = j;
                        if (h61Var2.SyNS6RMn(ok1Var) != vjVar) {
                            return ok1Var;
                        }
                    } else {
                        boolean AARZUJiTa = defpackage.gs.AARZUJiTa(gsVar.xiZrDbcSW0);
                        defpackage.qn qnVar = this.IHQe1A4L2xu;
                        long adDC3e2L = defpackage.x80.adDC3e2L((!AARZUJiTa || defpackage.rl1.oh6vYeIP(j) >= 0.0f) ? (!defpackage.gs.AARZUJiTa(gsVar.AARZUJiTa) || defpackage.rl1.oh6vYeIP(j) <= 0.0f) ? 0.0f : -defpackage.ci0.EXtogiMhuM(gsVar.F7NU4MC0GW(), -defpackage.rl1.oh6vYeIP(j), java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa >> 32)), qnVar) : defpackage.ci0.EXtogiMhuM(gsVar.r1MBDhnF(), defpackage.rl1.oh6vYeIP(j), java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa >> 32)), qnVar), (!defpackage.gs.AARZUJiTa(gsVar.F7NU4MC0GW) || defpackage.rl1.r1MBDhnF(j) >= 0.0f) ? (!defpackage.gs.AARZUJiTa(gsVar.adDC3e2L) || defpackage.rl1.r1MBDhnF(j) <= 0.0f) ? 0.0f : -defpackage.ci0.EXtogiMhuM(gsVar.oh6vYeIP(), -defpackage.rl1.r1MBDhnF(j), java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa & 4294967295L)), qnVar) : defpackage.ci0.EXtogiMhuM(gsVar.adDC3e2L(), defpackage.rl1.r1MBDhnF(j), java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa & 4294967295L)), qnVar));
                        if (adDC3e2L != 0) {
                            F7NU4MC0GW();
                        }
                        F7NU4MC0GW = defpackage.rl1.F7NU4MC0GW(j, adDC3e2L);
                        b2Var.EXtogiMhuM = F7NU4MC0GW;
                        b2Var.ez2rX8ReCYw = 2;
                        h61Var.getClass();
                        defpackage.h61 h61Var3 = new defpackage.h61(h61Var.JlrlGoKF, b2Var);
                        h61Var3.ez2rX8ReCYw = F7NU4MC0GW;
                        obj = h61Var3.SyNS6RMn(ok1Var);
                    }
                    return vjVar;
                }
                if (i == 1) {
                    defpackage.f70.nBH8hAHy(obj);
                    return ok1Var;
                }
                if (i != 2) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                F7NU4MC0GW = b2Var.EXtogiMhuM;
                defpackage.f70.nBH8hAHy(obj);
                F7NU4MC0GW2 = defpackage.rl1.F7NU4MC0GW(F7NU4MC0GW, ((defpackage.rl1) obj).IHQe1A4L2xu);
                this.xiZrDbcSW0 = false;
                if (defpackage.rl1.oh6vYeIP(F7NU4MC0GW2) <= 0.0f) {
                    android.widget.EdgeEffect r1MBDhnF2 = gsVar.r1MBDhnF();
                    int TFRaUu83X3E = defpackage.ci0.TFRaUu83X3E(defpackage.rl1.oh6vYeIP(F7NU4MC0GW2));
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        r1MBDhnF2.onAbsorb(TFRaUu83X3E);
                    } else if (r1MBDhnF2.isFinished()) {
                        r1MBDhnF2.onAbsorb(TFRaUu83X3E);
                    }
                } else if (defpackage.rl1.oh6vYeIP(F7NU4MC0GW2) < 0.0f) {
                    android.widget.EdgeEffect F7NU4MC0GW3 = gsVar.F7NU4MC0GW();
                    int i3 = -defpackage.ci0.TFRaUu83X3E(defpackage.rl1.oh6vYeIP(F7NU4MC0GW2));
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        F7NU4MC0GW3.onAbsorb(i3);
                    } else if (F7NU4MC0GW3.isFinished()) {
                        F7NU4MC0GW3.onAbsorb(i3);
                    }
                }
                if (defpackage.rl1.r1MBDhnF(F7NU4MC0GW2) <= 0.0f) {
                    android.widget.EdgeEffect adDC3e2L2 = gsVar.adDC3e2L();
                    int TFRaUu83X3E2 = defpackage.ci0.TFRaUu83X3E(defpackage.rl1.r1MBDhnF(F7NU4MC0GW2));
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        adDC3e2L2.onAbsorb(TFRaUu83X3E2);
                    } else if (adDC3e2L2.isFinished()) {
                        adDC3e2L2.onAbsorb(TFRaUu83X3E2);
                    }
                } else if (defpackage.rl1.r1MBDhnF(F7NU4MC0GW2) < 0.0f) {
                    android.widget.EdgeEffect oh6vYeIP = gsVar.oh6vYeIP();
                    int i4 = -defpackage.ci0.TFRaUu83X3E(defpackage.rl1.r1MBDhnF(F7NU4MC0GW2));
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        oh6vYeIP.onAbsorb(i4);
                    } else if (oh6vYeIP.isFinished()) {
                        oh6vYeIP.onAbsorb(i4);
                    }
                }
                IHQe1A4L2xu();
                return ok1Var;
            }
        }
        b2Var = new defpackage.b2(this, fjVar);
        java.lang.Object obj2 = b2Var.riuEU0zW4;
        i = b2Var.ez2rX8ReCYw;
        defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
        defpackage.gs gsVar2 = this.r1MBDhnF;
        if (i != 0) {
        }
        F7NU4MC0GW2 = defpackage.rl1.F7NU4MC0GW(F7NU4MC0GW, ((defpackage.rl1) obj2).IHQe1A4L2xu);
        this.xiZrDbcSW0 = false;
        if (defpackage.rl1.oh6vYeIP(F7NU4MC0GW2) <= 0.0f) {
        }
        if (defpackage.rl1.r1MBDhnF(F7NU4MC0GW2) <= 0.0f) {
        }
        IHQe1A4L2xu();
        return ok1Var2;
    }

    public final long r1MBDhnF() {
        long j = this.oh6vYeIP;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = defpackage.e90.G3OKOH3wZRC(this.AARZUJiTa);
        }
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void riuEU0zW4(long j) {
        boolean IHQe1A4L2xu = defpackage.z91.IHQe1A4L2xu(this.AARZUJiTa, 0L);
        boolean IHQe1A4L2xu2 = defpackage.z91.IHQe1A4L2xu(j, this.AARZUJiTa);
        this.AARZUJiTa = j;
        if (!IHQe1A4L2xu2) {
            long TFRaUu83X3E = (defpackage.ci0.TFRaUu83X3E(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (defpackage.ci0.TFRaUu83X3E(java.lang.Float.intBitsToFloat((int) (j >> 32))) << 32);
            defpackage.gs gsVar = this.r1MBDhnF;
            gsVar.r1MBDhnF = TFRaUu83X3E;
            android.widget.EdgeEffect edgeEffect = gsVar.F7NU4MC0GW;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (TFRaUu83X3E >> 32), (int) (TFRaUu83X3E & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect2 = gsVar.adDC3e2L;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (TFRaUu83X3E >> 32), (int) (TFRaUu83X3E & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect3 = gsVar.xiZrDbcSW0;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (TFRaUu83X3E & 4294967295L), (int) (TFRaUu83X3E >> 32));
            }
            android.widget.EdgeEffect edgeEffect4 = gsVar.AARZUJiTa;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (TFRaUu83X3E & 4294967295L), (int) (TFRaUu83X3E >> 32));
            }
            android.widget.EdgeEffect edgeEffect5 = gsVar.EXtogiMhuM;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (TFRaUu83X3E >> 32), (int) (TFRaUu83X3E & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect6 = gsVar.riuEU0zW4;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (TFRaUu83X3E >> 32), (int) (TFRaUu83X3E & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect7 = gsVar.SH1y5HwkJhh;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (TFRaUu83X3E & 4294967295L), (int) (TFRaUu83X3E >> 32));
            }
            android.widget.EdgeEffect edgeEffect8 = gsVar.ez2rX8ReCYw;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & TFRaUu83X3E), (int) (TFRaUu83X3E >> 32));
            }
        }
        if (IHQe1A4L2xu || IHQe1A4L2xu2) {
            return;
        }
        IHQe1A4L2xu();
    }

    public final float xiZrDbcSW0(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (r1MBDhnF() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa >> 32));
        android.widget.EdgeEffect r1MBDhnF = this.r1MBDhnF.r1MBDhnF();
        float f = 1.0f - intBitsToFloat;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = defpackage.t5.F7NU4MC0GW(r1MBDhnF, intBitsToFloat2, f);
        } else {
            r1MBDhnF.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? defpackage.t5.r1MBDhnF(r1MBDhnF) : 0.0f) == 0.0f ? java.lang.Float.intBitsToFloat((int) (this.AARZUJiTa >> 32)) * intBitsToFloat2 : java.lang.Float.intBitsToFloat(i);
    }
}
