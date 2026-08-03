package com.onesignal.inAppMessages.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {
    public static final a Companion = new a(null);
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private final e9.a _time;
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private boolean isRedisplayEnabled;
    private long lastDisplayTime;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    public h(e9.a aVar) {
        pc.j.e(aVar, "_time");
        this._time = aVar;
        this.lastDisplayTime = -1L;
        this.displayLimit = 1;
    }

    public final long getDisplayDelay() {
        return this.displayDelay;
    }

    public final int getDisplayLimit() {
        return this.displayLimit;
    }

    public final int getDisplayQuantity() {
        return this.displayQuantity;
    }

    public final long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    public final void incrementDisplayQuantity() {
        this.displayQuantity++;
    }

    public final boolean isDelayTimeSatisfied() {
        if (this.lastDisplayTime < 0) {
            return true;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        long j3 = currentTimeMillis - this.lastDisplayTime;
        com.onesignal.debug.internal.logging.b.debug$default("OSInAppMessage lastDisplayTime: " + this.lastDisplayTime + " currentTimeInSeconds: " + currentTimeMillis + " diffInSeconds: " + j3 + " displayDelay: " + this.displayDelay, null, 2, null);
        return j3 >= this.displayDelay;
    }

    public final boolean isRedisplayEnabled() {
        return this.isRedisplayEnabled;
    }

    public final void setDisplayDelay(long j3) {
        this.displayDelay = j3;
    }

    public final void setDisplayLimit(int i10) {
        this.displayLimit = i10;
    }

    public final void setDisplayQuantity(int i10) {
        this.displayQuantity = i10;
    }

    public final void setDisplayStats(h hVar) {
        pc.j.e(hVar, "displayStats");
        this.lastDisplayTime = hVar.lastDisplayTime;
        this.displayQuantity = hVar.displayQuantity;
    }

    public final void setLastDisplayTime(long j3) {
        this.lastDisplayTime = j3;
    }

    public final boolean shouldDisplayAgain() {
        boolean z10 = this.displayQuantity < this.displayLimit;
        com.onesignal.debug.internal.logging.b.debug$default("OSInAppMessage shouldDisplayAgain: " + z10, null, 2, null);
        return z10;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.lastDisplayTime + ", displayQuantity=" + this.displayQuantity + ", displayLimit=" + this.displayLimit + ", displayDelay=" + this.displayDelay + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i10, long j3, e9.a aVar) {
        this(aVar);
        pc.j.e(aVar, bb.e.TIME);
        this.displayQuantity = i10;
        this.lastDisplayTime = j3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(JSONObject jSONObject, e9.a aVar) {
        this(aVar);
        pc.j.e(jSONObject, "json");
        pc.j.e(aVar, bb.e.TIME);
        this.isRedisplayEnabled = true;
        Object obj = jSONObject.get(DISPLAY_LIMIT);
        Object obj2 = jSONObject.get(DISPLAY_DELAY);
        if (obj instanceof Integer) {
            this.displayLimit = ((Number) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.displayDelay = ((Number) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.displayDelay = ((Number) obj2).intValue();
        }
    }
}
