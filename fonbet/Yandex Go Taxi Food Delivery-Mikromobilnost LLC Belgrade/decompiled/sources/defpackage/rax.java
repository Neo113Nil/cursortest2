package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.collections.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class rax {
    public final String a;
    public final String b;
    public final ew2 c;
    public final jm3 d;
    public final c29 e;
    public final Handler f = new Handler(Looper.getMainLooper());
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final HashSet i = new HashSet();

    public rax(String str, String str2, ew2 ew2Var, jm3 jm3Var, c29 c29Var) {
        this.a = str;
        this.b = str2;
        this.c = ew2Var;
        this.d = jm3Var;
        this.e = c29Var;
    }

    public final void a(vg41 vg41Var) {
        jl40.m();
        this.i.add(vg41Var);
    }

    @JavascriptInterface
    public final void receiveMessage(String str) {
        String str2 = this.a;
        ew2 ew2Var = this.c;
        try {
            fqv fqvVar = new fqv(new JSONObject(str));
            ct10 ct10Var = fqvVar.b;
            String str3 = fqvVar.a;
            boolean l = jl40.l(str3, str2);
            String str4 = this.b;
            if (!l) {
                ew2Var.c("wm_error_message", b.i(new Pair("error", "undefined channel " + str3 + ", correct channel = " + str2), new Pair("fragmentTag", str4)));
            }
            Handler handler = this.f;
            if (ct10Var == null) {
                handler.post(new qax(fqvVar, this));
                return;
            }
            ew2Var.c("wm_error_message", b.i(new Pair("error", ct10Var), new Pair("fragmentTag", str4)));
            if (jl40.l(ct10Var.b, "InvalidAuthTokenError")) {
                handler.post(new qax(this, fqvVar));
            }
        } catch (JSONException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            ew2Var.c("wm_error_message", gw00.e(new Pair("error", message)));
        }
    }
}
