package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v5 extends i2 {
    public final c9 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(ue ueVar, String str, String str2) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "dust/config"), false), str2, ueVar, 8);
        ueVar.getClass();
        str.getClass();
        this.l = c9.o;
    }

    public static final String l() {
        return "Experienced JSONException while creating DUST config request. Returning null.";
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(23), 4, (Object) null);
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
}
