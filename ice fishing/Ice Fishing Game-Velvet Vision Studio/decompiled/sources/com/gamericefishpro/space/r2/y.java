package com.gamericefishpro.space.r2;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final com.gamericefishpro.space.u6.c A;
    public static final x B;
    public static final x C;
    public static final x D;
    public static final com.gamericefishpro.space.u6.c a;
    public static final com.gamericefishpro.space.u6.c b;
    public static final com.gamericefishpro.space.u6.c c;
    public static final com.gamericefishpro.space.u6.c d;
    public static final com.gamericefishpro.space.u6.c e;
    public static final com.gamericefishpro.space.u6.c f;
    public static final com.gamericefishpro.space.u6.c g;
    public static final com.gamericefishpro.space.u6.c h;
    public static final com.gamericefishpro.space.u6.c i;
    public static final com.gamericefishpro.space.u6.c j;
    public static final com.gamericefishpro.space.u6.c k;
    public static final com.gamericefishpro.space.u6.c l;
    public static final com.gamericefishpro.space.u6.c m;
    public static final com.gamericefishpro.space.u6.c n;
    public static final com.gamericefishpro.space.u6.c o;
    public static final x p;
    public static final x q;
    public static final x r;
    public static final x s;
    public static final com.gamericefishpro.space.u6.c t;
    public static final com.gamericefishpro.space.u6.c u;
    public static final x v;
    public static final x w;
    public static final x x;
    public static final com.gamericefishpro.space.u6.c y;
    public static final com.gamericefishpro.space.u6.c z;

    static {
        final int i2 = 0;
        new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(8), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i3 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var = null;
                g0 g0Var2 = null;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i4 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i3 < size) {
                            Object obj13 = list8.get(i3);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i3++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i3 < size2) {
                            Object obj18 = list11.get(i3);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i3++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i5 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i5, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i6 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i7 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i8 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i9 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i6, i7, j5, qVar2, rVar, iVar3, i8, i9, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i10 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i3 = 12;
        a = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(15), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i4 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i5 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i4 < size) {
                            Object obj13 = list8.get(i4);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i4++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i4 < size2) {
                            Object obj18 = list11.get(i4);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i4++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i6 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i6, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i7 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i8 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i9 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i10 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i7, i8, j5, qVar2, rVar, iVar3, i9, i10, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i11 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i4 = 24;
        b = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(27), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i5 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i6 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i5 < size) {
                            Object obj13 = list8.get(i5);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i5++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i5 < size2) {
                            Object obj18 = list11.get(i5);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i5++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i7 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i7, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i8 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i9 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i10 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i11 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i8, i9, j5, qVar2, rVar, iVar3, i10, i11, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i12 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i5 = 26;
        c = new com.gamericefishpro.space.u6.c(new u(4), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i6 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i5) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i7 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i6 < size) {
                            Object obj13 = list8.get(i6);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i6++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i6 < size2) {
                            Object obj18 = list11.get(i6);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i6++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i8 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i8, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i9 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i10 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i11 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i12 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i9, i10, j5, qVar2, rVar, iVar3, i11, i12, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i13 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i6 = 27;
        d = new com.gamericefishpro.space.u6.c(new u(6), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i7 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i6) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i8 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i7 < size) {
                            Object obj13 = list8.get(i7);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i7++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i7 < size2) {
                            Object obj18 = list11.get(i7);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i7++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i9 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i9, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i10 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i11 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i12 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i13 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i10, i11, j5, qVar2, rVar, iVar3, i12, i13, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i14 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i7 = 9;
        e = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(13), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i8 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i9 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i8 < size) {
                            Object obj13 = list8.get(i8);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i8++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i8 < size2) {
                            Object obj18 = list11.get(i8);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i8++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i10 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i10, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i11 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i12 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i13 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i14 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i11, i12, j5, qVar2, rVar, iVar3, i13, i14, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i15 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i8 = 20;
        f = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(24), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i9 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i8) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i10 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i9 < size) {
                            Object obj13 = list8.get(i9);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i9++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i9 < size2) {
                            Object obj18 = list11.get(i9);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i9++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i11 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i11, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i12 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i13 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i14 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i15 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i12, i13, j5, qVar2, rVar, iVar3, i14, i15, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i16 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i9 = 28;
        g = new com.gamericefishpro.space.u6.c(new u(5), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i10 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i9) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i11 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i10 < size) {
                            Object obj13 = list8.get(i10);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i10++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i10 < size2) {
                            Object obj18 = list11.get(i10);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i10++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i12 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i12, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i13 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i14 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i15 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i16 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i13, i14, j5, qVar2, rVar, iVar3, i15, i16, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i17 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i10 = 29;
        h = new com.gamericefishpro.space.u6.c(new u(7), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i11 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i10) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i12 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i11 < size) {
                            Object obj13 = list8.get(i11);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i11++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i11 < size2) {
                            Object obj18 = list11.get(i11);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i11++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i13 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i13, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i14 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i15 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i16 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i17 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i14, i15, j5, qVar2, rVar, iVar3, i16, i17, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i18 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        i = new com.gamericefishpro.space.u6.c(new u(8), new com.gamericefishpro.space.j7.c(29));
        final int i11 = 1;
        j = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(9), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i12 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i13 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i12 < size) {
                            Object obj13 = list8.get(i12);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i12++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i12 < size2) {
                            Object obj18 = list11.get(i12);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i12++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i14 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i14, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i15 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i16 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i17 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i18 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i15, i16, j5, qVar2, rVar, iVar3, i17, i18, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i19 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i12 = 2;
        k = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(10), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i13 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i14 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i13 < size) {
                            Object obj13 = list8.get(i13);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i13++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i13 < size2) {
                            Object obj18 = list11.get(i13);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i13++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i15 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i15, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i16 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i17 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i18 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i19 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i16, i17, j5, qVar2, rVar, iVar3, i18, i19, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i110 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i13 = 3;
        l = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(11), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i14 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i15 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i14 < size) {
                            Object obj13 = list8.get(i14);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i14++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i14 < size2) {
                            Object obj18 = list11.get(i14);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i14++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i16 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i16, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i17 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i18 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i19 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i110 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i17, i18, j5, qVar2, rVar, iVar3, i19, i110, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i14 = 4;
        m = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(12), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i15 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i14) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i16 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i15 < size) {
                            Object obj13 = list8.get(i15);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i15++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i15 < size2) {
                            Object obj18 = list11.get(i15);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i15++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i17 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i17, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i18 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i19 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i110 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i111 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i18, i19, j5, qVar2, rVar, iVar3, i110, i111, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i112 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i15 = 5;
        n = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(14), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i16 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i15) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i17 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i16 < size) {
                            Object obj13 = list8.get(i16);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i16++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i16 < size2) {
                            Object obj18 = list11.get(i16);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i16++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i18 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i18, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i19 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i110 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i111 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i112 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i19, i110, j5, qVar2, rVar, iVar3, i111, i112, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i113 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i16 = 6;
        new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(16), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i17 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i16) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i18 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i17 < size) {
                            Object obj13 = list8.get(i17);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i17++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i17 < size2) {
                            Object obj18 = list11.get(i17);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i17++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i19 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i19, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i110 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i111 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i112 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i113 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i110, i111, j5, qVar2, rVar, iVar3, i112, i113, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i114 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i17 = 7;
        o = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(17), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i18 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i17) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i19 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i18 < size) {
                            Object obj13 = list8.get(i18);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i18++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i18 < size2) {
                            Object obj18 = list11.get(i18);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i18++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i110 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i110, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i111 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i112 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i113 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i114 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i111, i112, j5, qVar2, rVar, iVar3, i113, i114, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i115 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        p = new x(v.d, w.d);
        final int i18 = 8;
        q = new x(new com.gamericefishpro.space.g7.a(18), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i19 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i18) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i110 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i19 < size) {
                            Object obj13 = list8.get(i19);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i19++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i19 < size2) {
                            Object obj18 = list11.get(i19);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i19++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i111 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i111, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i112 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i113 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i114 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i115 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i112, i113, j5, qVar2, rVar, iVar3, i114, i115, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i116 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i19 = 10;
        r = new x(new com.gamericefishpro.space.g7.a(19), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i19) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i20 = 11;
        s = new x(new com.gamericefishpro.space.g7.a(20), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i20) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i21 = 13;
        t = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(21), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i21) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i22 = 14;
        u = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(22), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i23 = 15;
        v = new x(new com.gamericefishpro.space.g7.a(23), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i23) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i24 = 16;
        w = new x(new com.gamericefishpro.space.g7.a(25), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i24) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i25 = 17;
        x = new x(new com.gamericefishpro.space.g7.a(26), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i25) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i26 = 18;
        y = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(28), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i26) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i27 = 19;
        z = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(29), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i27) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i28 = 21;
        A = new com.gamericefishpro.space.u6.c(new u(0), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i28) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i29 = 22;
        B = new x(new u(1), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i29) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i30 = 23;
        C = new x(new u(2), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i30) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
        final int i31 = 25;
        D = new x(new u(3), new Function1() { // from class: com.gamericefishpro.space.r2.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.o1.s sVar;
                com.gamericefishpro.space.o1.s sVar2;
                com.gamericefishpro.space.o1.s sVar3;
                int i110 = 0;
                j0Var = null;
                com.gamericefishpro.space.o1.j0 j0Var = null;
                sVar4 = null;
                com.gamericefishpro.space.b3.s sVar4 = null;
                iVar = null;
                i iVar = null;
                jVar = null;
                j jVar = null;
                j0Var2 = null;
                j0 j0Var2 = null;
                k0Var = null;
                k0 k0Var = null;
                b0Var = null;
                b0 b0Var = null;
                pVar = null;
                p pVar = null;
                g0Var = null;
                g0 g0Var = null;
                g0Var2 = null;
                g0 g0Var2 = null;
                switch (i31) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj2 = list.get(1);
                        List list2 = (Intrinsics.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) y.a.e).invoke(obj2);
                        Object obj3 = list.get(0);
                        String str = obj3 != null ? (String) obj3 : null;
                        Intrinsics.b(str);
                        return new e(list2, str);
                    case 1:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.l(((Integer) obj).intValue());
                    case 2:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                        List list3 = (List) obj;
                        return new com.gamericefishpro.space.b3.p(((Number) list3.get(0)).floatValue(), ((Number) list3.get(1)).floatValue());
                    case 3:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list4 = (List) obj;
                        Object obj4 = list4.get(0);
                        com.gamericefishpro.space.c3.o[] oVarArr = com.gamericefishpro.space.c3.n.b;
                        Function1 function1 = y.v.e;
                        Boolean bool = Boolean.FALSE;
                        Intrinsics.a(obj4, bool);
                        com.gamericefishpro.space.c3.n nVar = obj4 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj4) : null;
                        Intrinsics.b(nVar);
                        long j2 = nVar.a;
                        Object obj5 = list4.get(1);
                        Intrinsics.a(obj5, bool);
                        com.gamericefishpro.space.c3.n nVar2 = obj5 != null ? (com.gamericefishpro.space.c3.n) function1.invoke(obj5) : null;
                        Intrinsics.b(nVar2);
                        return new com.gamericefishpro.space.b3.q(j2, nVar2.a);
                    case 4:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.k(((Integer) obj).intValue());
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        return new com.gamericefishpro.space.b3.a(((Float) obj).floatValue());
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list5 = (List) obj;
                        Object obj6 = list5.get(0);
                        Integer num = obj6 != null ? (Integer) obj6 : null;
                        Intrinsics.b(num);
                        int iIntValue = num.intValue();
                        Object obj7 = list5.get(1);
                        Integer num2 = obj7 != null ? (Integer) obj7 : null;
                        Intrinsics.b(num2);
                        return new h0(a0.b(iIntValue, num2.intValue()));
                    case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list6 = (List) obj;
                        Object obj8 = list6.get(0);
                        int i111 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool2 = Boolean.FALSE;
                        Intrinsics.a(obj8, bool2);
                        if (obj8 != null) {
                            sVar = Intrinsics.a(obj8, Boolean.FALSE) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj8).intValue()));
                        } else {
                            sVar = null;
                        }
                        Intrinsics.b(sVar);
                        long j3 = sVar.a;
                        Object obj9 = list6.get(1);
                        x xVar = y.x;
                        Intrinsics.a(obj9, bool2);
                        com.gamericefishpro.space.n1.b bVar = obj9 != null ? (com.gamericefishpro.space.n1.b) xVar.e.invoke(obj9) : null;
                        Intrinsics.b(bVar);
                        long j4 = bVar.a;
                        Object obj10 = list6.get(2);
                        Float f2 = obj10 != null ? (Float) obj10 : null;
                        Intrinsics.b(f2);
                        return new com.gamericefishpro.space.o1.j0(j3, j4, f2.floatValue());
                    case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.k(((Integer) obj).intValue());
                    case 9:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list7 = (List) obj;
                        Object obj11 = list7.get(0);
                        String str2 = obj11 != null ? (String) obj11 : null;
                        Intrinsics.b(str2);
                        Object obj12 = list7.get(1);
                        com.gamericefishpro.space.u6.c cVar = y.i;
                        if (!Intrinsics.a(obj12, Boolean.FALSE) && obj12 != null) {
                            g0Var2 = (g0) ((Function1) cVar.e).invoke(obj12);
                        }
                        return new j(str2, g0Var2);
                    case 10:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.m(((Integer) obj).intValue());
                    case RequestError.STOP_TRACKING /* 11 */:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.d(((Integer) obj).intValue());
                    case 12:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list8 = (List) obj;
                        ArrayList arrayList = new ArrayList(list8.size());
                        int size = list8.size();
                        while (i110 < size) {
                            Object obj13 = list8.get(i110);
                            c cVar2 = (Intrinsics.a(obj13, Boolean.FALSE) || obj13 == null) ? null : (c) ((Function1) y.b.e).invoke(obj13);
                            Intrinsics.b(cVar2);
                            arrayList.add(cVar2);
                            i110++;
                        }
                        return arrayList;
                    case 13:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.i(((Integer) obj).intValue());
                    case 14:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.u2.j(((Integer) obj).intValue());
                    case 15:
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.a(obj, bool3)) {
                            return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.c3.n.c);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list9 = (List) obj;
                        Object obj14 = list9.get(0);
                        Float f3 = obj14 != null ? (Float) obj14 : null;
                        Intrinsics.b(f3);
                        float fFloatValue = f3.floatValue();
                        Object obj15 = list9.get(1);
                        x xVar2 = y.w;
                        Intrinsics.a(obj15, bool3);
                        com.gamericefishpro.space.c3.o oVar = obj15 != null ? (com.gamericefishpro.space.c3.o) xVar2.e.invoke(obj15) : null;
                        Intrinsics.b(oVar);
                        return new com.gamericefishpro.space.c3.n(com.gamericefishpro.space.hj.c.G(oVar.a, fFloatValue));
                    case 16:
                        if (Intrinsics.a(obj, 0)) {
                            return new com.gamericefishpro.space.c3.o(8589934592L);
                        }
                        return Intrinsics.a(obj, 1) ? new com.gamericefishpro.space.c3.o(4294967296L) : new com.gamericefishpro.space.c3.o(0L);
                    case 17:
                        if (Intrinsics.a(obj, Boolean.FALSE)) {
                            return new com.gamericefishpro.space.n1.b(9205357640488583168L);
                        }
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list10 = (List) obj;
                        Object obj16 = list10.get(0);
                        Float f4 = obj16 != null ? (Float) obj16 : null;
                        Intrinsics.b(f4);
                        float fFloatValue2 = f4.floatValue();
                        Object obj17 = list10.get(1);
                        Float f5 = obj17 != null ? (Float) obj17 : null;
                        Intrinsics.b(f5);
                        return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f5.floatValue())) & 4294967295L));
                    case 18:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list11 = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list11.size());
                        int size2 = list11.size();
                        while (i110 < size2) {
                            Object obj18 = list11.get(i110);
                            com.gamericefishpro.space.x2.a aVar = (Intrinsics.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (com.gamericefishpro.space.x2.a) ((Function1) y.z.e).invoke(obj18);
                            Intrinsics.b(aVar);
                            arrayList2.add(aVar);
                            i110++;
                        }
                        return new com.gamericefishpro.space.x2.b(arrayList2);
                    case 19:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj;
                        com.gamericefishpro.space.x2.c.a.getClass();
                        Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                        if (Intrinsics.a(localeForLanguageTag.toLanguageTag(), "und")) {
                            Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                        }
                        return new com.gamericefishpro.space.x2.a(localeForLanguageTag);
                    case 20:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list12 = (List) obj;
                        Object obj19 = list12.get(0);
                        String str4 = obj19 != null ? (String) obj19 : null;
                        Intrinsics.b(str4);
                        Object obj20 = list12.get(1);
                        com.gamericefishpro.space.u6.c cVar3 = y.i;
                        if (!Intrinsics.a(obj20, Boolean.FALSE) && obj20 != null) {
                            g0Var = (g0) ((Function1) cVar3.e).invoke(obj20);
                        }
                        return new i(str4, g0Var);
                    case 21:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list13 = (List) obj;
                        Object obj21 = list13.get(0);
                        float f6 = com.gamericefishpro.space.b3.f.b;
                        x xVar3 = y.B;
                        Boolean bool4 = Boolean.FALSE;
                        Intrinsics.a(obj21, bool4);
                        com.gamericefishpro.space.b3.f fVar = obj21 != null ? (com.gamericefishpro.space.b3.f) xVar3.e.invoke(obj21) : null;
                        Intrinsics.b(fVar);
                        float f7 = fVar.a;
                        Object obj22 = list13.get(1);
                        x xVar4 = y.C;
                        Intrinsics.a(obj22, bool4);
                        com.gamericefishpro.space.b3.h hVar = obj22 != null ? (com.gamericefishpro.space.b3.h) xVar4.e.invoke(obj22) : null;
                        Intrinsics.b(hVar);
                        int i112 = hVar.a;
                        Object obj23 = list13.get(2);
                        x xVar5 = y.D;
                        Intrinsics.a(obj23, bool4);
                        com.gamericefishpro.space.b3.g gVar = obj23 != null ? (com.gamericefishpro.space.b3.g) xVar5.e.invoke(obj23) : null;
                        Intrinsics.b(gVar);
                        return new com.gamericefishpro.space.b3.i(f7, i112, gVar.a);
                    case 22:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Float");
                        float fFloatValue3 = ((Float) obj).floatValue();
                        com.gamericefishpro.space.b3.f.a(fFloatValue3);
                        return new com.gamericefishpro.space.b3.f(fFloatValue3);
                    case 23:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.h(((Integer) obj).intValue());
                    case 24:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list14 = (List) obj;
                        Object obj24 = list14.get(0);
                        g gVar2 = obj24 != null ? (g) obj24 : null;
                        Intrinsics.b(gVar2);
                        Object obj25 = list14.get(2);
                        Integer num3 = obj25 != null ? (Integer) obj25 : null;
                        Intrinsics.b(num3);
                        int iIntValue2 = num3.intValue();
                        Object obj26 = list14.get(3);
                        Integer num4 = obj26 != null ? (Integer) obj26 : null;
                        Intrinsics.b(num4);
                        int iIntValue3 = num4.intValue();
                        Object obj27 = list14.get(4);
                        String str5 = obj27 != null ? (String) obj27 : null;
                        Intrinsics.b(str5);
                        switch (gVar2.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Object obj28 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar4 = y.g;
                                if (!Intrinsics.a(obj28, Boolean.FALSE) && obj28 != null) {
                                    pVar = (p) ((Function1) cVar4.e).invoke(obj28);
                                }
                                Intrinsics.b(pVar);
                                return new c(pVar, iIntValue2, iIntValue3, str5);
                            case 1:
                                Object obj29 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar5 = y.h;
                                if (!Intrinsics.a(obj29, Boolean.FALSE) && obj29 != null) {
                                    b0Var = (b0) ((Function1) cVar5.e).invoke(obj29);
                                }
                                Intrinsics.b(b0Var);
                                return new c(b0Var, iIntValue2, iIntValue3, str5);
                            case 2:
                                Object obj30 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar6 = y.c;
                                if (!Intrinsics.a(obj30, Boolean.FALSE) && obj30 != null) {
                                    k0Var = (k0) ((Function1) cVar6.e).invoke(obj30);
                                }
                                Intrinsics.b(k0Var);
                                return new c(k0Var, iIntValue2, iIntValue3, str5);
                            case 3:
                                Object obj31 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar7 = y.d;
                                if (!Intrinsics.a(obj31, Boolean.FALSE) && obj31 != null) {
                                    j0Var2 = (j0) ((Function1) cVar7.e).invoke(obj31);
                                }
                                Intrinsics.b(j0Var2);
                                return new c(j0Var2, iIntValue2, iIntValue3, str5);
                            case 4:
                                Object obj32 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar8 = y.e;
                                if (!Intrinsics.a(obj32, Boolean.FALSE) && obj32 != null) {
                                    jVar = (j) ((Function1) cVar8.e).invoke(obj32);
                                }
                                Intrinsics.b(jVar);
                                return new c(jVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                                Object obj33 = list14.get(1);
                                com.gamericefishpro.space.u6.c cVar9 = y.f;
                                if (!Intrinsics.a(obj33, Boolean.FALSE) && obj33 != null) {
                                    iVar = (i) ((Function1) cVar9.e).invoke(obj33);
                                }
                                Intrinsics.b(iVar);
                                return new c(iVar, iIntValue2, iIntValue3, str5);
                            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                Object obj34 = list14.get(1);
                                String str6 = obj34 != null ? (String) obj34 : null;
                                Intrinsics.b(str6);
                                return new c(new d0(str6), iIntValue2, iIntValue3, str5);
                            default:
                                throw new com.gamericefishpro.space.oh.k();
                        }
                    case 25:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                        return new com.gamericefishpro.space.b3.g(((Integer) obj).intValue());
                    case 26:
                        String str7 = obj != null ? (String) obj : null;
                        Intrinsics.b(str7);
                        return new k0(str7);
                    case 27:
                        String str8 = obj != null ? (String) obj : null;
                        Intrinsics.b(str8);
                        return new j0(str8);
                    case 28:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list15 = (List) obj;
                        Object obj35 = list15.get(0);
                        x xVar6 = y.q;
                        Boolean bool5 = Boolean.FALSE;
                        Intrinsics.a(obj35, bool5);
                        com.gamericefishpro.space.b3.k kVar = obj35 != null ? (com.gamericefishpro.space.b3.k) xVar6.e.invoke(obj35) : null;
                        Intrinsics.b(kVar);
                        int i113 = kVar.a;
                        Object obj36 = list15.get(1);
                        x xVar7 = y.r;
                        Intrinsics.a(obj36, bool5);
                        com.gamericefishpro.space.b3.m mVar = obj36 != null ? (com.gamericefishpro.space.b3.m) xVar7.e.invoke(obj36) : null;
                        Intrinsics.b(mVar);
                        int i114 = mVar.a;
                        Object obj37 = list15.get(2);
                        com.gamericefishpro.space.c3.o[] oVarArr2 = com.gamericefishpro.space.c3.n.b;
                        x xVar8 = y.v;
                        Intrinsics.a(obj37, bool5);
                        com.gamericefishpro.space.c3.n nVar3 = obj37 != null ? (com.gamericefishpro.space.c3.n) xVar8.e.invoke(obj37) : null;
                        Intrinsics.b(nVar3);
                        long j5 = nVar3.a;
                        Object obj38 = list15.get(3);
                        com.gamericefishpro.space.b3.q qVar = com.gamericefishpro.space.b3.q.c;
                        com.gamericefishpro.space.b3.q qVar2 = (Intrinsics.a(obj38, bool5) || obj38 == null) ? null : (com.gamericefishpro.space.b3.q) ((Function1) y.l.e).invoke(obj38);
                        Object obj39 = list15.get(4);
                        r rVar = (Intrinsics.a(obj39, bool5) || obj39 == null) ? null : (r) ((Function1) a0.a.e).invoke(obj39);
                        Object obj40 = list15.get(5);
                        com.gamericefishpro.space.b3.i iVar2 = com.gamericefishpro.space.b3.i.d;
                        com.gamericefishpro.space.b3.i iVar3 = (Intrinsics.a(obj40, bool5) || obj40 == null) ? null : (com.gamericefishpro.space.b3.i) ((Function1) y.A.e).invoke(obj40);
                        Object obj41 = list15.get(6);
                        com.gamericefishpro.space.b3.e eVar = (Intrinsics.a(obj41, bool5) || obj41 == null) ? null : (com.gamericefishpro.space.b3.e) ((Function1) a0.c.e).invoke(obj41);
                        Intrinsics.b(eVar);
                        int i115 = eVar.a;
                        Object obj42 = list15.get(7);
                        x xVar9 = y.s;
                        Intrinsics.a(obj42, bool5);
                        com.gamericefishpro.space.b3.d dVar = obj42 != null ? (com.gamericefishpro.space.b3.d) xVar9.e.invoke(obj42) : null;
                        Intrinsics.b(dVar);
                        int i116 = dVar.a;
                        Object obj43 = list15.get(8);
                        boolean zA = Intrinsics.a(obj43, bool5);
                        com.gamericefishpro.space.u6.c cVar10 = a0.d;
                        if (!zA && obj43 != null) {
                            sVar4 = (com.gamericefishpro.space.b3.s) ((Function1) cVar10.e).invoke(obj43);
                        }
                        return new p(i113, i114, j5, qVar2, rVar, iVar3, i115, i116, sVar4);
                    default:
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list16 = (List) obj;
                        Object obj44 = list16.get(0);
                        int i117 = com.gamericefishpro.space.o1.s.h;
                        Boolean bool6 = Boolean.FALSE;
                        Intrinsics.a(obj44, bool6);
                        if (obj44 != null) {
                            sVar2 = obj44.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj44).intValue()));
                        } else {
                            sVar2 = null;
                        }
                        Intrinsics.b(sVar2);
                        long j6 = sVar2.a;
                        Object obj45 = list16.get(1);
                        com.gamericefishpro.space.c3.o[] oVarArr3 = com.gamericefishpro.space.c3.n.b;
                        Function1 function2 = y.v.e;
                        Intrinsics.a(obj45, bool6);
                        com.gamericefishpro.space.c3.n nVar4 = obj45 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj45) : null;
                        Intrinsics.b(nVar4);
                        long j7 = nVar4.a;
                        Object obj46 = list16.get(2);
                        com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                        com.gamericefishpro.space.u2.k kVar3 = (Intrinsics.a(obj46, bool6) || obj46 == null) ? null : (com.gamericefishpro.space.u2.k) ((Function1) y.m.e).invoke(obj46);
                        Object obj47 = list16.get(3);
                        com.gamericefishpro.space.u2.i iVar4 = (Intrinsics.a(obj47, bool6) || obj47 == null) ? null : (com.gamericefishpro.space.u2.i) ((Function1) y.t.e).invoke(obj47);
                        Object obj48 = list16.get(4);
                        com.gamericefishpro.space.u2.j jVar2 = (Intrinsics.a(obj48, bool6) || obj48 == null) ? null : (com.gamericefishpro.space.u2.j) ((Function1) y.u.e).invoke(obj48);
                        Object obj49 = list16.get(6);
                        String str9 = obj49 != null ? (String) obj49 : null;
                        Object obj50 = list16.get(7);
                        Intrinsics.a(obj50, bool6);
                        com.gamericefishpro.space.c3.n nVar5 = obj50 != null ? (com.gamericefishpro.space.c3.n) function2.invoke(obj50) : null;
                        Intrinsics.b(nVar5);
                        long j8 = nVar5.a;
                        Object obj51 = list16.get(8);
                        com.gamericefishpro.space.b3.a aVar2 = (Intrinsics.a(obj51, bool6) || obj51 == null) ? null : (com.gamericefishpro.space.b3.a) ((Function1) y.n.e).invoke(obj51);
                        Object obj52 = list16.get(9);
                        com.gamericefishpro.space.b3.p pVar2 = (Intrinsics.a(obj52, bool6) || obj52 == null) ? null : (com.gamericefishpro.space.b3.p) ((Function1) y.k.e).invoke(obj52);
                        Object obj53 = list16.get(10);
                        com.gamericefishpro.space.x2.b bVar2 = com.gamericefishpro.space.x2.b.i;
                        com.gamericefishpro.space.x2.b bVar3 = (Intrinsics.a(obj53, bool6) || obj53 == null) ? null : (com.gamericefishpro.space.x2.b) ((Function1) y.y.e).invoke(obj53);
                        Object obj54 = list16.get(11);
                        Intrinsics.a(obj54, bool6);
                        if (obj54 != null) {
                            sVar3 = obj54.equals(bool6) ? new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.g) : new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.b(((Integer) obj54).intValue()));
                        } else {
                            sVar3 = null;
                        }
                        Intrinsics.b(sVar3);
                        long j9 = sVar3.a;
                        Object obj55 = list16.get(12);
                        com.gamericefishpro.space.b3.l lVar = (Intrinsics.a(obj55, bool6) || obj55 == null) ? null : (com.gamericefishpro.space.b3.l) ((Function1) y.j.e).invoke(obj55);
                        Object obj56 = list16.get(13);
                        com.gamericefishpro.space.o1.j0 j0Var3 = com.gamericefishpro.space.o1.j0.d;
                        com.gamericefishpro.space.u6.c cVar11 = y.o;
                        if (!Intrinsics.a(obj56, bool6) && obj56 != null) {
                            j0Var = (com.gamericefishpro.space.o1.j0) ((Function1) cVar11.e).invoke(obj56);
                        }
                        return new b0(j6, j7, kVar3, iVar4, jVar2, (com.gamericefishpro.space.u2.b) null, str9, j8, aVar2, pVar2, bVar3, j9, lVar, j0Var, 49184);
                }
            }
        });
    }

    public static final Object a(Object obj, com.gamericefishpro.space.e1.j jVar, com.gamericefishpro.space.e1.b bVar) {
        Object objC;
        return (obj == null || (objC = jVar.c(bVar, obj)) == null) ? Boolean.FALSE : objC;
    }
}
