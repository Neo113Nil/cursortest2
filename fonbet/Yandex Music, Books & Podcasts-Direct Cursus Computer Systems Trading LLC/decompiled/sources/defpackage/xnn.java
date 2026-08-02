package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class xnn implements uyf {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ xnn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        switch (this.a) {
            case 0:
                woo wooVar = (woo) this.b;
                if (kyfVar != kyf.ON_CREATE) {
                    xq0.w("Next event must be ON_CREATE");
                    return;
                }
                dzfVar.getLifecycle().d(this);
                Bundle a = wooVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    xq0.q("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, xnn.class.getClassLoader()).asSubclass(soo.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(wooVar instanceof kfu)) {
                                    l1j.m(wooVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                jfu viewModelStore = ((kfu) wooVar).getViewModelStore();
                                uoo savedStateRegistry = wooVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    str2.getClass();
                                    bfu bfuVar = (bfu) linkedHashMap.get(str2);
                                    if (bfuVar != null) {
                                        ywf.m(bfuVar, savedStateRegistry, wooVar.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                kac.k(f1d.g("Failed to instantiate ", str), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        kac.k(hrg.q("Class ", str, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                hn5 hn5Var = (hn5) this.b;
                hn5.access$ensureViewModelStore(hn5Var);
                hn5Var.getLifecycle().d(this);
                return;
            case 2:
                new HashMap();
                z2d[] z2dVarArr = (z2d[]) this.b;
                if (z2dVarArr.length > 0) {
                    z2d z2dVar = z2dVarArr[0];
                    throw null;
                }
                if (z2dVarArr.length <= 0) {
                    return;
                }
                z2d z2dVar2 = z2dVarArr[0];
                throw null;
            case 3:
                if (kyfVar != kyf.ON_CREATE) {
                    l1j.m(kyfVar, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    dzfVar.getLifecycle().d(this);
                    ((qoo) this.b).b();
                    return;
                }
            default:
                dk4 dk4Var = ((jvo) this.b).c;
                int i = ivo.a[kyfVar.ordinal()];
                if (i == 1) {
                    jk4 c = dk4Var.c();
                    int i2 = c.c + 1;
                    c.c = i2;
                    if (i2 == 1) {
                        ssg.a(4, "ChromeCastDiscoveryCenter", "Instantiating router callback", null);
                        ((krh) c.b.getValue()).a(c.d, c.e, 1);
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    return;
                }
                jk4 c2 = dk4Var.c();
                int i3 = c2.c - 1;
                c2.c = i3;
                if (i3 == 0) {
                    ssg.a(4, "ChromeCastDiscoveryCenter", "Removing router callback", null);
                    ((krh) c2.b.getValue()).i(c2.e);
                    return;
                }
                return;
        }
    }
}
