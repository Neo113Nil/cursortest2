package com.gamericefishpro.space.n7;

import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.s1;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.gamericefishpro.space.b7.b {
    public final int d;
    public final com.gamericefishpro.space.f7.c e;
    public final com.gamericefishpro.space.w7.b f;
    public final com.gamericefishpro.space.i7.c g;
    public final int h;
    public final int i;
    public final int j;
    public final s1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i, com.gamericefishpro.space.f7.c gameRepository, com.gamericefishpro.space.w7.b soundManager) {
        super(new g(g0.d, 0, 0, 30, 120, 120, null, false, 1, false, false, false, a.d, 0, 0, m0.e(new Pair(com.gamericefishpro.space.i7.d.CRIMSON_BOMB, 0), new Pair(com.gamericefishpro.space.i7.d.ICE_BLAST, 0), new Pair(com.gamericefishpro.space.i7.d.GOLD_STRIKE, 0)), null, null));
        Intrinsics.checkNotNullParameter(gameRepository, "gameRepository");
        Intrinsics.checkNotNullParameter(soundManager, "soundManager");
        this.d = i;
        this.e = gameRepository;
        this.f = soundManager;
        this.g = new com.gamericefishpro.space.i7.c();
        int i2 = i + 18;
        this.h = i2 > 35 ? 35 : i2;
        this.i = i * PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        int i3 = (i * 3) + 90;
        this.j = i3 > 180 ? 180 : i3;
        com.gamericefishpro.space.th.a aVar = null;
        com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(this), k0.a, new j(this, aVar, 0), 2);
        this.k = com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(this), null, new o(this, null), 3);
        com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(this), null, new j(this, aVar, 2), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(q qVar, com.gamericefishpro.space.vh.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i = kVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.v = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(qVar, cVar);
            }
        } else {
            kVar = new k(qVar, cVar);
        }
        Object obj = kVar.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = kVar.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            qVar.g.d();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = kVar.d;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        do {
            com.gamericefishpro.space.i7.c cVar2 = qVar.g;
            if (cVar2.a().isEmpty()) {
                if (!cVar2.b()) {
                    cVar2.c();
                }
                return Unit.a;
            }
            LinkedHashSet linkedHashSetA = cVar2.a();
            if (linkedHashSetA.isEmpty()) {
                cVar2.b = 1;
            } else {
                int i3 = cVar2.b + 1;
                if (i3 > 8) {
                    i3 = 8;
                }
                cVar2.b = i3;
                cVar2.e(linkedHashSetA);
            }
            cVar2.d();
            kVar.d = qVar;
            kVar.v = 1;
        } while (com.gamericefishpro.space.pi.a0.i(120L, kVar) != aVar);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object g(q qVar, int i, com.gamericefishpro.space.vh.c cVar) {
        l lVar;
        int i2;
        int i3;
        int iH;
        final int i4;
        int i5;
        final q qVar2;
        com.gamericefishpro.space.th.a aVar;
        final boolean z;
        final boolean z2;
        s1 s1Var;
        q qVar3 = qVar;
        int i6 = i;
        int i7 = qVar3.j;
        int i8 = qVar3.i;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i9 = lVar.B;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                lVar.B = i9 - Integer.MIN_VALUE;
            } else {
                lVar = new l(qVar3, cVar);
            }
        } else {
            lVar = new l(qVar3, cVar);
        }
        Object obj = lVar.z;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i10 = lVar.B;
        if (i10 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            int i11 = qVar3.g.a;
            i2 = i11 >= i8 ? 1 : 0;
            i3 = (i6 > 0 || i2 != 0) ? 0 : 1;
            int i12 = i7 - ((g) qVar3.c.d.getValue()).e;
            iH = i2 != 0 ? h(i11, i8, i7, i12) : 0;
            if (i2 != 0) {
                lVar.d = qVar3;
                lVar.e = i6;
                lVar.i = i11;
                lVar.v = i2;
                lVar.w = i3;
                lVar.y = iH;
                lVar.B = 1;
                if (qVar3.i(i11, iH, i12, lVar) == aVar2) {
                    return aVar2;
                }
                i5 = i11;
            } else {
                i4 = i11;
            }
            qVar2 = qVar3;
            final int i13 = i6;
            final int i14 = iH;
            aVar = null;
            if (i3 != 0) {
                com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(qVar2), null, new j(qVar2, aVar, 3), 3);
            }
            if (qVar2.g.b >= 5) {
                com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(qVar2), null, new j(qVar2, aVar, 4), 3);
            }
            if (qVar2.g.b >= 10) {
                com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(qVar2), null, new j(qVar2, aVar, 5), 3);
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (i3 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            qVar2.e(new Function1() { // from class: com.gamericefishpro.space.n7.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    g it = (g) obj2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    com.gamericefishpro.space.i7.a[][] aVarArr = (com.gamericefishpro.space.i7.a[][]) this.d.g.d;
                    ArrayList arrayList = new ArrayList(aVarArr.length);
                    for (com.gamericefishpro.space.i7.a[] aVarArr2 : aVarArr) {
                        arrayList.add(com.gamericefishpro.space.ph.v.w(aVarArr2));
                    }
                    return g.a(it, arrayList, i4, 0, i13, 0, 0, null, false, 0, false, z, z2, a.d, i14, 0, null, null, null, 246644);
                }
            });
            if ((i2 == 0 || i3 != 0) && (s1Var = qVar2.k) != null) {
                s1Var.c(null);
            }
            return Unit.a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i15 = lVar.y;
        int i16 = lVar.w;
        int i17 = lVar.v;
        i5 = lVar.i;
        int i18 = lVar.e;
        q qVar4 = lVar.d;
        com.gamericefishpro.space.wa.b.P(obj);
        i3 = i16;
        i2 = i17;
        i6 = i18;
        iH = i15;
        qVar3 = qVar4;
        i4 = i5;
        qVar2 = qVar3;
        final int i19 = i6;
        final int i110 = iH;
        aVar = null;
        if (i3 != 0) {
            com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(qVar2), null, new j(qVar2, aVar, 3), 3);
        }
        if (qVar2.g.b >= 5) {
            com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(qVar2), null, new j(qVar2, aVar, 4), 3);
        }
        if (qVar2.g.b >= 10) {
            com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.z4.m0.h(qVar2), null, new j(qVar2, aVar, 5), 3);
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (i3 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        qVar2.e(new Function1() { // from class: com.gamericefishpro.space.n7.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                g it = (g) obj2;
                Intrinsics.checkNotNullParameter(it, "it");
                com.gamericefishpro.space.i7.a[][] aVarArr = (com.gamericefishpro.space.i7.a[][]) this.d.g.d;
                ArrayList arrayList = new ArrayList(aVarArr.length);
                for (com.gamericefishpro.space.i7.a[] aVarArr2 : aVarArr) {
                    arrayList.add(com.gamericefishpro.space.ph.v.w(aVarArr2));
                }
                return g.a(it, arrayList, i4, 0, i19, 0, 0, null, false, 0, false, z, z2, a.d, i110, 0, null, null, null, 246644);
            }
        });
        if (i2 == 0) {
            s1Var.c(null);
        } else {
            s1Var.c(null);
        }
        return Unit.a;
    }

    public static int h(int i, int i2, int i3, int i4) {
        float f = i3 > 0 ? i4 / i3 : 1.0f;
        if (i >= i2 * 2 || f < 0.4f) {
            return 3;
        }
        return (((double) i) >= ((double) i2) * 1.4d || f < 0.7f) ? 2 : 1;
    }

    @Override // com.gamericefishpro.space.z4.s0
    public final void d() {
        s1 s1Var = this.k;
        if (s1Var != null) {
            s1Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r9.d("speed_runner", r6) == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i, int i2, int i3, com.gamericefishpro.space.vh.c cVar) {
        n nVar;
        q qVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i4 = nVar.w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nVar.w = i4 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        n nVar2 = nVar;
        Object obj = nVar2.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i5 = nVar2.w;
        if (i5 != 0) {
            if (i5 == 1) {
                i3 = nVar2.e;
                qVar = nVar2.d;
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        int i6 = this.d;
        int i7 = i6 * 20;
        nVar2.d = this;
        nVar2.e = i3;
        nVar2.w = 1;
        if (this.e.a(i6, i2, i, i7 + (i2 * 50), nVar2) != aVar) {
            qVar = this;
        }
        return aVar;
        if (i3 >= 30) {
            return Unit.a;
        }
        com.gamericefishpro.space.f7.c cVar2 = qVar.e;
        nVar2.d = null;
        nVar2.w = 2;
    }
}
