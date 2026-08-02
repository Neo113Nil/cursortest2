package ru.yandex.yandexmaps.multiplatform.pin.war.internal.util;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/yandexmaps/multiplatform/pin/war/internal/util/PlacemarkType;", "", "DUST", "CLUSTER", "SUPERCLUSTER", "ICON", "LABEL_S", "LABEL_M", "SELECTED", "ICON_OVERLAY", "pin-war_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlacemarkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacemarkType[] $VALUES;
    public static final PlacemarkType CLUSTER;
    public static final PlacemarkType DUST;
    public static final PlacemarkType ICON;
    public static final PlacemarkType ICON_OVERLAY;
    public static final PlacemarkType LABEL_M;
    public static final PlacemarkType LABEL_S;
    public static final PlacemarkType SELECTED;
    public static final PlacemarkType SUPERCLUSTER;

    static {
        PlacemarkType placemarkType = new PlacemarkType("DUST", 0);
        DUST = placemarkType;
        PlacemarkType placemarkType2 = new PlacemarkType("CLUSTER", 1);
        CLUSTER = placemarkType2;
        PlacemarkType placemarkType3 = new PlacemarkType("SUPERCLUSTER", 2);
        SUPERCLUSTER = placemarkType3;
        PlacemarkType placemarkType4 = new PlacemarkType("ICON", 3);
        ICON = placemarkType4;
        PlacemarkType placemarkType5 = new PlacemarkType("LABEL_S", 4);
        LABEL_S = placemarkType5;
        PlacemarkType placemarkType6 = new PlacemarkType("LABEL_M", 5);
        LABEL_M = placemarkType6;
        PlacemarkType placemarkType7 = new PlacemarkType("SELECTED", 6);
        SELECTED = placemarkType7;
        PlacemarkType placemarkType8 = new PlacemarkType("ICON_OVERLAY", 7);
        ICON_OVERLAY = placemarkType8;
        PlacemarkType[] placemarkTypeArr = {placemarkType, placemarkType2, placemarkType3, placemarkType4, placemarkType5, placemarkType6, placemarkType7, placemarkType8};
        $VALUES = placemarkTypeArr;
        $ENTRIES = a.a(placemarkTypeArr);
    }

    public static PlacemarkType valueOf(String str) {
        return (PlacemarkType) Enum.valueOf(PlacemarkType.class, str);
    }

    public static PlacemarkType[] values() {
        return (PlacemarkType[]) $VALUES.clone();
    }
}
