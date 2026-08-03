package com.onesignal.user.internal.properties;

import com.onesignal.common.modeling.h;
import com.onesignal.common.modeling.i;
import java.util.Iterator;
import org.json.JSONObject;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends i {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.user.internal.properties.a$a, reason: collision with other inner class name */
    public static final class C0069a extends k implements oc.a {
        public static final C0069a INSTANCE = new C0069a();

        public C0069a() {
            super(0);
        }

        @Override // oc.a
        public final String invoke() {
            return "US";
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements oc.a {
        public b() {
            super(0);
        }

        @Override // oc.a
        public final h invoke() {
            return new h(a.this, "tags");
        }
    }

    public a() {
        super(null, null, 3, null);
    }

    @Override // com.onesignal.common.modeling.i
    public i createModelForProperty(String str, JSONObject jSONObject) {
        j.e(str, "property");
        j.e(jSONObject, "jsonObject");
        if (!str.equals("tags")) {
            return null;
        }
        h hVar = new h(this, "tags");
        Iterator<String> keys = jSONObject.keys();
        j.d(keys, "jsonObject.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            j.d(next, "key");
            String string = jSONObject.getString(next);
            j.d(string, "jsonObject.getString(key)");
            i.setStringProperty$default(hVar, next, string, null, false, 12, null);
        }
        return hVar;
    }

    public final String getCountry() {
        return getStringProperty("country", C0069a.INSTANCE);
    }

    public final String getLanguage() {
        return i.getOptStringProperty$default(this, "language", null, 2, null);
    }

    public final Float getLocationAccuracy() {
        return i.getOptFloatProperty$default(this, "locationAccuracy", null, 2, null);
    }

    public final Boolean getLocationBackground() {
        return i.getOptBooleanProperty$default(this, "locationBackground", null, 2, null);
    }

    public final Double getLocationLatitude() {
        return i.getOptDoubleProperty$default(this, "locationLatitude", null, 2, null);
    }

    public final Double getLocationLongitude() {
        return i.getOptDoubleProperty$default(this, "locationLongitude", null, 2, null);
    }

    public final Long getLocationTimestamp() {
        return i.getOptLongProperty$default(this, "locationTimestamp", null, 2, null);
    }

    public final Integer getLocationType() {
        return i.getOptIntProperty$default(this, "locationType", null, 2, null);
    }

    public final String getOnesignalId() {
        return i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final h getTags() {
        return getMapModelProperty("tags", new b());
    }

    public final String getTimezone() {
        return i.getOptStringProperty$default(this, "timezone", null, 2, null);
    }

    public final void setCountry(String str) {
        j.e(str, "value");
        i.setStringProperty$default(this, "country", str, null, false, 12, null);
    }

    public final void setLanguage(String str) {
        i.setOptStringProperty$default(this, "language", str, null, false, 12, null);
    }

    public final void setLocationAccuracy(Float f10) {
        i.setOptFloatProperty$default(this, "locationAccuracy", f10, null, false, 12, null);
    }

    public final void setLocationBackground(Boolean bool) {
        i.setOptBooleanProperty$default(this, "locationBackground", bool, null, false, 12, null);
    }

    public final void setLocationLatitude(Double d10) {
        i.setOptDoubleProperty$default(this, "locationLatitude", d10, null, false, 12, null);
    }

    public final void setLocationLongitude(Double d10) {
        i.setOptDoubleProperty$default(this, "locationLongitude", d10, null, false, 12, null);
    }

    public final void setLocationTimestamp(Long l10) {
        i.setOptLongProperty$default(this, "locationTimestamp", l10, null, false, 12, null);
    }

    public final void setLocationType(Integer num) {
        i.setOptIntProperty$default(this, "locationType", num, null, false, 12, null);
    }

    public final void setOnesignalId(String str) {
        j.e(str, "value");
        i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final void setTimezone(String str) {
        i.setOptStringProperty$default(this, "timezone", str, null, false, 12, null);
    }
}
