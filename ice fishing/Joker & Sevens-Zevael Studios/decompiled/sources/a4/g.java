package a4;

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

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final p6.i f236a = new p6.i();

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f237b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f238c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f239d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f240e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f241f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f242g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f243h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f244i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f245j = {48, 48, 50, 0};

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
        int i10 = 0;
        int i11 = 0;
        for (c cVar : cVarArr) {
            i11 += ((((cVar.f232g * 2) + 7) & (-8)) / 8) + (cVar.f230e * 2) + d(cVar.f226a, cVar.f227b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f231f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, f241f)) {
            int length = cVarArr.length;
            while (i10 < length) {
                c cVar2 = cVarArr[i10];
                q(byteArrayOutputStream, cVar2, d(cVar2.f226a, cVar2.f227b, bArr));
                p(byteArrayOutputStream, cVar2);
                i10++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f226a, cVar3.f227b, bArr));
            }
            int length2 = cVarArr.length;
            while (i10 < length2) {
                p(byteArrayOutputStream, cVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
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
        boolean z10 = true;
        for (File file2 : listFiles) {
            z10 = c(file2) && z10;
        }
        return z10;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f243h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f242g;
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
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
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

    public static byte[] f(InputStream inputStream, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read < 0) {
                throw new IllegalStateException(d.g("Not enough bytes to read: ", i10));
            }
            i11 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += (int) m(byteArrayInputStream, 2);
            iArr[i12] = i11;
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
    public static byte[] h(FileInputStream fileInputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int i13 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i13 += inflater.inflate(bArr, i13, i11 - i13);
                    i12 += read;
                } catch (DataFormatException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } finally {
            inflater.end();
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f244i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f245j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m10 = (int) m(fileInputStream, 2);
            byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
            try {
                c[] k3 = k(byteArrayInputStream, bArr2, m10, cVarArr);
                byteArrayInputStream.close();
                return k3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f239d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m11 = (int) m(fileInputStream, 1);
        byte[] h11 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h11);
        try {
            c[] j3 = j(byteArrayInputStream2, m11, cVarArr);
            byteArrayInputStream2.close();
            return j3;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i10, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m10 = (int) m(byteArrayInputStream, 2);
            iArr[i11] = (int) m(byteArrayInputStream, 2);
            strArr[i11] = new String(f(byteArrayInputStream, m10), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            if (!cVar.f227b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            cVar.f230e = i13;
            cVar.f233h = g(byteArrayInputStream, i13);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m10 = m(byteArrayInputStream, 4);
            int m11 = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i12 = 0;
                while (true) {
                    if (i12 >= cVarArr.length) {
                        break;
                    }
                    if (cVarArr[i12].f227b.equals(substring)) {
                        cVar = cVarArr[i12];
                        break;
                    }
                    i12++;
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f229d = m10;
            int[] g8 = g(byteArrayInputStream, m11);
            if (Arrays.equals(bArr, f243h)) {
                cVar.f230e = m11;
                cVar.f233h = g8;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f240e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m10 = (int) m(fileInputStream, 1);
        byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
        try {
            c[] n7 = n(byteArrayInputStream, str, m10);
            byteArrayInputStream.close();
            return n7;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i10) {
        byte[] f10 = f(inputStream, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 += (f10[i11] & 255) << (i11 * 8);
        }
        return j3;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int m10 = (int) m(byteArrayInputStream, 2);
            int m11 = (int) m(byteArrayInputStream, 2);
            cVarArr[i12] = new c(str, new String(f(byteArrayInputStream, m10), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m11, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m11], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            c cVar = cVarArr[i13];
            int available = byteArrayInputStream.available();
            int i14 = cVar.f231f;
            int i15 = cVar.f232g;
            TreeMap treeMap = cVar.f234i;
            int i16 = available - i14;
            int i17 = i11;
            while (byteArrayInputStream.available() > i16) {
                i17 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i17), 1);
                int m12 = (int) m(byteArrayInputStream, 2);
                while (m12 > 0) {
                    m(byteArrayInputStream, 2);
                    int m13 = (int) m(byteArrayInputStream, 1);
                    if (m13 != 6 && m13 != 7) {
                        while (m13 > 0) {
                            m(byteArrayInputStream, 1);
                            int i18 = i11;
                            int i19 = i13;
                            for (int m14 = (int) m(byteArrayInputStream, 1); m14 > 0; m14--) {
                                m(byteArrayInputStream, 2);
                            }
                            m13--;
                            i11 = i18;
                            i13 = i19;
                        }
                    }
                    m12--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i20 = i11;
            int i21 = i13;
            if (byteArrayInputStream.available() != i16) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f233h = g(byteArrayInputStream, cVar.f230e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
            for (int i22 = i20; i22 < i15; i22++) {
                int i23 = valueOf.get(i22) ? 2 : i20;
                if (valueOf.get(i22 + i15)) {
                    i23 |= 4;
                }
                if (i23 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i22));
                    if (num == null) {
                        num = Integer.valueOf(i20);
                    }
                    treeMap.put(Integer.valueOf(i22), Integer.valueOf(i23 | num.intValue()));
                }
            }
            i13 = i21 + 1;
            i11 = i20;
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f239d;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f240e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b2 = b(cVarArr, bArr3);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b2.length, 4);
                byte[] a6 = a(b2);
                u(byteArrayOutputStream, a6.length, 4);
                byteArrayOutputStream.write(a6);
                return true;
            }
            byte[] bArr4 = f242g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f234i.size() * 4;
                    String d10 = d(cVar.f226a, cVar.f227b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d10.getBytes(charset).length);
                    v(byteArrayOutputStream, cVar.f233h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, cVar.f228c, 4);
                    byteArrayOutputStream.write(d10.getBytes(charset));
                    Iterator it = cVar.f234i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i11 : cVar.f233h) {
                        v(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = f241f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b10 = b(cVarArr, bArr5);
                u(byteArrayOutputStream, cVarArr.length, 1);
                u(byteArrayOutputStream, b10.length, 4);
                byte[] a8 = a(b10);
                u(byteArrayOutputStream, a8.length, 4);
                byteArrayOutputStream.write(a8);
                return true;
            }
            byte[] bArr6 = f243h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String str = cVar2.f226a;
                TreeMap treeMap = cVar2.f234i;
                String d11 = d(str, cVar2.f227b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d11.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar2.f233h.length);
                u(byteArrayOutputStream, cVar2.f228c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i12 : cVar2.f233h) {
                    v(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, cVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (c cVar3 : cVarArr) {
                u(byteArrayOutputStream2, cVar3.f228c, 4);
                u(byteArrayOutputStream2, cVar3.f229d, 4);
                u(byteArrayOutputStream2, cVar3.f232g, 4);
                String d12 = d(cVar3.f226a, cVar3.f227b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d12.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(d12.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            m mVar = new m(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i15];
                    v(byteArrayOutputStream3, i15);
                    v(byteArrayOutputStream3, cVar4.f230e);
                    i16 = i16 + 4 + (cVar4.f230e * i13);
                    int[] iArr = cVar4.f233h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    int i18 = i13;
                    int i19 = i17;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        v(byteArrayOutputStream3, i20 - i17);
                        i19++;
                        i17 = i20;
                    }
                    i15++;
                    i13 = i18;
                    i10 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            m mVar2 = new m(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i21 = 0;
            int i22 = 0;
            while (i21 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i21];
                    Iterator it3 = cVar5.f234i.entrySet().iterator();
                    int i23 = 0;
                    while (it3.hasNext()) {
                        i23 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i23, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i21);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i24 = i22 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i23);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i22 = i24 + length4;
                            i21++;
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
            if (i22 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i22 + ", does not match actual size " + byteArray5.length);
            }
            m mVar3 = new m(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar3);
            long j6 = 4;
            long size2 = j6 + j6 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i25 = 0;
            while (i25 < arrayList2.size()) {
                m mVar4 = (m) arrayList2.get(i25);
                int i26 = mVar4.f256a;
                byte[] bArr7 = mVar4.f257b;
                if (i26 == 1) {
                    j3 = 0;
                } else if (i26 == 2) {
                    j3 = 1;
                } else if (i26 == 3) {
                    j3 = 2;
                } else if (i26 == 4) {
                    j3 = 3;
                } else {
                    if (i26 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                u(byteArrayOutputStream, j3, 4);
                u(byteArrayOutputStream, size2, 4);
                if (mVar4.f258c) {
                    long length5 = bArr7.length;
                    byte[] a10 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a10);
                    u(byteArrayOutputStream, a10.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a10.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i25++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i27));
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
        int i10 = cVar.f232g;
        int[] iArr = cVar.f233h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            v(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f234i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i14 = intValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i15 = intValue + i10;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f230e);
        u(byteArrayOutputStream, cVar.f231f, 4);
        u(byteArrayOutputStream, cVar.f228c, 4);
        u(byteArrayOutputStream, cVar.f232g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i10, c cVar) {
        int i11 = cVar.f232g;
        byte[] bArr = new byte[(((Integer.bitCount(i10 & (-2)) * i11) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f234i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & intValue2) == i13) {
                        int i14 = (i12 * i11) + intValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i10 = 0;
        for (Map.Entry entry : cVar.f234i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i10);
                v(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Executor executor, f fVar, boolean z10) {
        boolean z11;
        ?? r72;
        byte[] bArr;
        c[] cVarArr;
        c[] cVarArr2;
        c[] cVarArr3;
        byte[] bArr2;
        boolean z12;
        boolean z13;
        Throwable th;
        Throwable th2;
        FileLock tryLock;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ?? byteArrayOutputStream;
        b bVar;
        String str;
        String str2;
        FileInputStream a6;
        boolean z18;
        boolean z19;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z19 = readLong == packageInfo.lastUpdateTime;
                            if (z19) {
                                fVar.i(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z19) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        l.c(context, false);
                        return;
                    }
                }
                z19 = false;
                if (z19) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, fVar, name, file2);
            byte[] bArr3 = bVar2.f220c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        bVar2.b(4, null);
                    }
                    bVar2.f223f = true;
                    try {
                        try {
                            r72 = bVar2.a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e10) {
                            fVar.i(6, e10);
                            r72 = 0;
                            bArr = f237b;
                            if (r72 != 0) {
                            }
                            cVarArr2 = bVar2.f224g;
                            if (cVarArr2 != null) {
                            }
                            f fVar2 = bVar2.f219b;
                            cVarArr3 = bVar2.f224g;
                            byte[] bArr4 = bVar2.f220c;
                            boolean z20 = r72;
                            z20 = r72;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f225h;
                            if (bArr2 != null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z18 = z14;
                            l.c(context, (z15 || !z10) ? false : z18);
                        } catch (IOException e11) {
                            fVar.i(7, e11);
                            r72 = 0;
                            bArr = f237b;
                            if (r72 != 0) {
                            }
                            cVarArr2 = bVar2.f224g;
                            if (cVarArr2 != null) {
                            }
                            f fVar22 = bVar2.f219b;
                            cVarArr3 = bVar2.f224g;
                            byte[] bArr42 = bVar2.f220c;
                            boolean z202 = r72;
                            z202 = r72;
                            if (cVarArr3 != null) {
                            }
                            bArr2 = bVar2.f225h;
                            if (bArr2 != null) {
                            }
                            if (z13) {
                            }
                            z15 = z13;
                            z18 = z14;
                            l.c(context, (z15 || !z10) ? false : z18);
                        }
                        if (r72 != 0) {
                            try {
                                try {
                                } catch (IllegalStateException e12) {
                                    fVar.i(8, e12);
                                    try {
                                        r72.close();
                                    } catch (IOException e13) {
                                        fVar.i(7, e13);
                                    }
                                    cVarArr = null;
                                    bVar2.f224g = cVarArr;
                                    cVarArr2 = bVar2.f224g;
                                    if (cVarArr2 != null) {
                                    }
                                    f fVar222 = bVar2.f219b;
                                    cVarArr3 = bVar2.f224g;
                                    byte[] bArr422 = bVar2.f220c;
                                    boolean z2022 = r72;
                                    z2022 = r72;
                                    if (cVarArr3 != null) {
                                    }
                                    bArr2 = bVar2.f225h;
                                    if (bArr2 != null) {
                                    }
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z18 = z14;
                                    l.c(context, (z15 || !z10) ? false : z18);
                                }
                            } catch (IOException e14) {
                                fVar.i(7, e14);
                                r72.close();
                                cVarArr = null;
                                bVar2.f224g = cVarArr;
                                cVarArr2 = bVar2.f224g;
                                if (cVarArr2 != null) {
                                }
                                f fVar2222 = bVar2.f219b;
                                cVarArr3 = bVar2.f224g;
                                byte[] bArr4222 = bVar2.f220c;
                                boolean z20222 = r72;
                                z20222 = r72;
                                if (cVarArr3 != null) {
                                }
                                bArr2 = bVar2.f225h;
                                if (bArr2 != null) {
                                }
                                if (z13) {
                                }
                                z15 = z13;
                                z18 = z14;
                                l.c(context, (z15 || !z10) ? false : z18);
                            }
                            if (!Arrays.equals(bArr, f(r72, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            cVarArr = l(r72, f(r72, 4), bVar2.f222e);
                            try {
                                r72.close();
                            } catch (IOException e15) {
                                fVar.i(7, e15);
                            }
                            bVar2.f224g = cVarArr;
                        }
                        cVarArr2 = bVar2.f224g;
                        if (cVarArr2 != null && (r72 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                a6 = bVar2.a(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e16) {
                                fVar.i(9, e16);
                                str = r72;
                            } catch (IOException e17) {
                                fVar.i(7, e17);
                                str = r72;
                            } catch (IllegalStateException e18) {
                                bVar2.f224g = null;
                                fVar.i(8, e18);
                                str = r72;
                            }
                            if (a6 == null) {
                                try {
                                    if (!Arrays.equals(f238c, f(a6, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] f10 = f(a6, 4);
                                    bVar2.f224g = i(a6, f10, bArr3, cVarArr2);
                                    a6.close();
                                    bVar = bVar2;
                                    r72 = f10;
                                    if (bVar != null) {
                                        bVar2 = bVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (a6 != null) {
                                    a6.close();
                                    str = str2;
                                }
                                bVar = null;
                                r72 = str;
                                if (bVar != null) {
                                }
                            }
                        }
                        f fVar22222 = bVar2.f219b;
                        cVarArr3 = bVar2.f224g;
                        byte[] bArr42222 = bVar2.f220c;
                        boolean z202222 = r72;
                        z202222 = r72;
                        if (cVarArr3 != null && bArr42222 != null) {
                            z16 = bVar2.f223f;
                            if (z16) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e19) {
                                fVar22222.i(7, e19);
                                z17 = z16;
                            } catch (IllegalStateException e20) {
                                fVar22222.i(8, e20);
                                z17 = z16;
                            }
                            if (o(byteArrayOutputStream, bArr42222, cVarArr3)) {
                                bVar2.f225h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z17 = byteArrayOutputStream;
                                bVar2.f224g = null;
                                z202222 = z17;
                            } else {
                                fVar22222.i(5, null);
                                bVar2.f224g = null;
                                byteArrayOutputStream.close();
                                z202222 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = bVar2.f225h;
                        if (bArr2 != null) {
                            z13 = false;
                            z14 = true;
                        } else {
                            try {
                                if (!bVar2.f223f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(bVar2.f221d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            tryLock = channel.tryLock();
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                        }
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
                                                                            z14 = true;
                                                                            bVar2.b(1, null);
                                                                            tryLock.close();
                                                                            channel.close();
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            bVar2.f225h = null;
                                                                            bVar2.f224g = null;
                                                                            z13 = true;
                                                                        }
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        Throwable th5 = th;
                                                                        if (tryLock == null) {
                                                                            throw th5;
                                                                        }
                                                                        try {
                                                                            tryLock.close();
                                                                            throw th5;
                                                                        } catch (Throwable th6) {
                                                                            th5.addSuppressed(th6);
                                                                            throw th5;
                                                                        }
                                                                    }
                                                                }
                                                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                            }
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
                                    } catch (FileNotFoundException e21) {
                                        e = e21;
                                        z202222 = true;
                                        bVar2.b(6, e);
                                        z12 = z202222;
                                        z13 = false;
                                        z14 = z12;
                                        if (z13) {
                                        }
                                        z15 = z13;
                                        z18 = z14;
                                        l.c(context, (z15 || !z10) ? false : z18);
                                    } catch (IOException e22) {
                                        e = e22;
                                        z202222 = true;
                                        bVar2.b(7, e);
                                        z12 = z202222;
                                        z13 = false;
                                        z14 = z12;
                                        if (z13) {
                                        }
                                        z15 = z13;
                                        z18 = z14;
                                        l.c(context, (z15 || !z10) ? false : z18);
                                    }
                                } catch (FileNotFoundException e23) {
                                    e = e23;
                                    bVar2.b(6, e);
                                    z12 = z202222;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z18 = z14;
                                    l.c(context, (z15 || !z10) ? false : z18);
                                } catch (IOException e24) {
                                    e = e24;
                                    bVar2.b(7, e);
                                    z12 = z202222;
                                    z13 = false;
                                    z14 = z12;
                                    if (z13) {
                                    }
                                    z15 = z13;
                                    z18 = z14;
                                    l.c(context, (z15 || !z10) ? false : z18);
                                }
                            } finally {
                                bVar2.f225h = null;
                                bVar2.f224g = null;
                            }
                        }
                        if (z13) {
                            e(packageInfo, filesDir);
                        }
                        z15 = z13;
                        z18 = z14;
                    } finally {
                    }
                    bArr = f237b;
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            bVar2.b(4, null);
                        }
                        bVar2.f223f = true;
                        r72 = bVar2.a(assets, "dexopt/baseline.prof");
                        bArr = f237b;
                        if (r72 != 0) {
                        }
                        cVarArr2 = bVar2.f224g;
                        if (cVarArr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            a6 = bVar2.a(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (a6 == null) {
                            }
                        }
                        f fVar222222 = bVar2.f219b;
                        cVarArr3 = bVar2.f224g;
                        byte[] bArr422222 = bVar2.f220c;
                        boolean z2022222 = r72;
                        z2022222 = r72;
                        if (cVarArr3 != null) {
                            z16 = bVar2.f223f;
                            if (z16) {
                            }
                        }
                        bArr2 = bVar2.f225h;
                        if (bArr2 != null) {
                        }
                        if (z13) {
                        }
                        z15 = z13;
                        z18 = z14;
                    } catch (IOException unused2) {
                        z11 = true;
                        bVar2.b(4, null);
                    }
                }
                l.c(context, (z15 || !z10) ? false : z18);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z11 = true;
            z15 = false;
            z18 = z11;
            l.c(context, (z15 || !z10) ? false : z18);
        } catch (PackageManager.NameNotFoundException e25) {
            fVar.i(7, e25);
            l.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j3, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j3 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        u(byteArrayOutputStream, i10, 2);
    }
}
