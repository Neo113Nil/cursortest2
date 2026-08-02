package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.stripe.android.uicore.elements.H6TextKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public abstract class zzdf implements Iterable, Serializable {
    public static final zzde zzb = new zzde(zzep.zzb);
    public int zza = 0;

    static {
        int i = zzct.$r8$clinit;
    }

    public static zzdf zzc(Iterator it, int i) {
        if (i <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "length (", ") must be >= 1"));
            return null;
        }
        if (i == 1) {
            return (zzdf) it.next();
        }
        int i2 = i >>> 1;
        zzdf zzc = zzc(it, i2);
        zzdf zzc2 = zzc(it, i - i2);
        if (Integer.MAX_VALUE - zzc.zzd() < zzc2.zzd()) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("ByteString would be too long: ", zzc.zzd(), zzc2.zzd(), Marker.ANY_NON_NULL_MARKER));
            return null;
        }
        if (zzc2.zzd() == 0) {
            return zzc;
        }
        if (zzc.zzd() == 0) {
            return zzc2;
        }
        int zzd = zzc2.zzd() + zzc.zzd();
        if (zzd < 128) {
            int zzd2 = zzc.zzd();
            int zzd3 = zzc2.zzd();
            int i3 = zzd2 + zzd3;
            byte[] bArr = new byte[i3];
            zzo(0, zzd2, zzc.zzd());
            zzo(0, zzd2, i3);
            if (zzd2 > 0) {
                zzc.zze(0, 0, zzd2, bArr);
            }
            zzo(0, zzd3, zzc2.zzd());
            zzo(zzd2, i3, i3);
            if (zzd3 > 0) {
                zzc2.zze(0, zzd2, zzd3, bArr);
            }
            return new zzde(bArr);
        }
        if (zzc instanceof zzgd) {
            zzgd zzgdVar = (zzgd) zzc;
            zzdf zzdfVar = zzgdVar.zzd;
            zzdf zzdfVar2 = zzgdVar.zze;
            if (zzc2.zzd() + zzdfVar2.zzd() < 128) {
                int zzd4 = zzdfVar2.zzd();
                int zzd5 = zzc2.zzd();
                int i4 = zzd4 + zzd5;
                byte[] bArr2 = new byte[i4];
                zzo(0, zzd4, zzdfVar2.zzd());
                zzo(0, zzd4, i4);
                if (zzd4 > 0) {
                    zzdfVar2.zze(0, 0, zzd4, bArr2);
                }
                zzo(0, zzd5, zzc2.zzd());
                zzo(zzd4, i4, i4);
                if (zzd5 > 0) {
                    zzc2.zze(0, zzd4, zzd5, bArr2);
                }
                return new zzgd(zzdfVar, new zzde(bArr2));
            }
            if (zzdfVar.zzf() > zzdfVar2.zzf() && zzgdVar.zzg > zzc2.zzf()) {
                return new zzgd(zzdfVar, new zzgd(zzdfVar2, zzc2));
            }
        }
        if (zzd >= zzgd.zzc(Math.max(zzc.zzf(), zzc2.zzf()) + 1)) {
            return new zzgd(zzc, zzc2);
        }
        zzfe zzfeVar = new zzfe(3);
        zzfeVar.zzb(zzc);
        zzfeVar.zzb(zzc2);
        ArrayDeque arrayDeque = (ArrayDeque) zzfeVar.zzb;
        zzdf zzdfVar3 = (zzdf) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzdfVar3 = new zzgd((zzdf) arrayDeque.pop(), zzdfVar3);
        }
        return zzdfVar3;
    }

    public static int zzo(int i, int i2, int i3) {
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

    public static zzde zzr(int i, int i2, byte[] bArr) {
        zzo(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzde(bArr2);
    }

    public static zzdf zzs(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            zzde zzr = i2 == 0 ? null : zzr(0, i2, bArr);
            if (zzr == null) {
                break;
            }
            arrayList.add(zzr);
            i = Math.min(i + i, PKIFailureInfo.certRevoked);
        }
        int size = arrayList.size();
        return size == 0 ? zzb : zzc(arrayList.iterator(), size);
    }

    public static void zzu(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                JWK$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Index < 0: "));
            } else {
                JWK$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Index > length: ", i, i2, ", "));
            }
        }
    }

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzd = zzd();
            i = zzi(zzd, 0, zzd);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("<ByteString@", zzd(), hexString, " size=", " contents=\""), zzd() <= 50 ? H6TextKt.zza(this) : H6TextKt.zza(zzk(0, 47)).concat("..."), "\">");
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(int i, int i2, int i3, byte[] bArr);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzdf zzk(int i, int i2);

    public abstract String zzl(Charset charset);

    public abstract void zzm(zzdk zzdkVar);

    public abstract boolean zzn();

    @Override // java.lang.Iterable
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.common.zzak iterator() {
        return new zzcy(this);
    }
}
