package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gx1 implements defpackage.ug0 {
    public final /* synthetic */ defpackage.z31 P05cfTpS5W5L;
    public final /* synthetic */ defpackage.m31 QiMR8OkAhezm;
    public final /* synthetic */ defpackage.jl WDYagTQQm9ns;
    public final /* synthetic */ defpackage.q4 oh71FJcDz6S2;

    public gx1(defpackage.jl jlVar, defpackage.q4 q4Var, defpackage.m31 m31Var, defpackage.z31 z31Var) {
        this.WDYagTQQm9ns = jlVar;
        this.oh71FJcDz6S2 = q4Var;
        this.QiMR8OkAhezm = m31Var;
        this.P05cfTpS5W5L = z31Var;
    }

    @Override // defpackage.ug0
    public final void e6mdH7fiFuta(defpackage.wg0 wg0Var, defpackage.og0 og0Var) {
        boolean z;
        defpackage.bd bdVar = null;
        switch (defpackage.fx1.ZpBGe2uQfcn8[og0Var.ordinal()]) {
            case 1:
                defpackage.ok0.zJPqDeoF0Os1(this.WDYagTQQm9ns, null, new defpackage.e2(this.P05cfTpS5W5L, this.QiMR8OkAhezm, wg0Var, this, null, 12), 1);
                return;
            case 2:
                defpackage.q4 q4Var = this.oh71FJcDz6S2;
                if (q4Var != null) {
                    defpackage.mc0 mc0Var = (defpackage.mc0) q4Var.QiMR8OkAhezm;
                    synchronized (mc0Var.giKS3J6vZuNy) {
                        try {
                            synchronized (mc0Var.giKS3J6vZuNy) {
                                z = mc0Var.ZpBGe2uQfcn8;
                            }
                            if (!z) {
                                java.util.ArrayList arrayList = (java.util.ArrayList) mc0Var.fWTAfUmVKrZq;
                                mc0Var.fWTAfUmVKrZq = (java.util.ArrayList) mc0Var.JhCgjQRTAOCT;
                                mc0Var.JhCgjQRTAOCT = arrayList;
                                mc0Var.ZpBGe2uQfcn8 = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((defpackage.kl) arrayList.get(i)).e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
                                }
                                arrayList.clear();
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                defpackage.m31 m31Var = this.QiMR8OkAhezm;
                synchronized (m31Var.fWTAfUmVKrZq) {
                    if (m31Var.ZVVdXbWmyCSK) {
                        m31Var.ZVVdXbWmyCSK = false;
                        bdVar = m31Var.oCu53ZX2v4Ju();
                    }
                }
                if (bdVar != null) {
                    ((defpackage.dd) bdVar).e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
                    return;
                }
                return;
            case 3:
                defpackage.m31 m31Var2 = this.QiMR8OkAhezm;
                synchronized (m31Var2.fWTAfUmVKrZq) {
                    m31Var2.ZVVdXbWmyCSK = true;
                }
                return;
            case 4:
                this.QiMR8OkAhezm.VFeft99leXEK();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                defpackage.h7.T1fB7bDYiVJQ();
                return;
        }
    }
}
