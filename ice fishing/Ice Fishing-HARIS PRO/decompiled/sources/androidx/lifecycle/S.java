package androidx.lifecycle;

import android.app.Application;
import c0.C0122c;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class S extends S0.e {
    public static S e;

    /* renamed from: f, reason: collision with root package name */
    public static final S0.e f2023f = new S0.e(20);

    /* renamed from: d, reason: collision with root package name */
    public final Application f2024d;

    public S(Application application) {
        super(21);
        this.f2024d = application;
    }

    @Override // S0.e, androidx.lifecycle.T
    public final Q g(Class cls) {
        Application application = this.f2024d;
        if (application != null) {
            return p(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final Q p(Class cls, Application application) {
        if (!AbstractC0084a.class.isAssignableFrom(cls)) {
            return super.g(cls);
        }
        try {
            Q q2 = (Q) cls.getConstructor(Application.class).newInstance(application);
            D1.i.d(q2, "{\n                try {\n…          }\n            }");
            return q2;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        }
    }

    @Override // S0.e, androidx.lifecycle.T
    public final Q u(Class cls, C0122c c0122c) {
        if (this.f2024d != null) {
            return g(cls);
        }
        Application application = (Application) c0122c.f2340a.get(f2023f);
        if (application != null) {
            return p(cls, application);
        }
        if (AbstractC0084a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.g(cls);
    }
}
