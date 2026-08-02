package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fh8 implements gip, py7 {
    public final t6f a;

    public fh8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [c9c] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object kh8Var;
        Object a;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        mh8 mh8Var = d7fVar instanceof mh8 ? (mh8) d7fVar : null;
        if (mh8Var != null) {
            if (mh8Var instanceof kh8) {
                b0 = "offset";
            } else if (mh8Var instanceof ih8) {
                b0 = "index";
            } else if (mh8Var instanceof lh8) {
                b0 = "start";
            } else if (mh8Var instanceof hh8) {
                b0 = "end";
            } else {
                if (!(mh8Var instanceof jh8)) {
                    b6e.s();
                    return null;
                }
                b0 = "item_id";
            }
        }
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        switch (hashCode) {
            case -1019779949:
                if (b0.equals("offset")) {
                    inj injVar = (inj) t6fVar.za.getValue();
                    a = mh8Var != null ? mh8Var.a() : null;
                    injVar.getClass();
                    kh8Var = new kh8(inj.c(t7kVar, (knj) a, jSONObject));
                    return kh8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 100571:
                if (b0.equals("end")) {
                    d7b d7bVar = (d7b) t6fVar.ea.getValue();
                    d7bVar.getClass();
                    return new hh8(new f7b());
                }
                throw a8k.l(jSONObject, "type", b0);
            case 100346066:
                if (b0.equals("index")) {
                    tie tieVar = (tie) t6fVar.ha.getValue();
                    a = mh8Var != null ? mh8Var.a() : null;
                    tieVar.getClass();
                    kh8Var = new ih8(tie.c(t7kVar, (vie) a, jSONObject));
                    return kh8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 109757538:
                if (b0.equals("start")) {
                    rbr rbrVar = (rbr) t6fVar.Fa.getValue();
                    rbrVar.getClass();
                    return new lh8(new tbr());
                }
                throw a8k.l(jSONObject, "type", b0);
            case 2116204999:
                if (b0.equals("item_id")) {
                    eze ezeVar = (eze) t6fVar.qa.getValue();
                    gze gzeVar = (gze) (mh8Var != null ? mh8Var.a() : null);
                    ezeVar.getClass();
                    kh8Var = new jh8(new gze(y2x.J(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.c, t7kVar.d(), gzeVar != null ? gzeVar.a : null)));
                    return kh8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            default:
                throw a8k.l(jSONObject, "type", b0);
        }
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, mh8 mh8Var) {
        boolean z = mh8Var instanceof kh8;
        t6f t6fVar = this.a;
        if (z) {
            inj injVar = (inj) t6fVar.za.getValue();
            knj knjVar = ((kh8) mh8Var).a;
            injVar.getClass();
            return inj.d(t7kVar, knjVar);
        }
        if (mh8Var instanceof ih8) {
            tie tieVar = (tie) t6fVar.ha.getValue();
            vie vieVar = ((ih8) mh8Var).a;
            tieVar.getClass();
            return tie.d(t7kVar, vieVar);
        }
        if (mh8Var instanceof lh8) {
            ((rbr) t6fVar.Fa.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "start");
            return jSONObject;
        }
        if (mh8Var instanceof hh8) {
            ((d7b) t6fVar.ea.getValue()).getClass();
            JSONObject jSONObject2 = new JSONObject();
            etn.l0(t7kVar, jSONObject2, "type", "end");
            return jSONObject2;
        }
        if (!(mh8Var instanceof jh8)) {
            b6e.s();
            return null;
        }
        eze ezeVar = (eze) t6fVar.qa.getValue();
        gze gzeVar = ((jh8) mh8Var).a;
        ezeVar.getClass();
        return eze.c(t7kVar, gzeVar);
    }
}
