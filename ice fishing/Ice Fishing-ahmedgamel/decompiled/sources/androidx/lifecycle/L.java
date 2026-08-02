package androidx.lifecycle;

import S7.AbstractC0410y;
import S7.o0;
import android.os.Bundle;
import com.onesignal.core.activities.PermissionsActivity;
import h0.C4558a;
import h0.C4560c;
import h0.C4561d;
import h0.C4562e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import x0.C5180c;
import x0.InterfaceC5179b;
import x0.InterfaceC5182e;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final T f5087a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final T f5088b = new T();

    /* renamed from: c, reason: collision with root package name */
    public static final T f5089c = new T();

    public static final void a(S s9, C5180c registry, AbstractC0502p lifecycle) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) s9.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f5114v) {
            return;
        }
        savedStateHandleController.b(lifecycle, registry);
        EnumC0501o enumC0501o = ((C0509x) lifecycle).f5145d;
        if (enumC0501o == EnumC0501o.f5132u || enumC0501o.compareTo(EnumC0501o.f5134w) >= 0) {
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

    public static final K c(C4561d c4561d) {
        T t6 = f5087a;
        LinkedHashMap linkedHashMap = c4561d.f37969a;
        InterfaceC5182e interfaceC5182e = (InterfaceC5182e) linkedHashMap.get(t6);
        if (interfaceC5182e == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Y y7 = (Y) linkedHashMap.get(f5088b);
        if (y7 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f5089c);
        String str = (String) linkedHashMap.get(T.f5116b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        InterfaceC5179b b9 = interfaceC5182e.getSavedStateRegistry().b();
        M m9 = b9 instanceof M ? (M) b9 : null;
        if (m9 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = f(y7).f5098a;
        K k9 = (K) linkedHashMap2.get(str);
        if (k9 != null) {
            return k9;
        }
        Class[] clsArr = K.f5081f;
        m9.b();
        Bundle bundle2 = m9.f5096c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = m9.f5096c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = m9.f5096c;
        if (bundle5 != null && bundle5.isEmpty()) {
            m9.f5096c = null;
        }
        K b10 = b(bundle3, bundle);
        linkedHashMap2.put(str, b10);
        return b10;
    }

    public static final void d(InterfaceC5182e interfaceC5182e) {
        EnumC0501o enumC0501o = ((C0509x) interfaceC5182e.getLifecycle()).f5145d;
        if (enumC0501o != EnumC0501o.f5132u && enumC0501o != EnumC0501o.f5133v) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC5182e.getSavedStateRegistry().b() == null) {
            M m9 = new M(interfaceC5182e.getSavedStateRegistry(), (Y) interfaceC5182e);
            interfaceC5182e.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", m9);
            interfaceC5182e.getLifecycle().a(new SavedStateHandleAttacher(m9));
        }
    }

    public static final LifecycleCoroutineScopeImpl e(PermissionsActivity permissionsActivity) {
        AbstractC0502p lifecycle = permissionsActivity.getLifecycle();
        kotlin.jvm.internal.h.e(lifecycle, "<this>");
        while (true) {
            AtomicReference atomicReference = lifecycle.f5137a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            o0 o0Var = new o0();
            Z7.e eVar = S7.F.f2998a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, A8.b.t(o0Var, X7.o.f3811a.f3217x));
            while (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            Z7.e eVar2 = S7.F.f2998a;
            AbstractC0410y.o(lifecycleCoroutineScopeImpl2, X7.o.f3811a.f3217x, new C0503q(lifecycleCoroutineScopeImpl2, null), 2);
            return lifecycleCoroutineScopeImpl2;
        }
    }

    public static final N f(Y y7) {
        ArrayList arrayList = new ArrayList();
        Class a9 = kotlin.jvm.internal.s.a(N.class).a();
        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C4562e(a9));
        C4562e[] c4562eArr = (C4562e[]) arrayList.toArray(new C4562e[0]);
        return (N) new b3.e(y7.getViewModelStore(), new C4560c((C4562e[]) Arrays.copyOf(c4562eArr, c4562eArr.length)), y7 instanceof InterfaceC0496j ? ((InterfaceC0496j) y7).getDefaultViewModelCreationExtras() : C4558a.f37968b).v(N.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
