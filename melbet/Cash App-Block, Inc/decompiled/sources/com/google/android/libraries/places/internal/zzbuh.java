package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzbuh {
    public static final zzbuh zzb;
    public static final zzbuh zzc;
    public static final /* synthetic */ zzbuh[] zzd;

    /* JADX INFO: Fake field, exist only in values array */
    zzbuh EF0;

    static {
        zzbuh zzbuhVar = new zzbuh("FAKE", 0);
        zzbuh zzbuhVar2 = new zzbuh("MTLS", 1);
        zzb = zzbuhVar2;
        zzbuh zzbuhVar3 = new zzbuh("CUSTOM_MANAGERS", 2);
        zzc = zzbuhVar3;
        zzd = new zzbuh[]{zzbuhVar, zzbuhVar2, zzbuhVar3};
    }

    public static zzbuh[] values() {
        return (zzbuh[]) zzd.clone();
    }
}
