package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p61 implements defpackage.cd1 {
    public final defpackage.gm JhCgjQRTAOCT;
    public final defpackage.gm ZpBGe2uQfcn8;
    public final defpackage.gm fWTAfUmVKrZq;
    public final defpackage.gm giKS3J6vZuNy;

    public p61(defpackage.gm gmVar, defpackage.gm gmVar2, defpackage.gm gmVar3, defpackage.gm gmVar4) {
        this.ZpBGe2uQfcn8 = gmVar;
        this.giKS3J6vZuNy = gmVar2;
        this.fWTAfUmVKrZq = gmVar3;
        this.JhCgjQRTAOCT = gmVar4;
    }

    public static defpackage.p61 giKS3J6vZuNy(defpackage.p61 p61Var, defpackage.gm gmVar, defpackage.gm gmVar2, defpackage.gm gmVar3, defpackage.gm gmVar4, int i) {
        if ((i & 1) != 0) {
            gmVar = p61Var.ZpBGe2uQfcn8;
        }
        if ((i & 2) != 0) {
            gmVar2 = p61Var.giKS3J6vZuNy;
        }
        if ((i & 4) != 0) {
            gmVar3 = p61Var.fWTAfUmVKrZq;
        }
        if ((i & 8) != 0) {
            gmVar4 = p61Var.JhCgjQRTAOCT;
        }
        p61Var.getClass();
        return new defpackage.p61(gmVar, gmVar2, gmVar3, gmVar4);
    }

    @Override // defpackage.cd1
    public final defpackage.j80 ZpBGe2uQfcn8(long j, defpackage.sc0 sc0Var, defpackage.hp hpVar) {
        float ZpBGe2uQfcn8 = this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(j, hpVar);
        float ZpBGe2uQfcn82 = this.giKS3J6vZuNy.ZpBGe2uQfcn8(j, hpVar);
        float ZpBGe2uQfcn83 = this.fWTAfUmVKrZq.ZpBGe2uQfcn8(j, hpVar);
        float ZpBGe2uQfcn84 = this.JhCgjQRTAOCT.ZpBGe2uQfcn8(j, hpVar);
        float giKS3J6vZuNy = defpackage.ae1.giKS3J6vZuNy(j);
        float f = ZpBGe2uQfcn8 + ZpBGe2uQfcn84;
        if (f > giKS3J6vZuNy) {
            float f2 = giKS3J6vZuNy / f;
            ZpBGe2uQfcn8 *= f2;
            ZpBGe2uQfcn84 *= f2;
        }
        float f3 = ZpBGe2uQfcn82 + ZpBGe2uQfcn83;
        if (f3 > giKS3J6vZuNy) {
            float f4 = giKS3J6vZuNy / f3;
            ZpBGe2uQfcn82 *= f4;
            ZpBGe2uQfcn83 *= f4;
        }
        if (ZpBGe2uQfcn8 < 0.0f || ZpBGe2uQfcn82 < 0.0f || ZpBGe2uQfcn83 < 0.0f || ZpBGe2uQfcn84 < 0.0f) {
            defpackage.h80.ZpBGe2uQfcn8("Corner size in Px can't be negative(topStart = " + ZpBGe2uQfcn8 + ", topEnd = " + ZpBGe2uQfcn82 + ", bottomEnd = " + ZpBGe2uQfcn83 + ", bottomStart = " + ZpBGe2uQfcn84 + ")!");
        }
        if (ZpBGe2uQfcn8 + ZpBGe2uQfcn82 + ZpBGe2uQfcn83 + ZpBGe2uQfcn84 == 0.0f) {
            return new defpackage.iv0(defpackage.n70.oh71FJcDz6S2(0L, j));
        }
        defpackage.s31 oh71FJcDz6S2 = defpackage.n70.oh71FJcDz6S2(0L, j);
        defpackage.sc0 sc0Var2 = defpackage.sc0.WDYagTQQm9ns;
        float f5 = sc0Var == sc0Var2 ? ZpBGe2uQfcn8 : ZpBGe2uQfcn82;
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(f5) << 32) | (java.lang.Float.floatToRawIntBits(f5) & 4294967295L);
        if (sc0Var == sc0Var2) {
            ZpBGe2uQfcn8 = ZpBGe2uQfcn82;
        }
        long floatToRawIntBits2 = (java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn8) << 32) | (java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn8) & 4294967295L);
        float f6 = sc0Var == sc0Var2 ? ZpBGe2uQfcn83 : ZpBGe2uQfcn84;
        long floatToRawIntBits3 = (java.lang.Float.floatToRawIntBits(f6) << 32) | (java.lang.Float.floatToRawIntBits(f6) & 4294967295L);
        if (sc0Var != sc0Var2) {
            ZpBGe2uQfcn84 = ZpBGe2uQfcn83;
        }
        return new defpackage.jv0(new defpackage.n61(oh71FJcDz6S2.ZpBGe2uQfcn8, oh71FJcDz6S2.giKS3J6vZuNy, oh71FJcDz6S2.fWTAfUmVKrZq, oh71FJcDz6S2.JhCgjQRTAOCT, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn84) << 32) | (java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn84) & 4294967295L)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.p61)) {
            return false;
        }
        defpackage.p61 p61Var = (defpackage.p61) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, p61Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, p61Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, p61Var.fWTAfUmVKrZq) && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, p61Var.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        return this.JhCgjQRTAOCT.hashCode() + ((this.fWTAfUmVKrZq.hashCode() + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "RoundedCornerShape(topStart = " + this.ZpBGe2uQfcn8 + ", topEnd = " + this.giKS3J6vZuNy + ", bottomEnd = " + this.fWTAfUmVKrZq + ", bottomStart = " + this.JhCgjQRTAOCT + ')';
    }
}
