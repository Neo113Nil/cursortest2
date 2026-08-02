package com.google.android.libraries.places.internal;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzccp extends OutputStream {
    public final /* synthetic */ zzccs zza;
    public final ArrayList zzb;
    public zzcig zzc;

    public /* synthetic */ zzccp(zzccs zzccsVar) {
        Objects.requireNonNull(zzccsVar);
        this.zza = zzccsVar;
        this.zzb = new ArrayList();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        zzcig zzcigVar = this.zzc;
        ArrayList arrayList = this.zzb;
        zzccs zzccsVar = this.zza;
        if (zzcigVar == null) {
            int max = Math.max(4096, i2);
            zzccsVar.zzh.getClass();
            zzcig zza = zzcih.zza(max);
            this.zzc = zza;
            arrayList.add(zza);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.zzc.zzb);
            zzcig zzcigVar2 = this.zzc;
            if (min == 0) {
                int i3 = zzcigVar2.zzc;
                int max2 = Math.max(i2, i3 + i3);
                zzccsVar.zzh.getClass();
                zzcig zza2 = zzcih.zza(max2);
                this.zzc = zza2;
                arrayList.add(zza2);
            } else {
                zzcigVar2.zza(i, min, bArr);
                i += min;
                i2 -= min;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        zzcig zzcigVar = this.zzc;
        byte b = (byte) i;
        if (zzcigVar != null && zzcigVar.zzb > 0) {
            zzcigVar.zza.zzA(b);
            zzcigVar.zzb--;
            zzcigVar.zzc++;
            return;
        }
        write(new byte[]{b}, 0, 1);
    }
}
