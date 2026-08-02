package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.common.collect.Iterators$7;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class zzacr implements Iterable, Serializable {
    public static final zzacq zza = new zzacq(zzaed.zza);
    public int zzb;

    static {
        int i = zzacf.$r8$clinit;
    }

    public static zzacq zzj(int i, int i2, byte[] bArr) {
        try {
            return zzk(i, i2, bArr);
        } catch (zzaeh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static zzacq zzk(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return zza;
        }
        zzn(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzacq(bArr2);
    }

    public static int zzn(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m(re$$ExternalSyntheticOutline0.m(i, "Beginning index: ", " < 0", new StringBuilder(String.valueOf(i).length() + 21)));
            return 0;
        }
        if (i2 < i) {
            TransportImpl$$ExternalSyntheticLambda0.m$1(String.valueOf(i).length() + 44 + String.valueOf(i2).length(), "Beginning index larger than ending index: ", ", ", i, i2);
            return 0;
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1(String.valueOf(i2).length() + 15 + String.valueOf(i3).length(), "End index: ", " >= ", i2, i3);
        return 0;
    }

    public static /* synthetic */ boolean zzo(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
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
        if (!(obj instanceof zzacr)) {
            return false;
        }
        zzacr zzacrVar = (zzacr) obj;
        int zzb = zzb();
        if (zzb != zzacrVar.zzb()) {
            return false;
        }
        if (zzb == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzacrVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzf(zzacrVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int zzb = zzb();
            i = zzg(zzb, zzb);
            if (i == 0) {
                i = 1;
            }
            this.zzb = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new Iterators$7(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("<ByteString@", zzb(), hexString, " size=", " contents=\""), zzb() <= 50 ? zzh.zza(zzm()) : zzh.zza(zzc(0, 47).zzm()).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract int zzb();

    public abstract zzacp zzc(int i, int i2);

    public abstract void zzd(int i, byte[] bArr);

    public abstract void zze(zzada zzadaVar);

    public abstract boolean zzf(zzacr zzacrVar);

    public abstract int zzg(int i, int i2);

    public final byte[] zzm() {
        int zzb = zzb();
        if (zzb == 0) {
            return zzaed.zza;
        }
        byte[] bArr = new byte[zzb];
        zzd(zzb, bArr);
        return bArr;
    }
}
