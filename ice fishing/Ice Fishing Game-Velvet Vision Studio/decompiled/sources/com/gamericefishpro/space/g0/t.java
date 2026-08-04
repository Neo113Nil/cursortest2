package com.gamericefishpro.space.g0;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.y;
import com.gamericefishpro.space.f2.e1;
import com.gamericefishpro.space.h0.y0;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.w.b0;
import com.gamericefishpro.space.w.z;
import com.gamericefishpro.space.z.m1;
import com.gamericefishpro.space.z.o0;
import com.gamericefishpro.space.z.o1;
import com.gamericefishpro.space.z.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
        this.w = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long jD;
        Object obj2;
        f1 f1Var;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                List list = (List) this.e;
                y yVar = (y) this.v;
                List list2 = (List) this.i;
                l lVar = (l) this.w;
                y0 y0Var = (y0) obj;
                e1 e1Var = y0Var.e;
                int iB = e1Var != null ? e1Var.b() : 0;
                int i = 0;
                for (int i2 = 0; i2 < iB; i2++) {
                    if (lVar.q == v0.d) {
                        e1 e1Var2 = y0Var.e;
                        jD = 4294967295L & (e1Var2 != null ? e1Var2.d(i2) : 0L);
                    } else {
                        e1 e1Var3 = y0Var.e;
                        jD = (e1Var3 != null ? e1Var3.d(i2) : 0L) >> 32;
                    }
                    i += (int) jD;
                }
                if (list != null) {
                    list.add(Integer.valueOf(i));
                }
                if (yVar.d != list2.size()) {
                    yVar.d++;
                }
                return Unit.a;
            case 1:
                com.gamericefishpro.space.ei.w wVar = (com.gamericefishpro.space.ei.w) this.e;
                com.gamericefishpro.space.i5.g gVar = (com.gamericefishpro.space.i5.g) this.i;
                com.gamericefishpro.space.f5.x xVar = (com.gamericefishpro.space.f5.x) this.v;
                Bundle bundle = (Bundle) this.w;
                com.gamericefishpro.space.f5.k it = (com.gamericefishpro.space.f5.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                wVar.d = true;
                gVar.a(xVar, bundle, it, g0.d);
                return Unit.a;
            case 2:
                com.gamericefishpro.space.lb.i iVar = (com.gamericefishpro.space.lb.i) this.e;
                String str = (String) this.i;
                String str2 = (String) this.v;
                com.gamericefishpro.space.p4.d key = (com.gamericefishpro.space.p4.d) this.w;
                com.gamericefishpro.space.p4.b bVar = (com.gamericefishpro.space.p4.b) obj;
                if (((String) com.gamericefishpro.space.d9.h.A(bVar, com.gamericefishpro.space.lb.i.d, "")).equals(str)) {
                    com.gamericefishpro.space.p4.d dVarC = iVar.c(bVar, str);
                    if (dVarC != null && !dVarC.a.equals(str2)) {
                        synchronized (iVar) {
                            iVar.d(bVar, str);
                            HashSet hashSet = new HashSet((Collection) com.gamericefishpro.space.d9.h.A(bVar, key, new HashSet()));
                            hashSet.add(str);
                            Intrinsics.checkNotNullParameter(key, "key");
                            bVar.f(key, hashSet);
                        }
                    }
                    return null;
                }
                com.gamericefishpro.space.p4.d dVar = com.gamericefishpro.space.lb.i.c;
                long jLongValue = ((Long) com.gamericefishpro.space.d9.h.A(bVar, dVar, 0L)).longValue();
                if (jLongValue + 1 == 30) {
                    synchronized (iVar) {
                        try {
                            long jLongValue2 = ((Long) com.gamericefishpro.space.d9.h.A(bVar, dVar, 0L)).longValue();
                            String str3 = "";
                            Set hashSet2 = new HashSet();
                            String str4 = null;
                            for (Map.Entry entry : bVar.a().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set = (Set) entry.getValue();
                                    for (String str5 : set) {
                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                            str3 = ((com.gamericefishpro.space.p4.d) entry.getKey()).a;
                                            str4 = str5;
                                            hashSet2 = set;
                                        }
                                    }
                                }
                            }
                            obj2 = null;
                            HashSet hashSet3 = new HashSet(hashSet2);
                            hashSet3.remove(str4);
                            com.gamericefishpro.space.p4.d key2 = com.gamericefishpro.space.hj.c.W(str3);
                            Intrinsics.checkNotNullParameter(key2, "key");
                            bVar.f(key2, hashSet3);
                            jLongValue = jLongValue2 - 1;
                            bVar.e(com.gamericefishpro.space.lb.i.c, Long.valueOf(jLongValue));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) com.gamericefishpro.space.d9.h.A(bVar, key, new HashSet()));
                hashSet4.add(str);
                Intrinsics.checkNotNullParameter(key, "key");
                bVar.f(key, hashSet4);
                bVar.e(com.gamericefishpro.space.lb.i.c, Long.valueOf(jLongValue + 1));
                bVar.e(com.gamericefishpro.space.lb.i.d, str);
                return obj2;
            case 3:
                com.gamericefishpro.space.w.b bVar2 = (com.gamericefishpro.space.w.b) this.e;
                com.gamericefishpro.space.w.j jVar = (com.gamericefishpro.space.w.j) this.i;
                Function1 function1 = (Function1) this.v;
                com.gamericefishpro.space.ei.w wVar2 = (com.gamericefishpro.space.ei.w) this.w;
                com.gamericefishpro.space.w.h hVar = (com.gamericefishpro.space.w.h) obj;
                com.gamericefishpro.space.w.c.p(hVar, bVar2.c);
                f1 f1Var2 = hVar.e;
                Object value = f1Var2.getValue();
                com.gamericefishpro.space.u6.l lVar2 = bVar2.a;
                com.gamericefishpro.space.w.o oVar = bVar2.j;
                com.gamericefishpro.space.w.o oVar2 = bVar2.i;
                if (Intrinsics.a(oVar2, bVar2.g) && Intrinsics.a(oVar, bVar2.h)) {
                    f1Var = f1Var2;
                } else {
                    com.gamericefishpro.space.w.o oVar3 = (com.gamericefishpro.space.w.o) ((Function1) lVar2.d).invoke(value);
                    int iB2 = oVar3.b();
                    int i3 = 0;
                    boolean z = false;
                    while (i3 < iB2) {
                        if (oVar3.a(i3) < oVar2.a(i3) || oVar3.a(i3) > oVar.a(i3)) {
                            oVar3.e(i3, com.gamericefishpro.space.ji.f.b(oVar3.a(i3), oVar2.a(i3), oVar.a(i3)));
                            z = true;
                        }
                        i3++;
                        f1Var2 = f1Var2;
                    }
                    f1Var = f1Var2;
                    if (z) {
                        value = ((Function1) lVar2.e).invoke(oVar3);
                    }
                }
                if (!Intrinsics.a(value, f1Var.getValue())) {
                    bVar2.c.e.setValue(value);
                    jVar.e.setValue(value);
                    if (function1 != null) {
                        function1.invoke(bVar2);
                    }
                    hVar.i.setValue(Boolean.FALSE);
                    hVar.d.invoke();
                    wVar2.d = true;
                } else if (function1 != null) {
                    function1.invoke(bVar2);
                }
                return Unit.a;
            case 4:
                com.gamericefishpro.space.t0.v0 v0Var = (com.gamericefishpro.space.t0.v0) this.e;
                b0 b0Var = (b0) this.i;
                com.gamericefishpro.space.ei.x xVar2 = (com.gamericefishpro.space.ei.x) this.v;
                com.gamericefishpro.space.pi.x xVar3 = (com.gamericefishpro.space.pi.x) this.w;
                long jLongValue3 = ((Long) obj).longValue();
                s2 s2Var = (s2) v0Var.getValue();
                long jLongValue4 = s2Var != null ? ((Number) s2Var.getValue()).longValue() : jLongValue3;
                long j = b0Var.c;
                com.gamericefishpro.space.v0.e eVar = b0Var.a;
                if (j == Long.MIN_VALUE || xVar2.d != com.gamericefishpro.space.w.c.k(xVar3.l())) {
                    b0Var.c = jLongValue3;
                    Object[] objArr = eVar.d;
                    int i4 = eVar.i;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((z) objArr[i5]).z = true;
                    }
                    xVar2.d = com.gamericefishpro.space.w.c.k(xVar3.l());
                }
                float f = xVar2.d;
                if (f == 0.0f) {
                    Object[] objArr2 = eVar.d;
                    int i6 = eVar.i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        z zVar = (z) objArr2[i7];
                        zVar.v.setValue(zVar.w.c);
                        zVar.z = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue4 - b0Var.c) / f);
                    Object[] objArr3 = eVar.d;
                    int i8 = eVar.i;
                    boolean z2 = true;
                    for (int i9 = 0; i9 < i8; i9++) {
                        z zVar2 = (z) objArr3[i9];
                        if (!zVar2.y) {
                            zVar2.B.b.setValue(Boolean.FALSE);
                            if (zVar2.z) {
                                zVar2.z = false;
                                zVar2.A = j2;
                            }
                            long j3 = j2 - zVar2.A;
                            zVar2.v.setValue(zVar2.w.b(j3));
                            zVar2.y = zVar2.w.g(j3);
                        }
                        if (!zVar2.y) {
                            z2 = false;
                        }
                    }
                    b0Var.d.setValue(Boolean.valueOf(!z2));
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.ei.x xVar4 = (com.gamericefishpro.space.ei.x) this.e;
                m1 m1Var = (m1) this.i;
                com.gamericefishpro.space.ei.x xVar5 = (com.gamericefishpro.space.ei.x) this.v;
                com.gamericefishpro.space.z.k kVar = (com.gamericefishpro.space.z.k) this.w;
                com.gamericefishpro.space.w.h hVar2 = (com.gamericefishpro.space.w.h) obj;
                float fFloatValue = ((Number) hVar2.e.getValue()).floatValue() - xVar4.d;
                float fA = m1Var.a(fFloatValue);
                xVar4.d = ((Number) hVar2.e.getValue()).floatValue();
                xVar5.d = ((Number) ((Function1) hVar2.a.e).invoke(hVar2.f)).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    hVar2.i.setValue(Boolean.FALSE);
                    hVar2.d.invoke();
                }
                kVar.getClass();
                return Unit.a;
            default:
                com.gamericefishpro.space.ei.x xVar6 = (com.gamericefishpro.space.ei.x) this.e;
                com.gamericefishpro.space.p5.a aVar = (com.gamericefishpro.space.p5.a) this.i;
                o1 o1Var = (o1) this.v;
                com.gamericefishpro.space.e.b bVar3 = (com.gamericefishpro.space.e.b) this.w;
                com.gamericefishpro.space.w.h hVar3 = (com.gamericefishpro.space.w.h) obj;
                f1 f1Var3 = hVar3.e;
                Function0 function0 = hVar3.d;
                f1 f1Var4 = hVar3.i;
                float fFloatValue2 = ((Number) f1Var3.getValue()).floatValue() - xVar6.d;
                if (!o0.a(fFloatValue2)) {
                    if (!o0.a(fFloatValue2 - aVar.c(o1Var, fFloatValue2))) {
                        f1Var4.setValue(Boolean.FALSE);
                        function0.invoke();
                        return Unit.a;
                    }
                    xVar6.d += fFloatValue2;
                }
                if (((Boolean) bVar3.invoke(Float.valueOf(xVar6.d))).booleanValue()) {
                    f1Var4.setValue(Boolean.FALSE);
                    function0.invoke();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ t(ArrayList arrayList, y yVar, List list, int i, l lVar) {
        this.d = 0;
        this.e = arrayList;
        this.v = yVar;
        this.i = list;
        this.w = lVar;
    }
}
