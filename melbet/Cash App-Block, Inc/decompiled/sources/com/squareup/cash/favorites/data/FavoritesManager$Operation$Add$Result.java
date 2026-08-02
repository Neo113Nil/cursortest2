package com.squareup.cash.favorites.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FavoritesManager$Operation$Add$Result {
    public static final /* synthetic */ FavoritesManager$Operation$Add$Result[] $VALUES;
    public static final FavoritesManager$Operation$Add$Result NO_CONNECTION;
    public static final FavoritesManager$Operation$Add$Result REACHED_LIMIT;
    public static final FavoritesManager$Operation$Add$Result SUCCESS;
    public static final FavoritesManager$Operation$Add$Result SUCCESS_AND_FIRST_TIME;

    static {
        FavoritesManager$Operation$Add$Result favoritesManager$Operation$Add$Result = new FavoritesManager$Operation$Add$Result("REACHED_LIMIT", 0);
        REACHED_LIMIT = favoritesManager$Operation$Add$Result;
        FavoritesManager$Operation$Add$Result favoritesManager$Operation$Add$Result2 = new FavoritesManager$Operation$Add$Result("SUCCESS", 1);
        SUCCESS = favoritesManager$Operation$Add$Result2;
        FavoritesManager$Operation$Add$Result favoritesManager$Operation$Add$Result3 = new FavoritesManager$Operation$Add$Result("SUCCESS_AND_FIRST_TIME", 2);
        SUCCESS_AND_FIRST_TIME = favoritesManager$Operation$Add$Result3;
        FavoritesManager$Operation$Add$Result favoritesManager$Operation$Add$Result4 = new FavoritesManager$Operation$Add$Result("NO_CONNECTION", 3);
        NO_CONNECTION = favoritesManager$Operation$Add$Result4;
        $VALUES = new FavoritesManager$Operation$Add$Result[]{favoritesManager$Operation$Add$Result, favoritesManager$Operation$Add$Result2, favoritesManager$Operation$Add$Result3, favoritesManager$Operation$Add$Result4};
    }

    public static FavoritesManager$Operation$Add$Result valueOf(String str) {
        return (FavoritesManager$Operation$Add$Result) Enum.valueOf(FavoritesManager$Operation$Add$Result.class, str);
    }

    public static FavoritesManager$Operation$Add$Result[] values() {
        return (FavoritesManager$Operation$Add$Result[]) $VALUES.clone();
    }
}
