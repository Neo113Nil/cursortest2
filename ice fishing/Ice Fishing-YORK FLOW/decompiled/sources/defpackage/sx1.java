package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class sx1 {
    public static final android.view.ViewGroup.LayoutParams ZpBGe2uQfcn8 = new android.view.ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.qx1 ZpBGe2uQfcn8(defpackage.XntWc4eZSQ8j xntWc4eZSQ8j, defpackage.aj ajVar, defpackage.nh nhVar) {
        defpackage.u uVar;
        defpackage.qx1 qx1Var;
        java.lang.Object[] objArr = 0;
        if (defpackage.v30.ZpBGe2uQfcn8.compareAndSet(false, true)) {
            defpackage.dc giKS3J6vZuNy = defpackage.ok0.giKS3J6vZuNy(1, 6, null);
            defpackage.ok0.zJPqDeoF0Os1(defpackage.ok0.QiMR8OkAhezm((defpackage.jm) defpackage.o4.WmetiUbpKU9I.getValue()), null, new defpackage.oh71FJcDz6S2(giKS3J6vZuNy, objArr == true ? 1 : 0, 7), 3);
            defpackage.YjS0G3zEDWNX yjS0G3zEDWNX = new defpackage.YjS0G3zEDWNX(11, giKS3J6vZuNy);
            synchronized (defpackage.te1.fWTAfUmVKrZq) {
                defpackage.te1.e6mdH7fiFuta = defpackage.hf.lXYSMswtzmix(defpackage.te1.e6mdH7fiFuta, yjS0G3zEDWNX);
            }
            defpackage.te1.ZpBGe2uQfcn8();
        }
        if (xntWc4eZSQ8j.getChildCount() > 0) {
            android.view.View childAt = xntWc4eZSQ8j.getChildAt(0);
            uVar = childAt instanceof defpackage.u ? (defpackage.u) childAt : null;
            if (uVar != null) {
                uVar.setComposeViewContext(ajVar);
                if (uVar == null) {
                    uVar = new defpackage.u(xntWc4eZSQ8j.getContext(), ajVar);
                    xntWc4eZSQ8j.addView(uVar.getView(), ZpBGe2uQfcn8);
                }
                uVar.setComposeViewContext(ajVar);
                if (xntWc4eZSQ8j.getComposeViewContext$ui() != null) {
                    ajVar.fWTAfUmVKrZq();
                    uVar.setComposeViewContextIncrementedDuringInit$ui(true);
                }
                java.lang.Object tag = uVar.getTag(com.ice.fishing.wolberta.R.id.wrapped_composition_tag);
                qx1Var = tag instanceof defpackage.qx1 ? (defpackage.qx1) tag : null;
                if (qx1Var == null) {
                    qx1Var = new defpackage.qx1(uVar, new defpackage.lj(ajVar.giKS3J6vZuNy, new defpackage.bs1(uVar.getRoot())));
                    uVar.setTag(com.ice.fishing.wolberta.R.id.wrapped_composition_tag, qx1Var);
                }
                qx1Var.fWTAfUmVKrZq(nhVar);
                uVar.setFrameEndScheduler$ui(new defpackage.rx1(ajVar.giKS3J6vZuNy));
                return qx1Var;
            }
        } else {
            xntWc4eZSQ8j.removeAllViews();
        }
        uVar = null;
        if (uVar == null) {
        }
        uVar.setComposeViewContext(ajVar);
        if (xntWc4eZSQ8j.getComposeViewContext$ui() != null) {
        }
        java.lang.Object tag2 = uVar.getTag(com.ice.fishing.wolberta.R.id.wrapped_composition_tag);
        if (tag2 instanceof defpackage.qx1) {
        }
        if (qx1Var == null) {
        }
        qx1Var.fWTAfUmVKrZq(nhVar);
        uVar.setFrameEndScheduler$ui(new defpackage.rx1(ajVar.giKS3J6vZuNy));
        return qx1Var;
    }
}
