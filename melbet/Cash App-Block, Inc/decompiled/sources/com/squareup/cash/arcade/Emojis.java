package com.squareup.cash.arcade;

import com.fillr.e;
import com.squareup.cash.R;
import java.util.LinkedHashMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class Emojis {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ Emojis[] $VALUES;
    public static final e Companion;
    public static final LinkedHashMap emojisById;
    public final int drawableResDark24;
    public final int drawableResDark48;
    public final int drawableResLight24;
    public final int drawableResLight48;
    public final String id;

    static {
        Emojis[] emojisArr = {new Emojis("Birthday", 0, "birthday", R.drawable.emoji_birthday_small, R.drawable.emoji_birthday, R.drawable.emoji_birthday_small_dark, R.drawable.emoji_birthday_dark), new Emojis("Education", 1, "education", R.drawable.emoji_education_small, R.drawable.emoji_education, R.drawable.emoji_education_small_dark, R.drawable.emoji_education_dark), new Emojis("ExtraCash", 2, "extra_cash", R.drawable.emoji_extra_cash_small, R.drawable.emoji_extra_cash, R.drawable.emoji_extra_cash_small_dark, R.drawable.emoji_extra_cash_dark), new Emojis("Food", 3, "food", R.drawable.emoji_food_small, R.drawable.emoji_food, R.drawable.emoji_food_small_dark, R.drawable.emoji_food_dark), new Emojis("Games", 4, "games", R.drawable.emoji_games_small, R.drawable.emoji_games, R.drawable.emoji_games_small_dark, R.drawable.emoji_games_dark), new Emojis("Gift", 5, "gift", R.drawable.emoji_gift_small, R.drawable.emoji_gift, R.drawable.emoji_gift_small_dark, R.drawable.emoji_gift_dark), new Emojis("Illness", 6, "illness", R.drawable.emoji_illness_small, R.drawable.emoji_illness, R.drawable.emoji_illness_small_dark, R.drawable.emoji_illness_dark), new Emojis("Living", 7, "living", R.drawable.emoji_living_small, R.drawable.emoji_living, R.drawable.emoji_living_small_dark, R.drawable.emoji_living_dark), new Emojis("RainyDay", 8, "rainy_day", R.drawable.emoji_rainy_day_small, R.drawable.emoji_rainy_day, R.drawable.emoji_rainy_day_small_dark, R.drawable.emoji_rainy_day_dark), new Emojis("Technology", 9, "technology", R.drawable.emoji_technology_small, R.drawable.emoji_technology, R.drawable.emoji_technology_small_dark, R.drawable.emoji_technology_dark), new Emojis("Travel", 10, "travel", R.drawable.emoji_travel_small, R.drawable.emoji_travel, R.drawable.emoji_travel_small_dark, R.drawable.emoji_travel_dark), new Emojis("Vacation", 11, "vacation", R.drawable.emoji_vacation_small, R.drawable.emoji_vacation, R.drawable.emoji_vacation_small_dark, R.drawable.emoji_vacation_dark)};
        $VALUES = emojisArr;
        $ENTRIES = new EnumEntriesList(emojisArr);
        Companion = new e();
        Emojis[] values = values();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Emojis emojis : values) {
            linkedHashMap.put(emojis.id, emojis);
        }
        emojisById = linkedHashMap;
    }

    public Emojis(String str, int i, String str2, int i2, int i3, int i4, int i5) {
        this.id = str2;
        this.drawableResLight24 = i2;
        this.drawableResLight48 = i3;
        this.drawableResDark24 = i4;
        this.drawableResDark48 = i5;
    }

    public static Emojis valueOf(String str) {
        return (Emojis) Enum.valueOf(Emojis.class, str);
    }

    public static Emojis[] values() {
        return (Emojis[]) $VALUES.clone();
    }
}
