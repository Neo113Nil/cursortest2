package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ii0 {
    public static final defpackage.sj ZpBGe2uQfcn8 = new defpackage.sj(new defpackage.n8(29));

    public static defpackage.mt0 ZpBGe2uQfcn8(defpackage.e30 e30Var) {
        defpackage.mt0 mt0Var = (defpackage.mt0) e30Var.GE9mJIPrb8gP(ZpBGe2uQfcn8);
        java.lang.Object obj = null;
        if (mt0Var == null) {
            e30Var.NkfcFfdaVTox(1208426157);
            android.view.View view = (android.view.View) e30Var.GE9mJIPrb8gP(defpackage.j0.oh71FJcDz6S2);
            view.getClass();
            while (true) {
                if (view == null) {
                    mt0Var = null;
                    break;
                }
                java.lang.Object tag = view.getTag(com.ice.fishing.wolberta.R.id.view_tree_on_back_pressed_dispatcher_owner);
                defpackage.mt0 mt0Var2 = tag instanceof defpackage.mt0 ? (defpackage.mt0) tag : null;
                if (mt0Var2 != null) {
                    mt0Var = mt0Var2;
                    break;
                }
                java.lang.Object IJ0hOnjhPOri = defpackage.t80.IJ0hOnjhPOri(view);
                view = IJ0hOnjhPOri instanceof android.view.View ? (android.view.View) IJ0hOnjhPOri : null;
            }
        } else {
            e30Var.NkfcFfdaVTox(1208423708);
        }
        e30Var.XntWc4eZSQ8j(false);
        if (mt0Var != null) {
            e30Var.NkfcFfdaVTox(1208423789);
            e30Var.XntWc4eZSQ8j(false);
            return mt0Var;
        }
        e30Var.NkfcFfdaVTox(1208428160);
        android.content.Context context = (android.content.Context) e30Var.GE9mJIPrb8gP(defpackage.j0.giKS3J6vZuNy);
        while (true) {
            if (!(context instanceof android.content.ContextWrapper)) {
                break;
            }
            if (context instanceof defpackage.mt0) {
                obj = context;
                break;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        defpackage.mt0 mt0Var3 = (defpackage.mt0) obj;
        e30Var.XntWc4eZSQ8j(false);
        return mt0Var3;
    }
}
