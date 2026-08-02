package ru.yandex.taxi.scooters.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iwq0;
import defpackage.k0r0;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/data/model/SessionOfferType;", "", "Companion", "k0r0", "STANDART_OFFER", "FIX_POINT", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SessionOfferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SessionOfferType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final k0r0 Companion;
    public static final SessionOfferType FIX_POINT;
    public static final SessionOfferType STANDART_OFFER;

    static {
        SessionOfferType sessionOfferType = new SessionOfferType("STANDART_OFFER", 0);
        STANDART_OFFER = sessionOfferType;
        SessionOfferType sessionOfferType2 = new SessionOfferType("FIX_POINT", 1);
        FIX_POINT = sessionOfferType2;
        SessionOfferType[] sessionOfferTypeArr = {sessionOfferType, sessionOfferType2};
        $VALUES = sessionOfferTypeArr;
        $ENTRIES = a.a(sessionOfferTypeArr);
        Companion = new k0r0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(4));
    }

    public static SessionOfferType valueOf(String str) {
        return (SessionOfferType) Enum.valueOf(SessionOfferType.class, str);
    }

    public static SessionOfferType[] values() {
        return (SessionOfferType[]) $VALUES.clone();
    }
}
