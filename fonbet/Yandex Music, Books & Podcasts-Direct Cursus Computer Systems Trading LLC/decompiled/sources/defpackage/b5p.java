package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class b5p extends s4k {
    public final List b;
    public final bf5 c;
    public final ve5 d;
    public final xdh e;
    public final int f;
    public final jyr g;
    public final jyr h;
    public final ConcurrentHashMap i;
    public n60 j;
    public boolean k;

    public b5p(List list, bf5 bf5Var, ve5 ve5Var, xdh xdhVar) {
        list.getClass();
        bf5Var.getClass();
        ve5Var.getClass();
        xdhVar.getClass();
        this.b = list;
        this.c = bf5Var;
        this.d = ve5Var;
        this.e = xdhVar;
        this.f = 20;
        bdt I = hag.I(vzo.class);
        l18 l18Var = l18.b;
        this.g = l18Var.b(I, true);
        this.h = l18Var.b(hag.I(aog.class), true);
        this.i = new ConcurrentHashMap();
        this.j = n60.h;
    }

    @Override // defpackage.s4k
    public final Object c(t4k t4kVar) {
        throw new IllegalStateException("getRefreshKey not implemented");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // defpackage.s4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o4k o4kVar, cg6 cg6Var) {
        a5p a5pVar;
        int i;
        z4p z4pVar;
        Object obj;
        bf5 bf5Var;
        z4p z4pVar2;
        z4p z4pVar3;
        int i2;
        boolean d;
        asj asjVar;
        z4p z4pVar4;
        asj asjVar2;
        boolean z;
        pxm c1pVar;
        k8q k8qVar;
        if (cg6Var instanceof a5p) {
            a5pVar = (a5p) cg6Var;
            int i3 = a5pVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a5pVar.o = i3 - Integer.MIN_VALUE;
                a5p a5pVar2 = a5pVar;
                Object obj2 = a5pVar2.m;
                nm6 nm6Var = nm6.a;
                i = a5pVar2.o;
                jyr jyrVar = this.g;
                List list = this.b;
                ve5 ve5Var = this.d;
                switch (i) {
                    case 0:
                        qgg.h0(obj2);
                        z4pVar = (z4p) o4kVar.a();
                        if (z4pVar == null) {
                            z4pVar = new z4p(0, 0);
                        }
                        obj = (ue5) list.get(z4pVar.a);
                        bf5Var = this.c;
                        int i4 = (!(bf5Var instanceof asj) && (obj instanceof yrj) && z4pVar.b == 0) ? 1 : 0;
                        if (o4kVar.a() != null) {
                            boolean z2 = obj instanceof jpg;
                            jyr jyrVar2 = this.h;
                            if (z2) {
                                a5pVar2.j = z4pVar;
                                a5pVar2.k = null;
                                a5pVar2.l = i4;
                                a5pVar2.o = 1;
                                Object d2 = ((aog) jyrVar2.getValue()).d((jpg) obj, a5pVar2);
                                if (d2 != nm6Var) {
                                    z4pVar2 = z4pVar;
                                    obj2 = d2;
                                    kpg kpgVar = (kpg) obj2;
                                    ve5Var.getClass();
                                    kpgVar.getClass();
                                    ve5Var.e = kpgVar.a;
                                    bf5Var = (bf5) obj2;
                                    z4pVar = z4pVar2;
                                }
                            } else if (obj instanceof yqi) {
                                a5pVar2.j = z4pVar;
                                a5pVar2.k = null;
                                a5pVar2.l = i4;
                                a5pVar2.o = 2;
                                Object i5 = ((aog) jyrVar2.getValue()).i((yqi) obj, a5pVar2);
                                if (i5 != nm6Var) {
                                    z4pVar2 = z4pVar;
                                    obj2 = i5;
                                    bf5Var = (bf5) obj2;
                                    z4pVar = z4pVar2;
                                }
                            } else {
                                if (!(obj instanceof yrj)) {
                                    b6e.s();
                                    return null;
                                }
                                if (i4 != 0) {
                                    gm5 gm5Var = ve5Var.d;
                                    a5pVar2.j = z4pVar;
                                    a5pVar2.k = (yrj) obj;
                                    a5pVar2.l = i4;
                                    a5pVar2.o = 3;
                                    Object s = gm5Var.s(a5pVar2);
                                    if (s != nm6Var) {
                                        int i6 = i4;
                                        z4pVar3 = z4pVar;
                                        obj2 = s;
                                        i2 = i6;
                                        ze5 ze5Var = (ze5) obj2;
                                        d = Intrinsics.d(ze5Var, we5.a);
                                        xdh xdhVar = this.e;
                                        if (!d) {
                                            a5pVar2.j = z4pVar3;
                                            a5pVar2.k = null;
                                            a5pVar2.l = i2;
                                            a5pVar2.o = 4;
                                            obj2 = ldg.G((vzo) jyrVar.getValue(), (yrj) obj, xdhVar, false, a5pVar2);
                                            if (obj2 != nm6Var) {
                                                z4pVar2 = z4pVar3;
                                                asjVar2 = (asj) obj2;
                                                if (asjVar2 == null) {
                                                    return new p4k(new Exception());
                                                }
                                                bf5Var = asjVar2;
                                                z4pVar = z4pVar2;
                                            }
                                        } else if (ze5Var instanceof ye5) {
                                            asjVar = ((ye5) ze5Var).a;
                                            bf5Var = asjVar;
                                            z4pVar = z4pVar3;
                                        } else {
                                            if (!Intrinsics.d(ze5Var, xe5.a)) {
                                                b6e.s();
                                                return null;
                                            }
                                            if (this.k) {
                                                a5pVar2.j = z4pVar3;
                                                a5pVar2.k = null;
                                                a5pVar2.l = i2;
                                                a5pVar2.o = 5;
                                                obj2 = ldg.G((vzo) jyrVar.getValue(), (yrj) obj, xdhVar, false, a5pVar2);
                                                if (obj2 != nm6Var) {
                                                    z4pVar4 = z4pVar3;
                                                    asjVar = (asj) obj2;
                                                    z4pVar3 = z4pVar4;
                                                    this.k = true;
                                                    if (asjVar == null) {
                                                        return new p4k(new Exception());
                                                    }
                                                    bf5Var = asjVar;
                                                    z4pVar = z4pVar3;
                                                }
                                            } else {
                                                asjVar = null;
                                                this.k = true;
                                                if (asjVar == null) {
                                                }
                                                bf5Var = asjVar;
                                                z4pVar = z4pVar3;
                                            }
                                        }
                                    }
                                } else {
                                    vzo vzoVar = (vzo) jyrVar.getValue();
                                    yrj yrjVar = (yrj) obj;
                                    String str = yrjVar.a;
                                    c0p c0pVar = yrjVar.b;
                                    String str2 = yrjVar.c;
                                    n1p n1pVar = yrjVar.d;
                                    i8q i8qVar = new i8q(str, false, c0pVar, str2, n1pVar != null ? n1pVar.a : null);
                                    int i7 = z4pVar.b;
                                    a5pVar2.j = z4pVar;
                                    a5pVar2.k = null;
                                    a5pVar2.l = i4;
                                    a5pVar2.o = 6;
                                    Object c = vzo.c(vzoVar, i8qVar, i7, false, a5pVar2, 20);
                                    if (c != nm6Var) {
                                        z4pVar2 = z4pVar;
                                        obj2 = c;
                                        k8qVar = (k8q) obj2;
                                        if (k8qVar != null) {
                                            return new p4k(new Exception());
                                        }
                                        asjVar2 = yd5.P(k8qVar);
                                        bf5Var = asjVar2;
                                        z4pVar = z4pVar2;
                                    }
                                }
                            }
                            return nm6Var;
                        }
                        z = bf5Var instanceof asj;
                        if (z) {
                            asj asjVar3 = (asj) bf5Var;
                            ve5Var.getClass();
                            ve5Var.a(new ye5(asjVar3));
                            int i8 = z4pVar.b;
                            int i9 = 0;
                            for (Object obj3 : asjVar3.f) {
                                int i10 = i9 + 1;
                                if (i9 < 0) {
                                    u75.n();
                                    throw null;
                                }
                                i4p i4pVar = (i4p) obj3;
                                int i11 = (this.f * i8) + i9;
                                if (i4pVar instanceof f3p) {
                                    c1pVar = new u0p(((f3p) i4pVar).b.a);
                                } else if (i4pVar instanceof g3p) {
                                    c1pVar = new v0p(((g3p) i4pVar).b.a);
                                } else if (i4pVar instanceof b4p) {
                                    c1pVar = new y0p(((b4p) i4pVar).b.e());
                                } else if (i4pVar instanceof a4p) {
                                    c1pVar = new z0p(((a4p) i4pVar).b.a);
                                } else if (i4pVar instanceof c4p) {
                                    c1pVar = new a1p(((c4p) i4pVar).b.a);
                                } else if (i4pVar instanceof f4p) {
                                    c1pVar = new b1p(((f4p) i4pVar).b.a);
                                } else if (i4pVar instanceof g4p) {
                                    u1u u1uVar = ((g4p) i4pVar).b;
                                    StationId stationId = u1uVar.a;
                                    List list2 = u1uVar.b;
                                    StationId stationId2 = StationId.a;
                                    List c2 = StationId.c(stationId.h(), list2);
                                    c2.getClass();
                                    c1pVar = new c1p(CollectionsKt.X(c2, StringUtils.COMMA, null, null, null, 62));
                                } else if (i4pVar instanceof h4p) {
                                    c1pVar = new d1p(((h4p) i4pVar).b.a);
                                } else if (i4pVar instanceof z3p) {
                                    c1pVar = new w0p(((z3p) i4pVar).b.a.a);
                                } else if (i4pVar instanceof u3p) {
                                    c1pVar = new b1p(((u3p) i4pVar).b.a);
                                } else if (i4pVar instanceof i3p) {
                                    c1pVar = new v0p(((i3p) i4pVar).b.a);
                                } else if (i4pVar instanceof h3p) {
                                    c1pVar = new u0p(((h3p) i4pVar).b.a);
                                } else if (i4pVar instanceof o3p) {
                                    c1pVar = new y0p(((o3p) i4pVar).b.f);
                                } else if (i4pVar instanceof l3p) {
                                    c1pVar = new w0p(((l3p) i4pVar).b.a);
                                } else if (i4pVar instanceof r3p) {
                                    c1pVar = new u0p(((r3p) i4pVar).b.a);
                                } else {
                                    boolean z3 = i4pVar instanceof v3p;
                                    pxm pxmVar = x0p.c;
                                    if (!z3) {
                                        if (i4pVar instanceof x3p) {
                                            zsu zsuVar = ((x3p) i4pVar).b;
                                            List c3 = StationId.c(zsuVar.e, zsuVar.f);
                                            c3.getClass();
                                            c1pVar = new c1p(CollectionsKt.X(c3, StringUtils.COMMA, null, null, null, 62));
                                        } else if (i4pVar instanceof p3p) {
                                            c1pVar = new z0p(((p3p) i4pVar).b.a);
                                        } else if (i4pVar instanceof m3p) {
                                            c1pVar = new u0p(((m3p) i4pVar).b.a);
                                        } else if (!(i4pVar instanceof j3p)) {
                                            if (i4pVar instanceof q3p) {
                                                c1pVar = new a1p(((q3p) i4pVar).b.a);
                                            } else if (!(i4pVar instanceof n3p)) {
                                                if (i4pVar instanceof w3p) {
                                                    c1pVar = new d1p(((w3p) i4pVar).b.a);
                                                } else if (i4pVar instanceof k3p) {
                                                    c1pVar = new b1p(((k3p) i4pVar).b.a);
                                                } else if (!(i4pVar instanceof t3p)) {
                                                    if (!(i4pVar instanceof d4p)) {
                                                        b6e.s();
                                                        return null;
                                                    }
                                                    c1pVar = new c1p(CollectionsKt.X(((d4p) i4pVar).b.c, StringUtils.COMMA, null, null, null, 62));
                                                }
                                            }
                                        }
                                    }
                                    c1pVar = pxmVar;
                                }
                                this.i.put(c1pVar, new Pair(Integer.valueOf(i11), new e1p(i8, asjVar3.c)));
                                i9 = i10;
                            }
                        }
                        if (bf5Var instanceof kpg) {
                            List list3 = ((kpg) bf5Var).a;
                            ArrayList A = nt0.A(list3, this.j);
                            n60 n60Var = this.j;
                            n60 n60Var2 = n60.h;
                            this.j = n60Var.a(jf0.D(list3));
                            int i12 = z4pVar.a + 1;
                            Integer valueOf = Integer.valueOf(i12);
                            if (i12 >= list.size()) {
                                valueOf = null;
                            }
                            return new q4k(A, null, valueOf != null ? new z4p(valueOf.intValue(), 0) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        }
                        if (!z) {
                            b6e.s();
                            return null;
                        }
                        asj asjVar4 = (asj) bf5Var;
                        ArrayList arrayList = asjVar4.f;
                        ArrayList A2 = nt0.A(arrayList, this.j);
                        n60 n60Var3 = this.j;
                        n60 n60Var4 = n60.h;
                        this.j = n60Var3.a(jf0.D(arrayList));
                        if (asjVar4.g) {
                            r13 = new z4p(z4pVar.a, z4pVar.b + 1);
                        } else {
                            int i13 = z4pVar.a + 1;
                            Integer valueOf2 = Integer.valueOf(i13);
                            if (i13 >= list.size()) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                r13 = new z4p(valueOf2.intValue(), 0);
                            }
                        }
                        return new q4k(A2, null, r13, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    case 1:
                        z4pVar2 = a5pVar2.j;
                        qgg.h0(obj2);
                        kpg kpgVar2 = (kpg) obj2;
                        ve5Var.getClass();
                        kpgVar2.getClass();
                        ve5Var.e = kpgVar2.a;
                        bf5Var = (bf5) obj2;
                        z4pVar = z4pVar2;
                        z = bf5Var instanceof asj;
                        if (z) {
                        }
                        if (bf5Var instanceof kpg) {
                        }
                        break;
                    case 2:
                        z4pVar2 = a5pVar2.j;
                        qgg.h0(obj2);
                        bf5Var = (bf5) obj2;
                        z4pVar = z4pVar2;
                        z = bf5Var instanceof asj;
                        if (z) {
                        }
                        if (bf5Var instanceof kpg) {
                        }
                        break;
                    case 3:
                        i2 = a5pVar2.l;
                        obj = a5pVar2.k;
                        z4pVar3 = a5pVar2.j;
                        qgg.h0(obj2);
                        ze5 ze5Var2 = (ze5) obj2;
                        d = Intrinsics.d(ze5Var2, we5.a);
                        xdh xdhVar2 = this.e;
                        if (!d) {
                        }
                        return nm6Var;
                    case 4:
                        z4pVar2 = a5pVar2.j;
                        qgg.h0(obj2);
                        asjVar2 = (asj) obj2;
                        if (asjVar2 == null) {
                        }
                        bf5Var = asjVar2;
                        z4pVar = z4pVar2;
                        z = bf5Var instanceof asj;
                        if (z) {
                        }
                        if (bf5Var instanceof kpg) {
                        }
                        break;
                    case 5:
                        z4pVar4 = a5pVar2.j;
                        qgg.h0(obj2);
                        asjVar = (asj) obj2;
                        z4pVar3 = z4pVar4;
                        this.k = true;
                        if (asjVar == null) {
                        }
                        bf5Var = asjVar;
                        z4pVar = z4pVar3;
                        z = bf5Var instanceof asj;
                        if (z) {
                        }
                        if (bf5Var instanceof kpg) {
                        }
                        break;
                    case 6:
                        z4pVar2 = a5pVar2.j;
                        qgg.h0(obj2);
                        k8qVar = (k8q) obj2;
                        if (k8qVar != null) {
                        }
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        a5pVar = new a5p(this, cg6Var);
        a5p a5pVar22 = a5pVar;
        Object obj22 = a5pVar22.m;
        nm6 nm6Var2 = nm6.a;
        i = a5pVar22.o;
        jyr jyrVar3 = this.g;
        List list4 = this.b;
        ve5 ve5Var2 = this.d;
        switch (i) {
        }
    }
}
