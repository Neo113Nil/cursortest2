package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ysk extends n15 {
    public final ctk x;

    public ysk(JSONObject jSONObject) {
        super(jSONObject, quz.c);
        this.x = new ctk(b4x.b("image", jSONObject));
    }

    @Override // defpackage.n15
    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        String n15Var = super.toString();
        StringBuilder sb = tjz0Var.a;
        sb.append(n15Var);
        tjz0Var.a(this.x, "image");
        return sb.toString();
    }
}
