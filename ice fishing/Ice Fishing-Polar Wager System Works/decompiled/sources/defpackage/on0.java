package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class on0 implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.rz0 xiZrDbcSW0;

    public /* synthetic */ on0(int i, defpackage.rz0 rz0Var) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = rz0Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.rz0 rz0Var = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                java.lang.Object obj2 = rz0Var.adDC3e2L;
                return java.lang.Boolean.valueOf(obj2 == null || !((android.os.Bundle) obj2).containsKey(str));
            default:
                defpackage.ui1 ui1Var = (defpackage.ui1) obj;
                ui1Var.getClass();
                defpackage.ec0 ec0Var = ((defpackage.wi1) ui1Var).EgCjBq0SZwJ;
                java.util.List list = (java.util.List) rz0Var.adDC3e2L;
                if (list != null) {
                    list.add(ec0Var);
                } else {
                    list = defpackage.fm.wll2JLbTBC2(ec0Var);
                }
                rz0Var.adDC3e2L = list;
                return defpackage.ti1.xiZrDbcSW0;
        }
    }
}
