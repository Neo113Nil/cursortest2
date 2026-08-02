package com.google.android.libraries.places.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzhv {
    public static final zzhv zzb;
    public static final /* synthetic */ zzhv[] zzd;

    /* JADX INFO: Fake field, exist only in values array */
    zzhv EF0;

    static {
        zzhv zzhvVar = new zzhv("ROUTING_SUMMARIES", 0);
        zzhv zzhvVar2 = new zzhv("NEXT_PAGE_TOKEN", 1);
        zzb = zzhvVar2;
        zzd = new zzhv[]{zzhvVar, zzhvVar2, new zzhv("SEARCH_URI", 2)};
    }

    public static zzhv valueOf(String str) {
        return (zzhv) Enum.valueOf(zzhv.class, str);
    }

    public static zzhv[] values() {
        return (zzhv[]) zzd.clone();
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? super.toString() : "searchUri" : "nextPageToken" : "routing_summaries";
    }
}
