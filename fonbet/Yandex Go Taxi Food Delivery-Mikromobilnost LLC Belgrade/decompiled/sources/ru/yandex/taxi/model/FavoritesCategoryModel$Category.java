package ru.yandex.taxi.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/model/FavoritesCategoryModel$Category", "", "Lru/yandex/taxi/model/FavoritesCategoryModel$Category;", "HOME", "WORK", "NEW", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoritesCategoryModel$Category {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesCategoryModel$Category[] $VALUES;
    public static final FavoritesCategoryModel$Category HOME;
    public static final FavoritesCategoryModel$Category NEW;
    public static final FavoritesCategoryModel$Category WORK;

    static {
        FavoritesCategoryModel$Category favoritesCategoryModel$Category = new FavoritesCategoryModel$Category("HOME", 0);
        HOME = favoritesCategoryModel$Category;
        FavoritesCategoryModel$Category favoritesCategoryModel$Category2 = new FavoritesCategoryModel$Category("WORK", 1);
        WORK = favoritesCategoryModel$Category2;
        FavoritesCategoryModel$Category favoritesCategoryModel$Category3 = new FavoritesCategoryModel$Category("NEW", 2);
        NEW = favoritesCategoryModel$Category3;
        FavoritesCategoryModel$Category[] favoritesCategoryModel$CategoryArr = {favoritesCategoryModel$Category, favoritesCategoryModel$Category2, favoritesCategoryModel$Category3};
        $VALUES = favoritesCategoryModel$CategoryArr;
        $ENTRIES = a.a(favoritesCategoryModel$CategoryArr);
    }

    public static FavoritesCategoryModel$Category valueOf(String str) {
        return (FavoritesCategoryModel$Category) Enum.valueOf(FavoritesCategoryModel$Category.class, str);
    }

    public static FavoritesCategoryModel$Category[] values() {
        return (FavoritesCategoryModel$Category[]) $VALUES.clone();
    }
}
