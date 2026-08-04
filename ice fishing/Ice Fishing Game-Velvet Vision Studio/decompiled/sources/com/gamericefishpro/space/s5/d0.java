package com.gamericefishpro.space.s5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.pi.d1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements com.gamericefishpro.space.si.f {
    public final /* synthetic */ int d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public d0(com.gamericefishpro.space.ei.a0 a0Var, com.gamericefishpro.space.pi.x xVar, com.gamericefishpro.space.ti.j jVar, com.gamericefishpro.space.si.f fVar) {
        this.d = 1;
        this.e = a0Var;
        this.v = xVar;
        this.w = jVar;
        this.i = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r1.d(r15, r2) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r1.d(r15, r2) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int[] iArr, com.gamericefishpro.space.th.a aVar) {
        c0 c0Var;
        d0 d0Var;
        String[] strArr = (String[]) this.v;
        com.gamericefishpro.space.si.f fVar = (com.gamericefishpro.space.si.f) this.i;
        if (aVar instanceof c0) {
            c0Var = (c0) aVar;
            int i = c0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0Var.w = i - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, aVar);
            }
        } else {
            c0Var = new c0(this, aVar);
        }
        Object obj = c0Var.i;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0Var.w;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.ei.a0 a0Var = (com.gamericefishpro.space.ei.a0) this.e;
            if (a0Var.d == null) {
                Set setX = com.gamericefishpro.space.ph.v.x(strArr);
                c0Var.d = this;
                c0Var.e = iArr;
                c0Var.w = 1;
            } else {
                int[] iArr2 = (int[]) this.w;
                ArrayList arrayList = new ArrayList();
                int length = strArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    String str = strArr[i3];
                    int i5 = i4 + 1;
                    Object obj2 = a0Var.d;
                    if (obj2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    int i6 = iArr2[i4];
                    if (((int[]) obj2)[i6] != iArr[i6]) {
                        arrayList.add(str);
                    }
                    i3++;
                    i4 = i5;
                }
                if (!arrayList.isEmpty()) {
                    Set setO = CollectionsKt.O(arrayList);
                    c0Var.d = this;
                    c0Var.e = iArr;
                    c0Var.w = 2;
                }
                d0Var = this;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iArr = c0Var.e;
            d0Var = c0Var.d;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        ((com.gamericefishpro.space.ei.a0) d0Var.e).d = iArr;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    @Override // com.gamericefishpro.space.si.f
    public final Object d(Object obj, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.ti.i iVar;
        d0 d0Var;
        int i = this.d;
        boolean z = true;
        Serializable serializable = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return a((int[]) obj, aVar);
            case 1:
                if (aVar instanceof com.gamericefishpro.space.ti.i) {
                    iVar = (com.gamericefishpro.space.ti.i) aVar;
                    int i2 = iVar.w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        iVar.w = i2 - Integer.MIN_VALUE;
                    } else {
                        iVar = new com.gamericefishpro.space.ti.i(this, aVar);
                    }
                } else {
                    iVar = new com.gamericefishpro.space.ti.i(this, aVar);
                }
                Object obj2 = iVar.i;
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i3 = iVar.w;
                if (i3 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj2);
                    d1 d1Var = (d1) ((com.gamericefishpro.space.ei.a0) serializable).d;
                    if (d1Var != null) {
                        d1Var.c(new com.gamericefishpro.space.ti.k("Child of the scoped flow was cancelled"));
                        iVar.d = this;
                        iVar.e = obj;
                        iVar.w = 1;
                        if (d1Var.y(iVar) == aVar2) {
                            return aVar2;
                        }
                    }
                    d0Var = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = iVar.e;
                    d0Var = iVar.d;
                    com.gamericefishpro.space.wa.b.P(obj2);
                }
                com.gamericefishpro.space.ei.a0 a0Var = (com.gamericefishpro.space.ei.a0) d0Var.e;
                com.gamericefishpro.space.pi.x xVar = (com.gamericefishpro.space.pi.x) d0Var.v;
                com.gamericefishpro.space.pi.y yVar = com.gamericefishpro.space.pi.y.d;
                a0Var.d = com.gamericefishpro.space.pi.a0.u(xVar, null, new com.gamericefishpro.space.ti.h((com.gamericefishpro.space.ti.j) d0Var.w, (com.gamericefishpro.space.si.f) d0Var.i, obj, null), 1);
                return Unit.a;
            default:
                com.gamericefishpro.space.b0.h hVar = (com.gamericefishpro.space.b0.h) obj;
                com.gamericefishpro.space.ei.y yVar2 = (com.gamericefishpro.space.ei.y) this.v;
                com.gamericefishpro.space.ei.y yVar3 = (com.gamericefishpro.space.ei.y) this.i;
                com.gamericefishpro.space.ei.y yVar4 = (com.gamericefishpro.space.ei.y) serializable;
                if (hVar instanceof com.gamericefishpro.space.b0.k) {
                    yVar4.d++;
                } else if ((hVar instanceof com.gamericefishpro.space.b0.l) || (hVar instanceof com.gamericefishpro.space.b0.j)) {
                    yVar4.d--;
                } else if (hVar instanceof com.gamericefishpro.space.b0.f) {
                    yVar3.d++;
                } else if (hVar instanceof com.gamericefishpro.space.b0.g) {
                    yVar3.d--;
                } else if (hVar instanceof com.gamericefishpro.space.b0.d) {
                    yVar2.d++;
                } else if (hVar instanceof com.gamericefishpro.space.b0.e) {
                    yVar2.d--;
                }
                int i4 = yVar4.d;
                boolean z2 = false;
                boolean z3 = i4 > 0;
                boolean z4 = yVar3.d > 0;
                boolean z5 = yVar2.d > 0;
                com.gamericefishpro.space.y.c0 c0Var = (com.gamericefishpro.space.y.c0) this.w;
                if (c0Var.I != z3) {
                    c0Var.I = z3;
                    z2 = true;
                }
                if (c0Var.J != z4) {
                    c0Var.J = z4;
                    z2 = true;
                }
                if (c0Var.K != z5) {
                    c0Var.K = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    com.gamericefishpro.space.h2.k.j(c0Var);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ d0(Serializable serializable, Object obj, Serializable serializable2, Object obj2, int i) {
        this.d = i;
        this.e = serializable;
        this.i = obj;
        this.v = serializable2;
        this.w = obj2;
    }
}
