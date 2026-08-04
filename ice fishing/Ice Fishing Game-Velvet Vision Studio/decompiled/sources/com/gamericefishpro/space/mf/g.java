package com.gamericefishpro.space.mf;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private final Context context;
    private final JSONObject fcmPayload;

    public g(Context context, JSONObject fcmPayload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fcmPayload, "fcmPayload");
        this.context = context;
        this.fcmPayload = fcmPayload;
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
            String strOptString = jSONObject.optString("u");
            if (!Intrinsics.a(strOptString, "")) {
                Intrinsics.b(strOptString);
                int length = strOptString.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.d(strOptString.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                return Uri.parse(strOptString.subSequence(i, length + 1).toString());
            }
        }
        return null;
    }
}
