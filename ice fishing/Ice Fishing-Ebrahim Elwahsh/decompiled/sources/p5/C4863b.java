package p5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.common.AndroidUtils;
import org.json.JSONObject;

/* renamed from: p5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4863b {
    public static final C4863b INSTANCE = new C4863b();

    private C4863b() {
    }

    private final Intent openBrowserIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        return AndroidUtils.INSTANCE.openURLInBrowserIntent(uri);
    }

    public final C4862a create(Context context, JSONObject fcmPayload) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(fcmPayload, "fcmPayload");
        h hVar = new h(context, fcmPayload);
        return new C4862a(context, openBrowserIntent(hVar.getUri()), hVar.getShouldOpenApp());
    }
}
