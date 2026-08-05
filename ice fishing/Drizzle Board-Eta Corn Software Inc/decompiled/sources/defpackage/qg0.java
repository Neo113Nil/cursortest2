package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qg0 extends sg0 {
    public static qg0 MdtA4re8;
    public static final k00 wxUZMvaN = new k00(17);
    public final Application NCTxEWno;

    public qg0(Application application) {
        this.NCTxEWno = application;
    }

    @Override // defpackage.sg0, defpackage.rg0
    public final ng0 NCTxEWno(Class cls, mt mtVar) {
        if (this.NCTxEWno != null) {
            return qoPGr6Ce(cls);
        }
        Application application = (Application) mtVar.qoPGr6Ce.get(wxUZMvaN);
        if (application != null) {
            return wxUZMvaN(cls, application);
        }
        if (!Hfv28Fap.class.isAssignableFrom(cls)) {
            return ra.ygLcUYwZ(cls);
        }
        m1.sjUBp5pO("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // defpackage.sg0, defpackage.rg0
    public final ng0 qoPGr6Ce(Class cls) {
        Application application = this.NCTxEWno;
        if (application != null) {
            return wxUZMvaN(cls, application);
        }
        m1.b2ZJblxo("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public final ng0 wxUZMvaN(Class cls, Application application) {
        if (!Hfv28Fap.class.isAssignableFrom(cls)) {
            return ra.ygLcUYwZ(cls);
        }
        try {
            ng0 ng0Var = (ng0) cls.getConstructor(Application.class).newInstance(application);
            ng0Var.getClass();
            return ng0Var;
        } catch (IllegalAccessException e) {
            m1.ow5vqvCr("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            m1.ow5vqvCr("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            m1.ow5vqvCr("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            m1.ow5vqvCr("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
