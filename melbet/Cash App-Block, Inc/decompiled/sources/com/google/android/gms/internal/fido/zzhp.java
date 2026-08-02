package com.google.android.gms.internal.fido;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class zzhp implements Comparable {
    public static int zzd(byte b) {
        return (b >> 5) & 7;
    }

    public static zzhp zzj(byte... bArr) {
        bArr.getClass();
        zzhs zzhsVar = new zzhs(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return zzh.zzb(zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int zza();

    public int zzb() {
        return 0;
    }

    public final zzhp zzc(Class cls) {
        if (cls.isInstance(this)) {
            return (zzhp) cls.cast(this);
        }
        throw new zzho(CameraSelector$$ExternalSyntheticOutline0.m("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
