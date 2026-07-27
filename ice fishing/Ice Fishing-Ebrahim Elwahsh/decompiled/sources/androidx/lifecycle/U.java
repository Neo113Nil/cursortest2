package androidx.lifecycle;

import android.app.Application;
import h0.C4558d;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class U extends W {

    /* renamed from: c, reason: collision with root package name */
    public static U f5262c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f5263b;

    public U(Application application) {
        this.f5263b = application;
    }

    @Override // androidx.lifecycle.W, androidx.lifecycle.V
    public final S a(Class cls) {
        Application application = this.f5263b;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.V
    public final S b(Class cls, C4558d c4558d) {
        if (this.f5263b != null) {
            return a(cls);
        }
        Application application = (Application) c4558d.f38143a.get(T.f5260a);
        if (application != null) {
            return c(cls, application);
        }
        if (AbstractC0493a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final S c(Class cls, Application application) {
        if (!AbstractC0493a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            S s3 = (S) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.h.d(s3, "{\n                try {\n…          }\n            }");
            return s3;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }
}
