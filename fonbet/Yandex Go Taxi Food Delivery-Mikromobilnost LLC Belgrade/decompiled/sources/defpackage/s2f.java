package defpackage;

import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.a;
import io.appmetrica.analytics.impl.E0;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class s2f implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|7|8|(3:17|18|19)|21|22|23|24|18|19) */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        ms5 h;
        int i;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                a aVar = ((v2f) obj).h;
                aVar.getClass();
                com.google.firebase.crashlytics.internal.concurrency.a.a();
                lb7 lb7Var = aVar.c;
                q1r q1rVar = (q1r) lb7Var.b;
                String str = (String) lb7Var.c;
                q1rVar.getClass();
                boolean z = true;
                if (new File(q1rVar.c, str).exists()) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    q1r q1rVar2 = (q1r) lb7Var.b;
                    q1rVar2.getClass();
                    new File(q1rVar2.c, str).delete();
                } else {
                    String f = aVar.f();
                    if (f == null || !aVar.j.d(f)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                return ((E0) obj).p();
            case 2:
                com.google.firebase.crashlytics.internal.settings.a aVar2 = (com.google.firebase.crashlytics.internal.settings.a) ((tig0) obj).b;
                cjx cjxVar = aVar2.f;
                ycr0 ycr0Var = aVar2.b;
                cjxVar.getClass();
                com.google.firebase.crashlytics.internal.concurrency.a.b();
                JSONObject jSONObject = null;
                try {
                    HashMap b = cjx.b(ycr0Var);
                    String str2 = cjxVar.b;
                    am2 am2Var = new am2();
                    am2Var.a = str2;
                    am2Var.b = b;
                    am2Var.c = new HashMap();
                    am2Var.k(ExtFunctionsKt.HEADER_USER_AGENT, "Crashlytics Android SDK/20.0.3");
                    am2Var.k("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    cjx.a(am2Var, ycr0Var);
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    b.toString();
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    h = am2Var.h();
                    i = h.a;
                    Log.isLoggable("FirebaseCrashlytics", 2);
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                }
                if (i != 200 && i != 201 && i != 202 && i != 203) {
                    StringBuilder t = b64.t(i, "Settings request failed; (status: ", ") from ");
                    t.append(cjxVar.b);
                    Log.e("FirebaseCrashlytics", t.toString(), null);
                    return jSONObject;
                }
                jSONObject = new JSONObject(h.b);
                return jSONObject;
            default:
                return (AssetFileDescriptor) obj;
        }
    }
}
