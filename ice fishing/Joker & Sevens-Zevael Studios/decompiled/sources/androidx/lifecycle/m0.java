package androidx.lifecycle;

import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.fortheloss.st.R;
import yc.s1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p6.i f686a = new p6.i();

    /* renamed from: b, reason: collision with root package name */
    public static final u7.d f687b = new u7.d();

    /* renamed from: c, reason: collision with root package name */
    public static final m6.i f688c = new m6.i(4);

    /* renamed from: d, reason: collision with root package name */
    public static final z3.c f689d = new z3.c();

    public static final void a(t0 t0Var, x4.l lVar, w wVar) {
        pc.j.e(lVar, "registry");
        pc.j.e(wVar, "lifecycle");
        k0 k0Var = (k0) t0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (k0Var == null || k0Var.f685i) {
            return;
        }
        k0Var.i(wVar, lVar);
        p pVar = wVar.f723c;
        if (pVar == p.f698h || pVar.compareTo(p.f700j) >= 0) {
            lVar.n();
        } else {
            wVar.a(new h(wVar, lVar));
        }
    }

    public static j0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            j0 j0Var = new j0();
            new LinkedHashMap();
            j0Var.f682a = new d8.t(bc.w.f1068g);
            return j0Var;
        }
        ClassLoader classLoader = j0.class.getClassLoader();
        pc.j.b(classLoader);
        bundle.setClassLoader(classLoader);
        cc.g gVar = new cc.g(bundle.size());
        for (String str : bundle.keySet()) {
            pc.j.b(str);
            gVar.put(str, bundle.get(str));
        }
        cc.g b2 = gVar.b();
        j0 j0Var2 = new j0();
        new LinkedHashMap();
        j0Var2.f682a = new d8.t(b2);
        return j0Var2;
    }

    public static final j0 c(x3.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f8286a;
        e4.e eVar = (e4.e) linkedHashMap.get(f686a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        y0 y0Var = (y0) linkedHashMap.get(f687b);
        if (y0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f688c);
        String str = (String) linkedHashMap.get(x0.f732b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        e4.d g8 = eVar.b().g();
        Bundle bundle2 = null;
        o0 o0Var = g8 instanceof o0 ? (o0) g8 : null;
        if (o0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = g(y0Var).f703b;
        j0 j0Var = (j0) linkedHashMap2.get(str);
        if (j0Var != null) {
            return j0Var;
        }
        o0Var.b();
        Bundle bundle3 = o0Var.f695c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = bc.a0.e((ac.i[]) Arrays.copyOf(new ac.i[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                o0Var.f695c = null;
            }
            bundle2 = bundle4;
        }
        j0 b2 = b(bundle2, bundle);
        linkedHashMap2.put(str, b2);
        return b2;
    }

    public static final void d(e4.e eVar) {
        p pVar = eVar.h().f723c;
        if (pVar != p.f698h && pVar != p.f699i) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.b().g() == null) {
            o0 o0Var = new o0(eVar.b(), (y0) eVar);
            eVar.b().k("androidx.lifecycle.internal.SavedStateHandlesProvider", o0Var);
            eVar.h().a(new e(1, o0Var));
        }
    }

    public static final u e(View view) {
        pc.j.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            u uVar = tag instanceof u ? (u) tag : null;
            if (uVar != null) {
                return uVar;
            }
            Object z10 = a.a.z(view);
            view = z10 instanceof View ? (View) z10 : null;
        }
        return null;
    }

    public static final y0 f(View view) {
        pc.j.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            y0 y0Var = tag instanceof y0 ? (y0) tag : null;
            if (y0Var != null) {
                return y0Var;
            }
            Object z10 = a.a.z(view);
            view = z10 instanceof View ? (View) z10 : null;
        }
        return null;
    }

    public static final p0 g(y0 y0Var) {
        x0 e10 = u7.d.e(y0Var, new l0(), 4);
        return (p0) ((x4.i) e10.f733a).e(pc.t.a(p0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final z3.a h(t0 t0Var) {
        z3.a aVar;
        pc.j.e(t0Var, "<this>");
        synchronized (f689d) {
            aVar = (z3.a) t0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                fc.i iVar = fc.j.f2348g;
                try {
                    fd.e eVar = yc.i0.f8859a;
                    iVar = dd.o.f1880a.f9182l;
                } catch (ac.h | IllegalStateException unused) {
                }
                z3.a aVar2 = new z3.a(iVar.d(new s1(null)));
                t0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }
}
