package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class zwt extends kxt {
    public final String b;
    public volatile JSONArray c;

    public zwt(String str, JSONArray jSONArray) {
        this.b = str;
        this.c = jSONArray;
    }

    @Override // defpackage.kxt
    public final String c() {
        return this.b;
    }

    public final void j(JSONArray jSONArray) {
        synchronized (this) {
            if (Intrinsics.d(this.c, jSONArray)) {
                return;
            }
            this.c = jSONArray;
            e(this);
        }
    }
}
