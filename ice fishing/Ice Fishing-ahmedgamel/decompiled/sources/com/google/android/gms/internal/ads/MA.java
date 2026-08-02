package com.google.android.gms.internal.ads;

import S7.AbstractC0406y;
import S7.EnumC0405x;
import S7.InterfaceC0404w;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.anythink.core.common.d.j;
import com.facebook.ads.AdError;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class MA {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26264n;

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f26258u = {AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: v, reason: collision with root package name */
    public static final C4089w8 f26259v = new C4089w8(0);

    /* renamed from: w, reason: collision with root package name */
    public static final C4089w8 f26260w = new C4089w8(1);

    /* renamed from: x, reason: collision with root package name */
    public static final C4089w8 f26261x = new C4089w8(15);

    /* renamed from: y, reason: collision with root package name */
    public static final C4089w8 f26262y = new C4089w8(29);

    /* renamed from: z, reason: collision with root package name */
    public static final C2812Ul f26263z = new C2812Ul(9);

    /* renamed from: A, reason: collision with root package name */
    public static final C2812Ul f26249A = new C2812Ul(16);

    /* renamed from: B, reason: collision with root package name */
    public static final C2812Ul f26250B = new C2812Ul(22);

    /* renamed from: C, reason: collision with root package name */
    public static final Bs f26251C = new Bs(2);

    /* renamed from: D, reason: collision with root package name */
    public static final Bs f26252D = new Bs(8);

    /* renamed from: E, reason: collision with root package name */
    public static final R2 f26253E = new R2(4);

    /* renamed from: F, reason: collision with root package name */
    public static final Bs f26254F = new Bs(19);

    /* renamed from: G, reason: collision with root package name */
    public static final IF f26255G = new IF(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: H, reason: collision with root package name */
    public static final S0.s f26256H = new S0.s(21, new C3481ku(20, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f26257I = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public /* synthetic */ MA(int i) {
        this.f26264n = i;
    }

    public static void A(Bundle bundle, String str, int i, boolean z3) {
        if (z3) {
            bundle.putInt(str, i);
        }
    }

    public static void B(C4233yr c4233yr) {
        int h9;
        int h10 = c4233yr.h(2);
        if (h10 == 0) {
            c4233yr.f(6);
            return;
        }
        int R8 = R(c4233yr, 5, 8, 16) + 1;
        if (h10 == 1) {
            c4233yr.f(R8 * 7);
            return;
        }
        if (h10 == 2) {
            boolean g4 = c4233yr.g();
            int i = true != g4 ? 5 : 1;
            int i6 = true == g4 ? 7 : 5;
            int i9 = true == g4 ? 8 : 6;
            int i10 = 0;
            while (i10 < R8) {
                if (c4233yr.g()) {
                    c4233yr.f(7);
                    h9 = 0;
                } else {
                    if (c4233yr.h(2) == 3 && c4233yr.h(i6) * i != 0) {
                        c4233yr.e();
                    }
                    h9 = c4233yr.h(i9) * i;
                    if (h9 != 0 && h9 != 180) {
                        c4233yr.e();
                    }
                    c4233yr.e();
                }
                if (h9 != 0 && h9 != 180 && c4233yr.g()) {
                    i10++;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r12 = V(r6);
        r13 = V(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r12 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r13 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X509Certificate[] C(ByteBuffer byteBuffer, HashMap hashMap, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer h02 = h0(byteBuffer);
        ByteBuffer h03 = h0(byteBuffer);
        byte[] j02 = j0(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = -1;
        int i6 = 0;
        while (h03.hasRemaining()) {
            i6++;
            try {
                ByteBuffer h04 = h0(h03);
                if (h04.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i9 = h04.getInt();
                arrayList.add(Integer.valueOf(i9));
                if (i9 != 513 && i9 != 514 && i9 != 769) {
                    switch (i9) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = j0(h04);
                i = i9;
            } catch (IOException e9) {
                e = e9;
                throw new SecurityException(D.y.m(i6, "Failed to parse signature record #", new StringBuilder(String.valueOf(i6).length() + 34)), e);
            } catch (BufferUnderflowException e10) {
                e = e10;
                throw new SecurityException(D.y.m(i6, "Failed to parse signature record #", new StringBuilder(String.valueOf(i6).length() + 34)), e);
            }
        }
        if (i == -1) {
            if (i6 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
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
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(j02));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(h02);
            if (!signature.verify(bArr2)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            h02.clear();
            ByteBuffer h05 = h0(h02);
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            while (h05.hasRemaining()) {
                i10++;
                try {
                    ByteBuffer h06 = h0(h05);
                    if (h06.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i11 = h06.getInt();
                    arrayList2.add(Integer.valueOf(i11));
                    if (i11 == i) {
                        bArr = j0(h06);
                    }
                } catch (IOException e11) {
                    e = e11;
                    throw new IOException(D.y.m(i10, "Failed to parse digest record #", new StringBuilder(String.valueOf(i10).length() + 31)), e);
                } catch (BufferUnderflowException e12) {
                    e = e12;
                    throw new IOException(D.y.m(i10, "Failed to parse digest record #", new StringBuilder(String.valueOf(i10).length() + 31)), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int V8 = V(i);
            byte[] bArr3 = (byte[]) hashMap.put(Integer.valueOf(V8), bArr);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                throw new SecurityException(W(V8).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer h07 = h0(h02);
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (h07.hasRemaining()) {
                i12++;
                byte[] j03 = j0(h07);
                try {
                    arrayList3.add(new T4((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(j03)), j03));
                } catch (CertificateException e13) {
                    throw new SecurityException(D.y.m(i12, "Failed to decode certificate #", new StringBuilder(String.valueOf(i12).length() + 30)), e13);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(j02, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e14) {
            e = e14;
            throw new SecurityException(D.y.s(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e15) {
            e = e15;
            throw new SecurityException(D.y.s(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e16) {
            e = e16;
            throw new SecurityException(D.y.s(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e17) {
            e = e17;
            throw new SecurityException(D.y.s(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e18) {
            e = e18;
            throw new SecurityException(D.y.s(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e);
        }
    }

    public static C3500lC D(byte[] bArr, int i, int i6) {
        if (i6 >= bArr.length) {
            return RB.j("");
        }
        PB pb = RB.f27177u;
        q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int a02 = a0(bArr, i6, i);
        int i9 = 0;
        while (i6 < a02) {
            String str = new String(bArr, i6, a02 - i6, S(i));
            int length = objArr.length;
            int i10 = i9 + 1;
            int d2 = MB.d(length, i10);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i9] = str;
            i6 = f0(i) + a02;
            a02 = a0(bArr, i6, i);
            i9 = i10;
        }
        C3500lC p9 = RB.p(objArr, i9);
        return p9.isEmpty() ? RB.j("") : p9;
    }

    public static void E(Bundle bundle, String str, boolean z3, boolean z6) {
        if (z6) {
            bundle.putBoolean(str, z3);
        }
    }

    public static void F(C4233yr c4233yr, B0 b02) {
        int h9 = c4233yr.h(5);
        c4233yr.f(2);
        if (c4233yr.g()) {
            c4233yr.f(5);
        }
        if (h9 >= 7 && h9 <= 10) {
            c4233yr.e();
        }
        if (c4233yr.g()) {
            int h10 = c4233yr.h(3);
            if (b02.f23797b == -1 && h9 >= 0 && h9 <= 15 && (h10 == 0 || h10 == 1)) {
                b02.f23797b = h9;
            }
            if (c4233yr.g()) {
                U(c4233yr);
            }
        }
    }

    public static void G(File file, boolean z3) {
        if (z3 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void H(List list, XA xa, int i, int i6) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i6) {
                break;
            } else if (xa.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i6--;
            if (i6 < i) {
                return;
            } else {
                list.remove(i6);
            }
        }
    }

    public static int I(int i, Cr cr) {
        byte[] bArr = cr.f24252a;
        int i6 = cr.f24253b;
        int i9 = i6;
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= i6 + i) {
                return i;
            }
            if ((bArr[i9] & 255) == 255 && bArr[i10] == 0) {
                System.arraycopy(bArr, i9 + 2, bArr, i10, (i - (i9 - i6)) - 2);
                i--;
            }
            i9 = i10;
        }
    }

    public static TextView J(Context context, String str, int i, int i6, float f3, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        T(-2, -2, textView);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f3, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i6);
        textView.setText(str);
        return textView;
    }

    public static void K(C4233yr c4233yr) {
        c4233yr.f(3);
        c4233yr.f(8);
        boolean g4 = c4233yr.g();
        boolean g9 = c4233yr.g();
        if (g4) {
            c4233yr.f(5);
        }
        if (g9) {
            c4233yr.f(6);
        }
    }

    public static void L(C4233yr c4233yr, B0 b02) {
        c4233yr.f(2);
        boolean g4 = c4233yr.g();
        int h9 = c4233yr.h(8);
        for (int i = 0; i < h9; i++) {
            c4233yr.f(2);
            if (c4233yr.g()) {
                c4233yr.f(5);
            }
            if (g4) {
                c4233yr.f(24);
            } else {
                if (c4233yr.g()) {
                    if (!c4233yr.g()) {
                        c4233yr.f(4);
                    }
                    b02.f23798c = c4233yr.h(6) + 1;
                }
                c4233yr.f(4);
            }
        }
        if (c4233yr.g()) {
            c4233yr.f(3);
            if (c4233yr.g()) {
                U(c4233yr);
            }
        }
    }

    public static void M(String str, Bundle bundle, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static boolean N(File file) {
        boolean z3;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z3 = true;
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                z3 = file2 != null && N(file2) && z3;
            }
        } else {
            z3 = true;
        }
        return file.delete() && z3;
    }

    public static /* synthetic */ boolean O(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        AbstractC2968bG.D(jArr2);
        byte[] O8 = AbstractC2968bG.O(jArr2);
        for (int i = 0; i < 32; i++) {
            if (O8[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[][] P(int[] iArr, Q4[] q4Arr) {
        long j6;
        int i;
        int length;
        char c9;
        int i6 = 0;
        long j9 = 0;
        while (true) {
            j6 = 1048576;
            if (i6 >= 3) {
                break;
            }
            j9 += (q4Arr[i6].c() + 1048575) / 1048576;
            i6++;
        }
        if (j9 >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(j9);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i9 = 0;
        while (true) {
            length = iArr.length;
            c9 = 5;
            if (i9 >= length) {
                break;
            }
            int i10 = (int) j9;
            byte[] bArr2 = new byte[(Z(iArr[i9]) * i10) + 5];
            bArr2[0] = 90;
            l0(i10, bArr2);
            bArr[i9] = bArr2;
            i9++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            String W8 = W(iArr[i11]);
            try {
                messageDigestArr[i11] = MessageDigest.getInstance(W8);
            } catch (NoSuchAlgorithmException e9) {
                throw new RuntimeException(W8.concat(" digest not supported"), e9);
            }
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (i = 3; i12 < i; i = 3) {
            Q4 q42 = q4Arr[i12];
            int i15 = i12;
            long c10 = q42.c();
            long j10 = 0;
            while (c10 > 0) {
                char c11 = c9;
                int i16 = i13;
                int min = (int) Math.min(c10, j6);
                l0(min, bArr3);
                for (int i17 = 0; i17 < length; i17++) {
                    messageDigestArr[i17].update(bArr3);
                }
                try {
                    q42.b(messageDigestArr, j10, min);
                    int i18 = 0;
                    while (i18 < iArr.length) {
                        int i19 = iArr[i18];
                        byte[] bArr4 = bArr[i18];
                        int Z8 = Z(i19);
                        Q4 q43 = q42;
                        MessageDigest messageDigest = messageDigestArr[i18];
                        long j11 = c10;
                        int digest = messageDigest.digest(bArr4, (i16 * Z8) + 5, Z8);
                        if (digest != Z8) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(digest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i18++;
                        q42 = q43;
                        c10 = j11;
                    }
                    Q4 q44 = q42;
                    long j12 = min;
                    j10 += j12;
                    c10 -= j12;
                    i13 = i16 + 1;
                    c9 = c11;
                    q42 = q44;
                    j6 = 1048576;
                } catch (IOException e10) {
                    throw new DigestException(D.y.r(new StringBuilder(String.valueOf(i16).length() + 37 + String.valueOf(i14).length()), "Failed to digest chunk #", i16, " of section #", i14), e10);
                }
            }
            i14++;
            i12 = i15 + 1;
            j6 = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i20 = 0; i20 < iArr.length; i20++) {
            int i21 = iArr[i20];
            byte[] bArr6 = bArr[i20];
            String W9 = W(i21);
            try {
                bArr5[i20] = MessageDigest.getInstance(W9).digest(bArr6);
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(W9.concat(" digest not supported"), e11);
            }
        }
        return bArr5;
    }

    public static int Q(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return j.v.f12600w;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static int R(C4233yr c4233yr, int i, int i6, int i9) {
        AbstractC2772Sd.i(Math.max(Math.max(i, i6), i9) <= 31);
        int i10 = (1 << i) - 1;
        int i11 = (1 << i6) - 1;
        Math.addExact(Math.addExact(i10, i11), 1 << i9);
        if (c4233yr.b() >= i) {
            int h9 = c4233yr.h(i);
            if (h9 == i10) {
                if (c4233yr.b() >= i6) {
                    int h10 = c4233yr.h(i6);
                    h9 += h10;
                    if (h10 == i11) {
                        if (c4233yr.b() >= i9) {
                            return c4233yr.h(i9) + h9;
                        }
                    }
                }
            }
            return h9;
        }
        return -1;
    }

    public static Charset S(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static void T(int i, int i6, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i6;
        view.setLayoutParams(layoutParams2);
    }

    public static void U(C4233yr c4233yr) {
        int h9 = c4233yr.h(6);
        if (h9 < 2 || h9 > 42) {
            throw U4.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(h9)));
        }
        c4233yr.f(h9 * 8);
    }

    public static int V(int i) {
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
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    public static String W(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(D.y.m(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
    }

    public static String X(int i, int i6, int i9, int i10, int i11) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static void Y(S0.s sVar, C2991bm c2991bm, IF r9) {
        long[] jArr = new long[10];
        C3481ku c3481ku = (C3481ku) sVar.f2840u;
        long[] jArr2 = (long[]) c3481ku.f31663u;
        C3481ku c3481ku2 = (C3481ku) c2991bm.f29323u;
        long[] jArr3 = (long[]) c3481ku2.f31664v;
        long[] jArr4 = (long[]) c3481ku2.f31663u;
        AbstractC2968bG.l(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) c3481ku.f31664v;
        AbstractC2968bG.u(jArr5, jArr3, jArr4);
        AbstractC2968bG.I(jArr5, jArr5, r9.f25474b);
        long[] jArr6 = r9.f25473a;
        long[] jArr7 = (long[]) c3481ku.f31665w;
        AbstractC2968bG.I(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) sVar.f2841v;
        AbstractC2968bG.I(jArr8, (long[]) c2991bm.f29324v, r9.f25475c);
        r9.a(jArr2, (long[]) c3481ku2.f31665w);
        AbstractC2968bG.l(jArr, jArr2, jArr2);
        AbstractC2968bG.u(jArr2, jArr7, jArr5);
        AbstractC2968bG.l(jArr5, jArr7, jArr5);
        AbstractC2968bG.l(jArr7, jArr, jArr8);
        AbstractC2968bG.u(jArr8, jArr, jArr8);
    }

    public static int Z(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(D.y.m(i, "Unknown content digest algorthm: ", new StringBuilder(String.valueOf(i).length() + 33)));
    }

    public static long a(double d2) {
        AbstractC2772Sd.q("not a normal value", s(d2));
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L;
    }

    public static int a0(byte[] bArr, int i, int i6) {
        int c02 = c0(i, bArr);
        if (i6 == 0 || i6 == 3) {
            return c02;
        }
        while (true) {
            int length = bArr.length;
            if (c02 >= length - 1) {
                return length;
            }
            int i9 = c02 + 1;
            if ((c02 - i) % 2 == 0 && bArr[i9] == 0) {
                return c02;
            }
            c02 = c0(i9, bArr);
        }
    }

    public static Bundle b(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void b0(S0.s sVar, C2991bm c2991bm, IF r9) {
        long[] jArr = new long[10];
        C3481ku c3481ku = (C3481ku) sVar.f2840u;
        long[] jArr2 = (long[]) c3481ku.f31663u;
        C3481ku c3481ku2 = (C3481ku) c2991bm.f29323u;
        long[] jArr3 = (long[]) c3481ku2.f31664v;
        long[] jArr4 = (long[]) c3481ku2.f31663u;
        AbstractC2968bG.l(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) c3481ku.f31664v;
        AbstractC2968bG.u(jArr5, jArr3, jArr4);
        AbstractC2968bG.I(jArr5, jArr5, r9.f25473a);
        long[] jArr6 = r9.f25474b;
        long[] jArr7 = (long[]) c3481ku.f31665w;
        AbstractC2968bG.I(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) sVar.f2841v;
        AbstractC2968bG.I(jArr8, (long[]) c2991bm.f29324v, r9.f25475c);
        r9.a(jArr2, (long[]) c3481ku2.f31665w);
        AbstractC2968bG.l(jArr, jArr2, jArr2);
        AbstractC2968bG.u(jArr2, jArr7, jArr5);
        AbstractC2968bG.l(jArr5, jArr7, jArr5);
        AbstractC2968bG.u(jArr7, jArr, jArr8);
        AbstractC2968bG.l(jArr8, jArr, jArr8);
    }

    public static File c(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(y(str, file), str2);
    }

    public static int c0(int i, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    public static Object d(InterfaceC3231gB interfaceC3231gB) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return interfaceC3231gB.mo15c();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static ByteBuffer d0(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i6 = i + position;
        if (i6 < position || i6 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i6);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i6);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static void e0(S0.s sVar, C3481ku c3481ku) {
        C3481ku c3481ku2 = (C3481ku) sVar.f2840u;
        long[] jArr = (long[]) c3481ku2.f31663u;
        long[] jArr2 = new long[10];
        long[] jArr3 = (long[]) c3481ku.f31663u;
        AbstractC2968bG.L(jArr, jArr3);
        long[] jArr4 = (long[]) c3481ku2.f31665w;
        long[] jArr5 = (long[]) c3481ku.f31664v;
        AbstractC2968bG.L(jArr4, jArr5);
        long[] jArr6 = (long[]) sVar.f2841v;
        AbstractC2968bG.L(jArr6, (long[]) c3481ku.f31665w);
        AbstractC2968bG.l(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) c3481ku2.f31664v;
        AbstractC2968bG.l(jArr7, jArr3, jArr5);
        AbstractC2968bG.L(jArr2, jArr7);
        AbstractC2968bG.l(jArr7, jArr4, jArr);
        AbstractC2968bG.u(jArr4, jArr4, jArr);
        AbstractC2968bG.u(jArr, jArr2, jArr7);
        AbstractC2968bG.u(jArr6, jArr6, jArr4);
    }

    public static void f(N3.a aVar, String str, Executor executor) {
        aVar.a(new LD(0, aVar, new FE(str, 5)), executor);
    }

    public static int f0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static final void g(InterfaceC0404w interfaceC0404w, C3105du coroutineSequence, I7.p pVar) {
        kotlin.jvm.internal.h.e(interfaceC0404w, "<this>");
        kotlin.jvm.internal.h.e(coroutineSequence, "coroutineSequence");
        EnumC0405x enumC0405x = EnumC0405x.f3001n;
        AbstractC0406y.c(interfaceC0404w, new LA(coroutineSequence, pVar, null), 1);
    }

    public static int g0(int i, int i6) {
        int i9 = (~(i ^ i6)) & com.anythink.basead.exoplayer.k.p.f8473b;
        int i10 = i9 & (i9 << 4);
        int i11 = i10 & (i10 << 2);
        return (i11 & (i11 + i11)) >> 7;
    }

    public static void h(InterfaceC3707p3 interfaceC3707p3, X1.b bVar) {
        for (int i = 0; i < interfaceC3707p3.c(); i++) {
            long x9 = interfaceC3707p3.x(i);
            ArrayList b9 = interfaceC3707p3.b(x9);
            if (!b9.isEmpty()) {
                if (i == interfaceC3707p3.c() - 1) {
                    throw new IllegalStateException();
                }
                long x10 = interfaceC3707p3.x(i + 1) - interfaceC3707p3.x(i);
                if (x10 > 0) {
                    bVar.mo10a(new C3653o3(b9, x9, x10));
                }
            }
        }
    }

    public static ByteBuffer h0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            throw new IOException(D.y.m(remaining, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", new StringBuilder(String.valueOf(remaining).length() + 82)));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return d0(i, byteBuffer);
        }
        int remaining2 = byteBuffer.remaining();
        throw new IOException(D.y.r(new StringBuilder(String.valueOf(i).length() + 79 + String.valueOf(remaining2).length()), "Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", remaining2));
    }

    public static void i(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String obj3 = obj.toString();
        throw new NullPointerException(D.y.s(new StringBuilder(obj3.length() + 26), "null value in entry: ", obj3, "=null"));
    }

    public static void i0(IF r72, int i, byte b9) {
        IF[][] ifArr = KF.f25885d;
        int i6 = (b9 & 255) >> 7;
        int i9 = (-i6) & b9;
        int i10 = b9 - (i9 + i9);
        r72.b(ifArr[i][0], g0(i10, 1));
        r72.b(ifArr[i][1], g0(i10, 2));
        r72.b(ifArr[i][2], g0(i10, 3));
        r72.b(ifArr[i][3], g0(i10, 4));
        r72.b(ifArr[i][4], g0(i10, 5));
        r72.b(ifArr[i][5], g0(i10, 6));
        r72.b(ifArr[i][6], g0(i10, 7));
        r72.b(ifArr[i][7], g0(i10, 8));
        long[] jArr = r72.f25474b;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        long[] jArr2 = r72.f25473a;
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArr3 = r72.f25475c;
        long[] copyOf3 = Arrays.copyOf(jArr3, 10);
        for (int i11 = 0; i11 < copyOf3.length; i11++) {
            copyOf3[i11] = -copyOf3[i11];
        }
        QC.f(jArr2, copyOf, i6);
        QC.f(jArr, copyOf2, i6);
        QC.f(jArr3, copyOf3, i6);
    }

    public static void j(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static byte[] j0(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        int remaining = byteBuffer.remaining();
        throw new IOException(D.y.r(new StringBuilder(String.valueOf(i).length() + 68 + String.valueOf(remaining).length()), "Underflow while reading length-prefixed value. Length: ", i, ", available: ", remaining));
    }

    public static void k(String str, boolean z3) {
        if (!z3) {
            throw U4.a(null, str);
        }
    }

    public static String k0(byte[] bArr, int i, int i6, Charset charset) {
        return (i6 <= i || i6 > bArr.length) ? "" : new String(bArr, i, i6 - i, charset);
    }

    public static byte[] l(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i6 = 0;
        while (true) {
            if (i6 >= 32) {
                break;
            }
            int i9 = i6 + i6;
            bArr2[i9] = (byte) (bArr[i6] & 15);
            bArr2[i9 + 1] = (byte) ((bArr[i6] & 255) >> 4);
            i6++;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < 63) {
            byte b9 = (byte) (bArr2[i10] + i11);
            bArr2[i10] = b9;
            int i12 = (b9 + 8) >> 4;
            bArr2[i10] = (byte) (b9 - (i12 << 4));
            i10++;
            i11 = i12;
        }
        bArr2[63] = (byte) (bArr2[63] + i11);
        S0.s sVar = new S0.s(21);
        C2991bm c2991bm = new C2991bm(23);
        for (i = 1; i < 64; i += 2) {
            IF r42 = new IF();
            i0(r42, i / 2, bArr2[i]);
            C2991bm.U(c2991bm, sVar);
            Y(sVar, c2991bm, r42);
        }
        C3481ku c3481ku = new C3481ku(20);
        C3481ku.i(sVar, c3481ku);
        e0(sVar, c3481ku);
        C3481ku.i(sVar, c3481ku);
        e0(sVar, c3481ku);
        C3481ku.i(sVar, c3481ku);
        e0(sVar, c3481ku);
        C3481ku.i(sVar, c3481ku);
        e0(sVar, c3481ku);
        for (int i13 = 0; i13 < 64; i13 += 2) {
            IF r43 = new IF();
            i0(r43, i13 / 2, bArr2[i13]);
            C2991bm.U(c2991bm, sVar);
            Y(sVar, c2991bm, r43);
        }
        C3481ku c3481ku2 = new C3481ku(sVar);
        long[] jArr = new long[10];
        AbstractC2968bG.L(jArr, (long[]) c3481ku2.f31663u);
        long[] jArr2 = new long[10];
        AbstractC2968bG.L(jArr2, (long[]) c3481ku2.f31664v);
        long[] jArr3 = new long[10];
        AbstractC2968bG.L(jArr3, (long[]) c3481ku2.f31665w);
        long[] jArr4 = new long[10];
        AbstractC2968bG.L(jArr4, jArr3);
        long[] jArr5 = new long[10];
        AbstractC2968bG.u(jArr5, jArr2, jArr);
        AbstractC2968bG.I(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        AbstractC2968bG.I(jArr6, jArr, jArr2);
        AbstractC2968bG.I(jArr6, jArr6, KF.f25882a);
        AbstractC2968bG.l(jArr6, jArr6, jArr4);
        AbstractC2968bG.A(jArr6, jArr6);
        if (MessageDigest.isEqual(AbstractC2968bG.O(jArr5), AbstractC2968bG.O(jArr6))) {
            return c3481ku2.n();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static void l0(int i, byte[] bArr) {
        bArr[1] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8473b);
        bArr[2] = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
        bArr[3] = (byte) ((i >>> 16) & com.anythink.basead.exoplayer.k.p.f8473b);
        bArr[4] = (byte) (i >> 24);
    }

    public static X509Certificate[][] m(String str) {
        RandomAccessFile randomAccessFile;
        Pair F8;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, com.anythink.expressad.foundation.d.d.bv);
        try {
            if (randomAccessFile2.length() < 22) {
                F8 = null;
            } else {
                F8 = AbstractC2968bG.F(randomAccessFile2, 0);
                if (F8 == null) {
                    F8 = AbstractC2968bG.F(randomAccessFile2, 65535);
                }
            }
        } catch (Throwable th) {
            th = th;
            randomAccessFile = randomAccessFile2;
        }
        try {
            if (F8 == null) {
                long length = randomAccessFile2.length();
                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new S4(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) F8.first;
            long longValue = ((Long) F8.second).longValue();
            long j6 = (-20) + longValue;
            if (j6 >= 0) {
                randomAccessFile2.seek(j6);
                if (randomAccessFile2.readInt() == 1347094023) {
                    throw new S4("ZIP64 APK not supported");
                }
            }
            AbstractC2968bG.K(byteBuffer);
            long j9 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j9 >= longValue) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j9).length() + 82 + String.valueOf(longValue).length());
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(j9);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(longValue);
                throw new S4(sb2.toString());
            }
            AbstractC2968bG.K(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j9 != longValue) {
                throw new S4("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j9 < 32) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(j9).length() + 67);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(j9);
                throw new S4(sb3.toString());
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile2.seek(j9 - allocate.capacity());
            randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new S4("No APK Signing Block before ZIP Central Directory");
            }
            long j10 = allocate.getLong(0);
            if (j10 < allocate.capacity() || j10 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 37);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j10);
                throw new S4(sb4.toString());
            }
            int i = (int) (8 + j10);
            long j11 = j9 - i;
            if (j11 < 0) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(j11).length() + 39);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j11);
                throw new S4(sb5.toString());
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(byteOrder);
            randomAccessFile2.seek(j11);
            long j12 = j9;
            randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j13 = allocate2.getLong(0);
            if (j13 != j10) {
                StringBuilder sb6 = new StringBuilder(String.valueOf(j13).length() + 63 + String.valueOf(j10).length());
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j13);
                sb6.append(" vs ");
                sb6.append(j10);
                throw new S4(sb6.toString());
            }
            Pair create = Pair.create(allocate2, Long.valueOf(j11));
            ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
            long longValue2 = ((Long) create.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int capacity = byteBuffer2.capacity() - 24;
            randomAccessFile = randomAccessFile2;
            if (capacity < 8) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(capacity).length() + 17);
                sb7.append("end < start: ");
                sb7.append(capacity);
                sb7.append(" < 8");
                throw new IllegalArgumentException(sb7.toString());
            }
            int capacity2 = byteBuffer2.capacity();
            if (capacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(String.valueOf(capacity).length() + 19 + String.valueOf(capacity2).length());
                sb8.append("end > capacity: ");
                sb8.append(capacity);
                sb8.append(" > ");
                sb8.append(capacity2);
                throw new IllegalArgumentException(sb8.toString());
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
                int i6 = 0;
                while (slice.hasRemaining()) {
                    i6++;
                    if (slice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(String.valueOf(i6).length() + 59);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i6);
                        throw new S4(sb9.toString());
                    }
                    long j14 = slice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i6).length() + 45 + String.valueOf(j14).length());
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i6);
                        sb10.append(" size out of range: ");
                        sb10.append(j14);
                        throw new S4(sb10.toString());
                    }
                    int i9 = (int) j14;
                    int position2 = slice.position() + i9;
                    if (i9 > slice.remaining()) {
                        int remaining = slice.remaining();
                        StringBuilder sb11 = new StringBuilder(String.valueOf(i6).length() + 45 + String.valueOf(i9).length() + 13 + String.valueOf(remaining).length());
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i6);
                        sb11.append(" size out of range: ");
                        sb11.append(i9);
                        sb11.append(", available: ");
                        sb11.append(remaining);
                        throw new S4(sb11.toString());
                    }
                    if (slice.getInt() == 1896449818) {
                        X509Certificate[][] w6 = w(randomAccessFile.getChannel(), new R4(d0(i9 - 4, slice), longValue2, j12, longValue, byteBuffer));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return w6;
                    }
                    long j15 = j12;
                    slice.position(position2);
                    j12 = j15;
                }
                throw new S4("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th2) {
                byteBuffer2.position(0);
                byteBuffer2.limit(limit);
                byteBuffer2.position(position);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public static byte[] m0(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i6 = 0; i6 < 256; i6++) {
            bArr2[i6] = (byte) (1 & ((bArr[i6 >> 3] & 255) >> (i6 & 7)));
        }
        for (int i9 = 0; i9 < 256; i9++) {
            if (bArr2[i9] != 0) {
                for (int i10 = 1; i10 <= 6 && (i = i9 + i10) < 256; i10++) {
                    byte b9 = bArr2[i];
                    if (b9 != 0) {
                        byte b10 = bArr2[i9];
                        int i11 = b9 << i10;
                        int i12 = b10 + i11;
                        if (i12 <= 15) {
                            bArr2[i9] = (byte) i12;
                            bArr2[i] = 0;
                        } else {
                            int i13 = b10 - i11;
                            if (i13 >= -15) {
                                bArr2[i9] = (byte) i13;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
    
        if (r10 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
    
        if (r10 != 8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static X2.b n(C4233yr c4233yr) {
        int i;
        int i6;
        int h9 = c4233yr.h(16);
        int h10 = c4233yr.h(16);
        if (h10 == 65535) {
            h10 = c4233yr.h(24);
            i = 7;
        } else {
            i = 4;
        }
        int i9 = h10 + i;
        if (h9 == 44097) {
            i9 += 2;
        }
        if (c4233yr.h(2) == 3) {
            do {
                c4233yr.h(2);
            } while (c4233yr.g());
        }
        int h11 = c4233yr.h(10);
        if (c4233yr.g() && c4233yr.h(3) > 0) {
            c4233yr.f(2);
        }
        int i10 = true != c4233yr.g() ? 44100 : 48000;
        int h12 = c4233yr.h(4);
        int[] iArr = f26258u;
        if (i10 == 44100 && h12 == 13) {
            i6 = iArr[13];
        } else if (i10 != 48000 || h12 >= 14) {
            i6 = 0;
        } else {
            int i11 = iArr[h12];
            int i12 = h11 % 5;
            if (i12 != 1) {
                if (i12 == 2) {
                    if (h12 != 8) {
                    }
                    i6 = i11 + 1;
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        if (h12 != 3) {
                            if (h12 != 8) {
                            }
                        }
                        i6 = i11 + 1;
                    }
                    i6 = i11;
                }
            }
            if (h12 != 3) {
            }
            i6 = i11 + 1;
        }
        return new X2.b(i10, i9, i6, false);
    }

    public static long n0(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static Object o(C3931tC c3931tC, String str) {
        C2910aC c2910aC = new C2910aC(c3931tC, c3931tC.f34227n, c3931tC.f34228u);
        return c2910aC.hasNext() ? c2910aC.next() : str;
    }

    public static long o0(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | n0(i, bArr);
    }

    public static HashMap p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("MA", "decode object failure");
            return null;
        }
    }

    public static void q(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void r(Bundle bundle, String str, String str2, boolean z3) {
        if (!z3 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static boolean s(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean t(Cr cr, int i, int i6, boolean z3) {
        boolean z6;
        int O8;
        long O9;
        int i9;
        int i10;
        int i11 = cr.f24253b;
        while (true) {
            try {
                z6 = true;
                z6 = true;
                int i12 = 1;
                int i13 = 1;
                if (cr.B() < i6) {
                    break;
                }
                if (i >= 3) {
                    O8 = cr.b();
                    O9 = cr.P();
                    i9 = cr.L();
                } else {
                    O8 = cr.O();
                    O9 = cr.O();
                    i9 = 0;
                }
                if (O8 != 0 || O9 != 0 || i9 != 0) {
                    if (i == 4 && !z3) {
                        if ((8421504 & O9) != 0) {
                            break;
                        }
                        O9 = ((O9 >> 24) << 21) | (((O9 >> 16) & 255) << 14) | (O9 & 255) | (((O9 >> 8) & 255) << 7);
                    }
                    if (i == 4) {
                        if ((i9 & 64) == 0) {
                            i12 = 0;
                        }
                        int i14 = i12;
                        i13 = i9 & 1;
                        i10 = i14;
                    } else if (i == 3) {
                        i10 = (i9 & 32) != 0 ? 1 : 0;
                        if ((i9 & 128) == 0) {
                            i13 = 0;
                        }
                    } else {
                        i10 = 0;
                        i13 = 0;
                    }
                    if (i13 != 0) {
                        i10 += 4;
                    }
                    if (O9 >= i10 && cr.B() >= O9) {
                        cr.G((int) O9);
                    }
                }
            } finally {
                cr.E(i11);
            }
        }
        return z6;
    }

    public static boolean u(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                T2.b.c(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                T2.b.c(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                T2.b.c(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] v(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) WJ.f28343e.f28346a.b("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static X509Certificate[][] w(FileChannel fileChannel, R4 r42) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer h02 = h0((ByteBuffer) r42.f27170d);
                int i = 0;
                while (h02.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(C(h0(h02), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e9) {
                        throw new SecurityException(u1.h.d(i, "Failed to parse/verify signer #", " block", new StringBuilder(String.valueOf(i).length() + 37)), e9);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                long j6 = r42.f27167a;
                N1.l lVar = new N1.l(fileChannel, 0L, j6);
                long j9 = r42.f27169c;
                long j10 = r42.f27168b;
                N1.l lVar2 = new N1.l(fileChannel, j10, j9 - j10);
                ByteBuffer duplicate = ((ByteBuffer) r42.f27171e).duplicate();
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                AbstractC2968bG.K(duplicate);
                int position = duplicate.position() + 16;
                if (j6 < 0 || j6 > 4294967295L) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 27);
                    sb.append("uint32 value of out range: ");
                    sb.append(j6);
                    throw new IllegalArgumentException(sb.toString());
                }
                duplicate.putInt(duplicate.position() + position, (int) j6);
                Qx qx = new Qx(duplicate);
                int size = hashMap.size();
                int[] iArr = new int[size];
                Iterator it = hashMap.keySet().iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    iArr[i6] = ((Integer) it.next()).intValue();
                    i6++;
                }
                try {
                    byte[][] P8 = P(iArr, new Q4[]{lVar, lVar2, qx});
                    for (int i9 = 0; i9 < size; i9++) {
                        int i10 = iArr[i9];
                        if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i10)), P8[i9])) {
                            throw new SecurityException(W(i10).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e10) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e10);
                }
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:79|(2:81|(1:91)(3:86|(1:88)(1:90)|89))|92|(1:93)|(2:95|(7:117|118|119|(4:(6:125|126|(5:128|129|130|(1:132)|133)(2:139|(1:141)(1:142))|134|(1:136)(1:138)|137)|143|144|(2:(1:(1:(1:227)(4:222|(1:224)|225|226))(12:191|(1:193)(1:215)|194|(1:196)|197|198|(4:201|(3:203|204|205)(1:207)|206|199)|208|209|(1:211)(1:214)|212|213))(2:161|(2:163|154)(8:164|(1:166)(1:184)|167|(1:169)(1:183)|170|(4:173|(3:175|176|177)(1:179)|178|171)|180|181))|182)(3:152|(1:155)|154))(9:228|(1:(1:(0)))|143|144|(1:146)|(1:157)|(1:186)|(1:217)|227)|55|(1:57)|58)(2:98|(9:102|103|104|105|(1:107)(1:109)|108|55|(0)|58)(1:101)))|237|118|119|(0)(0)|55|(0)|58) */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0283, code lost:
    
        if (r8 == 67) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC2900a2 x(int i, Cr cr, boolean z3, V2 v22) {
        int h9;
        int i6;
        int i9;
        boolean z6;
        boolean z9;
        boolean z10;
        int i10;
        String str;
        AbstractC2900a2 abstractC2900a2;
        int i11;
        AbstractC2900a2 v12;
        AbstractC2900a2 c3114e2;
        int c02;
        String concat;
        int K7 = cr.K();
        int K8 = cr.K();
        int K9 = cr.K();
        int K10 = i >= 3 ? cr.K() : 0;
        if (i == 4) {
            h9 = cr.h();
            if (!z3) {
                h9 = ((h9 >> 24) << 21) | (h9 & com.anythink.basead.exoplayer.k.p.f8473b) | (((h9 >> 8) & com.anythink.basead.exoplayer.k.p.f8473b) << 7) | (((h9 >> 16) & com.anythink.basead.exoplayer.k.p.f8473b) << 14);
            }
        } else {
            h9 = i == 3 ? cr.h() : cr.O();
        }
        int L6 = i >= 3 ? cr.L() : 0;
        if (K7 == 0 && K8 == 0 && K9 == 0 && K10 == 0 && h9 == 0 && L6 == 0) {
            cr.E(cr.f24254c);
            return null;
        }
        int D8 = cr.D() + h9;
        if (D8 > cr.f24254c) {
            AbstractC2968bG.y("Id3Decoder", "Frame size exceeds remaining tag data");
            cr.E(cr.f24254c);
            return null;
        }
        if (v22 != null) {
            cr.E(D8);
            return null;
        }
        if (i == 3) {
            int i12 = L6 & 64;
            i6 = (L6 & 128) != 0 ? 1 : 0;
            z10 = false;
            z9 = i12 != 0;
            z6 = (L6 & 32) != 0;
            i9 = i6;
        } else if (i == 4) {
            boolean z11 = (L6 & 64) != 0;
            int i13 = (L6 & 8) != 0 ? 1 : 0;
            z9 = (L6 & 4) != 0;
            z10 = (L6 & 2) != 0;
            i9 = L6 & 1;
            int i14 = i13;
            z6 = z11;
            i6 = i14;
        } else {
            i6 = 0;
            i9 = 0;
            z6 = false;
            z9 = false;
            z10 = false;
        }
        if (i6 != 0 || z9) {
            AbstractC2968bG.y("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            cr.E(D8);
            return null;
        }
        if (z6) {
            cr.G(1);
            h9--;
        }
        if (i9 != 0) {
            cr.G(4);
            h9 -= 4;
        }
        if (z10) {
            h9 = I(h9, cr);
        }
        try {
            try {
            } catch (Throwable th) {
                cr.E(D8);
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            i10 = K7;
            str = "Id3Decoder";
            cr.E(D8);
            abstractC2900a2 = null;
            if (abstractC2900a2 == null) {
            }
            return abstractC2900a2;
        } catch (OutOfMemoryError e10) {
            e = e10;
            i10 = K7;
            str = "Id3Decoder";
            cr.E(D8);
            abstractC2900a2 = null;
            if (abstractC2900a2 == null) {
            }
            return abstractC2900a2;
        }
        if (K7 == 84 && K8 == 88 && K9 == 88 && (i == 2 || K10 == 88)) {
            if (h9 > 0) {
                int K11 = cr.K();
                int i15 = h9 - 1;
                byte[] bArr = new byte[i15];
                cr.H(bArr, 0, i15);
                int a02 = a0(bArr, 0, K11);
                v12 = new C3222g2("TXXX", new String(bArr, 0, a02, S(K11)), D(bArr, K11, a02 + f0(K11)));
                i10 = K7;
            }
            i10 = K7;
            v12 = null;
        } else {
            if (K7 == 84) {
                String X8 = X(i, 84, K8, K9, K10);
                if (h9 > 0) {
                    int K12 = cr.K();
                    int i16 = h9 - 1;
                    byte[] bArr2 = new byte[i16];
                    cr.H(bArr2, 0, i16);
                    i10 = K7;
                    v12 = new C3222g2(X8, null, D(bArr2, K12, 0));
                }
            } else {
                if (K7 == 87) {
                    if (K8 != 88 || K9 != 88 || (i != 2 && K10 != 88)) {
                        i11 = 87;
                    }
                    int K13 = cr.K();
                    int i17 = h9 - 1;
                    byte[] bArr3 = new byte[i17];
                    cr.H(bArr3, 0, i17);
                    int a03 = a0(bArr3, 0, K13);
                    String str2 = new String(bArr3, 0, a03, S(K13));
                    int f02 = a03 + f0(K13);
                    v12 = new C3276h2("WXXX", str2, k0(bArr3, f02, c0(f02, bArr3), StandardCharsets.ISO_8859_1));
                    i10 = K7;
                } else {
                    i11 = K7;
                }
                if (i11 != 87) {
                    if (i11 == 80) {
                        if (K8 == 82 && K9 == 73 && K10 == 86) {
                            byte[] bArr4 = new byte[h9];
                            cr.H(bArr4, 0, h9);
                            int c03 = c0(0, bArr4);
                            String str3 = new String(bArr4, 0, c03, StandardCharsets.ISO_8859_1);
                            int i18 = c03 + 1;
                            v12 = new C3168f2(str3, h9 <= i18 ? AbstractC3159eu.f29994b : Arrays.copyOfRange(bArr4, i18, h9));
                        } else {
                            i11 = 80;
                        }
                    }
                    try {
                    } catch (Exception e11) {
                        e = e11;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                    }
                    if (i11 == 71) {
                        if (K8 != 69 || K9 != 79) {
                            str = "Id3Decoder";
                            i11 = 71;
                            if (i != 2) {
                                if (i11 == 80 && K8 == 73 && K9 == 67) {
                                    int K14 = cr.K();
                                    Charset S8 = S(K14);
                                    int i19 = h9 - 1;
                                    byte[] bArr5 = new byte[i19];
                                    cr.H(bArr5, 0, i19);
                                    if (i == 2) {
                                        i10 = K7;
                                        concat = "image/".concat(String.valueOf(AbstractC3043cl.f(new String(bArr5, 0, 3, StandardCharsets.ISO_8859_1))));
                                        if ("image/jpg".equals(concat)) {
                                            concat = "image/jpeg";
                                        }
                                        c02 = 2;
                                    } else {
                                        i10 = K7;
                                        c02 = c0(0, bArr5);
                                        String f3 = AbstractC3043cl.f(new String(bArr5, 0, c02, StandardCharsets.ISO_8859_1));
                                        concat = f3.indexOf(47) == -1 ? "image/".concat(f3) : f3;
                                    }
                                    int i20 = bArr5[c02 + 1] & 255;
                                    int i21 = c02 + 2;
                                    int a04 = a0(bArr5, i21, K14);
                                    String str4 = new String(bArr5, i21, a04 - i21, S8);
                                    int f03 = a04 + f0(K14);
                                    v12 = new U1(concat, str4, i20, i19 <= f03 ? AbstractC3159eu.f29994b : Arrays.copyOfRange(bArr5, f03, i19));
                                }
                                i10 = K7;
                                if (i11 != 67 && K8 == 79 && K9 == 77 && (K10 == 77 || i == 2)) {
                                    if (h9 >= 4) {
                                        int K15 = cr.K();
                                        Charset S9 = S(K15);
                                        byte[] bArr6 = new byte[3];
                                        cr.H(bArr6, 0, 3);
                                        String str5 = new String(bArr6, 0, 3);
                                        int i22 = h9 - 4;
                                        byte[] bArr7 = new byte[i22];
                                        cr.H(bArr7, 0, i22);
                                        int a05 = a0(bArr7, 0, K15);
                                        String str6 = new String(bArr7, 0, a05, S9);
                                        int f04 = a05 + f0(K15);
                                        v12 = new Y1(str5, str6, k0(bArr7, f04, a0(bArr7, f04, K15), S9));
                                    }
                                    v12 = null;
                                } else {
                                    if (i11 != 67 && K8 == 72 && K9 == 65 && K10 == 80) {
                                        int D9 = cr.D();
                                        int c04 = c0(D9, cr.F());
                                        String str7 = new String(cr.F(), D9, c04 - D9, StandardCharsets.ISO_8859_1);
                                        cr.E(c04 + 1);
                                        int b9 = cr.b();
                                        int b10 = cr.b();
                                        if (b9 > b10) {
                                            v12 = null;
                                        } else {
                                            long P8 = cr.P();
                                            long j6 = P8 == 4294967295L ? -1L : P8;
                                            long P9 = cr.P();
                                            long j9 = P9 == 4294967295L ? -1L : P9;
                                            ArrayList arrayList = new ArrayList();
                                            int i23 = D9 + h9;
                                            while (cr.D() < i23) {
                                                AbstractC2900a2 x9 = x(i, cr, z3, null);
                                                if (x9 != null) {
                                                    arrayList.add(x9);
                                                }
                                            }
                                            c3114e2 = new W1(str7, b9, b10, j6, j9, (AbstractC2900a2[]) arrayList.toArray(new AbstractC2900a2[0]));
                                        }
                                    } else if (i11 != 67 && K8 == 84 && K9 == 79 && K10 == 67) {
                                        int D10 = cr.D();
                                        int c05 = c0(D10, cr.F());
                                        String str8 = new String(cr.F(), D10, c05 - D10, StandardCharsets.ISO_8859_1);
                                        cr.E(c05 + 1);
                                        int K16 = cr.K();
                                        boolean z12 = (K16 & 2) != 0;
                                        int i24 = K16 & 1;
                                        int K17 = cr.K();
                                        String[] strArr = new String[K17];
                                        int i25 = 0;
                                        while (i25 < K17) {
                                            int D11 = cr.D();
                                            int c06 = c0(D11, cr.F());
                                            strArr[i25] = new String(cr.F(), D11, c06 - D11, StandardCharsets.ISO_8859_1);
                                            cr.E(c06 + 1);
                                            i25++;
                                            D10 = D10;
                                            K17 = K17;
                                            str8 = str8;
                                        }
                                        int i26 = D10;
                                        String str9 = str8;
                                        ArrayList arrayList2 = new ArrayList();
                                        int i27 = i26 + h9;
                                        while (cr.D() < i27) {
                                            AbstractC2900a2 x10 = x(i, cr, z3, null);
                                            if (x10 != null) {
                                                arrayList2.add(x10);
                                            }
                                        }
                                        c3114e2 = new X1(str9, z12, 1 == i24, strArr, (AbstractC2900a2[]) arrayList2.toArray(new AbstractC2900a2[0]));
                                    } else if (i11 != 77 && K8 == 76 && K9 == 76 && K10 == 84) {
                                        int L8 = cr.L();
                                        int O8 = cr.O();
                                        int O9 = cr.O();
                                        int K18 = cr.K();
                                        int K19 = cr.K();
                                        C4233yr c4233yr = new C4233yr();
                                        c4233yr.a(cr);
                                        int i28 = ((h9 - 10) * 8) / (K18 + K19);
                                        int[] iArr = new int[i28];
                                        int[] iArr2 = new int[i28];
                                        for (int i29 = 0; i29 < i28; i29++) {
                                            int h10 = c4233yr.h(K18);
                                            int h11 = c4233yr.h(K19);
                                            iArr[i29] = h10;
                                            iArr2[i29] = h11;
                                        }
                                        c3114e2 = new C3114e2(L8, O8, O9, iArr, iArr2);
                                    } else {
                                        String X9 = X(i, i11, K8, K9, K10);
                                        byte[] bArr8 = new byte[h9];
                                        cr.H(bArr8, 0, h9);
                                        v12 = new V1(X9, bArr8);
                                    }
                                    v12 = c3114e2;
                                }
                            } else {
                                if (i11 == 65) {
                                    if (K8 == 80) {
                                        if (K9 == 73) {
                                        }
                                    }
                                }
                                i10 = K7;
                                if (i11 != 67) {
                                }
                                if (i11 != 67) {
                                }
                                if (i11 != 67) {
                                }
                                if (i11 != 77) {
                                }
                                String X92 = X(i, i11, K8, K9, K10);
                                byte[] bArr82 = new byte[h9];
                                cr.H(bArr82, 0, h9);
                                v12 = new V1(X92, bArr82);
                            }
                            cr.E(D8);
                            abstractC2900a2 = v12;
                            e = null;
                            if (abstractC2900a2 == null) {
                                String X10 = X(i, i10, K8, K9, K10);
                                StringBuilder sb = new StringBuilder(X10.length() + 39 + String.valueOf(h9).length());
                                sb.append("Failed to decode frame: id=");
                                sb.append(X10);
                                sb.append(", frameSize=");
                                sb.append(h9);
                                AbstractC2968bG.C(str, sb.toString(), e);
                            }
                            return abstractC2900a2;
                        }
                        if (K10 == 66 || i == 2) {
                            try {
                                int K20 = cr.K();
                                Charset S10 = S(K20);
                                int i30 = h9 - 1;
                                byte[] bArr9 = new byte[i30];
                                cr.H(bArr9, 0, i30);
                                int c07 = c0(0, bArr9);
                                str = "Id3Decoder";
                                String h12 = H4.h(new String(bArr9, 0, c07, StandardCharsets.ISO_8859_1));
                                int i31 = c07 + 1;
                                int a06 = a0(bArr9, i31, K20);
                                String k02 = k0(bArr9, i31, a06, S10);
                                int f05 = a06 + f0(K20);
                                int a07 = a0(bArr9, f05, K20);
                                String k03 = k0(bArr9, f05, a07, S10);
                                int f06 = a07 + f0(K20);
                                i10 = K7;
                                v12 = new Z1(h12, k02, k03, i30 <= f06 ? AbstractC3159eu.f29994b : Arrays.copyOfRange(bArr9, f06, i30));
                                cr.E(D8);
                                abstractC2900a2 = v12;
                                e = null;
                            } catch (Exception e13) {
                                e = e13;
                                str = "Id3Decoder";
                                i10 = K7;
                                cr.E(D8);
                                abstractC2900a2 = null;
                                if (abstractC2900a2 == null) {
                                }
                                return abstractC2900a2;
                            } catch (OutOfMemoryError e14) {
                                e = e14;
                                str = "Id3Decoder";
                                i10 = K7;
                                cr.E(D8);
                                abstractC2900a2 = null;
                                if (abstractC2900a2 == null) {
                                }
                                return abstractC2900a2;
                            }
                            if (abstractC2900a2 == null) {
                            }
                            return abstractC2900a2;
                        }
                        i11 = 71;
                    }
                    str = "Id3Decoder";
                    if (i != 2) {
                    }
                    cr.E(D8);
                    abstractC2900a2 = v12;
                    e = null;
                    if (abstractC2900a2 == null) {
                    }
                    return abstractC2900a2;
                }
                String X11 = X(i, 87, K8, K9, K10);
                byte[] bArr10 = new byte[h9];
                cr.H(bArr10, 0, h9);
                v12 = new C3276h2(X11, null, new String(bArr10, 0, c0(0, bArr10), StandardCharsets.ISO_8859_1));
                i10 = K7;
            }
            i10 = K7;
            v12 = null;
        }
        str = "Id3Decoder";
        cr.E(D8);
        abstractC2900a2 = v12;
        e = null;
        if (abstractC2900a2 == null) {
        }
        return abstractC2900a2;
    }

    public static File y(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        G(file2, false);
        return file2;
    }

    public static void z(int i, Cr cr) {
        cr.y(7);
        byte[] bArr = cr.f24252a;
        bArr[0] = -84;
        bArr[1] = com.anythink.core.common.s.a.c.f16317b;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f8473b);
        bArr[5] = (byte) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
        bArr[6] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8473b);
    }

    public abstract HashMap e();

    public String toString() {
        switch (this.f26264n) {
            case 19:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(e());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ MA(boolean z3) {
        this.f26264n = 26;
    }
}
