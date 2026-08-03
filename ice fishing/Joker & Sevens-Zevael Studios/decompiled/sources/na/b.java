package na;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.common.AndroidUtils;
import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    private b() {
    }

    private final Intent openBrowserIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        return AndroidUtils.INSTANCE.openURLInBrowserIntent(uri);
    }

    public final a create(Context context, JSONObject jSONObject) {
        j.e(context, "context");
        j.e(jSONObject, "fcmPayload");
        g gVar = new g(context, jSONObject);
        return new a(context, openBrowserIntent(gVar.getUri()), gVar.getShouldOpenApp());
    }
}
