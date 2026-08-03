package m9;

import com.onesignal.common.modeling.h;
import com.onesignal.inAppMessages.internal.d;
import com.onesignal.user.internal.properties.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.f;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    public static final C0075a Companion = new C0075a(null);
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private final b _propertiesModelStore;
    private final e9.a _time;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: m9.a$a, reason: collision with other inner class name */
    public static final class C0075a {
        public /* synthetic */ C0075a(f fVar) {
            this();
        }

        private C0075a() {
        }
    }

    public a(e9.a aVar, b bVar) {
        j.e(aVar, "_time");
        j.e(bVar, "_propertiesModelStore");
        this._time = aVar;
        this._propertiesModelStore = bVar;
    }

    private final String taggedHTMLString(String str) {
        h tags = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getTags();
        j.c(tags, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        String jSONObject = new JSONObject(tags).toString();
        j.d(jSONObject, "tagsAsJson.toString()");
        return str + String.format(LIQUID_TAG_SCRIPT, Arrays.copyOf(new Object[]{jSONObject}, 1));
    }

    public final d hydrateIAMMessageContent(JSONObject jSONObject) {
        j.e(jSONObject, "jsonObject");
        try {
            d dVar = new d(jSONObject);
            if (dVar.getContentHtml() == null) {
                com.onesignal.debug.internal.logging.b.debug$default("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent", null, 2, null);
                return null;
            }
            String contentHtml = dVar.getContentHtml();
            j.b(contentHtml);
            dVar.setContentHtml(taggedHTMLString(contentHtml));
            return dVar;
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.b.error("Error attempting to hydrate InAppMessageContent: " + jSONObject, e10);
            return null;
        }
    }

    public final List<com.onesignal.inAppMessages.internal.a> hydrateIAMMessages(JSONArray jSONArray) {
        j.e(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            j.d(jSONObject, "jsonArray.getJSONObject(i)");
            com.onesignal.inAppMessages.internal.a aVar = new com.onesignal.inAppMessages.internal.a(jSONObject, this._time);
            if (aVar.getMessageId() != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
