package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/logistics/sdk/delivery/state/NeuroPostcardButton$Style", "", "Lru/yandex/taxi/logistics/sdk/delivery/state/NeuroPostcardButton$Style;", "MAIN", "FLOATING", "MINOR", "sdk-delivery"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NeuroPostcardButton$Style {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NeuroPostcardButton$Style[] $VALUES;
    public static final NeuroPostcardButton$Style FLOATING;
    public static final NeuroPostcardButton$Style MAIN;
    public static final NeuroPostcardButton$Style MINOR;

    static {
        NeuroPostcardButton$Style neuroPostcardButton$Style = new NeuroPostcardButton$Style("MAIN", 0);
        MAIN = neuroPostcardButton$Style;
        NeuroPostcardButton$Style neuroPostcardButton$Style2 = new NeuroPostcardButton$Style("FLOATING", 1);
        FLOATING = neuroPostcardButton$Style2;
        NeuroPostcardButton$Style neuroPostcardButton$Style3 = new NeuroPostcardButton$Style("MINOR", 2);
        MINOR = neuroPostcardButton$Style3;
        NeuroPostcardButton$Style[] neuroPostcardButton$StyleArr = {neuroPostcardButton$Style, neuroPostcardButton$Style2, neuroPostcardButton$Style3};
        $VALUES = neuroPostcardButton$StyleArr;
        $ENTRIES = kotlin.enums.a.a(neuroPostcardButton$StyleArr);
    }

    public static NeuroPostcardButton$Style valueOf(String str) {
        return (NeuroPostcardButton$Style) Enum.valueOf(NeuroPostcardButton$Style.class, str);
    }

    public static NeuroPostcardButton$Style[] values() {
        return (NeuroPostcardButton$Style[]) $VALUES.clone();
    }
}
