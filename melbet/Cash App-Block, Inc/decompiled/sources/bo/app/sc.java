package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sc extends i2 {
    public final ArrayList l;
    public final long m;
    public final List n;
    public final c9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(ue ueVar, String str, String str2, ArrayList arrayList, long j, List list) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "push/redeliver"), false), str2, ueVar, 8);
        ueVar.getClass();
        str.getClass();
        arrayList.getClass();
        list.getClass();
        this.l = arrayList;
        this.m = j;
        this.n = list;
        this.o = c9.k;
    }

    public static final String l() {
        return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
    }

    public static final String m() {
        return "PushMaxSendRequest executed successfully.";
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
            a.put("campaign_ids", new JSONArray((Collection) this.l));
            a.put("last_sync_at", this.m);
            if (!this.n.isEmpty()) {
                a.put("dedupe_ids", new JSONArray((Collection) this.n));
            }
            return a;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(28), 4, (Object) null);
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

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 r7Var, m9 m9Var, nb nbVar) {
        r7Var.getClass();
        m9Var.getClass();
        nbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(29), 7, (Object) null);
        long j = nbVar.o;
        if (j != -1) {
            r7Var.b(new rc(j), rc.class);
        }
    }
}
