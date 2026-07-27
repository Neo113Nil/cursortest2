package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import h0.C4558d;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import x0.C5202c;
import x0.InterfaceC5204e;

/* loaded from: classes.dex */
public final class O implements V {

    /* renamed from: a, reason: collision with root package name */
    public final Application f5244a;

    /* renamed from: b, reason: collision with root package name */
    public final U f5245b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f5246c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0508p f5247d;

    /* renamed from: e, reason: collision with root package name */
    public final C5202c f5248e;

    public O(Application application, InterfaceC5204e interfaceC5204e, Bundle bundle) {
        U u7;
        this.f5248e = interfaceC5204e.getSavedStateRegistry();
        this.f5247d = interfaceC5204e.getLifecycle();
        this.f5246c = bundle;
        this.f5244a = application;
        if (application != null) {
            if (U.f5262c == null) {
                U.f5262c = new U(application);
            }
            u7 = U.f5262c;
            kotlin.jvm.internal.h.b(u7);
        } else {
            u7 = new U(null);
        }
        this.f5245b = u7;
    }

    @Override // androidx.lifecycle.V
    public final S a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.V
    public final S b(Class cls, C4558d c4558d) {
        T t9 = T.f5261b;
        LinkedHashMap linkedHashMap = c4558d.f38143a;
        String str = (String) linkedHashMap.get(t9);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(L.f5232a) == null || linkedHashMap.get(L.f5233b) == null) {
            if (this.f5247d != null) {
                return c(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(T.f5260a);
        boolean isAssignableFrom = AbstractC0493a.class.isAssignableFrom(cls);
        Constructor a9 = (!isAssignableFrom || application == null) ? P.a(cls, P.f5250b) : P.a(cls, P.f5249a);
        return a9 == null ? this.f5245b.b(cls, c4558d) : (!isAssignableFrom || application == null) ? P.b(cls, a9, L.c(c4558d)) : P.b(cls, a9, application, L.c(c4558d));
    }

    public final S c(Class cls, String str) {
        AbstractC0508p abstractC0508p = this.f5247d;
        if (abstractC0508p == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0493a.class.isAssignableFrom(cls);
        Application application = this.f5244a;
        Constructor a9 = (!isAssignableFrom || application == null) ? P.a(cls, P.f5250b) : P.a(cls, P.f5249a);
        if (a9 == null) {
            if (application != null) {
                return this.f5245b.a(cls);
            }
            if (W.f5264a == null) {
                W.f5264a = new W();
            }
            W w9 = W.f5264a;
            kotlin.jvm.internal.h.b(w9);
            return w9.a(cls);
        }
        C5202c c5202c = this.f5248e;
        kotlin.jvm.internal.h.b(c5202c);
        Bundle a10 = c5202c.a(str);
        Class[] clsArr = K.f5226f;
        K b9 = L.b(a10, this.f5246c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, b9);
        savedStateHandleController.b(abstractC0508p, c5202c);
        EnumC0507o enumC0507o = ((C0515x) abstractC0508p).f5290d;
        if (enumC0507o == EnumC0507o.f5277u || enumC0507o.compareTo(EnumC0507o.f5279w) >= 0) {
            c5202c.d();
        } else {
            abstractC0508p.a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC0508p, c5202c));
        }
        S b10 = (!isAssignableFrom || application == null) ? P.b(cls, a9, b9) : P.b(cls, a9, application, b9);
        b10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return b10;
    }
}
