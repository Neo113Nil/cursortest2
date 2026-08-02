package ru.yandex.taxi.scooters.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.oi60;
import defpackage.st60;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/data/model/OfferType;", "", "Companion", "st60", "STANDARD_OFFER", "FIX_POINT", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OfferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OfferType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final st60 Companion;
    public static final OfferType FIX_POINT;
    public static final OfferType STANDARD_OFFER;

    static {
        OfferType offerType = new OfferType("STANDARD_OFFER", 0);
        STANDARD_OFFER = offerType;
        OfferType offerType2 = new OfferType("FIX_POINT", 1);
        FIX_POINT = offerType2;
        OfferType[] offerTypeArr = {offerType, offerType2};
        $VALUES = offerTypeArr;
        $ENTRIES = a.a(offerTypeArr);
        Companion = new st60();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(21));
    }

    public static OfferType valueOf(String str) {
        return (OfferType) Enum.valueOf(OfferType.class, str);
    }

    public static OfferType[] values() {
        return (OfferType[]) $VALUES.clone();
    }
}
