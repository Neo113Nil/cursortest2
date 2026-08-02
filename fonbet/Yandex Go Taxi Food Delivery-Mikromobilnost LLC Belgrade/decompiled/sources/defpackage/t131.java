package defpackage;

import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class t131 extends c231 {
    public final String b;
    public volatile JSONArray c;

    public t131(String str, JSONArray jSONArray) {
        this.b = str;
        this.c = jSONArray;
    }

    @Override // defpackage.c231
    public final String c() {
        return this.b;
    }

    public final JSONArray j() {
        return this.c;
    }

    public final void k(JSONArray jSONArray) {
        synchronized (this) {
            if (jl40.l(this.c, jSONArray)) {
                return;
            }
            this.c = jSONArray;
            e(this);
        }
    }
}
