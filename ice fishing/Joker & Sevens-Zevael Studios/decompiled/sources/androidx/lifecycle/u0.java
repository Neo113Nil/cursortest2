package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u0 extends w0 {

    /* renamed from: c, reason: collision with root package name */
    public static u0 f716c;

    /* renamed from: d, reason: collision with root package name */
    public static final p6.i f717d = new p6.i();

    /* renamed from: b, reason: collision with root package name */
    public final Application f718b;

    public u0(Application application) {
        this.f718b = application;
    }

    @Override // androidx.lifecycle.w0, androidx.lifecycle.v0
    public final t0 a(Class cls) {
        Application application = this.f718b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.w0, androidx.lifecycle.v0
    public final t0 b(Class cls, x3.c cVar) {
        if (this.f718b != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f8286a.get(f717d);
        if (application != null) {
            return d(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return u2.b.j(cls);
    }

    public final t0 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return u2.b.j(cls);
        }
        try {
            t0 t0Var = (t0) cls.getConstructor(Application.class).newInstance(application);
            pc.j.b(t0Var);
            return t0Var;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Cannot create an instance of " + cls, e13);
        }
    }
}
