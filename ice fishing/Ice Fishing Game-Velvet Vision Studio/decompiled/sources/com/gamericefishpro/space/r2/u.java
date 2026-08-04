package com.gamericefishpro.space.r2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.pi.v1;
import com.gamericefishpro.space.y.c1;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ u(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.c cVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.e1.b bVar = (com.gamericefishpro.space.e1.b) obj;
                com.gamericefishpro.space.b3.i iVar = (com.gamericefishpro.space.b3.i) obj2;
                return com.gamericefishpro.space.ph.x.d(y.a(new com.gamericefishpro.space.b3.f(iVar.a), y.B, bVar), y.a(new com.gamericefishpro.space.b3.h(iVar.b), y.C, bVar), y.a(new com.gamericefishpro.space.b3.g(iVar.c), y.D, bVar));
            case 1:
                return Float.valueOf(((com.gamericefishpro.space.b3.f) obj2).a);
            case 2:
                return Integer.valueOf(((com.gamericefishpro.space.b3.h) obj2).a);
            case 3:
                return Integer.valueOf(((com.gamericefishpro.space.b3.g) obj2).a);
            case 4:
                return ((k0) obj2).a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.e1.b bVar2 = (com.gamericefishpro.space.e1.b) obj;
                p pVar = (p) obj2;
                Object objA = y.a(new com.gamericefishpro.space.b3.k(pVar.a), y.q, bVar2);
                Object objA2 = y.a(new com.gamericefishpro.space.b3.m(pVar.b), y.r, bVar2);
                Object objA3 = y.a(new com.gamericefishpro.space.c3.n(pVar.c), y.v, bVar2);
                com.gamericefishpro.space.b3.q qVar = pVar.d;
                com.gamericefishpro.space.b3.q qVar2 = com.gamericefishpro.space.b3.q.c;
                Object objA4 = y.a(qVar, y.l, bVar2);
                Object objA5 = y.a(pVar.e, a0.a, bVar2);
                com.gamericefishpro.space.b3.i iVar2 = pVar.f;
                com.gamericefishpro.space.b3.i iVar3 = com.gamericefishpro.space.b3.i.d;
                return com.gamericefishpro.space.ph.x.d(objA, objA2, objA3, objA4, objA5, y.a(iVar2, y.A, bVar2), y.a(new com.gamericefishpro.space.b3.e(pVar.g), a0.c, bVar2), y.a(new com.gamericefishpro.space.b3.d(pVar.h), y.s, bVar2), y.a(pVar.i, a0.d, bVar2));
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((j0) obj2).a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.e1.b bVar3 = (com.gamericefishpro.space.e1.b) obj;
                b0 b0Var = (b0) obj2;
                com.gamericefishpro.space.o1.s sVar = new com.gamericefishpro.space.o1.s(b0Var.a.b());
                x xVar = y.p;
                Object objA6 = y.a(sVar, xVar, bVar3);
                com.gamericefishpro.space.c3.n nVar = new com.gamericefishpro.space.c3.n(b0Var.b);
                x xVar2 = y.v;
                Object objA7 = y.a(nVar, xVar2, bVar3);
                com.gamericefishpro.space.u2.k kVar = b0Var.c;
                com.gamericefishpro.space.u2.k kVar2 = com.gamericefishpro.space.u2.k.e;
                Object objA8 = y.a(kVar, y.m, bVar3);
                Object objA9 = y.a(b0Var.d, y.t, bVar3);
                Object objA10 = y.a(b0Var.e, y.u, bVar3);
                String str = b0Var.g;
                Object objA11 = y.a(new com.gamericefishpro.space.c3.n(b0Var.h), xVar2, bVar3);
                Object objA12 = y.a(b0Var.i, y.n, bVar3);
                Object objA13 = y.a(b0Var.j, y.k, bVar3);
                com.gamericefishpro.space.x2.b bVar4 = b0Var.k;
                com.gamericefishpro.space.x2.b bVar5 = com.gamericefishpro.space.x2.b.i;
                Object objA14 = y.a(bVar4, y.y, bVar3);
                Object objA15 = y.a(new com.gamericefishpro.space.o1.s(b0Var.l), xVar, bVar3);
                Object objA16 = y.a(b0Var.m, y.j, bVar3);
                com.gamericefishpro.space.o1.j0 j0Var = b0Var.n;
                com.gamericefishpro.space.o1.j0 j0Var2 = com.gamericefishpro.space.o1.j0.d;
                return com.gamericefishpro.space.ph.x.d(objA6, objA7, objA8, objA9, objA10, -1, str, objA11, objA12, objA13, objA14, objA15, objA16, y.a(j0Var, y.o, bVar3));
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.e1.b bVar6 = (com.gamericefishpro.space.e1.b) obj;
                g0 g0Var = (g0) obj2;
                b0 b0Var2 = g0Var.a;
                com.gamericefishpro.space.u6.c cVar2 = y.h;
                return com.gamericefishpro.space.ph.x.d(y.a(b0Var2, cVar2, bVar6), y.a(g0Var.b, cVar2, bVar6), y.a(g0Var.c, cVar2, bVar6), y.a(g0Var.d, cVar2, bVar6));
            case 9:
                r rVar = (r) obj2;
                Boolean boolValueOf = Boolean.valueOf(rVar.a);
                com.gamericefishpro.space.u6.c cVar3 = y.a;
                return com.gamericefishpro.space.ph.x.d(boolValueOf, y.a(new h(rVar.b), a0.b, (com.gamericefishpro.space.e1.b) obj));
            case 10:
                return Integer.valueOf(((h) obj2).a);
            case RequestError.STOP_TRACKING /* 11 */:
                return Integer.valueOf(((com.gamericefishpro.space.b3.e) obj2).a);
            case 12:
                com.gamericefishpro.space.b3.s sVar2 = (com.gamericefishpro.space.b3.s) obj2;
                return com.gamericefishpro.space.ph.x.d(y.a(new com.gamericefishpro.space.b3.r(sVar2.a), a0.e, (com.gamericefishpro.space.e1.b) obj), Boolean.valueOf(sVar2.b));
            case 13:
                return Integer.valueOf(((com.gamericefishpro.space.b3.r) obj2).a);
            case 14:
                ((Integer) obj2).getClass();
                a4.e((com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 15:
                com.gamericefishpro.space.t0.r rVar2 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!rVar2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rVar2.V();
                }
                return Unit.a;
            case 16:
                com.gamericefishpro.space.t0.r rVar3 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!rVar3.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar3.V();
                }
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                y3.e((com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                a4.f((com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 19:
                String acc = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 20:
                CoroutineContext acc2 = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element2, "element");
                CoroutineContext coroutineContextK = acc2.K(element2.getKey());
                kotlin.coroutines.g gVar = kotlin.coroutines.g.d;
                if (coroutineContextK == gVar) {
                    return element2;
                }
                com.gamericefishpro.space.th.b bVar7 = kotlin.coroutines.d.x;
                kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContextK.j(bVar7);
                if (dVar == null) {
                    cVar = new kotlin.coroutines.c(element2, coroutineContextK);
                } else {
                    CoroutineContext coroutineContextK2 = coroutineContextK.K(bVar7);
                    if (coroutineContextK2 == gVar) {
                        return new kotlin.coroutines.c(dVar, element2);
                    }
                    cVar = new kotlin.coroutines.c(dVar, new kotlin.coroutines.c(element2, coroutineContextK2));
                }
                return cVar;
            case 21:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 22:
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (!(element3 instanceof v1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue3 = num != null ? num.intValue() : 1;
                return iIntValue3 == 0 ? element3 : Integer.valueOf(iIntValue3 + 1);
            case 23:
                v1 v1Var = (v1) obj;
                CoroutineContext.Element element4 = (CoroutineContext.Element) obj2;
                if (v1Var != null) {
                    return v1Var;
                }
                if (element4 instanceof v1) {
                    return (v1) element4;
                }
                return null;
            case 24:
                com.gamericefishpro.space.ui.x xVar3 = (com.gamericefishpro.space.ui.x) obj;
                CoroutineContext.Element element5 = (CoroutineContext.Element) obj2;
                if (element5 instanceof v1) {
                    v1 v1Var2 = (v1) element5;
                    Object objM = v1Var2.M(xVar3.a);
                    Object[] objArr = xVar3.b;
                    int i = xVar3.d;
                    objArr[i] = objM;
                    v1[] v1VarArr = xVar3.c;
                    xVar3.d = i + 1;
                    v1VarArr[i] = v1Var2;
                }
                return xVar3;
            default:
                return Integer.valueOf(((c1) obj2).a.g());
        }
    }

    public /* synthetic */ u(int i, int i2) {
        this.d = i2;
    }
}
