package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzo {
    public static final zzo zza;
    public static final AtomicReference zzb;
    public static final /* synthetic */ zzo[] zzc;

    static {
        zzo zzoVar = new zzo("INSTANCE", 0);
        zza = zzoVar;
        zzc = new zzo[]{zzoVar};
        zzb = new AtomicReference(null);
    }

    public static zzo[] values() {
        return (zzo[]) zzc.clone();
    }
}
