package com.squareup.cash.clientsync.syncer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ClientSyncer$Result {
    public static final /* synthetic */ ClientSyncer$Result[] $VALUES;
    public static final ClientSyncer$Result Failure;
    public static final ClientSyncer$Result Success;

    static {
        ClientSyncer$Result clientSyncer$Result = new ClientSyncer$Result("Success", 0);
        Success = clientSyncer$Result;
        ClientSyncer$Result clientSyncer$Result2 = new ClientSyncer$Result("Failure", 1);
        Failure = clientSyncer$Result2;
        $VALUES = new ClientSyncer$Result[]{clientSyncer$Result, clientSyncer$Result2};
    }

    public static ClientSyncer$Result valueOf(String str) {
        return (ClientSyncer$Result) Enum.valueOf(ClientSyncer$Result.class, str);
    }

    public static ClientSyncer$Result[] values() {
        return (ClientSyncer$Result[]) $VALUES.clone();
    }
}
