package ru.yandex.taxi.jobs.push;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pyy0;
import defpackage.w96;
import defpackage.wkz0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/jobs/push/ToggleJobsExperiment;", "Lw96;", "Companion", "a", "StateDto", "wkz0", "ru/yandex/taxi/jobs/push/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ToggleJobsExperiment extends w96 {
    public static final wkz0 Companion = new wkz0();
    public static final ToggleJobsExperiment f = new ToggleJobsExperiment(0);
    public final boolean b;
    public final a c;
    public final a d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/jobs/push/ToggleJobsExperiment$StateDto;", "", "Companion", "ru/yandex/taxi/jobs/push/d", "OFF", "SCHEDULE", "PERIODIC_SCHEDULE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class StateDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final StateDto OFF;
        public static final StateDto PERIODIC_SCHEDULE;
        public static final StateDto SCHEDULE;
        public static final StateDto UNKNOWN;

        static {
            StateDto stateDto = new StateDto("OFF", 0);
            OFF = stateDto;
            StateDto stateDto2 = new StateDto("SCHEDULE", 1);
            SCHEDULE = stateDto2;
            StateDto stateDto3 = new StateDto("PERIODIC_SCHEDULE", 2);
            PERIODIC_SCHEDULE = stateDto3;
            StateDto stateDto4 = new StateDto("UNKNOWN", 3);
            UNKNOWN = stateDto4;
            StateDto[] stateDtoArr = {stateDto, stateDto2, stateDto3, stateDto4};
            $VALUES = stateDtoArr;
            $ENTRIES = kotlin.enums.a.a(stateDtoArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(20));
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ToggleJobsExperiment(int i, boolean z, a aVar, a aVar2, String str) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = new a(0);
        } else {
            this.c = aVar;
        }
        if ((i & 4) == 0) {
            this.d = new a(0);
        } else {
            this.d = aVar2;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/jobs/push/ToggleJobsExperiment$a;", "", "Companion", "ru/yandex/taxi/jobs/push/b", "ru/yandex/taxi/jobs/push/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final c Companion = new c();
        public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(19)), null, null, null, null};
        public final StateDto a;
        public final Long b;
        public final Long c;
        public final Boolean d;
        public final Boolean e;

        public /* synthetic */ a(int i, StateDto stateDto, Long l, Long l2, Boolean bool, Boolean bool2) {
            this.a = (i & 1) == 0 ? StateDto.UNKNOWN : stateDto;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = l;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = l2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = bool;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = bool2;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            this.a = StateDto.UNKNOWN;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    public ToggleJobsExperiment() {
        this(0);
    }

    public ToggleJobsExperiment(int i) {
        a aVar = new a(0);
        a aVar2 = new a(0);
        this.b = false;
        this.c = aVar;
        this.d = aVar2;
        this.e = "";
    }
}
