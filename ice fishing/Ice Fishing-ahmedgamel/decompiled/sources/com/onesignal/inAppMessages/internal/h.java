package com.onesignal.inAppMessages.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h {
    public static final a Companion = new a(null);
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private final K4.a _time;
    private long displayDelay;
    private int displayLimit;
    private int displayQuantity;
    private boolean isRedisplayEnabled;
    private long lastDisplayTime;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public h(K4.a _time) {
        kotlin.jvm.internal.h.e(_time, "_time");
        this._time = _time;
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
        long j6 = currentTimeMillis - this.lastDisplayTime;
        StringBuilder sb = new StringBuilder("OSInAppMessage lastDisplayTime: ");
        sb.append(this.lastDisplayTime);
        com.IceFishing.LiveIceFishing.k.z(sb, " currentTimeInSeconds: ", currentTimeMillis, " diffInSeconds: ");
        sb.append(j6);
        sb.append(" displayDelay: ");
        sb.append(this.displayDelay);
        com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
        return j6 >= this.displayDelay;
    }

    public final boolean isRedisplayEnabled() {
        return this.isRedisplayEnabled;
    }

    public final void setDisplayDelay(long j6) {
        this.displayDelay = j6;
    }

    public final void setDisplayLimit(int i) {
        this.displayLimit = i;
    }

    public final void setDisplayQuantity(int i) {
        this.displayQuantity = i;
    }

    public final void setDisplayStats(h displayStats) {
        kotlin.jvm.internal.h.e(displayStats, "displayStats");
        this.lastDisplayTime = displayStats.lastDisplayTime;
        this.displayQuantity = displayStats.displayQuantity;
    }

    public final void setLastDisplayTime(long j6) {
        this.lastDisplayTime = j6;
    }

    public final boolean shouldDisplayAgain() {
        boolean z6 = this.displayQuantity < this.displayLimit;
        com.onesignal.debug.internal.logging.b.debug$default("OSInAppMessage shouldDisplayAgain: " + z6, null, 2, null);
        return z6;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessageDisplayStats{lastDisplayTime=" + this.lastDisplayTime + ", displayQuantity=" + this.displayQuantity + ", displayLimit=" + this.displayLimit + ", displayDelay=" + this.displayDelay + '}';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i, long j6, K4.a time) {
        this(time);
        kotlin.jvm.internal.h.e(time, "time");
        this.displayQuantity = i;
        this.lastDisplayTime = j6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(JSONObject json, K4.a time) {
        this(time);
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.e(time, "time");
        this.isRedisplayEnabled = true;
        Object obj = json.get(DISPLAY_LIMIT);
        Object obj2 = json.get(DISPLAY_DELAY);
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
