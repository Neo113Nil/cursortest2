package ru.yandex.taxi.scooters.data.model;

import defpackage.b6f;
import defpackage.gsq0;
import defpackage.hxe;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/data/model/CreateOfferType;", "", "Companion", "b6f", "FIX_POINT", "TO_DESTINATION_OFFER", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateOfferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CreateOfferType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final b6f Companion;
    public static final CreateOfferType FIX_POINT;
    public static final CreateOfferType TO_DESTINATION_OFFER;

    static {
        CreateOfferType createOfferType = new CreateOfferType("FIX_POINT", 0);
        FIX_POINT = createOfferType;
        CreateOfferType createOfferType2 = new CreateOfferType("TO_DESTINATION_OFFER", 1);
        TO_DESTINATION_OFFER = createOfferType2;
        CreateOfferType[] createOfferTypeArr = {createOfferType, createOfferType2};
        $VALUES = createOfferTypeArr;
        $ENTRIES = a.a(createOfferTypeArr);
        Companion = new b6f();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(10));
    }

    public static CreateOfferType valueOf(String str) {
        return (CreateOfferType) Enum.valueOf(CreateOfferType.class, str);
    }

    public static CreateOfferType[] values() {
        return (CreateOfferType[]) $VALUES.clone();
    }
}
