package defpackage;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class w7f extends g4f {
    public final String a;

    public w7f(String str) {
        this.a = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        ny61.g("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
