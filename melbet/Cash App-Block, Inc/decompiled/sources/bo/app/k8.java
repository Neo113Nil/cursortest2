package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k8 extends i2 {
    public final c9 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(ue ueVar, String str, String str2, j2 j2Var) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "feature_flags/sync"), false), str2, ueVar, j2Var);
        ueVar.getClass();
        str.getClass();
        j2Var.getClass();
        this.l = c9.e;
    }

    public static final String l() {
        return "Experienced JSONException while creating Feature Flags request. Returning null.";
    }

    public static final String m() {
        return "FeatureFlagsSyncRequest failed.";
    }

    public static final String n() {
        return "FeatureFlagsSyncRequest executed successfully.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a = super.a();
        if (a == null) {
            return null;
        }
        try {
            String str = this.b;
            if (str != null && !StringsKt.isBlank(str)) {
                a.put("user_id", this.b);
                return a;
            }
            return a;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new hf$$ExternalSyntheticLambda0(28), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.l;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return false;
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 r7Var, m9 m9Var, nb nbVar) {
        r7Var.getClass();
        m9Var.getClass();
        nbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(1), 7, (Object) null);
        r7Var.b(new j8(this), j8.class);
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 r7Var, m9 m9Var, t9 t9Var) {
        r7Var.getClass();
        m9Var.getClass();
        t9Var.getClass();
        super.a(r7Var, m9Var, t9Var);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(29), 6, (Object) null);
        r7Var.b(new i8(), i8.class);
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap hashMap) {
        hashMap.getClass();
        super.a(hashMap);
        hashMap.put("X-Braze-DataRequest", "true");
        hashMap.put("X-Braze-FeatureFlagsRequest", "true");
    }
}
