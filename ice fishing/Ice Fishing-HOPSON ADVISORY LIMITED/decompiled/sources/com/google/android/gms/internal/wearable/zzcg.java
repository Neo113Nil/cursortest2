package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzcg implements Iterable, Serializable {
    public static final zzcg zza = new zzcf(zzdq.zza);
    private int zzb = 0;

    static {
        int i = zzbv.zza;
    }

    zzcg() {
    }

    public static zzcg zzk(byte[] bArr, int i, int i2) {
        try {
            return zzl(bArr, i, i2, false);
        } catch (zzdv e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static zzcg zzl(byte[] bArr, int i, int i2, boolean z) throws zzdv {
        if (i2 == 0) {
            return zza;
        }
        zzn(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzcf(bArr2);
    }

    static /* synthetic */ boolean zzo(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        zzn(i, i4, bArr.length);
        zzn(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcg)) {
            return false;
        }
        zzcg zzcgVar = (zzcg) obj;
        int zzb = zzb();
        if (zzb != zzcgVar.zzb()) {
            return false;
        }
        if (zzb == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzcgVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzf(zzcgVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int zzb = zzb();
            i = zzg(zzb, 0, zzb);
            if (i == 0) {
                i = 1;
            }
            this.zzb = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzca(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()), zzb() <= 50 ? zzfg.zza(zzm()) : zzfg.zza(zzc(0, 47).zzm()).concat("..."));
    }

    abstract byte zza(int i);

    public abstract int zzb();

    public abstract zzcg zzc(int i, int i2);

    protected abstract void zzd(byte[] bArr, int i, int i2, int i3);

    abstract void zze(zzbz zzbzVar) throws IOException;

    protected abstract boolean zzf(zzcg zzcgVar);

    protected abstract int zzg(int i, int i2, int i3);

    public abstract zzcj zzh();

    public final byte[] zzm() {
        int zzb = zzb();
        if (zzb == 0) {
            return zzdq.zza;
        }
        byte[] bArr = new byte[zzb];
        zzd(bArr, 0, 0, zzb);
        return bArr;
    }

    static int zzn(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
}
