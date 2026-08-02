package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nb extends j {
    public final JSONObject c;
    public final t9 d;
    public final ke e;
    public final u3 f;
    public final InAppMessageBase g;
    public final ArrayList h;
    public final re i;
    public final ArrayList j;
    public final JSONArray k;
    public final String l;
    public final String m;
    public final String n;
    public final long o;
    public final JSONObject p;
    public final Long q;
    public final ArrayList r;
    public final td s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
    
        if (r2.isEmpty() != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nb(d9 d9Var, n9 n9Var, e2 e2Var) {
        super(d9Var, n9Var);
        ArrayList arrayList;
        u3 u3Var;
        ArrayList a;
        JSONObject optJSONObject;
        re reVar;
        JSONArray optJSONArray;
        d9Var.getClass();
        n9Var.getClass();
        e2Var.getClass();
        JSONObject jSONObject = n9Var.c;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.c = jSONObject;
        String optionalString = JsonUtils.getOptionalString(jSONObject, BreadcrumbHelper.Category.ERROR);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("auth_error");
        t9 pdVar = optJSONObject2 != null ? new pd(d9Var, optJSONObject2.optInt("error_code", -1), JsonUtils.getOptionalString(optJSONObject2, "reason"), optionalString) : Intrinsics.areEqual(optionalString, "invalid_api_key") ? new sa(optionalString, d9Var) : optionalString != null ? new i0(optionalString, d9Var) : null;
        this.d = pdVar;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("optional_auth_error");
        this.e = optJSONObject3 != null ? new ke(d9Var, optJSONObject3.optInt("error_code", -1), JsonUtils.getOptionalString(optJSONObject3, "reason")) : null;
        this.k = jSONObject.optJSONArray("feature_flags");
        this.o = jSONObject.optLong("last_sync_at", -1L);
        this.p = jSONObject.optJSONObject("banners");
        this.q = jSONObject.has("request_time") ? Long.valueOf(jSONObject.optLong("request_time")) : null;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("dismissals");
        if (optJSONObject4 != null && (optJSONArray = optJSONObject4.optJSONArray("acknowledged")) != null) {
            arrayList = d.c.a(optJSONArray);
        }
        arrayList = null;
        this.r = arrayList;
        if (pdVar == null && (d9Var instanceof y3)) {
            try {
                u3Var = new u3(jSONObject);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new gd$$ExternalSyntheticLambda0(this, 1), 4, (Object) null);
            }
            this.f = u3Var;
            a = og.a.a(this.c.optJSONArray("triggers"), e2Var);
            this.h = a;
            if (a != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new gd$$ExternalSyntheticLambda0(this, 2), 6, (Object) null);
            }
            optJSONObject = this.c.optJSONObject("config");
            if (optJSONObject == null) {
                try {
                    reVar = new re(optJSONObject);
                } catch (Exception e2) {
                    e = e2;
                    reVar = null;
                }
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(optJSONObject, 2), 6, (Object) null);
                } catch (Exception e3) {
                    e = e3;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new l$$ExternalSyntheticLambda2(optJSONObject, 3), 4, (Object) null);
                    this.i = reVar;
                    this.g = og.a(this.c.optJSONObject("templated_message"), e2Var);
                    JSONArray optJSONArray2 = this.c.optJSONArray("geofences");
                    this.j = optJSONArray2 != null ? com.braze.support.f.a(optJSONArray2) : null;
                    if (d9Var instanceof v5) {
                    }
                    this.s = d9Var instanceof ae ? xd.k.a(this.c, true) : null;
                }
            } else {
                reVar = null;
            }
            this.i = reVar;
            this.g = og.a(this.c.optJSONObject("templated_message"), e2Var);
            JSONArray optJSONArray22 = this.c.optJSONArray("geofences");
            this.j = optJSONArray22 != null ? com.braze.support.f.a(optJSONArray22) : null;
            if (d9Var instanceof v5) {
                this.l = JsonUtils.getOptionalString(this.c, "mite");
                this.m = JsonUtils.getOptionalString(this.c, "host");
                this.n = JsonUtils.getOptionalString(this.c, "auth");
            } else {
                this.l = null;
                this.m = null;
                this.n = null;
            }
            this.s = d9Var instanceof ae ? xd.k.a(this.c, true) : null;
        }
        u3Var = null;
        this.f = u3Var;
        a = og.a.a(this.c.optJSONArray("triggers"), e2Var);
        this.h = a;
        if (a != null) {
        }
        optJSONObject = this.c.optJSONObject("config");
        if (optJSONObject == null) {
        }
        this.i = reVar;
        this.g = og.a(this.c.optJSONObject("templated_message"), e2Var);
        JSONArray optJSONArray222 = this.c.optJSONArray("geofences");
        this.j = optJSONArray222 != null ? com.braze.support.f.a(optJSONArray222) : null;
        if (d9Var instanceof v5) {
        }
        this.s = d9Var instanceof ae ? xd.k.a(this.c, true) : null;
    }

    public static final String a(nb nbVar) {
        return "Encountered Exception processing Content Cards response: " + nbVar.c;
    }

    public static final String b(nb nbVar) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(nbVar.h.size(), "Found ", " triggered actions in server response.");
    }

    public static final String b(JSONObject jSONObject) {
        return "Encountered Exception processing server config: " + jSONObject;
    }

    public static final String a(JSONObject jSONObject) {
        return Recorder$$ExternalSyntheticOutline2.m("Got server config: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }
}
