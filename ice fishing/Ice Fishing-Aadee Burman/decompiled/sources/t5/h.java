package t5;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h {
    private final Context context;
    private final JSONObject fcmPayload;

    public h(Context context, JSONObject fcmPayload) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(fcmPayload, "fcmPayload");
        this.context = context;
        this.fcmPayload = fcmPayload;
    }

    public final boolean getShouldOpenApp() {
        return g.INSTANCE.getShouldOpenActivity(this.context) && getUri() == null;
    }

    public final Uri getUri() {
        g gVar = g.INSTANCE;
        if (!gVar.getShouldOpenActivity(this.context) || gVar.getSuppressLaunchURL(this.context)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.fcmPayload.optString("custom"));
        if (jSONObject.has("u")) {
            String optString = jSONObject.optString("u");
            if (!kotlin.jvm.internal.h.a(optString, "")) {
                kotlin.jvm.internal.h.b(optString);
                int length = optString.length() - 1;
                int i = 0;
                boolean z3 = false;
                while (i <= length) {
                    boolean z6 = kotlin.jvm.internal.h.f(optString.charAt(!z3 ? i : length), 32) <= 0;
                    if (z3) {
                        if (!z6) {
                            break;
                        }
                        length--;
                    } else if (z6) {
                        i++;
                    } else {
                        z3 = true;
                    }
                }
                return Uri.parse(optString.subSequence(i, length + 1).toString());
            }
        }
        return null;
    }
}
