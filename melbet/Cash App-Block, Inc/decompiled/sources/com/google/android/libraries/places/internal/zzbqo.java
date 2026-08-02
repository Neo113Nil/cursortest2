package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzbqo {
    public static final zzbqo zzb;
    public static final /* synthetic */ zzbqo[] zze;

    /* JADX INFO: Fake field, exist only in values array */
    zzbqo EF0;

    static {
        zzbqo zzbqoVar = new zzbqo("CT_UNKNOWN", 0);
        zzbqo zzbqoVar2 = new zzbqo("CT_INFO", 1);
        zzb = zzbqoVar2;
        zze = new zzbqo[]{zzbqoVar, zzbqoVar2, new zzbqo("CT_WARNING", 2), new zzbqo("CT_ERROR", 3)};
    }

    public static zzbqo[] values() {
        return (zzbqo[]) zze.clone();
    }
}
