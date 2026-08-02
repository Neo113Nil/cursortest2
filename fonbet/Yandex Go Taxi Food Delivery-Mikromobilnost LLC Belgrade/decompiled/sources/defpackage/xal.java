package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xal implements d4x {
    public final int a;

    public xal(JSONObject jSONObject) {
        this.a = b4x.g("color", jSONObject);
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(Integer.valueOf(this.a), "color");
        return tjz0Var.a.toString();
    }
}
