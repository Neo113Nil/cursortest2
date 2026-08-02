package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.Iterators$7;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class zzaks implements Iterable, Serializable {
    public static final zzaks zzb = new zzaks(zzalx.zzb);
    public final byte[] zza;
    public int zza$1 = 0;

    static {
        int i = zzaki.$r8$clinit;
    }

    public zzaks(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public static int zzg(int i, int i2, int i3) {
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

    public static zzaks zzi(int i, int i2, byte[] bArr) {
        zzg(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzaks(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzaks) && zzd() == ((zzaks) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (!(obj instanceof zzaks)) {
                return obj.equals(this);
            }
            zzaks zzaksVar = (zzaks) obj;
            int i = this.zza$1;
            int i2 = zzaksVar.zza$1;
            if (i == 0 || i2 == 0 || i == i2) {
                int zzd = zzd();
                if (zzd > zzaksVar.zzd()) {
                    a$$ExternalSyntheticBUOutline0.m(zzd, zzd());
                    return false;
                }
                if (zzd > zzaksVar.zzd()) {
                    a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Ran off end of other: 0, ", zzd, zzaksVar.zzd(), ", "));
                    return false;
                }
                byte[] bArr = zzaksVar.zza;
                int i3 = 0;
                int i4 = 0;
                while (i3 < zzd) {
                    if (this.zza[i3] == bArr[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza$1;
        if (i != 0) {
            return i;
        }
        int zzd = zzd();
        int i2 = zzd;
        for (int i3 = 0; i3 < zzd; i3++) {
            i2 = (i2 * 31) + this.zza[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.zza$1 = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new Iterators$7(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        if (zzd() <= 50) {
            concat = zzanl.zza(this);
        } else {
            int zzg = zzg(0, 47, zzd());
            concat = zzanl.zza(zzg == 0 ? zzb : new zzakp(this.zza, zzg)).concat("...");
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("<ByteString@", zzd, hexString, " size=", " contents=\""), concat, "\">");
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzd() {
        return this.zza.length;
    }
}
