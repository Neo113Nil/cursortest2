package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f704a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f705b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f706c;

    /* renamed from: d, reason: collision with root package name */
    public final w f707d;

    /* renamed from: e, reason: collision with root package name */
    public final x4.l f708e;

    public q0(Application application, e4.e eVar, Bundle bundle) {
        u0 u0Var;
        this.f708e = eVar.b();
        this.f707d = eVar.h();
        this.f706c = bundle;
        this.f704a = application;
        if (application != null) {
            if (u0.f716c == null) {
                u0.f716c = new u0(application);
            }
            u0Var = u0.f716c;
            pc.j.b(u0Var);
        } else {
            u0Var = new u0(null);
        }
        this.f705b = u0Var;
    }

    @Override // androidx.lifecycle.v0
    public final t0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.v0
    public final t0 b(Class cls, x3.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f8286a;
        String str = (String) linkedHashMap.get(x0.f732b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(m0.f686a) == null || linkedHashMap.get(m0.f687b) == null) {
            if (this.f707d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(u0.f717d);
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor a6 = (!isAssignableFrom || application == null) ? r0.a(cls, r0.f711b) : r0.a(cls, r0.f710a);
        return a6 == null ? this.f705b.b(cls, cVar) : (!isAssignableFrom || application == null) ? r0.b(cls, a6, m0.c(cVar)) : r0.b(cls, a6, application, m0.c(cVar));
    }

    @Override // androidx.lifecycle.v0
    public final t0 c(pc.e eVar, x3.c cVar) {
        Class a6 = eVar.a();
        pc.j.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b(a6, cVar);
    }

    public final t0 d(String str, Class cls) {
        w wVar = this.f707d;
        if (wVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f704a;
        Constructor a6 = (!isAssignableFrom || application == null) ? r0.a(cls, r0.f711b) : r0.a(cls, r0.f710a);
        if (a6 == null) {
            if (application != null) {
                return this.f705b.a(cls);
            }
            if (w0.f730a == null) {
                w0.f730a = new w0();
            }
            pc.j.b(w0.f730a);
            return u2.b.j(cls);
        }
        x4.l lVar = this.f708e;
        pc.j.b(lVar);
        j0 b2 = m0.b(lVar.b(str), this.f706c);
        k0 k0Var = new k0(str, b2);
        k0Var.i(wVar, lVar);
        p pVar = wVar.f723c;
        if (pVar == p.f698h || pVar.compareTo(p.f700j) >= 0) {
            lVar.n();
        } else {
            wVar.a(new h(wVar, lVar));
        }
        t0 b10 = (!isAssignableFrom || application == null) ? r0.b(cls, a6, b2) : r0.b(cls, a6, application, b2);
        b10.a("androidx.lifecycle.savedstate.vm.tag", k0Var);
        return b10;
    }
}
