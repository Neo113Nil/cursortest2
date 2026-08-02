package io.appmetrica.analytics.push.model;

import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.coreutils.internal.utils.JsonUtils;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes4.dex */
public class Filters {
    private final Integer a;
    private final Integer b;
    private final String c;
    private final Integer d;
    private final Coordinates e;
    private final Long f;
    private final Integer g;
    private final Boolean h;
    private final Integer i;
    private final Integer j;
    private final Integer k;
    private final Integer l;
    private final String m;

    public Filters(JSONObject jSONObject) {
        this.a = JsonUtils.extractIntegerSafely(jSONObject, "d");
        this.b = JsonUtils.extractIntegerSafely(jSONObject, "p");
        this.c = JsonUtils.extractStringSafely(jSONObject, "u");
        this.d = JsonUtils.extractIntegerSafely(jSONObject, RemoteBioParameters.X);
        this.e = a(jSONObject);
        this.f = JsonUtils.extractLongSafely(jSONObject, "r");
        this.g = JsonUtils.extractIntegerSafely(jSONObject, "a");
        this.h = JsonUtils.extractBooleanSafely(jSONObject, "m");
        this.i = JsonUtils.extractIntegerSafely(jSONObject, "v");
        this.j = JsonUtils.extractIntegerSafely(jSONObject, "W");
        this.k = JsonUtils.extractIntegerSafely(jSONObject, "s");
        this.l = JsonUtils.extractIntegerSafely(jSONObject, "t");
        this.m = JsonUtils.extractStringSafely(jSONObject, CoreConstants.PushMessage.SERVICE_TYPE);
    }

    private static Coordinates a(JSONObject jSONObject) {
        if (!jSONObject.has("c")) {
            return null;
        }
        try {
            return new Coordinates(jSONObject.getJSONObject("c"));
        } catch (JSONException e) {
            PublicLogger.INSTANCE.error(e, "Error parsing coordinates", new Object[0]);
            TrackersHub.getInstance().reportError("Error parsing coordinates", e);
            return null;
        }
    }

    public String getContentId() {
        return this.m;
    }

    public Coordinates getCoordinates() {
        return this.e;
    }

    public Integer getLoginFilterType() {
        return this.d;
    }

    public Integer getMaxAndroidApiLevel() {
        return this.l;
    }

    public Integer getMaxPushPerDay() {
        return this.a;
    }

    public Integer getMaxVersionCode() {
        return this.j;
    }

    public Integer getMinAccuracy() {
        return this.g;
    }

    public Integer getMinAndroidApiLevel() {
        return this.k;
    }

    public Long getMinRecency() {
        return this.f;
    }

    public Integer getMinVersionCode() {
        return this.i;
    }

    public Integer getOnePushPerPeriodMinutes() {
        return this.b;
    }

    public Boolean getPassiveLocation() {
        return this.h;
    }

    public String getPassportUid() {
        return this.c;
    }
}
