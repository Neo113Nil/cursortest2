package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzckm {
    public static final zzckm zzb;
    public static final /* synthetic */ zzckm[] zzd;

    /* JADX INFO: Fake field, exist only in values array */
    zzckm EF0;

    static {
        zzckm zzckmVar = new zzckm("BLOCKING", 0);
        zzckm zzckmVar2 = new zzckm("FUTURE", 1);
        zzb = zzckmVar2;
        zzd = new zzckm[]{zzckmVar, zzckmVar2, new zzckm("ASYNC", 2)};
    }

    public static zzckm[] values() {
        return (zzckm[]) zzd.clone();
    }
}
