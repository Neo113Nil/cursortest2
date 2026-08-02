package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sf extends tg {
    public final a9 g;
    public final String h;
    public final ArrayList i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(JSONObject jSONObject, a9 a9Var) {
        super(jSONObject);
        jSONObject.getClass();
        a9Var.getClass();
        this.i = new ArrayList();
        this.j = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda2(jSONObject, 10), 7, (Object) null);
        this.g = a9Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String string2 = jSONObject2.getString("trigger_id");
        string2.getClass();
        this.h = string2;
        JSONArray optJSONArray = jSONObject2.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            a(optJSONArray, xc.IMAGE);
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            a(optJSONArray2, xc.ZIP);
        }
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("prefetch_file_urls");
        if (optJSONArray3 != null) {
            a(optJSONArray3, xc.FILE);
        }
    }

    public static final String b() {
        return "Could not convert TemplatedTriggeredAction to JSON";
    }

    public final void a(JSONArray jSONArray, xc xcVar) {
        TransformingSequence map = SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(RangesKt___RangesKt.until(0, jSONArray.length())), new qf(jSONArray)), new rf(jSONArray));
        Iterator it = map.sequence.iterator();
        while (it.hasNext()) {
            this.i.add(new wc(xcVar, (String) map.transformer.invoke(it.next())));
        }
    }

    @Override // bo.app.rg, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getJsonKey() {
        try {
            JSONObject jsonKey = super.getJsonKey();
            if (jsonKey == null) {
                return null;
            }
            jsonKey.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_id", this.h);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                wc wcVar = (wc) obj;
                int ordinal = wcVar.a.ordinal();
                if (ordinal == 0) {
                    jSONArray2.put(wcVar.b);
                } else if (ordinal == 1) {
                    jSONArray.put(wcVar.b);
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONArray3.put(wcVar.b);
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            jsonKey.put("data", jSONObject);
            return jsonKey;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(3), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.y9
    public final ArrayList a() {
        return new ArrayList(this.i);
    }

    public static final String a(JSONObject jSONObject) {
        return Recorder$$ExternalSyntheticOutline2.m("Parsing templated triggered action with JSON: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    @Override // bo.app.y9
    public final void a(Context context, r7 r7Var, v9 v9Var, long j) {
        context.getClass();
        r7Var.getClass();
        v9Var.getClass();
        this.j = j;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(this, 20), 7, (Object) null);
        e2 e2Var = (e2) this.g;
        e2Var.getClass();
        e2Var.a(new pf(e2Var.f, e2Var.e.getBaseUrlForRequests(), this, v9Var, e2Var.b));
    }

    public static final String a(sf sfVar) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sfVar.b.d, "Posting templating request after delay of ", " seconds.");
    }
}
