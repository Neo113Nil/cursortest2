package com.squareup.cash.arcade.components.avatar;

/* loaded from: classes5.dex */
public enum DiagonalAvatarValues {
    Size48(48.0f, AvatarSize.Size32),
    Size64(64.0f, AvatarSize.Size48),
    Size96(96.0f, AvatarSize.Size64);

    public final AvatarSize avatarValue;
    public final float size;

    DiagonalAvatarValues(float f, AvatarSize avatarSize) {
        this.size = f;
        this.avatarValue = avatarSize;
    }
}
