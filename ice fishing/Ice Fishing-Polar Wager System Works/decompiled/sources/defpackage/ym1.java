package defpackage;

/* loaded from: classes.dex */
public final class ym1 extends defpackage.an1 {
    public static final defpackage.c41 F7NU4MC0GW = new defpackage.c41(16);
    public static defpackage.ym1 r1MBDhnF;
    public final android.app.Application oh6vYeIP;

    public ym1(android.app.Application application) {
        this.oh6vYeIP = application;
    }

    public final defpackage.vm1 F7NU4MC0GW(java.lang.Class cls, android.app.Application application) {
        if (!defpackage.q3.class.isAssignableFrom(cls)) {
            return defpackage.f70.SH1y5HwkJhh(cls);
        }
        try {
            defpackage.vm1 vm1Var = (defpackage.vm1) cls.getConstructor(android.app.Application.class).newInstance(application);
            vm1Var.getClass();
            return vm1Var;
        } catch (java.lang.IllegalAccessException e) {
            defpackage.db.JlrlGoKF("Cannot create an instance of ", cls, e);
            return null;
        } catch (java.lang.InstantiationException e2) {
            defpackage.db.JlrlGoKF("Cannot create an instance of ", cls, e2);
            return null;
        } catch (java.lang.NoSuchMethodException e3) {
            defpackage.db.JlrlGoKF("Cannot create an instance of ", cls, e3);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            defpackage.db.JlrlGoKF("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // defpackage.an1, defpackage.zm1
    public final defpackage.vm1 IHQe1A4L2xu(java.lang.Class cls) {
        android.app.Application application = this.oh6vYeIP;
        if (application != null) {
            return F7NU4MC0GW(cls, application);
        }
        throw new java.lang.UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.an1, defpackage.zm1
    public final defpackage.vm1 oh6vYeIP(java.lang.Class cls, defpackage.uk0 uk0Var) {
        if (this.oh6vYeIP != null) {
            return IHQe1A4L2xu(cls);
        }
        android.app.Application application = (android.app.Application) uk0Var.IHQe1A4L2xu.get(F7NU4MC0GW);
        if (application != null) {
            return F7NU4MC0GW(cls, application);
        }
        if (!defpackage.q3.class.isAssignableFrom(cls)) {
            return defpackage.f70.SH1y5HwkJhh(cls);
        }
        defpackage.db.fnWB2E7cs("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
