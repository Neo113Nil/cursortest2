package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.plus.log.api.LogPriority;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class t2h {
    public final rkd0 a;
    public final String b;
    public final Context c;

    public t2h(Context context, rkd0 rkd0Var, String str) {
        this.a = rkd0Var;
        this.b = str;
        this.c = context.getApplicationContext();
    }

    public final boolean a(Uri uri) {
        Object failure;
        try {
            failure = b(uri);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        rkd0 rkd0Var = this.a;
        if (a != null) {
            LogPriority logPriority = LogPriority.ERROR;
            if (rkd0Var.e(logPriority)) {
                rkd0Var.b(logPriority, "DeeplinkNavigator", g8e.m(uri, "navigate(", "): error"), a);
            }
            return false;
        }
        Intent intent = (Intent) failure;
        LogPriority logPriority2 = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority2)) {
            rkd0Var.b(logPriority2, "DeeplinkNavigator", "navigate(" + uri + "): " + intent, null);
        }
        return true;
    }

    public final Intent b(Uri uri) {
        Intent intent;
        String scheme = uri.getScheme();
        Context context = this.c;
        if (scheme != null && scheme.hashCode() == -1183762788 && scheme.equals("intent")) {
            intent = Intent.parseUri(uri.toString(), 1);
            if (intent == null) {
                ny61.g("'intent' is null");
                return null;
            }
        } else {
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            if (cvu0.t(uri.getScheme(), this.b, true)) {
                intent2.setPackage(context.getPackageName());
            }
            intent = intent2;
        }
        if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
            String stringExtra = intent.getStringExtra("browser_fallback_url");
            if (stringExtra == null) {
                ny61.g("Can not create fallback intent");
                return null;
            }
            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
            if (context.getPackageManager().resolveActivity(intent3, 65536) == null) {
                vg10.r(intent3, "'fallbackIntent' can not be resolved: ");
                return null;
            }
            intent = intent3;
        }
        context.startActivity(intent.addFlags(SelfTester_JCP.IMITA));
        return intent;
    }
}
