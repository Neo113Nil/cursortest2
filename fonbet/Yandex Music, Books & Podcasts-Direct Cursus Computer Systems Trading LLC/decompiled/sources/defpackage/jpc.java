package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jpc {
    public static final jpc c = new jpc("FLAT", 0);
    public static final jpc d = new jpc("HALF_OPENED", 0);
    public final /* synthetic */ int a;
    public final String b;

    public jpc(String str, int i) {
        this.a = i;
        switch (i) {
            case 2:
                str.getClass();
                this.b = str;
                break;
            case 3:
                this.b = dfi.f("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat(str);
                break;
            default:
                this.b = str;
                break;
        }
    }

    public static void b(vx6 vx6Var, fsp fspVar) {
        String str = fspVar.a;
        if (str != null) {
            vx6Var.F("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        vx6Var.F("X-CRASHLYTICS-API-CLIENT-TYPE", ConstantDeviceInfo.APP_PLATFORM);
        vx6Var.F("X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        vx6Var.F("Accept", "application/json");
        vx6Var.F("X-CRASHLYTICS-DEVICE-MODEL", fspVar.b);
        String str2 = fspVar.c;
        if (str2 != null) {
            vx6Var.F("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = fspVar.d;
        if (str3 != null) {
            vx6Var.F("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = fspVar.e.c().a;
        if (str4 != null) {
            vx6Var.F("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap c(fsp fspVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fspVar.h);
        hashMap.put("display_version", fspVar.g);
        hashMap.put("source", Integer.toString(fspVar.i));
        String str = fspVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static String g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = k5r.m(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return ouj.o(str, " : ", str2);
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            xq0.w(e);
        }
    }

    public JSONObject d(tzb tzbVar) {
        int i = tzbVar.b;
        mvt mvtVar = mvt.h;
        mvtVar.F("Settings response code was: " + i);
        String str = this.b;
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String p = hrg.p("Settings request failed; (status: ", i, ") from ", str);
            if (mvtVar.p(6)) {
                Log.e("FirebaseCrashlytics", p, null);
            }
            return null;
        }
        String str2 = tzbVar.a;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            mvtVar.I("Failed to parse settings JSON from ".concat(str), e);
            mvtVar.I("Settings response " + str2, null);
            return null;
        }
    }

    public String e(Collection collection) {
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", g(this.b, str, objArr));
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    public jpc(String str, b2c b2cVar) {
        this.a = 1;
        this.b = str;
    }
}
