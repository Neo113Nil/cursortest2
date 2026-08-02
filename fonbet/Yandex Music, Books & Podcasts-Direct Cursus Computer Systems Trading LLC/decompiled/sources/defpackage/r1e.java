package defpackage;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class r1e extends oj implements tyc {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                aal aalVar = (aal) obj3;
                boolean booleanValue3 = ((Boolean) obj4).booleanValue();
                ((u1e) this.receiver).getClass();
                if (!booleanValue && booleanValue2 && ((aalVar == aal.a || aalVar == aal.c) && !booleanValue3)) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                iv8 iv8Var = (iv8) obj;
                ukj ukjVar = (ukj) obj2;
                boolean booleanValue4 = ((Boolean) obj4).booleanValue();
                lhk lhkVar = (lhk) this.receiver;
                lhkVar.getClass();
                if (!((x66) obj3).a) {
                    return bhk.a;
                }
                if (booleanValue4) {
                    return new xgk(((skr) lhkVar.p.getValue()).c(R.string.option_paywall_only_for_owner_message));
                }
                if (ukjVar == null) {
                    return ahk.a;
                }
                Continuation continuation = null;
                if (ukjVar instanceof skj) {
                    rdk rdkVar = lhkVar.s;
                    if (rdkVar != null) {
                        String lgbVar = ((skj) ukjVar).a.toString();
                        v3n v3nVar = (v3n) rdkVar.D();
                        v3nVar.getClass();
                        x97.y(v3nVar.b, null, null, new c5l(v3nVar, r3n.i, lgbVar, continuation, 18), 3);
                    }
                    return new xgk(((skr) lhkVar.p.getValue()).c(R.string.option_paywall_no_offers_message));
                }
                if (!(ukjVar instanceof tkj)) {
                    b6e.s();
                    return null;
                }
                bve G = lhk.G(ukjVar);
                rdk rdkVar2 = lhkVar.s;
                if (G == null) {
                    if (rdkVar2 != null) {
                        v3n v3nVar2 = (v3n) rdkVar2.D();
                        v3nVar2.getClass();
                        v3n.c(v3nVar2, r3n.j);
                    }
                    return new xgk(((skr) lhkVar.p.getValue()).c(R.string.option_paywall_no_offers_message));
                }
                if (rdkVar2 != null) {
                    rdkVar2.g = G;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(pjk.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    rdkVar2.f = ((pjk) qdcVar.C(I)).a(G);
                    bdt I2 = hag.I(xx2.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    xx2 xx2Var = (xx2) qdcVar2.C(I2);
                    String str = (String) rdkVar2.b;
                    l13 l13Var = xx2Var.a;
                    str.getClass();
                    jyr b = btf.b(new uu1(23));
                    jyr b2 = l13Var.b(hag.I(r18.class), true);
                    str.getClass();
                    x3n x3nVar = new x3n();
                    x3nVar.a = str;
                    x3nVar.b = b;
                    x3nVar.c = b2;
                    jkj jkjVar = G.p;
                    x3nVar.d = new wkj(t75.c(jkjVar.a), t75.c(jkjVar.b), jkjVar.c);
                    rdkVar2.e = x3nVar;
                    nmb d0 = x3nVar.d0();
                    wkj wkjVar = (wkj) x3nVar.d;
                    String R = x3n.R(wkjVar.a);
                    String R2 = x3n.R(wkjVar.b);
                    String R3 = x3n.R(wkjVar.c);
                    d0.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("offersBatchId", R);
                    linkedHashMap.put("offersPositionIds", R2);
                    linkedHashMap.put("billingProductIds", R3);
                    dfi.p(1, "communication_id", str, "_meta", linkedHashMap);
                    d0.C("PurchaseFullscreen.Showed", linkedHashMap);
                    ((lkj) ((kkj) ((jyr) rdkVar2.d).getValue())).b(G);
                    v3n v3nVar3 = (v3n) rdkVar2.D();
                    v3nVar3.getClass();
                    v3n.c(v3nVar3, r3n.k);
                }
                vat vatVar = new vat(((skr) lhkVar.p.getValue()).c(R.string.subscribe_yandex_music), null, null);
                String str2 = G.g;
                if (str2 != null) {
                    vatVar = new vat(str2, G.i, G.k);
                }
                String str3 = G.n;
                return new ygk(new p3n((String) vatVar.a, (String) vatVar.b, (String) vatVar.c, str3, G.o, new epa(lhkVar, G, str3 != null, iv8Var)));
        }
    }
}
