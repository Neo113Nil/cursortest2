package com.gamericefishpro.space.r2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.ph.q0;
import com.gamericefishpro.space.t0.x0;
import com.gamericefishpro.space.w.l0;
import com.gamericefishpro.space.w.n1;
import com.gamericefishpro.space.w.s0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ z(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                h hVar = null;
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                Intrinsics.b(bool);
                boolean zBooleanValue = bool.booleanValue();
                Object obj3 = list.get(1);
                boolean zA = Intrinsics.a(obj3, Boolean.FALSE);
                com.gamericefishpro.space.u6.c cVar = a0.b;
                if (!zA && obj3 != null) {
                    hVar = (h) ((Function1) cVar.e).invoke(obj3);
                }
                Intrinsics.b(hVar);
                return new r(hVar.a, zBooleanValue);
            case 1:
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new h(((Integer) obj).intValue());
            case 2:
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new com.gamericefishpro.space.b3.e(((Integer) obj).intValue());
            case 3:
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                com.gamericefishpro.space.b3.r rVar = (Intrinsics.a(obj4, Boolean.FALSE) || obj4 == null) ? null : (com.gamericefishpro.space.b3.r) ((Function1) a0.e.e).invoke(obj4);
                Intrinsics.b(rVar);
                int i = rVar.a;
                Object obj5 = list2.get(1);
                Boolean bool2 = obj5 != null ? (Boolean) obj5 : null;
                Intrinsics.b(bool2);
                return new com.gamericefishpro.space.b3.s(i, bool2.booleanValue());
            case 4:
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new com.gamericefishpro.space.b3.r(((Integer) obj).intValue());
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.c6.c it = (com.gamericefishpro.space.c6.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.H());
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.c6.c statement = (com.gamericefishpro.space.c6.c) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                com.gamericefishpro.space.qh.m mVar = new com.gamericefishpro.space.qh.m();
                while (statement.H()) {
                    mVar.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return q0.a(mVar);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.a2.b bVar = ((x0) obj).a;
                if (bVar != null) {
                    bVar.invoke();
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return com.gamericefishpro.space.v7.g.a((com.gamericefishpro.space.v7.g) obj, 0, false, 1);
            case 9:
                return Unit.a;
            case 10:
                s0 s0Var = (s0) obj;
                long j = s0Var.y;
                ((com.gamericefishpro.space.f1.y) n1.b.getValue()).c(s0Var, n1.a, s0Var.z);
                long j2 = s0Var.y;
                if (j != j2) {
                    l0 l0Var = s0Var.G;
                    if (l0Var != null) {
                        if (l0Var.a > j2) {
                            s0Var.x();
                        } else {
                            l0Var.g = j2;
                            if (l0Var.b == null) {
                                l0Var.h = com.gamericefishpro.space.gi.c.b((1.0d - ((double) l0Var.e.a(0))) * s0Var.y);
                            }
                        }
                    } else if (j2 != 0) {
                        s0Var.A();
                    }
                }
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                ((Function0) obj).invoke();
                return Unit.a;
            case 12:
                return new com.gamericefishpro.space.w.k(((Float) obj).floatValue());
            case 13:
                return new com.gamericefishpro.space.w.k(((Integer) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((com.gamericefishpro.space.w.k) obj).a);
            case 15:
                return new com.gamericefishpro.space.w.k(((com.gamericefishpro.space.c3.f) obj).d);
            case 16:
                return new com.gamericefishpro.space.c3.f(((com.gamericefishpro.space.w.k) obj).a);
            case 17:
                com.gamericefishpro.space.c3.g gVar = (com.gamericefishpro.space.c3.g) obj;
                return new com.gamericefishpro.space.w.l(Float.intBitsToFloat((int) (gVar.a >> 32)), Float.intBitsToFloat((int) (gVar.a & 4294967295L)));
            case 18:
                com.gamericefishpro.space.w.l lVar = (com.gamericefishpro.space.w.l) obj;
                return new com.gamericefishpro.space.c3.g((((long) Float.floatToRawIntBits(lVar.a)) << 32) | (((long) Float.floatToRawIntBits(lVar.b)) & 4294967295L));
            case 19:
                com.gamericefishpro.space.n1.e eVar = (com.gamericefishpro.space.n1.e) obj;
                return new com.gamericefishpro.space.w.l(Float.intBitsToFloat((int) (eVar.a >> 32)), Float.intBitsToFloat((int) (eVar.a & 4294967295L)));
            case 20:
                com.gamericefishpro.space.w.l lVar2 = (com.gamericefishpro.space.w.l) obj;
                return new com.gamericefishpro.space.n1.e((((long) Float.floatToRawIntBits(lVar2.a)) << 32) | (((long) Float.floatToRawIntBits(lVar2.b)) & 4294967295L));
            case 21:
                com.gamericefishpro.space.n1.b bVar2 = (com.gamericefishpro.space.n1.b) obj;
                return new com.gamericefishpro.space.w.l(Float.intBitsToFloat((int) (bVar2.a >> 32)), Float.intBitsToFloat((int) (bVar2.a & 4294967295L)));
            case 22:
                com.gamericefishpro.space.w.l lVar3 = (com.gamericefishpro.space.w.l) obj;
                return new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(lVar3.a)) << 32) | (((long) Float.floatToRawIntBits(lVar3.b)) & 4294967295L));
            case 23:
                long j3 = ((com.gamericefishpro.space.c3.i) obj).a;
                return new com.gamericefishpro.space.w.l((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case 24:
                com.gamericefishpro.space.w.l lVar4 = (com.gamericefishpro.space.w.l) obj;
                return new com.gamericefishpro.space.c3.i((((long) Math.round(lVar4.a)) << 32) | (((long) Math.round(lVar4.b)) & 4294967295L));
            case 25:
                long j4 = ((com.gamericefishpro.space.c3.k) obj).a;
                return new com.gamericefishpro.space.w.l((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 26:
                com.gamericefishpro.space.w.l lVar5 = (com.gamericefishpro.space.w.l) obj;
                int iRound = Math.round(lVar5.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(lVar5.b);
                return new com.gamericefishpro.space.c3.k((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case 27:
                com.gamericefishpro.space.n1.c cVar2 = (com.gamericefishpro.space.n1.c) obj;
                return new com.gamericefishpro.space.w.n(cVar2.a, cVar2.b, cVar2.c, cVar2.d);
            case 28:
                com.gamericefishpro.space.w.n nVar = (com.gamericefishpro.space.w.n) obj;
                return new com.gamericefishpro.space.n1.c(nVar.a, nVar.b, nVar.c, nVar.d);
            default:
                return Float.valueOf(((com.gamericefishpro.space.w.k) obj).a);
        }
    }
}
