package r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.ads.CL;
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
import t0.AbstractC5051n;
import u.AbstractC5088e;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4955d {

    /* renamed from: a, reason: collision with root package name */
    public static final L2.i f40214a = new L2.i(22);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f40215b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f40216c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f40217d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f40218e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f40219f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f40220g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f40221h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f40222j = {48, 48, 50, 0};

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

    public static byte[] b(C4953b[] c4953bArr, byte[] bArr) {
        int i4 = 0;
        int i9 = 0;
        for (C4953b c4953b : c4953bArr) {
            i9 += ((((c4953b.f40212g * 2) + 7) & (-8)) / 8) + (c4953b.f40210e * 2) + d(bArr, c4953b.f40206a, c4953b.f40207b).getBytes(StandardCharsets.UTF_8).length + 16 + c4953b.f40211f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, f40219f)) {
            int length = c4953bArr.length;
            while (i4 < length) {
                C4953b c4953b2 = c4953bArr[i4];
                q(byteArrayOutputStream, c4953b2, d(bArr, c4953b2.f40206a, c4953b2.f40207b));
                p(byteArrayOutputStream, c4953b2);
                i4++;
            }
        } else {
            for (C4953b c4953b3 : c4953bArr) {
                q(byteArrayOutputStream, c4953b3, d(bArr, c4953b3.f40206a, c4953b3.f40207b));
            }
            int length2 = c4953bArr.length;
            while (i4 < length2) {
                p(byteArrayOutputStream, c4953bArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
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
        boolean z8 = true;
        for (File file2 : listFiles) {
            z8 = c(file2) && z8;
        }
        return z8;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f40221h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f40220g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC5051n.g(AbstractC5088e.b(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
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

    public static byte[] f(InputStream inputStream, int i4) {
        byte[] bArr = new byte[i4];
        int i9 = 0;
        while (i9 < i4) {
            int read = inputStream.read(bArr, i9, i4 - i9);
            if (read < 0) {
                throw new IllegalStateException(CL.i(i4, "Not enough bytes to read: "));
            }
            i9 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            i9 += (int) m(byteArrayInputStream, 2);
            iArr[i10] = i9;
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
    public static byte[] h(FileInputStream fileInputStream, int i4, int i9) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int i11 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i4) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i11 += inflater.inflate(bArr, i11, i9 - i11);
                    i10 += read;
                } catch (DataFormatException e6) {
                    throw new IllegalStateException(e6.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i10);
        } finally {
            inflater.end();
        }
    }

    public static C4953b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C4953b[] c4953bArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f40222j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m8 = (int) m(fileInputStream, 2);
            byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h9);
            try {
                C4953b[] k6 = k(byteArrayInputStream, bArr2, m8, c4953bArr);
                byteArrayInputStream.close();
                return k6;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f40217d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m9 = (int) m(fileInputStream, 1);
        byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h10);
        try {
            C4953b[] j9 = j(byteArrayInputStream2, m9, c4953bArr);
            byteArrayInputStream2.close();
            return j9;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C4953b[] j(ByteArrayInputStream byteArrayInputStream, int i4, C4953b[] c4953bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C4953b[0];
        }
        if (i4 != c4953bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i9 = 0; i9 < i4; i9++) {
            int m8 = (int) m(byteArrayInputStream, 2);
            iArr[i9] = (int) m(byteArrayInputStream, 2);
            strArr[i9] = new String(f(byteArrayInputStream, m8), StandardCharsets.UTF_8);
        }
        for (int i10 = 0; i10 < i4; i10++) {
            C4953b c4953b = c4953bArr[i10];
            if (!c4953b.f40207b.equals(strArr[i10])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            c4953b.f40210e = i11;
            c4953b.f40213h = g(byteArrayInputStream, i11);
        }
        return c4953bArr;
    }

    public static C4953b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, C4953b[] c4953bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C4953b[0];
        }
        if (i4 != c4953bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i4; i9++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m8 = m(byteArrayInputStream, 4);
            int m9 = (int) m(byteArrayInputStream, 2);
            C4953b c4953b = null;
            if (c4953bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i10 = 0;
                while (true) {
                    if (i10 >= c4953bArr.length) {
                        break;
                    }
                    if (c4953bArr[i10].f40207b.equals(substring)) {
                        c4953b = c4953bArr[i10];
                        break;
                    }
                    i10++;
                }
            }
            if (c4953b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c4953b.f40209d = m8;
            int[] g9 = g(byteArrayInputStream, m9);
            if (Arrays.equals(bArr, f40221h)) {
                c4953b.f40210e = m9;
                c4953b.f40213h = g9;
            }
        }
        return c4953bArr;
    }

    public static C4953b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f40218e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m8 = (int) m(fileInputStream, 1);
        byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h9);
        try {
            C4953b[] n9 = n(byteArrayInputStream, str, m8);
            byteArrayInputStream.close();
            return n9;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i4) {
        byte[] f6 = f(inputStream, i4);
        long j9 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            j9 += (f6[i9] & 255) << (i9 * 8);
        }
        return j9;
    }

    public static C4953b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i4) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C4953b[0];
        }
        C4953b[] c4953bArr = new C4953b[i4];
        for (int i9 = 0; i9 < i4; i9++) {
            int m8 = (int) m(byteArrayInputStream, 2);
            int m9 = (int) m(byteArrayInputStream, 2);
            c4953bArr[i9] = new C4953b(str, new String(f(byteArrayInputStream, m8), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m9, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m9], new TreeMap());
        }
        for (int i10 = 0; i10 < i4; i10++) {
            C4953b c4953b = c4953bArr[i10];
            int available = byteArrayInputStream.available() - c4953b.f40211f;
            int i11 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c4953b.i;
                if (available2 <= available) {
                    break;
                }
                i11 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i11), 1);
                for (int m10 = (int) m(byteArrayInputStream, 2); m10 > 0; m10--) {
                    m(byteArrayInputStream, 2);
                    int m11 = (int) m(byteArrayInputStream, 1);
                    if (m11 != 6 && m11 != 7) {
                        while (m11 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m12 = (int) m(byteArrayInputStream, 1); m12 > 0; m12--) {
                                m(byteArrayInputStream, 2);
                            }
                            m11--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c4953b.f40213h = g(byteArrayInputStream, c4953b.f40210e);
            int i12 = c4953b.f40212g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i12 * 2) + 7) & (-8)) / 8));
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = valueOf.get(i13) ? 2 : 0;
                if (valueOf.get(i13 + i12)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
        }
        return c4953bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C4953b[] c4953bArr) {
        long j9;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f40217d;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f40218e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b9 = b(c4953bArr, bArr3);
                u(byteArrayOutputStream, c4953bArr.length, 1);
                u(byteArrayOutputStream, b9.length, 4);
                byte[] a9 = a(b9);
                u(byteArrayOutputStream, a9.length, 4);
                byteArrayOutputStream.write(a9);
                return true;
            }
            byte[] bArr4 = f40220g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, c4953bArr.length, 1);
                for (C4953b c4953b : c4953bArr) {
                    int size = c4953b.i.size() * 4;
                    String d2 = d(bArr4, c4953b.f40206a, c4953b.f40207b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d2.getBytes(charset).length);
                    v(byteArrayOutputStream, c4953b.f40213h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, c4953b.f40208c, 4);
                    byteArrayOutputStream.write(d2.getBytes(charset));
                    Iterator it = c4953b.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i9 : c4953b.f40213h) {
                        v(byteArrayOutputStream, i9);
                    }
                }
                return true;
            }
            byte[] bArr5 = f40219f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b10 = b(c4953bArr, bArr5);
                u(byteArrayOutputStream, c4953bArr.length, 1);
                u(byteArrayOutputStream, b10.length, 4);
                byte[] a10 = a(b10);
                u(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr6 = f40221h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, c4953bArr.length);
            for (C4953b c4953b2 : c4953bArr) {
                String d3 = d(bArr6, c4953b2.f40206a, c4953b2.f40207b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d3.getBytes(charset2).length);
                TreeMap treeMap = c4953b2.i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, c4953b2.f40213h.length);
                u(byteArrayOutputStream, c4953b2.f40208c, 4);
                byteArrayOutputStream.write(d3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i10 : c4953b2.f40213h) {
                    v(byteArrayOutputStream, i10);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, c4953bArr.length);
            int i11 = 2;
            int i12 = 2;
            for (C4953b c4953b3 : c4953bArr) {
                u(byteArrayOutputStream2, c4953b3.f40208c, 4);
                u(byteArrayOutputStream2, c4953b3.f40209d, 4);
                u(byteArrayOutputStream2, c4953b3.f40212g, 4);
                String d9 = d(bArr2, c4953b3.f40206a, c4953b3.f40207b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d9.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i12 = i12 + 14 + length2;
                byteArrayOutputStream2.write(d9.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i12 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            }
            i iVar = new i(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < c4953bArr.length) {
                try {
                    C4953b c4953b4 = c4953bArr[i13];
                    v(byteArrayOutputStream3, i13);
                    v(byteArrayOutputStream3, c4953b4.f40210e);
                    i14 = i14 + 4 + (c4953b4.f40210e * i11);
                    int[] iArr = c4953b4.f40213h;
                    int length3 = iArr.length;
                    int i15 = i4;
                    int i16 = i11;
                    int i17 = i15;
                    while (i17 < length3) {
                        int i18 = iArr[i17];
                        v(byteArrayOutputStream3, i18 - i15);
                        i17++;
                        i15 = i18;
                    }
                    i13++;
                    i11 = i16;
                    i4 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
            }
            i iVar2 = new i(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i19 = 0;
            int i20 = 0;
            while (i19 < c4953bArr.length) {
                try {
                    C4953b c4953b5 = c4953bArr[i19];
                    Iterator it3 = c4953b5.i.entrySet().iterator();
                    int i21 = 0;
                    while (it3.hasNext()) {
                        i21 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i21, c4953b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, c4953b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i19);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i22 = i20 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i21);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i20 = i22 + length4;
                            i19++;
                            arrayList3 = arrayList4;
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
            if (i20 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i20 + ", does not match actual size " + byteArray5.length);
            }
            i iVar3 = new i(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i23);
                int i24 = iVar4.f40232a;
                if (i24 == 1) {
                    j9 = 0;
                } else if (i24 == 2) {
                    j9 = 1;
                } else if (i24 == 3) {
                    j9 = 2;
                } else if (i24 == 4) {
                    j9 = 3;
                } else {
                    if (i24 != 5) {
                        throw null;
                    }
                    j9 = 4;
                }
                u(byteArrayOutputStream, j9, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = iVar4.f40233b;
                if (iVar4.f40234c) {
                    long length5 = bArr7.length;
                    byte[] a11 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a11);
                    u(byteArrayOutputStream, a11.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a11.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i23++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i25));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C4953b c4953b) {
        s(byteArrayOutputStream, c4953b);
        int[] iArr = c4953b.f40213h;
        int length = iArr.length;
        int i4 = 0;
        int i9 = 0;
        while (i4 < length) {
            int i10 = iArr[i4];
            v(byteArrayOutputStream, i10 - i9);
            i4++;
            i9 = i10;
        }
        int i11 = c4953b.f40212g;
        byte[] bArr = new byte[(((i11 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c4953b.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i12 = intValue / 8;
                bArr[i12] = (byte) (bArr[i12] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i13 = intValue + i11;
                int i14 = i13 / 8;
                bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C4953b c4953b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, c4953b.f40210e);
        u(byteArrayOutputStream, c4953b.f40211f, 4);
        u(byteArrayOutputStream, c4953b.f40208c, 4);
        u(byteArrayOutputStream, c4953b.f40212g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i4, C4953b c4953b) {
        int bitCount = Integer.bitCount(i4 & (-2));
        int i9 = c4953b.f40212g;
        byte[] bArr = new byte[(((bitCount * i9) + 7) & (-8)) / 8];
        for (Map.Entry entry : c4953b.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = 0;
            for (int i11 = 1; i11 <= 4; i11 <<= 1) {
                if (i11 != 1 && (i11 & i4) != 0) {
                    if ((i11 & intValue2) == i11) {
                        int i12 = (i10 * i9) + intValue;
                        int i13 = i12 / 8;
                        bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
                    }
                    i10++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, C4953b c4953b) {
        int i4 = 0;
        for (Map.Entry entry : c4953b.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i4);
                v(byteArrayOutputStream, 0);
                i4 = intValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(3:53|54|55)|57|(3:235|236|(4:238|239|240|241)(2:245|246))|59|(3:67|68|(3:75|76|(4:78|79|80|(1:74))(2:81|82))(3:(1:71)|72|(0)))|98|(2:102|(5:106|107|108|109|(2:111|112)(3:113|114|115))(2:104|105))|129|(1:131)(3:135|136|(13:140|141|142|143|145|146|147|148|149|(3:154|155|(9:157|(2:158|(1:160)(1:161))|162|163|164|165|166|167|168))|151|152|153)(2:138|139))|(1:133)|134) */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0137, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0138, code lost:
    
        r20.e(7, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, InterfaceC4954c interfaceC4954c, boolean z8) {
        boolean z9;
        FileInputStream fileInputStream;
        ?? r72;
        C4953b[] c4953bArr;
        C4953b[] c4953bArr2;
        C4953b[] c4953bArr3;
        byte[] bArr;
        ?? r73;
        boolean z10;
        boolean z11;
        Throwable th;
        Throwable th2;
        boolean z12;
        boolean z13;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i4;
        C4952a c4952a;
        FileInputStream a9;
        boolean z14;
        boolean z15;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z8) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z15 = readLong == packageInfo.lastUpdateTime;
                            if (z15) {
                                interfaceC4954c.e(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z15) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        h.c(context, false);
                        return;
                    }
                }
                z15 = false;
                if (z15) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C4952a c4952a2 = new C4952a(assets, executor, interfaceC4954c, name, file2);
            byte[] bArr3 = c4952a2.f40200c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c4952a2.b(4, null);
                    }
                    c4952a2.f40203f = true;
                    byte[] bArr4 = f40215b;
                    try {
                        try {
                            fileInputStream = c4952a2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e6) {
                            interfaceC4954c.e(6, e6);
                            fileInputStream = null;
                            r72 = 8;
                            r73 = 8;
                            if (fileInputStream != null) {
                            }
                            c4953bArr2 = c4952a2.f40204g;
                            if (c4953bArr2 != null) {
                            }
                            InterfaceC4954c interfaceC4954c2 = c4952a2.f40199b;
                            c4953bArr3 = c4952a2.f40204g;
                            if (c4953bArr3 != null) {
                            }
                            bArr = c4952a2.f40205h;
                            if (bArr != null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z14 = z12;
                            h.c(context, (z13 || !z8) ? false : z14);
                        } catch (IOException e9) {
                            interfaceC4954c.e(7, e9);
                            fileInputStream = null;
                            r72 = 8;
                            r73 = 8;
                            if (fileInputStream != null) {
                            }
                            c4953bArr2 = c4952a2.f40204g;
                            if (c4953bArr2 != null) {
                            }
                            InterfaceC4954c interfaceC4954c22 = c4952a2.f40199b;
                            c4953bArr3 = c4952a2.f40204g;
                            if (c4953bArr3 != null) {
                            }
                            bArr = c4952a2.f40205h;
                            if (bArr != null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z14 = z12;
                            h.c(context, (z13 || !z8) ? false : z14);
                        }
                        if (fileInputStream != null) {
                            try {
                                try {
                                } catch (IllegalStateException e10) {
                                    interfaceC4954c.e(8, e10);
                                    fileInputStream.close();
                                    c4953bArr = null;
                                    c4952a2.f40204g = c4953bArr;
                                    c4953bArr2 = c4952a2.f40204g;
                                    if (c4953bArr2 != null) {
                                    }
                                    InterfaceC4954c interfaceC4954c222 = c4952a2.f40199b;
                                    c4953bArr3 = c4952a2.f40204g;
                                    if (c4953bArr3 != null) {
                                    }
                                    bArr = c4952a2.f40205h;
                                    if (bArr != null) {
                                    }
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z14 = z12;
                                    h.c(context, (z13 || !z8) ? false : z14);
                                }
                            } catch (IOException e11) {
                                interfaceC4954c.e(7, e11);
                                fileInputStream.close();
                                c4953bArr = null;
                                c4952a2.f40204g = c4953bArr;
                                c4953bArr2 = c4952a2.f40204g;
                                if (c4953bArr2 != null) {
                                }
                                InterfaceC4954c interfaceC4954c2222 = c4952a2.f40199b;
                                c4953bArr3 = c4952a2.f40204g;
                                if (c4953bArr3 != null) {
                                }
                                bArr = c4952a2.f40205h;
                                if (bArr != null) {
                                }
                                if (z11) {
                                }
                                z13 = z11;
                                z14 = z12;
                                h.c(context, (z13 || !z8) ? false : z14);
                            }
                            if (!Arrays.equals(bArr4, f(fileInputStream, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c4953bArr = l(fileInputStream, f(fileInputStream, 4), c4952a2.f40202e);
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                                interfaceC4954c.e(7, e12);
                            }
                            c4952a2.f40204g = c4953bArr;
                        }
                        c4953bArr2 = c4952a2.f40204g;
                        if (c4953bArr2 != null && ((i4 = Build.VERSION.SDK_INT) >= 31 || i4 == 24 || i4 == 25)) {
                            try {
                                a9 = c4952a2.a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e13) {
                                interfaceC4954c.e(9, e13);
                            } catch (IOException e14) {
                                interfaceC4954c.e(7, e14);
                            } catch (IllegalStateException e15) {
                                c4952a2.f40204g = null;
                                interfaceC4954c.e(8, e15);
                            }
                            if (a9 == null) {
                                try {
                                    if (!Arrays.equals(f40216c, f(a9, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c4952a2.f40204g = i(a9, f(a9, 4), bArr3, c4953bArr2);
                                    a9.close();
                                    c4952a = c4952a2;
                                    if (c4952a != null) {
                                        c4952a2 = c4952a;
                                    }
                                } finally {
                                }
                            } else {
                                if (a9 != null) {
                                    a9.close();
                                }
                                c4952a = null;
                                if (c4952a != null) {
                                }
                            }
                        }
                        InterfaceC4954c interfaceC4954c22222 = c4952a2.f40199b;
                        c4953bArr3 = c4952a2.f40204g;
                        if (c4953bArr3 != null && (bArr2 = c4952a2.f40200c) != null) {
                            if (c4952a2.f40203f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr2);
                                } finally {
                                }
                            } catch (IOException e16) {
                                interfaceC4954c22222.e(7, e16);
                            } catch (IllegalStateException e17) {
                                interfaceC4954c22222.e(8, e17);
                            }
                            if (o(byteArrayOutputStream, bArr2, c4953bArr3)) {
                                c4952a2.f40205h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                c4952a2.f40204g = null;
                            } else {
                                interfaceC4954c22222.e(5, null);
                                c4952a2.f40204g = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = c4952a2.f40205h;
                        if (bArr != null) {
                            z11 = false;
                            z12 = true;
                        } else {
                            try {
                                if (!c4952a2.f40203f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(c4952a2.f40201d);
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
                                                                                z12 = true;
                                                                                c4952a2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c4952a2.f40205h = null;
                                                                                c4952a2.f40204g = null;
                                                                                z11 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e18) {
                                        e = e18;
                                        c4952a2.b(6, e);
                                        z10 = r73;
                                        z11 = false;
                                        z12 = z10;
                                        if (z11) {
                                        }
                                        z13 = z11;
                                        z14 = z12;
                                        h.c(context, (z13 || !z8) ? false : z14);
                                    } catch (IOException e19) {
                                        e = e19;
                                        c4952a2.b(7, e);
                                        z10 = r72;
                                        z11 = false;
                                        z12 = z10;
                                        if (z11) {
                                        }
                                        z13 = z11;
                                        z14 = z12;
                                        h.c(context, (z13 || !z8) ? false : z14);
                                    }
                                } catch (FileNotFoundException e20) {
                                    e = e20;
                                    r73 = 1;
                                    c4952a2.b(6, e);
                                    z10 = r73;
                                    z11 = false;
                                    z12 = z10;
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z14 = z12;
                                    h.c(context, (z13 || !z8) ? false : z14);
                                } catch (IOException e21) {
                                    e = e21;
                                    r72 = 1;
                                    c4952a2.b(7, e);
                                    z10 = r72;
                                    z11 = false;
                                    z12 = z10;
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z14 = z12;
                                    h.c(context, (z13 || !z8) ? false : z14);
                                }
                            } finally {
                                c4952a2.f40205h = null;
                                c4952a2.f40204g = null;
                            }
                        }
                        if (z11) {
                            e(packageInfo, filesDir);
                        }
                        z13 = z11;
                        z14 = z12;
                    } finally {
                    }
                    r72 = 8;
                    r73 = 8;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c4952a2.b(4, null);
                        }
                        c4952a2.f40203f = true;
                        byte[] bArr42 = f40215b;
                        fileInputStream = c4952a2.a(assets, "dexopt/baseline.prof");
                        r72 = 8;
                        r73 = 8;
                        if (fileInputStream != null) {
                        }
                        c4953bArr2 = c4952a2.f40204g;
                        if (c4953bArr2 != null) {
                            a9 = c4952a2.a(assets, "dexopt/baseline.profm");
                            if (a9 == null) {
                            }
                        }
                        InterfaceC4954c interfaceC4954c222222 = c4952a2.f40199b;
                        c4953bArr3 = c4952a2.f40204g;
                        if (c4953bArr3 != null) {
                            if (c4952a2.f40203f) {
                            }
                        }
                        bArr = c4952a2.f40205h;
                        if (bArr != null) {
                        }
                        if (z11) {
                        }
                        z13 = z11;
                        z14 = z12;
                    } catch (IOException unused2) {
                        z9 = true;
                        c4952a2.b(4, null);
                    }
                }
                h.c(context, (z13 || !z8) ? false : z14);
            }
            c4952a2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z9 = true;
            z13 = false;
            z14 = z9;
            h.c(context, (z13 || !z8) ? false : z14);
        } catch (PackageManager.NameNotFoundException e22) {
            interfaceC4954c.e(7, e22);
            h.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j9, int i4) {
        byte[] bArr = new byte[i4];
        for (int i9 = 0; i9 < i4; i9++) {
            bArr[i9] = (byte) ((j9 >> (i9 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        u(byteArrayOutputStream, i4, 2);
    }
}
