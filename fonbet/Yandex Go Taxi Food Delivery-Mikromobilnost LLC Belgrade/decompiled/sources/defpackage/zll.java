package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zll implements zsq0, nyi {
    public final JsonParserComponent a;

    public zll(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [exq] */
    /* JADX WARN: Type inference failed for: r6v2, types: [exq] */
    /* JADX WARN: Type inference failed for: r9v1, types: [exq] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JSONObject jSONObject2;
        Object gmlVar;
        Object a;
        Object bmlVar;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        jml jmlVar = hexVar instanceof jml ? (jml) hexVar : null;
        if (jmlVar != null) {
            if (jmlVar instanceof hml) {
                R = "string";
            } else if (jmlVar instanceof fml) {
                R = "integer";
            } else if (jmlVar instanceof gml) {
                R = "number";
            } else if (jmlVar instanceof dml) {
                R = "color";
            } else if (jmlVar instanceof cml) {
                R = "boolean";
            } else if (jmlVar instanceof iml) {
                R = "url";
            } else if (jmlVar instanceof eml) {
                R = "dict";
            } else {
                if (!(jmlVar instanceof bml)) {
                    w511.b();
                    return null;
                }
                R = "array";
            }
        }
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1034364087:
                jSONObject2 = jSONObject;
                if (R.equals("number")) {
                    qn60 qn60Var = (qn60) jsonParserComponent.qa.getValue();
                    a = jmlVar != null ? jmlVar.a() : null;
                    qn60Var.getClass();
                    gmlVar = new gml(qn60.c(yf90Var, (sn60) a, jSONObject2));
                    return gmlVar;
                }
                throw fg90.m(jSONObject2, "type", R);
            case -891985903:
                jSONObject2 = jSONObject;
                if (R.equals("string")) {
                    nqu0 nqu0Var = (nqu0) jsonParserComponent.Fa.getValue();
                    pqu0 pqu0Var = (pqu0) (jmlVar != null ? jmlVar.a() : null);
                    nqu0Var.getClass();
                    gmlVar = new hml(new pqu0(wcx.d(udq0.Q(yf90Var), jSONObject2, "value", wm11.c, yf90Var.i(), pqu0Var != null ? pqu0Var.a : null)));
                    return gmlVar;
                }
                throw fg90.m(jSONObject2, "type", R);
            case 116079:
                jSONObject2 = jSONObject;
                if (R.equals("url")) {
                    ei21 ei21Var = (ei21) jsonParserComponent.La.getValue();
                    a = jmlVar != null ? jmlVar.a() : null;
                    ei21Var.getClass();
                    gmlVar = new iml(ei21.c(yf90Var, (gi21) a, jSONObject2));
                    return gmlVar;
                }
                throw fg90.m(jSONObject2, "type", R);
            case 3083190:
                jSONObject2 = jSONObject;
                if (R.equals("dict")) {
                    bhj bhjVar = (bhj) jsonParserComponent.z.getValue();
                    dhj dhjVar = (dhj) (jmlVar != null ? jmlVar.a() : null);
                    bhjVar.getClass();
                    gmlVar = new eml(new dhj(wcx.d(udq0.Q(yf90Var), jSONObject2, "value", wm11.h, yf90Var.i(), dhjVar != null ? dhjVar.a : null)));
                    return gmlVar;
                }
                throw fg90.m(jSONObject2, "type", R);
            case 64711720:
                jSONObject2 = jSONObject;
                if (R.equals("boolean")) {
                    y86 y86Var = (y86) jsonParserComponent.h.getValue();
                    a = jmlVar != null ? jmlVar.a() : null;
                    y86Var.getClass();
                    gmlVar = new cml(y86.c(yf90Var, (a96) a, jSONObject2));
                    return gmlVar;
                }
                throw fg90.m(jSONObject2, "type", R);
            case 93090393:
                if (R.equals("array")) {
                    r63 r63Var = (r63) jsonParserComponent.b.getValue();
                    t63 t63Var = (t63) (jmlVar != null ? jmlVar.a() : null);
                    r63Var.getClass();
                    bmlVar = new bml(new t63(wcx.d(udq0.Q(yf90Var), jSONObject, "value", wm11.g, yf90Var.i(), t63Var != null ? t63Var.a : null)));
                    return bmlVar;
                }
                jSONObject2 = jSONObject;
                throw fg90.m(jSONObject2, "type", R);
            case 94842723:
                if (R.equals("color")) {
                    ohc ohcVar = (ohc) jsonParserComponent.n.getValue();
                    a = jmlVar != null ? jmlVar.a() : null;
                    ohcVar.getClass();
                    bmlVar = new dml(ohc.c(yf90Var, (qhc) a, jSONObject));
                    return bmlVar;
                }
                jSONObject2 = jSONObject;
                throw fg90.m(jSONObject2, "type", R);
            case 1958052158:
                if (R.equals("integer")) {
                    i7w i7wVar = (i7w) jsonParserComponent.ha.getValue();
                    a = jmlVar != null ? jmlVar.a() : null;
                    i7wVar.getClass();
                    bmlVar = new fml(i7w.c(yf90Var, (k7w) a, jSONObject));
                    return bmlVar;
                }
                jSONObject2 = jSONObject;
                throw fg90.m(jSONObject2, "type", R);
            default:
                jSONObject2 = jSONObject;
                throw fg90.m(jSONObject2, "type", R);
        }
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, jml jmlVar) {
        boolean z = jmlVar instanceof hml;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            nqu0 nqu0Var = (nqu0) jsonParserComponent.Fa.getValue();
            pqu0 pqu0Var = ((hml) jmlVar).a;
            nqu0Var.getClass();
            return nqu0.c(yf90Var, pqu0Var);
        }
        if (jmlVar instanceof fml) {
            i7w i7wVar = (i7w) jsonParserComponent.ha.getValue();
            k7w k7wVar = ((fml) jmlVar).a;
            i7wVar.getClass();
            return i7w.d(yf90Var, k7wVar);
        }
        if (jmlVar instanceof gml) {
            qn60 qn60Var = (qn60) jsonParserComponent.qa.getValue();
            sn60 sn60Var = ((gml) jmlVar).a;
            qn60Var.getClass();
            return qn60.d(yf90Var, sn60Var);
        }
        if (jmlVar instanceof dml) {
            ohc ohcVar = (ohc) jsonParserComponent.n.getValue();
            qhc qhcVar = ((dml) jmlVar).a;
            ohcVar.getClass();
            return ohc.d(yf90Var, qhcVar);
        }
        if (jmlVar instanceof cml) {
            y86 y86Var = (y86) jsonParserComponent.h.getValue();
            a96 a96Var = ((cml) jmlVar).a;
            y86Var.getClass();
            return y86.d(yf90Var, a96Var);
        }
        if (jmlVar instanceof iml) {
            ei21 ei21Var = (ei21) jsonParserComponent.La.getValue();
            gi21 gi21Var = ((iml) jmlVar).a;
            ei21Var.getClass();
            return ei21.d(yf90Var, gi21Var);
        }
        if (jmlVar instanceof eml) {
            bhj bhjVar = (bhj) jsonParserComponent.z.getValue();
            dhj dhjVar = ((eml) jmlVar).a;
            bhjVar.getClass();
            return bhj.c(yf90Var, dhjVar);
        }
        if (!(jmlVar instanceof bml)) {
            w511.b();
            return null;
        }
        r63 r63Var = (r63) jsonParserComponent.b.getValue();
        t63 t63Var = ((bml) jmlVar).a;
        r63Var.getClass();
        return r63.c(yf90Var, t63Var);
    }
}
