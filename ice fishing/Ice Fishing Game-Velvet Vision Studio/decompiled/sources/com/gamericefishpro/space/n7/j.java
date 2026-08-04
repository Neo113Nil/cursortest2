package com.gamericefishpro.space.n7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.si.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ q i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(q qVar, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = qVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new j(this.i, aVar, 0);
            case 1:
                j jVar = new j(this.i, aVar, 1);
                jVar.e = ((Number) obj).intValue();
                return jVar;
            case 2:
                return new j(this.i, aVar, 2);
            case 3:
                return new j(this.i, aVar, 3);
            case 4:
                return new j(this.i, aVar, 4);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return new j(this.i, aVar, 5);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new j(this.i, aVar, 6);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new j(this.i, aVar, 7);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new j(this.i, aVar, 8);
            default:
                return new j(this.i, aVar, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((j) create(Integer.valueOf(((Number) obj).intValue()), (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((j) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        q qVar = this.i;
        int i2 = 1;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    qVar.g.c();
                    this.e = 1;
                    if (q.f(qVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                qVar.e(new d(qVar, 2));
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                qVar.e(new com.gamericefishpro.space.f0.t(this.e, 3));
                return Unit.a;
            case 2:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i4 = this.e;
                if (i4 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.c7.e eVar = qVar.e.h;
                    j jVar = new j(qVar, null, i2);
                    this.e = 1;
                    int i5 = com.gamericefishpro.space.si.r.a;
                    Object objA = e0.e(new com.gamericefishpro.space.ti.j(new com.gamericefishpro.space.si.q(jVar, (com.gamericefishpro.space.th.a) null), eVar, kotlin.coroutines.g.d, -2, com.gamericefishpro.space.ri.a.d), 0).a(com.gamericefishpro.space.ti.s.d, this);
                    if (objA != aVar3) {
                        objA = Unit.a;
                    }
                    if (objA != aVar3) {
                        objA = Unit.a;
                    }
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 3:
                com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
                int i6 = this.e;
                if (i6 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar = qVar.e;
                    int i7 = qVar.d;
                    this.e = 1;
                    if (cVar.b(i7, "NO_MOVES", this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 4:
                com.gamericefishpro.space.uh.a aVar5 = com.gamericefishpro.space.uh.a.d;
                int i8 = this.e;
                if (i8 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar2 = qVar.e;
                    this.e = 1;
                    if (cVar2.d("ice_combo", this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.uh.a aVar6 = com.gamericefishpro.space.uh.a.d;
                int i9 = this.e;
                if (i9 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar3 = qVar.e;
                    this.e = 1;
                    if (cVar3.d("combo_hunter", this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.uh.a aVar7 = com.gamericefishpro.space.uh.a.d;
                int i10 = this.e;
                if (i10 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar4 = qVar.e;
                    int i11 = qVar.d;
                    this.e = 1;
                    if (cVar4.b(i11, "TIME_UP", this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.uh.a aVar8 = com.gamericefishpro.space.uh.a.d;
                int i12 = this.e;
                if (i12 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar5 = qVar.e;
                    this.e = 1;
                    if (cVar5.d("crimson_blast", this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.uh.a aVar9 = com.gamericefishpro.space.uh.a.d;
                int i13 = this.e;
                if (i13 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar6 = qVar.e;
                    this.e = 1;
                    if (cVar6.d("ice_freeze", this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar10 = com.gamericefishpro.space.uh.a.d;
                int i14 = this.e;
                if (i14 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar7 = qVar.e;
                    this.e = 1;
                    if (cVar7.d("gold_fisher", this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
        }
    }
}
