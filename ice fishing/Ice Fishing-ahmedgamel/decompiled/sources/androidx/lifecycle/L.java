package androidx.lifecycle;

import S7.AbstractC0406y;
import S7.o0;
import android.os.Bundle;
import com.onesignal.core.activities.PermissionsActivity;
import h0.C4553a;
import h0.C4555c;
import h0.C4556d;
import h0.C4557e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import x0.C5181c;
import x0.InterfaceC5180b;
import x0.InterfaceC5183e;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final T f5120a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final T f5121b = new T();

    /* renamed from: c, reason: collision with root package name */
    public static final T f5122c = new T();

    public static final void a(S s9, C5181c registry, AbstractC0498p lifecycle) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) s9.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f5147v) {
            return;
        }
        savedStateHandleController.b(lifecycle, registry);
        EnumC0497o enumC0497o = ((C0505x) lifecycle).f5178d;
        if (enumC0497o == EnumC0497o.f5165u || enumC0497o.compareTo(EnumC0497o.f5167w) >= 0) {
            registry.d();
        } else {
            lifecycle.a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, registry));
        }
    }

    public static K b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new K();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.h.d(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new K(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new K(linkedHashMap);
    }

    public static final K c(C4556d c4556d) {
        T t6 = f5120a;
        LinkedHashMap linkedHashMap = c4556d.f37943a;
        InterfaceC5183e interfaceC5183e = (InterfaceC5183e) linkedHashMap.get(t6);
        if (interfaceC5183e == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Y y7 = (Y) linkedHashMap.get(f5121b);
        if (y7 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f5122c);
        String str = (String) linkedHashMap.get(T.f5149b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC5180b b9 = interfaceC5183e.getSavedStateRegistry().b();
        M m4 = b9 instanceof M ? (M) b9 : null;
        if (m4 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = f(y7).f5131a;
        K k9 = (K) linkedHashMap2.get(str);
        if (k9 != null) {
            return k9;
        }
        Class[] clsArr = K.f5114f;
        m4.b();
        Bundle bundle2 = m4.f5129c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = m4.f5129c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = m4.f5129c;
        if (bundle5 != null && bundle5.isEmpty()) {
            m4.f5129c = null;
        }
        K b10 = b(bundle3, bundle);
        linkedHashMap2.put(str, b10);
        return b10;
    }

    public static final void d(InterfaceC5183e interfaceC5183e) {
        EnumC0497o enumC0497o = ((C0505x) interfaceC5183e.getLifecycle()).f5178d;
        if (enumC0497o != EnumC0497o.f5165u && enumC0497o != EnumC0497o.f5166v) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC5183e.getSavedStateRegistry().b() == null) {
            M m4 = new M(interfaceC5183e.getSavedStateRegistry(), (Y) interfaceC5183e);
            interfaceC5183e.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", m4);
            interfaceC5183e.getLifecycle().a(new SavedStateHandleAttacher(m4));
        }
    }

    public static final LifecycleCoroutineScopeImpl e(PermissionsActivity permissionsActivity) {
        AbstractC0498p lifecycle = permissionsActivity.getLifecycle();
        kotlin.jvm.internal.h.e(lifecycle, "<this>");
        while (true) {
            AtomicReference atomicReference = lifecycle.f5170a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            o0 o0Var = new o0();
            Z7.e eVar = S7.F.f2915a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, A8.b.r(o0Var, X7.o.f3856a.f3100x));
            while (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            Z7.e eVar2 = S7.F.f2915a;
            AbstractC0406y.o(lifecycleCoroutineScopeImpl2, X7.o.f3856a.f3100x, new C0499q(lifecycleCoroutineScopeImpl2, null), 2);
            return lifecycleCoroutineScopeImpl2;
        }
    }

    public static final N f(Y y7) {
        ArrayList arrayList = new ArrayList();
        Class a9 = kotlin.jvm.internal.s.a(N.class).a();
        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C4557e(a9));
        C4557e[] c4557eArr = (C4557e[]) arrayList.toArray(new C4557e[0]);
        return (N) new Z2.e(y7.getViewModelStore(), new C4555c((C4557e[]) Arrays.copyOf(c4557eArr, c4557eArr.length)), y7 instanceof InterfaceC0492j ? ((InterfaceC0492j) y7).getDefaultViewModelCreationExtras() : C4553a.f37942b).s(N.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
