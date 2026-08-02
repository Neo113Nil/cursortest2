package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cxt extends kxt {
    public final String b;
    public volatile JSONObject c;

    public cxt(String str, JSONObject jSONObject) {
        this.b = str;
        this.c = jSONObject;
    }

    @Override // defpackage.kxt
    public final String c() {
        return this.b;
    }

    public final void j(JSONObject jSONObject) {
        synchronized (this) {
            if (Intrinsics.d(this.c, jSONObject)) {
                return;
            }
            this.c = jSONObject;
            e(this);
        }
    }
}
