package com.onesignal.inAppMessages.internal;

import bc.v;
import bc.w;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements i9.a {
    public static final C0022a Companion = new C0022a(null);
    private static final String DISPLAY_DURATION = "displayDuration";
    private static final String END_TIME = "end_time";
    private static final String HAS_LIQUID = "has_liquid";
    private static final String IAM_ID = "messageId";
    private static final String IAM_REDISPLAY_STATS = "redisplay";
    private static final String IAM_TRIGGERS = "triggers";
    private static final String IAM_VARIANTS = "variants";
    private static final String ID = "id";
    private boolean actionTaken;
    private Set<String> clickedClickIds;
    private double displayDuration;
    private Date endTime;
    private boolean hasLiquid;
    private boolean isDisplayedInSession;
    private boolean isPreview;
    private boolean isTriggerChanged;
    private final String messageId;
    private h redisplayStats;
    private List<? extends List<m>> triggers;
    private Map<String, ? extends Map<String, String>> variants;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.a$a, reason: collision with other inner class name */
    public static final class C0022a {
        public /* synthetic */ C0022a(pc.f fVar) {
            this();
        }

        private C0022a() {
        }
    }

    public a(String str, e9.a aVar) {
        pc.j.e(str, IAM_ID);
        pc.j.e(aVar, bb.e.TIME);
        this.messageId = str;
        this.variants = w.f1068g;
        this.triggers = v.f1067g;
        this.clickedClickIds = new LinkedHashSet();
        this.redisplayStats = new h(aVar);
    }

    private final Date parseEndTimeJson(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(END_TIME);
            pc.j.d(string, "{\n                json.g…g(END_TIME)\n            }");
            if (string.equals("null")) {
                return null;
            }
            try {
                return com.onesignal.common.b.INSTANCE.iso8601Format().parse(string);
            } catch (ParseException e10) {
                e10.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    private final ArrayList<ArrayList<m>> parseTriggerJson(JSONArray jSONArray) {
        ArrayList<ArrayList<m>> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            ArrayList<m> arrayList2 = new ArrayList<>();
            int length2 = jSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i11);
                pc.j.d(jSONObject, "ands.getJSONObject(j)");
                arrayList2.add(new m(jSONObject));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private final HashMap<String, HashMap<String, String>> parseVariants(JSONObject jSONObject) {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap<String, String> hashMap2 = new HashMap<>();
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                pc.j.d(next2, "languageType");
                String string = jSONObject2.getString(next2);
                pc.j.d(string, "variant.getString(languageType)");
                hashMap2.put(next2, string);
            }
            pc.j.d(next, "variantType");
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    public final void addClickId(String str) {
        pc.j.e(str, "clickId");
        this.clickedClickIds.add(str);
    }

    public final void clearClickIds() {
        this.clickedClickIds.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a.class.equals(obj.getClass())) {
            return false;
        }
        return pc.j.a(getMessageId(), ((a) obj).getMessageId());
    }

    public final Set<String> getClickedClickIds() {
        return this.clickedClickIds;
    }

    public final double getDisplayDuration() {
        return this.displayDuration;
    }

    public final boolean getHasLiquid() {
        return this.hasLiquid;
    }

    @Override // i9.a
    public String getMessageId() {
        return this.messageId;
    }

    public final h getRedisplayStats() {
        return this.redisplayStats;
    }

    public final List<List<m>> getTriggers() {
        return this.triggers;
    }

    public final Map<String, Map<String, String>> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return getMessageId().hashCode();
    }

    public final boolean isClickAvailable(String str) {
        pc.j.e(str, "clickId");
        return !this.clickedClickIds.contains(str);
    }

    public final boolean isDisplayedInSession() {
        return this.isDisplayedInSession;
    }

    public final boolean isFinished() {
        if (this.endTime == null) {
            return false;
        }
        Date date = new Date();
        Date date2 = this.endTime;
        pc.j.b(date2);
        return date2.before(date);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public final boolean isTriggerChanged() {
        return this.isTriggerChanged;
    }

    public final void removeClickId(String str) {
        pc.j.e(str, "clickId");
        this.clickedClickIds.remove(str);
    }

    public final void setDisplayDuration(double d10) {
        this.displayDuration = d10;
    }

    public final void setDisplayedInSession(boolean z10) {
        this.isDisplayedInSession = z10;
    }

    public final void setTriggerChanged(boolean z10) {
        this.isTriggerChanged = z10;
    }

    public final boolean takeActionAsUnique() {
        if (this.actionTaken) {
            return false;
        }
        this.actionTaken = true;
        return true;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IAM_ID, getMessageId());
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.variants.keySet()) {
                Map<String, String> map = this.variants.get(str);
                pc.j.b(map);
                Map<String, String> map2 = map;
                JSONObject jSONObject3 = new JSONObject();
                for (String str2 : map2.keySet()) {
                    jSONObject3.put(str2, map2.get(str2));
                }
                jSONObject2.put(str, jSONObject3);
            }
            jSONObject.put(IAM_VARIANTS, jSONObject2);
            jSONObject.put(DISPLAY_DURATION, this.displayDuration);
            jSONObject.put(IAM_REDISPLAY_STATS, this.redisplayStats.toJSONObject());
            JSONArray jSONArray = new JSONArray();
            for (List<m> list : this.triggers) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<m> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().toJSONObject());
                }
                jSONArray.put(jSONArray2);
            }
            jSONObject.put(IAM_TRIGGERS, jSONArray);
            if (this.endTime != null) {
                jSONObject.put(END_TIME, com.onesignal.common.b.INSTANCE.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + getMessageId() + "', variants=" + this.variants + ", triggers=" + this.triggers + ", clickedClickIds=" + this.clickedClickIds + ", redisplayStats=" + this.redisplayStats + ", displayDuration=" + this.displayDuration + ", displayedInSession=" + this.isDisplayedInSession + ", triggerChanged=" + this.isTriggerChanged + ", actionTaken=" + this.actionTaken + ", isPreview=" + this.isPreview + ", endTime=" + this.endTime + ", hasLiquid=" + this.hasLiquid + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, e9.a aVar) {
        this("", aVar);
        pc.j.e(aVar, bb.e.TIME);
        this.isPreview = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, Set<String> set, boolean z10, h hVar, e9.a aVar) {
        this(str, aVar);
        pc.j.e(str, IAM_ID);
        pc.j.e(set, "clickIds");
        pc.j.e(hVar, "redisplayStats");
        pc.j.e(aVar, bb.e.TIME);
        this.clickedClickIds = bc.m.h0(set);
        this.isDisplayedInSession = z10;
        this.redisplayStats = hVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(JSONObject jSONObject, e9.a aVar) {
        this(r0, aVar);
        pc.j.e(jSONObject, "json");
        pc.j.e(aVar, bb.e.TIME);
        String string = jSONObject.getString(ID);
        pc.j.d(string, "json.getString(ID)");
        JSONObject jSONObject2 = jSONObject.getJSONObject(IAM_VARIANTS);
        pc.j.d(jSONObject2, "json.getJSONObject(IAM_VARIANTS)");
        this.variants = parseVariants(jSONObject2);
        JSONArray jSONArray = jSONObject.getJSONArray(IAM_TRIGGERS);
        pc.j.d(jSONArray, "json.getJSONArray(IAM_TRIGGERS)");
        this.triggers = parseTriggerJson(jSONArray);
        this.endTime = parseEndTimeJson(jSONObject);
        if (jSONObject.has(HAS_LIQUID)) {
            this.hasLiquid = jSONObject.getBoolean(HAS_LIQUID);
        }
        if (jSONObject.has(IAM_REDISPLAY_STATS)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(IAM_REDISPLAY_STATS);
            pc.j.d(jSONObject3, "json.getJSONObject(IAM_REDISPLAY_STATS)");
            this.redisplayStats = new h(jSONObject3, aVar);
        }
    }
}
