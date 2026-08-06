package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class i3 implements java.util.Comparator {
    public final /* synthetic */ int ZpBGe2uQfcn8;

    public /* synthetic */ i3(int i) {
        this.ZpBGe2uQfcn8 = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                return defpackage.ma0.fNwYGHIYeJcR(((defpackage.d21) obj2).ZpBGe2uQfcn8, ((defpackage.d21) obj).ZpBGe2uQfcn8);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return defpackage.ma0.fNwYGHIYeJcR(((defpackage.ua0) obj).giKS3J6vZuNy, ((defpackage.ua0) obj2).giKS3J6vZuNy);
            case 3:
                defpackage.p90 p90Var = (defpackage.p90) obj;
                defpackage.p90 p90Var2 = (defpackage.p90) obj2;
                return (p90Var.oh71FJcDz6S2 - p90Var.WDYagTQQm9ns) - (p90Var2.oh71FJcDz6S2 - p90Var2.WDYagTQQm9ns);
            case 4:
                defpackage.jd0 jd0Var = (defpackage.jd0) obj;
                defpackage.jd0 jd0Var2 = (defpackage.jd0) obj2;
                float f = jd0Var.BXaznwstz2U0.XntWc4eZSQ8j.KrtOTfE6jiS2;
                float f2 = jd0Var2.BXaznwstz2U0.XntWc4eZSQ8j.KrtOTfE6jiS2;
                return f == f2 ? defpackage.ma0.fNwYGHIYeJcR(jd0Var.maCixPsq4ml2(), jd0Var2.maCixPsq4ml2()) : java.lang.Float.compare(f, f2);
            default:
                return defpackage.ma0.fNwYGHIYeJcR(((defpackage.pf0) obj).ZpBGe2uQfcn8, ((defpackage.pf0) obj2).ZpBGe2uQfcn8);
        }
    }
}
