package ru.yandex.taxi.locationsdk.core.time;

import defpackage.ajc;
import defpackage.e3n;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.o430;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.time.DurationUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/locationsdk/core/time/TimestampSelector;", "Ljava/util/Comparator;", "Lajc;", "Lkotlin/Comparator;", "", "Monotonic", "Unix", "core2"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class TimestampSelector implements Comparator<ajc> {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimestampSelector[] $VALUES;
    public static final TimestampSelector Monotonic;
    public static final TimestampSelector Unix;

    static {
        TimestampSelector timestampSelector = new TimestampSelector() { // from class: ru.yandex.taxi.locationsdk.core.time.TimestampSelector.Monotonic
            @Override // ru.yandex.taxi.locationsdk.core.time.TimestampSelector
            public final long a(ajc ajcVar, ajc ajcVar2) {
                long j = ajcVar.a;
                long j2 = ajcVar2.a;
                o430 o430Var = e3n.b;
                return kp50.V(j - j2, DurationUnit.MILLISECONDS);
            }

            @Override // java.util.Comparator
            public final int compare(ajc ajcVar, ajc ajcVar2) {
                return jl40.r(ajcVar.a, ajcVar2.a);
            }
        };
        Monotonic = timestampSelector;
        TimestampSelector timestampSelector2 = new TimestampSelector() { // from class: ru.yandex.taxi.locationsdk.core.time.TimestampSelector.Unix
            @Override // ru.yandex.taxi.locationsdk.core.time.TimestampSelector
            public final long a(ajc ajcVar, ajc ajcVar2) {
                long j = ajcVar.b;
                long j2 = ajcVar2.b;
                o430 o430Var = e3n.b;
                return kp50.V(j - j2, DurationUnit.MILLISECONDS);
            }

            @Override // java.util.Comparator
            public final int compare(ajc ajcVar, ajc ajcVar2) {
                return jl40.r(ajcVar.b, ajcVar2.b);
            }
        };
        Unix = timestampSelector2;
        TimestampSelector[] timestampSelectorArr = {timestampSelector, timestampSelector2};
        $VALUES = timestampSelectorArr;
        $ENTRIES = a.a(timestampSelectorArr);
    }

    public static TimestampSelector valueOf(String str) {
        return (TimestampSelector) Enum.valueOf(TimestampSelector.class, str);
    }

    public static TimestampSelector[] values() {
        return (TimestampSelector[]) $VALUES.clone();
    }

    public abstract long a(ajc ajcVar, ajc ajcVar2);
}
