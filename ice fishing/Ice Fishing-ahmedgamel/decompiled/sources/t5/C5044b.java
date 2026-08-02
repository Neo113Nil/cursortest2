package t5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.common.AndroidUtils;
import org.json.JSONObject;

/* renamed from: t5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5044b {
    public static final C5044b INSTANCE = new C5044b();

    private C5044b() {
    }

    private final Intent openBrowserIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        return AndroidUtils.INSTANCE.openURLInBrowserIntent(uri);
    }

    public final C5043a create(Context context, JSONObject fcmPayload) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(fcmPayload, "fcmPayload");
        h hVar = new h(context, fcmPayload);
        return new C5043a(context, openBrowserIntent(hVar.getUri()), hVar.getShouldOpenApp());
    }
}
