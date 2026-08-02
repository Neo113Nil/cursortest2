package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ee extends i2 {
    public final ArrayList l;
    public final c9 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ue ueVar, String str, String str2, ArrayList arrayList) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "debugger/log"), true), str2, ueVar, 8);
        ueVar.getClass();
        str.getClass();
        arrayList.getClass();
        this.l = arrayList;
        this.m = c9.n;
    }

    public static final String d() {
        return "Experienced JSONException while creating SDK Debugger Log request. Returning null.";
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
            }
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                de deVar = (de) obj;
                deVar.getClass();
                jSONArray.put(new JSONObject().put("log", deVar.a).put("time", deVar.b));
            }
            a.put("data", new JSONArray().put(new JSONObject().put("type", "sdk_event_log").put("data", jSONArray)));
            return a;
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog((Object) this, BrazeLogger.Priority.E, (Throwable) e, true, (Function0<String>) new d0$$ExternalSyntheticLambda9(28));
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.m;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return this.l.isEmpty();
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 r7Var, m9 m9Var, t9 t9Var) {
        r7Var.getClass();
        m9Var.getClass();
        t9Var.getClass();
        super.a(r7Var, m9Var, t9Var);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new ae$$ExternalSyntheticLambda1(t9Var, 1), 3, (Object) null);
        r7Var.b(new yd(new td()), yd.class);
    }

    public static final String a(t9 t9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SDK Debugger Log Request failed ", t9Var.a(), ". Disabling SDK Debugger.");
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap hashMap) {
        hashMap.getClass();
        super.a(hashMap);
        hashMap.put("X-Braze-Rec-Auth-Code", this.c.z());
    }
}
