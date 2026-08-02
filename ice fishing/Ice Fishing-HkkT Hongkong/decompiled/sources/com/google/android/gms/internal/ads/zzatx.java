package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzatx {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    static String zza(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        Vector zzb2 = zzb(bArr, 255);
        if (zzb2 == null || zzb2.isEmpty()) {
            zzg = zzg(zzf(4096).zzax(), str, true);
        } else {
            zzatp zza2 = zzatq.zza();
            int size = zzb2.size();
            for (int i = 0; i < size; i++) {
                zza2.zza(zzgyl.zzv(zzg((byte[]) zzb2.get(i), str, false), 0, 256));
            }
            byte[] zze2 = zze(bArr);
            zzgyl zzgylVar = zzgyl.zzb;
            zza2.zzb(zzgyl.zzv(zze2, 0, zze2.length));
            zzg = ((zzatq) zza2.zzal()).zzax();
        }
        return zzatt.zza(zzg, true);
    }

    static Vector zzb(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void zzd() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzatw(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzatx.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (zze) {
            zzd();
            MessageDigest messageDigest2 = null;
            try {
                if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            throw new NoSuchAlgorithmException("Cannot compute hash");
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    static zzatd zzf(int i) {
        zzasg zza2 = zzatd.zza();
        zza2.zzD(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return (zzatd) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzf(4096).zzax();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i2).put(b).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i2).put(b).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzaty[] zzatyVarArr = new zzaux().zzcG;
        int length3 = zzatyVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzatyVarArr[i3].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzatr(str.getBytes(Key.STRING_CHARSET_NAME)).zza(bArr3);
        }
        return bArr3;
    }
}
