package ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j5o0;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.w96;
import defpackage.zqn0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/v2/data/model/ScootersOnboardingOnActiveRideExperiment;", "Lw96;", "Companion", "Status", "a", "j5o0", "i5o0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScootersOnboardingOnActiveRideExperiment extends w96 {
    public static final j5o0 Companion = new j5o0();
    public static final i3y[] h;
    public static final ScootersOnboardingOnActiveRideExperiment i;
    public final boolean b;
    public final long c;
    public final jsq0 d;
    public final boolean e;
    public final String f;
    public final List g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/v2/data/model/ScootersOnboardingOnActiveRideExperiment$Status;", "", "Companion", "ru/yandex/taxi/scooters/presentation/detailed_order/v2/data/model/c", "RESERVATION", "RIDING", "PARKING", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final Status PARKING;
        public static final Status RESERVATION;
        public static final Status RIDING;

        static {
            Status status = new Status("RESERVATION", 0);
            RESERVATION = status;
            Status status2 = new Status("RIDING", 1);
            RIDING = status2;
            Status status3 = new Status("PARKING", 2);
            PARKING = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = kotlin.enums.a.a(statusArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(17));
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new zqn0(15)), null, null, kotlin.a.b(lazyThreadSafetyMode, new zqn0(16))};
        i = new ScootersOnboardingOnActiveRideExperiment(0);
    }

    public /* synthetic */ ScootersOnboardingOnActiveRideExperiment(int i2, boolean z, long j, jsq0 jsq0Var, boolean z2, String str, List list) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        } else {
            this.c = j;
        }
        if ((i2 & 4) == 0) {
            this.d = ksq0.a;
        } else {
            this.d = jsq0Var;
        }
        if ((i2 & 8) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str;
        }
        if ((i2 & 32) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/v2/data/model/ScootersOnboardingOnActiveRideExperiment$a;", "", "Companion", "ru/yandex/taxi/scooters/presentation/detailed_order/v2/data/model/a", "ru/yandex/taxi/scooters/presentation/detailed_order/v2/data/model/b", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public a() {
            this.a = "";
            this.b = "";
        }
    }

    public ScootersOnboardingOnActiveRideExperiment() {
        this(0);
    }

    public ScootersOnboardingOnActiveRideExperiment(int i2) {
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.d = jsq0Var;
        this.e = false;
        this.f = "";
        this.g = EmptyList.a;
    }
}
