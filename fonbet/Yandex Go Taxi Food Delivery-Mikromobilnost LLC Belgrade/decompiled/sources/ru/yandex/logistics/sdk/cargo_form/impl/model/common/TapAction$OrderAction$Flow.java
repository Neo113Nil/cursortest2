package ru.yandex.logistics.sdk.cargo_form.impl.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/model/common/TapAction$OrderAction$Flow", "", "Lru/yandex/logistics/sdk/cargo_form/impl/model/common/TapAction$OrderAction$Flow;", "ROUTE_POINTS", "PICKUP_POINTS", "STATE", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapAction$OrderAction$Flow {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TapAction$OrderAction$Flow[] $VALUES;
    public static final TapAction$OrderAction$Flow PICKUP_POINTS;
    public static final TapAction$OrderAction$Flow ROUTE_POINTS;
    public static final TapAction$OrderAction$Flow STATE;

    static {
        TapAction$OrderAction$Flow tapAction$OrderAction$Flow = new TapAction$OrderAction$Flow("ROUTE_POINTS", 0);
        ROUTE_POINTS = tapAction$OrderAction$Flow;
        TapAction$OrderAction$Flow tapAction$OrderAction$Flow2 = new TapAction$OrderAction$Flow("PICKUP_POINTS", 1);
        PICKUP_POINTS = tapAction$OrderAction$Flow2;
        TapAction$OrderAction$Flow tapAction$OrderAction$Flow3 = new TapAction$OrderAction$Flow("STATE", 2);
        STATE = tapAction$OrderAction$Flow3;
        TapAction$OrderAction$Flow[] tapAction$OrderAction$FlowArr = {tapAction$OrderAction$Flow, tapAction$OrderAction$Flow2, tapAction$OrderAction$Flow3};
        $VALUES = tapAction$OrderAction$FlowArr;
        $ENTRIES = a.a(tapAction$OrderAction$FlowArr);
    }

    public static TapAction$OrderAction$Flow valueOf(String str) {
        return (TapAction$OrderAction$Flow) Enum.valueOf(TapAction$OrderAction$Flow.class, str);
    }

    public static TapAction$OrderAction$Flow[] values() {
        return (TapAction$OrderAction$Flow[]) $VALUES.clone();
    }
}
