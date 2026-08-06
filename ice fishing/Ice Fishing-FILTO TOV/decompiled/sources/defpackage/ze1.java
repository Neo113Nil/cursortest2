package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ze1 extends bf1 {
    public static ze1 X1lG3V04pd;
    public static final x51 xqGvceK5x = new x51(10);
    public final Application Yi7zF1RB1;

    public ze1(Application application) {
        this.Yi7zF1RB1 = application;
    }

    @Override // defpackage.bf1, defpackage.af1
    public final we1 GWasM1elztuh(Class cls) {
        Application application = this.Yi7zF1RB1;
        if (application != null) {
            return xqGvceK5x(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.bf1, defpackage.af1
    public final we1 Yi7zF1RB1(Class cls, of0 of0Var) {
        if (this.Yi7zF1RB1 != null) {
            return GWasM1elztuh(cls);
        }
        Application application = (Application) of0Var.GWasM1elztuh.get(xqGvceK5x);
        if (application != null) {
            return xqGvceK5x(cls, application);
        }
        if (!a2.class.isAssignableFrom(cls)) {
            return n30.cilMamHF(cls);
        }
        o4.mE4lRynR("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final we1 xqGvceK5x(Class cls, Application application) {
        if (!a2.class.isAssignableFrom(cls)) {
            return n30.cilMamHF(cls);
        }
        try {
            we1 we1Var = (we1) cls.getConstructor(Application.class).newInstance(application);
            we1Var.getClass();
            return we1Var;
        } catch (IllegalAccessException e) {
            o4.rQPn8YBR("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            o4.rQPn8YBR("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            o4.rQPn8YBR("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            o4.rQPn8YBR("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
