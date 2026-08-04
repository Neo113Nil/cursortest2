package com.gamericefishpro.space.k7;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.l4.u0;
import com.gamericefishpro.space.oh.t;
import com.gamericefishpro.space.ph.y;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.n;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.pi.x0;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.u5.k;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.z4.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.gamericefishpro.space.th.a aVar, com.gamericefishpro.space.a7.c cVar) {
        super(2, aVar);
        this.d = 12;
        this.i = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e eVar = new e((f) this.i, aVar, 0);
                eVar.e = obj;
                return eVar;
            case 1:
                e eVar2 = new e((u0) this.i, aVar, 1);
                eVar2.e = obj;
                return eVar2;
            case 2:
                return new e((Function2) this.e, (v0) this.i, aVar, 2);
            case 3:
                return new e((Function1) this.e, (v0) this.i, aVar, 3);
            case 4:
                e eVar3 = new e((Set) this.i, aVar, 4);
                eVar3.e = obj;
                return eVar3;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                e eVar4 = new e((com.gamericefishpro.space.o5.c) this.i, aVar, 5);
                eVar4.e = obj;
                return eVar4;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                e eVar5 = new e((com.gamericefishpro.space.o7.e) this.i, aVar, 6);
                eVar5.e = obj;
                return eVar5;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                e eVar6 = new e((com.gamericefishpro.space.r7.e) this.i, aVar, 7);
                eVar6.e = obj;
                return eVar6;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                e eVar7 = new e((com.gamericefishpro.space.s7.i) this.i, aVar, 8);
                eVar7.e = obj;
                return eVar7;
            case 9:
                return new e((com.gamericefishpro.space.t7.d) this.e, (Context) this.i, aVar, 9);
            case 10:
                e eVar8 = new e((Function2) this.i, aVar);
                eVar8.e = obj;
                return eVar8;
            case RequestError.STOP_TRACKING /* 11 */:
                e eVar9 = new e((com.gamericefishpro.space.u7.c) this.i, aVar, 11);
                eVar9.e = obj;
                return eVar9;
            default:
                e eVar10 = new e(aVar, (com.gamericefishpro.space.a7.c) this.i);
                eVar10.e = obj;
                return eVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((e) create((List) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((e) create((u0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((e) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((e) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((e) create((com.gamericefishpro.space.p4.b) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                ((e) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
                throw null;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((e) create((List) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((e) create((List) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return ((e) create((t) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((e) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((e) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case RequestError.STOP_TRACKING /* 11 */:
                return ((e) create((com.gamericefishpro.space.u7.b) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((e) create((k) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        com.gamericefishpro.space.th.a aVar = null;
        final int i2 = 1;
        Object obj2 = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                final List list = (List) this.e;
                final int i3 = z ? 1 : 0;
                ((f) obj2).e(new Function1() { // from class: com.gamericefishpro.space.k7.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i3) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                ((c) obj3).getClass();
                                List achievements = list;
                                Intrinsics.checkNotNullParameter(achievements, "achievements");
                                return new c(achievements);
                            case 1:
                                ((com.gamericefishpro.space.o7.d) obj3).getClass();
                                List entries = list;
                                Intrinsics.checkNotNullParameter(entries, "entries");
                                return new com.gamericefishpro.space.o7.d(entries, false);
                            default:
                                ((com.gamericefishpro.space.r7.d) obj3).getClass();
                                List levels = list;
                                Intrinsics.checkNotNullParameter(levels, "levels");
                                return new com.gamericefishpro.space.r7.d(levels, false);
                        }
                    }
                });
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                u0 u0Var = (u0) this.e;
                if ((u0Var instanceof com.gamericefishpro.space.l4.d) && u0Var.a <= ((u0) obj2).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                v0 v0Var = (v0) obj2;
                int i4 = com.gamericefishpro.space.n7.f.e;
                if (((com.gamericefishpro.space.n7.g) v0Var.getValue()).k) {
                    ((Function2) this.e).invoke(new Integer(((com.gamericefishpro.space.n7.g) v0Var.getValue()).b), new Integer(((com.gamericefishpro.space.n7.g) v0Var.getValue()).n));
                }
                return Unit.a;
            case 3:
                com.gamericefishpro.space.uh.a aVar5 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                v0 v0Var2 = (v0) obj2;
                int i5 = com.gamericefishpro.space.n7.f.e;
                if (((com.gamericefishpro.space.n7.g) v0Var2.getValue()).l && !((com.gamericefishpro.space.n7.g) v0Var2.getValue()).k) {
                    ((Function1) this.e).invoke(((com.gamericefishpro.space.n7.g) v0Var2.getValue()).m.name());
                }
                return Unit.a;
            case 4:
                com.gamericefishpro.space.uh.a aVar6 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                Set setKeySet = ((com.gamericefishpro.space.p4.b) this.e).a().keySet();
                ArrayList arrayList = new ArrayList(y.j(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.gamericefishpro.space.p4.d) it.next()).a);
                }
                Set set = (Set) obj2;
                if (set == com.gamericefishpro.space.o4.k.a) {
                    z2 = true;
                } else {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                                z2 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.uh.a aVar7 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                throw null;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.uh.a aVar8 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                final List list2 = (List) this.e;
                ((com.gamericefishpro.space.o7.e) obj2).e(new Function1() { // from class: com.gamericefishpro.space.k7.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i2) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                ((c) obj3).getClass();
                                List achievements = list2;
                                Intrinsics.checkNotNullParameter(achievements, "achievements");
                                return new c(achievements);
                            case 1:
                                ((com.gamericefishpro.space.o7.d) obj3).getClass();
                                List entries = list2;
                                Intrinsics.checkNotNullParameter(entries, "entries");
                                return new com.gamericefishpro.space.o7.d(entries, false);
                            default:
                                ((com.gamericefishpro.space.r7.d) obj3).getClass();
                                List levels = list2;
                                Intrinsics.checkNotNullParameter(levels, "levels");
                                return new com.gamericefishpro.space.r7.d(levels, false);
                        }
                    }
                });
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.uh.a aVar9 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                final List list3 = (List) this.e;
                final int i6 = 2;
                ((com.gamericefishpro.space.r7.e) obj2).e(new Function1() { // from class: com.gamericefishpro.space.k7.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i6) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                ((c) obj3).getClass();
                                List achievements = list3;
                                Intrinsics.checkNotNullParameter(achievements, "achievements");
                                return new c(achievements);
                            case 1:
                                ((com.gamericefishpro.space.o7.d) obj3).getClass();
                                List entries = list3;
                                Intrinsics.checkNotNullParameter(entries, "entries");
                                return new com.gamericefishpro.space.o7.d(entries, false);
                            default:
                                ((com.gamericefishpro.space.r7.d) obj3).getClass();
                                List levels = list3;
                                Intrinsics.checkNotNullParameter(levels, "levels");
                                return new com.gamericefishpro.space.r7.d(levels, false);
                        }
                    }
                });
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.uh.a aVar10 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                t tVar = (t) this.e;
                final boolean zBooleanValue = tVar.d.booleanValue();
                final boolean zBooleanValue2 = tVar.e.booleanValue();
                final boolean zBooleanValue3 = tVar.i.booleanValue();
                ((com.gamericefishpro.space.s7.i) obj2).e(new Function1() { // from class: com.gamericefishpro.space.s7.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        String appVersion = ((e) obj3).d;
                        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
                        return new e(zBooleanValue, zBooleanValue2, zBooleanValue3, appVersion);
                    }
                });
                return Unit.a;
            case 9:
                com.gamericefishpro.space.uh.a aVar11 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.t7.d dVar = (com.gamericefishpro.space.t7.d) this.e;
                Context activityContext = (Context) obj2;
                Intrinsics.checkNotNullParameter(activityContext, "activityContext");
                if (!dVar.e) {
                    dVar.e = true;
                    a0.u(m0.h(dVar), null, new com.gamericefishpro.space.db.d(dVar, activityContext, aVar, 11), 3);
                }
                return Unit.a;
            case 10:
                com.gamericefishpro.space.uh.a aVar12 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                CoroutineContext.Element elementJ = ((x) this.e).l().j(kotlin.coroutines.d.x);
                Intrinsics.b(elementJ);
                kotlin.coroutines.d dVar2 = (kotlin.coroutines.d) elementJ;
                n nVarA = a0.a();
                a0.t(x0.d, dVar2, com.gamericefishpro.space.pi.y.v, new com.gamericefishpro.space.db.d(nVarA, (Function2) obj2, (com.gamericefishpro.space.th.a) null));
                while (!nVarA.U()) {
                    try {
                        return a0.y(dVar2, new e0(nVarA, aVar, 13));
                    } catch (InterruptedException unused) {
                    }
                }
                return nVarA.H();
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.uh.a aVar13 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.u7.b state = (com.gamericefishpro.space.u7.b) this.e;
                Intrinsics.checkNotNullParameter(state, "state");
                ((com.gamericefishpro.space.u7.c) obj2).b.i(state);
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar14 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                k kVar = (k) this.e;
                Intrinsics.c(kVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return ((com.gamericefishpro.space.a7.c) obj2).invoke(kVar.d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function2 function2, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = 10;
        this.i = (i) function2;
    }
}
