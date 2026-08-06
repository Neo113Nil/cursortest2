package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zh implements defpackage.vz {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ boolean xiZrDbcSW0;

    public /* synthetic */ zh(int i, java.lang.Object obj, boolean z) {
        this.adDC3e2L = i;
        this.AARZUJiTa = obj;
        this.xiZrDbcSW0 = z;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        boolean z = this.xiZrDbcSW0;
        java.lang.Object obj = this.AARZUJiTa;
        switch (i) {
            case 0:
                defpackage.bi biVar = (defpackage.bi) obj;
                java.lang.String str = z ? "reader" : "writer";
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                biVar.xiZrDbcSW0.F7NU4MC0GW(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                biVar.adDC3e2L.F7NU4MC0GW(sb);
                try {
                    defpackage.a70.SiPhmbmu(sb.toString(), 5);
                    throw null;
                } catch (android.database.SQLException e) {
                    int i2 = biVar.ez2rX8ReCYw;
                    if (i2 == 1) {
                        throw e;
                    }
                    if (i2 == 2) {
                        e.printStackTrace();
                    }
                    return ok1Var;
                }
            case 1:
                com.corsair.ledger.MainActivity mainActivity = (com.corsair.ledger.MainActivity) obj;
                int i3 = com.corsair.ledger.MainActivity.nBH8hAHy;
                android.view.Window window = mainActivity.getWindow();
                mainActivity.getWindow().getDecorView();
                int i4 = android.os.Build.VERSION.SDK_INT;
                defpackage.l80 vo1Var = i4 >= 35 ? new defpackage.vo1(window) : i4 >= 30 ? new defpackage.uo1(window) : i4 >= 26 ? new defpackage.to1(window) : new defpackage.so1(window);
                boolean z2 = !z;
                vo1Var.QQUzIjv3iOC5(z2);
                vo1Var.NHJTzaLwkd(z2);
                return ok1Var;
            default:
                ((defpackage.g00) obj).AARZUJiTa(java.lang.Boolean.valueOf(!z));
                return ok1Var;
        }
    }
}
