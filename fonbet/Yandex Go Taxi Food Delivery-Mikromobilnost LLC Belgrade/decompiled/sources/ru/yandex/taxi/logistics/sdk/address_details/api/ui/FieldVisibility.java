package ru.yandex.taxi.logistics.sdk.address_details.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/address_details/api/ui/FieldVisibility;", "", "VISIBLE", "INVISIBLE", "GONE", "sdk-address-details"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FieldVisibility {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FieldVisibility[] $VALUES;
    public static final FieldVisibility GONE;
    public static final FieldVisibility INVISIBLE;
    public static final FieldVisibility VISIBLE;

    static {
        FieldVisibility fieldVisibility = new FieldVisibility("VISIBLE", 0);
        VISIBLE = fieldVisibility;
        FieldVisibility fieldVisibility2 = new FieldVisibility("INVISIBLE", 1);
        INVISIBLE = fieldVisibility2;
        FieldVisibility fieldVisibility3 = new FieldVisibility("GONE", 2);
        GONE = fieldVisibility3;
        FieldVisibility[] fieldVisibilityArr = {fieldVisibility, fieldVisibility2, fieldVisibility3};
        $VALUES = fieldVisibilityArr;
        $ENTRIES = a.a(fieldVisibilityArr);
    }

    public static FieldVisibility valueOf(String str) {
        return (FieldVisibility) Enum.valueOf(FieldVisibility.class, str);
    }

    public static FieldVisibility[] values() {
        return (FieldVisibility[]) $VALUES.clone();
    }
}
