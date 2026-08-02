package defpackage;

import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class r5p implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6p b;

    public /* synthetic */ r5p(b6p b6pVar, int i) {
        this.a = i;
        this.b = b6pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                this.b.requireActivity().getOnBackPressedDispatcher().d();
                return Unit.a;
            case 1:
                this.b.K().a("");
                return Unit.a;
            case 2:
                b6p b6pVar = this.b;
                tao taoVar = b6pVar.K().s;
                nmb nmbVar = (nmb) taoVar.d;
                String str2 = (String) taoVar.b;
                long b = ((zzp) taoVar.e).b();
                mkb k = tao.k((c0p) taoVar.c);
                String G = ((fnb) taoVar.a).G();
                nmbVar.getClass();
                str2.getClass();
                G.getClass();
                LinkedHashMap r = su4.r("search_session_id", str2);
                r.put("event_timestamp", String.valueOf(b));
                r.put("page_id", k.a);
                dfi.p(1, "hash", G, "_meta", r);
                nmbVar.C("Search.SearchBar.Tapped", r);
                xdr xdrVar = b6pVar.q;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            case 3:
                this.b.M();
                return Unit.a;
            case 4:
                b6p b6pVar2 = this.b;
                grh grhVar = (grh) b6pVar2.H().p.b;
                if (grhVar.a && (str = (String) grhVar.i) != null && !grhVar.b) {
                    grhVar.b = true;
                    Pair c = grhVar.c();
                    n1p n1pVar = (n1p) c.a;
                    int intValue = ((Number) c.b).intValue();
                    tao taoVar2 = (tao) grhVar.d;
                    nmb nmbVar2 = (nmb) taoVar2.d;
                    amb t = tao.t(tao.d(n1pVar));
                    String str3 = (String) taoVar2.b;
                    long b2 = ((zzp) taoVar2.e).b();
                    mkb k2 = tao.k((c0p) taoVar2.c);
                    String G2 = ((fnb) taoVar2.a).G();
                    nmbVar2.getClass();
                    str3.getClass();
                    G2.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    eta.m(intValue, "filter_type", t.a, "filter_pos", linkedHashMap);
                    linkedHashMap.put("req_id", str);
                    linkedHashMap.put("search_session_id", str3);
                    linkedHashMap.put("event_timestamp", String.valueOf(b2));
                    linkedHashMap.put("page_id", k2.a);
                    linkedHashMap.put("hash", G2);
                    dfi.p(2, "page_type", "landing", "_meta", linkedHashMap);
                    nmbVar2.C("Search.SearchResultPage.Scrolled", linkedHashMap);
                }
                b6pVar2.K().p.a.c.setValue(Boolean.FALSE);
                return Unit.a;
            case 5:
                b6p b6pVar3 = this.b;
                b6pVar3.L();
                xdr xdrVar2 = b6pVar3.q;
                Boolean bool2 = Boolean.FALSE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                return Unit.a;
            case 6:
                this.b.K().p.a.c.setValue(Boolean.FALSE);
                return Unit.a;
            case 7:
                b6p b6pVar4 = this.b;
                b6pVar4.L();
                xdr xdrVar3 = b6pVar4.q;
                Boolean bool3 = Boolean.FALSE;
                xdrVar3.getClass();
                xdrVar3.m(null, bool3);
                return Unit.a;
            case 8:
                b6p b6pVar5 = this.b;
                c0p c0pVar = b6pVar5.o;
                if (c0pVar != null) {
                    return new p6p(c0pVar, (q0h) b6pVar5.l.getValue(), b6pVar5.g.m());
                }
                Intrinsics.j("argSearchContext");
                throw null;
            case 9:
                b6p b6pVar6 = this.b;
                b6pVar6.L();
                xdr xdrVar4 = b6pVar6.q;
                Boolean bool4 = Boolean.FALSE;
                xdrVar4.getClass();
                xdrVar4.m(null, bool4);
                return Unit.a;
            case 10:
                b6p b6pVar7 = this.b;
                n5p n5pVar = b6pVar7.p;
                if (n5pVar == null) {
                    n5pVar = new l5p(p0p.a, c0p.d);
                }
                String str4 = (String) b6pVar7.K().s.b;
                fnb fnbVar = b6pVar7.d().a;
                cvo cvoVar = b6pVar7.u;
                tmb x = b6pVar7.x();
                xdr xdrVar5 = b6pVar7.I().c;
                b6pVar7.I().getClass();
                boolean a = i0p.a();
                frt frtVar = (frt) b6pVar7.I().a.getValue();
                frtVar.getClass();
                return new j7i(n5pVar, str4, fnbVar, cvoVar, x, xdrVar5, a, new h0m(frtVar.j(), 16));
            case 11:
                b6p b6pVar8 = this.b;
                c0p c0pVar2 = b6pVar8.o;
                if (c0pVar2 != null) {
                    return new e3p(b6pVar8.g.m(), c0pVar2, (String) b6pVar8.K().s.b);
                }
                Intrinsics.j("argSearchContext");
                throw null;
            case 12:
                b6p b6pVar9 = this.b;
                return new q6p(b6pVar9.g.m(), b6pVar9.u, b6pVar9.x());
            case 13:
                b6p b6pVar10 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                upq upqVar = (upq) qdcVar.C(I);
                spq spqVar = upqVar.b;
                spq a2 = spqVar != null ? spq.a(spqVar, false, null, 123) : null;
                uvf uvfVar = ((q6p) b6pVar10.v.getValue()).c;
                hnq hnqVar = hnq.a;
                uvfVar.getClass();
                return new uoq("Search", null, null, new cjf("Search", upqVar, uvfVar, null, hnqVar, a2), (q6p) b6pVar10.v.getValue());
            default:
                uoq uoqVar = (uoq) this.b.w.getValue();
                lnq lnqVar = new lnq();
                uoqVar.getClass();
                return new gpq(uoqVar, lnqVar);
        }
    }
}
