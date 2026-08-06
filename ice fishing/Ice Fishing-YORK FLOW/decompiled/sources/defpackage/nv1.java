package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nv1 extends android.view.WindowInsetsAnimation$Callback {
    public final java.util.HashMap JhCgjQRTAOCT;
    public final defpackage.hv1 ZpBGe2uQfcn8;
    public java.util.ArrayList fWTAfUmVKrZq;
    public java.util.List giKS3J6vZuNy;

    public nv1(defpackage.hv1 hv1Var) {
        super(hv1Var.oh71FJcDz6S2);
        this.JhCgjQRTAOCT = new java.util.HashMap();
        this.ZpBGe2uQfcn8 = hv1Var;
    }

    public final defpackage.qv1 ZpBGe2uQfcn8(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        java.util.HashMap hashMap = this.JhCgjQRTAOCT;
        defpackage.qv1 qv1Var = (defpackage.qv1) hashMap.get(windowInsetsAnimation);
        if (qv1Var != null) {
            return qv1Var;
        }
        defpackage.qv1 qv1Var2 = new defpackage.qv1(0, null, 0L);
        qv1Var2.ZpBGe2uQfcn8 = new defpackage.ov1(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, qv1Var2);
        return qv1Var2;
    }

    public final void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.ZpBGe2uQfcn8.giKS3J6vZuNy(ZpBGe2uQfcn8(windowInsetsAnimation));
        this.JhCgjQRTAOCT.remove(windowInsetsAnimation);
    }

    public final void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.ZpBGe2uQfcn8.fWTAfUmVKrZq(ZpBGe2uQfcn8(windowInsetsAnimation));
    }

    public final android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List list) {
        float fraction;
        java.util.ArrayList arrayList = this.fWTAfUmVKrZq;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            this.fWTAfUmVKrZq = arrayList2;
            this.giKS3J6vZuNy = java.util.Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            android.view.WindowInsetsAnimation GE9mJIPrb8gP = defpackage.fhbmYuu9J3cT.GE9mJIPrb8gP(list.get(size));
            defpackage.qv1 ZpBGe2uQfcn8 = ZpBGe2uQfcn8(GE9mJIPrb8gP);
            fraction = GE9mJIPrb8gP.getFraction();
            ZpBGe2uQfcn8.ZpBGe2uQfcn8.WDYagTQQm9ns(fraction);
            this.fWTAfUmVKrZq.add(ZpBGe2uQfcn8);
        }
        return this.ZpBGe2uQfcn8.JhCgjQRTAOCT(defpackage.mw1.fWTAfUmVKrZq(windowInsets, null), this.giKS3J6vZuNy).giKS3J6vZuNy();
    }

    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
        defpackage.pd1 WDYagTQQm9ns = this.ZpBGe2uQfcn8.WDYagTQQm9ns(ZpBGe2uQfcn8(windowInsetsAnimation), new defpackage.pd1(bounds));
        WDYagTQQm9ns.getClass();
        defpackage.fhbmYuu9J3cT.gUjdnLbkVAaA();
        return defpackage.fhbmYuu9J3cT.P05cfTpS5W5L(((defpackage.v80) WDYagTQQm9ns.giKS3J6vZuNy).JhCgjQRTAOCT(), ((defpackage.v80) WDYagTQQm9ns.fWTAfUmVKrZq).JhCgjQRTAOCT());
    }
}
