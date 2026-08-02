package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sz2 {
    public final String a;

    public sz2(String str) {
        this.a = new JSONObject(str).optString("countryCode");
    }
}
