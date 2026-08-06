package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gq0 extends defpackage.mi1 implements defpackage.c20 {
    public final /* synthetic */ defpackage.xp0 GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.xo0 Ns0WNyEWdPsk;
    public final /* synthetic */ defpackage.jp1 e6mdH7fiFuta;
    public final /* synthetic */ defpackage.nn0 fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.gi gUjdnLbkVAaA;
    public final /* synthetic */ defpackage.dg1 h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(defpackage.jp1 jp1Var, defpackage.xp0 xp0Var, defpackage.xo0 xo0Var, defpackage.nn0 nn0Var, defpackage.dg1 dg1Var, defpackage.gi giVar, defpackage.kl klVar) {
        super(2, klVar);
        this.e6mdH7fiFuta = jp1Var;
        this.GE9mJIPrb8gP = xp0Var;
        this.Ns0WNyEWdPsk = xo0Var;
        this.fNwYGHIYeJcR = nn0Var;
        this.h3m55N1URyyK = dg1Var;
        this.gUjdnLbkVAaA = giVar;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.gq0 gq0Var = (defpackage.gq0) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj);
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        gq0Var.s0TASMVLSWD5(gs1Var);
        return gs1Var;
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        return new defpackage.gq0(this.e6mdH7fiFuta, this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, klVar);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.b80.KrtOTfE6jiS2(obj);
        defpackage.jp1 jp1Var = this.e6mdH7fiFuta;
        java.lang.Object oh71FJcDz6S2 = jp1Var.ZpBGe2uQfcn8.oh71FJcDz6S2();
        defpackage.pw0 pw0Var = jp1Var.JhCgjQRTAOCT;
        if (defpackage.ma0.QiMR8OkAhezm(oh71FJcDz6S2, pw0Var.getValue()) && (((defpackage.xo0) this.GE9mJIPrb8gP.giKS3J6vZuNy.oh71FJcDz6S2.QiMR8OkAhezm()) == null || defpackage.ma0.QiMR8OkAhezm(pw0Var.getValue(), this.Ns0WNyEWdPsk))) {
            java.util.Iterator it = ((java.util.List) this.h3m55N1URyyK.getValue()).iterator();
            while (it.hasNext()) {
                this.gUjdnLbkVAaA.giKS3J6vZuNy().fWTAfUmVKrZq((defpackage.xo0) it.next());
            }
            defpackage.nn0 nn0Var = this.fNwYGHIYeJcR;
            long[] jArr = nn0Var.ZpBGe2uQfcn8;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                java.lang.Object obj2 = nn0Var.giKS3J6vZuNy[i4];
                                float f = nn0Var.fWTAfUmVKrZq[i4];
                                if (!defpackage.ma0.QiMR8OkAhezm((java.lang.String) obj2, ((defpackage.xo0) pw0Var.getValue()).GE9mJIPrb8gP)) {
                                    nn0Var.WDYagTQQm9ns--;
                                    long[] jArr2 = nn0Var.ZpBGe2uQfcn8;
                                    int i5 = nn0Var.JhCgjQRTAOCT;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    nn0Var.giKS3J6vZuNy[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
