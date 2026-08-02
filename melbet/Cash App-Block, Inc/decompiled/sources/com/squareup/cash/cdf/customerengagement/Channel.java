package com.squareup.cash.cdf.customerengagement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Channel {
    public static final /* synthetic */ Channel[] $VALUES;
    public static final Channel PUSH;

    /* JADX INFO: Fake field, exist only in values array */
    Channel EF0;

    static {
        Channel channel = new Channel("EMAIL", 0);
        Channel channel2 = new Channel("PUSH", 1);
        PUSH = channel2;
        $VALUES = new Channel[]{channel, channel2, new Channel("SMS", 2)};
    }

    public static Channel valueOf(String str) {
        return (Channel) Enum.valueOf(Channel.class, str);
    }

    public static Channel[] values() {
        return (Channel[]) $VALUES.clone();
    }
}
