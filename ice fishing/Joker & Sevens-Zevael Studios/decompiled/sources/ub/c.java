package ub;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.m0;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import b4.l;
import hd.i;
import java.io.Closeable;
import java.util.Collections;
import java.util.LinkedHashMap;
import org.fortheloss.st.MainActivity;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6727b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f6726a = i10;
        this.f6727b = obj;
    }

    @Override // androidx.lifecycle.v0
    public final t0 b(Class cls, x3.c cVar) {
        t0 t0Var;
        Application application;
        switch (this.f6726a) {
            case 0:
                final h hVar = new h();
                s sVar = (s) this.f6727b;
                m0.c(cVar);
                i iVar = new i((hd.g) sVar.f8356h, (hd.e) sVar.f8357i);
                i iVar2 = (i) ((e) v6.a.E(iVar, e.class));
                iVar2.getClass();
                l lVar = new l(2);
                hd.h hVar2 = iVar2.f2897b;
                LinkedHashMap linkedHashMap = lVar.f997a;
                linkedHashMap.put("sd.k", hVar2);
                linkedHashMap.put("rd.d0", iVar2.f2898c);
                linkedHashMap.put("td.f", iVar2.f2899d);
                linkedHashMap.put("be.a", iVar2.f2900e);
                linkedHashMap.put("ud.i", iVar2.f2901f);
                linkedHashMap.put("vd.q", iVar2.f2902g);
                linkedHashMap.put("yd.a", iVar2.f2903h);
                linkedHashMap.put("zd.f", iVar2.f2904i);
                LinkedHashMap linkedHashMap2 = lVar.f997a;
                zb.a aVar = (zb.a) (linkedHashMap2.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap2)).get(cls.getName());
                oc.c cVar2 = (oc.c) cVar.f8286a.get(f.f6728d);
                ((i) ((e) v6.a.E(iVar, e.class))).getClass();
                Object obj = Collections.EMPTY_MAP.get(cls);
                if (obj == null) {
                    if (cVar2 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (aVar == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    t0Var = (t0) aVar.get();
                } else {
                    if (aVar != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (cVar2 == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    t0Var = (t0) cVar2.invoke(obj);
                }
                Closeable closeable = new Closeable() { // from class: ub.b
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        h.this.a();
                    }
                };
                t0Var.getClass();
                z3.d dVar = t0Var.f715a;
                if (dVar != null) {
                    if (dVar.f9104d) {
                        z3.d.a(closeable);
                    } else {
                        synchronized (dVar.f9101a) {
                            dVar.f9103c.add(closeable);
                        }
                    }
                }
                return t0Var;
            default:
                m7.g gVar = new m7.g(20, false);
                gVar.f4957h = cVar;
                Context applicationContext = ((MainActivity) this.f6727b).getApplicationContext();
                if (!(applicationContext instanceof Application)) {
                    Context context = applicationContext;
                    while (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                        if (context instanceof Application) {
                            application = (Application) context;
                        }
                    }
                    throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
                }
                application = (Application) applicationContext;
                return new vb.d(new hd.e(((hd.g) ((vb.c) v6.a.E(application, vb.c.class))).f2888b), gVar);
        }
    }
}
