package com.gamericefishpro.space.z4;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends v0 {
    public static t0 c;
    public static final com.gamericefishpro.space.u4.b d = new com.gamericefishpro.space.u4.b();
    public final Application b;

    public t0(Application application) {
        this.b = application;
    }

    @Override // com.gamericefishpro.space.z4.v0, com.gamericefishpro.space.z4.u0
    public final s0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.b;
        if (application != null) {
            return d(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // com.gamericefishpro.space.z4.v0, com.gamericefishpro.space.z4.u0
    public final s0 b(Class modelClass, com.gamericefishpro.space.c5.f extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.b != null) {
            return a(modelClass);
        }
        Application application = (Application) extras.a(d);
        if (application != null) {
            return d(modelClass, application);
        }
        if (a.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return com.gamericefishpro.space.a.a.l(modelClass);
    }

    public final s0 d(Class modelClass, Application application) {
        if (!a.class.isAssignableFrom(modelClass)) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return com.gamericefishpro.space.a.a.l(modelClass);
        }
        try {
            s0 s0Var = (s0) modelClass.getConstructor(Application.class).newInstance(application);
            Intrinsics.b(s0Var);
            return s0Var;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
        }
    }
}
