package defpackage;

/* loaded from: classes.dex */
public final class MFAZMTmYMf3 implements defpackage.a20 {
    public volatile defpackage.vk AARZUJiTa;
    public final java.lang.Object EXtogiMhuM = new java.lang.Object();
    public final com.corsair.ledger.MainActivity adDC3e2L;
    public final com.corsair.ledger.MainActivity xiZrDbcSW0;

    public MFAZMTmYMf3(com.corsair.ledger.MainActivity mainActivity) {
        this.adDC3e2L = mainActivity;
        this.xiZrDbcSW0 = mainActivity;
    }

    @Override // defpackage.a20
    public final java.lang.Object F7NU4MC0GW() {
        if (this.AARZUJiTa == null) {
            synchronized (this.EXtogiMhuM) {
                try {
                    if (this.AARZUJiTa == null) {
                        com.corsair.ledger.MainActivity mainActivity = this.adDC3e2L;
                        defpackage.QuX7t5UZl9 quX7t5UZl9 = new defpackage.QuX7t5UZl9(0, this.xiZrDbcSW0);
                        defpackage.bn1 AARZUJiTa = mainActivity.AARZUJiTa();
                        defpackage.fk QQUzIjv3iOC5 = defpackage.x80.QQUzIjv3iOC5(mainActivity);
                        QQUzIjv3iOC5.getClass();
                        defpackage.y yVar = new defpackage.y(AARZUJiTa, quX7t5UZl9, QQUzIjv3iOC5);
                        defpackage.xc IHQe1A4L2xu = defpackage.sz0.IHQe1A4L2xu(defpackage.GhHh9OOt4I.class);
                        java.lang.String oh6vYeIP = IHQe1A4L2xu.oh6vYeIP();
                        if (oh6vYeIP == null) {
                            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.AARZUJiTa = ((defpackage.GhHh9OOt4I) yVar.DFo87pBq1E5(IHQe1A4L2xu, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(oh6vYeIP))).oh6vYeIP;
                    }
                } finally {
                }
            }
        }
        return this.AARZUJiTa;
    }
}
