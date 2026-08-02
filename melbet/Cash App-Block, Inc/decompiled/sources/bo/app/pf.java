package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pf extends i2 {
    public final sf l;
    public final v9 m;
    public final c9 n;
    public final String o;
    public final long p;
    public final long q;
    public final sf r;
    public final lb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(ue ueVar, String str, sf sfVar, v9 v9Var, String str2) {
        super(new kd(Recorder$$ExternalSyntheticOutline2.m$1(str, "template"), false), str2, ueVar, 8);
        long j;
        ueVar.getClass();
        str.getClass();
        sfVar.getClass();
        v9Var.getClass();
        this.l = sfVar;
        this.m = v9Var;
        this.n = c9.g;
        this.o = sfVar.h;
        int i = sfVar.b.e;
        if (i == -1) {
            j = TimeUnit.SECONDS.toMillis(r3.d + 30);
        } else {
            j = i;
        }
        this.p = j;
        this.q = sfVar.j;
        this.r = sfVar;
        this.s = new lb(str2, null, null);
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    @Override // bo.app.i2, bo.app.d9
    public final JSONObject a() {
        JSONObject a = super.a();
        if (a == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trigger_id", this.o);
            jSONObject.put("trigger_event_type", this.m.a());
            y8 y8Var = ((gg) this.m).c;
            jSONObject.put("data", y8Var != null ? ((k1) y8Var).getJsonKey() : null);
            a.put("template", jSONObject);
            String str = this.s.a;
            if (str != null && str.length() != 0) {
                a.put("respond_with", this.s.getJsonKey());
            }
            return a;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new pf$$ExternalSyntheticLambda0(0), 4, (Object) null);
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

    @Override // bo.app.i2
    public final String toString() {
        sf sfVar = this.l;
        v9 v9Var = this.m;
        String str = this.o;
        long j = this.q;
        long j2 = ((gg) v9Var).b + this.p;
        sf sfVar2 = this.r;
        StringBuilder sb = new StringBuilder("TemplateRequest(templatedTriggeredAction=");
        sb.append(sfVar);
        sb.append(", triggerEvent=");
        sb.append(v9Var);
        sb.append(", triggerAnalyticsId='");
        sb.append(str);
        sb.append("', templatePayloadExpirationTimestamp=");
        sb.append(j);
        Boxes$$ExternalSyntheticOutline1.m1151m(j2, ", getTemplatedDataExpiration=", "triggeredAction=", sb);
        sb.append(sfVar2);
        sb.append(")");
        return sb.toString();
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 r7Var, m9 m9Var, nb nbVar) {
        r7Var.getClass();
        m9Var.getClass();
        nbVar.getClass();
        InAppMessageBase inAppMessageBase = nbVar.g;
        if (inAppMessageBase != null) {
            inAppMessageBase.setLocalPrefetchedAssetPaths(MapsKt__MapsKt.toMap(this.l.f));
        }
    }

    @Override // bo.app.i2, bo.app.r9
    public final void a(r7 r7Var, m9 m9Var, t9 t9Var) {
        r7Var.getClass();
        m9Var.getClass();
        t9Var.getClass();
        super.a(r7Var, m9Var, t9Var);
        if (t9Var instanceof i0) {
            r7Var.b(new sg(this.m, this.l), sg.class);
        }
    }
}
