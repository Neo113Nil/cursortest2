package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ji extends defpackage.f51 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.ki fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(defpackage.ki kiVar, defpackage.kl klVar) {
        super(klVar);
        this.fNwYGHIYeJcR = kiVar;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ji) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.ec1) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.ji jiVar = new defpackage.ji(this.fNwYGHIYeJcR, klVar);
        jiVar.Ns0WNyEWdPsk = obj;
        return jiVar;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.ec1 ec1Var;
        int i;
        int i2;
        int i3;
        java.lang.String str;
        int i4;
        int i5;
        java.lang.String str2;
        defpackage.ki kiVar = this.fNwYGHIYeJcR;
        defpackage.sn0 sn0Var = kiVar.WDYagTQQm9ns;
        defpackage.fn0 fn0Var = kiVar.QiMR8OkAhezm;
        int i6 = this.GE9mJIPrb8gP;
        if (i6 == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            ec1Var = (defpackage.ec1) this.Ns0WNyEWdPsk;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.e6mdH7fiFuta;
            i2 = this.P05cfTpS5W5L;
            i3 = this.QiMR8OkAhezm;
            ec1Var = (defpackage.ec1) this.Ns0WNyEWdPsk;
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        if (i3 >= java.lang.Math.min(kiVar.P05cfTpS5W5L + 10, fn0Var.giKS3J6vZuNy)) {
            return defpackage.gs1.ZpBGe2uQfcn8;
        }
        int i7 = i3 + 1;
        int giKS3J6vZuNy = fn0Var.giKS3J6vZuNy(i3);
        switch (giKS3J6vZuNy) {
            case 0:
                str = "up";
                break;
            case 1:
                java.lang.Object oh71FJcDz6S2 = sn0Var.oh71FJcDz6S2(i2);
                i2++;
                str = "down " + oh71FJcDz6S2;
                break;
            case 2:
                str = "remove " + fn0Var.giKS3J6vZuNy(i7) + ' ' + fn0Var.giKS3J6vZuNy(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                str = "move " + fn0Var.giKS3J6vZuNy(i7) + ' ' + fn0Var.giKS3J6vZuNy(i3 + 2) + ' ' + fn0Var.giKS3J6vZuNy(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int giKS3J6vZuNy2 = fn0Var.giKS3J6vZuNy(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + giKS3J6vZuNy2 + ' ' + sn0Var.oh71FJcDz6S2(i2);
                int i8 = i4;
                str = str2;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int giKS3J6vZuNy3 = fn0Var.giKS3J6vZuNy(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + giKS3J6vZuNy3 + ' ' + sn0Var.oh71FJcDz6S2(i2);
                int i82 = i4;
                str = str2;
                i7 = i82;
                i2 = i5;
                break;
            case 7:
                java.lang.Object oh71FJcDz6S22 = sn0Var.oh71FJcDz6S2(i2);
                oh71FJcDz6S22.getClass();
                defpackage.nq1.IJ0hOnjhPOri(2, oh71FJcDz6S22);
                i2 += 2;
                str = "apply " + ((defpackage.c20) oh71FJcDz6S22);
                break;
            case 8:
                str = "reuse " + kiVar.oh71FJcDz6S2.oh71FJcDz6S2(i);
                i++;
                break;
            case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                str = "recompose pending";
                break;
            default:
                str = defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("unknown op: ", giKS3J6vZuNy);
                break;
        }
        this.Ns0WNyEWdPsk = ec1Var;
        this.QiMR8OkAhezm = i7;
        this.P05cfTpS5W5L = i2;
        this.e6mdH7fiFuta = i;
        this.GE9mJIPrb8gP = 1;
        ec1Var.giKS3J6vZuNy(i3 + ": " + str, this);
        return defpackage.tm.WDYagTQQm9ns;
    }
}
