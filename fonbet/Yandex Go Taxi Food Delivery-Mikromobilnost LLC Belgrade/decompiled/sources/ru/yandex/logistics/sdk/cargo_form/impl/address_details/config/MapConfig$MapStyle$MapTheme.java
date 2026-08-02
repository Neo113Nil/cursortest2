package ru.yandex.logistics.sdk.cargo_form.impl.address_details.config;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/address_details/config/MapConfig$MapStyle$MapTheme", "", "Lru/yandex/logistics/sdk/cargo_form/impl/address_details/config/MapConfig$MapStyle$MapTheme;", "DARK", "LIGHT", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapConfig$MapStyle$MapTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapConfig$MapStyle$MapTheme[] $VALUES;
    public static final MapConfig$MapStyle$MapTheme DARK;
    public static final MapConfig$MapStyle$MapTheme LIGHT;

    static {
        MapConfig$MapStyle$MapTheme mapConfig$MapStyle$MapTheme = new MapConfig$MapStyle$MapTheme("DARK", 0);
        DARK = mapConfig$MapStyle$MapTheme;
        MapConfig$MapStyle$MapTheme mapConfig$MapStyle$MapTheme2 = new MapConfig$MapStyle$MapTheme("LIGHT", 1);
        LIGHT = mapConfig$MapStyle$MapTheme2;
        MapConfig$MapStyle$MapTheme[] mapConfig$MapStyle$MapThemeArr = {mapConfig$MapStyle$MapTheme, mapConfig$MapStyle$MapTheme2};
        $VALUES = mapConfig$MapStyle$MapThemeArr;
        $ENTRIES = kotlin.enums.a.a(mapConfig$MapStyle$MapThemeArr);
    }

    public static MapConfig$MapStyle$MapTheme valueOf(String str) {
        return (MapConfig$MapStyle$MapTheme) Enum.valueOf(MapConfig$MapStyle$MapTheme.class, str);
    }

    public static MapConfig$MapStyle$MapTheme[] values() {
        return (MapConfig$MapStyle$MapTheme[]) $VALUES.clone();
    }
}
