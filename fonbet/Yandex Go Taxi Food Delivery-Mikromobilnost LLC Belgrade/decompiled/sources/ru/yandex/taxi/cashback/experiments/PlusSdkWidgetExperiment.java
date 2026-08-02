package ru.yandex.taxi.cashback.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mlc0;
import defpackage.nld0;
import defpackage.w96;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/cashback/experiments/PlusSdkWidgetExperiment;", "Lw96;", "Companion", "PlaqueType", "nld0", "ru/yandex/taxi/cashback/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PlusSdkWidgetExperiment extends w96 {
    public static final nld0 Companion = new nld0();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mlc0(16))};
    public static final PlusSdkWidgetExperiment e = new PlusSdkWidgetExperiment(PlaqueType.UNIVERSAL_PLAQUE);
    public final boolean b;
    public final PlaqueType c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/cashback/experiments/PlusSdkWidgetExperiment$PlaqueType;", "", "Companion", "ru/yandex/taxi/cashback/experiments/b", "UNIVERSAL_PLAQUE", "PLUS_SDK_PLAQUE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PlaqueType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PlaqueType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final PlaqueType PLUS_SDK_PLAQUE;
        public static final PlaqueType UNIVERSAL_PLAQUE;

        static {
            PlaqueType plaqueType = new PlaqueType("UNIVERSAL_PLAQUE", 0);
            UNIVERSAL_PLAQUE = plaqueType;
            PlaqueType plaqueType2 = new PlaqueType("PLUS_SDK_PLAQUE", 1);
            PLUS_SDK_PLAQUE = plaqueType2;
            PlaqueType[] plaqueTypeArr = {plaqueType, plaqueType2};
            $VALUES = plaqueTypeArr;
            $ENTRIES = kotlin.enums.a.a(plaqueTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mlc0(17));
        }

        public static PlaqueType valueOf(String str) {
            return (PlaqueType) Enum.valueOf(PlaqueType.class, str);
        }

        public static PlaqueType[] values() {
            return (PlaqueType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PlusSdkWidgetExperiment(int i, boolean z, PlaqueType plaqueType) {
        this.b = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.c = PlaqueType.UNIVERSAL_PLAQUE;
        } else {
            this.c = plaqueType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlusSdkWidgetExperiment)) {
            return false;
        }
        PlusSdkWidgetExperiment plusSdkWidgetExperiment = (PlusSdkWidgetExperiment) obj;
        return this.b == plusSdkWidgetExperiment.b && this.c == plusSdkWidgetExperiment.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "PlusSdkWidgetExperiment(enabled=" + this.b + ", plaqueType=" + this.c + Extension.C_BRAKE;
    }

    public PlusSdkWidgetExperiment(PlaqueType plaqueType) {
        this.b = true;
        this.c = plaqueType;
    }

    public PlusSdkWidgetExperiment() {
        this(PlaqueType.UNIVERSAL_PLAQUE);
    }
}
