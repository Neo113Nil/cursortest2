package wd;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.k;
import androidx.lifecycle.t0;
import androidx.lifecycle.y0;
import b0.q;
import bc.a0;
import d.n;
import d.o;
import g.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import k2.e;
import m0.d1;
import m0.j0;
import m0.l;
import m0.r;
import m0.u1;
import m0.z;
import m5.h;
import p6.i;
import pc.j;
import ub.f;
import ud.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements k5.a {

    /* renamed from: g, reason: collision with root package name */
    public static final c f7738g = new c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // k5.a
    public final void c(r rVar) {
        Object aVar;
        d1 d1Var;
        d1 d1Var2;
        d1 d1Var3;
        r rVar2;
        d1 d1Var4;
        ?? r22;
        rVar.X(-1211774074);
        m5.c cVar = (m5.c) h.c(h.f4895a, rVar);
        rVar.Y(1890788296);
        y0 a6 = y3.a.a(rVar);
        if (a6 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        f r5 = i7.b.r(a6, rVar);
        rVar.Y(1729797275);
        t0 j3 = g.j(yd.a.class, a6, r5, a6 instanceof k ? ((k) a6).e() : x3.a.f8285b, rVar);
        rVar.q(false);
        rVar.q(false);
        yd.a aVar2 = (yd.a) j3;
        rVar.Y(1890788296);
        y0 a8 = y3.a.a(rVar);
        if (a8 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        f r10 = i7.b.r(a8, rVar);
        rVar.Y(1729797275);
        t0 j6 = g.j(be.a.class, a8, r10, a8 instanceof k ? ((k) a8).e() : x3.a.f8285b, rVar);
        rVar.q(false);
        rVar.q(false);
        be.a aVar3 = (be.a) j6;
        d1 k3 = z.k(aVar2.f8929d, rVar);
        u1 u1Var = AndroidCompositionLocals_androidKt.f603b;
        Context context = (Context) rVar.j(u1Var);
        rVar.X(-1370388837);
        Object M = rVar.M();
        Object obj = l.f4646a;
        if (M == obj) {
            M = z.s(Boolean.FALSE);
            rVar.i0(M);
        }
        d1 d1Var5 = (d1) M;
        rVar.q(false);
        rVar.X(-1370386565);
        Object M2 = rVar.M();
        if (M2 == obj) {
            M2 = z.s(Boolean.FALSE);
            rVar.i0(M2);
        }
        d1 d1Var6 = (d1) M2;
        rVar.q(false);
        rVar.X(-1370384509);
        Object M3 = rVar.M();
        Object obj2 = null;
        if (M3 == obj) {
            M3 = z.s(null);
            rVar.i0(M3);
        }
        d1 d1Var7 = (d1) M3;
        rVar.q(false);
        rVar.X(-1370381989);
        Object M4 = rVar.M();
        if (M4 == obj) {
            M4 = z.s(Boolean.FALSE);
            rVar.i0(M4);
        }
        d1 d1Var8 = (d1) M4;
        rVar.q(false);
        final i iVar = new i();
        rVar.X(-1370375865);
        Object M5 = rVar.M();
        if (M5 == obj) {
            M5 = new e(14, d1Var6);
            rVar.i0(M5);
        }
        rVar.q(false);
        z.u(iVar, rVar);
        final d1 u10 = z.u((oc.c) M5, rVar);
        Object[] objArr = new Object[0];
        Object M6 = rVar.M();
        if (M6 == obj) {
            M6 = new e.b(0);
            rVar.i0(M6);
        }
        final String str = (String) v0.k.b(objArr, null, null, (oc.a) M6, rVar, 3072, 6);
        d dVar = (d) rVar.j(e.i.f1912a);
        if (dVar == null) {
            rVar.X(1213380307);
            Context context2 = (Context) rVar.j(u1Var);
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
                if (context2 instanceof d) {
                    obj2 = context2;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            dVar = (d) obj2;
        } else {
            rVar.X(1213379439);
        }
        rVar.q(false);
        if (dVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        final n nVar = ((o) dVar).f1517n;
        Object M7 = rVar.M();
        if (M7 == obj) {
            M7 = new e.a();
            rVar.i0(M7);
        }
        final e.a aVar4 = (e.a) M7;
        Object M8 = rVar.M();
        if (M8 == obj) {
            M8 = new e.k(aVar4);
            rVar.i0(M8);
        }
        e.k kVar = (e.k) M8;
        boolean h10 = rVar.h(aVar4) | rVar.h(nVar) | rVar.f(str) | rVar.h(iVar) | rVar.f(u10);
        Object M9 = rVar.M();
        if (h10 || M9 == obj) {
            Object obj3 = new oc.c() { // from class: e.c
                @Override // oc.c
                public final Object invoke(Object obj4) {
                    Object parcelable;
                    c6.f fVar = new c6.f(8, u10);
                    n nVar2 = nVar;
                    LinkedHashMap linkedHashMap = nVar2.f1502a;
                    Bundle bundle = nVar2.f1508g;
                    LinkedHashMap linkedHashMap2 = nVar2.f1507f;
                    String str2 = str;
                    pc.j.e(str2, "key");
                    LinkedHashMap linkedHashMap3 = nVar2.f1503b;
                    if (((Integer) linkedHashMap3.get(str2)) == null) {
                        b bVar = new b(4);
                        Iterator it = new wc.a(new wc.d(1, bVar, new wc.i(0, bVar))).iterator();
                        while (it.hasNext()) {
                            Number number = (Number) it.next();
                            if (!linkedHashMap.containsKey(Integer.valueOf(number.intValue()))) {
                                int intValue = number.intValue();
                                linkedHashMap.put(Integer.valueOf(intValue), str2);
                                linkedHashMap3.put(str2, Integer.valueOf(intValue));
                            }
                        }
                        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                    }
                    LinkedHashMap linkedHashMap4 = nVar2.f1506e;
                    p6.i iVar2 = iVar;
                    linkedHashMap4.put(str2, new g.b(fVar, iVar2));
                    if (linkedHashMap2.containsKey(str2)) {
                        Object obj5 = linkedHashMap2.get(str2);
                        linkedHashMap2.remove(str2);
                        fVar.g(obj5);
                    }
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelable = d.k.b(str2, bundle);
                    } else {
                        parcelable = bundle.getParcelable(str2);
                        if (!g.a.class.isInstance(parcelable)) {
                            parcelable = null;
                        }
                    }
                    g.a aVar5 = (g.a) parcelable;
                    if (aVar5 != null) {
                        bundle.remove(str2);
                        fVar.g(iVar2.c(aVar5.f2400g, aVar5.f2401h));
                    }
                    g.c cVar2 = new g.c(nVar2, str2, iVar2);
                    a aVar6 = a.this;
                    aVar6.f1895a = cVar2;
                    return new q(3, aVar6);
                }
            };
            rVar.i0(obj3);
            M9 = obj3;
        }
        oc.c cVar2 = (oc.c) M9;
        boolean f10 = rVar.f(nVar) | rVar.f(str) | rVar.f(iVar);
        Object M10 = rVar.M();
        if (f10 || M10 == obj) {
            M10 = new j0(cVar2);
            rVar.i0(M10);
        }
        xd.d dVar2 = (xd.d) k3.getValue();
        rVar.X(-1370370991);
        boolean f11 = rVar.f(k3) | rVar.h(cVar) | rVar.h(aVar3) | rVar.h(context) | rVar.h(kVar);
        Object M11 = rVar.M();
        if (f11 || M11 == obj) {
            r rVar3 = rVar;
            aVar = new a(cVar, aVar3, context, d1Var5, k3, d1Var6, d1Var7, kVar, null);
            d1Var = d1Var5;
            d1Var2 = d1Var6;
            d1Var3 = d1Var7;
            rVar3.i0(aVar);
            rVar2 = rVar3;
        } else {
            aVar = M11;
            rVar2 = rVar;
            d1Var = d1Var5;
            d1Var2 = d1Var6;
            d1Var3 = d1Var7;
        }
        rVar2.q(false);
        z.f(dVar2, rVar2, (oc.e) aVar);
        Boolean bool = (Boolean) d1Var2.getValue();
        bool.getClass();
        String str2 = (String) d1Var3.getValue();
        rVar2.X(-1370324428);
        Object M12 = rVar2.M();
        if (M12 == obj) {
            d1Var4 = d1Var8;
            M12 = new b(d1Var2, d1Var3, d1Var, d1Var4, null);
            rVar2.i0(M12);
        } else {
            d1Var4 = d1Var8;
        }
        rVar2.q(false);
        z.e(bool, str2, (oc.e) M12, rVar2);
        rVar2.X(-1370318194);
        if (!((Boolean) d1Var4.getValue()).booleanValue() || ((String) d1Var3.getValue()) == null) {
            r22 = 0;
        } else {
            String str3 = (String) d1Var3.getValue();
            j.b(str3);
            r22 = 0;
            a0.b(str3, rVar2, 0);
        }
        rVar2.q(r22);
        g.f(r22, rVar2);
        rVar2.q(r22);
    }

    @Override // k5.a
    public String getKey() {
        return i7.b.x(this);
    }
}
