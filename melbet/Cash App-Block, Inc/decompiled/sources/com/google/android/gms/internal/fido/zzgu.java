package com.google.android.gms.internal.fido;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.Iterators$7;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class zzgu implements Iterable, Serializable {
    public static final zzgu zzb = new zzgu(zzhc.zzd);
    public final byte[] zza;
    public int zzc = 0;

    static {
        int i = zzgn.$r8$clinit;
    }

    public zzgu(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Beginning index larger than ending index: ", i, i2, ", "));
            return 0;
        }
        Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("End index: ", i2, i3, " >= "));
        return 0;
    }

    public static zzgu zzl(int i, byte[] bArr) {
        zzj(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new zzgu(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgu) && zzd() == ((zzgu) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (!(obj instanceof zzgu)) {
                return obj.equals(this);
            }
            zzgu zzguVar = (zzgu) obj;
            int i = this.zzc;
            int i2 = zzguVar.zzc;
            if (i == 0 || i2 == 0 || i == i2) {
                int zzd = zzd();
                if (zzd > zzguVar.zzd()) {
                    a$$ExternalSyntheticBUOutline0.m(zzd, zzd());
                    return false;
                }
                if (zzd > zzguVar.zzd()) {
                    a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Ran off end of other: 0, ", zzd, zzguVar.zzd(), ", "));
                    return false;
                }
                byte[] bArr = zzguVar.zza;
                int zzc = zzc() + zzd;
                int zzc2 = zzc();
                int zzc3 = zzguVar.zzc();
                while (zzc2 < zzc) {
                    if (this.zza[zzc2] == bArr[zzc3]) {
                        zzc2++;
                        zzc3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int zzd = zzd();
        int zzc = zzc();
        byte[] bArr = zzhc.zzd;
        int i2 = zzd;
        for (int i3 = zzc; i3 < zzc + zzd; i3++) {
            i2 = (i2 * 31) + this.zza[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.zzc = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new Iterators$7(this);
    }

    public final String toString() {
        zzgu zzgrVar;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        if (zzd() <= 50) {
            concat = zzh.zza(this);
        } else {
            int zzj = zzj(0, 47, zzd());
            if (zzj == 0) {
                zzgrVar = zzb;
            } else {
                zzgrVar = new zzgr(this.zza, zzc(), zzj);
            }
            concat = zzh.zza(zzgrVar).concat("...");
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("<ByteString@", zzd, hexString, " size=", " contents=\""), concat, "\">");
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public void zze(int i, byte[] bArr) {
        System.arraycopy(this.zza, 0, bArr, 0, i);
    }

    public final ByteArrayInputStream zzh() {
        return new ByteArrayInputStream(this.zza, zzc(), zzd());
    }

    public final byte[] zzm() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzhc.zzd;
        }
        byte[] bArr = new byte[zzd];
        zze(zzd, bArr);
        return bArr;
    }
}
