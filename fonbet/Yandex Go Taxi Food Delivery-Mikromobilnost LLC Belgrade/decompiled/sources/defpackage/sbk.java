package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivActionTimer$Action;
import com.yandex.div2.DivActionVideo$Action;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.m;
import com.yandex.div2.n;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class sbk implements qfy0 {
    public final JsonParserComponent a;

    public sbk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jbk a(yf90 yf90Var, wck wckVar, JSONObject jSONObject) {
        boolean z = wckVar instanceof zbk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return new mak(((c4k) jsonParserComponent.M.getValue()).a(yf90Var, ((zbk) wckVar).a, jSONObject));
        }
        if (wckVar instanceof ack) {
            h4k h4kVar = (h4k) jsonParserComponent.P.getValue();
            i4k i4kVar = ((ack) wckVar).a;
            h4kVar.getClass();
            return new nak(new e4k((String) xcx.a(i4kVar.a, jSONObject, "animator_id", q5z.c, q5z.b)));
        }
        if (wckVar instanceof bck) {
            return new oak(((m4k) jsonParserComponent.S.getValue()).a(yf90Var, ((bck) wckVar).a, jSONObject));
        }
        if (wckVar instanceof cck) {
            r4k r4kVar = (r4k) jsonParserComponent.V.getValue();
            s4k s4kVar = ((cck) wckVar).a;
            r4kVar.getClass();
            return new pak(new o4k(xcx.d(yf90Var, s4kVar.a, jSONObject, "index", wm11.b, b.h), xcx.c(yf90Var, s4kVar.b, jSONObject, "variable_name", wm11.c)));
        }
        if (wckVar instanceof dck) {
            return new qak(((w4k) jsonParserComponent.Y.getValue()).a(yf90Var, ((dck) wckVar).a, jSONObject));
        }
        if (wckVar instanceof eck) {
            ((k5k) jsonParserComponent.b0.getValue()).getClass();
            return new rak(new h5k());
        }
        if (wckVar instanceof fck) {
            y5k y5kVar = (y5k) jsonParserComponent.h0.getValue();
            z5k z5kVar = ((fck) wckVar).a;
            y5kVar.getClass();
            exq exqVar = z5kVar.a;
            JsonParserComponent jsonParserComponent2 = y5kVar.a;
            return new sak(new m5k((p5k) xcx.b(yf90Var, exqVar, jSONObject, "content", jsonParserComponent2.e0, jsonParserComponent2.c0)));
        }
        if (wckVar instanceof hck) {
            return new uak(((i6k) jsonParserComponent.n0.getValue()).a(yf90Var, ((hck) wckVar).a, jSONObject));
        }
        if (wckVar instanceof ick) {
            return new vak(((n6k) jsonParserComponent.q0.getValue()).a(yf90Var, ((ick) wckVar).a, jSONObject));
        }
        if (wckVar instanceof jck) {
            u6k u6kVar = (u6k) jsonParserComponent.t0.getValue();
            v6k v6kVar = ((jck) wckVar).a;
            u6kVar.getClass();
            return new wak(new r6k(xcx.c(yf90Var, v6kVar.a, jSONObject, "element_id", wm11.c)));
        }
        if (wckVar instanceof kck) {
            d7k d7kVar = (d7k) jsonParserComponent.w0.getValue();
            e7k e7kVar = ((kck) wckVar).a;
            d7kVar.getClass();
            return new xak(new a7k(xcx.c(yf90Var, e7kVar.a, jSONObject, "id", wm11.c)));
        }
        if (wckVar instanceof lck) {
            o7k o7kVar = (o7k) jsonParserComponent.z0.getValue();
            p7k p7kVar = ((lck) wckVar).a;
            o7kVar.getClass();
            return new yak(o7k.b(yf90Var, p7kVar, jSONObject));
        }
        if (wckVar instanceof mck) {
            return new zak(((i8k) jsonParserComponent.F0.getValue()).a(yf90Var, ((mck) wckVar).a, jSONObject));
        }
        if (wckVar instanceof ock) {
            x8k x8kVar = (x8k) jsonParserComponent.O0.getValue();
            z8k z8kVar = ((ock) wckVar).a;
            x8kVar.getClass();
            return new bbk(x8k.b(yf90Var, z8kVar, jSONObject));
        }
        if (wckVar instanceof pck) {
            return new cbk(((e9k) jsonParserComponent.R0.getValue()).a(yf90Var, ((pck) wckVar).a, jSONObject));
        }
        if (wckVar instanceof qck) {
            return new dbk(((j9k) jsonParserComponent.U0.getValue()).a(yf90Var, ((qck) wckVar).a, jSONObject));
        }
        if (wckVar instanceof rck) {
            o9k o9kVar = (o9k) jsonParserComponent.X0.getValue();
            p9k p9kVar = ((rck) wckVar).a;
            o9kVar.getClass();
            return new ebk(new l9k(xcx.c(yf90Var, p9kVar.a, jSONObject, "id", wm11.c), xcx.l(yf90Var, p9kVar.b, jSONObject, "multiple", wm11.a, b.f)));
        }
        if (wckVar instanceof sck) {
            return new fbk(((w9k) jsonParserComponent.a1.getValue()).a(yf90Var, ((sck) wckVar).a, jSONObject));
        }
        if (wckVar instanceof tck) {
            kak kakVar = (kak) jsonParserComponent.j1.getValue();
            lak lakVar = ((tck) wckVar).a;
            kakVar.getClass();
            return new gbk(new hak(xcx.d(yf90Var, lakVar.a, jSONObject, "action", m.a, DivActionTimer$Action.FROM_STRING), xcx.c(yf90Var, lakVar.b, jSONObject, "id", wm11.c)));
        }
        if (wckVar instanceof uck) {
            return new hbk(((cdk) jsonParserComponent.p1.getValue()).a(yf90Var, ((uck) wckVar).a, jSONObject));
        }
        if (wckVar instanceof vck) {
            idk idkVar = (idk) jsonParserComponent.s1.getValue();
            jdk jdkVar = ((vck) wckVar).a;
            idkVar.getClass();
            return new ibk(new fdk(xcx.d(yf90Var, jdkVar.a, jSONObject, "action", n.a, DivActionVideo$Action.FROM_STRING), xcx.c(yf90Var, jdkVar.b, jSONObject, "id", wm11.c)));
        }
        if (wckVar instanceof gck) {
            ((d6k) jsonParserComponent.k0.getValue()).getClass();
            return new tak(new a6k());
        }
        if (wckVar instanceof nck) {
            return new abk(((p8k) jsonParserComponent.I0.getValue()).a(yf90Var, ((nck) wckVar).a, jSONObject));
        }
        w511.b();
        return null;
    }
}
