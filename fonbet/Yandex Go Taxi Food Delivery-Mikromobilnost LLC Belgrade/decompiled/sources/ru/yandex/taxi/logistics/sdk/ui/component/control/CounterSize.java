package ru.yandex.taxi.logistics.sdk.ui.component.control;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/component/control/CounterSize;", "", "Ly7m;", "height", "F", "a", "()F", "XS", "S", "M", "L", "sdk-ui-components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CounterSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CounterSize[] $VALUES;
    public static final CounterSize L;
    public static final CounterSize M;
    public static final CounterSize S;
    public static final CounterSize XS;
    private final float height;

    static {
        CounterSize counterSize = new CounterSize("XS", 0, 32.0f);
        XS = counterSize;
        CounterSize counterSize2 = new CounterSize("S", 1, 40.0f);
        S = counterSize2;
        CounterSize counterSize3 = new CounterSize("M", 2, 48.0f);
        M = counterSize3;
        CounterSize counterSize4 = new CounterSize("L", 3, 56.0f);
        L = counterSize4;
        CounterSize[] counterSizeArr = {counterSize, counterSize2, counterSize3, counterSize4};
        $VALUES = counterSizeArr;
        $ENTRIES = kotlin.enums.a.a(counterSizeArr);
    }

    public CounterSize(String str, int i, float f) {
        this.height = f;
    }

    public static CounterSize valueOf(String str) {
        return (CounterSize) Enum.valueOf(CounterSize.class, str);
    }

    public static CounterSize[] values() {
        return (CounterSize[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final float getHeight() {
        return this.height;
    }
}
