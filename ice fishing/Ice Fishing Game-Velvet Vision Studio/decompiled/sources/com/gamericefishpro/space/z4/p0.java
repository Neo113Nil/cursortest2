package com.gamericefishpro.space.z4;

import android.app.Application;
import android.os.Bundle;
import com.gamericefishpro.space.i9.d5;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements u0 {
    public final Application a;
    public final t0 b;
    public final Bundle c;
    public final w d;
    public final com.gamericefishpro.space.u6.s e;

    public p0() {
        this.b = new t0(null);
    }

    @Override // com.gamericefishpro.space.z4.u0
    public final s0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return d(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // com.gamericefishpro.space.z4.u0
    public final s0 b(Class modelClass, com.gamericefishpro.space.c5.f extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(w0.b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(m0.a) == null || extras.a(m0.b) == null) {
            if (this.d != null) {
                return d(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(t0.d);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? q0.a(modelClass, q0.b) : q0.a(modelClass, q0.a);
        if (constructorA == null) {
            return this.b.b(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? q0.b(modelClass, constructorA, m0.c(extras)) : q0.b(modelClass, constructorA, application, m0.c(extras));
    }

    @Override // com.gamericefishpro.space.z4.u0
    public final s0 c(com.gamericefishpro.space.ei.g modelClass, com.gamericefishpro.space.c5.f extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return b(d5.C(modelClass), extras);
    }

    public final s0 d(Class modelClass, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        w lifecycle = this.d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(modelClass);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? q0.a(modelClass, q0.b) : q0.a(modelClass, q0.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(modelClass);
            }
            if (v0.a == null) {
                v0.a = new v0();
            }
            Intrinsics.b(v0.a);
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return com.gamericefishpro.space.a.a.l(modelClass);
        }
        com.gamericefishpro.space.u6.s registry = this.e;
        Intrinsics.b(registry);
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        j0 j0VarB = m0.b(registry.f(key), this.c);
        k0 k0Var = new k0(key, j0VarB);
        k0Var.n(registry, lifecycle);
        p pVar = lifecycle.c;
        if (pVar == p.e || pVar.a(p.v)) {
            registry.m();
        } else {
            lifecycle.a(new h(registry, lifecycle));
        }
        s0 s0VarB = (!zIsAssignableFrom || application == null) ? q0.b(modelClass, constructorA, j0VarB) : q0.b(modelClass, constructorA, application, j0VarB);
        s0VarB.a("androidx.lifecycle.savedstate.vm.tag", k0Var);
        return s0VarB;
    }

    public p0(Application application, com.gamericefishpro.space.z5.e owner, Bundle bundle) {
        t0 t0Var;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.e = owner.b();
        this.d = owner.g();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (t0.c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                t0.c = new t0(application);
            }
            t0Var = t0.c;
            Intrinsics.b(t0Var);
        } else {
            t0Var = new t0(null);
        }
        this.b = t0Var;
    }
}
