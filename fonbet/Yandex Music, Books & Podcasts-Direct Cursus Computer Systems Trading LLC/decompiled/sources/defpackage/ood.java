package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ood {
    public static final String j;
    public static final Pattern k;
    public static volatile String l;
    public final ja a;
    public final String b;
    public JSONObject c;
    public Bundle d;
    public final String e;
    public lod f;
    public final z6e g;
    public boolean h;
    public boolean i;

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        charArray.getClass();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        j = sb.toString();
        k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public ood(ja jaVar, String str, Bundle bundle, z6e z6eVar, lod lodVar, int i) {
        this.a = jaVar;
        this.b = str;
        this.e = null;
        HashSet hashSet = j3c.a;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        this.f = lodVar;
        this.g = z6eVar == null ? z6e.a : z6eVar;
        if (bundle != null) {
            this.d = new Bundle(bundle);
        } else {
            this.d = new Bundle();
        }
        this.e = j3c.e();
    }

    public static String f() {
        String c = j3c.c();
        wxf.J();
        String str = j3c.e;
        if (gvt.D(c) || gvt.D(str)) {
            return null;
        }
        StringBuilder m = tlm.m(c, "|");
        if (str != null) {
            m.append(str);
            return m.toString();
        }
        xq0.q("Required value was null.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003d, code lost:
    
        if (r3 == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        HashSet hashSet;
        Bundle bundle = this.d;
        if (!this.h) {
            String e = e();
            boolean M = e != null ? StringsKt.M(e, "|", false) : false;
            if (e == null || !c.v(e, "IG", false) || M || !i()) {
                if (!(Intrinsics.d(j3c.f(), "instagram.com") ? true ^ i() : true)) {
                }
            }
            bundle.putString("access_token", f());
            if (!bundle.containsKey("access_token")) {
                HashSet hashSet2 = j3c.a;
                wxf.J();
                if (gvt.D(j3c.e)) {
                    Log.w("ood", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
                }
            }
            bundle.putString("sdk", ConstantDeviceInfo.APP_PLATFORM);
            bundle.putString("format", "json");
            hashSet = j3c.a;
            synchronized (hashSet) {
            }
            synchronized (hashSet) {
            }
            return;
        }
        String e2 = e();
        if (e2 != null) {
            bundle.putString("access_token", e2);
        }
        if (!bundle.containsKey("access_token")) {
        }
        bundle.putString("sdk", ConstantDeviceInfo.APP_PLATFORM);
        bundle.putString("format", "json");
        hashSet = j3c.a;
        synchronized (hashSet) {
        }
    }

    public final String b(String str, boolean z) {
        if (!z && this.g == z6e.b) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.d.keySet()) {
            Object obj = this.d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (h1b.R(obj)) {
                buildUpon.appendQueryParameter(str2, h1b.y(obj).toString());
            } else if (this.g != z6e.a) {
                xq0.x(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        String builder = buildUpon.toString();
        builder.getClass();
        return builder;
    }

    public final rod c() {
        List X = xz0.X(new ood[]{this});
        X.getClass();
        ArrayList H = h1b.H(new qod(X));
        if (H.size() == 1) {
            return (rod) H.get(0);
        }
        throw new c3c("invalid state: expected a single response");
    }

    public final pod d() {
        List X = xz0.X(new ood[]{this});
        X.getClass();
        qod qodVar = new qod(X);
        wxf.G(qodVar);
        pod podVar = new pod(qodVar);
        podVar.executeOnExecutor(j3c.d(), new Void[0]);
        return podVar;
    }

    public final String e() {
        ja jaVar = this.a;
        if (jaVar != null) {
            if (!this.d.containsKey("access_token")) {
                String str = jaVar.e;
                lsg.e.V(str);
                return str;
            }
        } else if (!this.h && !this.d.containsKey("access_token")) {
            return f();
        }
        return this.d.getString("access_token");
    }

    public final String g() {
        String format;
        String str;
        if (this.g == z6e.b && (str = this.b) != null && c.n(str, "/videos", false)) {
            Collection collection = qjp.a;
            format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{j3c.f()}, 1));
        } else {
            String f = j3c.f();
            Collection collection2 = qjp.a;
            f.getClass();
            format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{f}, 1));
        }
        String h = h(format);
        a();
        return b(h, false);
    }

    public final String h(String str) {
        if (!(!Intrinsics.d(j3c.f(), "instagram.com") ? true : !i())) {
            Collection collection = qjp.a;
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{j3c.p}, 1));
        }
        Pattern pattern = k;
        String str2 = this.b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.e, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean i() {
        String str = this.b;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(j3c.c());
        sb.append("/?.*");
        return this.i || Pattern.matches(sb.toString(), str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.g);
        sb.append(", parameters: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
