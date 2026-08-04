package com.gamericefishpro.space.wd;

import com.gamericefishpro.space.fc.h;
import com.gamericefishpro.space.hh.b;
import com.gamericefishpro.space.qd.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final C0067a Companion = new C0067a(null);
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private final b _propertiesModelStore;
    private final com.gamericefishpro.space.kd.a _time;

    /* JADX INFO: renamed from: com.gamericefishpro.space.wd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0067a {
        public /* synthetic */ C0067a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0067a() {
        }
    }

    public a(com.gamericefishpro.space.kd.a _time, b _propertiesModelStore) {
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        this._time = _time;
        this._propertiesModelStore = _propertiesModelStore;
    }

    private final String taggedHTMLString(String str) {
        h tags = ((com.gamericefishpro.space.hh.a) this._propertiesModelStore.getModel()).getTags();
        Intrinsics.c(tags, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        String string = new JSONObject(tags).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = String.format(LIQUID_TAG_SCRIPT, Arrays.copyOf(new Object[]{string}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        sb.append(str2);
        return sb.toString();
    }

    public final d hydrateIAMMessageContent(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        try {
            d dVar = new d(jsonObject);
            if (dVar.getContentHtml() == null) {
                com.gamericefishpro.space.od.b.debug$default("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent", null, 2, null);
                return null;
            }
            String contentHtml = dVar.getContentHtml();
            Intrinsics.b(contentHtml);
            dVar.setContentHtml(taggedHTMLString(contentHtml));
            return dVar;
        } catch (JSONException e) {
            com.gamericefishpro.space.od.b.error("Error attempting to hydrate InAppMessageContent: " + jsonObject, e);
            return null;
        }
    }

    public final List<com.gamericefishpro.space.qd.a> hydrateIAMMessages(JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            com.gamericefishpro.space.qd.a aVar = new com.gamericefishpro.space.qd.a(jSONObject, this._time);
            if (aVar.getMessageId() != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
