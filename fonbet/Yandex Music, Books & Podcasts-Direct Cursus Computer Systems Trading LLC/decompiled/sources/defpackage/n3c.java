package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n3c extends lbv {
    public static final /* synthetic */ int o = 0;
    public boolean n;

    @Override // defpackage.lbv
    public final Bundle b(String str) {
        Uri parse = Uri.parse(str);
        parse.getClass();
        Bundle J = gvt.J(parse.getQuery());
        String string = J.getString("bridge_args");
        J.remove("bridge_args");
        if (!gvt.D(string)) {
            try {
                J.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", uk3.a(new JSONObject(string)));
            } catch (JSONException unused) {
                HashSet hashSet = j3c.a;
            }
        }
        String string2 = J.getString("method_results");
        J.remove("method_results");
        if (!gvt.D(string2)) {
            try {
                J.putBundle("com.facebook.platform.protocol.RESULT_ARGS", uk3.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                HashSet hashSet2 = j3c.a;
            }
        }
        J.remove("version");
        J.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", xwi.h());
        return J;
    }

    @Override // defpackage.lbv, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        kbv kbvVar = this.d;
        if (!this.k || this.i || kbvVar == null || !kbvVar.isShown()) {
            super.cancel();
        } else {
            if (this.n) {
                return;
            }
            this.n = true;
            kbvVar.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new q9(24, this), 1500);
        }
    }
}
