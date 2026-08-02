package com.squareup.cash.clientroutes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ClientRouteTag {
    public static final /* synthetic */ ClientRouteTag[] $VALUES;
    public static final ClientRouteTag MANAGED_ACCOUNT_ALLOWED;

    static {
        ClientRouteTag clientRouteTag = new ClientRouteTag("MANAGED_ACCOUNT_ALLOWED", 0);
        MANAGED_ACCOUNT_ALLOWED = clientRouteTag;
        $VALUES = new ClientRouteTag[]{clientRouteTag};
    }

    public static ClientRouteTag valueOf(String str) {
        return (ClientRouteTag) Enum.valueOf(ClientRouteTag.class, str);
    }

    public static ClientRouteTag[] values() {
        return (ClientRouteTag[]) $VALUES.clone();
    }
}
