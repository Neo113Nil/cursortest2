package na;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {
    private final Context context;
    private final JSONObject fcmPayload;

    public g(Context context, JSONObject jSONObject) {
        j.e(context, "context");
        j.e(jSONObject, "fcmPayload");
        this.context = context;
        this.fcmPayload = jSONObject;
    }

    public final boolean getShouldOpenApp() {
        return f.INSTANCE.getShouldOpenActivity(this.context) && getUri() == null;
    }

    public final Uri getUri() {
        f fVar = f.INSTANCE;
        if (!fVar.getShouldOpenActivity(this.context) || fVar.getSuppressLaunchURL(this.context)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.fcmPayload.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject.has("u")) {
            String optString = jSONObject.optString("u");
            if (!j.a(optString, "")) {
                j.d(optString, "url");
                int length = optString.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = j.f(optString.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                return Uri.parse(optString.subSequence(i10, length + 1).toString());
            }
        }
        return null;
    }
}
