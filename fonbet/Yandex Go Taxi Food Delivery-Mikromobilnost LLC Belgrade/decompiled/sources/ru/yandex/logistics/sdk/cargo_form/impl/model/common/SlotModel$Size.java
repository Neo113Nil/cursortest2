package ru.yandex.logistics.sdk.cargo_form.impl.model.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/model/common/SlotModel$Size", "", "Lru/yandex/logistics/sdk/cargo_form/impl/model/common/SlotModel$Size;", "XS", "S", "M", "L", "XL", "XXL", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SlotModel$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlotModel$Size[] $VALUES;
    public static final SlotModel$Size L;
    public static final SlotModel$Size M;
    public static final SlotModel$Size S;
    public static final SlotModel$Size XL;
    public static final SlotModel$Size XS;
    public static final SlotModel$Size XXL;

    static {
        SlotModel$Size slotModel$Size = new SlotModel$Size("XS", 0);
        XS = slotModel$Size;
        SlotModel$Size slotModel$Size2 = new SlotModel$Size("S", 1);
        S = slotModel$Size2;
        SlotModel$Size slotModel$Size3 = new SlotModel$Size("M", 2);
        M = slotModel$Size3;
        SlotModel$Size slotModel$Size4 = new SlotModel$Size("L", 3);
        L = slotModel$Size4;
        SlotModel$Size slotModel$Size5 = new SlotModel$Size("XL", 4);
        XL = slotModel$Size5;
        SlotModel$Size slotModel$Size6 = new SlotModel$Size("XXL", 5);
        XXL = slotModel$Size6;
        SlotModel$Size[] slotModel$SizeArr = {slotModel$Size, slotModel$Size2, slotModel$Size3, slotModel$Size4, slotModel$Size5, slotModel$Size6};
        $VALUES = slotModel$SizeArr;
        $ENTRIES = a.a(slotModel$SizeArr);
    }

    public static SlotModel$Size valueOf(String str) {
        return (SlotModel$Size) Enum.valueOf(SlotModel$Size.class, str);
    }

    public static SlotModel$Size[] values() {
        return (SlotModel$Size[]) $VALUES.clone();
    }
}
