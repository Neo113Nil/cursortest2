package com.squareup.cash.clientsync.network;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ResyncPolicy {
    public static final /* synthetic */ ResyncPolicy[] $VALUES;
    public static final ResyncPolicy GRADUAL;
    public static final ResyncPolicy IMMEDIATE;
    public static final ResyncPolicy NONE;

    static {
        ResyncPolicy resyncPolicy = new ResyncPolicy("IMMEDIATE", 0);
        IMMEDIATE = resyncPolicy;
        ResyncPolicy resyncPolicy2 = new ResyncPolicy("GRADUAL", 1);
        GRADUAL = resyncPolicy2;
        ResyncPolicy resyncPolicy3 = new ResyncPolicy("NONE", 2);
        NONE = resyncPolicy3;
        $VALUES = new ResyncPolicy[]{resyncPolicy, resyncPolicy2, resyncPolicy3};
    }

    public static ResyncPolicy valueOf(String str) {
        return (ResyncPolicy) Enum.valueOf(ResyncPolicy.class, str);
    }

    public static ResyncPolicy[] values() {
        return (ResyncPolicy[]) $VALUES.clone();
    }
}
