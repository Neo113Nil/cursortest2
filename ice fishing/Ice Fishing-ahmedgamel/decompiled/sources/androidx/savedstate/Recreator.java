package androidx.savedstate;

import D.x;
import android.os.Bundle;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.InterfaceC0505t;
import androidx.lifecycle.InterfaceC0507v;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.h;
import w.AbstractC5128c;
import x0.C5180c;
import x0.InterfaceC5178a;
import x0.InterfaceC5182e;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0505t {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5182e f5267n;

    public Recreator(InterfaceC5182e interfaceC5182e) {
        this.f5267n = interfaceC5182e;
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        if (enumC0500n != EnumC0500n.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0507v.getLifecycle().b(this);
        InterfaceC5182e interfaceC5182e = this.f5267n;
        Bundle a9 = interfaceC5182e.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a9 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a9.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC5178a.class);
                h.d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        h.d(newInstance, "{\n                constr…wInstance()\n            }");
                        if (!(interfaceC5182e instanceof Y)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        X viewModelStore = ((Y) interfaceC5182e).getViewModelStore();
                        C5180c savedStateRegistry = interfaceC5182e.getSavedStateRegistry();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.f5120a;
                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                        while (it.hasNext()) {
                            String key = (String) it.next();
                            h.e(key, "key");
                            S s9 = (S) linkedHashMap.get(key);
                            h.b(s9);
                            L.a(s9, savedStateRegistry, interfaceC5182e.getLifecycle());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            savedStateRegistry.d();
                        }
                    } catch (Exception e9) {
                        throw new RuntimeException(AbstractC5128c.f("Failed to instantiate ", str), e9);
                    }
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                }
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(x.l("Class ", str, " wasn't found"), e11);
            }
        }
    }
}
