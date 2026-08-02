package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/logistics/sdk/delivery/state/NeuroPostcardButton$Size", "", "Lru/yandex/taxi/logistics/sdk/delivery/state/NeuroPostcardButton$Size;", "S", "M", "L", "sdk-delivery"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NeuroPostcardButton$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NeuroPostcardButton$Size[] $VALUES;
    public static final NeuroPostcardButton$Size L;
    public static final NeuroPostcardButton$Size M;
    public static final NeuroPostcardButton$Size S;

    static {
        NeuroPostcardButton$Size neuroPostcardButton$Size = new NeuroPostcardButton$Size("S", 0);
        S = neuroPostcardButton$Size;
        NeuroPostcardButton$Size neuroPostcardButton$Size2 = new NeuroPostcardButton$Size("M", 1);
        M = neuroPostcardButton$Size2;
        NeuroPostcardButton$Size neuroPostcardButton$Size3 = new NeuroPostcardButton$Size("L", 2);
        L = neuroPostcardButton$Size3;
        NeuroPostcardButton$Size[] neuroPostcardButton$SizeArr = {neuroPostcardButton$Size, neuroPostcardButton$Size2, neuroPostcardButton$Size3};
        $VALUES = neuroPostcardButton$SizeArr;
        $ENTRIES = kotlin.enums.a.a(neuroPostcardButton$SizeArr);
    }

    public static NeuroPostcardButton$Size valueOf(String str) {
        return (NeuroPostcardButton$Size) Enum.valueOf(NeuroPostcardButton$Size.class, str);
    }

    public static NeuroPostcardButton$Size[] values() {
        return (NeuroPostcardButton$Size[]) $VALUES.clone();
    }
}
