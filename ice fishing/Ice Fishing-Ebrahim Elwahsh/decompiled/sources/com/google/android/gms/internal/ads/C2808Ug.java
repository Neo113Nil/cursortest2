package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ug, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2808Ug extends AbstractC2791Tg {

    /* renamed from: y, reason: collision with root package name */
    public static final Set f28055y = Collections.synchronizedSet(new HashSet());

    /* renamed from: z, reason: collision with root package name */
    public static final DecimalFormat f28056z = new DecimalFormat("#,###");

    /* renamed from: w, reason: collision with root package name */
    public File f28057w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28058x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9 A[LOOP:0: B:3:0x0024->B:12:0x00c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04e3  */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v33, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str) {
        int i;
        String str2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        String str5;
        HttpURLConnection a9;
        int responseCode;
        ?? contentLength;
        int intValue;
        String str6;
        String str7;
        String str8;
        FileChannel channel;
        ByteBuffer allocate;
        long currentTimeMillis;
        long longValue;
        Object obj;
        long longValue2;
        long j9;
        int i4;
        String str9;
        String str10;
        String str11;
        boolean z8;
        ReadableByteChannel readableByteChannel;
        int i9;
        ?? r52;
        String str12;
        int i10;
        boolean delete;
        String str13 = str;
        String str14 = " at ";
        String str15 = "HTTP status code ";
        if (this.f28057w == null) {
            m(str13, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file = this.f28057w;
            if (file == null) {
                i = 0;
            } else {
                File[] listFiles = file.listFiles();
                int length = listFiles.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = length;
                    int i14 = i11;
                    if (!listFiles[i11].getName().endsWith(".done")) {
                        i12++;
                    }
                    i11 = i14 + 1;
                    length = i13;
                }
                i = i12;
            }
            C3151ea c3151ea = AbstractC3368ia.f31834y;
            String str16 = str14;
            q2.r rVar = q2.r.f40116e;
            String str17 = str15;
            if (i <= ((Integer) rVar.f40119c.a(c3151ea)).intValue()) {
                File file2 = new File(new File(this.f28057w, u2.d.d(str13, "MD5")).getPath());
                File o9 = o(file2);
                if (file2.isFile() && o9.isFile()) {
                    int length2 = (int) file2.length();
                    String valueOf = String.valueOf(str13);
                    int i15 = t2.C.f40822b;
                    u2.i.a("Stream cache hit at ".concat(valueOf));
                    u2.d.f41224b.post(new RunnableC2740Qg(this, str13, file2.getAbsolutePath(), length2));
                    return true;
                }
                String valueOf2 = String.valueOf(this.f28057w.getAbsolutePath());
                String valueOf3 = String.valueOf(str13);
                Set set = f28055y;
                String concat = valueOf2.concat(valueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(concat)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str13).length() + 36);
                            sb.append("Stream cache already in progress at ");
                            sb.append(str13);
                            String sb2 = sb.toString();
                            int i16 = t2.C.f40822b;
                            u2.i.f(sb2);
                            m(str13, file2.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(concat);
                        try {
                            str2 = "error";
                            try {
                                Dr dr = Dr.f24582G;
                                C3497kx c3497kx = new C3497kx();
                                c3497kx.f32488n = dr;
                                c3497kx.f32489u = null;
                                a9 = c3497kx.a(new HE(str13, 4));
                                responseCode = a9.getResponseCode();
                            } catch (IOException e6) {
                                e = e6;
                            } catch (RuntimeException e9) {
                                e = e9;
                            }
                        } catch (IOException | RuntimeException e10) {
                            e = e10;
                            str2 = "error";
                        }
                        if (responseCode >= 400) {
                            str3 = "badUrl";
                            try {
                                String num = Integer.toString(responseCode);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(num).length() + 27);
                                sb3.append("HTTP request failed. Code: ");
                                sb3.append(num);
                                str4 = sb3.toString();
                            } catch (IOException e11) {
                                e = e11;
                                str4 = null;
                                fileOutputStream = null;
                                str5 = str13;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream.close();
                                if (this.f28058x) {
                                }
                                if (file2.exists()) {
                                }
                                m(str5, file2.getAbsolutePath(), str3, str4);
                                f28055y.remove(concat);
                                return false;
                            } catch (RuntimeException e12) {
                                e = e12;
                                str4 = null;
                                fileOutputStream = null;
                                str5 = str13;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream.close();
                                if (this.f28058x) {
                                }
                                if (file2.exists()) {
                                }
                                m(str5, file2.getAbsolutePath(), str3, str4);
                                f28055y.remove(concat);
                                return false;
                            }
                            try {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 21 + String.valueOf(str13).length());
                                sb4.append(str17);
                                sb4.append(responseCode);
                                sb4.append(str16);
                                sb4.append(str13);
                                throw new IOException(sb4.toString());
                            } catch (IOException e13) {
                                e = e13;
                                fileOutputStream = null;
                                str5 = str13;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream.close();
                                if (this.f28058x) {
                                }
                                if (file2.exists()) {
                                }
                                m(str5, file2.getAbsolutePath(), str3, str4);
                                f28055y.remove(concat);
                                return false;
                            } catch (RuntimeException e14) {
                                e = e14;
                                fileOutputStream = null;
                                str5 = str13;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream.close();
                                if (this.f28058x) {
                                }
                                if (file2.exists()) {
                                }
                                m(str5, file2.getAbsolutePath(), str3, str4);
                                f28055y.remove(concat);
                                return false;
                            }
                        }
                        try {
                            contentLength = a9.getContentLength();
                        } catch (IOException | RuntimeException e15) {
                            e = e15;
                        }
                        if (contentLength < 0) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str13).length() + 55);
                            sb5.append("Stream cache aborted, missing content-length header at ");
                            sb5.append(str13);
                            String sb6 = sb5.toString();
                            int i17 = t2.C.f40822b;
                            u2.i.f(sb6);
                            m(str13, file2.getAbsolutePath(), "contentLengthMissing", null);
                            set.remove(concat);
                            return false;
                        }
                        DecimalFormat decimalFormat = f28056z;
                        str3 = " sec";
                        String format = decimalFormat.format((long) contentLength);
                        try {
                            intValue = ((Integer) rVar.f40119c.a(AbstractC3368ia.f31842z)).intValue();
                            str6 = "File too big for full file cache. Size: ";
                        } catch (IOException | RuntimeException e16) {
                            e = e16;
                            concat = concat;
                            str3 = str2;
                            str4 = null;
                            fileOutputStream = null;
                            str5 = str13;
                            if (e instanceof RuntimeException) {
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException | NullPointerException unused) {
                            }
                            if (this.f28058x) {
                            }
                            if (file2.exists()) {
                            }
                            m(str5, file2.getAbsolutePath(), str3, str4);
                            f28055y.remove(concat);
                            return false;
                        }
                        if (contentLength > intValue) {
                            StringBuilder sb7 = new StringBuilder(String.valueOf(format).length() + 33 + String.valueOf(str13).length());
                            sb7.append("Content length ");
                            sb7.append(format);
                            sb7.append(" exceeds limit at ");
                            sb7.append(str13);
                            String sb8 = sb7.toString();
                            int i18 = t2.C.f40822b;
                            u2.i.f(sb8);
                            StringBuilder sb9 = new StringBuilder(String.valueOf(format).length() + 40);
                            sb9.append("File too big for full file cache. Size: ");
                            sb9.append(format);
                            m(str13, file2.getAbsolutePath(), "sizeExceeded", sb9.toString());
                            set.remove(concat);
                            return false;
                        }
                        StringBuilder sb10 = new StringBuilder(String.valueOf(format).length() + 20 + String.valueOf(str13).length());
                        sb10.append("Caching ");
                        sb10.append(format);
                        sb10.append(" bytes from ");
                        sb10.append(str13);
                        String sb11 = sb10.toString();
                        int i19 = t2.C.f40822b;
                        u2.i.a(sb11);
                        ReadableByteChannel newChannel = Channels.newChannel(a9.getInputStream());
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            channel = fileOutputStream.getChannel();
                            allocate = ByteBuffer.allocate(com.anythink.basead.exoplayer.h.o.f7899d);
                            p2.j.f39798C.f39810k.getClass();
                            currentTimeMillis = System.currentTimeMillis();
                        } catch (IOException e17) {
                            e = e17;
                        } catch (RuntimeException e18) {
                            e = e18;
                        }
                        try {
                            longValue = ((Long) rVar.f40119c.a(AbstractC3368ia.f31688i0)).longValue();
                            obj = new Object();
                            longValue2 = ((Long) rVar.f40119c.a(AbstractC3368ia.f31679h0)).longValue();
                            j9 = Long.MIN_VALUE;
                            i4 = 0;
                            str9 = contentLength;
                        } catch (IOException | RuntimeException e19) {
                            e = e19;
                            str13 = str;
                            str7 = concat;
                            concat = str7;
                            str3 = str2;
                            str8 = str13;
                            str4 = null;
                            str5 = str8;
                            if (e instanceof RuntimeException) {
                            }
                            fileOutputStream.close();
                            if (this.f28058x) {
                            }
                            if (file2.exists()) {
                            }
                            m(str5, file2.getAbsolutePath(), str3, str4);
                            f28055y.remove(concat);
                            return false;
                        }
                        while (true) {
                            ?? read = newChannel.read(allocate);
                            if (read < 0) {
                                String str18 = concat;
                                fileOutputStream.close();
                                if (u2.i.j(3)) {
                                    String format2 = decimalFormat.format(i4);
                                    StringBuilder sb12 = new StringBuilder(String.valueOf(format2).length() + 22 + String.valueOf(str).length());
                                    sb12.append("Preloaded ");
                                    sb12.append(format2);
                                    sb12.append(" bytes from ");
                                    sb12.append(str);
                                    u2.i.a(sb12.toString());
                                }
                                file2.setReadable(true, false);
                                if (o9.isFile()) {
                                    o9.setLastModified(System.currentTimeMillis());
                                } else {
                                    try {
                                        o9.createNewFile();
                                    } catch (IOException unused2) {
                                    }
                                }
                                u2.d.f41224b.post(new RunnableC2740Qg(this, str, file2.getAbsolutePath(), i4));
                                f28055y.remove(str18);
                                return true;
                            }
                            int i20 = i4 + read;
                            try {
                                if (i20 <= intValue) {
                                    allocate.flip();
                                    while (channel.write(allocate) > 0) {
                                    }
                                    allocate.clear();
                                    if (System.currentTimeMillis() - currentTimeMillis > 1000 * longValue2) {
                                        read = str;
                                        str9 = concat;
                                        try {
                                            String l9 = Long.toString(longValue2);
                                            StringBuilder sb13 = new StringBuilder(String.valueOf(l9).length() + 29);
                                            sb13.append("Timeout exceeded. Limit: ");
                                            sb13.append(l9);
                                            sb13.append(str3);
                                            str4 = sb13.toString();
                                            try {
                                                throw new IOException("stream cache time limit exceeded");
                                            } catch (IOException | RuntimeException e20) {
                                                e = e20;
                                                str3 = "downloadTimeout";
                                                str10 = read;
                                                str11 = str9;
                                            }
                                        } catch (IOException | RuntimeException e21) {
                                            e = e21;
                                            str3 = "downloadTimeout";
                                            concat = str9;
                                            str8 = read;
                                            str4 = null;
                                            str5 = str8;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream.close();
                                            if (this.f28058x) {
                                            }
                                            if (file2.exists()) {
                                            }
                                            m(str5, file2.getAbsolutePath(), str3, str4);
                                            f28055y.remove(concat);
                                            return false;
                                        }
                                    } else {
                                        if (this.f28058x) {
                                            throw new IOException("abort requested");
                                        }
                                        synchronized (obj) {
                                            try {
                                                p2.j.f39798C.f39810k.getClass();
                                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                                if (j9 + longValue > elapsedRealtime) {
                                                    z8 = false;
                                                } else {
                                                    z8 = true;
                                                    j9 = elapsedRealtime;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                while (true) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                }
                                            }
                                        }
                                        if (z8) {
                                            String str19 = concat;
                                            try {
                                                String str20 = str6;
                                                i10 = i20;
                                                readableByteChannel = newChannel;
                                                str12 = str20;
                                                i9 = intValue;
                                                r52 = str9;
                                                str7 = str19;
                                                str13 = str;
                                                try {
                                                    try {
                                                        u2.d.f41224b.post(new RunnableC2689Ng(this, str13, file2.getAbsolutePath(), i10, r52));
                                                    } catch (RuntimeException e22) {
                                                        e = e22;
                                                        concat = str7;
                                                        str3 = str2;
                                                        str8 = str13;
                                                        str4 = null;
                                                        str5 = str8;
                                                        if (e instanceof RuntimeException) {
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.f28058x) {
                                                        }
                                                        if (file2.exists()) {
                                                            u2.i.f("Could not delete partial cache file at ".concat(String.valueOf(file2.getAbsolutePath())));
                                                        }
                                                        m(str5, file2.getAbsolutePath(), str3, str4);
                                                        f28055y.remove(concat);
                                                        return false;
                                                    }
                                                } catch (IOException e23) {
                                                    e = e23;
                                                    concat = str7;
                                                    str3 = str2;
                                                    str8 = str13;
                                                    str4 = null;
                                                    str5 = str8;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.f28058x) {
                                                    }
                                                    if (file2.exists()) {
                                                    }
                                                    m(str5, file2.getAbsolutePath(), str3, str4);
                                                    f28055y.remove(concat);
                                                    return false;
                                                }
                                            } catch (IOException | RuntimeException e24) {
                                                e = e24;
                                                str7 = str19;
                                                str13 = str;
                                            }
                                        } else {
                                            readableByteChannel = newChannel;
                                            i9 = intValue;
                                            r52 = str9;
                                            str7 = concat;
                                            str12 = str6;
                                            i10 = i20;
                                        }
                                        i4 = i10;
                                        str6 = str12;
                                        concat = str7;
                                        newChannel = readableByteChannel;
                                        intValue = i9;
                                        str9 = r52;
                                    }
                                } else {
                                    str10 = str;
                                    str11 = concat;
                                    String str21 = str6;
                                    str3 = "sizeExceeded";
                                    String num2 = Integer.toString(i20);
                                    StringBuilder sb14 = new StringBuilder(String.valueOf(num2).length() + 40);
                                    sb14.append(str21);
                                    sb14.append(num2);
                                    String sb15 = sb14.toString();
                                    try {
                                        throw new IOException("stream cache file size limit exceeded");
                                    } catch (IOException | RuntimeException e25) {
                                        e = e25;
                                        str4 = sb15;
                                    }
                                }
                                concat = str11;
                                str5 = str10;
                            } catch (IOException e26) {
                                e = e26;
                            } catch (RuntimeException e27) {
                                e = e27;
                            }
                            if (e instanceof RuntimeException) {
                                p2.j.f39798C.f39808h.d("VideoStreamFullFileCache.preload", e);
                            }
                            fileOutputStream.close();
                            if (this.f28058x) {
                                String o10 = D.y.o(new StringBuilder(String.valueOf(str5).length() + 25), "Preload failed for URL \"", str5, "\"");
                                int i21 = t2.C.f40822b;
                                u2.i.g(o10, e);
                            } else {
                                String o11 = D.y.o(new StringBuilder(String.valueOf(str5).length() + 26), "Preload aborted for URL \"", str5, "\"");
                                int i22 = t2.C.f40822b;
                                u2.i.e(o11);
                            }
                            if (file2.exists() && !file2.delete()) {
                                u2.i.f("Could not delete partial cache file at ".concat(String.valueOf(file2.getAbsolutePath())));
                            }
                            m(str5, file2.getAbsolutePath(), str3, str4);
                            f28055y.remove(concat);
                            return false;
                        }
                    } finally {
                    }
                }
            }
            File file3 = this.f28057w;
            if (file3 != null) {
                File[] listFiles2 = file3.listFiles();
                int length3 = listFiles2.length;
                long j10 = Long.MAX_VALUE;
                int i23 = 0;
                File file4 = null;
                while (i23 < length3) {
                    File file5 = listFiles2[i23];
                    File[] fileArr = listFiles2;
                    int i24 = length3;
                    if (!file5.getName().endsWith(".done")) {
                        long lastModified = file5.lastModified();
                        if (lastModified < j10) {
                            file4 = file5;
                            j10 = lastModified;
                        }
                    }
                    i23++;
                    listFiles2 = fileArr;
                    length3 = i24;
                }
                if (file4 != null) {
                    delete = file4.delete();
                    File o12 = o(file4);
                    if (o12.isFile()) {
                        delete &= o12.delete();
                    }
                    if (delete) {
                        int i25 = t2.C.f40822b;
                        u2.i.f("Unable to expire stream cache");
                        m(str13, null, "expireFailed", null);
                        return false;
                    }
                    str14 = str16;
                    str15 = str17;
                }
            }
            delete = false;
            if (delete) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2791Tg
    public final void l() {
        this.f28058x = true;
    }

    public final File o(File file) {
        return new File(new File(this.f28057w, String.valueOf(file.getName()).concat(".done")).getPath());
    }
}
