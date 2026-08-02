package ru.yandex.taxi.masstransit.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/masstransit/model/MtTransportSystemId;", "", "UNKNOWN", "MOSCOW", "SAINT_PETERSBURG", "EKATERINBURG", "NIZHNY_NOVGOROD", "SAMARA", "KAZAN", "NOVOSIBIRSK", "KIEV", "MINSK", "ALMATY", "DUBAI_UNDERGROUND", "DUBAI_MONORAIL", "DUBAI_TRAM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtTransportSystemId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtTransportSystemId[] $VALUES;
    public static final MtTransportSystemId ALMATY;
    public static final MtTransportSystemId DUBAI_MONORAIL;
    public static final MtTransportSystemId DUBAI_TRAM;
    public static final MtTransportSystemId DUBAI_UNDERGROUND;
    public static final MtTransportSystemId EKATERINBURG;
    public static final MtTransportSystemId KAZAN;
    public static final MtTransportSystemId KIEV;
    public static final MtTransportSystemId MINSK;
    public static final MtTransportSystemId MOSCOW;
    public static final MtTransportSystemId NIZHNY_NOVGOROD;
    public static final MtTransportSystemId NOVOSIBIRSK;
    public static final MtTransportSystemId SAINT_PETERSBURG;
    public static final MtTransportSystemId SAMARA;
    public static final MtTransportSystemId UNKNOWN;

    static {
        MtTransportSystemId mtTransportSystemId = new MtTransportSystemId("UNKNOWN", 0);
        UNKNOWN = mtTransportSystemId;
        MtTransportSystemId mtTransportSystemId2 = new MtTransportSystemId("MOSCOW", 1);
        MOSCOW = mtTransportSystemId2;
        MtTransportSystemId mtTransportSystemId3 = new MtTransportSystemId("SAINT_PETERSBURG", 2);
        SAINT_PETERSBURG = mtTransportSystemId3;
        MtTransportSystemId mtTransportSystemId4 = new MtTransportSystemId("EKATERINBURG", 3);
        EKATERINBURG = mtTransportSystemId4;
        MtTransportSystemId mtTransportSystemId5 = new MtTransportSystemId("NIZHNY_NOVGOROD", 4);
        NIZHNY_NOVGOROD = mtTransportSystemId5;
        MtTransportSystemId mtTransportSystemId6 = new MtTransportSystemId("SAMARA", 5);
        SAMARA = mtTransportSystemId6;
        MtTransportSystemId mtTransportSystemId7 = new MtTransportSystemId("KAZAN", 6);
        KAZAN = mtTransportSystemId7;
        MtTransportSystemId mtTransportSystemId8 = new MtTransportSystemId("NOVOSIBIRSK", 7);
        NOVOSIBIRSK = mtTransportSystemId8;
        MtTransportSystemId mtTransportSystemId9 = new MtTransportSystemId("KIEV", 8);
        KIEV = mtTransportSystemId9;
        MtTransportSystemId mtTransportSystemId10 = new MtTransportSystemId("MINSK", 9);
        MINSK = mtTransportSystemId10;
        MtTransportSystemId mtTransportSystemId11 = new MtTransportSystemId("ALMATY", 10);
        ALMATY = mtTransportSystemId11;
        MtTransportSystemId mtTransportSystemId12 = new MtTransportSystemId("DUBAI_UNDERGROUND", 11);
        DUBAI_UNDERGROUND = mtTransportSystemId12;
        MtTransportSystemId mtTransportSystemId13 = new MtTransportSystemId("DUBAI_MONORAIL", 12);
        DUBAI_MONORAIL = mtTransportSystemId13;
        MtTransportSystemId mtTransportSystemId14 = new MtTransportSystemId("DUBAI_TRAM", 13);
        DUBAI_TRAM = mtTransportSystemId14;
        MtTransportSystemId[] mtTransportSystemIdArr = {mtTransportSystemId, mtTransportSystemId2, mtTransportSystemId3, mtTransportSystemId4, mtTransportSystemId5, mtTransportSystemId6, mtTransportSystemId7, mtTransportSystemId8, mtTransportSystemId9, mtTransportSystemId10, mtTransportSystemId11, mtTransportSystemId12, mtTransportSystemId13, mtTransportSystemId14};
        $VALUES = mtTransportSystemIdArr;
        $ENTRIES = kotlin.enums.a.a(mtTransportSystemIdArr);
    }

    public static MtTransportSystemId valueOf(String str) {
        return (MtTransportSystemId) Enum.valueOf(MtTransportSystemId.class, str);
    }

    public static MtTransportSystemId[] values() {
        return (MtTransportSystemId[]) $VALUES.clone();
    }
}
