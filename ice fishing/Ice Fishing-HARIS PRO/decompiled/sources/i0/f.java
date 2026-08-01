package i0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.e f3287a = new S0.e(24);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3288b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3289c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f3290d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f3291f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f3292g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f3293h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (c cVar : cVarArr) {
            i3 += ((((cVar.f3285g * 2) + 7) & (-8)) / 8) + (cVar.e * 2) + d(cVar.f3280a, cVar.f3281b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f3284f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f3291f)) {
            int length = cVarArr.length;
            while (i2 < length) {
                c cVar2 = cVarArr[i2];
                q(byteArrayOutputStream, cVar2, d(cVar2.f3280a, cVar2.f3281b, bArr));
                p(byteArrayOutputStream, cVar2);
                i2++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f3280a, cVar3.f3281b, bArr));
            }
            int length2 = cVarArr.length;
            while (i2 < length2) {
                p(byteArrayOutputStream, cVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : listFiles) {
            z2 = c(file2) && z2;
        }
        return z2;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f3293h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3292g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return D1.h.h(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new IllegalStateException(D1.h.e("Not enough bytes to read: ", i2));
            }
            i3 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) m(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] h(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m2 = (int) m(fileInputStream, 2);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
            try {
                c[] k2 = k(byteArrayInputStream, bArr2, m2, cVarArr);
                byteArrayInputStream.close();
                return k2;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f3290d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m3 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h3);
        try {
            c[] j2 = j(byteArrayInputStream2, m3, cVarArr);
            byteArrayInputStream2.close();
            return j2;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i2, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            iArr[i3] = (int) m(byteArrayInputStream, 2);
            strArr[i3] = new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            c cVar = cVarArr[i4];
            if (!cVar.f3281b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            cVar.e = i5;
            cVar.f3286h = g(byteArrayInputStream, i5);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i2 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m2 = m(byteArrayInputStream, 4);
            int m3 = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i4].f3281b.equals(substring)) {
                        cVar = cVarArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f3283d = m2;
            int[] g2 = g(byteArrayInputStream, m3);
            if (Arrays.equals(bArr, f3293h)) {
                cVar.e = m3;
                cVar.f3286h = g2;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m2 = (int) m(fileInputStream, 1);
        byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
        try {
            c[] n2 = n(byteArrayInputStream, str, m2);
            byteArrayInputStream.close();
            return n2;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i2) {
        byte[] f2 = f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (f2[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            int m3 = (int) m(byteArrayInputStream, 2);
            cVarArr[i3] = new c(str, new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m3, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m3], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            c cVar = cVarArr[i4];
            int available = byteArrayInputStream.available() - cVar.f3284f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.i;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i5), 1);
                for (int m4 = (int) m(byteArrayInputStream, 2); m4 > 0; m4--) {
                    m(byteArrayInputStream, 2);
                    int m5 = (int) m(byteArrayInputStream, 1);
                    if (m5 != 6 && m5 != 7) {
                        while (m5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m6 = (int) m(byteArrayInputStream, 1); m6 > 0; m6--) {
                                m(byteArrayInputStream, 2);
                            }
                            m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f3286h = g(byteArrayInputStream, cVar.e);
            int i6 = cVar.f3285g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = valueOf.get(i7) ? 2 : 0;
                if (valueOf.get(i7 + i6)) {
                    i8 |= 4;
                }
                if (i8 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f3290d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b2.length, 4);
                byte[] a2 = a(b2);
                u(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = f3292g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.i.size() * 4;
                    String d2 = d(cVar.f3280a, cVar.f3281b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d2.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.f3286h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.f3282c, 4);
                    byteArrayOutputStream.write(d2.getBytes(charset));
                    Iterator it = cVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i3 : cVar.f3286h) {
                        v(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f3291f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b3 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                u(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr6 = f3293h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String d3 = d(cVar2.f3280a, cVar2.f3281b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d3.getBytes(charset2).length);
                TreeMap treeMap = cVar2.i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.f3286h.length);
                u(byteArrayOutputStream, cVar2.f3282c, 4);
                byteArrayOutputStream.write(d3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : cVar2.f3286h) {
                    v(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.f3282c, 4);
                u(byteArrayOutputStream2, cVar3.f3283d, 4);
                u(byteArrayOutputStream2, cVar3.f3285g, 4);
                String d4 = d(cVar3.f3280a, cVar3.f3281b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d4.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(d4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            k kVar = new k(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(kVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i7];
                    v(byteArrayOutputStream3, i7);
                    v(byteArrayOutputStream3, cVar4.e);
                    i8 = i8 + 4 + (cVar4.e * 2);
                    int[] iArr = cVar4.f3286h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        v(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            k kVar2 = new k(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i11];
                    Iterator it3 = cVar5.i.entrySet().iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        i13 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i13, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i14 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i13);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i5 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            k kVar3 = new k(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(kVar3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                k kVar4 = (k) arrayList2.get(i15);
                int i16 = kVar4.f3303a;
                if (i16 == 1) {
                    j2 = 0;
                } else if (i16 == 2) {
                    j2 = 1;
                } else if (i16 == 3) {
                    j2 = 2;
                } else if (i16 == 4) {
                    j2 = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                u(byteArrayOutputStream, j2, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = kVar4.f3304b;
                if (kVar4.f3305c) {
                    long length5 = bArr7.length;
                    byte[] a4 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a4);
                    u(byteArrayOutputStream, a4.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a4.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        s(byteArrayOutputStream, cVar);
        int[] iArr = cVar.f3286h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            v(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        int i5 = cVar.f3285g;
        byte[] bArr = new byte[(((i5 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i5;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.e);
        u(byteArrayOutputStream, cVar.f3284f, 4);
        u(byteArrayOutputStream, cVar.f3282c, 4);
        u(byteArrayOutputStream, cVar.f3285g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i2, c cVar) {
        int bitCount = Integer.bitCount(i2 & (-2));
        int i3 = cVar.f3285g;
        byte[] bArr = new byte[(((bitCount * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i2 = 0;
        for (Map.Entry entry : cVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i2);
                v(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c1, code lost:
    
        if (r7 == null) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [i0.e] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, e eVar, boolean z2) {
        boolean z3;
        FileInputStream fileInputStream;
        IOException iOException;
        int i2;
        c[] cVarArr;
        c[] cVarArr2;
        b bVar;
        c[] cVarArr3;
        byte[] bArr;
        boolean z4;
        boolean z5;
        Throwable th;
        Throwable th2;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream a2;
        boolean z6;
        ?? r8 = eVar;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = readLong == packageInfo.lastUpdateTime;
                            if (z6) {
                                r8.l(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z6) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        j.c(context, false);
                        return;
                    }
                }
                z6 = false;
                if (z6) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, eVar, name, file2);
            byte[] bArr3 = bVar2.f3275c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        bVar2.b(4, null);
                    }
                    bVar2.f3277f = true;
                    byte[] bArr4 = f3288b;
                    try {
                        try {
                            fileInputStream = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e2) {
                            r8.l(6, e2);
                            fileInputStream = null;
                            if (fileInputStream != null) {
                            }
                            cVarArr2 = bVar2.f3278g;
                            if (cVarArr2 != null) {
                            }
                            bVar = bVar2;
                            e eVar2 = bVar.f3274b;
                            cVarArr3 = bVar.f3278g;
                            if (cVarArr3 != null) {
                            }
                            bArr = bVar.f3279h;
                            if (bArr != null) {
                            }
                            if (z5) {
                            }
                            j.c(context, (z5 || !z2) ? false : z3);
                        } catch (IOException e3) {
                            r8.l(7, e3);
                            fileInputStream = null;
                            if (fileInputStream != null) {
                            }
                            cVarArr2 = bVar2.f3278g;
                            if (cVarArr2 != null) {
                            }
                            bVar = bVar2;
                            e eVar22 = bVar.f3274b;
                            cVarArr3 = bVar.f3278g;
                            if (cVarArr3 != null) {
                            }
                            bArr = bVar.f3279h;
                            if (bArr != null) {
                            }
                            if (z5) {
                            }
                            j.c(context, (z5 || !z2) ? false : z3);
                        }
                        if (fileInputStream != null) {
                            try {
                            } catch (IOException e4) {
                                i2 = 7;
                                r8.l(7, e4);
                                try {
                                    fileInputStream.close();
                                } catch (IOException e5) {
                                    iOException = e5;
                                    r8.l(i2, iOException);
                                    cVarArr = null;
                                    bVar2.f3278g = cVarArr;
                                    cVarArr2 = bVar2.f3278g;
                                    if (cVarArr2 != null) {
                                    }
                                    bVar = bVar2;
                                    e eVar222 = bVar.f3274b;
                                    cVarArr3 = bVar.f3278g;
                                    if (cVarArr3 != null) {
                                    }
                                    bArr = bVar.f3279h;
                                    if (bArr != null) {
                                    }
                                    if (z5) {
                                    }
                                    j.c(context, (z5 || !z2) ? false : z3);
                                }
                                cVarArr = null;
                                bVar2.f3278g = cVarArr;
                                cVarArr2 = bVar2.f3278g;
                                if (cVarArr2 != null) {
                                }
                                bVar = bVar2;
                                e eVar2222 = bVar.f3274b;
                                cVarArr3 = bVar.f3278g;
                                if (cVarArr3 != null) {
                                }
                                bArr = bVar.f3279h;
                                if (bArr != null) {
                                }
                                if (z5) {
                                }
                                j.c(context, (z5 || !z2) ? false : z3);
                            } catch (IllegalStateException e6) {
                                try {
                                    r8.l(8, e6);
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e7) {
                                        iOException = e7;
                                        i2 = 7;
                                        r8.l(i2, iOException);
                                        cVarArr = null;
                                        bVar2.f3278g = cVarArr;
                                        cVarArr2 = bVar2.f3278g;
                                        if (cVarArr2 != null) {
                                        }
                                        bVar = bVar2;
                                        e eVar22222 = bVar.f3274b;
                                        cVarArr3 = bVar.f3278g;
                                        if (cVarArr3 != null) {
                                        }
                                        bArr = bVar.f3279h;
                                        if (bArr != null) {
                                        }
                                        if (z5) {
                                        }
                                        j.c(context, (z5 || !z2) ? false : z3);
                                    }
                                    cVarArr = null;
                                    bVar2.f3278g = cVarArr;
                                    cVarArr2 = bVar2.f3278g;
                                    if (cVarArr2 != null) {
                                    }
                                    bVar = bVar2;
                                    e eVar222222 = bVar.f3274b;
                                    cVarArr3 = bVar.f3278g;
                                    if (cVarArr3 != null) {
                                    }
                                    bArr = bVar.f3279h;
                                    if (bArr != null) {
                                    }
                                    if (z5) {
                                    }
                                    j.c(context, (z5 || !z2) ? false : z3);
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwable th4 = th;
                                    try {
                                        fileInputStream.close();
                                        throw th4;
                                    } catch (IOException e8) {
                                        r8.l(7, e8);
                                        throw th4;
                                    }
                                }
                            }
                            if (!Arrays.equals(bArr4, f(fileInputStream, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            cVarArr = l(fileInputStream, f(fileInputStream, 4), bVar2.e);
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                                r8.l(7, e9);
                            }
                            bVar2.f3278g = cVarArr;
                        }
                        cVarArr2 = bVar2.f3278g;
                        if (cVarArr2 != null && Build.VERSION.SDK_INT >= 31) {
                            try {
                                a2 = bVar2.a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e10) {
                                r8.l(9, e10);
                            } catch (IOException e11) {
                                r8.l(7, e11);
                            } catch (IllegalStateException e12) {
                                bVar2.f3278g = null;
                                r8.l(8, e12);
                            }
                            if (a2 == null) {
                                try {
                                    if (!Arrays.equals(f3289c, f(a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f3278g = i(a2, f(a2, 4), bArr3, cVarArr2);
                                    a2.close();
                                    bVar = bVar2;
                                } finally {
                                }
                            } else {
                                if (a2 != null) {
                                    a2.close();
                                }
                                bVar = null;
                            }
                        }
                        bVar = bVar2;
                        e eVar2222222 = bVar.f3274b;
                        cVarArr3 = bVar.f3278g;
                        if (cVarArr3 != null && (bArr2 = bVar.f3275c) != null) {
                            if (bVar.f3277f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr2);
                                } finally {
                                }
                            } catch (IOException e13) {
                                eVar2222222.l(7, e13);
                            } catch (IllegalStateException e14) {
                                eVar2222222.l(8, e14);
                            }
                            if (o(byteArrayOutputStream, bArr2, cVarArr3)) {
                                bVar.f3279h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                bVar.f3278g = null;
                            } else {
                                eVar2222222.l(5, null);
                                bVar.f3278g = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = bVar.f3279h;
                        if (bArr != null) {
                            z5 = false;
                            z3 = true;
                        } else {
                            try {
                                if (!bVar.f3277f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(bVar.f3276d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z3 = true;
                                                                                bVar.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                bVar.f3279h = null;
                                                                                bVar.f3278g = null;
                                                                                z5 = true;
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            Throwable th6 = th;
                                                                            if (tryLock == null) {
                                                                                throw th6;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th6;
                                                                            } catch (Throwable th7) {
                                                                                th6.addSuppressed(th7);
                                                                                throw th6;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    Throwable th9 = th;
                                                                    if (channel == null) {
                                                                        throw th9;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th9;
                                                                    } catch (Throwable th10) {
                                                                        th9.addSuppressed(th10);
                                                                        throw th9;
                                                                    }
                                                                }
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                        }
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th14) {
                                                            th2.addSuppressed(th14);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th17) {
                                                    th.addSuppressed(th17);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th18) {
                                            th = th18;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e15) {
                                        e = e15;
                                        bVar.b(6, e);
                                        z4 = r8;
                                        z5 = false;
                                        z3 = z4;
                                        if (z5) {
                                        }
                                        j.c(context, (z5 || !z2) ? false : z3);
                                    } catch (IOException e16) {
                                        e = e16;
                                        bVar.b(7, e);
                                        z4 = r8;
                                        z5 = false;
                                        z3 = z4;
                                        if (z5) {
                                        }
                                        j.c(context, (z5 || !z2) ? false : z3);
                                    }
                                } catch (FileNotFoundException e17) {
                                    e = e17;
                                    r8 = 1;
                                    bVar.b(6, e);
                                    z4 = r8;
                                    z5 = false;
                                    z3 = z4;
                                    if (z5) {
                                    }
                                    j.c(context, (z5 || !z2) ? false : z3);
                                } catch (IOException e18) {
                                    e = e18;
                                    r8 = 1;
                                    bVar.b(7, e);
                                    z4 = r8;
                                    z5 = false;
                                    z3 = z4;
                                    if (z5) {
                                    }
                                    j.c(context, (z5 || !z2) ? false : z3);
                                }
                            } finally {
                                bVar.f3279h = null;
                                bVar.f3278g = null;
                            }
                        }
                        if (z5) {
                            e(packageInfo, filesDir);
                        }
                    } catch (Throwable th19) {
                        th = th19;
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            bVar2.b(4, null);
                        }
                        bVar2.f3277f = true;
                        byte[] bArr42 = f3288b;
                        fileInputStream = bVar2.a(assets, "dexopt/baseline.prof");
                        if (fileInputStream != null) {
                        }
                        cVarArr2 = bVar2.f3278g;
                        if (cVarArr2 != null) {
                            a2 = bVar2.a(assets, "dexopt/baseline.profm");
                            if (a2 == null) {
                            }
                        }
                        bVar = bVar2;
                        e eVar22222222 = bVar.f3274b;
                        cVarArr3 = bVar.f3278g;
                        if (cVarArr3 != null) {
                            if (bVar.f3277f) {
                            }
                        }
                        bArr = bVar.f3279h;
                        if (bArr != null) {
                        }
                        if (z5) {
                        }
                    } catch (IOException unused2) {
                        z3 = true;
                        bVar2.b(4, null);
                    }
                }
                j.c(context, (z5 || !z2) ? false : z3);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z3 = true;
            z5 = false;
            j.c(context, (z5 || !z2) ? false : z3);
        } catch (PackageManager.NameNotFoundException e19) {
            r8.l(7, e19);
            j.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        u(byteArrayOutputStream, i2, 2);
    }
}
