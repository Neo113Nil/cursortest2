package r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.icefishingapp.icefishing.AbstractC4404f;
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
import u.AbstractC5049e;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4946d {

    /* renamed from: a, reason: collision with root package name */
    public static final a4.e f40312a = new a4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f40313b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f40314c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f40315d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f40316e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f40317f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f40318g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f40319h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f40320j = {48, 48, 50, 0};

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

    public static byte[] b(C4944b[] c4944bArr, byte[] bArr) {
        int i6 = 0;
        int i9 = 0;
        for (C4944b c4944b : c4944bArr) {
            i9 += ((((c4944b.f40310g * 2) + 7) & (-8)) / 8) + (c4944b.f40308e * 2) + d(bArr, c4944b.f40304a, c4944b.f40305b).getBytes(StandardCharsets.UTF_8).length + 16 + c4944b.f40309f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, f40317f)) {
            int length = c4944bArr.length;
            while (i6 < length) {
                C4944b c4944b2 = c4944bArr[i6];
                q(byteArrayOutputStream, c4944b2, d(bArr, c4944b2.f40304a, c4944b2.f40305b));
                p(byteArrayOutputStream, c4944b2);
                i6++;
            }
        } else {
            for (C4944b c4944b3 : c4944bArr) {
                q(byteArrayOutputStream, c4944b3, d(bArr, c4944b3.f40304a, c4944b3.f40305b));
            }
            int length2 = c4944bArr.length;
            while (i6 < length2) {
                p(byteArrayOutputStream, c4944bArr[i6]);
                i6++;
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
        boolean z3 = true;
        for (File file2 : listFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f40319h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f40318g;
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
                return u1.h.g(AbstractC5049e.b(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
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

    public static byte[] f(InputStream inputStream, int i6) {
        byte[] bArr = new byte[i6];
        int i9 = 0;
        while (i9 < i6) {
            int read = inputStream.read(bArr, i9, i6 - i9);
            if (read < 0) {
                throw new IllegalStateException(AbstractC4404f.e(i6, "Not enough bytes to read: "));
            }
            i9 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i6) {
        int[] iArr = new int[i6];
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
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
    public static byte[] h(FileInputStream fileInputStream, int i6, int i9) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int i11 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i6) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i6 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i11 += inflater.inflate(bArr, i11, i9 - i11);
                    i10 += read;
                } catch (DataFormatException e9) {
                    throw new IllegalStateException(e9.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i6 + " actual=" + i10);
        } finally {
            inflater.end();
        }
    }

    public static C4944b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C4944b[] c4944bArr) {
        byte[] bArr3 = i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f40320j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m4 = (int) m(fileInputStream, 2);
            byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h9);
            try {
                C4944b[] k9 = k(byteArrayInputStream, bArr2, m4, c4944bArr);
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
        if (Arrays.equals(f40315d, bArr2)) {
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
            C4944b[] j6 = j(byteArrayInputStream2, m9, c4944bArr);
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

    public static C4944b[] j(ByteArrayInputStream byteArrayInputStream, int i6, C4944b[] c4944bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C4944b[0];
        }
        if (i6 != c4944bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i6];
        int[] iArr = new int[i6];
        for (int i9 = 0; i9 < i6; i9++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            iArr[i9] = (int) m(byteArrayInputStream, 2);
            strArr[i9] = new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8);
        }
        for (int i10 = 0; i10 < i6; i10++) {
            C4944b c4944b = c4944bArr[i10];
            if (!c4944b.f40305b.equals(strArr[i10])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            c4944b.f40308e = i11;
            c4944b.f40311h = g(byteArrayInputStream, i11);
        }
        return c4944bArr;
    }

    public static C4944b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i6, C4944b[] c4944bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C4944b[0];
        }
        if (i6 != c4944bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i6; i9++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m4 = m(byteArrayInputStream, 4);
            int m9 = (int) m(byteArrayInputStream, 2);
            C4944b c4944b = null;
            if (c4944bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i10 = 0;
                while (true) {
                    if (i10 >= c4944bArr.length) {
                        break;
                    }
                    if (c4944bArr[i10].f40305b.equals(substring)) {
                        c4944b = c4944bArr[i10];
                        break;
                    }
                    i10++;
                }
            }
            if (c4944b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c4944b.f40307d = m4;
            int[] g4 = g(byteArrayInputStream, m9);
            if (Arrays.equals(bArr, f40319h)) {
                c4944b.f40308e = m9;
                c4944b.f40311h = g4;
            }
        }
        return c4944bArr;
    }

    public static C4944b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f40316e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h9);
        try {
            C4944b[] n9 = n(byteArrayInputStream, str, m4);
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

    public static long m(InputStream inputStream, int i6) {
        byte[] f3 = f(inputStream, i6);
        long j6 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            j6 += (f3[i9] & 255) << (i9 * 8);
        }
        return j6;
    }

    public static C4944b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i6) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C4944b[0];
        }
        C4944b[] c4944bArr = new C4944b[i6];
        for (int i9 = 0; i9 < i6; i9++) {
            int m4 = (int) m(byteArrayInputStream, 2);
            int m9 = (int) m(byteArrayInputStream, 2);
            c4944bArr[i9] = new C4944b(str, new String(f(byteArrayInputStream, m4), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m9, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m9], new TreeMap());
        }
        for (int i10 = 0; i10 < i6; i10++) {
            C4944b c4944b = c4944bArr[i10];
            int available = byteArrayInputStream.available() - c4944b.f40309f;
            int i11 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c4944b.i;
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
            c4944b.f40311h = g(byteArrayInputStream, c4944b.f40308e);
            int i12 = c4944b.f40310g;
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
        return c4944bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C4944b[] c4944bArr) {
        long j6;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f40315d;
        int i6 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f40316e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b9 = b(c4944bArr, bArr3);
                u(byteArrayOutputStream, c4944bArr.length, 1);
                u(byteArrayOutputStream, b9.length, 4);
                byte[] a9 = a(b9);
                u(byteArrayOutputStream, a9.length, 4);
                byteArrayOutputStream.write(a9);
                return true;
            }
            byte[] bArr4 = f40318g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, c4944bArr.length, 1);
                for (C4944b c4944b : c4944bArr) {
                    int size = c4944b.i.size() * 4;
                    String d2 = d(bArr4, c4944b.f40304a, c4944b.f40305b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d2.getBytes(charset).length);
                    v(byteArrayOutputStream, c4944b.f40311h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, c4944b.f40306c, 4);
                    byteArrayOutputStream.write(d2.getBytes(charset));
                    Iterator it = c4944b.i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i9 : c4944b.f40311h) {
                        v(byteArrayOutputStream, i9);
                    }
                }
                return true;
            }
            byte[] bArr5 = f40317f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b10 = b(c4944bArr, bArr5);
                u(byteArrayOutputStream, c4944bArr.length, 1);
                u(byteArrayOutputStream, b10.length, 4);
                byte[] a10 = a(b10);
                u(byteArrayOutputStream, a10.length, 4);
                byteArrayOutputStream.write(a10);
                return true;
            }
            byte[] bArr6 = f40319h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, c4944bArr.length);
            for (C4944b c4944b2 : c4944bArr) {
                String d9 = d(bArr6, c4944b2.f40304a, c4944b2.f40305b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d9.getBytes(charset2).length);
                TreeMap treeMap = c4944b2.i;
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, c4944b2.f40311h.length);
                u(byteArrayOutputStream, c4944b2.f40306c, 4);
                byteArrayOutputStream.write(d9.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i10 : c4944b2.f40311h) {
                    v(byteArrayOutputStream, i10);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, c4944bArr.length);
            int i11 = 2;
            int i12 = 2;
            for (C4944b c4944b3 : c4944bArr) {
                u(byteArrayOutputStream2, c4944b3.f40306c, 4);
                u(byteArrayOutputStream2, c4944b3.f40307d, 4);
                u(byteArrayOutputStream2, c4944b3.f40310g, 4);
                String d10 = d(bArr2, c4944b3.f40304a, c4944b3.f40305b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d10.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i12 = i12 + 14 + length2;
                byteArrayOutputStream2.write(d10.getBytes(charset3));
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
            while (i13 < c4944bArr.length) {
                try {
                    C4944b c4944b4 = c4944bArr[i13];
                    v(byteArrayOutputStream3, i13);
                    v(byteArrayOutputStream3, c4944b4.f40308e);
                    i14 = i14 + 4 + (c4944b4.f40308e * i11);
                    int[] iArr = c4944b4.f40311h;
                    int length3 = iArr.length;
                    int i15 = i6;
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
                    i6 = 0;
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
            while (i19 < c4944bArr.length) {
                try {
                    C4944b c4944b5 = c4944bArr[i19];
                    Iterator it3 = c4944b5.i.entrySet().iterator();
                    int i21 = 0;
                    while (it3.hasNext()) {
                        i21 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i21, c4944b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, c4944b5);
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
            long j9 = 4;
            long size2 = j9 + j9 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i23 = 0;
            while (i23 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i23);
                int i24 = iVar4.f40330a;
                if (i24 == 1) {
                    j6 = 0;
                } else if (i24 == 2) {
                    j6 = 1;
                } else if (i24 == 3) {
                    j6 = 2;
                } else if (i24 == 4) {
                    j6 = 3;
                } else {
                    if (i24 != 5) {
                        throw null;
                    }
                    j6 = 4;
                }
                u(byteArrayOutputStream, j6, 4);
                u(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = iVar4.f40331b;
                if (iVar4.f40332c) {
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C4944b c4944b) {
        s(byteArrayOutputStream, c4944b);
        int[] iArr = c4944b.f40311h;
        int length = iArr.length;
        int i6 = 0;
        int i9 = 0;
        while (i6 < length) {
            int i10 = iArr[i6];
            v(byteArrayOutputStream, i10 - i9);
            i6++;
            i9 = i10;
        }
        int i11 = c4944b.f40310g;
        byte[] bArr = new byte[(((i11 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c4944b.i.entrySet()) {
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

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C4944b c4944b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, c4944b.f40308e);
        u(byteArrayOutputStream, c4944b.f40309f, 4);
        u(byteArrayOutputStream, c4944b.f40306c, 4);
        u(byteArrayOutputStream, c4944b.f40310g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i6, C4944b c4944b) {
        int bitCount = Integer.bitCount(i6 & (-2));
        int i9 = c4944b.f40310g;
        byte[] bArr = new byte[(((bitCount * i9) + 7) & (-8)) / 8];
        for (Map.Entry entry : c4944b.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = 0;
            for (int i11 = 1; i11 <= 4; i11 <<= 1) {
                if (i11 != 1 && (i11 & i6) != 0) {
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

    public static void s(ByteArrayOutputStream byteArrayOutputStream, C4944b c4944b) {
        int i6 = 0;
        for (Map.Entry entry : c4944b.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i6);
                v(byteArrayOutputStream, 0);
                i6 = intValue;
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
    public static void t(Context context, Executor executor, InterfaceC4945c interfaceC4945c, boolean z3) {
        boolean z6;
        FileInputStream fileInputStream;
        ?? r72;
        C4944b[] c4944bArr;
        C4944b[] c4944bArr2;
        C4944b[] c4944bArr3;
        byte[] bArr;
        ?? r73;
        boolean z9;
        boolean z10;
        Throwable th;
        Throwable th2;
        boolean z11;
        boolean z12;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i6;
        C4943a c4943a;
        FileInputStream a9;
        boolean z13;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z3) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z14 = readLong == packageInfo.lastUpdateTime;
                            if (z14) {
                                interfaceC4945c.a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z14) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        h.c(context, false);
                        return;
                    }
                }
                z14 = false;
                if (z14) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C4943a c4943a2 = new C4943a(assets, executor, interfaceC4945c, name, file2);
            byte[] bArr3 = c4943a2.f40298c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        c4943a2.b(4, null);
                    }
                    c4943a2.f40301f = true;
                    byte[] bArr4 = f40313b;
                    try {
                        try {
                            fileInputStream = c4943a2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e9) {
                            interfaceC4945c.a(6, e9);
                            fileInputStream = null;
                            r72 = 8;
                            r73 = 8;
                            if (fileInputStream != null) {
                            }
                            c4944bArr2 = c4943a2.f40302g;
                            if (c4944bArr2 != null) {
                            }
                            InterfaceC4945c interfaceC4945c2 = c4943a2.f40297b;
                            c4944bArr3 = c4943a2.f40302g;
                            if (c4944bArr3 != null) {
                            }
                            bArr = c4943a2.f40303h;
                            if (bArr != null) {
                            }
                            if (z10) {
                            }
                            z12 = z10;
                            z13 = z11;
                            h.c(context, (z12 || !z3) ? false : z13);
                        } catch (IOException e10) {
                            interfaceC4945c.a(7, e10);
                            fileInputStream = null;
                            r72 = 8;
                            r73 = 8;
                            if (fileInputStream != null) {
                            }
                            c4944bArr2 = c4943a2.f40302g;
                            if (c4944bArr2 != null) {
                            }
                            InterfaceC4945c interfaceC4945c22 = c4943a2.f40297b;
                            c4944bArr3 = c4943a2.f40302g;
                            if (c4944bArr3 != null) {
                            }
                            bArr = c4943a2.f40303h;
                            if (bArr != null) {
                            }
                            if (z10) {
                            }
                            z12 = z10;
                            z13 = z11;
                            h.c(context, (z12 || !z3) ? false : z13);
                        }
                        if (fileInputStream != null) {
                            try {
                                try {
                                } catch (IllegalStateException e11) {
                                    interfaceC4945c.a(8, e11);
                                    fileInputStream.close();
                                    c4944bArr = null;
                                    c4943a2.f40302g = c4944bArr;
                                    c4944bArr2 = c4943a2.f40302g;
                                    if (c4944bArr2 != null) {
                                    }
                                    InterfaceC4945c interfaceC4945c222 = c4943a2.f40297b;
                                    c4944bArr3 = c4943a2.f40302g;
                                    if (c4944bArr3 != null) {
                                    }
                                    bArr = c4943a2.f40303h;
                                    if (bArr != null) {
                                    }
                                    if (z10) {
                                    }
                                    z12 = z10;
                                    z13 = z11;
                                    h.c(context, (z12 || !z3) ? false : z13);
                                }
                            } catch (IOException e12) {
                                interfaceC4945c.a(7, e12);
                                fileInputStream.close();
                                c4944bArr = null;
                                c4943a2.f40302g = c4944bArr;
                                c4944bArr2 = c4943a2.f40302g;
                                if (c4944bArr2 != null) {
                                }
                                InterfaceC4945c interfaceC4945c2222 = c4943a2.f40297b;
                                c4944bArr3 = c4943a2.f40302g;
                                if (c4944bArr3 != null) {
                                }
                                bArr = c4943a2.f40303h;
                                if (bArr != null) {
                                }
                                if (z10) {
                                }
                                z12 = z10;
                                z13 = z11;
                                h.c(context, (z12 || !z3) ? false : z13);
                            }
                            if (!Arrays.equals(bArr4, f(fileInputStream, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            c4944bArr = l(fileInputStream, f(fileInputStream, 4), c4943a2.f40300e);
                            try {
                                fileInputStream.close();
                            } catch (IOException e13) {
                                interfaceC4945c.a(7, e13);
                            }
                            c4943a2.f40302g = c4944bArr;
                        }
                        c4944bArr2 = c4943a2.f40302g;
                        if (c4944bArr2 != null && ((i6 = Build.VERSION.SDK_INT) >= 31 || i6 == 24 || i6 == 25)) {
                            try {
                                a9 = c4943a2.a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e14) {
                                interfaceC4945c.a(9, e14);
                            } catch (IOException e15) {
                                interfaceC4945c.a(7, e15);
                            } catch (IllegalStateException e16) {
                                c4943a2.f40302g = null;
                                interfaceC4945c.a(8, e16);
                            }
                            if (a9 == null) {
                                try {
                                    if (!Arrays.equals(f40314c, f(a9, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c4943a2.f40302g = i(a9, f(a9, 4), bArr3, c4944bArr2);
                                    a9.close();
                                    c4943a = c4943a2;
                                    if (c4943a != null) {
                                        c4943a2 = c4943a;
                                    }
                                } finally {
                                }
                            } else {
                                if (a9 != null) {
                                    a9.close();
                                }
                                c4943a = null;
                                if (c4943a != null) {
                                }
                            }
                        }
                        InterfaceC4945c interfaceC4945c22222 = c4943a2.f40297b;
                        c4944bArr3 = c4943a2.f40302g;
                        if (c4944bArr3 != null && (bArr2 = c4943a2.f40298c) != null) {
                            if (c4943a2.f40301f) {
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
                                interfaceC4945c22222.a(7, e17);
                            } catch (IllegalStateException e18) {
                                interfaceC4945c22222.a(8, e18);
                            }
                            if (o(byteArrayOutputStream, bArr2, c4944bArr3)) {
                                c4943a2.f40303h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                c4943a2.f40302g = null;
                            } else {
                                interfaceC4945c22222.a(5, null);
                                c4943a2.f40302g = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = c4943a2.f40303h;
                        if (bArr != null) {
                            z10 = false;
                            z11 = true;
                        } else {
                            try {
                                if (!c4943a2.f40301f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(c4943a2.f40299d);
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
                                                                                z11 = true;
                                                                                c4943a2.b(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                c4943a2.f40303h = null;
                                                                                c4943a2.f40302g = null;
                                                                                z10 = true;
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
                                        c4943a2.b(6, e);
                                        z9 = r73;
                                        z10 = false;
                                        z11 = z9;
                                        if (z10) {
                                        }
                                        z12 = z10;
                                        z13 = z11;
                                        h.c(context, (z12 || !z3) ? false : z13);
                                    } catch (IOException e20) {
                                        e = e20;
                                        c4943a2.b(7, e);
                                        z9 = r72;
                                        z10 = false;
                                        z11 = z9;
                                        if (z10) {
                                        }
                                        z12 = z10;
                                        z13 = z11;
                                        h.c(context, (z12 || !z3) ? false : z13);
                                    }
                                } catch (FileNotFoundException e21) {
                                    e = e21;
                                    r73 = 1;
                                    c4943a2.b(6, e);
                                    z9 = r73;
                                    z10 = false;
                                    z11 = z9;
                                    if (z10) {
                                    }
                                    z12 = z10;
                                    z13 = z11;
                                    h.c(context, (z12 || !z3) ? false : z13);
                                } catch (IOException e22) {
                                    e = e22;
                                    r72 = 1;
                                    c4943a2.b(7, e);
                                    z9 = r72;
                                    z10 = false;
                                    z11 = z9;
                                    if (z10) {
                                    }
                                    z12 = z10;
                                    z13 = z11;
                                    h.c(context, (z12 || !z3) ? false : z13);
                                }
                            } finally {
                                c4943a2.f40303h = null;
                                c4943a2.f40302g = null;
                            }
                        }
                        if (z10) {
                            e(packageInfo, filesDir);
                        }
                        z12 = z10;
                        z13 = z11;
                    } finally {
                    }
                    r72 = 8;
                    r73 = 8;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            c4943a2.b(4, null);
                        }
                        c4943a2.f40301f = true;
                        byte[] bArr42 = f40313b;
                        fileInputStream = c4943a2.a(assets, "dexopt/baseline.prof");
                        r72 = 8;
                        r73 = 8;
                        if (fileInputStream != null) {
                        }
                        c4944bArr2 = c4943a2.f40302g;
                        if (c4944bArr2 != null) {
                            a9 = c4943a2.a(assets, "dexopt/baseline.profm");
                            if (a9 == null) {
                            }
                        }
                        InterfaceC4945c interfaceC4945c222222 = c4943a2.f40297b;
                        c4944bArr3 = c4943a2.f40302g;
                        if (c4944bArr3 != null) {
                            if (c4943a2.f40301f) {
                            }
                        }
                        bArr = c4943a2.f40303h;
                        if (bArr != null) {
                        }
                        if (z10) {
                        }
                        z12 = z10;
                        z13 = z11;
                    } catch (IOException unused2) {
                        z6 = true;
                        c4943a2.b(4, null);
                    }
                }
                h.c(context, (z12 || !z3) ? false : z13);
            }
            c4943a2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z6 = true;
            z12 = false;
            z13 = z6;
            h.c(context, (z12 || !z3) ? false : z13);
        } catch (PackageManager.NameNotFoundException e23) {
            interfaceC4945c.a(7, e23);
            h.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j6, int i6) {
        byte[] bArr = new byte[i6];
        for (int i9 = 0; i9 < i6; i9++) {
            bArr[i9] = (byte) ((j6 >> (i9 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i6) {
        u(byteArrayOutputStream, i6, 2);
    }
}
