package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class si1 extends defpackage.ul0 implements defpackage.g01, defpackage.hp, defpackage.f01 {
    public java.lang.Object BHfvd2J71qpO;
    public defpackage.vz0 IJ0hOnjhPOri = defpackage.oi1.ZpBGe2uQfcn8;
    public defpackage.vz0 OcTWLQzke1i2;
    public final defpackage.ho0 VFeft99leXEK;
    public java.lang.Object ZVVdXbWmyCSK;
    public long blKFvluuDQOf;
    public final defpackage.ho0 dG7RjM6DqYVL;
    public defpackage.yf1 maCixPsq4ml2;
    public final defpackage.ho0 oCu53ZX2v4Ju;
    public androidx.compose.ui.input.pointer.PointerInputEventHandler w7APNrr0aGRc;

    public si1(java.lang.Object obj, java.lang.Object obj2, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        this.BHfvd2J71qpO = obj;
        this.ZVVdXbWmyCSK = obj2;
        this.w7APNrr0aGRc = pointerInputEventHandler;
        defpackage.ho0 ho0Var = new defpackage.ho0(new defpackage.ri1[16]);
        this.VFeft99leXEK = ho0Var;
        this.oCu53ZX2v4Ju = ho0Var;
        this.dG7RjM6DqYVL = new defpackage.ho0(new defpackage.ri1[16]);
        this.blKFvluuDQOf = 0L;
    }

    @Override // defpackage.f01
    public final void FhgBoOud6zyW() {
        I9id0xDxCgYV();
    }

    public final void I9id0xDxCgYV() {
        defpackage.yf1 yf1Var = this.maCixPsq4ml2;
        if (yf1Var != null) {
            yf1Var.qjMheFZ0l9kA(new defpackage.yl0("Pointer input was reset", 2));
            this.maCixPsq4ml2 = null;
        }
    }

    @Override // defpackage.f01
    public final void IBvW5fLsPuHy(defpackage.vz0 vz0Var, defpackage.wz0 wz0Var, long j) {
        this.blKFvluuDQOf = j;
        if (wz0Var == defpackage.wz0.WDYagTQQm9ns) {
            this.IJ0hOnjhPOri = vz0Var;
        }
        defpackage.kl klVar = null;
        if (this.maCixPsq4ml2 == null) {
            this.maCixPsq4ml2 = defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.x6(this, klVar, 12), 1);
        }
        xbkEJUK1coRZ(vz0Var, wz0Var);
        java.util.List list = vz0Var.ZpBGe2uQfcn8;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                vz0Var = null;
                break;
            } else if (!defpackage.j80.fNwYGHIYeJcR((defpackage.c01) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.OcTWLQzke1i2 = vz0Var;
    }

    @Override // defpackage.f01
    public final void LCK4GGEwbWAr() {
        defpackage.vz0 vz0Var = this.OcTWLQzke1i2;
        if (vz0Var == null) {
            return;
        }
        java.util.List list = vz0Var.ZpBGe2uQfcn8;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.c01) list.get(i)).JhCgjQRTAOCT) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    defpackage.c01 c01Var = (defpackage.c01) list.get(i2);
                    long j = c01Var.ZpBGe2uQfcn8;
                    long j2 = c01Var.fWTAfUmVKrZq;
                    long j3 = c01Var.giKS3J6vZuNy;
                    float f = c01Var.WDYagTQQm9ns;
                    boolean z = c01Var.JhCgjQRTAOCT;
                    arrayList.add(new defpackage.c01(j, j3, j2, false, f, j3, j2, z, z, c01Var.e6mdH7fiFuta, 0L, 1.0f, 0L));
                }
                defpackage.vz0 vz0Var2 = new defpackage.vz0(arrayList, null);
                this.IJ0hOnjhPOri = vz0Var2;
                xbkEJUK1coRZ(vz0Var2, defpackage.wz0.WDYagTQQm9ns);
                xbkEJUK1coRZ(vz0Var2, defpackage.wz0.oh71FJcDz6S2);
                xbkEJUK1coRZ(vz0Var2, defpackage.wz0.QiMR8OkAhezm);
                this.OcTWLQzke1i2 = null;
                return;
            }
        }
    }

    public final java.lang.Object YZh1E3mnTFwf(defpackage.c20 c20Var, defpackage.kl klVar) {
        defpackage.dd ddVar = new defpackage.dd(1, defpackage.q70.OcTWLQzke1i2(klVar));
        ddVar.IJ0hOnjhPOri();
        defpackage.ri1 ri1Var = new defpackage.ri1(this, ddVar);
        synchronized (this.oCu53ZX2v4Ju) {
            this.VFeft99leXEK.giKS3J6vZuNy(ri1Var);
            new defpackage.e71(defpackage.q70.OcTWLQzke1i2(defpackage.q70.T1fB7bDYiVJQ(ri1Var, ri1Var, c20Var))).e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
        }
        ddVar.oCu53ZX2v4Ju(new defpackage.YjS0G3zEDWNX(22, ri1Var));
        return ddVar.w7APNrr0aGRc();
    }

    @Override // defpackage.wo
    public final void ZpBGe2uQfcn8() {
        I9id0xDxCgYV();
    }

    @Override // defpackage.ul0
    public final void awuGf4qH8HFd() {
        I9id0xDxCgYV();
    }

    @Override // defpackage.hp
    public final float giKS3J6vZuNy() {
        return defpackage.la0.UmgHb6n58gfG(this).blKFvluuDQOf.giKS3J6vZuNy();
    }

    @Override // defpackage.hp
    public final float h3m55N1URyyK() {
        return defpackage.la0.UmgHb6n58gfG(this).blKFvluuDQOf.h3m55N1URyyK();
    }

    public final void xbkEJUK1coRZ(defpackage.vz0 vz0Var, defpackage.wz0 wz0Var) {
        defpackage.dd ddVar;
        defpackage.dd ddVar2;
        synchronized (this.oCu53ZX2v4Ju) {
            defpackage.ho0 ho0Var = this.dG7RjM6DqYVL;
            ho0Var.fWTAfUmVKrZq(ho0Var.QiMR8OkAhezm, this.VFeft99leXEK);
        }
        try {
            int ordinal = wz0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    defpackage.ho0 ho0Var2 = this.dG7RjM6DqYVL;
                    int i = ho0Var2.QiMR8OkAhezm - 1;
                    java.lang.Object[] objArr = ho0Var2.WDYagTQQm9ns;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            defpackage.ri1 ri1Var = (defpackage.ri1) objArr[i];
                            if (wz0Var == ri1Var.P05cfTpS5W5L && (ddVar2 = ri1Var.QiMR8OkAhezm) != null) {
                                ri1Var.QiMR8OkAhezm = null;
                                ddVar2.e6mdH7fiFuta(vz0Var);
                            }
                            i--;
                        }
                    }
                    this.dG7RjM6DqYVL.QiMR8OkAhezm();
                }
                if (ordinal != 2) {
                    throw new defpackage.vg();
                }
            }
            defpackage.ho0 ho0Var3 = this.dG7RjM6DqYVL;
            java.lang.Object[] objArr2 = ho0Var3.WDYagTQQm9ns;
            int i2 = ho0Var3.QiMR8OkAhezm;
            for (int i3 = 0; i3 < i2; i3++) {
                defpackage.ri1 ri1Var2 = (defpackage.ri1) objArr2[i3];
                if (wz0Var == ri1Var2.P05cfTpS5W5L && (ddVar = ri1Var2.QiMR8OkAhezm) != null) {
                    ri1Var2.QiMR8OkAhezm = null;
                    ddVar.e6mdH7fiFuta(vz0Var);
                }
            }
            this.dG7RjM6DqYVL.QiMR8OkAhezm();
        } catch (java.lang.Throwable th) {
            this.dG7RjM6DqYVL.QiMR8OkAhezm();
            throw th;
        }
    }
}
