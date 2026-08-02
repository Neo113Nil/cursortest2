package defpackage;

import android.app.ApplicationExitInfo;
import android.app.UiModeManager;
import android.media.UnsupportedSchemeException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.G8;
import io.appmetrica.analytics.impl.Gr;
import io.appmetrica.analytics.impl.Hr;
import io.appmetrica.analytics.impl.Jr;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final /* synthetic */ class kac implements zpj, nn5, myc, mqb, FunctionWithThrowable, ag6, Jr {
    public final /* synthetic */ int a;

    public /* synthetic */ kac(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo b(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ void c(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void f(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void h(String str, Throwable th) {
        throw new khb(str, th);
    }

    public static /* synthetic */ void i(int i, String str) {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void k(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        iec lambda$getComponents$0;
        sec components$lambda$0;
        tec components$lambda$1;
        switch (this.a) {
            case 6:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(rdkVar);
                return lambda$getComponents$0;
            case 9:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(rdkVar);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(rdkVar);
                return components$lambda$1;
        }
    }

    @Override // defpackage.mqb
    public oqb a(UUID uuid) {
        try {
            try {
                return new xvc(uuid);
            } catch (kmt unused) {
                vq1.K("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new isa();
            }
        } catch (UnsupportedSchemeException e) {
            throw new kmt(1, e);
        } catch (Exception e2) {
            throw new kmt(2, e2);
        }
    }

    @Override // defpackage.myc
    public Object apply(Object obj) {
        switch (this.a) {
            case 12:
                rif rifVar = (rif) obj;
                return rifVar.a + ": " + rifVar.b;
            case 15:
                return (oqs) obj;
            case 18:
                return G8.a((UiModeManager) obj);
            default:
                t0e t0eVar = (t0e) obj;
                t0eVar.p();
                return yde.v(ldg.O(new wvs(1), t0eVar.I.b));
        }
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        Bundle bundle = (Bundle) task.i();
        if (bundle == null) {
            f("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            f("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            f(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        f("SERVICE_NOT_AVAILABLE");
        return null;
    }

    public /* synthetic */ kac(int i, Object obj) {
        this.a = i;
    }

    @Override // io.appmetrica.analytics.impl.Jr
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.a) {
            case 21:
                return Gr.a(jSONObject, jSONObject2);
            default:
                return Hr.a(jSONObject, jSONObject2);
        }
    }
}
