package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630o4 implements ArgumentsMerger {

    /* renamed from: a, reason: collision with root package name */
    public final String f6644a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f6645b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f6646c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f6647d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f6648e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f6649f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f6650g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f6651h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f6652i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, String> f6653j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f6654k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f6655l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f6656m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f6657n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<String> f6658o;

    public C0630o4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f6644a = str;
        this.f6645b = bool;
        this.f6646c = location;
        this.f6647d = bool2;
        this.f6648e = num;
        this.f6649f = num2;
        this.f6650g = num3;
        this.f6651h = bool3;
        this.f6652i = bool4;
        this.f6653j = map;
        this.f6654k = num4;
        this.f6655l = bool5;
        this.f6656m = bool6;
        this.f6657n = bool7;
        this.f6658o = set;
    }

    public final boolean a(C0630o4 c0630o4) {
        return equals(c0630o4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0630o4 mergeFrom(C0630o4 c0630o4) {
        return new C0630o4((String) WrapUtils.getOrDefaultNullable(this.f6644a, c0630o4.f6644a), (Boolean) WrapUtils.getOrDefaultNullable(this.f6645b, c0630o4.f6645b), (Location) WrapUtils.getOrDefaultNullable(this.f6646c, c0630o4.f6646c), (Boolean) WrapUtils.getOrDefaultNullable(this.f6647d, c0630o4.f6647d), (Integer) WrapUtils.getOrDefaultNullable(this.f6648e, c0630o4.f6648e), (Integer) WrapUtils.getOrDefaultNullable(this.f6649f, c0630o4.f6649f), (Integer) WrapUtils.getOrDefaultNullable(this.f6650g, c0630o4.f6650g), (Boolean) WrapUtils.getOrDefaultNullable(this.f6651h, c0630o4.f6651h), (Boolean) WrapUtils.getOrDefaultNullable(this.f6652i, c0630o4.f6652i), (Map) WrapUtils.getOrDefaultNullable(this.f6653j, c0630o4.f6653j), (Integer) WrapUtils.getOrDefaultNullable(this.f6654k, c0630o4.f6654k), (Boolean) WrapUtils.getOrDefaultNullable(this.f6655l, c0630o4.f6655l), (Boolean) WrapUtils.getOrDefaultNullable(this.f6656m, c0630o4.f6656m), (Boolean) WrapUtils.getOrDefaultNullable(this.f6657n, c0630o4.f6657n), CollectionUtils.merge(this.f6658o, c0630o4.f6658o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((C0630o4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj == null || C0630o4.class != obj.getClass()) {
            return false;
        }
        C0630o4 c0630o4 = (C0630o4) obj;
        return Objects.equals(this.f6644a, c0630o4.f6644a) && Objects.equals(this.f6645b, c0630o4.f6645b) && Objects.equals(this.f6646c, c0630o4.f6646c) && Objects.equals(this.f6647d, c0630o4.f6647d) && Objects.equals(this.f6648e, c0630o4.f6648e) && Objects.equals(this.f6649f, c0630o4.f6649f) && Objects.equals(this.f6650g, c0630o4.f6650g) && Objects.equals(this.f6651h, c0630o4.f6651h) && Objects.equals(this.f6652i, c0630o4.f6652i) && Objects.equals(this.f6653j, c0630o4.f6653j) && Objects.equals(this.f6654k, c0630o4.f6654k) && Objects.equals(this.f6655l, c0630o4.f6655l) && Objects.equals(this.f6656m, c0630o4.f6656m) && Objects.equals(this.f6657n, c0630o4.f6657n) && Objects.equals(this.f6658o, c0630o4.f6658o);
    }

    public final int hashCode() {
        return Objects.hash(this.f6644a, this.f6645b, this.f6646c, this.f6647d, this.f6648e, this.f6649f, this.f6650g, this.f6651h, this.f6652i, this.f6653j, this.f6654k, this.f6655l, this.f6656m, this.f6657n, this.f6658o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f6644a + "', locationTracking=" + this.f6645b + ", manualLocation=" + this.f6646c + ", firstActivationAsUpdate=" + this.f6647d + ", sessionTimeout=" + this.f6648e + ", maxReportsCount=" + this.f6649f + ", dispatchPeriod=" + this.f6650g + ", logEnabled=" + this.f6651h + ", dataSendingEnabled=" + this.f6652i + ", clidsFromClient=" + this.f6653j + ", maxReportsInDbCount=" + this.f6654k + ", nativeCrashesEnabled=" + this.f6655l + ", revenueAutoTrackingEnabled=" + this.f6656m + ", advIdentifiersTrackingEnabled=" + this.f6657n + ", autoCollectedDataSubscribers=" + this.f6658o + '}';
    }

    public C0630o4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C0630o4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
