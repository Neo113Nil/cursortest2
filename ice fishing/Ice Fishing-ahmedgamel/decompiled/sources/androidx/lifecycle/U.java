package androidx.lifecycle;

import android.app.Application;
import h0.C4561d;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class U extends W {

    /* renamed from: c, reason: collision with root package name */
    public static U f5117c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f5118b;

    public U(Application application) {
        this.f5118b = application;
    }

    @Override // androidx.lifecycle.W, androidx.lifecycle.V
    public final S a(Class cls) {
        Application application = this.f5118b;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.V
    public final S b(Class cls, C4561d c4561d) {
        if (this.f5118b != null) {
            return a(cls);
        }
        Application application = (Application) c4561d.f37969a.get(T.f5115a);
        if (application != null) {
            return c(cls, application);
        }
        if (AbstractC0487a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final S c(Class cls, Application application) {
        if (!AbstractC0487a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            S s9 = (S) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.h.d(s9, "{\n                try {\n…          }\n            }");
            return s9;
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
