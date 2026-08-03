package h2;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2709g;

    public /* synthetic */ u(int i10) {
        this.f2709g = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        Object a6;
        int i10 = this.f2709g;
        ac.o oVar = ac.o.f277a;
        switch (i10) {
            case 0:
                e eVar = (e) obj2;
                return bc.n.J(eVar.f2648h, y.a(eVar.f2647g, y.f2714a, (v0.b) obj));
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return Integer.valueOf(((r2.l) obj2).f6034a);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                r2.p pVar = (r2.p) obj2;
                return bc.n.J(Float.valueOf(pVar.f6038a), Float.valueOf(pVar.f6039b));
            case 3:
                v0.b bVar = (v0.b) obj;
                r2.q qVar = (r2.q) obj2;
                s2.n nVar = new s2.n(qVar.f6041a);
                x xVar = y.f2730q;
                return bc.n.J(y.a(nVar, xVar, bVar), y.a(new s2.n(qVar.f6042b), xVar, bVar));
            case 4:
                return Integer.valueOf(((k2.l) obj2).f3615g);
            case 5:
                j jVar = (j) obj2;
                return bc.n.J(jVar.f2680a, y.a(jVar.f2681b, y.f2722i, (v0.b) obj));
            case 6:
                return Float.valueOf(((r2.a) obj2).f6013a);
            case 7:
                v0.b bVar2 = (v0.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(y.a((c) list.get(i11), y.f2715b, bVar2));
                }
                return arrayList;
            case 8:
                g0 g0Var = (g0) obj2;
                return bc.n.J(Integer.valueOf((int) (g0Var.f2672a >> 32)), Integer.valueOf((int) (4294967295L & g0Var.f2672a)));
            case 9:
                v0.b bVar3 = (v0.b) obj;
                f1.f0 f0Var = (f1.f0) obj2;
                return bc.n.J(y.a(new f1.q(f0Var.f2249a), y.f2729p, bVar3), y.a(new e1.b(f0Var.f2250b), y.f2731r, bVar3), Float.valueOf(f0Var.f2251c));
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                s2.n nVar2 = (s2.n) obj2;
                return nVar2 != null ? s2.n.a(nVar2.f6402a, s2.n.f6401c) : false ? Boolean.FALSE : bc.n.J(Float.valueOf(s2.n.c(nVar2.f6402a)), new s2.o(s2.n.b(nVar2.f6402a)));
            case 11:
                e1.b bVar4 = (e1.b) obj2;
                return bVar4 != null ? e1.b.b(bVar4.f1929a, 9205357640488583168L) : false ? Boolean.FALSE : bc.n.J(Float.valueOf(Float.intBitsToFloat((int) (bVar4.f1929a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & bVar4.f1929a))));
            case 12:
                v0.b bVar5 = (v0.b) obj;
                List list2 = ((n2.b) obj2).f5042g;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    arrayList2.add(y.a((n2.a) list2.get(i12), y.f2733t, bVar5));
                }
                return arrayList2;
            case 13:
                return ((n2.a) obj2).f5040a.toLanguageTag();
            case 14:
                r2.i iVar = (r2.i) obj2;
                return bc.n.J(new r2.f(iVar.f6026a), new r2.h(iVar.f6027b), new r2.g());
            case 15:
                v0.b bVar6 = (v0.b) obj;
                c cVar = (c) obj2;
                Object obj3 = cVar.f2631a;
                if (obj3 instanceof q) {
                    gVar = g.f2662g;
                } else if (obj3 instanceof a0) {
                    gVar = g.f2663h;
                } else if (obj3 instanceof j0) {
                    gVar = g.f2664i;
                } else if (obj3 instanceof i0) {
                    gVar = g.f2665j;
                } else if (obj3 instanceof j) {
                    gVar = g.f2666k;
                } else if (obj3 instanceof i) {
                    gVar = g.f2667l;
                } else {
                    if (!(obj3 instanceof c0)) {
                        throw new UnsupportedOperationException();
                    }
                    gVar = g.f2668m;
                }
                switch (gVar.ordinal()) {
                    case 0:
                        pc.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        a6 = y.a((q) obj3, y.f2720g, bVar6);
                        break;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        pc.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        a6 = y.a((a0) obj3, y.f2721h, bVar6);
                        break;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        pc.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        a6 = y.a((j0) obj3, y.f2716c, bVar6);
                        break;
                    case 3:
                        pc.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        a6 = y.a((i0) obj3, y.f2717d, bVar6);
                        break;
                    case 4:
                        pc.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        a6 = y.a((j) obj3, y.f2718e, bVar6);
                        break;
                    case 5:
                        pc.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        a6 = y.a((i) obj3, y.f2719f, bVar6);
                        break;
                    case 6:
                        pc.j.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        a6 = ((c0) obj3).f2635a;
                        break;
                    default:
                        throw new ac.d();
                }
                return bc.n.J(gVar, a6, Integer.valueOf(cVar.f2632b), Integer.valueOf(cVar.f2633c), cVar.f2634d);
            case 16:
                i iVar2 = (i) obj2;
                return bc.n.J(iVar2.f2677a, y.a(iVar2.f2678b, y.f2722i, (v0.b) obj));
            case 17:
                return ((j0) obj2).f2682a;
            case 18:
                return ((i0) obj2).f2679a;
            case 19:
                v0.b bVar7 = (v0.b) obj;
                q qVar2 = (q) obj2;
                r2.k kVar = new r2.k(qVar2.f2696a);
                r2.m mVar = new r2.m(qVar2.f2697b);
                Object a8 = y.a(new s2.n(qVar2.f2698c), y.f2730q, bVar7);
                r2.q qVar3 = qVar2.f2699d;
                r2.q qVar4 = r2.q.f6040c;
                Object a10 = y.a(qVar3, y.f2725l, bVar7);
                Object a11 = y.a(qVar2.f2700e, z.f2735a, bVar7);
                r2.i iVar3 = qVar2.f2701f;
                r2.i iVar4 = r2.i.f6025c;
                return bc.n.J(kVar, mVar, a8, a10, a11, y.a(iVar3, y.f2734u, bVar7), y.a(new r2.e(qVar2.f2702g), z.f2736b, bVar7), new r2.d(qVar2.f2703h), y.a(qVar2.f2704i, z.f2737c, bVar7));
            case 20:
                v0.b bVar8 = (v0.b) obj;
                a0 a0Var = (a0) obj2;
                f1.q qVar5 = new f1.q(a0Var.f2612a.b());
                x xVar2 = y.f2729p;
                Object a12 = y.a(qVar5, xVar2, bVar8);
                s2.n nVar3 = new s2.n(a0Var.f2613b);
                x xVar3 = y.f2730q;
                Object a13 = y.a(nVar3, xVar3, bVar8);
                k2.l lVar = a0Var.f2614c;
                k2.l lVar2 = k2.l.f3611h;
                Object a14 = y.a(lVar, y.f2726m, bVar8);
                k2.j jVar2 = a0Var.f2615d;
                k2.k kVar2 = a0Var.f2616e;
                String str = a0Var.f2618g;
                Object a15 = y.a(new s2.n(a0Var.f2619h), xVar3, bVar8);
                Object a16 = y.a(a0Var.f2620i, y.f2727n, bVar8);
                Object a17 = y.a(a0Var.f2621j, y.f2724k, bVar8);
                n2.b bVar9 = a0Var.f2622k;
                n2.b bVar10 = n2.b.f5041i;
                Object a18 = y.a(bVar9, y.f2732s, bVar8);
                Object a19 = y.a(new f1.q(a0Var.f2623l), xVar2, bVar8);
                Object a20 = y.a(a0Var.f2624m, y.f2723j, bVar8);
                f1.f0 f0Var2 = a0Var.f2625n;
                f1.f0 f0Var3 = f1.f0.f2248d;
                return bc.n.J(a12, a13, a14, jVar2, kVar2, -1, str, a15, a16, a17, a18, a19, a20, y.a(f0Var2, y.f2728o, bVar8));
            case 21:
                v0.b bVar11 = (v0.b) obj;
                f0 f0Var4 = (f0) obj2;
                a0 a0Var2 = f0Var4.f2658a;
                v0.j jVar3 = y.f2721h;
                return bc.n.J(y.a(a0Var2, jVar3, bVar11), y.a(f0Var4.f2659b, jVar3, bVar11), y.a(f0Var4.f2660c, jVar3, bVar11), y.a(f0Var4.f2661d, jVar3, bVar11));
            case 22:
                Boolean valueOf = Boolean.valueOf(((s) obj2).f2707a);
                v0.j jVar4 = y.f2714a;
                return bc.n.J(valueOf, new h());
            case 23:
                return Integer.valueOf(((r2.e) obj2).f6019a);
            case 24:
                r2.s sVar = (r2.s) obj2;
                r2.r rVar = new r2.r(sVar.f6046a);
                v0.j jVar5 = y.f2714a;
                return bc.n.J(rVar, Boolean.valueOf(sVar.f6047b));
            case 25:
                ((Integer) obj2).getClass();
                x4.f.u(m0.z.y(1), (m0.r) obj);
                return oVar;
            case 26:
                ((Integer) obj2).getClass();
                x4.f.n(m0.z.y(1), (m0.r) obj);
                return oVar;
            case 27:
                v0.d dVar = (v0.d) obj2;
                Map map = dVar.f7036g;
                s.g0 g0Var2 = dVar.f7037h;
                Object[] objArr = g0Var2.f6267b;
                Object[] objArr2 = g0Var2.f6268c;
                long[] jArr = g0Var2.f6266a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j3 = jArr[i13];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j3) < 128) {
                                    int i16 = (i13 << 3) + i15;
                                    Object obj4 = objArr[i16];
                                    Map d10 = ((v0.e) objArr2[i16]).d();
                                    if (d10.isEmpty()) {
                                        map.remove(obj4);
                                    } else {
                                        map.put(obj4, d10);
                                    }
                                }
                                j3 >>= 8;
                            }
                            if (i14 != 8) {
                            }
                        }
                        if (i13 != length) {
                            i13++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 28:
                return obj2;
            default:
                ((Integer) obj2).getClass();
                ud.g.f(m0.z.y(1), (m0.r) obj);
                return oVar;
        }
    }

    public /* synthetic */ u(int i10, int i11) {
        this.f2709g = i11;
    }
}
