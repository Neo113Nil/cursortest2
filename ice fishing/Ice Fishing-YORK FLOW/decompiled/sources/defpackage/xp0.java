package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xp0 {
    public final android.app.Activity JhCgjQRTAOCT;
    public final boolean QiMR8OkAhezm;
    public boolean WDYagTQQm9ns;
    public final android.content.Context ZpBGe2uQfcn8;
    public final defpackage.r1 fWTAfUmVKrZq;
    public final defpackage.ep0 giKS3J6vZuNy;
    public final defpackage.a9 oh71FJcDz6S2;

    public xp0(android.content.Context context) {
        java.lang.Object obj;
        context.getClass();
        this.ZpBGe2uQfcn8 = context;
        this.giKS3J6vZuNy = new defpackage.ep0(this, new defpackage.bp0(this, 0));
        this.fWTAfUmVKrZq = new defpackage.r1(context, 2);
        java.util.Iterator it = defpackage.fc1.GcLuU6pT9wO9(context, new defpackage.awuGf4qH8HFd(25)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((android.content.Context) obj) instanceof android.app.Activity) {
                    break;
                }
            }
        }
        this.JhCgjQRTAOCT = (android.app.Activity) obj;
        int i = 1;
        this.oh71FJcDz6S2 = new defpackage.a9(i, this);
        this.QiMR8OkAhezm = true;
        defpackage.zq0 zq0Var = this.giKS3J6vZuNy.BHfvd2J71qpO;
        zq0Var.ZpBGe2uQfcn8(new defpackage.wp0(zq0Var));
        this.giKS3J6vZuNy.BHfvd2J71qpO.ZpBGe2uQfcn8(new defpackage.ZdAZC2JJ1p6Z(this.ZpBGe2uQfcn8));
        new defpackage.ti1(new defpackage.bp0(this, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ZpBGe2uQfcn8(java.lang.Object obj, defpackage.y10 y10Var) {
        java.lang.String str;
        obj.getClass();
        defpackage.ep0 ep0Var = this.giKS3J6vZuNy;
        ep0Var.getClass();
        defpackage.jq0 Fu5WBEia9jBo = defpackage.wc1.Fu5WBEia9jBo(y10Var);
        obj.getClass();
        int oCu53ZX2v4Ju = defpackage.w60.oCu53ZX2v4Ju(defpackage.t80.BXaznwstz2U0(defpackage.b41.ZpBGe2uQfcn8(obj.getClass())));
        defpackage.rp0 rp0Var = ep0Var.fWTAfUmVKrZq;
        if (rp0Var != null) {
            defpackage.np0 JhCgjQRTAOCT = defpackage.ep0.JhCgjQRTAOCT(oCu53ZX2v4Ju, rp0Var, null, true);
            if (JhCgjQRTAOCT != null) {
                java.util.Map giKS3J6vZuNy = JhCgjQRTAOCT.giKS3J6vZuNy();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.jk0.zJPqDeoF0Os1(giKS3J6vZuNy.size()));
                for (java.util.Map.Entry entry : giKS3J6vZuNy.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((defpackage.wo0) entry.getValue()).ZpBGe2uQfcn8);
                }
                str = defpackage.w60.dG7RjM6DqYVL(obj, linkedHashMap);
                if (ep0Var.fWTAfUmVKrZq != null) {
                    throw new java.lang.IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + ep0Var + '.').toString());
                }
                defpackage.rp0 P05cfTpS5W5L = ep0Var.P05cfTpS5W5L();
                defpackage.mp0 WDYagTQQm9ns = P05cfTpS5W5L.WDYagTQQm9ns(str, true, P05cfTpS5W5L);
                if (WDYagTQQm9ns == null) {
                    throw new java.lang.IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + ep0Var.fWTAfUmVKrZq);
                }
                defpackage.np0 np0Var = WDYagTQQm9ns.WDYagTQQm9ns;
                android.os.Bundle ZpBGe2uQfcn8 = np0Var.ZpBGe2uQfcn8(WDYagTQQm9ns.oh71FJcDz6S2);
                if (ZpBGe2uQfcn8 == null) {
                    ZpBGe2uQfcn8 = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
                }
                int i = defpackage.np0.e6mdH7fiFuta;
                java.lang.String str2 = (java.lang.String) np0Var.oh71FJcDz6S2.WDYagTQQm9ns;
                android.net.Uri parse = android.net.Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
                parse.getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                ZpBGe2uQfcn8.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                ep0Var.GE9mJIPrb8gP(np0Var, ZpBGe2uQfcn8, Fu5WBEia9jBo);
                return;
            }
            defpackage.h7.GE9mJIPrb8gP("Destination with route ", defpackage.b41.ZpBGe2uQfcn8(obj.getClass()).fWTAfUmVKrZq(), " cannot be found in navigation graph ", ep0Var.fWTAfUmVKrZq);
        } else {
            defpackage.h7.P05cfTpS5W5L("You must call setGraph() before calling getGraph()");
        }
        str = null;
        if (ep0Var.fWTAfUmVKrZq != null) {
        }
    }
}
