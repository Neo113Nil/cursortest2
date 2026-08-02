package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class sdl implements d4x {
    public final zjk a;
    public final xjg b;

    public sdl(JSONObject jSONObject) {
        this.a = new zjk(b4x.b("content", jSONObject));
        this.b = new xjg(b4x.b("title", jSONObject), 23);
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "content");
        tjz0Var.a(this.b, "title");
        return tjz0Var.a.toString();
    }
}
