package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class m50 {
    public int ZpBGe2uQfcn8;
    public final java.lang.Object fWTAfUmVKrZq;
    public float giKS3J6vZuNy;

    public m50(defpackage.zm1 zm1Var) {
        this.fWTAfUmVKrZq = zm1Var;
        this.ZpBGe2uQfcn8 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float ZpBGe2uQfcn8(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        defpackage.zm1 zm1Var = (defpackage.zm1) this.fWTAfUmVKrZq;
        int i3 = 1;
        if (z) {
            int w7APNrr0aGRc = defpackage.m90.w7APNrr0aGRc(zm1Var.oh71FJcDz6S2, i, z);
            int lineStart = zm1Var.oh71FJcDz6S2.getLineStart(w7APNrr0aGRc);
            int oh71FJcDz6S2 = zm1Var.oh71FJcDz6S2(w7APNrr0aGRc);
            if (i == lineStart || i == oh71FJcDz6S2) {
                z4 = true;
                int i4 = i * 4;
                if (z3) {
                    i3 = z4 ? 2 : 3;
                } else if (z4) {
                    i3 = 0;
                }
                i2 = i4 + i3;
                if (this.ZpBGe2uQfcn8 != i2) {
                    return this.giKS3J6vZuNy;
                }
                float e6mdH7fiFuta = z3 ? zm1Var.e6mdH7fiFuta(i, z) : zm1Var.GE9mJIPrb8gP(i, z);
                if (z2) {
                    this.ZpBGe2uQfcn8 = i2;
                    this.giKS3J6vZuNy = e6mdH7fiFuta;
                }
                return e6mdH7fiFuta;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (z3) {
        }
        i2 = i42 + i3;
        if (this.ZpBGe2uQfcn8 != i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object giKS3J6vZuNy(float f, defpackage.ll llVar) {
        defpackage.h41 h41Var;
        int i;
        if (llVar instanceof defpackage.h41) {
            h41Var = (defpackage.h41) llVar;
            int i2 = h41Var.GE9mJIPrb8gP;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h41Var.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = h41Var.P05cfTpS5W5L;
                i = h41Var.GE9mJIPrb8gP;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.pi piVar = (defpackage.pi) this.fWTAfUmVKrZq;
                    java.lang.Float f2 = new java.lang.Float(f);
                    h41Var.GE9mJIPrb8gP = 1;
                    obj = piVar.QiMR8OkAhezm(f2, h41Var);
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
                this.giKS3J6vZuNy += ((java.lang.Number) obj).floatValue();
                return defpackage.gs1.ZpBGe2uQfcn8;
            }
        }
        h41Var = new defpackage.h41(this, llVar);
        java.lang.Object obj2 = h41Var.P05cfTpS5W5L;
        i = h41Var.GE9mJIPrb8gP;
        if (i != 0) {
        }
        this.giKS3J6vZuNy += ((java.lang.Number) obj2).floatValue();
        return defpackage.gs1.ZpBGe2uQfcn8;
    }

    public m50(int i, defpackage.pi piVar) {
        this.ZpBGe2uQfcn8 = i;
        this.fWTAfUmVKrZq = piVar;
    }
}
