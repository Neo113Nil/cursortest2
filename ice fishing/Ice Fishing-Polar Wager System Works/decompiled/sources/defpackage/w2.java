package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements defpackage.m00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ w2(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    @Override // defpackage.m00
    public final java.lang.Object riuEU0zW4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i = this.adDC3e2L;
        java.lang.Object obj5 = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.x2 x2Var = (defpackage.x2) obj5;
                defpackage.zj1 oh6vYeIP = ((defpackage.oy) x2Var.adDC3e2L).oh6vYeIP((defpackage.ne1) obj, (defpackage.dz) obj2, ((defpackage.bz) obj3).IHQe1A4L2xu, ((defpackage.cz) obj4).IHQe1A4L2xu);
                if (oh6vYeIP instanceof defpackage.zj1) {
                    java.lang.Object obj6 = oh6vYeIP.adDC3e2L;
                    obj6.getClass();
                    return (android.graphics.Typeface) obj6;
                }
                defpackage.v5 v5Var = new defpackage.v5(oh6vYeIP, x2Var.SH1y5HwkJhh);
                x2Var.SH1y5HwkJhh = v5Var;
                java.lang.Object obj7 = v5Var.F7NU4MC0GW;
                obj7.getClass();
                return (android.graphics.Typeface) obj7;
            case 1:
                android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver = (android.database.sqlite.SQLiteCursorDriver) obj2;
                java.lang.String str = (java.lang.String) obj3;
                android.database.sqlite.SQLiteQuery sQLiteQuery = (android.database.sqlite.SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                defpackage.sz szVar = new defpackage.sz(sQLiteQuery);
                defpackage.rd1 rd1Var = (defpackage.rd1) ((defpackage.sa1) obj5).xiZrDbcSW0;
                int length = rd1Var.EXtogiMhuM.length;
                for (int i2 = 1; i2 < length; i2++) {
                    int i3 = rd1Var.EXtogiMhuM[i2];
                    if (i3 == 1) {
                        szVar.IHQe1A4L2xu(i2, rd1Var.riuEU0zW4[i2]);
                    } else if (i3 == 2) {
                        szVar.EXtogiMhuM(rd1Var.SH1y5HwkJhh[i2], i2);
                    } else if (i3 == 3) {
                        java.lang.String str2 = rd1Var.ez2rX8ReCYw[i2];
                        str2.getClass();
                        szVar.abhbClRa(str2, i2);
                    } else if (i3 == 4) {
                        byte[] bArr = rd1Var.JlrlGoKF[i2];
                        bArr.getClass();
                        szVar.fnWB2E7cs(i2, bArr);
                    } else if (i3 == 5) {
                        szVar.SH1y5HwkJhh(i2);
                    }
                }
                return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                defpackage.sf sfVar = (defpackage.sf) obj5;
                defpackage.hb0 hb0Var = (defpackage.hb0) obj;
                ((java.lang.Integer) obj2).getClass();
                defpackage.t10 t10Var = (defpackage.t10) obj3;
                int intValue = ((java.lang.Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= t10Var.xiZrDbcSW0(hb0Var) ? 4 : 2;
                }
                if (t10Var.lpprD5VAS(intValue & 1, (intValue & 131) != 130)) {
                    sfVar.F7NU4MC0GW(hb0Var, t10Var, java.lang.Integer.valueOf(intValue & 14));
                } else {
                    t10Var.WLpAkxCo();
                }
                return defpackage.ok1.IHQe1A4L2xu;
        }
    }
}
