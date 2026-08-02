package ru.yandex.taxi.design;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/design/AddressAutofitHelper$ExtraSuffixType", "", "Lru/yandex/taxi/design/AddressAutofitHelper$ExtraSuffixType;", "PLAIN_TEXT", "ICON", "BUBBLE", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressAutofitHelper$ExtraSuffixType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressAutofitHelper$ExtraSuffixType[] $VALUES;
    public static final AddressAutofitHelper$ExtraSuffixType BUBBLE;
    public static final AddressAutofitHelper$ExtraSuffixType ICON;
    public static final AddressAutofitHelper$ExtraSuffixType PLAIN_TEXT;

    static {
        AddressAutofitHelper$ExtraSuffixType addressAutofitHelper$ExtraSuffixType = new AddressAutofitHelper$ExtraSuffixType("PLAIN_TEXT", 0);
        PLAIN_TEXT = addressAutofitHelper$ExtraSuffixType;
        AddressAutofitHelper$ExtraSuffixType addressAutofitHelper$ExtraSuffixType2 = new AddressAutofitHelper$ExtraSuffixType("ICON", 1);
        ICON = addressAutofitHelper$ExtraSuffixType2;
        AddressAutofitHelper$ExtraSuffixType addressAutofitHelper$ExtraSuffixType3 = new AddressAutofitHelper$ExtraSuffixType("BUBBLE", 2);
        BUBBLE = addressAutofitHelper$ExtraSuffixType3;
        AddressAutofitHelper$ExtraSuffixType[] addressAutofitHelper$ExtraSuffixTypeArr = {addressAutofitHelper$ExtraSuffixType, addressAutofitHelper$ExtraSuffixType2, addressAutofitHelper$ExtraSuffixType3};
        $VALUES = addressAutofitHelper$ExtraSuffixTypeArr;
        $ENTRIES = kotlin.enums.a.a(addressAutofitHelper$ExtraSuffixTypeArr);
    }

    public static AddressAutofitHelper$ExtraSuffixType valueOf(String str) {
        return (AddressAutofitHelper$ExtraSuffixType) Enum.valueOf(AddressAutofitHelper$ExtraSuffixType.class, str);
    }

    public static AddressAutofitHelper$ExtraSuffixType[] values() {
        return (AddressAutofitHelper$ExtraSuffixType[]) $VALUES.clone();
    }
}
