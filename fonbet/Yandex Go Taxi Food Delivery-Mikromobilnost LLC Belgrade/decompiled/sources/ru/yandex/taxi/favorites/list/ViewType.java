package ru.yandex.taxi.favorites.list;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/favorites/list/ViewType;", "", "DIVIDER", "LOADING", "SUGGESTED_RIDE", "SAVED_RIDE", "INFO_RIDE", "SUGGESTED", "ADD_FAVORITE_ADDRESS", "FAVORITE_ADDRESS", "SECTION", "CANDIDATE_TO_SAVE", IDialogId.INTENT_EXTRA_IN_HEADER, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ViewType[] $VALUES;
    public static final ViewType ADD_FAVORITE_ADDRESS;
    public static final ViewType CANDIDATE_TO_SAVE;
    public static final ViewType DIVIDER;
    public static final ViewType FAVORITE_ADDRESS;
    public static final ViewType HEADER;
    public static final ViewType INFO_RIDE;
    public static final ViewType LOADING;
    public static final ViewType SAVED_RIDE;
    public static final ViewType SECTION;
    public static final ViewType SUGGESTED;
    public static final ViewType SUGGESTED_RIDE;

    static {
        ViewType viewType = new ViewType("DIVIDER", 0);
        DIVIDER = viewType;
        ViewType viewType2 = new ViewType("LOADING", 1);
        LOADING = viewType2;
        ViewType viewType3 = new ViewType("SUGGESTED_RIDE", 2);
        SUGGESTED_RIDE = viewType3;
        ViewType viewType4 = new ViewType("SAVED_RIDE", 3);
        SAVED_RIDE = viewType4;
        ViewType viewType5 = new ViewType("INFO_RIDE", 4);
        INFO_RIDE = viewType5;
        ViewType viewType6 = new ViewType("SUGGESTED", 5);
        SUGGESTED = viewType6;
        ViewType viewType7 = new ViewType("ADD_FAVORITE_ADDRESS", 6);
        ADD_FAVORITE_ADDRESS = viewType7;
        ViewType viewType8 = new ViewType("FAVORITE_ADDRESS", 7);
        FAVORITE_ADDRESS = viewType8;
        ViewType viewType9 = new ViewType("SECTION", 8);
        SECTION = viewType9;
        ViewType viewType10 = new ViewType("CANDIDATE_TO_SAVE", 9);
        CANDIDATE_TO_SAVE = viewType10;
        ViewType viewType11 = new ViewType(IDialogId.INTENT_EXTRA_IN_HEADER, 10);
        HEADER = viewType11;
        ViewType[] viewTypeArr = {viewType, viewType2, viewType3, viewType4, viewType5, viewType6, viewType7, viewType8, viewType9, viewType10, viewType11};
        $VALUES = viewTypeArr;
        $ENTRIES = a.a(viewTypeArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ViewType valueOf(String str) {
        return (ViewType) Enum.valueOf(ViewType.class, str);
    }

    public static ViewType[] values() {
        return (ViewType[]) $VALUES.clone();
    }
}
