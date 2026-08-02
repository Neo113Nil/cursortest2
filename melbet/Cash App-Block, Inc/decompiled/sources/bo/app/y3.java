package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y3 extends i2 {
    public long l;
    public long m;
    public int n;
    public final c9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(ue ueVar, String str, long j, long j2, String str2, j2 j2Var) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "content_cards/sync"), false), str2, ueVar, j2Var);
        ueVar.getClass();
        str.getClass();
        j2Var.getClass();
        this.l = j;
        this.m = j2;
        this.n = 0;
        this.o = c9.d;
    }

    public static final String l() {
        return "Experienced JSONException while creating Content Cards request. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a = super.a();
        if (a == null) {
            return null;
        }
        try {
            a.put("last_full_sync_at", this.m);
            a.put("last_card_updated_at", this.l);
            String str = this.b;
            if (str != null && !StringsKt.isBlank(str)) {
                a.put("user_id", this.b);
                return a;
            }
            return a;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new z$$ExternalSyntheticLambda0(16), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.o;
    }

    @Override // bo.app.d9
    public final boolean c() {
        return false;
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap hashMap) {
        hashMap.getClass();
        super.a(hashMap);
        hashMap.put("X-Braze-DataRequest", "true");
        hashMap.put("X-Braze-ContentCardsRequest", "true");
        hashMap.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.n));
    }
}
