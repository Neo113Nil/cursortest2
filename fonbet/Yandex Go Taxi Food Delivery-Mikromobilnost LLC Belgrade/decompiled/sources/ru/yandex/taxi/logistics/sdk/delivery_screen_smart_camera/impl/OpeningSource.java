package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_screen_smart_camera/impl/OpeningSource;", "", "SLIME", "COMMON", "sdk-delivery-screen-smart-camera"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OpeningSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OpeningSource[] $VALUES;
    public static final OpeningSource COMMON;
    public static final OpeningSource SLIME;

    static {
        OpeningSource openingSource = new OpeningSource("SLIME", 0);
        SLIME = openingSource;
        OpeningSource openingSource2 = new OpeningSource("COMMON", 1);
        COMMON = openingSource2;
        OpeningSource[] openingSourceArr = {openingSource, openingSource2};
        $VALUES = openingSourceArr;
        $ENTRIES = a.a(openingSourceArr);
    }

    public static OpeningSource valueOf(String str) {
        return (OpeningSource) Enum.valueOf(OpeningSource.class, str);
    }

    public static OpeningSource[] values() {
        return (OpeningSource[]) $VALUES.clone();
    }
}
