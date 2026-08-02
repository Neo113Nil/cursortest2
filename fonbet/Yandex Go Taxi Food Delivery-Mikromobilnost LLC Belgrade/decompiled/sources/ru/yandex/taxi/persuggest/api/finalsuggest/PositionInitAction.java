package ru.yandex.taxi.persuggest.api.finalsuggest;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mlc0;
import defpackage.yde0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/persuggest/api/finalsuggest/PositionInitAction;", "", "Companion", "yde0", "AUTO_LOCATION", "GEO", "MAP", "SUGGEST", "CACHE", "PANORAMA", "SUMMARY_TARIFF_CHANGE", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PositionInitAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PositionInitAction[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final PositionInitAction AUTO_LOCATION;
    public static final PositionInitAction CACHE;
    public static final yde0 Companion;
    public static final PositionInitAction GEO;
    public static final PositionInitAction MAP;
    public static final PositionInitAction PANORAMA;
    public static final PositionInitAction SUGGEST;
    public static final PositionInitAction SUMMARY_TARIFF_CHANGE;

    static {
        PositionInitAction positionInitAction = new PositionInitAction("AUTO_LOCATION", 0);
        AUTO_LOCATION = positionInitAction;
        PositionInitAction positionInitAction2 = new PositionInitAction("GEO", 1);
        GEO = positionInitAction2;
        PositionInitAction positionInitAction3 = new PositionInitAction("MAP", 2);
        MAP = positionInitAction3;
        PositionInitAction positionInitAction4 = new PositionInitAction("SUGGEST", 3);
        SUGGEST = positionInitAction4;
        PositionInitAction positionInitAction5 = new PositionInitAction("CACHE", 4);
        CACHE = positionInitAction5;
        PositionInitAction positionInitAction6 = new PositionInitAction("PANORAMA", 5);
        PANORAMA = positionInitAction6;
        PositionInitAction positionInitAction7 = new PositionInitAction("SUMMARY_TARIFF_CHANGE", 6);
        SUMMARY_TARIFF_CHANGE = positionInitAction7;
        PositionInitAction[] positionInitActionArr = {positionInitAction, positionInitAction2, positionInitAction3, positionInitAction4, positionInitAction5, positionInitAction6, positionInitAction7};
        $VALUES = positionInitActionArr;
        $ENTRIES = a.a(positionInitActionArr);
        Companion = new yde0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mlc0(26));
    }

    public static PositionInitAction valueOf(String str) {
        return (PositionInitAction) Enum.valueOf(PositionInitAction.class, str);
    }

    public static PositionInitAction[] values() {
        return (PositionInitAction[]) $VALUES.clone();
    }
}
