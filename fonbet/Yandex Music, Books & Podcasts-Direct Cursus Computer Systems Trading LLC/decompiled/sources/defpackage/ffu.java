package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ffu extends hfu {
    public static ffu c;
    public static final hil d = new hil();
    public final Application b;

    public ffu(Application application) {
        this.b = application;
    }

    @Override // defpackage.hfu, defpackage.gfu
    public final bfu b(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        qq6.d("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.hfu, defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        if (this.b != null) {
            return b(cls);
        }
        Application application = (Application) is6Var.a(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!qj0.class.isAssignableFrom(cls)) {
            return n7w.F(cls);
        }
        xq0.x("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final bfu d(Class cls, Application application) {
        if (!qj0.class.isAssignableFrom(cls)) {
            return n7w.F(cls);
        }
        try {
            bfu bfuVar = (bfu) cls.getConstructor(Application.class).newInstance(application);
            bfuVar.getClass();
            return bfuVar;
        } catch (IllegalAccessException e) {
            kac.k(tlm.j("Cannot create an instance of ", cls), e);
            return null;
        } catch (InstantiationException e2) {
            kac.k(tlm.j("Cannot create an instance of ", cls), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            kac.k(tlm.j("Cannot create an instance of ", cls), e3);
            return null;
        } catch (InvocationTargetException e4) {
            kac.k(tlm.j("Cannot create an instance of ", cls), e4);
            return null;
        }
    }
}
