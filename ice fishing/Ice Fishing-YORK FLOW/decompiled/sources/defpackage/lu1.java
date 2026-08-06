package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lu1 extends defpackage.nu1 {
    public static final defpackage.l21 JhCgjQRTAOCT = new defpackage.l21(26);
    public static defpackage.lu1 fWTAfUmVKrZq;
    public final android.app.Application giKS3J6vZuNy;

    public lu1(android.app.Application application) {
        this.giKS3J6vZuNy = application;
    }

    public final defpackage.iu1 JhCgjQRTAOCT(java.lang.Class cls, android.app.Application application) {
        if (!defpackage.t4.class.isAssignableFrom(cls)) {
            return defpackage.m90.s0TASMVLSWD5(cls);
        }
        try {
            defpackage.iu1 iu1Var = (defpackage.iu1) cls.getConstructor(android.app.Application.class).newInstance(application);
            iu1Var.getClass();
            return iu1Var;
        } catch (java.lang.IllegalAccessException e) {
            defpackage.h7.fNwYGHIYeJcR("Cannot create an instance of ", cls, e);
            return null;
        } catch (java.lang.InstantiationException e2) {
            defpackage.h7.fNwYGHIYeJcR("Cannot create an instance of ", cls, e2);
            return null;
        } catch (java.lang.NoSuchMethodException e3) {
            defpackage.h7.fNwYGHIYeJcR("Cannot create an instance of ", cls, e3);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e4) {
            defpackage.h7.fNwYGHIYeJcR("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // defpackage.nu1, defpackage.mu1
    public final defpackage.iu1 ZpBGe2uQfcn8(java.lang.Class cls) {
        android.app.Application application = this.giKS3J6vZuNy;
        if (application != null) {
            return JhCgjQRTAOCT(cls, application);
        }
        throw new java.lang.UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.nu1, defpackage.mu1
    public final defpackage.iu1 giKS3J6vZuNy(java.lang.Class cls, defpackage.dn0 dn0Var) {
        if (this.giKS3J6vZuNy != null) {
            return ZpBGe2uQfcn8(cls);
        }
        android.app.Application application = (android.app.Application) dn0Var.ZpBGe2uQfcn8.get(JhCgjQRTAOCT);
        if (application != null) {
            return JhCgjQRTAOCT(cls, application);
        }
        if (!defpackage.t4.class.isAssignableFrom(cls)) {
            return defpackage.m90.s0TASMVLSWD5(cls);
        }
        defpackage.h7.w7APNrr0aGRc("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }
}
