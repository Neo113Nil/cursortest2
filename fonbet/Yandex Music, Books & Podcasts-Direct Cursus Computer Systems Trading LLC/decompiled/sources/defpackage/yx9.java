package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yx9 implements gip, py7 {
    public final t6f a;

    public yx9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [c9c] */
    /* JADX WARN: Type inference failed for: r6v2, types: [c9c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [c9c] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        Object fy9Var;
        Object a;
        Object ay9Var;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        iy9 iy9Var = d7fVar instanceof iy9 ? (iy9) d7fVar : null;
        if (iy9Var != null) {
            if (iy9Var instanceof gy9) {
                b0 = PListParser.TAG_STRING;
            } else if (iy9Var instanceof ey9) {
                b0 = PListParser.TAG_INTEGER;
            } else if (iy9Var instanceof fy9) {
                b0 = "number";
            } else if (iy9Var instanceof cy9) {
                b0 = "color";
            } else if (iy9Var instanceof by9) {
                b0 = "boolean";
            } else if (iy9Var instanceof hy9) {
                b0 = "url";
            } else if (iy9Var instanceof dy9) {
                b0 = PListParser.TAG_DICT;
            } else {
                if (!(iy9Var instanceof ay9)) {
                    b6e.s();
                    return null;
                }
                b0 = PListParser.TAG_ARRAY;
            }
        }
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        switch (hashCode) {
            case -1034364087:
                jSONObject2 = jSONObject;
                if (b0.equals("number")) {
                    fhj fhjVar = (fhj) t6fVar.ta.getValue();
                    a = iy9Var != null ? iy9Var.a() : null;
                    fhjVar.getClass();
                    fy9Var = new fy9(fhj.c(t7kVar, (ihj) a, jSONObject2));
                    return fy9Var;
                }
                throw a8k.l(jSONObject2, "type", b0);
            case -891985903:
                jSONObject2 = jSONObject;
                if (b0.equals(PListParser.TAG_STRING)) {
                    tir tirVar = (tir) t6fVar.Ia.getValue();
                    vir virVar = (vir) (iy9Var != null ? iy9Var.a() : null);
                    tirVar.getClass();
                    fy9Var = new gy9(new vir(y2x.J(y1g.Y(t7kVar), jSONObject2, Constants.KEY_VALUE, vct.c, t7kVar.d(), virVar != null ? virVar.a : null)));
                    return fy9Var;
                }
                throw a8k.l(jSONObject2, "type", b0);
            case 116079:
                jSONObject2 = jSONObject;
                if (b0.equals("url")) {
                    nqt nqtVar = (nqt) t6fVar.Oa.getValue();
                    a = iy9Var != null ? iy9Var.a() : null;
                    nqtVar.getClass();
                    fy9Var = new hy9(nqt.c(t7kVar, (pqt) a, jSONObject2));
                    return fy9Var;
                }
                throw a8k.l(jSONObject2, "type", b0);
            case 3083190:
                jSONObject2 = jSONObject;
                if (b0.equals(PListParser.TAG_DICT)) {
                    j28 j28Var = (j28) t6fVar.z.getValue();
                    l28 l28Var = (l28) (iy9Var != null ? iy9Var.a() : null);
                    j28Var.getClass();
                    fy9Var = new dy9(new l28(y2x.J(y1g.Y(t7kVar), jSONObject2, Constants.KEY_VALUE, vct.h, t7kVar.d(), l28Var != null ? l28Var.a : null)));
                    return fy9Var;
                }
                throw a8k.l(jSONObject2, "type", b0);
            case 64711720:
                jSONObject2 = jSONObject;
                if (b0.equals("boolean")) {
                    vb3 vb3Var = (vb3) t6fVar.h.getValue();
                    a = iy9Var != null ? iy9Var.a() : null;
                    vb3Var.getClass();
                    fy9Var = new by9(vb3.c(t7kVar, (xb3) a, jSONObject2));
                    return fy9Var;
                }
                throw a8k.l(jSONObject2, "type", b0);
            case 93090393:
                if (b0.equals(PListParser.TAG_ARRAY)) {
                    gz0 gz0Var = (gz0) t6fVar.b.getValue();
                    iz0 iz0Var = (iz0) (iy9Var != null ? iy9Var.a() : null);
                    gz0Var.getClass();
                    ay9Var = new ay9(new iz0(y2x.J(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.g, t7kVar.d(), iz0Var != null ? iz0Var.a : null)));
                    return ay9Var;
                }
                jSONObject2 = jSONObject;
                throw a8k.l(jSONObject2, "type", b0);
            case 94842723:
                if (b0.equals("color")) {
                    da5 da5Var = (da5) t6fVar.n.getValue();
                    a = iy9Var != null ? iy9Var.a() : null;
                    da5Var.getClass();
                    ay9Var = new cy9(da5.c(t7kVar, (fa5) a, jSONObject));
                    return ay9Var;
                }
                jSONObject2 = jSONObject;
                throw a8k.l(jSONObject2, "type", b0);
            case 1958052158:
                if (b0.equals(PListParser.TAG_INTEGER)) {
                    fre freVar = (fre) t6fVar.ka.getValue();
                    a = iy9Var != null ? iy9Var.a() : null;
                    freVar.getClass();
                    ay9Var = new ey9(fre.c(t7kVar, (ire) a, jSONObject));
                    return ay9Var;
                }
                jSONObject2 = jSONObject;
                throw a8k.l(jSONObject2, "type", b0);
            default:
                jSONObject2 = jSONObject;
                throw a8k.l(jSONObject2, "type", b0);
        }
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, iy9 iy9Var) {
        boolean z = iy9Var instanceof gy9;
        t6f t6fVar = this.a;
        if (z) {
            tir tirVar = (tir) t6fVar.Ia.getValue();
            vir virVar = ((gy9) iy9Var).a;
            tirVar.getClass();
            return tir.c(t7kVar, virVar);
        }
        if (iy9Var instanceof ey9) {
            fre freVar = (fre) t6fVar.ka.getValue();
            ire ireVar = ((ey9) iy9Var).a;
            freVar.getClass();
            return fre.d(t7kVar, ireVar);
        }
        if (iy9Var instanceof fy9) {
            fhj fhjVar = (fhj) t6fVar.ta.getValue();
            ihj ihjVar = ((fy9) iy9Var).a;
            fhjVar.getClass();
            return fhj.d(t7kVar, ihjVar);
        }
        if (iy9Var instanceof cy9) {
            da5 da5Var = (da5) t6fVar.n.getValue();
            fa5 fa5Var = ((cy9) iy9Var).a;
            da5Var.getClass();
            return da5.d(t7kVar, fa5Var);
        }
        if (iy9Var instanceof by9) {
            vb3 vb3Var = (vb3) t6fVar.h.getValue();
            xb3 xb3Var = ((by9) iy9Var).a;
            vb3Var.getClass();
            return vb3.d(t7kVar, xb3Var);
        }
        if (iy9Var instanceof hy9) {
            nqt nqtVar = (nqt) t6fVar.Oa.getValue();
            pqt pqtVar = ((hy9) iy9Var).a;
            nqtVar.getClass();
            return nqt.d(t7kVar, pqtVar);
        }
        if (iy9Var instanceof dy9) {
            j28 j28Var = (j28) t6fVar.z.getValue();
            l28 l28Var = ((dy9) iy9Var).a;
            j28Var.getClass();
            return j28.c(t7kVar, l28Var);
        }
        if (!(iy9Var instanceof ay9)) {
            b6e.s();
            return null;
        }
        gz0 gz0Var = (gz0) t6fVar.b.getValue();
        iz0 iz0Var = ((ay9) iy9Var).a;
        gz0Var.getClass();
        return gz0.c(t7kVar, iz0Var);
    }
}
