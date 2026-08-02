package com.squareup.cash.favorites.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FavoritesManager$Operation$Remove$Result {
    public static final /* synthetic */ FavoritesManager$Operation$Remove$Result[] $VALUES;
    public static final FavoritesManager$Operation$Remove$Result NO_CONNECTION;
    public static final FavoritesManager$Operation$Remove$Result SUCCESS;

    static {
        FavoritesManager$Operation$Remove$Result favoritesManager$Operation$Remove$Result = new FavoritesManager$Operation$Remove$Result("SUCCESS", 0);
        SUCCESS = favoritesManager$Operation$Remove$Result;
        FavoritesManager$Operation$Remove$Result favoritesManager$Operation$Remove$Result2 = new FavoritesManager$Operation$Remove$Result("NO_CONNECTION", 1);
        NO_CONNECTION = favoritesManager$Operation$Remove$Result2;
        $VALUES = new FavoritesManager$Operation$Remove$Result[]{favoritesManager$Operation$Remove$Result, favoritesManager$Operation$Remove$Result2};
    }

    public static FavoritesManager$Operation$Remove$Result valueOf(String str) {
        return (FavoritesManager$Operation$Remove$Result) Enum.valueOf(FavoritesManager$Operation$Remove$Result.class, str);
    }

    public static FavoritesManager$Operation$Remove$Result[] values() {
        return (FavoritesManager$Operation$Remove$Result[]) $VALUES.clone();
    }
}
