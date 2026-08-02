package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oa extends tg {
    public final InAppMessageBase g;
    public final JSONObject h;
    public final a9 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(JSONObject jSONObject, a9 a9Var) {
        super(jSONObject);
        jSONObject.getClass();
        a9Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 5), 6, (Object) null);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.i = a9Var;
        this.h = jSONObject2;
        jSONObject2.getClass();
        InAppMessageBase a = com.braze.support.i.a(jSONObject2, a9Var);
        this.g = a;
        if (a != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(22), 6, (Object) null);
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Failed to parse in-app message triggered action with JSON: ", JsonUtils.getPrettyPrintedString(jSONObject)));
        throw null;
    }

    public static final String b(oa oaVar) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(oaVar.b.d, "Attempting to publish in-app message after delay of ", " seconds.");
    }

    public static final String c(v9 v9Var) {
        return "Cannot perform triggered action for " + v9Var + " due to in-app message json being null";
    }

    public static final String d(v9 v9Var) {
        return "Cannot perform triggered action for " + v9Var + " due to deserialized in-app message being null";
    }

    @Override // bo.app.y9
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        InAppMessageBase inAppMessageBase = this.g;
        List<String> remoteAssetPathsForPrefetch = inAppMessageBase != null ? inAppMessageBase.getRemoteAssetPathsForPrefetch() : null;
        if (remoteAssetPathsForPrefetch == null || remoteAssetPathsForPrefetch.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(21), 7, (Object) null);
            return arrayList;
        }
        InAppMessageBase inAppMessageBase2 = this.g;
        MessageType messageType = inAppMessageBase2 != null ? inAppMessageBase2.getMessageType() : null;
        int i = messageType == null ? -1 : na.a[messageType.ordinal()];
        if (i == 1) {
            arrayList.add(new wc(xc.ZIP, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i == 2 || i == 3 || i == 4) {
            arrayList.add(new wc(xc.IMAGE, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i != 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new oa$$ExternalSyntheticLambda0(this, 1), 6, (Object) null);
            return arrayList;
        }
        Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
        while (it.hasNext()) {
            arrayList.add(new wc(xc.FILE, it.next()));
        }
        return arrayList;
    }

    @Override // bo.app.rg, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonKey() {
        try {
            JSONObject jsonKey = super.getJsonKey();
            if (jsonKey != null) {
                InAppMessageBase inAppMessageBase = this.g;
                jsonKey.put("data", inAppMessageBase != null ? inAppMessageBase.getJsonKey() : null);
                jsonKey.put("type", "inapp");
                return jsonKey;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String b() {
        return "In-app message has no remote assets for prefetch. Returning empty list.";
    }

    public static final String c() {
        return "Failed to parse in-app message triggered action.";
    }

    public static final String d() {
        return "Caught exception while performing triggered action.";
    }

    public static final String a(oa oaVar) {
        InAppMessageBase inAppMessageBase = oaVar.g;
        return "Failed to return remote paths to assets for type: " + (inAppMessageBase != null ? inAppMessageBase.getMessageType() : null);
    }

    public static final String a(JSONObject jSONObject) {
        return Recorder$$ExternalSyntheticOutline2.m("Attempting to parse in-app message triggered action with JSON: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    @Override // bo.app.y9
    public final void a(Context context, r7 r7Var, v9 v9Var, long j) {
        context.getClass();
        r7Var.getClass();
        v9Var.getClass();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new oa$$ExternalSyntheticLambda0(this, 0), 7, (Object) null);
            JSONObject jSONObject = this.h;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new oa$$ExternalSyntheticLambda1(v9Var, 0), 6, (Object) null);
                return;
            }
            InAppMessageBase a = com.braze.support.i.a(jSONObject, this.i);
            String a2 = v9Var.a();
            int i = uf.$r8$clinit;
            if (Intrinsics.areEqual(a2, "test")) {
                if (a != null) {
                    a.setTestSend(true);
                }
                this.h.put("is_test_send", true);
            }
            if (a == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new oa$$ExternalSyntheticLambda1(v9Var, 4), 6, (Object) null);
                return;
            }
            a.setLocalPrefetchedAssetPaths(MapsKt__MapsKt.toMap(this.f));
            a.setExpirationTimestamp(j);
            r7Var.b(new la(v9Var, this, a, ((e2) this.i).b), la.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new o8$$ExternalSyntheticLambda6(20), 4, (Object) null);
        }
    }
}
