package r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.ads.Wv;
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
import u.AbstractC5050e;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4895d {

    /* renamed from: a, reason: collision with root package name */
    public static final G3.e f40123a = new G3.e(23);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f40124b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f40125c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f40126d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f40127e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f40128f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f40129g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f40130h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f40131j = {48, 48, 50, 0};

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

    public static byte[] b(C4893b[] c4893bArr, byte[] bArr) {
        int i4 = 0;
        int i6 = 0;
        for (C4893b c4893b : c4893bArr) {
            i6 += ((((c4893b.f40121g * 2) + 7) & (-8)) / 8) + (c4893b.f40119e * 2) + d(bArr, c4893b.f40115a, c4893b.f40116b).getBytes(StandardCharsets.UTF_8).length + 16 + c4893b.f40120f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i6);
        if (Arrays.equals(bArr, f40128f)) {
            int length = c4893bArr.length;
            while (i4 < length) {
                C4893b c4893b2 = c4893bArr[i4];
                q(byteArrayOutputStream, c4893b2, d(bArr, c4893b2.f40115a, c4893b2.f40116b));
                p(byteArrayOutputStream, c4893b2);
                i4++;
            }
        } else {
            for (C4893b c4893b3 : c4893bArr) {
                q(byteArrayOutputStream, c4893b3, d(bArr, c4893b3.f40115a, c4893b3.f40116b));
            }
            int length2 = c4893bArr.length;
            while (i4 < length2) {
                p(byteArrayOutputStream, c4893bArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i6) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i6);
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
        boolean z6 = true;
        for (File file2 : listFiles) {
            z6 = c(file2) && z6;
        }
        return z6;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f40130h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f40129g;
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
                return Wv.i(AbstractC5050e.b(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
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
        int i6 = 0;
        while (i6 < i4) {
            int read = inputStream.read(bArr, i6, i4 - i6);
            if (read < 0) {
                throw new IllegalStateException(Wv.f(i4, "Not enough bytes to read: "));
            }
            i6 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int i6 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            i6 += (int) m(byteArrayInputStream, 2);
            iArr[i9] = i6;
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
    public static byte[] h(FileInputStream fileInputStream, int i4, int i6) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i6];
            byte[] bArr2 = new byte[2048];
            int i9 = 0;
            int i10 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i9 < i4) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i10 += inflater.inflate(bArr, i10, i6 - i10);
                    i9 += read;
                } catch (DataFormatException e9) {
                    throw new IllegalStateException(e9.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i9);
        } finally {
            inflater.end();
        }
    }

    public static C4893b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C4893b[] c4893bArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f40131j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m9 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
            try {
                C4893b[] k9 = k(byteArrayInputStream, bArr2, m9, c4893bArr);
                byteArrayInputStream.close();
                return k9;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f40126d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m10 = (int) m(fileInputStream, 1);
        byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h9);
        try {
            C4893b[] j6 = j(byteArrayInputStream2, m10, c4893bArr);
            byteArrayInputStream2.close();
            return j6;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C4893b[] j(ByteArrayInputStream byteArrayInputStream, int i4, C4893b[] c4893bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C4893b[0];
        }
        if (i4 != c4893bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            int m9 = (int) m(byteArrayInputStream, 2);
            iArr[i6] = (int) m(byteArrayInputStream, 2);
            strArr[i6] = new String(f(byteArrayInputStream, m9), StandardCharsets.UTF_8);
        }
        for (int i9 = 0; i9 < i4; i9++) {
            C4893b c4893b = c4893bArr[i9];
            if (!c4893b.f40116b.equals(strArr[i9])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i10 = iArr[i9];
            c4893b.f40119e = i10;
            c4893b.f40122h = g(byteArrayInputStream, i10);
        }
        return c4893bArr;
    }

    public static C4893b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, C4893b[] c4893bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C4893b[0];
        }
        if (i4 != c4893bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i6 = 0; i6 < i4; i6++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m9 = m(byteArrayInputStream, 4);
            int m10 = (int) m(byteArrayInputStream, 2);
            C4893b c4893b = null;
            if (c4893bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i9 = 0;
                while (true) {
                    if (i9 >= c4893bArr.length) {
                        break;
                    }
                    if (c4893bArr[i9].f40116b.equals(substring)) {
                        c4893b = c4893bArr[i9];
                        break;
                    }
                    i9++;
                }
            }
            if (c4893b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c4893b.f40118d = m9;
            int[] g9 = g(byteArrayInputStream, m10);
            if (Arrays.equals(bArr, f40130h)) {
                c4893b.f40119e = m10;
                c4893b.f40122h = g9;
            }
        }
        return c4893bArr;
    }

    public static C4893b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f40127e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m9 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
        try {
            C4893b[] n9 = n(byteArrayInputStream, str, m9);
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
        byte[] f2 = f(inputStream, i4);
        long j6 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            j6 += (f2[i6] & 255) << (i6 * 8);
        }
        return j6;
    }

    public static C4893b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i4) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C4893b[0];
        }
        C4893b[] c4893bArr = new C4893b[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            int m9 = (int) m(byteArrayInputStream, 2);
            int m10 = (int) m(byteArrayInputStream, 2);
            c4893bArr[i6] = new C4893b(str, new String(f(byteArrayInputStream, m9), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m10, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m10], new TreeMap());
        }
        for (int i9 = 0; i9 < i4; i9++) {
            C4893b c4893b = c4893bArr[i9];
            int available = byteArrayInputStream.available() - c4893b.f40120f;
            int i10 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c4893b.i;
                if (available2 <= available) {
                    break;
                }
                i10 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i10), 1);
                for (int m11 = (int) m(byteArrayInputStream, 2); m11 > 0; m11--) {
                    m(byteArrayInputStream, 2);
                    int m12 = (int) m(byteArrayInputStream, 1);
                    if (m12 != 6 && m12 != 7) {
                        while (m12 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m13 = (int) m(byteArrayInputStream, 1); m13 > 0; m13--) {
                                m(byteArrayInputStream, 2);
                            }
                            m12--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c4893b.f40122h = g(byteArrayInputStream, c4893b.f40119e);
            int i11 = c4893b.f40121g;
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i11 * 2) + 7) & (-8)) / 8));
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = valueOf.get(i12) ? 2 : 0;
                if (valueOf.get(i12 + i11)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | num.intValue()));
                }
            }
        }
        return c4893bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C4893b[] c4893bArr) {
        long j6;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f40126d;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f40127e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b9 = b(c4893bArr, bArr3);
                u(byteArrayOutputStream, c4893bArr.length, 1);
                u(byteArrayOutputStream, b9.length, 4);
                byte[] a9 = a(b9);
                u(byteArrayOutputStream, a9.length, 4);
                byteArrayOutputStream.write(a9);
                return true;
            }
            byte[] bArr4 = f40129g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, c4893bArr.length, 1);
                for (C4893b c4893b : c4893bArr) {
                    int size = c4893b.i.size() * 4;
                    String d9 = d(bArr4, c4893b.f40115a, c4893b.f40116b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d9.getBytes(charset).length);
                    v(byteArrayOutputStream, c4893b.f40122h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, c4893b.f40117c, 4);
                    byteArrayOutputStream.write(d9.getBytes(charset));
                    Iterator it = c4893b.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i6 : c4893b.f40122h) {
                        v(byteArrayOutputStream, i6);
                    }
                }
                return true;
            }
            byte[] bArr5 = f40128f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b10 = b(c4893bArr, bArr5);
                u(byteArrayOutputStream, c4893bArr.length, 1);
                u(byteArrayOutputStream, b10.length, 4);
                byte[] a10 = a(b10);
                u(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr6 = f40130h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, c4893bArr.length);
            for (C4893b c4893b2 : c4893bArr) {
                String d10 = d(bArr6, c4893b2.f40115a, c4893b2.f40116b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d10.getBytes(charset2).length);
                TreeMap treeMap = c4893b2.i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, c4893b2.f40122h.length);
                u(byteArrayOutputStream, c4893b2.f40117c, 4);
                byteArrayOutputStream.write(d10.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i9 : c4893b2.f40122h) {
                    v(byteArrayOutputStream, i9);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, c4893bArr.length);
            int i10 = 2;
            int i11 = 2;
            for (C4893b c4893b3 : c4893bArr) {
                u(byteArrayOutputStream2, c4893b3.f40117c, 4);
                u(byteArrayOutputStream2, c4893b3.f40118d, 4);
                u(byteArrayOutputStream2, c4893b3.f40121g, 4);
                String d11 = d(bArr2, c4893b3.f40115a, c4893b3.f40116b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d11.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i11 = i11 + 14 + length2;
                byteArrayOutputStream2.write(d11.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i11 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            }
            i iVar = new i(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(iVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < c4893bArr.length) {
                try {
                    C4893b c4893b4 = c4893bArr[i12];
                    v(byteArrayOutputStream3, i12);
                    v(byteArrayOutputStream3, c4893b4.f40119e);
                    i13 = i13 + 4 + (c4893b4.f40119e * i10);
                    int[] iArr = c4893b4.f40122h;
                    int length3 = iArr.length;
                    int i14 = i4;
                    int i15 = i10;
                    int i16 = i14;
                    while (i16 < length3) {
                        int i17 = iArr[i16];
                        v(byteArrayOutputStream3, i17 - i14);
                        i16++;
                        i14 = i17;
                    }
                    i12++;
                    i10 = i15;
                    i4 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
            }
            i iVar2 = new i(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i18 = 0;
            int i19 = 0;
            while (i18 < c4893bArr.length) {
                try {
                    C4893b c4893b5 = c4893bArr[i18];
                    Iterator it3 = c4893b5.i.entrySet().iterator();
                    int i20 = 0;
                    while (it3.hasNext()) {
                        i20 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i20, c4893b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, c4893b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i18);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i21 = i19 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i20);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i19 = i21 + length4;
                            i18++;
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
            if (i19 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray5.length);
            }
            i iVar3 = new i(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(iVar3);
            long j9 = 4;
            long size2 = j9 + j9 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i22 = 0;
            while (i22 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i22);
                int i23 = iVar4.f40141a;
                if (i23 == 1) {
                    j6 = 0;
                } else if (i23 == 2) {
                    j6 = 1;
                } else if (i23 == 3) {
                    j6 = 2;
                } else if (i23 == 4) {
                    j6 = 3;
                } else {
                    if (i23 != 5) {
                        throw null;
                    }
                    j6 = 4;
                }
                u(byteArrayOutputStream, j6, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = iVar4.f40142b;
                if (iVar4.f40143c) {
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
                i22++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C4893b c4893b) {
        s(byteArrayOutputStream, c4893b);
        int[] iArr = c4893b.f40122h;
        int length = iArr.length;
        int i4 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i9 = iArr[i4];
            v(byteArrayOutputStream, i9 - i6);
            i4++;
            i6 = i9;
        }
        int i10 = c4893b.f40121g;
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c4893b.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i11 = intValue / 8;
                bArr[i11] = (byte) (bArr[i11] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i12 = intValue + i10;
                int i13 = i12 / 8;
                bArr[i13] = (byte) ((1 << (i12 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C4893b c4893b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, c4893b.f40119e);
        u(byteArrayOutputStream, c4893b.f40120f, 4);
        u(byteArrayOutputStream, c4893b.f40117c, 4);
        u(byteArrayOutputStream, c4893b.f40121g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i4, C4893b c4893b) {
        int bitCount = Integer.bitCount(i4 & (-2));
        int i6 = c4893b.f40121g;
        byte[] bArr = new byte[(((bitCount * i6) + 7) & (-8)) / 8];
        for (Map.Entry entry : c4893b.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i9 = 0;
            for (int i10 = 1; i10 <= 4; i10 <<= 1) {
                if (i10 != 1 && (i10 & i4) != 0) {
                    if ((i10 & intValue2) == i10) {
                        int i11 = (i9 * i6) + intValue;
                        int i12 = i11 / 8;
                        bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
                    }
                    i9++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, C4893b c4893b) {
        int i4 = 0;
        for (Map.Entry entry : c4893b.i.entrySet()) {
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
    
        r20.a(7, r0);
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
    public static void t(Context context, Executor executor, InterfaceC4894c interfaceC4894c, boolean z6) {
        boolean z9;
        FileInputStream fileInputStream;
        ?? r72;
        C4893b[] c4893bArr;
        C4893b[] c4893bArr2;
        C4893b[] c4893bArr3;
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
        C4892a c4892a;
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
            if (!z6) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z15 = readLong == packageInfo.lastUpdateTime;
                            if (z15) {
                                interfaceC4894c.a(2, null);
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
            C4892a c4892a2 = new C4892a(assets, executor, interfaceC4894c, name, file2);
            byte[] bArr3 = c4892a2.f40109c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c4892a2.b(4, null);
                    }
                    c4892a2.f40112f = true;
                    byte[] bArr4 = f40124b;
                    try {
                        try {
                            fileInputStream = c4892a2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e9) {
                            interfaceC4894c.a(6, e9);
                            fileInputStream = null;
                            r72 = 8;
                            r73 = 8;
                            if (fileInputStream != null) {
                            }
                            c4893bArr2 = c4892a2.f40113g;
                            if (c4893bArr2 != null) {
                            }
                            InterfaceC4894c interfaceC4894c2 = c4892a2.f40108b;
                            c4893bArr3 = c4892a2.f40113g;
                            if (c4893bArr3 != null) {
                            }
                            bArr = c4892a2.f40114h;
                            if (bArr != null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z14 = z12;
                            h.c(context, (z13 || !z6) ? false : z14);
                        } catch (IOException e10) {
                            interfaceC4894c.a(7, e10);
                            fileInputStream = null;
                            r72 = 8;
                            r73 = 8;
                            if (fileInputStream != null) {
                            }
                            c4893bArr2 = c4892a2.f40113g;
                            if (c4893bArr2 != null) {
                            }
                            InterfaceC4894c interfaceC4894c22 = c4892a2.f40108b;
                            c4893bArr3 = c4892a2.f40113g;
                            if (c4893bArr3 != null) {
                            }
                            bArr = c4892a2.f40114h;
                            if (bArr != null) {
                            }
                            if (z11) {
                            }
                            z13 = z11;
                            z14 = z12;
                            h.c(context, (z13 || !z6) ? false : z14);
                        }
                        if (fileInputStream != null) {
                            try {
                                try {
                                } catch (IllegalStateException e11) {
                                    interfaceC4894c.a(8, e11);
                                    fileInputStream.close();
                                    c4893bArr = null;
                                    c4892a2.f40113g = c4893bArr;
                                    c4893bArr2 = c4892a2.f40113g;
                                    if (c4893bArr2 != null) {
                                    }
                                    InterfaceC4894c interfaceC4894c222 = c4892a2.f40108b;
                                    c4893bArr3 = c4892a2.f40113g;
                                    if (c4893bArr3 != null) {
                                    }
                                    bArr = c4892a2.f40114h;
                                    if (bArr != null) {
                                    }
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z14 = z12;
                                    h.c(context, (z13 || !z6) ? false : z14);
                                }
                            } catch (IOException e12) {
                                interfaceC4894c.a(7, e12);
                                fileInputStream.close();
                                c4893bArr = null;
                                c4892a2.f40113g = c4893bArr;
                                c4893bArr2 = c4892a2.f40113g;
                                if (c4893bArr2 != null) {
                                }
                                InterfaceC4894c interfaceC4894c2222 = c4892a2.f40108b;
                                c4893bArr3 = c4892a2.f40113g;
                                if (c4893bArr3 != null) {
                                }
                                bArr = c4892a2.f40114h;
                                if (bArr != null) {
                                }
                                if (z11) {
                                }
                                z13 = z11;
                                z14 = z12;
                                h.c(context, (z13 || !z6) ? false : z14);
                            }
                            if (!Arrays.equals(bArr4, f(fileInputStream, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c4893bArr = l(fileInputStream, f(fileInputStream, 4), c4892a2.f40111e);
                            try {
                                fileInputStream.close();
                            } catch (IOException e13) {
                                interfaceC4894c.a(7, e13);
                            }
                            c4892a2.f40113g = c4893bArr;
                        }
                        c4893bArr2 = c4892a2.f40113g;
                        if (c4893bArr2 != null && ((i4 = Build.VERSION.SDK_INT) >= 31 || i4 == 24 || i4 == 25)) {
                            try {
                                a9 = c4892a2.a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e14) {
                                interfaceC4894c.a(9, e14);
                            } catch (IOException e15) {
                                interfaceC4894c.a(7, e15);
                            } catch (IllegalStateException e16) {
                                c4892a2.f40113g = null;
                                interfaceC4894c.a(8, e16);
                            }
                            if (a9 == null) {
                                try {
                                    if (!Arrays.equals(f40125c, f(a9, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c4892a2.f40113g = i(a9, f(a9, 4), bArr3, c4893bArr2);
                                    a9.close();
                                    c4892a = c4892a2;
                                    if (c4892a != null) {
                                        c4892a2 = c4892a;
                                    }
                                } finally {
                                }
                            } else {
                                if (a9 != null) {
                                    a9.close();
                                }
                                c4892a = null;
                                if (c4892a != null) {
                                }
                            }
                        }
                        InterfaceC4894c interfaceC4894c22222 = c4892a2.f40108b;
                        c4893bArr3 = c4892a2.f40113g;
                        if (c4893bArr3 != null && (bArr2 = c4892a2.f40109c) != null) {
                            if (c4892a2.f40112f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr2);
                                } finally {
                                }
                            } catch (IOException e17) {
                                interfaceC4894c22222.a(7, e17);
                            } catch (IllegalStateException e18) {
                                interfaceC4894c22222.a(8, e18);
                            }
                            if (o(byteArrayOutputStream, bArr2, c4893bArr3)) {
                                c4892a2.f40114h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                c4892a2.f40113g = null;
                            } else {
                                interfaceC4894c22222.a(5, null);
                                c4892a2.f40113g = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = c4892a2.f40114h;
                        if (bArr != null) {
                            z11 = false;
                            z12 = true;
                        } else {
                            try {
                                if (!c4892a2.f40112f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(c4892a2.f40110d);
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
                                                                                c4892a2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c4892a2.f40114h = null;
                                                                                c4892a2.f40113g = null;
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
                                    } catch (FileNotFoundException e19) {
                                        e = e19;
                                        c4892a2.b(6, e);
                                        z10 = r73;
                                        z11 = false;
                                        z12 = z10;
                                        if (z11) {
                                        }
                                        z13 = z11;
                                        z14 = z12;
                                        h.c(context, (z13 || !z6) ? false : z14);
                                    } catch (IOException e20) {
                                        e = e20;
                                        c4892a2.b(7, e);
                                        z10 = r72;
                                        z11 = false;
                                        z12 = z10;
                                        if (z11) {
                                        }
                                        z13 = z11;
                                        z14 = z12;
                                        h.c(context, (z13 || !z6) ? false : z14);
                                    }
                                } catch (FileNotFoundException e21) {
                                    e = e21;
                                    r73 = 1;
                                    c4892a2.b(6, e);
                                    z10 = r73;
                                    z11 = false;
                                    z12 = z10;
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z14 = z12;
                                    h.c(context, (z13 || !z6) ? false : z14);
                                } catch (IOException e22) {
                                    e = e22;
                                    r72 = 1;
                                    c4892a2.b(7, e);
                                    z10 = r72;
                                    z11 = false;
                                    z12 = z10;
                                    if (z11) {
                                    }
                                    z13 = z11;
                                    z14 = z12;
                                    h.c(context, (z13 || !z6) ? false : z14);
                                }
                            } finally {
                                c4892a2.f40114h = null;
                                c4892a2.f40113g = null;
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
                            c4892a2.b(4, null);
                        }
                        c4892a2.f40112f = true;
                        byte[] bArr42 = f40124b;
                        fileInputStream = c4892a2.a(assets, "dexopt/baseline.prof");
                        r72 = 8;
                        r73 = 8;
                        if (fileInputStream != null) {
                        }
                        c4893bArr2 = c4892a2.f40113g;
                        if (c4893bArr2 != null) {
                            a9 = c4892a2.a(assets, "dexopt/baseline.profm");
                            if (a9 == null) {
                            }
                        }
                        InterfaceC4894c interfaceC4894c222222 = c4892a2.f40108b;
                        c4893bArr3 = c4892a2.f40113g;
                        if (c4893bArr3 != null) {
                            if (c4892a2.f40112f) {
                            }
                        }
                        bArr = c4892a2.f40114h;
                        if (bArr != null) {
                        }
                        if (z11) {
                        }
                        z13 = z11;
                        z14 = z12;
                    } catch (IOException unused2) {
                        z9 = true;
                        c4892a2.b(4, null);
                    }
                }
                h.c(context, (z13 || !z6) ? false : z14);
            }
            c4892a2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z9 = true;
            z13 = false;
            z14 = z9;
            h.c(context, (z13 || !z6) ? false : z14);
        } catch (PackageManager.NameNotFoundException e23) {
            interfaceC4894c.a(7, e23);
            h.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j6, int i4) {
        byte[] bArr = new byte[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            bArr[i6] = (byte) ((j6 >> (i6 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        u(byteArrayOutputStream, i4, 2);
    }
}
