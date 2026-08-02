package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zzgk implements Comparator {
    public static final zzgk zza;
    public static final /* synthetic */ zzgk[] zzb;

    static {
        zzgk zzgkVar = new zzgk("INSTANCE", 0);
        zza = zzgkVar;
        zzb = new zzgk[]{zzgkVar};
    }

    public static zzgk[] values() {
        return (zzgk[]) zzb.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
