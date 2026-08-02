package com.squareup.cash.sharesheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ShareIcon {
    public static final /* synthetic */ ShareIcon[] $VALUES;
    public static final ShareIcon COPY_TO_CLIPBOARD_ICON;
    public static final ShareIcon INSTAGRAM_ICON;
    public static final ShareIcon MORE_ICON;
    public static final ShareIcon SAVE_TO_PHOTOS_ICON;
    public static final ShareIcon SMS_ICON;
    public static final ShareIcon X_ICON;

    static {
        ShareIcon shareIcon = new ShareIcon("X_ICON", 0);
        X_ICON = shareIcon;
        ShareIcon shareIcon2 = new ShareIcon("INSTAGRAM_ICON", 1);
        INSTAGRAM_ICON = shareIcon2;
        ShareIcon shareIcon3 = new ShareIcon("SMS_ICON", 2);
        SMS_ICON = shareIcon3;
        ShareIcon shareIcon4 = new ShareIcon("COPY_TO_CLIPBOARD_ICON", 3);
        COPY_TO_CLIPBOARD_ICON = shareIcon4;
        ShareIcon shareIcon5 = new ShareIcon("SAVE_TO_PHOTOS_ICON", 4);
        SAVE_TO_PHOTOS_ICON = shareIcon5;
        ShareIcon shareIcon6 = new ShareIcon("MORE_ICON", 5);
        MORE_ICON = shareIcon6;
        $VALUES = new ShareIcon[]{shareIcon, shareIcon2, shareIcon3, shareIcon4, shareIcon5, shareIcon6};
    }

    public static ShareIcon valueOf(String str) {
        return (ShareIcon) Enum.valueOf(ShareIcon.class, str);
    }

    public static ShareIcon[] values() {
        return (ShareIcon[]) $VALUES.clone();
    }
}
