package ru.yandex.taxi.address.experiment;

import defpackage.a760;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j660;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/address/experiment/NextButtonShowStrategy;", "", "Companion", "a760", JCP.RAW_PREFIX, "WHEN_HAS_DESTINATION", "ALWAYS", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NextButtonShowStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NextButtonShowStrategy[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final NextButtonShowStrategy ALWAYS;
    public static final a760 Companion;
    public static final NextButtonShowStrategy NONE;
    public static final NextButtonShowStrategy WHEN_HAS_DESTINATION;

    static {
        NextButtonShowStrategy nextButtonShowStrategy = new NextButtonShowStrategy(JCP.RAW_PREFIX, 0);
        NONE = nextButtonShowStrategy;
        NextButtonShowStrategy nextButtonShowStrategy2 = new NextButtonShowStrategy("WHEN_HAS_DESTINATION", 1);
        WHEN_HAS_DESTINATION = nextButtonShowStrategy2;
        NextButtonShowStrategy nextButtonShowStrategy3 = new NextButtonShowStrategy("ALWAYS", 2);
        ALWAYS = nextButtonShowStrategy3;
        NextButtonShowStrategy[] nextButtonShowStrategyArr = {nextButtonShowStrategy, nextButtonShowStrategy2, nextButtonShowStrategy3};
        $VALUES = nextButtonShowStrategyArr;
        $ENTRIES = kotlin.enums.a.a(nextButtonShowStrategyArr);
        Companion = new a760();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j660(13));
    }

    public static NextButtonShowStrategy valueOf(String str) {
        return (NextButtonShowStrategy) Enum.valueOf(NextButtonShowStrategy.class, str);
    }

    public static NextButtonShowStrategy[] values() {
        return (NextButtonShowStrategy[]) $VALUES.clone();
    }
}
