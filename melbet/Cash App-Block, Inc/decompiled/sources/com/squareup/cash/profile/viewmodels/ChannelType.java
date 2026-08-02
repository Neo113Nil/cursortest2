package com.squareup.cash.profile.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ChannelType {
    public static final /* synthetic */ ChannelType[] $VALUES;
    public static final ChannelType EMAIL;
    public static final ChannelType PUSH;
    public static final ChannelType SMS;

    static {
        ChannelType channelType = new ChannelType("EMAIL", 0);
        EMAIL = channelType;
        ChannelType channelType2 = new ChannelType("SMS", 1);
        SMS = channelType2;
        ChannelType channelType3 = new ChannelType("PUSH", 2);
        PUSH = channelType3;
        $VALUES = new ChannelType[]{channelType, channelType2, channelType3};
    }

    public static ChannelType valueOf(String str) {
        return (ChannelType) Enum.valueOf(ChannelType.class, str);
    }

    public static ChannelType[] values() {
        return (ChannelType[]) $VALUES.clone();
    }
}
