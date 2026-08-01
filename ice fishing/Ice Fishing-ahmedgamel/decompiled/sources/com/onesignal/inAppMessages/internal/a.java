package com.onesignal.inAppMessages.internal;

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
import v7.AbstractC5129j;
import v7.C5135p;
import v7.q;

/* loaded from: classes2.dex */
public final class a implements O4.a {
    public static final C0200a Companion = new C0200a(null);
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

    /* renamed from: com.onesignal.inAppMessages.internal.a$a, reason: collision with other inner class name */
    public static final class C0200a {
        public /* synthetic */ C0200a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0200a() {
        }
    }

    public a(String messageId, K4.a time) {
        kotlin.jvm.internal.h.e(messageId, "messageId");
        kotlin.jvm.internal.h.e(time, "time");
        this.messageId = messageId;
        this.variants = q.f41443n;
        this.triggers = C5135p.f41442n;
        this.clickedClickIds = new LinkedHashSet();
        this.redisplayStats = new h(time);
    }

    private final Date parseEndTimeJson(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("end_time");
            kotlin.jvm.internal.h.b(string);
            if (string.equals("null")) {
                return null;
            }
            try {
                return com.onesignal.common.b.INSTANCE.iso8601Format().parse(string);
            } catch (ParseException e9) {
                e9.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    private final ArrayList<ArrayList<m>> parseTriggerJson(JSONArray jSONArray) {
        ArrayList<ArrayList<m>> arrayList = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList<m> arrayList2 = new ArrayList<>();
            int length2 = jSONArray2.length();
            for (int i6 = 0; i6 < length2; i6++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i6);
                kotlin.jvm.internal.h.d(jSONObject, "getJSONObject(...)");
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
                kotlin.jvm.internal.h.b(next2);
                String string = jSONObject2.getString(next2);
                kotlin.jvm.internal.h.d(string, "getString(...)");
                hashMap2.put(next2, string);
            }
            kotlin.jvm.internal.h.b(next);
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    public final void addClickId(String clickId) {
        kotlin.jvm.internal.h.e(clickId, "clickId");
        this.clickedClickIds.add(clickId);
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
        return kotlin.jvm.internal.h.a(getMessageId(), ((a) obj).getMessageId());
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

    @Override // O4.a
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

    public final boolean isClickAvailable(String clickId) {
        kotlin.jvm.internal.h.e(clickId, "clickId");
        return !this.clickedClickIds.contains(clickId);
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
        kotlin.jvm.internal.h.b(date2);
        return date2.before(date);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public final boolean isTriggerChanged() {
        return this.isTriggerChanged;
    }

    public final void removeClickId(String clickId) {
        kotlin.jvm.internal.h.e(clickId, "clickId");
        this.clickedClickIds.remove(clickId);
    }

    public final void setDisplayDuration(double d2) {
        this.displayDuration = d2;
    }

    public final void setDisplayedInSession(boolean z3) {
        this.isDisplayedInSession = z3;
    }

    public final void setTriggerChanged(boolean z3) {
        this.isTriggerChanged = z3;
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
                kotlin.jvm.internal.h.b(map);
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
                jSONObject.put("end_time", com.onesignal.common.b.INSTANCE.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + getMessageId() + "', variants=" + this.variants + ", triggers=" + this.triggers + ", clickedClickIds=" + this.clickedClickIds + ", redisplayStats=" + this.redisplayStats + ", displayDuration=" + this.displayDuration + ", displayedInSession=" + this.isDisplayedInSession + ", triggerChanged=" + this.isTriggerChanged + ", actionTaken=" + this.actionTaken + ", isPreview=" + this.isPreview + ", endTime=" + this.endTime + ", hasLiquid=" + this.hasLiquid + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(boolean z3, K4.a time) {
        this("", time);
        kotlin.jvm.internal.h.e(time, "time");
        this.isPreview = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String messageId, Set<String> clickIds, boolean z3, h redisplayStats, K4.a time) {
        this(messageId, time);
        kotlin.jvm.internal.h.e(messageId, "messageId");
        kotlin.jvm.internal.h.e(clickIds, "clickIds");
        kotlin.jvm.internal.h.e(redisplayStats, "redisplayStats");
        kotlin.jvm.internal.h.e(time, "time");
        this.clickedClickIds = AbstractC5129j.O(clickIds);
        this.isDisplayedInSession = z3;
        this.redisplayStats = redisplayStats;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(JSONObject json, K4.a time) {
        this(r0, time);
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.e(time, "time");
        String string = json.getString("id");
        kotlin.jvm.internal.h.d(string, "getString(...)");
        JSONObject jSONObject = json.getJSONObject(IAM_VARIANTS);
        kotlin.jvm.internal.h.d(jSONObject, "getJSONObject(...)");
        this.variants = parseVariants(jSONObject);
        JSONArray jSONArray = json.getJSONArray(IAM_TRIGGERS);
        kotlin.jvm.internal.h.d(jSONArray, "getJSONArray(...)");
        this.triggers = parseTriggerJson(jSONArray);
        this.endTime = parseEndTimeJson(json);
        if (json.has(HAS_LIQUID)) {
            this.hasLiquid = json.getBoolean(HAS_LIQUID);
        }
        if (json.has(IAM_REDISPLAY_STATS)) {
            JSONObject jSONObject2 = json.getJSONObject(IAM_REDISPLAY_STATS);
            kotlin.jvm.internal.h.d(jSONObject2, "getJSONObject(...)");
            this.redisplayStats = new h(jSONObject2, time);
        }
    }
}
