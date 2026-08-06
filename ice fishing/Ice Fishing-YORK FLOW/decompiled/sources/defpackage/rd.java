package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class rd implements defpackage.o20 {
    public final defpackage.zb QiMR8OkAhezm;
    public final defpackage.jm WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public rd(defpackage.jm jmVar, int i, defpackage.zb zbVar) {
        this.WDYagTQQm9ns = jmVar;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = zbVar;
    }

    public abstract java.lang.Object JhCgjQRTAOCT(defpackage.k21 k21Var, defpackage.kl klVar);

    public defpackage.pd QiMR8OkAhezm(defpackage.sm smVar) {
        int i = this.oh71FJcDz6S2;
        if (i == -3) {
            i = -2;
        }
        defpackage.c20 jhCgjQRTAOCT = new defpackage.JhCgjQRTAOCT(this, null, 6);
        defpackage.dc giKS3J6vZuNy = defpackage.ok0.giKS3J6vZuNy(i, 4, this.QiMR8OkAhezm);
        defpackage.jm s0TASMVLSWD5 = defpackage.nn.s0TASMVLSWD5(smVar.QiMR8OkAhezm(), this.WDYagTQQm9ns, true);
        defpackage.jo joVar = defpackage.tq.ZpBGe2uQfcn8;
        if (s0TASMVLSWD5 != joVar && s0TASMVLSWD5.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.OcTWLQzke1i2) == null) {
            s0TASMVLSWD5 = s0TASMVLSWD5.fNwYGHIYeJcR(joVar);
        }
        defpackage.k21 k21Var = new defpackage.k21(s0TASMVLSWD5, giKS3J6vZuNy);
        k21Var.mnkwqFSfsWTC(defpackage.vm.QiMR8OkAhezm, k21Var, jhCgjQRTAOCT);
        return k21Var;
    }

    public abstract defpackage.rd WDYagTQQm9ns(defpackage.jm jmVar, int i, defpackage.zb zbVar);

    @Override // defpackage.tx
    public java.lang.Object ZpBGe2uQfcn8(defpackage.ux uxVar, defpackage.kl klVar) {
        java.lang.Object IJ0hOnjhPOri = defpackage.ok0.IJ0hOnjhPOri(new defpackage.oh71FJcDz6S2(uxVar, this, null, 3), klVar);
        return IJ0hOnjhPOri == defpackage.tm.WDYagTQQm9ns ? IJ0hOnjhPOri : defpackage.gs1.ZpBGe2uQfcn8;
    }

    public java.lang.String fWTAfUmVKrZq() {
        return null;
    }

    @Override // defpackage.o20
    public final defpackage.tx giKS3J6vZuNy(defpackage.jm jmVar, int i, defpackage.zb zbVar) {
        defpackage.jm jmVar2 = this.WDYagTQQm9ns;
        defpackage.jm fNwYGHIYeJcR = jmVar.fNwYGHIYeJcR(jmVar2);
        defpackage.zb zbVar2 = defpackage.zb.WDYagTQQm9ns;
        defpackage.zb zbVar3 = this.QiMR8OkAhezm;
        int i2 = this.oh71FJcDz6S2;
        if (zbVar == zbVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            zbVar = zbVar3;
        }
        return (defpackage.ma0.QiMR8OkAhezm(fNwYGHIYeJcR, jmVar2) && i == i2 && zbVar == zbVar3) ? this : WDYagTQQm9ns(fNwYGHIYeJcR, i, zbVar);
    }

    public defpackage.tx oh71FJcDz6S2() {
        return null;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        java.lang.String fWTAfUmVKrZq = fWTAfUmVKrZq();
        if (fWTAfUmVKrZq != null) {
            arrayList.add(fWTAfUmVKrZq);
        }
        defpackage.xu xuVar = defpackage.xu.WDYagTQQm9ns;
        defpackage.jm jmVar = this.WDYagTQQm9ns;
        if (jmVar != xuVar) {
            arrayList.add("context=" + jmVar);
        }
        int i = this.oh71FJcDz6S2;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        defpackage.zb zbVar = defpackage.zb.WDYagTQQm9ns;
        defpackage.zb zbVar2 = this.QiMR8OkAhezm;
        if (zbVar2 != zbVar) {
            arrayList.add("onBufferOverflow=" + zbVar2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(sb, defpackage.hf.m6iZQUu7XjoL(arrayList, ", ", null, null, null, 62), ']');
    }
}
