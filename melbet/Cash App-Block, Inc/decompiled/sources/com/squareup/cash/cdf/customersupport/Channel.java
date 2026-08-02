package com.squareup.cash.cdf.customersupport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Channel {
    public static final /* synthetic */ Channel[] $VALUES;
    public static final Channel CALLBACK;
    public static final Channel CHAT;
    public static final Channel EMAIL;

    static {
        Channel channel = new Channel("CALLBACK", 0);
        CALLBACK = channel;
        Channel channel2 = new Channel("CHAT", 1);
        CHAT = channel2;
        Channel channel3 = new Channel("EMAIL", 2);
        EMAIL = channel3;
        $VALUES = new Channel[]{channel, channel2, channel3, new Channel("TEXT", 3)};
    }

    public static Channel valueOf(String str) {
        return (Channel) Enum.valueOf(Channel.class, str);
    }

    public static Channel[] values() {
        return (Channel[]) $VALUES.clone();
    }
}
