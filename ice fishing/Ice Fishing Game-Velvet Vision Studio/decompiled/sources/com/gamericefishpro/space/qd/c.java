package com.gamericefishpro.space.qd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.pd.d {
    private static final String CLICK_NAME = "click_name";
    private static final String CLICK_URL = "click_url";
    private static final String CLOSE = "close";
    private static final String CLOSES_MESSAGE = "closes_message";
    public static final a Companion = new a(null);
    private static final String FIRST_CLICK = "first_click";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String OUTCOMES = "outcomes";
    private static final String PAGE_ID = "pageId";
    private static final String PROMPTS = "prompts";
    private static final String TAGS = "tags";
    private static final String URL = "url";
    private static final String URL_TARGET = "url_target";
    private final String actionId;
    private final String clickId;
    private final boolean closingMessage;
    private boolean isFirstClick;
    private final List<f> outcomes;
    private final String pageId;
    private final List<com.gamericefishpro.space.de.b> prompts;
    private i tags;
    private final String url;
    private com.gamericefishpro.space.pd.k urlTarget;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(JSONObject json, com.gamericefishpro.space.ce.a promptFactory) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(promptFactory, "promptFactory");
        this.outcomes = new ArrayList();
        this.prompts = new ArrayList();
        this.clickId = json.optString(ID, null);
        this.actionId = json.optString(NAME, null);
        this.url = json.optString(URL, null);
        this.pageId = json.optString("pageId", null);
        setUrlTarget(com.gamericefishpro.space.pd.k.Companion.fromString(json.optString(URL_TARGET, null)));
        if (getUrlTarget() == null) {
            setUrlTarget(com.gamericefishpro.space.pd.k.IN_APP_WEBVIEW);
        }
        this.closingMessage = json.optBoolean(CLOSE, true);
        if (json.has(OUTCOMES)) {
            parseOutcomes(json);
        }
        if (json.has(TAGS)) {
            JSONObject jSONObject = json.getJSONObject(TAGS);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            this.tags = new i(jSONObject);
        }
        if (json.has(PROMPTS)) {
            parsePrompts(json, promptFactory);
        }
    }

    private final void parseOutcomes(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(OUTCOMES);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            List<f> list = this.outcomes;
            Object obj = jSONArray.get(i);
            Intrinsics.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            list.add(new f((JSONObject) obj));
        }
    }

    private final void parsePrompts(JSONObject jSONObject, com.gamericefishpro.space.ce.a aVar) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(PROMPTS);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            Intrinsics.b(string);
            com.gamericefishpro.space.de.b bVarCreatePrompt = aVar.createPrompt(string);
            if (bVarCreatePrompt != null) {
                this.prompts.add(bVarCreatePrompt);
            }
        }
    }

    @Override // com.gamericefishpro.space.pd.d
    public String getActionId() {
        return this.actionId;
    }

    public final String getClickId() {
        return this.clickId;
    }

    @Override // com.gamericefishpro.space.pd.d
    public boolean getClosingMessage() {
        return this.closingMessage;
    }

    public final List<f> getOutcomes() {
        return this.outcomes;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final List<com.gamericefishpro.space.de.b> getPrompts() {
        return this.prompts;
    }

    public final i getTags() {
        return this.tags;
    }

    @Override // com.gamericefishpro.space.pd.d
    public String getUrl() {
        return this.url;
    }

    @Override // com.gamericefishpro.space.pd.d
    public com.gamericefishpro.space.pd.k getUrlTarget() {
        return this.urlTarget;
    }

    public final boolean isFirstClick() {
        return this.isFirstClick;
    }

    public final void setFirstClick(boolean z) {
        this.isFirstClick = z;
    }

    public final void setTags(i iVar) {
        this.tags = iVar;
    }

    public void setUrlTarget(com.gamericefishpro.space.pd.k kVar) {
        this.urlTarget = kVar;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CLICK_NAME, getActionId());
            jSONObject.put(CLICK_URL, getUrl());
            jSONObject.put(FIRST_CLICK, this.isFirstClick);
            jSONObject.put(CLOSES_MESSAGE, getClosingMessage());
            JSONArray jSONArray = new JSONArray();
            Iterator<f> it = this.outcomes.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSONObject());
            }
            jSONObject.put(OUTCOMES, jSONArray);
            i iVar = this.tags;
            if (iVar != null) {
                Intrinsics.b(iVar);
                jSONObject.put(TAGS, iVar.toJSONObject());
            }
            if (getUrlTarget() != null) {
                jSONObject.put(URL_TARGET, String.valueOf(getUrlTarget()));
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
