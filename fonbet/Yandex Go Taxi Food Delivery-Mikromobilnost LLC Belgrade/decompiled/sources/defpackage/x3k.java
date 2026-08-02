package defpackage;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class x3k implements d4x {
    public final String a;
    public final Uri b;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r1.length() < 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x3k(JSONObject jSONObject, quz quzVar) {
        String str = null;
        try {
            String m = b4x.m("log_id", jSONObject);
            if (m != null) {
            }
            str = m;
        } catch (JSONException e) {
            quzVar.e(e);
        }
        this.a = str;
        this.b = b4x.k("url", jSONObject);
    }

    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        tjz0Var.a(this.a, "logId");
        tjz0Var.a(this.b, "url");
        return tjz0Var.a.toString();
    }
}
