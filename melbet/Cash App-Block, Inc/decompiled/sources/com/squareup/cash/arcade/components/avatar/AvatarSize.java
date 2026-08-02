package com.squareup.cash.arcade.components.avatar;

import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AvatarSize {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ AvatarSize[] $VALUES;
    public static final AvatarSize Size16;
    public static final AvatarSize Size32;
    public static final AvatarSize Size48;
    public static final AvatarSize Size64;
    public static final AvatarSize Size96;
    public final float badgeOffset;
    public final float iconSize;
    public final float size;
    public final long textSize;

    static {
        AvatarSize avatarSize = new AvatarSize("Size16", 0, 16.0f, 8.0f, Room.getSp(8), RecyclerView.DECELERATION_RATE, 56);
        Size16 = avatarSize;
        AvatarSize avatarSize2 = new AvatarSize("Size32", 1, 32.0f, 16.0f, Room.getSp(16), 12.0f, 48);
        Size32 = avatarSize2;
        AvatarSize avatarSize3 = new AvatarSize("Size48", 2, 48.0f, 24.0f, Room.getSp(24), 8.0f, 48);
        Size48 = avatarSize3;
        AvatarSize avatarSize4 = new AvatarSize("Size64", 3, 64.0f, 32.0f, Room.getSp(32), 4.0f, 48);
        Size64 = avatarSize4;
        AvatarSize avatarSize5 = new AvatarSize("Size96", 4, 96.0f, 48.0f, Room.getSp(48), RecyclerView.DECELERATION_RATE, 48);
        Size96 = avatarSize5;
        AvatarSize[] avatarSizeArr = {avatarSize, avatarSize2, avatarSize3, avatarSize4, avatarSize5};
        $VALUES = avatarSizeArr;
        $ENTRIES = new EnumEntriesList(avatarSizeArr);
    }

    public AvatarSize(String str, int i, float f, float f2, long j, float f3, int i2) {
        f3 = (i2 & 8) != 0 ? Float.NaN : f3;
        this.size = f;
        this.iconSize = f2;
        this.textSize = j;
        this.badgeOffset = f3;
    }

    public static AvatarSize valueOf(String str) {
        return (AvatarSize) Enum.valueOf(AvatarSize.class, str);
    }

    public static AvatarSize[] values() {
        return (AvatarSize[]) $VALUES.clone();
    }
}
