package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements defpackage.e20 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ p2(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    @Override // defpackage.e20
    public final java.lang.Object h3m55N1URyyK(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj5 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.q2 q2Var = (defpackage.q2) obj5;
                defpackage.er1 giKS3J6vZuNy = ((defpackage.wz) q2Var.WDYagTQQm9ns).giKS3J6vZuNy((defpackage.vz) obj, (defpackage.w00) obj2, ((defpackage.s00) obj3).ZpBGe2uQfcn8, ((defpackage.t00) obj4).ZpBGe2uQfcn8);
                if (giKS3J6vZuNy instanceof defpackage.dr1) {
                    java.lang.Object obj6 = ((defpackage.dr1) giKS3J6vZuNy).WDYagTQQm9ns;
                    obj6.getClass();
                    return (android.graphics.Typeface) obj6;
                }
                defpackage.a7 a7Var = new defpackage.a7(giKS3J6vZuNy, q2Var.GE9mJIPrb8gP);
                q2Var.GE9mJIPrb8gP = a7Var;
                java.lang.Object obj7 = a7Var.JhCgjQRTAOCT;
                obj7.getClass();
                return (android.graphics.Typeface) obj7;
            case 1:
                android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver = (android.database.sqlite.SQLiteCursorDriver) obj2;
                java.lang.String str = (java.lang.String) obj3;
                android.database.sqlite.SQLiteQuery sQLiteQuery = (android.database.sqlite.SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                defpackage.k10 k10Var = new defpackage.k10(sQLiteQuery);
                defpackage.di1 di1Var = (defpackage.di1) ((defpackage.ci1) obj5).oh71FJcDz6S2;
                int length = di1Var.P05cfTpS5W5L.length;
                for (int i2 = 1; i2 < length; i2++) {
                    int i3 = di1Var.P05cfTpS5W5L[i2];
                    if (i3 == 1) {
                        k10Var.ZpBGe2uQfcn8(i2, di1Var.e6mdH7fiFuta[i2]);
                    } else if (i3 == 2) {
                        k10Var.P05cfTpS5W5L(di1Var.GE9mJIPrb8gP[i2], i2);
                    } else if (i3 == 3) {
                        java.lang.String str2 = di1Var.Ns0WNyEWdPsk[i2];
                        str2.getClass();
                        k10Var.VFeft99leXEK(str2, i2);
                    } else if (i3 == 4) {
                        byte[] bArr = di1Var.fNwYGHIYeJcR[i2];
                        bArr.getClass();
                        k10Var.IJ0hOnjhPOri(i2, bArr);
                    } else if (i3 == 5) {
                        k10Var.GE9mJIPrb8gP(i2);
                    }
                }
                return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                defpackage.nh nhVar = (defpackage.nh) obj5;
                defpackage.de0 de0Var = (defpackage.de0) obj;
                ((java.lang.Integer) obj2).getClass();
                defpackage.e30 e30Var = (defpackage.e30) obj3;
                int intValue = ((java.lang.Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= e30Var.oh71FJcDz6S2(de0Var) ? 4 : 2;
                }
                if (e30Var.zJPqDeoF0Os1(intValue & 1, (intValue & 131) != 130)) {
                    nhVar.JhCgjQRTAOCT(de0Var, e30Var, java.lang.Integer.valueOf(intValue & 14));
                } else {
                    e30Var.Jkfc0NcwyPL8();
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
        }
    }
}
