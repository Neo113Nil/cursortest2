package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v3f {
    public final String a;
    public final qdc b;
    public final h02 c;
    public final qxp d;
    public final Handler e;
    public final HashMap f;
    public final HashMap g;
    public final HashSet h;

    public v3f(String str, qdc qdcVar, h02 h02Var, qxp qxpVar) {
        str.getClass();
        qdcVar.getClass();
        h02Var.getClass();
        this.a = str;
        this.b = qdcVar;
        this.c = h02Var;
        this.d = qxpVar;
        this.e = new Handler(Looper.getMainLooper());
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashSet();
    }

    @JavascriptInterface
    public final void receiveMessage(@NotNull String str) {
        String str2 = this.a;
        qdc qdcVar = this.b;
        str.getClass();
        try {
            hie hieVar = new hie(new JSONObject(str));
            nzh nzhVar = hieVar.b;
            String str3 = hieVar.a;
            if (!Intrinsics.d(str3, str2)) {
                qdcVar.sendEvent("wm_error_message", uah.e(new Pair("error", "undefined channel " + str3 + ", correct channel = " + str2), new Pair("fragmentTag", "music")));
            }
            Handler handler = this.e;
            if (nzhVar == null) {
                handler.post(new u3f(hieVar, this));
                return;
            }
            qdcVar.sendEvent("wm_error_message", uah.e(new Pair("error", nzhVar), new Pair("fragmentTag", "music")));
            if (Intrinsics.d(nzhVar.b, "InvalidAuthTokenError")) {
                handler.post(new u3f(this, hieVar));
            }
        } catch (JSONException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            qdcVar.sendEvent("wm_error_message", tah.b(new Pair("error", message)));
        }
    }
}
