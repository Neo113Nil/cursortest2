package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.models.BannerPendingDismissal;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h0 extends i2 {
    public final ArrayList l;
    public final List m;
    public final c9 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ArrayList arrayList, List list, ue ueVar, String str, String str2) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "banners/sync"), false), str2, ueVar, 8);
        arrayList.getClass();
        list.getClass();
        ueVar.getClass();
        str.getClass();
        this.l = arrayList;
        this.m = list;
        this.n = c9.l;
    }

    public static final String l() {
        return "Experienced JSONException while creating Banners Sync request. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a = super.a();
        if (a == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", ((Pair) obj).first);
                jSONArray.put(jSONObject);
            }
            String str = this.b;
            if (str != null && !StringsKt.isBlank(str)) {
                a.put("user_id", this.b);
            }
            Object obj2 = this.f;
            if (obj2 != null) {
                a.put("time_ms", obj2);
            }
            a.put("placements", jSONArray);
            if (!this.m.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (BannerPendingDismissal bannerPendingDismissal : this.m) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("banner_id", bannerPendingDismissal.getBannerId());
                    jSONObject2.put("stable_key", bannerPendingDismissal.getStableKey());
                    jSONObject2.put("dismissal_time", bannerPendingDismissal.getDismissalTimeMs());
                    jSONArray2.put(jSONObject2);
                }
                a.put("pending_dismissals", jSONArray2);
            }
            return a;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new g$$ExternalSyntheticLambda0(22), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.d9
    public final c9 b() {
        return this.n;
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
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(this, 9), 6, (Object) null);
        r7Var.b(new g0(this), g0.class);
    }

    public static final String a(h0 h0Var) {
        return Recorder$$ExternalSyntheticOutline2.m("BannersSyncRequest executed successfully. placements=", h0Var.l.size(), h0Var.m.size(), " pendingDismissals=");
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 r7Var, m9 m9Var, t9 t9Var) {
        r7Var.getClass();
        m9Var.getClass();
        t9Var.getClass();
        super.a(r7Var, m9Var, t9Var);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(15, this, t9Var), 6, (Object) null);
        r7Var.b(new f0(), f0.class);
    }

    public static final String a(h0 h0Var, t9 t9Var) {
        int size = h0Var.l.size();
        int size2 = h0Var.m.size();
        String a = t9Var.a();
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(size, size2, "BannersSyncRequest failed. placements=", " pendingDismissals=", " error=");
        m107m.append(a);
        return m107m.toString();
    }

    @Override // bo.app.i2, bo.app.d9
    public final void a(HashMap hashMap) {
        hashMap.getClass();
        super.a(hashMap);
        hashMap.put("X-Braze-DataRequest", "true");
        hashMap.put("X-Braze-BannersRequest", "true");
    }
}
