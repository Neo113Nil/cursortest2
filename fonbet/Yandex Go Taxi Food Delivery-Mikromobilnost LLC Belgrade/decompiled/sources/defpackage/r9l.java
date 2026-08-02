package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class r9l implements d4x {
    public final /* synthetic */ int a;
    public final d4x b;
    public final String c;

    public r9l(JSONObject jSONObject, int i) {
        this.a = i;
        switch (i) {
            case 1:
                String j = b4x.j("type", jSONObject);
                if (j.equals("date_element")) {
                    this.b = new qml(jSONObject);
                    this.c = "date_element";
                    return;
                } else {
                    if (!j.equals("div-image-element")) {
                        throw new JSONException(oyr.p("Unknown object type ", j, " passed to Element"));
                    }
                    this.b = new ctk(jSONObject);
                    this.c = "div-image-element";
                    return;
                }
            default:
                String j2 = b4x.j("type", jSONObject);
                if (j2.equals("numeric")) {
                    this.b = new n0l(jSONObject);
                    this.c = "numeric";
                    return;
                } else {
                    if (!j2.equals("predefined")) {
                        throw new JSONException(oyr.p("Unknown object type ", j2, " passed to DivSizeTrait"));
                    }
                    this.b = new b5l(jSONObject);
                    this.c = "predefined";
                    return;
                }
        }
    }

    public n0l a() {
        if ("numeric".equals(this.c)) {
            return (n0l) this.b;
        }
        return null;
    }

    public b5l b() {
        if ("predefined".equals(this.c)) {
            return (b5l) this.b;
        }
        return null;
    }

    public final String toString() {
        int i = this.a;
        d4x d4xVar = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                tjz0 tjz0Var = new tjz0();
                tjz0Var.a(str, "type");
                tjz0Var.a(d4xVar, "value");
                return tjz0Var.a.toString();
            default:
                tjz0 tjz0Var2 = new tjz0();
                tjz0Var2.a(str, "type");
                tjz0Var2.a(d4xVar, "value");
                return tjz0Var2.a.toString();
        }
    }
}
