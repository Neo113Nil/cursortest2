package com.gamericefishpro.space.f5;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.gamericefishpro.space.z4.t0;
import com.gamericefishpro.space.z4.u0;
import com.gamericefishpro.space.z4.x0;
import com.gamericefishpro.space.z4.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.gamericefishpro.space.z4.u, y0, com.gamericefishpro.space.z4.k, com.gamericefishpro.space.z5.e {
    public final com.gamericefishpro.space.i5.c A = new com.gamericefishpro.space.i5.c(this);
    public final com.gamericefishpro.space.b9.b d;
    public x e;
    public final Bundle i;
    public com.gamericefishpro.space.z4.p v;
    public final p w;
    public final String y;
    public final Bundle z;

    public k(com.gamericefishpro.space.b9.b bVar, x xVar, Bundle bundle, com.gamericefishpro.space.z4.p pVar, p pVar2, String str, Bundle bundle2) {
        this.d = bVar;
        this.e = xVar;
        this.i = bundle;
        this.v = pVar;
        this.w = pVar2;
        this.y = str;
        this.z = bundle2;
        com.gamericefishpro.space.oh.i.b(new com.gamericefishpro.space.a3.b(7, this));
    }

    @Override // com.gamericefishpro.space.z5.e
    public final com.gamericefishpro.space.u6.s b() {
        return (com.gamericefishpro.space.u6.s) this.A.h.e;
    }

    public final void c(com.gamericefishpro.space.z4.p maxState) {
        Intrinsics.checkNotNullParameter(maxState, "value");
        com.gamericefishpro.space.i5.c cVar = this.A;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        cVar.k = maxState;
        cVar.b();
    }

    @Override // com.gamericefishpro.space.z4.k
    public final u0 d() {
        return this.A.l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    @Override // com.gamericefishpro.space.z4.k
    public final com.gamericefishpro.space.c5.c e() {
        Application application;
        com.gamericefishpro.space.i5.c cVar = this.A;
        cVar.getClass();
        com.gamericefishpro.space.c5.f fVar = new com.gamericefishpro.space.c5.f(0);
        com.gamericefishpro.space.u4.b bVar = com.gamericefishpro.space.z4.m0.a;
        k kVar = cVar.a;
        fVar.b(bVar, kVar);
        fVar.b(com.gamericefishpro.space.z4.m0.b, kVar);
        Bundle bundleA = cVar.a();
        if (bundleA != null) {
            fVar.b(com.gamericefishpro.space.z4.m0.c, bundleA);
        }
        com.gamericefishpro.space.b9.b bVar2 = this.d;
        if (bVar2 == null) {
            application = null;
        } else {
            Context context = bVar2.a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            fVar.b(t0.d, application2);
        }
        return fVar;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            Bundle bundle = kVar.i;
            if (Intrinsics.a(this.y, kVar.y) && Intrinsics.a(this.e, kVar.e) && Intrinsics.a(this.A.j, kVar.A.j) && Intrinsics.a(b(), kVar.b())) {
                Bundle bundle2 = this.i;
                if (Intrinsics.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!Intrinsics.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.z4.y0
    public final x0 f() {
        com.gamericefishpro.space.i5.c cVar = this.A;
        if (!cVar.i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.j.c == com.gamericefishpro.space.z4.p.d) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        p pVar = cVar.e;
        if (pVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = cVar.f;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = pVar.b;
        x0 x0Var = (x0) linkedHashMap.get(backStackEntryId);
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0();
        linkedHashMap.put(backStackEntryId, x0Var2);
        return x0Var2;
    }

    @Override // com.gamericefishpro.space.z4.u
    public final com.gamericefishpro.space.z4.w g() {
        return this.A.j;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.e.hashCode() + (this.y.hashCode() * 31);
        Bundle bundle = this.i;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return b().hashCode() + ((this.A.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.A.toString();
    }
}
