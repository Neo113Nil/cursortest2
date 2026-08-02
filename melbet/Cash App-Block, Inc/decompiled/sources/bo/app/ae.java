package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ae extends i2 {
    public final c9 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ue ueVar, String str, String str2) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "debugger/init"), true), str2, ueVar, 8);
        ueVar.getClass();
        str.getClass();
        this.l = c9.m;
    }

    public static final String l() {
        return "Experienced JSONException while creating SDK Initialization request. Returning null.";
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda3(20), 4, (Object) null);
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

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap hashMap) {
        hashMap.getClass();
        super.a(hashMap);
        hashMap.put("X-Braze-Rec-Auth-Code", this.c.z());
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 r7Var, m9 m9Var, t9 t9Var) {
        r7Var.getClass();
        m9Var.getClass();
        t9Var.getClass();
        super.a(r7Var, m9Var, t9Var);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new ae$$ExternalSyntheticLambda1(t9Var, 0), 3, (Object) null);
        r7Var.b(new yd(new td()), yd.class);
    }

    public static final String a(t9 t9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SDK Debugger Initialization Request failed ", t9Var.a(), ". Disabling SDK Debugger.");
    }
}
