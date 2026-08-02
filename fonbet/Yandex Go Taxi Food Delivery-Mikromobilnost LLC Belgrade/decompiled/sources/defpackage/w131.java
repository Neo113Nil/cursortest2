package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w131 extends c231 {
    public final String b;
    public final JSONObject c;
    public volatile JSONObject d;

    public w131(String str, JSONObject jSONObject) {
        this.b = str;
        this.c = jSONObject;
        this.d = jSONObject;
    }

    @Override // defpackage.c231
    public final String c() {
        return this.b;
    }

    public final void j(JSONObject jSONObject) {
        synchronized (this) {
            if (jl40.l(this.d, jSONObject)) {
                return;
            }
            this.d = jSONObject;
            e(this);
        }
    }
}
