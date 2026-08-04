package com.gamericefishpro.space.hh;

import com.appsflyer.AdRevenueScheme;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fc.h;
import com.gamericefishpro.space.fc.i;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: com.gamericefishpro.space.hh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0020a extends l implements Function0 {
        public static final C0020a INSTANCE = new C0020a();

        public C0020a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "US";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            return new h(a.this, "tags");
        }
    }

    public a() {
        super(null, null, 3, null);
    }

    @Override // com.gamericefishpro.space.fc.i
    public i createModelForProperty(String property, JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (!Intrinsics.a(property, "tags")) {
            return null;
        }
        h hVar = new h(this, "tags");
        Iterator<String> itKeys = jsonObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.b(next);
            String string = jsonObject.getString(next);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            i.setStringProperty$default(hVar, next, string, null, false, 12, null);
        }
        return hVar;
    }

    public final String getCountry() {
        return getStringProperty(AdRevenueScheme.COUNTRY, C0020a.INSTANCE);
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

    public final void setCountry(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, AdRevenueScheme.COUNTRY, value, null, false, 12, null);
    }

    public final void setLanguage(String str) {
        i.setOptStringProperty$default(this, "language", str, null, false, 12, null);
    }

    public final void setLocationAccuracy(Float f) {
        i.setOptFloatProperty$default(this, "locationAccuracy", f, null, false, 12, null);
    }

    public final void setLocationBackground(Boolean bool) {
        i.setOptBooleanProperty$default(this, "locationBackground", bool, null, false, 12, null);
    }

    public final void setLocationLatitude(Double d) {
        i.setOptDoubleProperty$default(this, "locationLatitude", d, null, false, 12, null);
    }

    public final void setLocationLongitude(Double d) {
        i.setOptDoubleProperty$default(this, "locationLongitude", d, null, false, 12, null);
    }

    public final void setLocationTimestamp(Long l) {
        i.setOptLongProperty$default(this, "locationTimestamp", l, null, false, 12, null);
    }

    public final void setLocationType(Integer num) {
        i.setOptIntProperty$default(this, "locationType", num, null, false, 12, null);
    }

    public final void setOnesignalId(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "onesignalId", value, null, false, 12, null);
    }

    public final void setTimezone(String str) {
        i.setOptStringProperty$default(this, "timezone", str, null, false, 12, null);
    }
}
