package io.appmetrica.analytics.push.impl;

import defpackage.g8e;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.nio.charset.Charset;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Z0 {
    public String a = null;
    public String b = null;
    public JSONObject c = null;

    public Z0(byte[] bArr) {
        a(bArr);
    }

    public final void a(byte[] bArr) {
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, Charset.forName("UTF-8")));
            if (jSONObject.length() > 1) {
                Locale locale = Locale.US;
                this.a = "Lazy push response have " + jSONObject.length() + " elements";
                return;
            }
            if (jSONObject.has("ignored")) {
                this.b = jSONObject.getJSONObject("ignored").getString("details");
            } else if (jSONObject.has(CoreConstants.PushMessage.ROOT_ELEMENT)) {
                this.c = jSONObject;
            } else {
                this.a = "Lazy push response does not contain ignored message or push message";
            }
        } catch (Throwable th) {
            PublicLogger.INSTANCE.error(g8e.s(th, new StringBuilder("Failed to parse lazy push response: ")), th);
            this.a = g8e.s(th, new StringBuilder("Failed to parse lazy push response: "));
        }
    }
}
