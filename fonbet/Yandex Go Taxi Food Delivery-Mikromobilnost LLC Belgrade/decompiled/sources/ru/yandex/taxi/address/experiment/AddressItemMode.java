package ru.yandex.taxi.address.experiment;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/address/experiment/AddressItemMode;", "", "EDITABLE", "LOADING", "READ_ONLY", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressItemMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressItemMode[] $VALUES;
    public static final AddressItemMode EDITABLE;
    public static final AddressItemMode LOADING;
    public static final AddressItemMode READ_ONLY;

    static {
        AddressItemMode addressItemMode = new AddressItemMode("EDITABLE", 0);
        EDITABLE = addressItemMode;
        AddressItemMode addressItemMode2 = new AddressItemMode("LOADING", 1);
        LOADING = addressItemMode2;
        AddressItemMode addressItemMode3 = new AddressItemMode("READ_ONLY", 2);
        READ_ONLY = addressItemMode3;
        AddressItemMode[] addressItemModeArr = {addressItemMode, addressItemMode2, addressItemMode3};
        $VALUES = addressItemModeArr;
        $ENTRIES = kotlin.enums.a.a(addressItemModeArr);
    }

    public static AddressItemMode valueOf(String str) {
        return (AddressItemMode) Enum.valueOf(AddressItemMode.class, str);
    }

    public static AddressItemMode[] values() {
        return (AddressItemMode[]) $VALUES.clone();
    }
}
