package defpackage;

import com.connectsdk.service.airplay.PListParser;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dz9 implements gip, py7 {
    public final t6f a;

    public dz9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object kz9Var;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        oz9 oz9Var = d7fVar instanceof oz9 ? (oz9) d7fVar : null;
        if (oz9Var != null) {
            if (oz9Var instanceof mz9) {
                b0 = PListParser.TAG_STRING;
            } else if (oz9Var instanceof kz9) {
                b0 = "number";
            } else if (oz9Var instanceof jz9) {
                b0 = PListParser.TAG_INTEGER;
            } else if (oz9Var instanceof gz9) {
                b0 = "boolean";
            } else if (oz9Var instanceof hz9) {
                b0 = "color";
            } else if (oz9Var instanceof nz9) {
                b0 = "url";
            } else if (oz9Var instanceof iz9) {
                b0 = PListParser.TAG_DICT;
            } else if (oz9Var instanceof fz9) {
                b0 = PListParser.TAG_ARRAY;
            } else {
                if (!(oz9Var instanceof lz9)) {
                    b6e.s();
                    return null;
                }
                b0 = "property";
            }
        }
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        switch (hashCode) {
            case -1034364087:
                if (b0.equals("number")) {
                    lhj lhjVar = (lhj) t6fVar.wa.getValue();
                    Object a = oz9Var != null ? oz9Var.a() : null;
                    lhjVar.getClass();
                    kz9Var = new kz9(lhj.c(t7kVar, (nhj) a, jSONObject));
                    return kz9Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case -993141291:
                if (b0.equals("property")) {
                    kz9Var = new lz9(((gym) t6fVar.Ca.getValue()).c(t7kVar, (iym) (oz9Var != null ? oz9Var.a() : null), jSONObject));
                    return kz9Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case -891985903:
                if (b0.equals(PListParser.TAG_STRING)) {
                    yir yirVar = (yir) t6fVar.La.getValue();
                    Object a2 = oz9Var != null ? oz9Var.a() : null;
                    yirVar.getClass();
                    kz9Var = new mz9(yir.c(t7kVar, (ajr) a2, jSONObject));
                    return kz9Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 116079:
                if (b0.equals("url")) {
                    sqt sqtVar = (sqt) t6fVar.Ra.getValue();
                    Object a3 = oz9Var != null ? oz9Var.a() : null;
                    sqtVar.getClass();
                    kz9Var = new nz9(sqt.c(t7kVar, (uqt) a3, jSONObject));
                    return kz9Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 3083190:
                if (b0.equals(PListParser.TAG_DICT)) {
                    o28 o28Var = (o28) t6fVar.C.getValue();
                    Object a4 = oz9Var != null ? oz9Var.a() : null;
                    o28Var.getClass();
                    kz9Var = new iz9(o28.c(t7kVar, (q28) a4, jSONObject));
                    return kz9Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 64711720:
                if (b0.equals("boolean")) {
                    ac3 ac3Var = (ac3) t6fVar.k.getValue();
                    Object a5 = oz9Var != null ? oz9Var.a() : null;
                    ac3Var.getClass();
                    kz9Var = new gz9(ac3.c(t7kVar, (cc3) a5, jSONObject));
                    return kz9Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 93090393:
                if (b0.equals(PListParser.TAG_ARRAY)) {
                    mz0 mz0Var = (mz0) t6fVar.e.getValue();
                    Object a6 = oz9Var != null ? oz9Var.a() : null;
                    mz0Var.getClass();
                    kz9Var = new fz9(mz0.c(t7kVar, (oz0) a6, jSONObject));
                    return kz9Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 94842723:
                if (b0.equals("color")) {
                    ia5 ia5Var = (ia5) t6fVar.q.getValue();
                    Object a7 = oz9Var != null ? oz9Var.a() : null;
                    ia5Var.getClass();
                    kz9Var = new hz9(ia5.c(t7kVar, (ka5) a7, jSONObject));
                    return kz9Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 1958052158:
                if (b0.equals(PListParser.TAG_INTEGER)) {
                    lre lreVar = (lre) t6fVar.na.getValue();
                    Object a8 = oz9Var != null ? oz9Var.a() : null;
                    lreVar.getClass();
                    kz9Var = new jz9(lre.c(t7kVar, (nre) a8, jSONObject));
                    return kz9Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            default:
                throw a8k.l(jSONObject, "type", b0);
        }
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, oz9 oz9Var) {
        boolean z = oz9Var instanceof mz9;
        t6f t6fVar = this.a;
        if (z) {
            yir yirVar = (yir) t6fVar.La.getValue();
            ajr ajrVar = ((mz9) oz9Var).a;
            yirVar.getClass();
            return yir.d(t7kVar, ajrVar);
        }
        if (oz9Var instanceof kz9) {
            lhj lhjVar = (lhj) t6fVar.wa.getValue();
            nhj nhjVar = ((kz9) oz9Var).a;
            lhjVar.getClass();
            return lhj.d(t7kVar, nhjVar);
        }
        if (oz9Var instanceof jz9) {
            lre lreVar = (lre) t6fVar.na.getValue();
            nre nreVar = ((jz9) oz9Var).a;
            lreVar.getClass();
            return lre.d(t7kVar, nreVar);
        }
        if (oz9Var instanceof gz9) {
            ac3 ac3Var = (ac3) t6fVar.k.getValue();
            cc3 cc3Var = ((gz9) oz9Var).a;
            ac3Var.getClass();
            return ac3.d(t7kVar, cc3Var);
        }
        if (oz9Var instanceof hz9) {
            ia5 ia5Var = (ia5) t6fVar.q.getValue();
            ka5 ka5Var = ((hz9) oz9Var).a;
            ia5Var.getClass();
            return ia5.d(t7kVar, ka5Var);
        }
        if (oz9Var instanceof nz9) {
            sqt sqtVar = (sqt) t6fVar.Ra.getValue();
            uqt uqtVar = ((nz9) oz9Var).a;
            sqtVar.getClass();
            return sqt.d(t7kVar, uqtVar);
        }
        if (oz9Var instanceof iz9) {
            o28 o28Var = (o28) t6fVar.C.getValue();
            q28 q28Var = ((iz9) oz9Var).a;
            o28Var.getClass();
            return o28.d(t7kVar, q28Var);
        }
        if (oz9Var instanceof fz9) {
            mz0 mz0Var = (mz0) t6fVar.e.getValue();
            oz0 oz0Var = ((fz9) oz9Var).a;
            mz0Var.getClass();
            return mz0.d(t7kVar, oz0Var);
        }
        if (oz9Var instanceof lz9) {
            return ((gym) t6fVar.Ca.getValue()).b(t7kVar, ((lz9) oz9Var).a);
        }
        b6e.s();
        return null;
    }
}
