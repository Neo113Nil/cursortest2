package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import c0.C0122c;
import d0.C0126a;
import d0.C0127b;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import l0.C0233d;
import l0.InterfaceC0234e;

/* loaded from: classes.dex */
public final class O implements T {

    /* renamed from: a, reason: collision with root package name */
    public final Application f2016a;

    /* renamed from: b, reason: collision with root package name */
    public final S f2017b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2018c;

    /* renamed from: d, reason: collision with root package name */
    public final C0103u f2019d;
    public final C0233d e;

    public O(Application application, InterfaceC0234e interfaceC0234e, Bundle bundle) {
        S s2;
        D1.i.e(interfaceC0234e, "owner");
        this.e = interfaceC0234e.b();
        this.f2019d = interfaceC0234e.d();
        this.f2018c = bundle;
        this.f2016a = application;
        if (application != null) {
            if (S.e == null) {
                S.e = new S(application);
            }
            s2 = S.e;
            D1.i.b(s2);
        } else {
            s2 = new S(null);
        }
        this.f2017b = s2;
    }

    public final Q a(String str, Class cls) {
        AutoCloseable autoCloseable;
        C0103u c0103u = this.f2019d;
        if (c0103u == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0084a.class.isAssignableFrom(cls);
        Application application = this.f2016a;
        Constructor a2 = (!isAssignableFrom || application == null) ? P.a(cls, P.f2021b) : P.a(cls, P.f2020a);
        if (a2 == null) {
            if (application != null) {
                return this.f2017b.g(cls);
            }
            if (S0.e.f1060c == null) {
                S0.e.f1060c = new S0.e(21);
            }
            S0.e eVar = S0.e.f1060c;
            D1.i.b(eVar);
            return eVar.g(cls);
        }
        C0233d c0233d = this.e;
        D1.i.b(c0233d);
        Bundle bundle = this.f2018c;
        D1.i.e(c0233d, "registry");
        D1.i.e(c0103u, "lifecycle");
        Bundle c2 = c0233d.c(str);
        Class[] clsArr = I.f2000f;
        J j = new J(str, L.b(c2, bundle));
        j.b(c0103u, c0233d);
        L.g(c0103u, c0233d);
        I i = j.f2006b;
        Q b2 = (!isAssignableFrom || application == null) ? P.b(cls, a2, i) : P.b(cls, a2, application, i);
        C0126a c0126a = b2.f2022a;
        if (c0126a != null) {
            if (c0126a.f2834d) {
                C0126a.a(j);
            } else {
                synchronized (c0126a.f2831a) {
                    autoCloseable = (AutoCloseable) c0126a.f2832b.put("androidx.lifecycle.savedstate.vm.tag", j);
                }
                C0126a.a(autoCloseable);
            }
        }
        return b2;
    }

    @Override // androidx.lifecycle.T
    public final Q g(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.T
    public final Q u(Class cls, C0122c c0122c) {
        C0127b c0127b = C0127b.f2835a;
        LinkedHashMap linkedHashMap = c0122c.f2340a;
        String str = (String) linkedHashMap.get(c0127b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(L.f2008a) == null || linkedHashMap.get(L.f2009b) == null) {
            if (this.f2019d != null) {
                return a(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(S.f2023f);
        boolean isAssignableFrom = AbstractC0084a.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom || application == null) ? P.a(cls, P.f2021b) : P.a(cls, P.f2020a);
        return a2 == null ? this.f2017b.u(cls, c0122c) : (!isAssignableFrom || application == null) ? P.b(cls, a2, L.c(c0122c)) : P.b(cls, a2, application, L.c(c0122c));
    }
}
