package defpackage;

/* loaded from: classes.dex */
public final class tn1 extends android.view.WindowInsetsAnimation$Callback {
    public final java.util.HashMap F7NU4MC0GW;
    public final defpackage.od IHQe1A4L2xu;
    public java.util.List oh6vYeIP;
    public java.util.ArrayList r1MBDhnF;

    public tn1(defpackage.od odVar) {
        super(odVar.adDC3e2L);
        this.F7NU4MC0GW = new java.util.HashMap();
        this.IHQe1A4L2xu = odVar;
    }

    public final defpackage.wn1 IHQe1A4L2xu(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        java.util.HashMap hashMap = this.F7NU4MC0GW;
        defpackage.wn1 wn1Var = (defpackage.wn1) hashMap.get(windowInsetsAnimation);
        if (wn1Var != null) {
            return wn1Var;
        }
        defpackage.wn1 wn1Var2 = new defpackage.wn1(0, null, 0L);
        wn1Var2.IHQe1A4L2xu = new defpackage.un1(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, wn1Var2);
        return wn1Var2;
    }

    public final void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.IHQe1A4L2xu.adDC3e2L(IHQe1A4L2xu(windowInsetsAnimation));
        this.F7NU4MC0GW.remove(windowInsetsAnimation);
    }

    public final void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.IHQe1A4L2xu.xiZrDbcSW0(IHQe1A4L2xu(windowInsetsAnimation));
    }

    public final android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List list) {
        float fraction;
        java.util.ArrayList arrayList = this.r1MBDhnF;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            this.r1MBDhnF = arrayList2;
            this.oh6vYeIP = java.util.Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            android.view.WindowInsetsAnimation SH1y5HwkJhh = defpackage.JcqDrWrgMf.SH1y5HwkJhh(list.get(size));
            defpackage.wn1 IHQe1A4L2xu = IHQe1A4L2xu(SH1y5HwkJhh);
            fraction = SH1y5HwkJhh.getFraction();
            IHQe1A4L2xu.IHQe1A4L2xu.adDC3e2L(fraction);
            this.r1MBDhnF.add(IHQe1A4L2xu);
        }
        return this.IHQe1A4L2xu.AARZUJiTa(defpackage.ro1.r1MBDhnF(windowInsets, null), this.oh6vYeIP).oh6vYeIP();
    }

    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
        defpackage.F7NU4MC0GW EXtogiMhuM = this.IHQe1A4L2xu.EXtogiMhuM(IHQe1A4L2xu(windowInsetsAnimation), new defpackage.F7NU4MC0GW(bounds));
        EXtogiMhuM.getClass();
        defpackage.JcqDrWrgMf.JlrlGoKF();
        return defpackage.JcqDrWrgMf.EXtogiMhuM(((defpackage.i60) EXtogiMhuM.xiZrDbcSW0).F7NU4MC0GW(), ((defpackage.i60) EXtogiMhuM.AARZUJiTa).F7NU4MC0GW());
    }
}
