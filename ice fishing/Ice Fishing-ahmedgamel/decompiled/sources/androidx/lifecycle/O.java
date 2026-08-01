package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import h0.C4556d;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import x0.C5181c;
import x0.InterfaceC5183e;

/* loaded from: classes.dex */
public final class O implements V {

    /* renamed from: a, reason: collision with root package name */
    public final Application f5132a;

    /* renamed from: b, reason: collision with root package name */
    public final U f5133b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f5134c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0498p f5135d;

    /* renamed from: e, reason: collision with root package name */
    public final C5181c f5136e;

    public O(Application application, InterfaceC5183e interfaceC5183e, Bundle bundle) {
        U u3;
        this.f5136e = interfaceC5183e.getSavedStateRegistry();
        this.f5135d = interfaceC5183e.getLifecycle();
        this.f5134c = bundle;
        this.f5132a = application;
        if (application != null) {
            if (U.f5150c == null) {
                U.f5150c = new U(application);
            }
            u3 = U.f5150c;
            kotlin.jvm.internal.h.b(u3);
        } else {
            u3 = new U(null);
        }
        this.f5133b = u3;
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
    public final S b(Class cls, C4556d c4556d) {
        T t6 = T.f5149b;
        LinkedHashMap linkedHashMap = c4556d.f37943a;
        String str = (String) linkedHashMap.get(t6);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(L.f5120a) == null || linkedHashMap.get(L.f5121b) == null) {
            if (this.f5135d != null) {
                return c(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(T.f5148a);
        boolean isAssignableFrom = AbstractC0483a.class.isAssignableFrom(cls);
        Constructor a9 = (!isAssignableFrom || application == null) ? P.a(cls, P.f5138b) : P.a(cls, P.f5137a);
        return a9 == null ? this.f5133b.b(cls, c4556d) : (!isAssignableFrom || application == null) ? P.b(cls, a9, L.c(c4556d)) : P.b(cls, a9, application, L.c(c4556d));
    }

    public final S c(Class cls, String str) {
        AbstractC0498p abstractC0498p = this.f5135d;
        if (abstractC0498p == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0483a.class.isAssignableFrom(cls);
        Application application = this.f5132a;
        Constructor a9 = (!isAssignableFrom || application == null) ? P.a(cls, P.f5138b) : P.a(cls, P.f5137a);
        if (a9 == null) {
            if (application != null) {
                return this.f5133b.a(cls);
            }
            if (W.f5152a == null) {
                W.f5152a = new W();
            }
            W w6 = W.f5152a;
            kotlin.jvm.internal.h.b(w6);
            return w6.a(cls);
        }
        C5181c c5181c = this.f5136e;
        kotlin.jvm.internal.h.b(c5181c);
        Bundle a10 = c5181c.a(str);
        Class[] clsArr = K.f5114f;
        K b9 = L.b(a10, this.f5134c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, b9);
        savedStateHandleController.b(abstractC0498p, c5181c);
        EnumC0497o enumC0497o = ((C0505x) abstractC0498p).f5178d;
        if (enumC0497o == EnumC0497o.f5165u || enumC0497o.compareTo(EnumC0497o.f5167w) >= 0) {
            c5181c.d();
        } else {
            abstractC0498p.a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC0498p, c5181c));
        }
        S b10 = (!isAssignableFrom || application == null) ? P.b(cls, a9, b9) : P.b(cls, a9, application, b9);
        b10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return b10;
    }
}
