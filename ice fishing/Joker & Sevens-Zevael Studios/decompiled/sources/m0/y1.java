package m0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Collection;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4835h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4836i;

    public /* synthetic */ y1(int i10, Object obj, Object obj2) {
        this.f4834g = i10;
        this.f4835h = obj;
        this.f4836i = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
    
        r8 = new x0.g(r6, java.lang.Integer.valueOf(r10));
     */
    @Override // oc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        x0.g gVar;
        switch (this.f4834g) {
            case 0:
                s.h0 h0Var = (s.h0) this.f4835h;
                y yVar = (y) this.f4836i;
                Object[] objArr = h0Var.f6275b;
                long[] jArr = h0Var.f6274a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j3 = jArr[i10];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j3) < 128) {
                                    yVar.z(objArr[(i10 << 3) + i12]);
                                }
                                j3 >>= 8;
                            }
                            if (i11 != 8) {
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        }
                    }
                }
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                rd.d0 d0Var = (rd.d0) this.f4835h;
                pd.a aVar = d0Var.f6130c;
                bd.e0 e0Var = d0Var.f6131d;
                fc.d dVar = null;
                if (((rd.y) ((d1) this.f4836i).getValue()).f6210f) {
                    e0Var.h(null, rd.y.a((rd.y) e0Var.getValue(), null, null, null, null, false, false, false, null, null, 991));
                    aVar.getClass();
                    aVar.f5691f = System.currentTimeMillis();
                    yc.r1 r1Var = d0Var.f6133f;
                    if (r1Var != null) {
                        r1Var.a(null);
                    }
                    d0Var.f6133f = yc.a0.q(androidx.lifecycle.m0.h(d0Var), null, new rd.z(d0Var, dVar, 5), 3);
                } else {
                    e0Var.h(null, rd.y.a((rd.y) e0Var.getValue(), null, null, null, null, true, false, false, null, null, 991));
                    aVar.getClass();
                    yc.r1 r1Var2 = d0Var.f6133f;
                    if (r1Var2 != null) {
                        r1Var2.a(null);
                    }
                }
                return ac.o.f277a;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((oc.c) this.f4835h).invoke((qd.l) this.f4836i);
                break;
            case 3:
                ((oc.c) this.f4835h).invoke(((qd.b) this.f4836i).f5823a);
                break;
            case 4:
                td.b bVar = (td.b) this.f4835h;
                d8.t tVar = ((m5.c) this.f4836i).f4881d;
                int ordinal = bVar.f6549b.ordinal();
                l5.b bVar2 = l5.b.f4159g;
                if (ordinal == 0) {
                    ((w0.q) tVar.f1816a).add(rd.e.f6134g);
                    ((l1) tVar.f1817b).setValue(bVar2);
                } else if (ordinal == 1) {
                    ((w0.q) tVar.f1816a).add(vd.c.f7317g);
                    ((l1) tVar.f1817b).setValue(bVar2);
                } else if (ordinal == 2) {
                    ((w0.q) tVar.f1816a).add(ud.c.f6748g);
                    ((l1) tVar.f1817b).setValue(bVar2);
                } else {
                    if (ordinal != 3) {
                        throw new ac.d();
                    }
                    ((w0.q) tVar.f1816a).add(zd.d.f9190g);
                    ((l1) tVar.f1817b).setValue(bVar2);
                }
                return ac.o.f277a;
            default:
                r rVar = ((x0.b) this.f4835h).f7963g;
                j2 j2Var = rVar.f4723c;
                boolean z10 = rVar.C;
                Collection collection = bc.v.f1067g;
                if (!z10) {
                    return collection;
                }
                i2 c3 = j2Var.c();
                int i13 = 0;
                while (true) {
                    try {
                        gVar = null;
                        if (i13 >= j2Var.f4632h) {
                            break;
                        } else {
                            boolean l10 = c3.l(i13);
                            Object obj = this.f4836i;
                            if (l10) {
                                Object n7 = c3.n(i13);
                                if (n7 != obj) {
                                    f2 f2Var = n7 instanceof f2 ? (f2) n7 : null;
                                    if ((f2Var != null ? f2Var.f4585a : null) == obj) {
                                    }
                                }
                            }
                            int[] iArr = c3.f4615b;
                            int i14 = i13 + 1;
                            int c7 = (i14 < c3.f4616c ? iArr[(i14 * 5) + 4] : c3.f4618e) - l2.c(iArr, i13);
                            int i15 = 0;
                            while (i15 < c7) {
                                Object h10 = c3.h(i13, i15);
                                if (h10 == obj) {
                                    break;
                                } else {
                                    f2 f2Var2 = h10 instanceof f2 ? (f2) h10 : null;
                                    if ((f2Var2 != null ? f2Var2.f4585a : null) == obj) {
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                            i13 = i14;
                        }
                    } finally {
                    }
                }
                x0.g gVar2 = new x0.g(i13, null);
                c3.c();
                gVar = gVar2;
                if (gVar == null) {
                    return collection;
                }
                int i16 = gVar.f7967a;
                Integer num = gVar.f7968b;
                if (rVar.C) {
                    try {
                        collection = u2.b.o(j2Var.c(), i16, num);
                    } finally {
                    }
                }
                return bc.m.a0(collection, rVar.F());
        }
        return ac.o.f277a;
    }
}
