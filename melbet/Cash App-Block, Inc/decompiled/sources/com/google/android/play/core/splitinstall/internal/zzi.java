package com.google.android.play.core.splitinstall.internal;

import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.util.LruCache;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericAnalyticsData;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public abstract class zzi {
    public static final void applyPlaceholderFix(TextInputLayout textInputLayout) {
        textInputLayout.getClass();
        try {
            Field declaredField = textInputLayout.getClass().getDeclaredField("placeholderTextView");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(textInputLayout);
            TextView textView = obj instanceof TextView ? (TextView) obj : null;
            if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        } catch (Exception unused) {
        }
    }

    public static final GenericAnalyticsData toAnalyticsData(AnalyticsEvent analyticsEvent) {
        analyticsEvent.getClass();
        String str = analyticsEvent.name;
        str.getClass();
        return new GenericAnalyticsData(str, analyticsEvent.parameters);
    }

    public static X509Certificate[][] zza(String str) {
        Pair zzf;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                zzf = null;
            } else {
                zzf = zzj.zzf(randomAccessFile, 0);
                if (zzf == null) {
                    zzf = zzj.zzf(randomAccessFile, 65535);
                }
            }
            if (zzf == null) {
                throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) zzf.first;
            long longValue = ((Long) zzf.second).longValue();
            long j = longValue - 20;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            zzj.zzg(byteBuffer);
            long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & BodyPartID.bodyIdMax;
            if (j2 >= longValue) {
                throw new zzf("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + longValue);
            }
            zzj.zzg(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & BodyPartID.bodyIdMax) + j2 != longValue) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j2 < 32) {
                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j2 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            long j3 = allocate.getLong(0);
            long j4 = j2;
            if (j3 < allocate.capacity() || j3 > 2147483639) {
                throw new zzf("APK Signing Block size out of range: " + j3);
            }
            int i = (int) (8 + j3);
            long j5 = j4 - i;
            if (j5 < 0) {
                throw new zzf("APK Signing Block offset out of range: " + j5);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(byteOrder);
            randomAccessFile.seek(j5);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j6 = allocate2.getLong(0);
            if (j6 != j3) {
                throw new zzf("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j5));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            if (capacity < 8) {
                throw new IllegalArgumentException("end < start: " + capacity + " < 8");
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
            }
            int limit = byteBuffer2.limit();
            int position = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(capacity);
                byteBuffer2.position(8);
                ByteBuffer slice = byteBuffer2.slice();
                slice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                int i2 = 0;
                while (slice.hasRemaining()) {
                    i2++;
                    if (slice.remaining() < 8) {
                        throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i2);
                    }
                    long j7 = slice.getLong();
                    if (j7 < 4 || j7 > 2147483647L) {
                        throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + j7);
                    }
                    int i3 = (int) j7;
                    int position2 = slice.position() + i3;
                    if (i3 > slice.remaining()) {
                        throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + slice.remaining());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zze(zze(i3 - 4, slice), longValue2, j4, longValue, byteBuffer));
                        randomAccessFile.close();
                        return zzl;
                    }
                    long j8 = longValue2;
                    long j9 = longValue;
                    long j10 = j4;
                    ByteBuffer byteBuffer3 = byteBuffer;
                    slice.position(position2);
                    longValue = j9;
                    byteBuffer = byteBuffer3;
                    j4 = j10;
                    longValue2 = j8;
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int zzb(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown content digest algorthm: "));
        return 0;
    }

    public static int zzc(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
            case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                return 1;
            case SDK_ASSET_HEADER_BOLT_VALUE:
            case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                return 2;
            default:
                a$$ExternalSyntheticBUOutline0.m$3("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                return 0;
        }
    }

    public static String zzd(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown content digest algorthm: "));
        return null;
    }

    public static ByteBuffer zze(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
            return null;
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return zze(i, byteBuffer);
        }
        a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("Length-prefixed field longer than remaining buffer. Field length: ", i, byteBuffer.remaining(), ", remaining: "));
        return null;
    }

    public static void zzg(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[] zzi(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$4("Negative length");
            return null;
        }
        if (i > byteBuffer.remaining()) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("Underflow while reading length-prefixed value. Length: ", i, byteBuffer.remaining(), ", available: "));
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = zzc(r6);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] zzj(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer zzf = zzf(byteBuffer);
        ByteBuffer zzf2 = zzf(byteBuffer);
        byte[] zzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i2 = 0;
        while (zzf2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer zzf3 = zzf(zzf2);
                if (zzf3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = zzf3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                        case SDK_ASSET_HEADER_BOLT_VALUE:
                        case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                        case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = zzi(zzf3);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                case SDK_ASSET_HEADER_BOLT_VALUE:
                case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    str = "RSA";
                    break;
                default:
                    a$$ExternalSyntheticBUOutline0.m$3("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case SDK_ASSET_HEADER_BOLT_VALUE:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    a$$ExternalSyntheticBUOutline0.m$3("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(zzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(zzf);
            if (!signature.verify(bArr2)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            zzf.clear();
            ByteBuffer zzf4 = zzf(zzf);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (zzf4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer zzf5 = zzf(zzf4);
                    if (zzf5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = zzf5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArr = zzi(zzf5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    throw new IOException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "Failed to parse digest record #"), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int zzc = zzc(i);
            byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(zzc), bArr);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                throw new SecurityException(zzd(zzc).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer zzf6 = zzf(zzf);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (zzf6.hasRemaining()) {
                i6++;
                byte[] zzi2 = zzi(zzf6);
                try {
                    arrayList3.add(new zzg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)), zzi2));
                } catch (CertificateException e3) {
                    throw new SecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i6, "Failed to decode certificate #"), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(zzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to verify ", str2, " signature"), e4);
        }
    }

    public static byte[][] zzk(int[] iArr, zzb[] zzbVarArr) {
        long j;
        int i;
        int length;
        char c;
        byte[][] bArr;
        String str;
        int i2 = 0;
        int i3 = 0;
        long j2 = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            j2 += (zzbVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j2 >= 2097151) {
            throw new DigestException(Recorder$$ExternalSyntheticOutline2.m(j2, "Too many chunks: "));
        }
        byte[][] bArr2 = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) j2;
            byte[] bArr3 = new byte[(zzb(iArr[i4]) * i5) + 5];
            bArr3[0] = 90;
            zzg(i5, bArr3);
            bArr2[i4] = bArr3;
            i4++;
        }
        byte[] bArr4 = new byte[5];
        bArr4[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i6 = 0;
        while (true) {
            bArr = null;
            str = " digest not supported";
            if (i6 >= iArr.length) {
                break;
            }
            String zzd = zzd(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(zzd);
                i6++;
            } catch (NoSuchAlgorithmException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m(zzd.concat(" digest not supported"), (Throwable) e);
                return null;
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i7 < i; i = 3) {
            zzb zzbVar = zzbVarArr[i7];
            int i9 = i7;
            long zza = zzbVar.zza();
            byte[][] bArr5 = bArr2;
            long j3 = 0;
            while (zza > 0) {
                byte[][] bArr6 = bArr;
                String str2 = str;
                int min = (int) Math.min(zza, j);
                zzg(min, bArr4);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr4);
                }
                try {
                    zzbVar.zzb(messageDigestArr, j3, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr7 = bArr5[i11];
                        int zzb = zzb(i12);
                        char c2 = c;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        zzb zzbVar2 = zzbVar;
                        int digest = messageDigest.digest(bArr7, (i8 * zzb) + 5, zzb);
                        if (digest != zzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i11++;
                        c = c2;
                        zzbVar = zzbVar2;
                    }
                    long j4 = min;
                    j3 += j4;
                    zza -= j4;
                    i8++;
                    bArr = bArr6;
                    str = str2;
                    j = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(Recorder$$ExternalSyntheticOutline2.m("Failed to digest chunk #", i8, i2, " of section #"), e2);
                }
            }
            i2++;
            i7 = i9 + 1;
            bArr2 = bArr5;
            j = 1048576;
        }
        byte[][] bArr8 = bArr2;
        byte[][] bArr9 = bArr;
        String str3 = str;
        byte[][] bArr10 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr11 = bArr8[i13];
            String zzd2 = zzd(i14);
            try {
                bArr10[i13] = MessageDigest.getInstance(zzd2).digest(bArr11);
            } catch (NoSuchAlgorithmException e3) {
                OptionalProvider$$ExternalSyntheticLambda0.m(zzd2.concat(str3), (Throwable) e3);
                return bArr9;
            }
        }
        return bArr10;
    }

    public static X509Certificate[][] zzl(FileChannel fileChannel, zze zzeVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer zzf = zzf(zzeVar.zza);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j = zzeVar.zzb;
                long j2 = zzeVar.zzc;
                long j3 = zzeVar.zzd;
                ByteBuffer byteBuffer = zzeVar.zze;
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                LruCache lruCache = new LruCache(fileChannel, 0L, j);
                LruCache lruCache2 = new LruCache(fileChannel, j2, j3 - j2);
                ByteBuffer duplicate = byteBuffer.duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                zzj.zzg(duplicate);
                int position = duplicate.position() + 16;
                if (j < 0 || j > BodyPartID.bodyIdMax) {
                    a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m(j, "uint32 value of out range: "));
                    return null;
                }
                duplicate.putInt(duplicate.position() + position, (int) j);
                VideoDecoder.AnonymousClass1 anonymousClass1 = new VideoDecoder.AnonymousClass1(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] zzk = zzk(iArr, new zzb[]{lruCache, lruCache2, anonymousClass1});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), zzk[i3])) {
                            throw new SecurityException(zzd(i4).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Failed to obtain X.509 CertificateFactory", (Throwable) e4);
            return null;
        }
    }
}
