package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rod {
    public static final /* synthetic */ int e = 0;
    public final JSONObject a;
    public final HttpURLConnection b;
    public final JSONObject c;
    public final g3c d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rod(ood oodVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(oodVar, httpURLConnection, jSONObject, null, null);
        oodVar.getClass();
        str.getClass();
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.b;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder u = ouj.u("{Response:  responseCode: ", str, ", graphObject: ");
        u.append(this.c);
        u.append(", error: ");
        u.append(this.d);
        u.append("}");
        return u.toString();
    }

    public rod(ood oodVar, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, g3c g3cVar) {
        oodVar.getClass();
        this.b = httpURLConnection;
        this.c = jSONObject;
        this.d = g3cVar;
        this.a = jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rod(ood oodVar, HttpURLConnection httpURLConnection, g3c g3cVar) {
        this(oodVar, httpURLConnection, null, null, g3cVar);
        oodVar.getClass();
    }
}
