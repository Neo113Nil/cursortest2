package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.Braze;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class i2 extends yc implements d9 {
    public String b;
    public final ue c;
    public final j2 d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public String i;
    public x4 j;
    public String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(kd kdVar, String str, ue ueVar, j2 j2Var) {
        super(kdVar);
        kdVar.getClass();
        ueVar.getClass();
        j2Var.getClass();
        this.b = str;
        this.c = ueVar;
        this.d = j2Var;
    }

    public static final String b(i2 i2Var) {
        return ">> Request Uri: " + i2Var.e();
    }

    public static final String c(i2 i2Var) {
        return i2Var + " for " + i2Var.b() + " executed successfully.";
    }

    public static final String d() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    public static final String f() {
        return "******************************************************************";
    }

    public static final String g() {
        return "**                        !! WARNING !!                         **";
    }

    public static final String h() {
        return "**  The current API key/endpoint combination is invalid. This   **";
    }

    public static final String i() {
        return "** is potentially an integration error. Please ensure that your **";
    }

    public static final String j() {
        return "**     API key AND custom endpoint information are correct.     **";
    }

    public static final String k() {
        return "******************************************************************";
    }

    @Override // bo.app.r9
    public void a(r7 r7Var, m9 m9Var, t9 t9Var) {
        r7Var.getClass();
        m9Var.getClass();
        t9Var.getClass();
        String a = t9Var.a();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(a, 13), 6, (Object) null);
        if (t9Var instanceof sa) {
            r7Var.b(t9Var, sa.class);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(5), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(6), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(7), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(8), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(9), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new i2$$ExternalSyntheticLambda1(this, 1), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new i2$$ExternalSyntheticLambda1(this, 2), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(4), 6, (Object) null);
        }
        if (t9Var instanceof pd) {
            ((r7) m9Var).b(new BrazeSdkAuthenticationErrorEvent((pd) t9Var), BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    public final kd e() {
        return new kd(Braze.INSTANCE.getApiEndpoint(this.a.b));
    }

    public String toString() {
        return hashCode() + " - " + JsonUtils.getPrettyPrintedString(a()) + "\nto target: " + e();
    }

    public /* synthetic */ i2(kd kdVar, String str, ue ueVar, int i) {
        this(kdVar, (i & 2) != 0 ? null : str, ueVar, j2.UNKNOWN);
    }

    @Override // bo.app.r9
    public void b(r7 r7Var) {
        r7Var.getClass();
        r7Var.b(new zc(this), zc.class);
    }

    public void a(HashMap hashMap) {
        hashMap.getClass();
        hashMap.put("X-Braze-Api-Key", this.h);
        String str = this.k;
        if (str != null && str.length() != 0) {
            hashMap.put("X-Braze-Auth-Signature", this.k);
        }
        j2 j2Var = this.d;
        if (j2Var != j2.UNKNOWN) {
            hashMap.put("X-Braze-Request-Initiated-By", j2Var.a);
        }
    }

    public static final String a(i2 i2Var) {
        return Recorder$$ExternalSyntheticOutline2.m(">> API key    : ", i2Var.h);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            x4 x4Var = this.j;
            if (x4Var != null && !x4Var.isEmpty()) {
                jSONObject.put("device", x4Var.getJsonObject());
            }
            String str = this.g;
            if (str != null) {
                jSONObject.put("device_id", str);
            }
            Long l = this.e;
            if (l != null) {
                jSONObject.put("time", l);
            }
            String str2 = this.h;
            if (str2 != null) {
                jSONObject.put("api_key", str2);
            }
            String str3 = this.i;
            if (str3 != null) {
                jSONObject.put("sdk_version", str3);
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new hf$$ExternalSyntheticLambda0(3), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.r9
    public void a(r7 r7Var, m9 m9Var, nb nbVar) {
        r7Var.getClass();
        m9Var.getClass();
        nbVar.getClass();
        ke keVar = nbVar.e;
        if (keVar != null) {
            ((r7) m9Var).b(new BrazeSdkAuthenticationErrorEvent(new pd(keVar.a, keVar.b, keVar.c, null)), BrazeSdkAuthenticationErrorEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b() == c9.n, new i2$$ExternalSyntheticLambda1(this, 0), 3, (Object) null);
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Error occurred while executing Braze request: ", str);
    }

    @Override // bo.app.r9
    public void a(r7 r7Var) {
        r7Var.getClass();
        r7Var.b(new ad(this), ad.class);
    }
}
