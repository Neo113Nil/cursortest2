package io.appmetrica.analytics.networktasks.internal;

import defpackage.oyr;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes9.dex */
public class DefaultResponseParser {

    public static class Response {
        public final String mStatus;

        public Response(String str) {
            this.mStatus = str;
        }

        public String toString() {
            return oyr.t(new StringBuilder("Response{mStatus='"), this.mStatus, "'}");
        }
    }

    public Response parse(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 0) {
                return new Response(new JSONObject(new String(bArr, "UTF-8")).optString(ACSPConstants.STATUS));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
