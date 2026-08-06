package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC0572lo;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* loaded from: classes.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final BigDecimal f3419a;

        /* renamed from: b, reason: collision with root package name */
        private final Currency f3420b;

        /* renamed from: c, reason: collision with root package name */
        private AdType f3421c;

        /* renamed from: d, reason: collision with root package name */
        private String f3422d;

        /* renamed from: e, reason: collision with root package name */
        private String f3423e;

        /* renamed from: f, reason: collision with root package name */
        private String f3424f;

        /* renamed from: g, reason: collision with root package name */
        private String f3425g;

        /* renamed from: h, reason: collision with root package name */
        private String f3426h;

        /* renamed from: i, reason: collision with root package name */
        private String f3427i;

        /* renamed from: j, reason: collision with root package name */
        private Map f3428j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i2) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f3419a, this.f3420b, this.f3421c, this.f3422d, this.f3423e, this.f3424f, this.f3425g, this.f3426h, this.f3427i, this.f3428j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f3422d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f3425g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f3426h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f3421c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f3423e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f3424f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f3428j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.f3427i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f3419a = bigDecimal;
            this.f3420b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i2) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(BigDecimal bigDecimal, Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j2, Currency currency) {
        return new Builder(AbstractC0572lo.a(j2), currency, 0);
    }

    public static Builder newBuilder(double d2, Currency currency) {
        return new Builder(new BigDecimal(AbstractC0572lo.a(d2)), currency, 0);
    }
}
