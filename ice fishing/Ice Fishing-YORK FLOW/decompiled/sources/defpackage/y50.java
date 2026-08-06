package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class y50 {
    public static final java.util.List ZpBGe2uQfcn8 = defpackage.ma0.oCu53ZX2v4Ju("Sharing", "Seasonal", "Regional");
    public static final java.util.List giKS3J6vZuNy = defpackage.ma0.oCu53ZX2v4Ju(new defpackage.tw("🥘", "Paella was born in Valencia and was originally a farmers lunch cooked over open fire"), new defpackage.tw("🥣", "Gazpacho is served cold and dates back to Roman times in Andalusia"), new defpackage.tw("🥩", "Jamon Iberico can age up to four years before it reaches the table"), new defpackage.tw("🍷", "Tapas culture started as small snacks placed over wine glasses in busy bars"));
    public static final java.util.List fWTAfUmVKrZq = defpackage.ma0.oCu53ZX2v4Ju(new defpackage.jo1("🍅", "Start with lighter tapas like pan con tomate before heavier meat dishes"), new defpackage.jo1("🍽", "Share plates with friends — Spanish dining is meant to be social"), new defpackage.jo1("🗺", "Try one dish from each region to taste Spain beyond the classics"), new defpackage.jo1("🦐", "Order seafood on the coast and hearty stews inland for the best match"));

    public static final void ZpBGe2uQfcn8(defpackage.z50 z50Var, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(-1721762009);
        int i2 = i | 2;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            e30Var.CZa7MwI9IzLd();
            if ((i & 1) == 0 || e30Var.oCu53ZX2v4Ju()) {
                defpackage.ru1 ZpBGe2uQfcn82 = defpackage.mi0.ZpBGe2uQfcn8(e30Var);
                if (ZpBGe2uQfcn82 == null) {
                    defpackage.h7.P05cfTpS5W5L("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                z50Var = (defpackage.z50) defpackage.vx1.BXaznwstz2U0(defpackage.b41.ZpBGe2uQfcn8(defpackage.z50.class), ZpBGe2uQfcn82.WDYagTQQm9ns(), defpackage.jr0.ZVVdXbWmyCSK(ZpBGe2uQfcn82), defpackage.fc0.ZpBGe2uQfcn8(e30Var));
            } else {
                e30Var.Jkfc0NcwyPL8();
            }
            defpackage.z50 z50Var2 = z50Var;
            e30Var.WmetiUbpKU9I();
            defpackage.t80.fWTAfUmVKrZq(null, defpackage.nn.OcTWLQzke1i2(-1871275696, new defpackage.w50(z50Var2), e30Var), e30Var, 48);
            com.ice.fishing.wolberta.data.local.Item item = (com.ice.fishing.wolberta.data.local.Item) z50Var2.JhCgjQRTAOCT.getValue();
            boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(z50Var2);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (P05cfTpS5W5L || GcLuU6pT9wO9 == pa1Var) {
                defpackage.j jVar = new defpackage.j(0, z50Var2, defpackage.z50.class, "dismiss", "dismiss()V", 0, 0, 4);
                e30Var.EgL5gQQnyJKX(jVar);
                GcLuU6pT9wO9 = jVar;
            }
            defpackage.n10 n10Var = (defpackage.n10) ((defpackage.n20) GcLuU6pT9wO9);
            boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(z50Var2);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO92 == pa1Var) {
                defpackage.WDYagTQQm9ns wDYagTQQm9ns = new defpackage.WDYagTQQm9ns(1, z50Var2, defpackage.z50.class, "toggleMark", "toggleMark(Lcom/ice/fishing/wolberta/data/local/Item;)V", 0, 0, 1);
                e30Var.EgL5gQQnyJKX(wDYagTQQm9ns);
                GcLuU6pT9wO92 = wDYagTQQm9ns;
            }
            defpackage.jr0.giKS3J6vZuNy(item, n10Var, (defpackage.y10) ((defpackage.n20) GcLuU6pT9wO92), e30Var, com.ice.fishing.wolberta.data.local.Item.$stable);
            z50Var = z50Var2;
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.w50(z50Var, i);
        }
    }
}
