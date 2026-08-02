package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import h0.C4561d;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import x0.C5180c;
import x0.InterfaceC5182e;

/* loaded from: classes.dex */
public final class O implements V {

    /* renamed from: a, reason: collision with root package name */
    public final Application f5099a;

    /* renamed from: b, reason: collision with root package name */
    public final U f5100b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f5101c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0502p f5102d;

    /* renamed from: e, reason: collision with root package name */
    public final C5180c f5103e;

    public O(Application application, InterfaceC5182e interfaceC5182e, Bundle bundle) {
        U u6;
        this.f5103e = interfaceC5182e.getSavedStateRegistry();
        this.f5102d = interfaceC5182e.getLifecycle();
        this.f5101c = bundle;
        this.f5099a = application;
        if (application != null) {
            if (U.f5117c == null) {
                U.f5117c = new U(application);
            }
            u6 = U.f5117c;
            kotlin.jvm.internal.h.b(u6);
        } else {
            u6 = new U(null);
        }
        this.f5100b = u6;
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
    public final S b(Class cls, C4561d c4561d) {
        T t6 = T.f5116b;
        LinkedHashMap linkedHashMap = c4561d.f37969a;
        String str = (String) linkedHashMap.get(t6);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(L.f5087a) == null || linkedHashMap.get(L.f5088b) == null) {
            if (this.f5102d != null) {
                return c(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(T.f5115a);
        boolean isAssignableFrom = AbstractC0487a.class.isAssignableFrom(cls);
        Constructor a9 = (!isAssignableFrom || application == null) ? P.a(cls, P.f5105b) : P.a(cls, P.f5104a);
        return a9 == null ? this.f5100b.b(cls, c4561d) : (!isAssignableFrom || application == null) ? P.b(cls, a9, L.c(c4561d)) : P.b(cls, a9, application, L.c(c4561d));
    }

    public final S c(Class cls, String str) {
        AbstractC0502p abstractC0502p = this.f5102d;
        if (abstractC0502p == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0487a.class.isAssignableFrom(cls);
        Application application = this.f5099a;
        Constructor a9 = (!isAssignableFrom || application == null) ? P.a(cls, P.f5105b) : P.a(cls, P.f5104a);
        if (a9 == null) {
            if (application != null) {
                return this.f5100b.a(cls);
            }
            if (W.f5119a == null) {
                W.f5119a = new W();
            }
            W w3 = W.f5119a;
            kotlin.jvm.internal.h.b(w3);
            return w3.a(cls);
        }
        C5180c c5180c = this.f5103e;
        kotlin.jvm.internal.h.b(c5180c);
        Bundle a10 = c5180c.a(str);
        Class[] clsArr = K.f5081f;
        K b9 = L.b(a10, this.f5101c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, b9);
        savedStateHandleController.b(abstractC0502p, c5180c);
        EnumC0501o enumC0501o = ((C0509x) abstractC0502p).f5145d;
        if (enumC0501o == EnumC0501o.f5132u || enumC0501o.compareTo(EnumC0501o.f5134w) >= 0) {
            c5180c.d();
        } else {
            abstractC0502p.a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC0502p, c5180c));
        }
        S b10 = (!isAssignableFrom || application == null) ? P.b(cls, a9, b9) : P.b(cls, a9, application, b9);
        b10.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return b10;
    }
}
