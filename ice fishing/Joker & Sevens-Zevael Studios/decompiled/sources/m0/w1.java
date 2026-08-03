package m0;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4799i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4800j;

    public /* synthetic */ w1(int i10, int i11, Object obj, Object obj2) {
        this.f4797g = i11;
        this.f4799i = obj;
        this.f4798h = i10;
        this.f4800j = obj2;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        u uVar;
        u uVar2;
        int i10;
        switch (this.f4797g) {
            case 0:
                x1 x1Var = (x1) this.f4799i;
                s.z zVar = (s.z) this.f4800j;
                u uVar3 = (u) obj;
                int i11 = x1Var.f4810e;
                int i12 = this.f4798h;
                if (i11 == i12 && pc.j.a(zVar, x1Var.f4811f) && (uVar3 instanceof y)) {
                    long[] jArr = zVar.f6362a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j3 = jArr[i13];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((255 & j3) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        Object obj2 = zVar.f6363b[i17];
                                        boolean z10 = zVar.f6364c[i17] != i12;
                                        if (z10) {
                                            i10 = i14;
                                            y yVar = (y) uVar3;
                                            s.g0 g0Var = yVar.f4819m;
                                            v6.a.O(g0Var, obj2, x1Var);
                                            uVar2 = uVar3;
                                            if (obj2 instanceof i0) {
                                                i0 i0Var = (i0) obj2;
                                                if (!g0Var.c(i0Var)) {
                                                    v6.a.P(yVar.f4822p, i0Var);
                                                }
                                                s.g0 g0Var2 = x1Var.f4812g;
                                                if (g0Var2 != null) {
                                                    g0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            uVar2 = uVar3;
                                            i10 = i14;
                                        }
                                        if (z10) {
                                            zVar.g(i17);
                                        }
                                    } else {
                                        uVar2 = uVar3;
                                        i10 = i14;
                                    }
                                    j3 >>= i10;
                                    i16++;
                                    i14 = i10;
                                    uVar3 = uVar2;
                                }
                                uVar = uVar3;
                                if (i15 != i14) {
                                }
                            } else {
                                uVar = uVar3;
                            }
                            if (i13 != length) {
                                i13++;
                                uVar3 = uVar;
                            }
                        }
                    }
                }
                break;
            default:
                List list = (List) this.f4799i;
                oc.c cVar = (oc.c) this.f4800j;
                a0.f fVar = (a0.f) obj;
                pc.j.e(fVar, "$this$LazyColumn");
                fVar.a(list.size(), new a0.a0(26, list), new u0.d(-632812321, new vd.m(list, this.f4798h, cVar), true));
                break;
        }
        return ac.o.f277a;
    }
}
