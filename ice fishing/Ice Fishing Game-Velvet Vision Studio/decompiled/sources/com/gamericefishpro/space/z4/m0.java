package com.gamericefishpro.space.z4;

import android.os.Bundle;
import android.view.View;
import com.gamericefishpro.space.R;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static final com.gamericefishpro.space.u4.b a = new com.gamericefishpro.space.u4.b();
    public static final com.gamericefishpro.space.u4.f b = new com.gamericefishpro.space.u4.f();
    public static final com.gamericefishpro.space.u3.k c = new com.gamericefishpro.space.u3.k();
    public static final com.gamericefishpro.space.e5.c d = new com.gamericefishpro.space.e5.c();

    public static final void a(s0 viewModel, com.gamericefishpro.space.u6.s registry, w lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        k0 k0Var = (k0) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (k0Var == null || k0Var.i) {
            return;
        }
        k0Var.n(registry, lifecycle);
        p pVar = lifecycle.c;
        if (pVar == p.e || pVar.a(p.v)) {
            registry.m();
        } else {
            lifecycle.a(new h(registry, lifecycle));
        }
    }

    public static j0 b(Bundle source, Bundle bundle) {
        if (source == null) {
            source = bundle;
        }
        if (source == null) {
            return new j0();
        }
        ClassLoader classLoader = j0.class.getClassLoader();
        Intrinsics.b(classLoader);
        source.setClassLoader(classLoader);
        Intrinsics.checkNotNullParameter(source, "source");
        com.gamericefishpro.space.qh.i builder = new com.gamericefishpro.space.qh.i(source.size());
        for (String str : source.keySet()) {
            Intrinsics.b(str);
            builder.put(str, source.get(str));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new j0(builder.b());
    }

    public static final j0 c(com.gamericefishpro.space.c5.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        com.gamericefishpro.space.z5.e eVar = (com.gamericefishpro.space.z5.e) cVar.a(a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        y0 y0Var = (y0) cVar.a(b);
        if (y0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cVar.a(c);
        String key = (String) cVar.a(w0.b);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        com.gamericefishpro.space.z5.d dVarI = eVar.b().i();
        Bundle bundle2 = null;
        n0 n0Var = dVarI instanceof n0 ? (n0) dVarI : null;
        if (n0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        o0 o0VarG = g(y0Var);
        j0 j0Var = (j0) o0VarG.b.get(key);
        if (j0Var != null) {
            return j0Var;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        n0Var.b();
        Bundle source = n0Var.c;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            if (source.containsKey(key)) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                Bundle source2 = source.getBundle(key);
                if (source2 == null) {
                    com.gamericefishpro.space.ph.m0.c();
                    source2 = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Intrinsics.checkNotNullParameter(source2, "source");
                }
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.remove(key);
                Intrinsics.checkNotNullParameter(source, "source");
                if (source.isEmpty()) {
                    n0Var.c = null;
                }
                bundle2 = source2;
            }
        }
        j0 j0VarB = b(bundle2, bundle);
        o0VarG.b.put(key, j0VarB);
        return j0VarB;
    }

    public static final void d(com.gamericefishpro.space.z5.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        p pVar = eVar.g().c;
        if (pVar != p.e && pVar != p.i) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.b().i() == null) {
            n0 n0Var = new n0(eVar.b(), (y0) eVar);
            eVar.b().l("androidx.lifecycle.internal.SavedStateHandlesProvider", n0Var);
            eVar.g().a(new e(n0Var));
        }
    }

    public static final u e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            u uVar = tag instanceof u ? (u) tag : null;
            if (uVar != null) {
                return uVar;
            }
            Object objB = com.gamericefishpro.space.hj.c.B(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }

    public static final y0 f(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            y0 y0Var = tag instanceof y0 ? (y0) tag : null;
            if (y0Var != null) {
                return y0Var;
            }
            Object objB = com.gamericefishpro.space.hj.c.B(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }

    public static final o0 g(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        w0 w0VarA = com.gamericefishpro.space.u4.f.a(y0Var, new l0(), 4);
        com.gamericefishpro.space.ei.g modelClass = com.gamericefishpro.space.ei.b0.a(o0.class);
        w0VarA.getClass();
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (o0) ((com.gamericefishpro.space.u6.i) w0VarA.a).d(modelClass, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final com.gamericefishpro.space.e5.a h(s0 s0Var) {
        com.gamericefishpro.space.e5.a aVar;
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        synchronized (d) {
            aVar = (com.gamericefishpro.space.e5.a) s0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                try {
                    try {
                        com.gamericefishpro.space.wi.e eVar = com.gamericefishpro.space.pi.k0.a;
                        coroutineContext = com.gamericefishpro.space.ui.m.a.y;
                    } catch (com.gamericefishpro.space.oh.l unused) {
                        coroutineContext = kotlin.coroutines.g.d;
                    }
                } catch (IllegalStateException unused2) {
                    coroutineContext = kotlin.coroutines.g.d;
                }
                com.gamericefishpro.space.e5.a aVar2 = new com.gamericefishpro.space.e5.a(coroutineContext.o(com.gamericefishpro.space.pi.a0.d()));
                s0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final void i(View view, u uVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, uVar);
    }

    public static final void j(View view, y0 y0Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, y0Var);
    }
}
