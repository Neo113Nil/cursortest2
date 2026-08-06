package N;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final m0.j f1122a = new m0.j(8, false);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1123b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1124c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1125d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1126e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1127f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1128g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1129h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1130i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f1131j = {48, 48, 50, 0};

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

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int i2 = 0;
        for (b bVar : bVarArr) {
            i2 += ((((bVar.f1119g * 2) + 7) & (-8)) / 8) + (bVar.f1117e * 2) + d(bVar.f1113a, bVar.f1114b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f1118f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f1127f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bVar2.f1113a, bVar2.f1114b, bArr));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.f1120h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bVar3.f1113a, bVar3.f1114b, bArr));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.f1120h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
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
        byte[] bArr2 = f1129h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1128g;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            return "!".equals(obj) ? str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return "!".equals(obj) ? str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return C1.a.k(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
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
                throw new IllegalStateException(C1.a.f(i2, "Not enough bytes to read: "));
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

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f1130i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1131j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m2 = (int) m(fileInputStream, 2);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
            try {
                b[] k2 = k(byteArrayInputStream, bArr2, m2, bVarArr);
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
        if (Arrays.equals(f1125d, bArr2)) {
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
            b[] j2 = j(byteArrayInputStream2, m3, bVarArr);
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

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i2, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i2 != bVarArr.length) {
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
            b bVar = bVarArr[i4];
            if (!bVar.f1114b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            bVar.f1117e = i5;
            bVar.f1120h = g(byteArrayInputStream, i5);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i2 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m2 = m(byteArrayInputStream, 4);
            int m3 = (int) m(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i4].f1114b.equals(substring)) {
                        bVar = bVarArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f1116d = m2;
            int[] g2 = g(byteArrayInputStream, m3);
            if (Arrays.equals(bArr, f1129h)) {
                bVar.f1117e = m3;
                bVar.f1120h = g2;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f1126e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m2 = (int) m(fileInputStream, 1);
        byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
        try {
            b[] n2 = n(byteArrayInputStream, str, m2);
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

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2 = (int) m(byteArrayInputStream, 2);
            int m3 = (int) m(byteArrayInputStream, 2);
            bVarArr[i3] = new b(str, new String(f(byteArrayInputStream, m2), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m3, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m3], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            b bVar = bVarArr[i4];
            int available = byteArrayInputStream.available() - bVar.f1118f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f1121i;
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
            bVar.f1120h = g(byteArrayInputStream, bVar.f1117e);
            int i6 = bVar.f1119g;
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
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1125d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f1126e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(bVarArr, bArr3);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b2.length, 4);
                byte[] a2 = a(b2);
                t(byteArrayOutputStream, a2.length, 4);
                byteArrayOutputStream.write(a2);
                return true;
            }
            byte[] bArr4 = f1128g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f1121i.size() * 4;
                    String d2 = d(bVar.f1113a, bVar.f1114b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, d2.getBytes(charset).length);
                    u(byteArrayOutputStream, bVar.f1120h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, bVar.f1115c, 4);
                    byteArrayOutputStream.write(d2.getBytes(charset));
                    Iterator it = bVar.f1121i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : bVar.f1120h) {
                        u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1127f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b3 = b(bVarArr, bArr5);
                t(byteArrayOutputStream, bVarArr.length, 1);
                t(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                t(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr6 = f1129h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String d3 = d(bVar2.f1113a, bVar2.f1114b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d3.getBytes(charset2).length);
                TreeMap treeMap = bVar2.f1121i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar2.f1120h.length);
                t(byteArrayOutputStream, bVar2.f1115c, 4);
                byteArrayOutputStream.write(d3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : bVar2.f1120h) {
                    u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, bVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (b bVar3 : bVarArr) {
                t(byteArrayOutputStream2, bVar3.f1115c, 4);
                t(byteArrayOutputStream2, bVar3.f1116d, 4);
                t(byteArrayOutputStream2, bVar3.f1119g, 4);
                String d4 = d(bVar3.f1113a, bVar3.f1114b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d4.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(d4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            m mVar = new m(false, 1, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i7];
                    u(byteArrayOutputStream3, i7);
                    u(byteArrayOutputStream3, bVar4.f1117e);
                    i8 = i8 + 4 + (bVar4.f1117e * 2);
                    int[] iArr = bVar4.f1120h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        u(byteArrayOutputStream3, i10 - i9);
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
            m mVar2 = new m(true, 3, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i11];
                    Iterator it3 = bVar5.f1121i.entrySet().iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        i13 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream4, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            u(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + i5 + byteArray4.length;
                            int i14 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream3, length4, 4);
                            u(byteArrayOutputStream3, i13);
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
            m mVar3 = new m(true, 4, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                m mVar4 = (m) arrayList2.get(i15);
                int i16 = mVar4.f1142a;
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
                t(byteArrayOutputStream, j2, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = mVar4.f1143b;
                if (mVar4.f1144c) {
                    long length5 = bArr7.length;
                    byte[] a4 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a4);
                    t(byteArrayOutputStream, a4.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = a4.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
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

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.f1117e);
        t(byteArrayOutputStream, bVar.f1118f, 4);
        t(byteArrayOutputStream, bVar.f1115c, 4);
        t(byteArrayOutputStream, bVar.f1119g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.f1119g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f1121i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + bVar.f1119g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i2 = 0;
        for (Map.Entry entry : bVar.f1121i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i2);
                u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c7, code lost:
    
        if (r5 == null) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d8  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Executor executor, d dVar, boolean z2) {
        boolean z3;
        ?? r6;
        IOException iOException;
        int i2;
        b[] bVarArr;
        b[] bVarArr2;
        a aVar;
        b[] bVarArr3;
        byte[] bArr;
        boolean z4;
        boolean z5;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream g2;
        boolean z6;
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
                                dVar.a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z6) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        l.c(context, false);
                        return;
                    }
                }
                z6 = false;
                if (z6) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i3 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            a aVar2 = new a(assets, executor, dVar, name, file2);
            byte[] bArr2 = (byte[]) aVar2.f1108d;
            if (bArr2 == null) {
                aVar2.h(3, Integer.valueOf(i3));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z3 = true;
                        aVar2.h(4, null);
                    }
                } else if (!file2.canWrite()) {
                    aVar2.h(4, null);
                }
                aVar2.f1105a = true;
                byte[] bArr3 = f1123b;
                try {
                    try {
                        r6 = aVar2.g(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        dVar.a(6, e2);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        bVarArr2 = (b[]) aVar2.f1112h;
                        if (bVarArr2 != null) {
                        }
                        aVar = aVar2;
                        d dVar2 = (d) aVar.f1107c;
                        bVarArr3 = (b[]) aVar.f1112h;
                        ?? r62 = r6;
                        if (bVarArr3 != null) {
                        }
                        bArr = (byte[]) aVar.f1109e;
                        if (bArr == null) {
                        }
                        if (z5) {
                        }
                        l.c(context, (z5 || !z2) ? false : z3);
                    } catch (IOException e3) {
                        dVar.a(7, e3);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        bVarArr2 = (b[]) aVar2.f1112h;
                        if (bVarArr2 != null) {
                        }
                        aVar = aVar2;
                        d dVar22 = (d) aVar.f1107c;
                        bVarArr3 = (b[]) aVar.f1112h;
                        ?? r622 = r6;
                        if (bVarArr3 != null) {
                        }
                        bArr = (byte[]) aVar.f1109e;
                        if (bArr == null) {
                        }
                        if (z5) {
                        }
                        l.c(context, (z5 || !z2) ? false : z3);
                    }
                    if (r6 != 0) {
                        try {
                        } catch (IOException e4) {
                            i2 = 7;
                            dVar.a(7, e4);
                            try {
                                r6.close();
                            } catch (IOException e5) {
                                iOException = e5;
                                dVar.a(i2, iOException);
                                bVarArr = null;
                                r6 = r6;
                                aVar2.f1112h = bVarArr;
                                bVarArr2 = (b[]) aVar2.f1112h;
                                if (bVarArr2 != null) {
                                }
                                aVar = aVar2;
                                d dVar222 = (d) aVar.f1107c;
                                bVarArr3 = (b[]) aVar.f1112h;
                                ?? r6222 = r6;
                                if (bVarArr3 != null) {
                                }
                                bArr = (byte[]) aVar.f1109e;
                                if (bArr == null) {
                                }
                                if (z5) {
                                }
                                l.c(context, (z5 || !z2) ? false : z3);
                            }
                            bVarArr = null;
                            r6 = r6;
                            aVar2.f1112h = bVarArr;
                            bVarArr2 = (b[]) aVar2.f1112h;
                            if (bVarArr2 != null) {
                            }
                            aVar = aVar2;
                            d dVar2222 = (d) aVar.f1107c;
                            bVarArr3 = (b[]) aVar.f1112h;
                            ?? r62222 = r6;
                            if (bVarArr3 != null) {
                            }
                            bArr = (byte[]) aVar.f1109e;
                            if (bArr == null) {
                            }
                            if (z5) {
                            }
                            l.c(context, (z5 || !z2) ? false : z3);
                        } catch (IllegalStateException e6) {
                            try {
                                dVar.a(8, e6);
                                try {
                                    r6.close();
                                } catch (IOException e7) {
                                    iOException = e7;
                                    i2 = 7;
                                    dVar.a(i2, iOException);
                                    bVarArr = null;
                                    r6 = r6;
                                    aVar2.f1112h = bVarArr;
                                    bVarArr2 = (b[]) aVar2.f1112h;
                                    if (bVarArr2 != null) {
                                    }
                                    aVar = aVar2;
                                    d dVar22222 = (d) aVar.f1107c;
                                    bVarArr3 = (b[]) aVar.f1112h;
                                    ?? r622222 = r6;
                                    if (bVarArr3 != null) {
                                    }
                                    bArr = (byte[]) aVar.f1109e;
                                    if (bArr == null) {
                                    }
                                    if (z5) {
                                    }
                                    l.c(context, (z5 || !z2) ? false : z3);
                                }
                                bVarArr = null;
                                r6 = r6;
                                aVar2.f1112h = bVarArr;
                                bVarArr2 = (b[]) aVar2.f1112h;
                                if (bVarArr2 != null) {
                                }
                                aVar = aVar2;
                                d dVar222222 = (d) aVar.f1107c;
                                bVarArr3 = (b[]) aVar.f1112h;
                                ?? r6222222 = r6;
                                if (bVarArr3 != null) {
                                }
                                bArr = (byte[]) aVar.f1109e;
                                if (bArr == null) {
                                }
                                if (z5) {
                                }
                                l.c(context, (z5 || !z2) ? false : z3);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    r6.close();
                                    throw th2;
                                } catch (IOException e8) {
                                    dVar.a(7, e8);
                                    throw th2;
                                }
                            }
                        }
                        if (!Arrays.equals(bArr3, f(r6, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        bVarArr = l(r6, f(r6, 4), (String) aVar2.f1111g);
                        try {
                            r6.close();
                            r6 = r6;
                        } catch (IOException e9) {
                            IOException iOException2 = e9;
                            dVar.a(7, iOException2);
                            r6 = iOException2;
                        }
                        aVar2.f1112h = bVarArr;
                    }
                    bVarArr2 = (b[]) aVar2.f1112h;
                    if (bVarArr2 != null) {
                        int i4 = Build.VERSION.SDK_INT;
                        r6 = 34;
                        if (i4 <= 34) {
                            r6 = 25;
                            r6 = 25;
                            if (i4 != 25) {
                                switch (i4) {
                                }
                            }
                            try {
                                g2 = aVar2.g(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e10) {
                                dVar.a(9, e10);
                            } catch (IOException e11) {
                                dVar.a(7, e11);
                            } catch (IllegalStateException e12) {
                                aVar2.f1112h = null;
                                dVar.a(8, e12);
                            }
                            if (g2 != null) {
                                try {
                                    boolean equals = Arrays.equals(f1124c, f(g2, 4));
                                    if (!equals) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    aVar2.f1112h = i(g2, f(g2, 4), bArr2, bVarArr2);
                                    g2.close();
                                    aVar = aVar2;
                                    r6 = equals;
                                } finally {
                                }
                            } else {
                                if (g2 != null) {
                                    g2.close();
                                }
                                aVar = null;
                            }
                        }
                    }
                    aVar = aVar2;
                    d dVar2222222 = (d) aVar.f1107c;
                    bVarArr3 = (b[]) aVar.f1112h;
                    ?? r62222222 = r6;
                    if (bVarArr3 != null) {
                        byte[] bArr4 = (byte[]) aVar.f1108d;
                        r62222222 = bArr4;
                        if (bArr4 != null) {
                            if (!aVar.f1105a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr3);
                                    byteArrayOutputStream.write(bArr4);
                                } finally {
                                }
                            } catch (IOException e13) {
                                dVar2222222.a(7, e13);
                            } catch (IllegalStateException e14) {
                                dVar2222222.a(8, e14);
                            }
                            if (o(byteArrayOutputStream, bArr4, bVarArr3)) {
                                aVar.f1109e = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                aVar.f1112h = null;
                                r62222222 = bArr4;
                            } else {
                                dVar2222222.a(5, null);
                                aVar.f1112h = null;
                                byteArrayOutputStream.close();
                                r62222222 = bArr4;
                            }
                        }
                    }
                    bArr = (byte[]) aVar.f1109e;
                    if (bArr == null) {
                        z5 = false;
                        z3 = true;
                    } else {
                        try {
                            if (!aVar.f1105a) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream((File) aVar.f1110f);
                                        try {
                                            try {
                                                byte[] bArr5 = new byte[512];
                                                while (true) {
                                                    int read = byteArrayInputStream.read(bArr5);
                                                    if (read > 0) {
                                                        fileOutputStream.write(bArr5, 0, read);
                                                    } else {
                                                        z3 = true;
                                                        try {
                                                            aVar.h(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            aVar.f1109e = null;
                                                            aVar.f1112h = null;
                                                            z5 = true;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            Throwable th4 = th;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th4;
                                                            } catch (Throwable th5) {
                                                                th4.addSuppressed(th5);
                                                                throw th4;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                Throwable th7 = th;
                                                try {
                                                    byteArrayInputStream.close();
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
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    r62222222 = 1;
                                    aVar.h(6, e);
                                    z4 = r62222222;
                                    z5 = false;
                                    z3 = z4;
                                    if (z5) {
                                    }
                                    l.c(context, (z5 || !z2) ? false : z3);
                                } catch (IOException e16) {
                                    e = e16;
                                    r62222222 = 1;
                                    aVar.h(7, e);
                                    z4 = r62222222;
                                    z5 = false;
                                    z3 = z4;
                                    if (z5) {
                                    }
                                    l.c(context, (z5 || !z2) ? false : z3);
                                }
                            } catch (FileNotFoundException e17) {
                                e = e17;
                                aVar.h(6, e);
                                z4 = r62222222;
                                z5 = false;
                                z3 = z4;
                                if (z5) {
                                }
                                l.c(context, (z5 || !z2) ? false : z3);
                            } catch (IOException e18) {
                                e = e18;
                                aVar.h(7, e);
                                z4 = r62222222;
                                z5 = false;
                                z3 = z4;
                                if (z5) {
                                }
                                l.c(context, (z5 || !z2) ? false : z3);
                            }
                        } finally {
                            aVar.f1109e = null;
                            aVar.f1112h = null;
                        }
                    }
                    if (z5) {
                        e(packageInfo, filesDir);
                    }
                    l.c(context, (z5 || !z2) ? false : z3);
                } catch (Throwable th11) {
                    th = th11;
                }
            }
            z3 = true;
            z5 = false;
            l.c(context, (z5 || !z2) ? false : z3);
        } catch (PackageManager.NameNotFoundException e19) {
            dVar.a(7, e19);
            l.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        t(byteArrayOutputStream, i2, 2);
    }
}
