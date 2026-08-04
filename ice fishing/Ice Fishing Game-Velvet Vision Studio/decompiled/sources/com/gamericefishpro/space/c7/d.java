package com.gamericefishpro.space.c7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.l4.n0;
import com.gamericefishpro.space.l4.o;
import com.gamericefishpro.space.l4.p0;
import com.gamericefishpro.space.l4.u0;
import com.gamericefishpro.space.l4.v0;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.si.f {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.gamericefishpro.space.si.f e;

    public /* synthetic */ d(com.gamericefishpro.space.si.f fVar, int i) {
        this.d = i;
        this.e = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0185  */
    /* JADX WARN: Code duplicated, block: B:125:0x01db  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // com.gamericefishpro.space.si.f
    public final Object d(Object obj, com.gamericefishpro.space.th.a aVar) throws Throwable {
        c cVar;
        h hVar;
        i iVar;
        j jVar;
        k kVar;
        o oVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (aVar instanceof c) {
                    cVar = (c) aVar;
                    int i = cVar.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cVar.e = i - Integer.MIN_VALUE;
                    } else {
                        cVar = new c(this, aVar);
                    }
                } else {
                    cVar = new c(this, aVar);
                }
                Object obj2 = cVar.d;
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = cVar.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj2);
                    Integer num = (Integer) ((com.gamericefishpro.space.p4.b) obj).c(a.d);
                    Integer num2 = new Integer(num != null ? num.intValue() : 0);
                    cVar.e = 1;
                    if (this.e.d(num2, cVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj2);
                }
                return Unit.a;
            case 1:
                if (aVar instanceof h) {
                    hVar = (h) aVar;
                    int i3 = hVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        hVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        hVar = new h(this, aVar);
                    }
                } else {
                    hVar = new h(this, aVar);
                }
                Object obj3 = hVar.d;
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i4 = hVar.e;
                if (i4 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj3);
                    Boolean bool = (Boolean) ((com.gamericefishpro.space.p4.b) obj).c(a.a);
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    hVar.e = 1;
                    if (this.e.d(boolValueOf, hVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj3);
                }
                return Unit.a;
            case 2:
                if (aVar instanceof i) {
                    iVar = (i) aVar;
                    int i5 = iVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        iVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        iVar = new i(this, aVar);
                    }
                } else {
                    iVar = new i(this, aVar);
                }
                Object obj4 = iVar.d;
                com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
                int i6 = iVar.e;
                if (i6 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj4);
                    Boolean bool2 = (Boolean) ((com.gamericefishpro.space.p4.b) obj).c(a.b);
                    Boolean boolValueOf2 = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : true);
                    iVar.e = 1;
                    if (this.e.d(boolValueOf2, iVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj4);
                }
                return Unit.a;
            case 3:
                if (aVar instanceof j) {
                    jVar = (j) aVar;
                    int i7 = jVar.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        jVar.e = i7 - Integer.MIN_VALUE;
                    } else {
                        jVar = new j(this, aVar);
                    }
                } else {
                    jVar = new j(this, aVar);
                }
                Object obj5 = jVar.d;
                com.gamericefishpro.space.uh.a aVar5 = com.gamericefishpro.space.uh.a.d;
                int i8 = jVar.e;
                if (i8 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj5);
                    Boolean bool3 = (Boolean) ((com.gamericefishpro.space.p4.b) obj).c(a.c);
                    Boolean boolValueOf3 = Boolean.valueOf(bool3 != null ? bool3.booleanValue() : true);
                    jVar.e = 1;
                    if (this.e.d(boolValueOf3, jVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj5);
                }
                return Unit.a;
            case 4:
                if (aVar instanceof k) {
                    kVar = (k) aVar;
                    int i9 = kVar.e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        kVar.e = i9 - Integer.MIN_VALUE;
                    } else {
                        kVar = new k(this, aVar);
                    }
                } else {
                    kVar = new k(this, aVar);
                }
                Object obj6 = kVar.d;
                com.gamericefishpro.space.uh.a aVar6 = com.gamericefishpro.space.uh.a.d;
                int i10 = kVar.e;
                if (i10 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj6);
                    Integer num3 = (Integer) ((com.gamericefishpro.space.p4.b) obj).c(a.d);
                    Integer num4 = new Integer(num3 != null ? num3.intValue() : 0);
                    kVar.e = 1;
                    if (this.e.d(num4, kVar) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj6);
                }
                return Unit.a;
            default:
                if (aVar instanceof o) {
                    oVar = (o) aVar;
                    int i11 = oVar.e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        oVar.e = i11 - Integer.MIN_VALUE;
                    } else {
                        oVar = new o(this, aVar);
                    }
                } else {
                    oVar = new o(this, aVar);
                }
                Object obj7 = oVar.d;
                com.gamericefishpro.space.uh.a aVar7 = com.gamericefishpro.space.uh.a.d;
                int i12 = oVar.e;
                if (i12 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj7);
                    u0 u0Var = (u0) obj;
                    if (u0Var instanceof p0) {
                        throw ((p0) u0Var).b;
                    }
                    if (!(u0Var instanceof com.gamericefishpro.space.l4.d)) {
                        if (u0Var instanceof n0 ? true : u0Var instanceof v0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    Object obj8 = ((com.gamericefishpro.space.l4.d) u0Var).b;
                    oVar.e = 1;
                    if (this.e.d(obj8, oVar) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj7);
                }
                return Unit.a;
        }
    }
}
