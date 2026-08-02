package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class shk extends n15 {
    public final String x;
    public final boolean y;
    public final ArrayList z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public shk(JSONObject jSONObject) {
        super(jSONObject, r0);
        String str;
        Boolean bool;
        quz quzVar = quz.c;
        try {
            str = b4x.m("alignment", jSONObject);
        } catch (JSONException e) {
            quzVar.e(e);
            str = null;
        }
        if ("left".equals(str)) {
            this.x = "left";
        } else if ("center".equals(str)) {
            this.x = "center";
        } else if ("right".equals(str)) {
            this.x = "right";
        } else {
            this.x = "left";
        }
        try {
            bool = b4x.f("is_fullwidth", jSONObject);
        } catch (JSONException e2) {
            quzVar.e(e2);
            bool = null;
        }
        if (bool == null) {
            this.y = false;
        } else {
            this.y = bool.booleanValue();
        }
        JSONArray a = b4x.a("items", jSONObject);
        int length = a.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject optJSONObject = a.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new rhk(optJSONObject));
                }
            } catch (JSONException e3) {
                quzVar.e(e3);
            }
        }
        this.z = arrayList;
        if (arrayList.size() >= 1) {
            return;
        }
        z3k.c("items does not meet condition items.size() >= 1");
        throw null;
    }

    @Override // defpackage.n15
    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        String n15Var = super.toString();
        StringBuilder sb = tjz0Var.a;
        sb.append(n15Var);
        tjz0Var.a(this.x, "alignment");
        tjz0Var.a(Boolean.valueOf(this.y), "isFullwidth");
        tjz0Var.a(this.z, "items");
        return sb.toString();
    }
}
