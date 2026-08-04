package com.gamericefishpro.space.g5;

import com.gamericefishpro.space.f5.d0;
import com.gamericefishpro.space.t0.f1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.w.l1;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ l1 d;
    public final /* synthetic */ d0 e;
    public final /* synthetic */ com.gamericefishpro.space.f5.k i;
    public final /* synthetic */ com.gamericefishpro.space.t.b0 v;
    public final /* synthetic */ s2 w;
    public final /* synthetic */ i y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(l1 l1Var, d0 d0Var, com.gamericefishpro.space.f5.k kVar, com.gamericefishpro.space.t.b0 b0Var, s2 s2Var, i iVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = l1Var;
        this.e = d0Var;
        this.i = kVar;
        this.v = b0Var;
        this.w = s2Var;
        this.y = iVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new a0(this.d, this.e, this.i, this.v, this.w, this.y, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e1 A[LOOP:1: B:15:0x0061->B:28:0x00e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e5 A[EDGE_INSN: B:33:0x00e5->B:29:0x00e5 BREAK  A[LOOP:1: B:15:0x0061->B:28:0x00e1], SYNTHETIC] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        char c;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        com.gamericefishpro.space.wa.b.P(obj);
        l1 l1Var = this.d;
        Object objK = l1Var.a.k();
        f1 f1Var = l1Var.d;
        if (Intrinsics.a(objK, f1Var.getValue()) && (((com.gamericefishpro.space.f5.k) this.e.b.f.l()) == null || Intrinsics.a(f1Var.getValue(), this.i))) {
            Iterator it = ((List) this.w.getValue()).iterator();
            while (it.hasNext()) {
                this.y.b().c((com.gamericefishpro.space.f5.k) it.next());
            }
            com.gamericefishpro.space.t.b0 b0Var = this.v;
            long[] jArr = b0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    char c2 = 7;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        int i3 = 0;
                        while (i3 < i2) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = b0Var.b[i4];
                                c = c2;
                                float f = b0Var.c[i4];
                                if (!Intrinsics.a((String) obj2, ((com.gamericefishpro.space.f5.k) f1Var.getValue()).y)) {
                                    b0Var.e--;
                                    long[] jArr2 = b0Var.a;
                                    int i5 = b0Var.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    b0Var.b[i4] = null;
                                }
                            } else {
                                c = c2;
                            }
                            j >>= 8;
                            i3++;
                            c2 = c;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return Unit.a;
    }
}
