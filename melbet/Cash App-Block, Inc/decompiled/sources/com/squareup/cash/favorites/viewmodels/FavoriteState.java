package com.squareup.cash.favorites.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FavoriteState {
    public static final /* synthetic */ FavoriteState[] $VALUES;
    public static final FavoriteState FAVORITE;
    public static final FavoriteState NOT_FAVORITE;
    public static final FavoriteState REQUEST_IN_FLIGHT;

    static {
        FavoriteState favoriteState = new FavoriteState("FAVORITE", 0);
        FAVORITE = favoriteState;
        FavoriteState favoriteState2 = new FavoriteState("REQUEST_IN_FLIGHT", 1);
        REQUEST_IN_FLIGHT = favoriteState2;
        FavoriteState favoriteState3 = new FavoriteState("NOT_FAVORITE", 2);
        NOT_FAVORITE = favoriteState3;
        $VALUES = new FavoriteState[]{favoriteState, favoriteState2, favoriteState3};
    }

    public static FavoriteState valueOf(String str) {
        return (FavoriteState) Enum.valueOf(FavoriteState.class, str);
    }

    public static FavoriteState[] values() {
        return (FavoriteState[]) $VALUES.clone();
    }
}
