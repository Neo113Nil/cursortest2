package Q5;

import java.util.Map;

/* loaded from: classes2.dex */
public final class f {
    private final String country;
    private final String language;
    private final Double latitude;
    private final Double longitude;
    private final Map<String, String> tags;
    private final String timezoneId;

    public f() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String getCountry() {
        return this.country;
    }

    public final boolean getHasAtLeastOnePropertySet() {
        return (this.tags == null && this.language == null && this.timezoneId == null && this.country == null && this.latitude == null && this.longitude == null) ? false : true;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final String getTimezoneId() {
        return this.timezoneId;
    }

    public f(Map<String, String> map, String str, String str2, String str3, Double d2, Double d9) {
        this.tags = map;
        this.language = str;
        this.timezoneId = str2;
        this.country = str3;
        this.latitude = d2;
        this.longitude = d9;
    }

    public /* synthetic */ f(Map map, String str, String str2, String str3, Double d2, Double d9, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? null : d9);
    }
}
