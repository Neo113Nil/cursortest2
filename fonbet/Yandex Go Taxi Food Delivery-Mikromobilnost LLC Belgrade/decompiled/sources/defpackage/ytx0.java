package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.logistics.care.ui.h;
import ru.yandex.taxi.logistics.care.impl.router.f;

/* loaded from: classes4.dex */
public final class ytx0 {
    public final h a;
    public final ct8 b;
    public final sbx c;

    public ytx0(h hVar, ct8 ct8Var, sbx sbxVar) {
        this.a = hVar;
        this.b = ct8Var;
        this.c = sbxVar;
    }

    @JavascriptInterface
    public final void contractCreate(String str) {
        try {
            new Handler(Looper.getMainLooper()).post(new y7x0(7, this, new JSONObject(str).optString("type", "")));
        } catch (Exception e) {
            new Handler(Looper.getMainLooper()).post(new wtx0(e, this, 1));
        }
    }

    @JavascriptInterface
    public final void error(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            new Handler(Looper.getMainLooper()).post(new hpo0(10, this, jSONObject.optString(AuthSdkActivity.RESPONSE_TYPE_CODE, "unknown"), jSONObject.optString(Constants.KEY_MESSAGE, "unknown")));
        } catch (Exception e) {
            new Handler(Looper.getMainLooper()).post(new wtx0(e, this, 4));
        }
    }

    @JavascriptInterface
    public final String getCapabilities() {
        String c = this.c.c(new t28(new r28()), t28.Companion.serializer());
        dt8 dt8Var = this.b.b.b;
        return c;
    }

    @JavascriptInterface
    public final String getDeviceInfo() {
        String c = this.c.c(new gbj(((f) this.a.a.c.b.g.b).N.a()), gbj.Companion.serializer());
        dt8 dt8Var = this.b.b.b;
        return c;
    }

    @JavascriptInterface
    public final void onPhotoVerificationReady() {
        new Handler(Looper.getMainLooper()).post(new xtx0(this, 2));
    }

    @JavascriptInterface
    public final void onWebViewHTMLReceived() {
        new Handler(Looper.getMainLooper()).post(new xtx0(this, 1));
    }

    @JavascriptInterface
    public final void onWebViewReady() {
        new Handler(Looper.getMainLooper()).post(new xtx0(this, 4));
    }

    @JavascriptInterface
    public final void requestHideWebView() {
        new Handler(Looper.getMainLooper()).post(new xtx0(this, 0));
    }

    @JavascriptInterface
    public final void requestOpenUri(String str) {
        try {
            a970 a970Var = (a970) this.c.b(a970.Companion.serializer(), str);
            if (evu0.J(a970Var.a)) {
                new Handler(Looper.getMainLooper()).post(new xtx0(this, 5));
            } else {
                new Handler(Looper.getMainLooper()).post(new y7x0(9, this, a970Var));
            }
        } catch (Exception e) {
            new Handler(Looper.getMainLooper()).post(new wtx0(e, this, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.Map] */
    @JavascriptInterface
    public final void sendAnalyticsEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("name", "");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = b.f();
            if (jSONObject.has(Constants.KEY_DATA)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.KEY_DATA);
                ?? linkedHashMap = new LinkedHashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray) && !jl40.l(obj, JSONObject.NULL)) {
                        linkedHashMap.put(next, obj);
                    }
                    obj = null;
                    linkedHashMap.put(next, obj);
                }
                ref$ObjectRef.element = linkedHashMap;
            }
            new Handler(Looper.getMainLooper()).post(new hpo0(9, this, optString, ref$ObjectRef));
        } catch (Exception e) {
            new Handler(Looper.getMainLooper()).post(new wtx0(e, this, 2));
        }
    }

    @JavascriptInterface
    public final void showCameraPermissionSettings() {
        dt8 dt8Var = this.b.b.b;
        me0 me0Var = this.a.a.x;
        me0Var.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Context context = me0Var.a;
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                intent.toString();
            }
        }
    }

    @JavascriptInterface
    public final void startBasicPhotoVerification(String str) {
        try {
            gb41 gb41Var = fc41.Companion;
            sbx sbxVar = this.c;
            gb41Var.getClass();
            new Handler(Looper.getMainLooper()).post(new y7x0(8, this, gb41.a(sbxVar, str)));
        } catch (Exception e) {
            new Handler(Looper.getMainLooper()).post(new wtx0(e, this, 3));
        }
    }

    @JavascriptInterface
    public final void unauthorized() {
        new Handler(Looper.getMainLooper()).post(new xtx0(this, 3));
    }
}
