package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class yll implements zsq0, nyi {
    public final JsonParserComponent a;

    public yll(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1034364087:
                if (R.equals("number")) {
                    ((pn60) jsonParserComponent.pa.getValue()).getClass();
                    return new ull(pn60.c(yf90Var, jSONObject));
                }
                break;
            case -891985903:
                if (R.equals("string")) {
                    ((mqu0) jsonParserComponent.Ea.getValue()).getClass();
                    return new vll(new lqu0(a.a(yf90Var, jSONObject, "value", wm11.c)));
                }
                break;
            case 116079:
                if (R.equals("url")) {
                    ((di21) jsonParserComponent.Ka.getValue()).getClass();
                    return new wll(di21.c(yf90Var, jSONObject));
                }
                break;
            case 3083190:
                if (R.equals("dict")) {
                    ((ahj) jsonParserComponent.y.getValue()).getClass();
                    return new sll(new zgj(a.a(yf90Var, jSONObject, "value", wm11.h)));
                }
                break;
            case 64711720:
                if (R.equals("boolean")) {
                    ((x86) jsonParserComponent.g.getValue()).getClass();
                    return new qll(x86.c(yf90Var, jSONObject));
                }
                break;
            case 93090393:
                if (R.equals("array")) {
                    ((q63) jsonParserComponent.a.getValue()).getClass();
                    return new pll(new p63(a.a(yf90Var, jSONObject, "value", wm11.g)));
                }
                break;
            case 94842723:
                if (R.equals("color")) {
                    ((nhc) jsonParserComponent.m.getValue()).getClass();
                    return new rll(nhc.c(yf90Var, jSONObject));
                }
                break;
            case 1958052158:
                if (R.equals("integer")) {
                    ((h7w) jsonParserComponent.ga.getValue()).getClass();
                    return new tll(h7w.c(yf90Var, jSONObject));
                }
                break;
        }
        hex b = yf90Var.b().b(R, jSONObject);
        jml jmlVar = b instanceof jml ? (jml) b : null;
        if (jmlVar != null) {
            return ((aml) jsonParserComponent.E9.getValue()).a(yf90Var, jmlVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, xll xllVar) {
        boolean z = xllVar instanceof vll;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            mqu0 mqu0Var = (mqu0) jsonParserComponent.Ea.getValue();
            lqu0 lqu0Var = ((vll) xllVar).b;
            mqu0Var.getClass();
            return mqu0.c(yf90Var, lqu0Var);
        }
        if (xllVar instanceof tll) {
            h7w h7wVar = (h7w) jsonParserComponent.ga.getValue();
            g7w g7wVar = ((tll) xllVar).b;
            h7wVar.getClass();
            return h7w.d(yf90Var, g7wVar);
        }
        if (xllVar instanceof ull) {
            pn60 pn60Var = (pn60) jsonParserComponent.pa.getValue();
            on60 on60Var = ((ull) xllVar).b;
            pn60Var.getClass();
            return pn60.d(yf90Var, on60Var);
        }
        if (xllVar instanceof rll) {
            nhc nhcVar = (nhc) jsonParserComponent.m.getValue();
            mhc mhcVar = ((rll) xllVar).b;
            nhcVar.getClass();
            return nhc.d(yf90Var, mhcVar);
        }
        if (xllVar instanceof qll) {
            x86 x86Var = (x86) jsonParserComponent.g.getValue();
            w86 w86Var = ((qll) xllVar).b;
            x86Var.getClass();
            return x86.d(yf90Var, w86Var);
        }
        if (xllVar instanceof wll) {
            di21 di21Var = (di21) jsonParserComponent.Ka.getValue();
            ci21 ci21Var = ((wll) xllVar).b;
            di21Var.getClass();
            return di21.d(yf90Var, ci21Var);
        }
        if (xllVar instanceof sll) {
            ahj ahjVar = (ahj) jsonParserComponent.y.getValue();
            zgj zgjVar = ((sll) xllVar).b;
            ahjVar.getClass();
            return ahj.c(yf90Var, zgjVar);
        }
        if (!(xllVar instanceof pll)) {
            w511.b();
            return null;
        }
        q63 q63Var = (q63) jsonParserComponent.a.getValue();
        p63 p63Var = ((pll) xllVar).b;
        q63Var.getClass();
        return q63.c(yf90Var, p63Var);
    }
}
