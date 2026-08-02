package ru.yandex.taxi.scooters.experiments;

import defpackage.d6n0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jrl0;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersCardV2;", "", "Companion", "a", "ChargeConfig", "ru/yandex/taxi/scooters/experiments/h", "d6n0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScootersCardV2 {
    public static final d6n0 Companion = new d6n0();
    public final a a;
    public final ChargeConfig b;

    public ScootersCardV2(int i, a aVar, ChargeConfig chargeConfig) {
        if ((i & 1) == 0) {
            a.Companion.getClass();
            aVar = a.c;
        }
        this.a = aVar;
        if ((i & 2) != 0) {
            this.b = chargeConfig;
        } else {
            ChargeConfig.Companion.getClass();
            this.b = ChargeConfig.e;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;", "", "Companion", "ru/yandex/taxi/scooters/experiments/j", "ru/yandex/taxi/scooters/experiments/i", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final j Companion = new j();
        public static final a c = new a(0);
        public final int a;
        public final int b;

        public /* synthetic */ a(int i, int i2, int i3) {
            this.a = (i & 1) == 0 ? 5 : i2;
            if ((i & 2) == 0) {
                this.b = 30;
            } else {
                this.b = i3;
            }
        }

        public a(int i) {
            this.a = 5;
            this.b = 30;
        }

        public a() {
            this(0);
        }
    }

    public ScootersCardV2() {
        this(0);
    }

    public ScootersCardV2(int i) {
        a.Companion.getClass();
        ChargeConfig.Companion.getClass();
        ChargeConfig chargeConfig = ChargeConfig.e;
        this.a = a.c;
        this.b = chargeConfig;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;", "", "Companion", "ru/yandex/taxi/scooters/experiments/t", "ValueOption", "ru/yandex/taxi/scooters/experiments/u", "ru/yandex/taxi/scooters/experiments/k", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChargeConfig {
        public static final u Companion = new u();
        public static final i3y[] d;
        public static final ChargeConfig e;
        public final t a;
        public final jsq0 b;
        public final ValueOption c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig$ValueOption;", "", "Companion", "ru/yandex/taxi/scooters/experiments/v", JCP.RAW_PREFIX, "TIME", "PERCENTS", "DISTANCE", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ValueOption {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ ValueOption[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final v Companion;
            public static final ValueOption DISTANCE;
            public static final ValueOption NONE;
            public static final ValueOption PERCENTS;
            public static final ValueOption TIME;

            static {
                ValueOption valueOption = new ValueOption(JCP.RAW_PREFIX, 0);
                NONE = valueOption;
                ValueOption valueOption2 = new ValueOption("TIME", 1);
                TIME = valueOption2;
                ValueOption valueOption3 = new ValueOption("PERCENTS", 2);
                PERCENTS = valueOption3;
                ValueOption valueOption4 = new ValueOption("DISTANCE", 3);
                DISTANCE = valueOption4;
                ValueOption[] valueOptionArr = {valueOption, valueOption2, valueOption3, valueOption4};
                $VALUES = valueOptionArr;
                $ENTRIES = kotlin.enums.a.a(valueOptionArr);
                Companion = new v();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(11));
            }

            public static ValueOption valueOf(String str) {
                return (ValueOption) Enum.valueOf(ValueOption.class, str);
            }

            public static ValueOption[] values() {
                return (ValueOption[]) $VALUES.clone();
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new jrl0(7)), kotlin.a.b(lazyThreadSafetyMode, new jrl0(8))};
            e = new ChargeConfig(0);
        }

        public /* synthetic */ ChargeConfig(int i, t tVar, jsq0 jsq0Var, ValueOption valueOption) {
            this.a = (i & 1) == 0 ? new p(0) : tVar;
            if ((i & 2) == 0) {
                this.b = ksq0.a;
            } else {
                this.b = jsq0Var;
            }
            if ((i & 4) == 0) {
                this.c = ValueOption.NONE;
            } else {
                this.c = valueOption;
            }
        }

        public ChargeConfig() {
            this(0);
        }

        public ChargeConfig(int i) {
            p pVar = new p(0);
            jsq0 jsq0Var = ksq0.a;
            ValueOption valueOption = ValueOption.NONE;
            this.a = pVar;
            this.b = jsq0Var;
            this.c = valueOption;
        }
    }
}
