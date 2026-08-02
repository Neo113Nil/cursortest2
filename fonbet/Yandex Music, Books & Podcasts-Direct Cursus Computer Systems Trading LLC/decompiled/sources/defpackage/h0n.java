package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0n extends c3x {
    public final String j;

    public h0n(Bundle bundle, String str) {
        super(bundle, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
        this.j = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        xq0.x("authenticationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
