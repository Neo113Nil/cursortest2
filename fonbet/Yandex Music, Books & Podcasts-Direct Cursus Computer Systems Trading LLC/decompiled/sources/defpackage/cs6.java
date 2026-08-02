package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cs6 extends br6 {
    public final String a;

    public cs6(Bundle bundle, String str) {
        this.a = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        xq0.x("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
