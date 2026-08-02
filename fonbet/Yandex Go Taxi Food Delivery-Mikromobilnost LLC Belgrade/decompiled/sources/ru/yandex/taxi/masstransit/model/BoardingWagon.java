package ru.yandex.taxi.masstransit.model;

import defpackage.k4o;
import defpackage.p76;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/masstransit/model/BoardingWagon;", "", "Companion", "p76", "HEAD", "NEAR_THE_HEAD", "MIDDLE", "NEAR_THE_TAIL", "TAIL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BoardingWagon {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BoardingWagon[] $VALUES;
    public static final p76 Companion;
    public static final BoardingWagon HEAD;
    public static final BoardingWagon MIDDLE;
    public static final BoardingWagon NEAR_THE_HEAD;
    public static final BoardingWagon NEAR_THE_TAIL;
    public static final BoardingWagon TAIL;

    static {
        BoardingWagon boardingWagon = new BoardingWagon("HEAD", 0);
        HEAD = boardingWagon;
        BoardingWagon boardingWagon2 = new BoardingWagon("NEAR_THE_HEAD", 1);
        NEAR_THE_HEAD = boardingWagon2;
        BoardingWagon boardingWagon3 = new BoardingWagon("MIDDLE", 2);
        MIDDLE = boardingWagon3;
        BoardingWagon boardingWagon4 = new BoardingWagon("NEAR_THE_TAIL", 3);
        NEAR_THE_TAIL = boardingWagon4;
        BoardingWagon boardingWagon5 = new BoardingWagon("TAIL", 4);
        TAIL = boardingWagon5;
        BoardingWagon[] boardingWagonArr = {boardingWagon, boardingWagon2, boardingWagon3, boardingWagon4, boardingWagon5};
        $VALUES = boardingWagonArr;
        $ENTRIES = kotlin.enums.a.a(boardingWagonArr);
        Companion = new p76();
    }

    public static BoardingWagon valueOf(String str) {
        return (BoardingWagon) Enum.valueOf(BoardingWagon.class, str);
    }

    public static BoardingWagon[] values() {
        return (BoardingWagon[]) $VALUES.clone();
    }
}
