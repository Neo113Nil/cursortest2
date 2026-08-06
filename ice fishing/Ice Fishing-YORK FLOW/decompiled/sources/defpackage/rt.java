package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rt {
    public android.widget.EdgeEffect GE9mJIPrb8gP;
    public android.widget.EdgeEffect JhCgjQRTAOCT;
    public android.widget.EdgeEffect Ns0WNyEWdPsk;
    public android.widget.EdgeEffect P05cfTpS5W5L;
    public android.widget.EdgeEffect QiMR8OkAhezm;
    public android.widget.EdgeEffect WDYagTQQm9ns;
    public final android.content.Context ZpBGe2uQfcn8;
    public android.widget.EdgeEffect e6mdH7fiFuta;
    public long fWTAfUmVKrZq = 0;
    public final int giKS3J6vZuNy;
    public android.widget.EdgeEffect oh71FJcDz6S2;

    public rt(android.content.Context context, int i) {
        this.ZpBGe2uQfcn8 = context;
        this.giKS3J6vZuNy = i;
    }

    public static boolean QiMR8OkAhezm(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((android.os.Build.VERSION.SDK_INT >= 31 ? defpackage.s6.fWTAfUmVKrZq(edgeEffect) : 0.0f) == 0.0f);
    }

    public static boolean oh71FJcDz6S2(android.widget.EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final android.widget.EdgeEffect JhCgjQRTAOCT() {
        android.widget.EdgeEffect edgeEffect = this.QiMR8OkAhezm;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect ZpBGe2uQfcn8 = ZpBGe2uQfcn8(defpackage.fv0.oh71FJcDz6S2);
        this.QiMR8OkAhezm = ZpBGe2uQfcn8;
        return ZpBGe2uQfcn8;
    }

    public final android.widget.EdgeEffect WDYagTQQm9ns() {
        android.widget.EdgeEffect edgeEffect = this.JhCgjQRTAOCT;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect ZpBGe2uQfcn8 = ZpBGe2uQfcn8(defpackage.fv0.WDYagTQQm9ns);
        this.JhCgjQRTAOCT = ZpBGe2uQfcn8;
        return ZpBGe2uQfcn8;
    }

    public final android.widget.EdgeEffect ZpBGe2uQfcn8(defpackage.fv0 fv0Var) {
        int i = android.os.Build.VERSION.SDK_INT;
        android.content.Context context = this.ZpBGe2uQfcn8;
        android.widget.EdgeEffect ZpBGe2uQfcn8 = i >= 31 ? defpackage.s6.ZpBGe2uQfcn8(context) : new defpackage.w30(context);
        ZpBGe2uQfcn8.setColor(this.giKS3J6vZuNy);
        if (!defpackage.u90.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, 0L)) {
            long j = this.fWTAfUmVKrZq;
            if (fv0Var == defpackage.fv0.WDYagTQQm9ns) {
                ZpBGe2uQfcn8.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return ZpBGe2uQfcn8;
            }
            ZpBGe2uQfcn8.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return ZpBGe2uQfcn8;
    }

    public final android.widget.EdgeEffect fWTAfUmVKrZq() {
        android.widget.EdgeEffect edgeEffect = this.oh71FJcDz6S2;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect ZpBGe2uQfcn8 = ZpBGe2uQfcn8(defpackage.fv0.oh71FJcDz6S2);
        this.oh71FJcDz6S2 = ZpBGe2uQfcn8;
        return ZpBGe2uQfcn8;
    }

    public final android.widget.EdgeEffect giKS3J6vZuNy() {
        android.widget.EdgeEffect edgeEffect = this.WDYagTQQm9ns;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        android.widget.EdgeEffect ZpBGe2uQfcn8 = ZpBGe2uQfcn8(defpackage.fv0.WDYagTQQm9ns);
        this.WDYagTQQm9ns = ZpBGe2uQfcn8;
        return ZpBGe2uQfcn8;
    }
}
