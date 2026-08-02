package com.squareup.cash.favorites.presenters;

import com.squareup.cash.favorites.data.FavoritesManager$Operation$Add$Result;
import com.squareup.cash.favorites.data.FavoritesManager$Operation$Remove$Result;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class AddFavoritesPresenter$models$2$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[FavoritesManager$Operation$Remove$Result.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[FavoritesManager$Operation$Add$Result.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            FavoritesManager$Operation$Add$Result favoritesManager$Operation$Add$Result = FavoritesManager$Operation$Add$Result.REACHED_LIMIT;
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            FavoritesManager$Operation$Add$Result favoritesManager$Operation$Add$Result2 = FavoritesManager$Operation$Add$Result.REACHED_LIMIT;
            iArr2[3] = 3;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
