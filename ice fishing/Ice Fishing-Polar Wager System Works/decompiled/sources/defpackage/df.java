package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class df implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ com.corsair.ledger.MainActivity xiZrDbcSW0;

    public /* synthetic */ df(com.corsair.ledger.MainActivity mainActivity, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = mainActivity;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        com.corsair.ledger.MainActivity mainActivity = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                mainActivity.reportFullyDrawn();
                return defpackage.ok1.IHQe1A4L2xu;
            case 1:
                return new defpackage.uz(mainActivity.SH1y5HwkJhh, new defpackage.df(mainActivity, 0));
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.tp tpVar = new defpackage.tp();
                mainActivity.IHQe1A4L2xu().F7NU4MC0GW(tpVar);
                return tpVar;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.j41(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            default:
                defpackage.tq0 tq0Var = new defpackage.tq0(new defpackage.cnag84Bm(3, mainActivity));
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    if (defpackage.x70.QoRHpC4k(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        mainActivity.adDC3e2L.IHQe1A4L2xu(new defpackage.ef(tq0Var, mainActivity));
                    } else {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.l1(1, mainActivity, tq0Var));
                    }
                }
                return tq0Var;
        }
    }
}
