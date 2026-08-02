package ru.yandex.taxi.main.map.autoupdatelocationthrottle;

import defpackage.a34;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nzs;
import defpackage.oo31;
import defpackage.q03;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vn11;
import defpackage.x4e;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/main/map/autoupdatelocationthrottle/AutoUpdateUserLocationStrategyExperiment;", "Lvn11;", "Companion", "AutoUpdateUserLocationStrategyType", "a34", "ru/yandex/taxi/main/map/autoupdatelocationthrottle/a", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AutoUpdateUserLocationStrategyExperiment implements vn11 {
    public static final a34 Companion = new a34();
    public static final i3y[] u;
    public static final AutoUpdateUserLocationStrategyExperiment v;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final double i;
    public final long j;
    public final long k;
    public final Integer l;
    public final boolean m;
    public final AutoUpdateUserLocationStrategyType n;
    public final AutoUpdateUserLocationStrategyType o;
    public final Long p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/main/map/autoupdatelocationthrottle/AutoUpdateUserLocationStrategyExperiment$AutoUpdateUserLocationStrategyType;", "", "Companion", "ru/yandex/taxi/main/map/autoupdatelocationthrottle/b", "THROTTLE_STRATEGY", "TIME_INTERVAL_STRATEGY", "WARMUP_COOLDOWN_STRATEGY", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AutoUpdateUserLocationStrategyType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AutoUpdateUserLocationStrategyType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final AutoUpdateUserLocationStrategyType THROTTLE_STRATEGY;
        public static final AutoUpdateUserLocationStrategyType TIME_INTERVAL_STRATEGY;
        public static final AutoUpdateUserLocationStrategyType WARMUP_COOLDOWN_STRATEGY;

        static {
            AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType = new AutoUpdateUserLocationStrategyType("THROTTLE_STRATEGY", 0);
            THROTTLE_STRATEGY = autoUpdateUserLocationStrategyType;
            AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType2 = new AutoUpdateUserLocationStrategyType("TIME_INTERVAL_STRATEGY", 1);
            TIME_INTERVAL_STRATEGY = autoUpdateUserLocationStrategyType2;
            AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType3 = new AutoUpdateUserLocationStrategyType("WARMUP_COOLDOWN_STRATEGY", 2);
            WARMUP_COOLDOWN_STRATEGY = autoUpdateUserLocationStrategyType3;
            AutoUpdateUserLocationStrategyType[] autoUpdateUserLocationStrategyTypeArr = {autoUpdateUserLocationStrategyType, autoUpdateUserLocationStrategyType2, autoUpdateUserLocationStrategyType3};
            $VALUES = autoUpdateUserLocationStrategyTypeArr;
            $ENTRIES = kotlin.enums.a.a(autoUpdateUserLocationStrategyTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(10));
        }

        public static AutoUpdateUserLocationStrategyType valueOf(String str) {
            return (AutoUpdateUserLocationStrategyType) Enum.valueOf(AutoUpdateUserLocationStrategyType.class, str);
        }

        public static AutoUpdateUserLocationStrategyType[] values() {
            return (AutoUpdateUserLocationStrategyType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new i3y[]{null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new q03(8)), kotlin.a.b(lazyThreadSafetyMode, new q03(9)), null, null, null, null, null};
        v = new AutoUpdateUserLocationStrategyExperiment(0);
    }

    public /* synthetic */ AutoUpdateUserLocationStrategyExperiment(int i, boolean z, long j, long j2, long j3, long j4, long j5, boolean z2, double d, long j6, long j7, Integer num, boolean z3, AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType, AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType2, Long l, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
        if ((i & 4) == 0) {
            this.d = 0L;
        } else {
            this.d = j2;
        }
        if ((i & 8) == 0) {
            this.e = 0L;
        } else {
            this.e = j3;
        }
        if ((i & 16) == 0) {
            this.f = 0L;
        } else {
            this.f = j4;
        }
        if ((i & 32) == 0) {
            this.g = 0L;
        } else {
            this.g = j5;
        }
        if ((i & 64) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        this.i = (i & 128) == 0 ? 0.0d : d;
        if ((i & 256) == 0) {
            this.j = 0L;
        } else {
            this.j = j6;
        }
        if ((i & 512) == 0) {
            this.k = 0L;
        } else {
            this.k = j7;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = num;
        }
        if ((i & 2048) == 0) {
            this.m = false;
        } else {
            this.m = z3;
        }
        this.n = (i & 4096) == 0 ? AutoUpdateUserLocationStrategyType.THROTTLE_STRATEGY : autoUpdateUserLocationStrategyType;
        this.o = (i & 8192) == 0 ? AutoUpdateUserLocationStrategyType.TIME_INTERVAL_STRATEGY : autoUpdateUserLocationStrategyType2;
        if ((i & 16384) == 0) {
            this.p = null;
        } else {
            this.p = l;
        }
        if ((32768 & i) == 0) {
            this.q = null;
        } else {
            this.q = num2;
        }
        if ((65536 & i) == 0) {
            this.r = null;
        } else {
            this.r = num3;
        }
        if ((131072 & i) == 0) {
            this.s = null;
        } else {
            this.s = num4;
        }
        if ((i & 262144) == 0) {
            this.t = null;
        } else {
            this.t = num5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoUpdateUserLocationStrategyExperiment)) {
            return false;
        }
        AutoUpdateUserLocationStrategyExperiment autoUpdateUserLocationStrategyExperiment = (AutoUpdateUserLocationStrategyExperiment) obj;
        return this.b == autoUpdateUserLocationStrategyExperiment.b && this.c == autoUpdateUserLocationStrategyExperiment.c && this.d == autoUpdateUserLocationStrategyExperiment.d && this.e == autoUpdateUserLocationStrategyExperiment.e && this.f == autoUpdateUserLocationStrategyExperiment.f && this.g == autoUpdateUserLocationStrategyExperiment.g && this.h == autoUpdateUserLocationStrategyExperiment.h && Double.compare(this.i, autoUpdateUserLocationStrategyExperiment.i) == 0 && this.j == autoUpdateUserLocationStrategyExperiment.j && this.k == autoUpdateUserLocationStrategyExperiment.k && jl40.l(this.l, autoUpdateUserLocationStrategyExperiment.l) && this.m == autoUpdateUserLocationStrategyExperiment.m && this.n == autoUpdateUserLocationStrategyExperiment.n && this.o == autoUpdateUserLocationStrategyExperiment.o && jl40.l(this.p, autoUpdateUserLocationStrategyExperiment.p) && jl40.l(this.q, autoUpdateUserLocationStrategyExperiment.q) && jl40.l(this.r, autoUpdateUserLocationStrategyExperiment.r) && jl40.l(this.s, autoUpdateUserLocationStrategyExperiment.s) && jl40.l(this.t, autoUpdateUserLocationStrategyExperiment.t);
    }

    public final int hashCode() {
        int c = qv10.c(qv10.c(unr0.a(unr0.e(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Integer num = this.l;
        int hashCode = (this.o.hashCode() + ((this.n.hashCode() + unr0.e((c + (num == null ? 0 : num.hashCode())) * 31, 31, this.m)) * 31)) * 31;
        Long l = this.p;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.q;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.r;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.s;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.t;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoUpdateUserLocationStrategyExperiment(enabled=");
        sb.append(this.b);
        sb.append(", locationUpdateDebounceMillis=");
        sb.append(this.c);
        x4e.A(this.d, ", lowSpeedTimeThresholdMillis=", ", highSpeedTimeThresholdMillis=", sb);
        sb.append(this.e);
        x4e.A(this.f, ", lowSpeedCountThreshold=", ", highSpeedCountThreshold=", sb);
        sb.append(this.g);
        sb.append(", enableUpdateWhenSuggestOpen=");
        sb.append(this.h);
        nzs.o(sb, ", highSpeedLimitMetersPerSecond=", this.i, ", timeDelayForTaxiMainSec=");
        sb.append(this.j);
        x4e.A(this.k, ", minDistanceUpdateForTaxiMainMeters=", ", maxDistanceThresholdMeters=", sb);
        sb.append(this.l);
        sb.append(", isCommonThrottle=");
        sb.append(this.m);
        sb.append(", mainScreenStrategy=");
        sb.append(this.n);
        sb.append(", taxiMainStrategy=");
        sb.append(this.o);
        sb.append(", warmupWindowMs=");
        sb.append(this.p);
        sb.append(", silentResetMs=");
        sb.append(this.q);
        sb.append(", discoJumpThresholdMeters=");
        sb.append(this.r);
        sb.append(", discoJumpCountThreshold=");
        sb.append(this.s);
        sb.append(", discoWindowMs=");
        return oo31.j(sb, this.t, Extension.C_BRAKE);
    }

    public AutoUpdateUserLocationStrategyExperiment() {
        this(0);
    }

    public AutoUpdateUserLocationStrategyExperiment(int i) {
        AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType = AutoUpdateUserLocationStrategyType.THROTTLE_STRATEGY;
        AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType2 = AutoUpdateUserLocationStrategyType.TIME_INTERVAL_STRATEGY;
        this.b = false;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = false;
        this.i = 0.0d;
        this.j = 0L;
        this.k = 0L;
        this.l = null;
        this.m = false;
        this.n = autoUpdateUserLocationStrategyType;
        this.o = autoUpdateUserLocationStrategyType2;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
    }
}
