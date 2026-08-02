package defpackage;

import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.a2;
import com.yandex.div2.d2;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class tek implements zsq0, nyi {
    public final JsonParserComponent a;

    public tek(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object xekVar;
        Object a;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        zek zekVar = hexVar instanceof zek ? (zek) hexVar : null;
        if (zekVar != null) {
            if (zekVar instanceof xek) {
                R = "set";
            } else if (zekVar instanceof vek) {
                R = "fade";
            } else if (zekVar instanceof wek) {
                R = "scale";
            } else {
                if (!(zekVar instanceof yek)) {
                    w511.b();
                    return null;
                }
                R = "slide";
            }
        }
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case 113762:
                if (R.equals("set")) {
                    xekVar = new xek(((lek) jsonParserComponent.G1.getValue()).c(yf90Var, (nek) (zekVar != null ? zekVar.a() : null), jSONObject));
                    return xekVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 3135100:
                if (R.equals("fade")) {
                    jpk jpkVar = (jpk) jsonParserComponent.n3.getValue();
                    a = zekVar != null ? zekVar.a() : null;
                    jpkVar.getClass();
                    xekVar = new vek(jpk.c(yf90Var, (lpk) a, jSONObject));
                    return xekVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 109250890:
                if (R.equals("scale")) {
                    s7l s7lVar = (s7l) jsonParserComponent.O6.getValue();
                    a = zekVar != null ? zekVar.a() : null;
                    s7lVar.getClass();
                    xekVar = new wek(s7l.c(yf90Var, (u7l) a, jSONObject));
                    return xekVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 109526449:
                if (R.equals("slide")) {
                    xekVar = new yek(((a2) jsonParserComponent.s7.getValue()).c(yf90Var, (d2) (zekVar != null ? zekVar.a() : null), jSONObject));
                    return xekVar;
                }
                throw fg90.m(jSONObject, "type", R);
            default:
                throw fg90.m(jSONObject, "type", R);
        }
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, zek zekVar) {
        boolean z = zekVar instanceof xek;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((lek) jsonParserComponent.G1.getValue()).b(yf90Var, ((xek) zekVar).a);
        }
        if (zekVar instanceof vek) {
            jpk jpkVar = (jpk) jsonParserComponent.n3.getValue();
            lpk lpkVar = ((vek) zekVar).a;
            jpkVar.getClass();
            return jpk.d(yf90Var, lpkVar);
        }
        if (zekVar instanceof wek) {
            s7l s7lVar = (s7l) jsonParserComponent.O6.getValue();
            u7l u7lVar = ((wek) zekVar).a;
            s7lVar.getClass();
            return s7l.d(yf90Var, u7lVar);
        }
        if (zekVar instanceof yek) {
            return ((a2) jsonParserComponent.s7.getValue()).b(yf90Var, ((yek) zekVar).a);
        }
        w511.b();
        return null;
    }
}
