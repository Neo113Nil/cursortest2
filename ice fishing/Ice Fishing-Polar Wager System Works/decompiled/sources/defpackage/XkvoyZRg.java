package defpackage;

/* loaded from: classes.dex */
public final class XkvoyZRg implements defpackage.a20 {
    public final com.corsair.ledger.MainActivity AARZUJiTa;
    public final defpackage.MFAZMTmYMf3 EXtogiMhuM;
    public volatile defpackage.tk adDC3e2L;
    public defpackage.t21 riuEU0zW4;
    public final java.lang.Object xiZrDbcSW0 = new java.lang.Object();

    public XkvoyZRg(com.corsair.ledger.MainActivity mainActivity) {
        this.AARZUJiTa = mainActivity;
        this.EXtogiMhuM = new defpackage.MFAZMTmYMf3(mainActivity);
    }

    @Override // defpackage.a20
    public final java.lang.Object F7NU4MC0GW() {
        if (this.adDC3e2L == null) {
            synchronized (this.xiZrDbcSW0) {
                try {
                    if (this.adDC3e2L == null) {
                        this.adDC3e2L = IHQe1A4L2xu();
                    }
                } finally {
                }
            }
        }
        return this.adDC3e2L;
    }

    public final defpackage.tk IHQe1A4L2xu() {
        java.lang.String str;
        com.corsair.ledger.MainActivity mainActivity = this.AARZUJiTa;
        if (mainActivity.getApplication() instanceof defpackage.a20) {
            defpackage.vk vkVar = (defpackage.vk) ((defpackage.xp7x2U2iUl) defpackage.w70.PAEGRtP0bX(this.EXtogiMhuM, defpackage.xp7x2U2iUl.class));
            return new defpackage.tk(vkVar.IHQe1A4L2xu, vkVar.oh6vYeIP);
        }
        if (android.app.Application.class.equals(mainActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + mainActivity.getApplication().getClass();
        }
        throw new java.lang.IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }
}
