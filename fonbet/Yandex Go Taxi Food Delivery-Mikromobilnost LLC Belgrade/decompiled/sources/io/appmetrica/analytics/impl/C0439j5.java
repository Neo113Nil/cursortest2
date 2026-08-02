package io.appmetrica.analytics.impl;

import android.location.Location;
import defpackage.qv10;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0439j5 implements ArgumentsMerger {
    public final String a;
    public final Boolean b;
    public final Location c;
    public final Boolean d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Boolean h;
    public final Boolean i;
    public final Map<String, String> j;
    public final Integer k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final Set<String> o;

    public C0439j5(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public final boolean a(C0439j5 c0439j5) {
        return equals(c0439j5);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0439j5 mergeFrom(C0439j5 c0439j5) {
        return new C0439j5((String) WrapUtils.getOrDefaultNullable(this.a, c0439j5.a), (Boolean) WrapUtils.getOrDefaultNullable(this.b, c0439j5.b), (Location) WrapUtils.getOrDefaultNullable(this.c, c0439j5.c), (Boolean) WrapUtils.getOrDefaultNullable(this.d, c0439j5.d), (Integer) WrapUtils.getOrDefaultNullable(this.e, c0439j5.e), (Integer) WrapUtils.getOrDefaultNullable(this.f, c0439j5.f), (Integer) WrapUtils.getOrDefaultNullable(this.g, c0439j5.g), (Boolean) WrapUtils.getOrDefaultNullable(this.h, c0439j5.h), (Boolean) WrapUtils.getOrDefaultNullable(this.i, c0439j5.i), (Map) WrapUtils.getOrDefaultNullable(this.j, c0439j5.j), (Integer) WrapUtils.getOrDefaultNullable(this.k, c0439j5.k), (Boolean) WrapUtils.getOrDefaultNullable(this.l, c0439j5.l), (Boolean) WrapUtils.getOrDefaultNullable(this.m, c0439j5.m), (Boolean) WrapUtils.getOrDefaultNullable(this.n, c0439j5.n), CollectionUtils.merge(this.o, c0439j5.o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((C0439j5) obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C0439j5.class == obj.getClass()) {
            C0439j5 c0439j5 = (C0439j5) obj;
            if (Objects.equals(this.a, c0439j5.a) && Objects.equals(this.b, c0439j5.b) && Objects.equals(this.c, c0439j5.c) && Objects.equals(this.d, c0439j5.d) && Objects.equals(this.e, c0439j5.e) && Objects.equals(this.f, c0439j5.f) && Objects.equals(this.g, c0439j5.g) && Objects.equals(this.h, c0439j5.h) && Objects.equals(this.i, c0439j5.i) && Objects.equals(this.j, c0439j5.j) && Objects.equals(this.k, c0439j5.k) && Objects.equals(this.l, c0439j5.l) && Objects.equals(this.m, c0439j5.m) && Objects.equals(this.n, c0439j5.n) && Objects.equals(this.o, c0439j5.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReporterArguments{apiKey='");
        sb.append(this.a);
        sb.append("', locationTracking=");
        sb.append(this.b);
        sb.append(", manualLocation=");
        sb.append(this.c);
        sb.append(", firstActivationAsUpdate=");
        sb.append(this.d);
        sb.append(", sessionTimeout=");
        sb.append(this.e);
        sb.append(", maxReportsCount=");
        sb.append(this.f);
        sb.append(", dispatchPeriod=");
        sb.append(this.g);
        sb.append(", logEnabled=");
        sb.append(this.h);
        sb.append(", dataSendingEnabled=");
        sb.append(this.i);
        sb.append(", clidsFromClient=");
        sb.append(this.j);
        sb.append(", maxReportsInDbCount=");
        sb.append(this.k);
        sb.append(", nativeCrashesEnabled=");
        sb.append(this.l);
        sb.append(", revenueAutoTrackingEnabled=");
        sb.append(this.m);
        sb.append(", advIdentifiersTrackingEnabled=");
        sb.append(this.n);
        sb.append(", autoCollectedDataSubscribers=");
        return qv10.s(sb, this.o, '}');
    }

    public C0439j5(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.a = str;
        this.b = bool;
        this.c = location;
        this.d = bool2;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = bool3;
        this.i = bool4;
        this.j = map;
        this.k = num4;
        this.l = bool5;
        this.m = bool6;
        this.n = bool7;
        this.o = set;
    }

    public C0439j5() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
