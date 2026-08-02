package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class h00 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h00(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        thj thjVar;
        switch (this.a) {
            case 0:
                j00 j00Var = (j00) this.c;
                jab jabVar = (jab) this.d;
                thj thjVar2 = (thj) this.e;
                g0l g0lVar = j00Var.i;
                oq oqVar = j00Var.f.a;
                icr icrVar = new icr(this.b);
                LinkedList linkedList = oqVar.F;
                kxi kxiVar = j00Var.b;
                u5l b = j00Var.h.a(jabVar, null).b(thjVar2);
                String str = j00Var.e.g;
                if (str == null) {
                    str = "mobile-album-album-default";
                }
                g0l.f(g0lVar, oqVar, icrVar, linkedList, kxiVar, b, str);
                break;
            case 1:
                a60 a60Var = (a60) this.c;
                List list = (List) this.d;
                mqs mqsVar = (mqs) this.e;
                g0l g0lVar2 = a60Var.f;
                int i = this.b;
                g0l.o(g0lVar2, new icr(i), list, a60Var.g, new w5l(a60Var.h, new jab(qkb.Tracks, 1, 1, 0), szf.M(mqsVar, 0, i), null), "mobile-downloads_music-track-default", y5g.A0(list, cyt.a), 1984);
                break;
            case 2:
                v83 v83Var = (v83) this.c;
                List list2 = (List) this.d;
                mqs mqsVar2 = (mqs) this.e;
                g0l g0lVar3 = v83Var.f;
                int i2 = this.b;
                g0l.o(g0lVar3, new icr(i2), list2, v83Var.g, new w5l(v83Var.h, new jab(qkb.Chapters, 1, 1, 0), szf.M(mqsVar2, 0, i2), null), "mobile-downloaded-track-default", y5g.A0(list2, cyt.a), 1984);
                break;
            case 3:
                nb6 nb6Var = (nb6) this.c;
                hvq hvqVar = (hvq) this.d;
                zsq zsqVar = (zsq) this.e;
                if (nb6Var.e) {
                    hvqVar.p().c(this.b);
                }
                hvqVar.q(zsqVar);
                break;
            case 4:
                m0s m0sVar = (m0s) this.c;
                Function2 function2 = (Function2) this.d;
                Function1 function1 = (Function1) this.e;
                if (m0sVar instanceof l0s) {
                    l0s l0sVar = (l0s) m0sVar;
                    function2.invoke(l0sVar.c, l0sVar.d);
                } else {
                    boolean z = m0sVar instanceof k0s;
                    int i3 = this.b;
                    if (z) {
                        function1.invoke(Integer.valueOf(i3));
                    } else {
                        function1.invoke(Integer.valueOf(i3));
                    }
                }
                break;
            case 5:
                eg4 eg4Var = (eg4) this.c;
                mqs mqsVar3 = (mqs) this.d;
                vgt vgtVar = (vgt) this.e;
                g0l g0lVar4 = eg4Var.d;
                jcr jcrVar = new jcr(mqsVar3);
                ArrayList arrayList = vgtVar.a;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((hg4) it.next()).a);
                }
                g0l.o(g0lVar4, jcrVar, arrayList2, eg4Var.e, eg4Var.f.b(szf.M(mqsVar3, 0, this.b)), "mobile-home-discovery_block-all_chart-default", y5g.x0(vgtVar.b, o3q.b), 1984);
                break;
            case 6:
                z88 z88Var = (z88) this.c;
                mqs mqsVar4 = (mqs) this.d;
                List list3 = (List) this.e;
                g0l g0lVar5 = z88Var.e;
                int i4 = this.b;
                g0l.o(g0lVar5, new icr(i4 < 0 ? 0 : i4), list3, z88Var.d, new w5l(z88Var.f, new jab(qkb.DislikedTracks, 1, 1, 0), szf.M(mqsVar4, 0, i4), null), "mobile-dislikes-track-default", y5g.A0(list3, syt.a), 1984);
                break;
            case 7:
                heb hebVar = (heb) this.c;
                List list4 = (List) this.d;
                mqs mqsVar5 = (mqs) this.e;
                g0l g0lVar6 = hebVar.f;
                int i5 = this.b;
                g0l.o(g0lVar6, new icr(i5), list4, hebVar.g, new w5l(hebVar.h, new jab(qkb.Episodes, 1, 1, 0), szf.M(mqsVar5, 0, i5), null), "mobile-downloads_podcasts-track-default", y5g.A0(list4, cyt.a), 1984);
                break;
            case 8:
                ygf ygfVar = (ygf) this.c;
                List list5 = (List) this.d;
                mqs mqsVar6 = (mqs) this.e;
                g0l g0lVar7 = ygfVar.f;
                int i6 = this.b;
                g0l.o(g0lVar7, new icr(i6), list5, ygfVar.g, new w5l(ygfVar.h, new jab(qkb.Tracks, 1, 1, 0), szf.M(mqsVar6, 0, i6), null), "mobile-downloads_kids-track-default", y5g.A0(list5, cyt.a), 1984);
                break;
            case 9:
                zgf zgfVar = (zgf) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                mqs mqsVar7 = (mqs) this.e;
                g0l g0lVar8 = zgfVar.f;
                int i7 = this.b;
                g0l.o(g0lVar8, new icr(i7), arrayList3, zgfVar.g, new w5l(zgfVar.h, new jab(qkb.Tracks, 1, 1, 0), szf.M(mqsVar7, 0, i7), null), "mobile-own_tracks-track-default", y5g.A0(arrayList3, cyt.a), 1984);
                break;
            case 10:
                qsj qsjVar = (qsj) this.c;
                rgt rgtVar = (rgt) this.d;
                mqs mqsVar8 = (mqs) this.e;
                g0l g0lVar9 = qsjVar.c;
                eul eulVar = rgtVar.a;
                g0l.m(g0lVar9, eulVar.f, new jcr(mqsVar8), qsjVar.d, qsjVar.e.b(szf.M(mqsVar8, 0, this.b)), (String) qsjVar.g.invoke(eulVar), null, null, null, null, 2016);
                break;
            default:
                n7v n7vVar = (n7v) this.c;
                p6v p6vVar = (p6v) this.d;
                m6v m6vVar = ((z8v) this.e).a;
                n7vVar.getClass();
                p6vVar.getClass();
                String str2 = p6vVar.c;
                m6vVar.getClass();
                boolean z2 = n7vVar.a().o;
                int i8 = this.b;
                if (z2) {
                    List list6 = m6vVar.g;
                    g6v g6vVar = m6vVar.f;
                    String str3 = (String) CollectionsKt.firstOrNull(list6);
                    pkb n = str3 != null ? pkb.BigFact : sj2.n(g6vVar, pkb.Fact);
                    if (str3 == null) {
                        str3 = g6vVar.a;
                    }
                    thjVar = new thj(n, str3, i8 + 1, 1, str2);
                } else {
                    thjVar = new thj(pkb.Link, p6vVar.b, i8 + 1, 1, str2);
                }
                rmb.k(n7vVar.b, str2, thjVar, null, 4);
                w1g.y(n7vVar.c.a.a, str2, p6vVar.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ h00(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ h00(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
