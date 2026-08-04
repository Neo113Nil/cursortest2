package com.gamericefishpro.space.a7;

import android.view.autofill.AutofillValue;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.IceFishingApp;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.f0.n;
import com.gamericefishpro.space.f0.q;
import com.gamericefishpro.space.f1.d0;
import com.gamericefishpro.space.f1.h;
import com.gamericefishpro.space.f1.x;
import com.gamericefishpro.space.f1.y;
import com.gamericefishpro.space.f5.g0;
import com.gamericefishpro.space.f5.k;
import com.gamericefishpro.space.f5.p0;
import com.gamericefishpro.space.g0.l;
import com.gamericefishpro.space.g0.s;
import com.gamericefishpro.space.g0.v;
import com.gamericefishpro.space.h0.h0;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.i1.e;
import com.gamericefishpro.space.ni.f;
import com.gamericefishpro.space.ni.g;
import com.gamericefishpro.space.o2.u;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.pi.d1;
import com.gamericefishpro.space.s5.p;
import com.gamericefishpro.space.s5.t;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.t.c0;
import com.gamericefishpro.space.t.i0;
import com.gamericefishpro.space.t0.r1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.u1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) throws h {
        q qVar;
        l lVar;
        float f = 0.0f;
        int i = 4;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        q qVar2 = null;
        l lVar2 = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                IceFishingApp androidContext = (IceFishingApp) this.e;
                com.gamericefishpro.space.dj.a startKoin = (com.gamericefishpro.space.dj.a) it;
                int i2 = IceFishingApp.d;
                Intrinsics.checkNotNullParameter(startKoin, "$this$startKoin");
                com.gamericefishpro.space.ij.a level = com.gamericefishpro.space.ij.a.v;
                Intrinsics.checkNotNullParameter(startKoin, "<this>");
                Intrinsics.checkNotNullParameter(level, "level");
                com.gamericefishpro.space.b1.d dVar = startKoin.a;
                boolean z2 = startKoin.b;
                Intrinsics.checkNotNullParameter(level, "level");
                com.gamericefishpro.space.bj.a logger = new com.gamericefishpro.space.bj.a(level, objArr2 == true ? 1 : 0);
                dVar.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                dVar.d = logger;
                Intrinsics.checkNotNullParameter(startKoin, "<this>");
                Intrinsics.checkNotNullParameter(androidContext, "androidContext");
                com.gamericefishpro.space.b1.d dVar2 = startKoin.a;
                com.gamericefishpro.space.g1.b bVar = (com.gamericefishpro.space.g1.b) dVar2.d;
                com.gamericefishpro.space.ij.a aVar = com.gamericefishpro.space.ij.a.e;
                if (((com.gamericefishpro.space.ij.a) bVar.d).compareTo(aVar) <= 0) {
                    com.gamericefishpro.space.g1.b bVar2 = (com.gamericefishpro.space.g1.b) dVar2.d;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter("[init] declare Android Context", "msg");
                    bVar2.m(aVar, "[init] declare Android Context");
                }
                com.gamericefishpro.space.aj.a moduleDeclaration = new com.gamericefishpro.space.aj.a(androidContext, objArr == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(moduleDeclaration, "moduleDeclaration");
                com.gamericefishpro.space.jj.a aVar2 = new com.gamericefishpro.space.jj.a();
                moduleDeclaration.invoke(aVar2);
                dVar2.q(w.c(aVar2), true);
                com.gamericefishpro.space.jj.a modules = com.gamericefishpro.space.g7.b.a;
                Intrinsics.checkNotNullParameter(modules, "modules");
                List modules2 = w.c(modules);
                Intrinsics.checkNotNullParameter(modules2, "modules");
                if (((com.gamericefishpro.space.ij.a) ((com.gamericefishpro.space.g1.b) dVar2.d).d).compareTo(aVar) <= 0) {
                    com.gamericefishpro.space.ni.h.a.getClass();
                    f.a.getClass();
                    long jA = f.a();
                    dVar2.q(modules2, z2);
                    long jA2 = g.a(jA);
                    int size = ((ConcurrentHashMap) ((com.gamericefishpro.space.a8.c) dVar2.v).i).size();
                    com.gamericefishpro.space.g1.b bVar3 = (com.gamericefishpro.space.g1.b) dVar2.d;
                    StringBuilder sbK = com.gamericefishpro.space.m5.a.k(size, "Started ", " definitions in ");
                    com.gamericefishpro.space.ni.a aVar3 = com.gamericefishpro.space.ni.b.d;
                    sbK.append(com.gamericefishpro.space.ni.b.e(jA2, com.gamericefishpro.space.ni.d.MICROSECONDS) / 1000.0d);
                    sbK.append(" ms");
                    bVar3.j(aVar, sbK.toString());
                } else {
                    dVar2.q(modules2, z2);
                }
                return Unit.a;
            case 1:
                ArrayList arrayList = (ArrayList) this.e;
                String it2 = (String) it;
                Intrinsics.checkNotNullParameter(it2, "it");
                arrayList.add(it2);
                return Unit.a;
            case 2:
                com.gamericefishpro.space.e1.f fVar = ((com.gamericefishpro.space.e1.d) this.e).i;
                return Boolean.valueOf(fVar != null ? fVar.c(it) : true);
            case 3:
                n nVar = (n) this.e;
                return nVar.s(((Integer) it).intValue(), nVar.v);
            case 4:
                com.gamericefishpro.space.f0.w wVar = (com.gamericefishpro.space.f0.w) this.e;
                float f2 = -((Float) it).floatValue();
                if ((f2 >= 0.0f || wVar.c()) && (f2 <= 0.0f || wVar.a())) {
                    if (Math.abs(wVar.h) > 0.5f) {
                        com.gamericefishpro.space.c0.a.c("entered drag with non-zero pending scroll");
                    }
                    wVar.d = true;
                    float f3 = wVar.h + f2;
                    wVar.h = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = wVar.h;
                        int iRound = Math.round(f4);
                        q qVarF = ((q) wVar.f.getValue()).f(iRound, !wVar.b);
                        if (qVarF == null || (qVar = wVar.c) == null) {
                            qVar2 = qVarF;
                        } else {
                            q qVarF2 = qVar.f(iRound, true);
                            if (qVarF2 != null) {
                                wVar.c = qVarF2;
                                qVar2 = qVarF;
                            }
                        }
                        if (qVar2 != null) {
                            wVar.f(qVar2, wVar.b, true);
                            wVar.v.setValue(Unit.a);
                            wVar.h(f4 - wVar.h, qVar2);
                        } else {
                            f0 f0Var = wVar.k;
                            if (f0Var != null) {
                                f0Var.k();
                            }
                            wVar.h(f4 - wVar.h, wVar.g());
                        }
                    }
                    if (Math.abs(wVar.h) > 0.5f) {
                        f2 -= wVar.h;
                        wVar.h = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case i.STRING_FIELD_NUMBER /* 5 */:
                y yVar = (y) this.e;
                synchronized (yVar.g) {
                    x xVar = yVar.i;
                    Intrinsics.b(xVar);
                    Object obj = xVar.b;
                    Intrinsics.b(obj);
                    int i3 = xVar.d;
                    c0 c0Var = xVar.c;
                    if (c0Var == null) {
                        c0Var = new c0();
                        xVar.c = c0Var;
                        xVar.f.m(obj, c0Var);
                        Unit unit = Unit.a;
                    }
                    xVar.b(it, i3, obj, c0Var);
                }
                return Unit.a;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                p0 p0Var = (p0) this.e;
                k backStackEntry = (k) it;
                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                com.gamericefishpro.space.f5.x xVar2 = backStackEntry.e;
                com.gamericefishpro.space.i5.c cVar = backStackEntry.A;
                if (xVar2 == null) {
                    xVar2 = null;
                }
                if (xVar2 == null) {
                    return null;
                }
                cVar.a();
                com.gamericefishpro.space.f5.x xVarC = p0Var.c(xVar2);
                if (xVarC == null) {
                    return null;
                }
                return xVarC.equals(xVar2) ? backStackEntry : p0Var.b().b(xVarC, xVarC.b(cVar.a()));
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(((s) this.e).c(((Integer) it).intValue()));
            case i.BYTES_FIELD_NUMBER /* 8 */:
                v vVar = (v) this.e;
                float f5 = -((Float) it).floatValue();
                if ((f5 >= 0.0f || vVar.c()) && (f5 <= 0.0f || vVar.a())) {
                    if (Math.abs(vVar.g) > 0.5f) {
                        com.gamericefishpro.space.c0.a.c("entered drag with non-zero pending scroll");
                    }
                    float f6 = vVar.g + f5;
                    vVar.g = f6;
                    if (Math.abs(f6) > 0.5f) {
                        float f7 = vVar.g;
                        int iA = com.gamericefishpro.space.gi.c.a(f7);
                        l lVarF = ((l) vVar.e.getValue()).f(iA, !vVar.b);
                        if (lVarF == null || (lVar = vVar.c) == null) {
                            lVar2 = lVarF;
                        } else {
                            l lVarF2 = lVar.f(iA, true);
                            if (lVarF2 != null) {
                                vVar.c = lVarF2;
                                lVar2 = lVarF;
                            }
                        }
                        if (lVar2 != null) {
                            vVar.f(lVar2, vVar.b, true);
                            vVar.r.setValue(Unit.a);
                            vVar.h(f7 - vVar.g, lVar2);
                        } else {
                            f0 f0Var2 = vVar.j;
                            if (f0Var2 != null) {
                                f0Var2.k();
                            }
                            vVar.h(f7 - vVar.g, vVar.g());
                        }
                    }
                    if (Math.abs(vVar.g) > 0.5f) {
                        f5 -= vVar.g;
                        vVar.g = 0.0f;
                    }
                    f = f5;
                }
                return Float.valueOf(-f);
            case 9:
                return new com.gamericefishpro.space.e.c(2, (com.gamericefishpro.space.h0.x) this.e);
            case 10:
                return new com.gamericefishpro.space.e.c(i, (h0) this.e);
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.e1.f fVar2 = (com.gamericefishpro.space.e1.f) this.e;
                return Boolean.valueOf(fVar2 != null ? fVar2.c(it) : true);
            case 12:
                com.gamericefishpro.space.o2.w wVar2 = (com.gamericefishpro.space.o2.w) this.e;
                AutofillValue autofillValue = ((e) it).a;
                Boolean boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    com.gamericefishpro.space.q2.a aVar4 = boolValueOf.booleanValue() ? com.gamericefishpro.space.q2.a.d : com.gamericefishpro.space.q2.a.e;
                    com.gamericefishpro.space.ki.d[] dVarArr = u.a;
                    com.gamericefishpro.space.o2.v vVar2 = com.gamericefishpro.space.o2.s.H;
                    com.gamericefishpro.space.ki.d dVar3 = u.a[25];
                    wVar2.b(vVar2, aVar4);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                s2 s2Var = (s2) this.e;
                com.gamericefishpro.space.f0.h LazyColumn = (com.gamericefishpro.space.f0.h) it;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                List list = ((com.gamericefishpro.space.k7.c) s2Var.getValue()).a;
                LazyColumn.b.a(list.size(), new com.gamericefishpro.space.f0.f(null, new com.gamericefishpro.space.k7.a(0, list), new com.gamericefishpro.space.b1.h(802480018, new com.gamericefishpro.space.k7.b(objArr3 == true ? 1 : 0, list), true)));
                return Unit.a;
            case 14:
                com.gamericefishpro.space.lb.i iVar = (com.gamericefishpro.space.lb.i) this.e;
                com.gamericefishpro.space.p4.b bVar4 = (com.gamericefishpro.space.p4.b) it;
                com.gamericefishpro.space.p4.d dVar4 = com.gamericefishpro.space.lb.i.c;
                long j = 0;
                for (Map.Entry entry : bVar4.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        com.gamericefishpro.space.p4.d dVar5 = (com.gamericefishpro.space.p4.d) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = iVar.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr4 = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr4[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                throw new IllegalArgumentException("duplicate element: " + obj2);
                            }
                            bVar4.e(dVar5, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            bVar4.d(dVar5);
                        }
                    }
                }
                if (j == 0) {
                    bVar4.d(dVar4);
                } else {
                    bVar4.e(dVar4, Long.valueOf(j));
                }
                return null;
            case 15:
                com.gamericefishpro.space.a5.h hVar = (com.gamericefishpro.space.a5.h) this.e;
                Intrinsics.checkNotNullParameter(it, "it");
                return hVar.invoke();
            case 16:
                return ((com.gamericefishpro.space.mi.d) this.e).c(((Integer) it).intValue());
            case 17:
                com.gamericefishpro.space.i7.d dVar6 = (com.gamericefishpro.space.i7.d) this.e;
                com.gamericefishpro.space.n7.g it3 = (com.gamericefishpro.space.n7.g) it;
                Intrinsics.checkNotNullParameter(it3, "it");
                return com.gamericefishpro.space.n7.g.a(it3, null, 0, 0, 0, 0, 0, null, false, 0, false, false, false, null, 0, 0, null, dVar6, null, 196543);
            case 18:
                return com.gamericefishpro.space.n7.g.a((com.gamericefishpro.space.n7.g) it, null, 0, 0, 0, 0, 0, null, false, 0, false, false, false, null, 0, 0, (LinkedHashMap) this.e, null, null, 229375);
            case 19:
                return it == ((com.gamericefishpro.space.ph.a) this.e) ? "(this Collection)" : String.valueOf(it);
            case 20:
                com.gamericefishpro.space.ph.i iVar2 = (com.gamericefishpro.space.ph.i) this.e;
                Map.Entry it4 = (Map.Entry) it;
                com.gamericefishpro.space.ph.g gVar = com.gamericefishpro.space.ph.i.i;
                Intrinsics.checkNotNullParameter(it4, "it");
                StringBuilder sb = new StringBuilder();
                Object key = it4.getKey();
                sb.append(key == iVar2 ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = it4.getValue();
                sb.append(value != iVar2 ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 21:
                p pVar = (p) this.e;
                com.gamericefishpro.space.d6.b db = (com.gamericefishpro.space.d6.b) it;
                Intrinsics.checkNotNullParameter(db, "db");
                pVar.g = db;
                return Unit.a;
            case 22:
                t tVar = (t) this.e;
                com.gamericefishpro.space.s5.a config = (com.gamericefishpro.space.s5.a) it;
                Intrinsics.checkNotNullParameter(config, "config");
                return tVar.g(config);
            case 23:
                com.gamericefishpro.space.a3.b bVar5 = (com.gamericefishpro.space.a3.b) this.e;
                Intrinsics.checkNotNullParameter((com.gamericefishpro.space.c6.a) it, "it");
                return ((Callable) bVar5.e).call();
            case 24:
                Function0 function0 = (Function0) this.e;
                ((Boolean) it).booleanValue();
                function0.invoke();
                return Unit.a;
            case 25:
                ((com.gamericefishpro.space.t0.x) this.e).z(it);
                return Unit.a;
            case 26:
                u1 u1Var = (u1) this.e;
                Throwable th = (Throwable) it;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (u1Var.c) {
                    try {
                        d1 d1Var = u1Var.d;
                        if (d1Var != null) {
                            n0 n0Var = u1Var.u;
                            r1 r1Var = r1.e;
                            n0Var.getClass();
                            n0Var.j(null, r1Var);
                            d1Var.c(cancellationException);
                            u1Var.r = null;
                            d1Var.n(new q0(24, u1Var, th));
                        } else {
                            u1Var.e = cancellationException;
                            n0 n0Var2 = u1Var.u;
                            r1 r1Var2 = r1.d;
                            n0Var2.getClass();
                            n0Var2.j(null, r1Var2);
                            Unit unit2 = Unit.a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.a;
            case 27:
                i0 i0Var = (i0) this.e;
                if (it instanceof d0) {
                    ((d0) it).f(4);
                }
                i0Var.a(it);
                return Unit.a;
            case 28:
                com.gamericefishpro.space.u2.p pVar2 = (com.gamericefishpro.space.u2.p) it;
                return ((com.gamericefishpro.space.u2.e) this.e).a(new com.gamericefishpro.space.u2.p(null, pVar2.b, pVar2.c, pVar2.d, pVar2.e)).d;
            default:
                com.gamericefishpro.space.w.h hVar2 = (com.gamericefishpro.space.w.h) it;
                ((Function2) this.e).invoke(hVar2.e.getValue(), ((Function1) com.gamericefishpro.space.w.c.j.e).invoke(hVar2.f));
                return Unit.a;
        }
    }

    public /* synthetic */ c(p0 p0Var, g0 g0Var) {
        this.d = 6;
        this.e = p0Var;
    }
}
