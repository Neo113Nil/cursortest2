package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class bk implements defpackage.n10 {
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ boolean oh71FJcDz6S2;

    public /* synthetic */ bk(defpackage.dk dkVar, boolean z) {
        this.WDYagTQQm9ns = 0;
        this.QiMR8OkAhezm = dkVar;
        this.oh71FJcDz6S2 = z;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        defpackage.co0 e6mdH7fiFuta;
        int i = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj = this.QiMR8OkAhezm;
        boolean z = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.dk dkVar = (defpackage.dk) obj;
                java.lang.String str = z ? "reader" : "writer";
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                dkVar.oh71FJcDz6S2.JhCgjQRTAOCT(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                dkVar.WDYagTQQm9ns.JhCgjQRTAOCT(sb);
                try {
                    defpackage.b80.IBvW5fLsPuHy(sb.toString(), 5);
                    throw null;
                } catch (android.database.SQLException e) {
                    int i2 = dkVar.Ns0WNyEWdPsk;
                    if (i2 == 1) {
                        throw e;
                    }
                    if (i2 == 2) {
                        e.printStackTrace();
                    }
                    return gs1Var;
                }
            case 1:
                defpackage.n10 n10Var = (defpackage.n10) obj;
                if (z) {
                    n10Var.ZpBGe2uQfcn8();
                }
                return gs1Var;
            case 2:
                defpackage.f2 f2Var = (defpackage.f2) obj;
                if (z && (e6mdH7fiFuta = f2Var.e6mdH7fiFuta()) != null) {
                    ((defpackage.md1) e6mdH7fiFuta).WmetiUbpKU9I(gs1Var);
                }
                return gs1Var;
            case 3:
                defpackage.iz izVar = (defpackage.iz) obj;
                if (z) {
                    defpackage.iz.ZpBGe2uQfcn8(izVar);
                }
                return gs1Var;
            default:
                defpackage.xp0 xp0Var = (defpackage.xp0) obj;
                if (z) {
                    android.content.Context context = xp0Var.ZpBGe2uQfcn8;
                    defpackage.gh ghVar = context instanceof defpackage.gh ? (defpackage.gh) context : null;
                    if (ghVar != null) {
                        ghVar.finish();
                    }
                } else {
                    xp0Var.ZpBGe2uQfcn8(defpackage.v50.INSTANCE, new defpackage.awuGf4qH8HFd(21));
                }
                return gs1Var;
        }
    }

    public /* synthetic */ bk(boolean z, java.lang.Object obj, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = z;
        this.QiMR8OkAhezm = obj;
    }
}
