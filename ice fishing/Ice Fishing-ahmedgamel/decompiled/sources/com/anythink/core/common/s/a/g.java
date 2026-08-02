package com.anythink.core.common.s.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.anythink.core.common.s.a.b;
import com.google.android.gms.internal.ads.Wv;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class g extends com.anythink.core.common.s.a.a {

    /* renamed from: S, reason: collision with root package name */
    public static final int f17124S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static final int f17125T = 1;

    /* renamed from: U, reason: collision with root package name */
    public static final int f17126U = 2;

    /* renamed from: W, reason: collision with root package name */
    private static final String f17127W = "g";

    /* renamed from: V, reason: collision with root package name */
    boolean f17128V;

    /* renamed from: X, reason: collision with root package name */
    private FileChannel f17129X;
    private FileChannel Y;

    /* renamed from: Z, reason: collision with root package name */
    private MappedByteBuffer f17130Z;
    private MappedByteBuffer aa;
    private int ab;
    private int ac;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final Map<String, g> f17131a = new ConcurrentHashMap();

        /* renamed from: b, reason: collision with root package name */
        private String f17132b;

        /* renamed from: c, reason: collision with root package name */
        private String f17133c;

        /* renamed from: d, reason: collision with root package name */
        private com.anythink.core.common.s.a.a.b[] f17134d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.s.a.a.a f17135e;

        /* renamed from: f, reason: collision with root package name */
        private int f17136f = 0;

        private a(Context context, String str) {
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f17132b = context.getFilesDir().getAbsolutePath() + "/tktp/";
            this.f17133c = str;
        }

        private a a(com.anythink.core.common.s.a.a.b[] bVarArr) {
            this.f17134d = bVarArr;
            return this;
        }

        private a b() {
            this.f17136f = 1;
            return this;
        }

        private g c() {
            g gVar;
            String str = this.f17132b + this.f17133c;
            Map<String, g> map = f17131a;
            g gVar2 = map.get(str);
            if (gVar2 != null) {
                return gVar2;
            }
            synchronized (a.class) {
                try {
                    gVar = map.get(str);
                    if (gVar == null) {
                        g gVar3 = new g(this.f17132b, this.f17133c, this.f17134d, this.f17135e, this.f17136f);
                        map.put(str, gVar3);
                        gVar = gVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gVar;
        }

        private a a(com.anythink.core.common.s.a.a.a aVar) {
            this.f17135e = aVar;
            return this;
        }

        private a a() {
            this.f17136f = 2;
            return this;
        }

        private a(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.f17132b = str.endsWith("/") ? str : str.concat("/");
            this.f17133c = str2;
        }
    }

    public g(String str, String str2, com.anythink.core.common.s.a.a.b[] bVarArr, com.anythink.core.common.s.a.a.a aVar, int i) {
        super(str, str2, bVarArr, aVar);
        this.f17128V = true;
        this.ac = i;
        k();
    }

    private void b(MappedByteBuffer mappedByteBuffer) {
        try {
            if (mappedByteBuffer.capacity() < 12) {
                throw new IllegalArgumentException("Buffer capacity too small for checksum");
            }
            mappedByteBuffer.putLong(4, this.f17067B);
            int i = this.ab;
            if (i != 0) {
                if (i < 0 || i >= mappedByteBuffer.capacity()) {
                    throw new IllegalArgumentException("removeStart out of bounds: " + this.ab);
                }
                int i4 = this.ab;
                byte[] bArr = this.f17070E.f17121a;
                if (i4 >= bArr.length) {
                    throw new IllegalArgumentException("fastBuffer.hb index out of bounds: " + this.ab);
                }
                mappedByteBuffer.put(i4, bArr[i4]);
            }
            int i6 = this.f17072G;
            if (i6 != 0) {
                int i9 = this.f17071F;
                if (i9 < 0 || i6 < 0 || i6 + i9 > this.f17070E.f17121a.length) {
                    throw new IllegalArgumentException("Invalid update range");
                }
                if (i9 <= mappedByteBuffer.capacity()) {
                    int capacity = mappedByteBuffer.capacity();
                    int i10 = this.f17071F;
                    if (capacity - i10 >= this.f17072G) {
                        mappedByteBuffer.position(i10);
                        mappedByteBuffer.put(this.f17070E.f17121a, this.f17071F, this.f17072G);
                        return;
                    }
                }
                throw new IllegalArgumentException("buffer capacity overflow");
            }
        } catch (Throwable th) {
            com.IceFishing.LiveIceFishing.k.x("sp_mmap_error", "spName: " + this.f17086w + " errorMsg: " + th.getMessage());
        }
    }

    private void e(int i) {
        int i4 = com.anythink.core.common.s.a.a.f17062r;
        int a9 = com.anythink.core.common.s.a.a.a(i4, i + i4);
        byte[] bArr = this.f17070E.f17121a;
        if (a9 >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[a9];
        System.arraycopy(bArr, 0, bArr2, 0, this.f17066A);
        this.f17070E.f17121a = bArr2;
        if (this.ac == 0) {
            try {
                long j6 = a9;
                this.f17129X.truncate(j6);
                FileChannel fileChannel = this.f17129X;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j6);
                this.f17130Z = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.Y.truncate(j6);
                MappedByteBuffer map2 = this.Y.map(mapMode, 0L, j6);
                this.aa = map2;
                map2.order(byteOrder);
            } catch (Exception e9) {
                a(new Exception("map failed", e9));
                u();
            }
        }
        c("truncate finish");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01f6 A[Catch: all -> 0x00cd, TryCatch #4 {all -> 0x00cd, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0011, B:10:0x0045, B:13:0x004b, B:15:0x0055, B:17:0x0077, B:20:0x0089, B:25:0x00ab, B:26:0x00b4, B:29:0x00c5, B:30:0x00d5, B:36:0x010b, B:38:0x012b, B:40:0x0131, B:42:0x0137, B:45:0x01f2, B:47:0x01f6, B:48:0x01ff, B:50:0x0203, B:51:0x0207, B:53:0x020b, B:54:0x0213, B:56:0x0217, B:61:0x0141, B:88:0x01e9, B:63:0x0158, B:65:0x015f, B:67:0x0178, B:68:0x0185, B:70:0x01a1, B:72:0x01a7, B:73:0x01bd, B:77:0x01cf, B:78:0x00a2, B:81:0x0084, B:85:0x01db), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0203 A[Catch: all -> 0x00cd, TryCatch #4 {all -> 0x00cd, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0011, B:10:0x0045, B:13:0x004b, B:15:0x0055, B:17:0x0077, B:20:0x0089, B:25:0x00ab, B:26:0x00b4, B:29:0x00c5, B:30:0x00d5, B:36:0x010b, B:38:0x012b, B:40:0x0131, B:42:0x0137, B:45:0x01f2, B:47:0x01f6, B:48:0x01ff, B:50:0x0203, B:51:0x0207, B:53:0x020b, B:54:0x0213, B:56:0x0217, B:61:0x0141, B:88:0x01e9, B:63:0x0158, B:65:0x015f, B:67:0x0178, B:68:0x0185, B:70:0x01a1, B:72:0x01a7, B:73:0x01bd, B:77:0x01cf, B:78:0x00a2, B:81:0x0084, B:85:0x01db), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020b A[Catch: all -> 0x00cd, TryCatch #4 {all -> 0x00cd, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0011, B:10:0x0045, B:13:0x004b, B:15:0x0055, B:17:0x0077, B:20:0x0089, B:25:0x00ab, B:26:0x00b4, B:29:0x00c5, B:30:0x00d5, B:36:0x010b, B:38:0x012b, B:40:0x0131, B:42:0x0137, B:45:0x01f2, B:47:0x01f6, B:48:0x01ff, B:50:0x0203, B:51:0x0207, B:53:0x020b, B:54:0x0213, B:56:0x0217, B:61:0x0141, B:88:0x01e9, B:63:0x0158, B:65:0x015f, B:67:0x0178, B:68:0x0185, B:70:0x01a1, B:72:0x01a7, B:73:0x01bd, B:77:0x01cf, B:78:0x00a2, B:81:0x0084, B:85:0x01db), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0217 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #4 {all -> 0x00cd, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0011, B:10:0x0045, B:13:0x004b, B:15:0x0055, B:17:0x0077, B:20:0x0089, B:25:0x00ab, B:26:0x00b4, B:29:0x00c5, B:30:0x00d5, B:36:0x010b, B:38:0x012b, B:40:0x0131, B:42:0x0137, B:45:0x01f2, B:47:0x01f6, B:48:0x01ff, B:50:0x0203, B:51:0x0207, B:53:0x020b, B:54:0x0213, B:56:0x0217, B:61:0x0141, B:88:0x01e9, B:63:0x0158, B:65:0x015f, B:67:0x0178, B:68:0x0185, B:70:0x01a1, B:72:0x01a7, B:73:0x01bd, B:77:0x01cf, B:78:0x00a2, B:81:0x0084, B:85:0x01db), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void k() {
        long j6;
        File file;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        FileChannel fileChannel;
        long j9;
        try {
            long nanoTime = System.nanoTime();
            if (!n() && this.ac == 0) {
                File file2 = new File(this.f17085v, this.f17086w + ".kva");
                File file3 = new File(this.f17085v, this.f17086w + ".kvb");
                try {
                } catch (Exception e9) {
                    e = e9;
                    j6 = nanoTime;
                }
                try {
                    if (l.a(file2) && l.a(file3)) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "rw");
                        long length = randomAccessFile.length();
                        long length2 = randomAccessFile2.length();
                        this.f17129X = randomAccessFile.getChannel();
                        this.Y = randomAccessFile2.getChannel();
                        try {
                            FileChannel fileChannel2 = this.f17129X;
                            mapMode = FileChannel.MapMode.READ_WRITE;
                            MappedByteBuffer map = fileChannel2.map(mapMode, 0L, length > 0 ? length : com.anythink.core.common.s.a.a.f17062r);
                            this.f17130Z = map;
                            byteOrder = ByteOrder.LITTLE_ENDIAN;
                            map.order(byteOrder);
                            fileChannel = this.Y;
                            if (length2 > 0) {
                                file = file2;
                                j9 = length2;
                            } else {
                                file = file2;
                                j9 = com.anythink.core.common.s.a.a.f17062r;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            j6 = nanoTime;
                            file = file2;
                        }
                        try {
                            MappedByteBuffer map2 = fileChannel.map(mapMode, 0L, j9);
                            this.aa = map2;
                            map2.order(byteOrder);
                            this.f17070E = new f(this.f17130Z.capacity());
                            if (length == 0 && length2 == 0) {
                                this.f17066A = 12;
                            } else {
                                int i = this.f17130Z.getInt();
                                int i4 = i & (-1073741825);
                                boolean b9 = com.anythink.core.common.s.a.a.b(i);
                                long j10 = this.f17130Z.getLong();
                                int i6 = this.aa.getInt();
                                int i9 = (-1073741825) & i6;
                                boolean b10 = com.anythink.core.common.s.a.a.b(i6);
                                long j11 = this.aa.getLong();
                                j6 = nanoTime;
                                if (i4 >= 0 && i4 <= length - 12) {
                                    this.f17066A = i4 + 12;
                                    this.f17130Z.rewind();
                                    this.f17130Z.get(this.f17070E.f17121a, 0, this.f17066A);
                                    if (j10 == this.f17070E.b(12, i4) && a(b9)) {
                                        this.f17067B = j10;
                                        if (length == length2) {
                                            if (!m()) {
                                            }
                                        }
                                        b(new Exception("B file error"));
                                        a(this.f17130Z, this.aa, this.f17066A);
                                    }
                                }
                                if (i9 >= 0 && i9 <= length2 - 12) {
                                    this.f17068C.clear();
                                    e();
                                    this.f17066A = i9 + 12;
                                    if (this.f17070E.f17121a.length != this.aa.capacity()) {
                                        this.f17070E = new f(this.aa.capacity());
                                    }
                                    this.aa.rewind();
                                    this.aa.get(this.f17070E.f17121a, 0, this.f17066A);
                                    if (j11 == this.f17070E.b(12, i9) && a(b10)) {
                                        b(new Exception("A file error"));
                                        a(this.aa, this.f17130Z, this.f17066A);
                                        this.f17067B = j11;
                                    }
                                }
                                b("both files error");
                                v();
                            }
                        } catch (IOException e11) {
                            e = e11;
                            j6 = nanoTime;
                            a(e);
                            u();
                            a(file, file3);
                            if (this.f17070E == null) {
                            }
                            if (this.f17066A == 0) {
                            }
                            if (this.f17074I) {
                            }
                            if (this.f17088y != null) {
                            }
                        }
                    } else {
                        j6 = nanoTime;
                        a(new Exception("open file failed"));
                        u();
                    }
                } catch (Exception e12) {
                    e = e12;
                    a(e);
                    c();
                    u();
                    if (this.f17070E == null) {
                    }
                    if (this.f17066A == 0) {
                    }
                    if (this.f17074I) {
                    }
                    if (this.f17088y != null) {
                    }
                }
                if (this.f17070E == null) {
                    this.f17070E = new f(com.anythink.core.common.s.a.a.f17062r);
                }
                if (this.f17066A == 0) {
                    this.f17066A = 12;
                }
                if (this.f17074I) {
                    a();
                    c("rewrite data");
                }
                if (this.f17088y != null) {
                    c("loading finish, data len:" + this.f17066A + ", get keys:" + this.f17068C.size() + ", use time:" + ((System.nanoTime() - j6) / 1000000) + " ms");
                }
            }
            j6 = nanoTime;
            if (this.f17070E == null) {
            }
            if (this.f17066A == 0) {
            }
            if (this.f17074I) {
            }
            if (this.f17088y != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void l() {
        long j6;
        File file = new File(this.f17085v, Wv.i(new StringBuilder(), this.f17086w, ".kva"));
        File file2 = new File(this.f17085v, Wv.i(new StringBuilder(), this.f17086w, ".kvb"));
        try {
            if (l.a(file) && l.a(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                this.f17129X = randomAccessFile.getChannel();
                this.Y = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = this.f17129X;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : com.anythink.core.common.s.a.a.f17062r);
                    this.f17130Z = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.Y.map(mapMode, 0L, length2 > 0 ? length2 : com.anythink.core.common.s.a.a.f17062r);
                    this.aa = map2;
                    map2.order(byteOrder);
                    this.f17070E = new f(this.f17130Z.capacity());
                    if (length == 0 && length2 == 0) {
                        this.f17066A = 12;
                        return;
                    }
                    int i = this.f17130Z.getInt();
                    int i4 = i & (-1073741825);
                    boolean b9 = com.anythink.core.common.s.a.a.b(i);
                    long j9 = this.f17130Z.getLong();
                    int i6 = this.aa.getInt();
                    int i9 = (-1073741825) & i6;
                    boolean b10 = com.anythink.core.common.s.a.a.b(i6);
                    long j10 = this.aa.getLong();
                    if (i4 < 0 || i4 > length - 12) {
                        j6 = 12;
                    } else {
                        this.f17066A = i4 + 12;
                        this.f17130Z.rewind();
                        j6 = 12;
                        this.f17130Z.get(this.f17070E.f17121a, 0, this.f17066A);
                        if (j9 == this.f17070E.b(12, i4) && a(b9)) {
                            this.f17067B = j9;
                            if (length == length2 && m()) {
                                return;
                            }
                            b(new Exception("B file error"));
                            a(this.f17130Z, this.aa, this.f17066A);
                            return;
                        }
                    }
                    if (i9 >= 0 && i9 <= length2 - j6) {
                        this.f17068C.clear();
                        e();
                        this.f17066A = i9 + 12;
                        if (this.f17070E.f17121a.length != this.aa.capacity()) {
                            this.f17070E = new f(this.aa.capacity());
                        }
                        this.aa.rewind();
                        this.aa.get(this.f17070E.f17121a, 0, this.f17066A);
                        if (j10 == this.f17070E.b(12, i9) && a(b10)) {
                            b(new Exception("A file error"));
                            a(this.aa, this.f17130Z, this.f17066A);
                            this.f17067B = j10;
                            return;
                        }
                    }
                    b("both files error");
                    v();
                    return;
                } catch (IOException e9) {
                    a(e9);
                    u();
                    a(file, file2);
                    return;
                }
            }
            a(new Exception("open file failed"));
            u();
        } catch (Exception e10) {
            a(e10);
            c();
            u();
        }
    }

    private boolean m() {
        f fVar = new f(this.f17066A);
        this.aa.rewind();
        this.aa.get(fVar.f17121a, 0, this.f17066A);
        byte[] bArr = this.f17070E.f17121a;
        byte[] bArr2 = fVar.f17121a;
        for (int i = 0; i < this.f17066A; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean n() {
        File file = new File(this.f17085v, Wv.i(new StringBuilder(), this.f17086w, ".kvc"));
        File file2 = new File(this.f17085v, Wv.i(new StringBuilder(), this.f17086w, ".tmp"));
        boolean z6 = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!a(file)) {
                    c();
                    b();
                    return false;
                }
                if (this.ac == 0) {
                    if (!a(this.f17070E)) {
                        this.ac = 1;
                        return false;
                    }
                    c("recover from c file");
                    try {
                        b();
                        return true;
                    } catch (Exception e9) {
                        e = e9;
                        z6 = true;
                        a(e);
                        return z6;
                    }
                }
            } else if (this.ac != 0) {
                File file3 = new File(this.f17085v, this.f17086w + ".kva");
                File file4 = new File(this.f17085v, this.f17086w + ".kvb");
                if (file3.exists() && file4.exists()) {
                    a(file3, file4);
                }
            }
            return false;
        } catch (Exception e10) {
            e = e10;
        }
    }

    private synchronized void o() {
        if (this.J) {
            return;
        }
        if (this.ac == 0) {
            this.f17130Z.force();
            this.aa.force();
        }
    }

    private synchronized void p() {
        this.f17128V = false;
    }

    private void q() {
        if (this.ac == 0 || !this.f17128V) {
            return;
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean s() {
        try {
            File file = new File(this.f17085v, this.f17086w + ".tmp");
            if (l.a(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile.setLength(this.f17066A);
                    randomAccessFile.write(this.f17070E.f17121a, 0, this.f17066A);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (l.a(file, new File(this.f17085v, this.f17086w + ".kvc"))) {
                        t();
                        return true;
                    }
                    b(new Exception("rename failed"));
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Exception e9) {
            a(e9);
        }
        return false;
    }

    private void t() {
        if (this.f17073H.isEmpty()) {
            return;
        }
        Iterator<String> it = this.f17073H.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f17073H.clear();
    }

    private void u() {
        this.ac = 1;
        l.a(this.f17129X);
        l.a(this.Y);
        this.f17129X = null;
        this.Y = null;
        this.f17130Z = null;
        this.aa = null;
    }

    private void v() {
        if (this.ac == 0) {
            try {
                a(this.f17130Z);
                a(this.aa);
            } catch (Exception unused) {
                u();
            }
        }
        c();
        l.c(new File(this.f17085v + this.f17086w));
    }

    private synchronized void w() {
        if (this.J) {
            return;
        }
        this.J = true;
        if (this.ac == 0) {
            try {
                this.f17129X.force(true);
                this.f17129X.close();
                this.Y.force(true);
                this.Y.close();
            } catch (Exception e9) {
                a(e9);
            }
        }
        synchronized (a.class) {
            a.f17131a.remove(this.f17085v + this.f17086w);
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(g gVar) {
        MappedByteBuffer mappedByteBuffer;
        f fVar = gVar.f17070E;
        if (this.ac == 0) {
            int length = fVar.f17121a.length;
            MappedByteBuffer mappedByteBuffer2 = this.f17130Z;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = this.aa) != null && mappedByteBuffer.capacity() == length) {
                this.f17130Z.position(0);
                this.f17130Z.put(fVar.f17121a, 0, this.f17066A);
                this.aa.position(0);
                this.aa.put(fVar.f17121a, 0, this.f17066A);
            } else if (!a(fVar)) {
                this.ac = 1;
            }
        }
        if (this.ac != 0) {
            s();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        if (this.J) {
            return;
        }
        this.f17128V = true;
        r();
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        try {
            if (this.J) {
                return this;
            }
            v();
            if (this.ac != 0) {
                b();
            }
            e((String) null);
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        if (this.J) {
            return false;
        }
        this.f17128V = true;
        return r();
    }

    @Override // com.anythink.core.common.s.a.a
    public final void d(int i) {
        int length = this.f17070E.f17121a.length;
        int i4 = this.f17066A + i;
        if (i4 >= length) {
            int i6 = this.f17080P;
            if (i6 > i && i6 > f()) {
                c(i);
                return;
            }
            int a9 = com.anythink.core.common.s.a.a.a(length, i4);
            byte[] bArr = new byte[a9];
            System.arraycopy(this.f17070E.f17121a, 0, bArr, 0, this.f17066A);
            this.f17070E.f17121a = bArr;
            if (this.ac == 0) {
                try {
                    FileChannel fileChannel = this.f17129X;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    long j6 = a9;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j6);
                    this.f17130Z = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.Y.map(mapMode, 0L, j6);
                    this.aa = map2;
                    map2.order(byteOrder);
                } catch (IOException e9) {
                    a(new Exception("map failed", e9));
                    this.f17070E.a(0, a(this.f17066A - 12));
                    this.f17070E.a(4, this.f17067B);
                    u();
                }
            }
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void f(String str) {
        q();
        e(str);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void g(String str) {
        if (this.ac == 0) {
            a(str);
        } else {
            this.f17073H.add(str);
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void h() {
        if (this.f17080P < (f() << 1)) {
            if (this.f17081Q.size() < (this.f17066A < 16384 ? 80 : 160)) {
                return;
            }
        }
        c(0);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void i() {
        this.f17067B ^= this.f17070E.b(this.f17071F, this.f17072G);
        int a9 = a(this.f17066A - 12);
        if (this.ac == 0) {
            this.f17130Z.putInt(0, -1);
            b(this.f17130Z);
            this.f17130Z.putInt(0, a9);
            this.aa.putInt(0, a9);
            b(this.aa);
        } else {
            this.f17070E.a(0, a9);
            this.f17070E.a(4, this.f17067B);
        }
        this.ab = 0;
        this.f17072G = 0;
    }

    public final int j() {
        return this.ac;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x0011, B:12:0x0027, B:14:0x0052, B:16:0x005a, B:17:0x007e, B:19:0x0083, B:21:0x0087, B:22:0x008b, B:23:0x0090, B:25:0x0077, B:26:0x003c, B:28:0x004c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x0011, B:12:0x0027, B:14:0x0052, B:16:0x005a, B:17:0x007e, B:19:0x0083, B:21:0x0087, B:22:0x008b, B:23:0x0090, B:25:0x0077, B:26:0x003c, B:28:0x004c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x0011, B:12:0x0027, B:14:0x0052, B:16:0x005a, B:17:0x007e, B:19:0x0083, B:21:0x0087, B:22:0x008b, B:23:0x0090, B:25:0x0077, B:26:0x003c, B:28:0x004c), top: B:2:0x0001 }] */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized SharedPreferences.Editor remove(String str) {
        String str2;
        try {
            if (this.J) {
                return this;
            }
            b.AbstractC0098b abstractC0098b = this.f17068C.get(str);
            if (abstractC0098b != null) {
                this.f17068C.remove(str);
                this.f17077M.b(str);
                this.f17076L.b(str);
                byte a9 = abstractC0098b.a();
                if (a9 <= 5) {
                    int b9 = f.b(str);
                    int i = abstractC0098b.f17092a;
                    a(a9, i - (b9 + 2), i + com.anythink.core.common.s.a.a.f17060o[a9]);
                } else {
                    b.j jVar = (b.j) abstractC0098b;
                    a(a9, jVar.f17100d, jVar.f17092a + jVar.f17101e);
                    if (jVar.f17102f) {
                        str2 = (String) jVar.f17099c;
                        byte b10 = (byte) (a9 | c.f17103a);
                        if (this.ac != 0) {
                            this.f17130Z.putLong(4, this.f17067B);
                            this.f17130Z.put(this.ab, b10);
                            this.aa.putLong(4, this.f17067B);
                            this.aa.put(this.ab, b10);
                        } else {
                            this.f17070E.a(4, this.f17067B);
                        }
                        this.ab = 0;
                        if (str2 != null) {
                            if (this.ac == 0) {
                                a(str2);
                            } else {
                                this.f17073H.add(str2);
                            }
                        }
                        h();
                        q();
                    }
                }
                str2 = null;
                byte b102 = (byte) (a9 | c.f17103a);
                if (this.ac != 0) {
                }
                this.ab = 0;
                if (str2 != null) {
                }
                h();
                q();
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String toString() {
        return "FastKV: path:" + this.f17085v + " name:" + this.f17086w;
    }

    private boolean r() {
        int i = this.ac;
        if (i == 1) {
            this.f17079O.execute(new p(this, 2));
            return true;
        }
        if (i == 2) {
            return s();
        }
        return true;
    }

    private boolean a(f fVar) {
        Exception exc;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        try {
            int length = fVar.f17121a.length;
            File file = new File(this.f17085v, this.f17086w + ".kva");
            File file2 = new File(this.f17085v, this.f17086w + ".kvb");
            if (l.a(file) && l.a(file2)) {
                randomAccessFile2 = new RandomAccessFile(file, "rw");
                long j6 = length;
                try {
                    randomAccessFile2.setLength(j6);
                    FileChannel channel = randomAccessFile2.getChannel();
                    this.f17129X = channel;
                    mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = channel.map(mapMode, 0L, j6);
                    this.f17130Z = map;
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    this.f17130Z.put(fVar.f17121a, 0, this.f17066A);
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                } catch (Exception e9) {
                    exc = e9;
                    randomAccessFile = null;
                }
                try {
                    randomAccessFile.setLength(j6);
                    FileChannel channel2 = randomAccessFile.getChannel();
                    this.Y = channel2;
                    MappedByteBuffer map2 = channel2.map(mapMode, 0L, j6);
                    this.aa = map2;
                    map2.order(byteOrder);
                    this.aa.put(fVar.f17121a, 0, this.f17066A);
                    return true;
                } catch (Exception e10) {
                    exc = e10;
                    l.a(randomAccessFile2);
                    l.a(randomAccessFile);
                    this.f17129X = null;
                    this.Y = null;
                    this.f17130Z = null;
                    this.aa = null;
                    a(exc);
                    return false;
                }
            }
            throw new Exception("open file failed");
        } catch (Exception e11) {
            exc = e11;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    private void a(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.aa ? this.Y : this.f17129X).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.aa) {
                    this.aa = map;
                } else {
                    this.f17130Z = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e9) {
                a(e9);
                u();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    @Override // com.anythink.core.common.s.a.a
    public final synchronized void a(Map<String, Object> map, Map<Class, com.anythink.core.common.s.a.a.b> map2) {
        try {
            if (this.J) {
                return;
            }
            if (this.ac != 0) {
                this.f17128V = false;
            }
            super.a(map, map2);
            if (this.ac != 0) {
                commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(MappedByteBuffer mappedByteBuffer) {
        int capacity = mappedByteBuffer.capacity();
        int i = com.anythink.core.common.s.a.a.f17062r;
        if (capacity != i) {
            FileChannel fileChannel = mappedByteBuffer == this.f17130Z ? this.f17129X : this.Y;
            fileChannel.truncate(i);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.f17130Z) {
                this.f17130Z = map;
            } else {
                this.aa = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, a(0));
        mappedByteBuffer.putLong(4, 0L);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(byte b9, int i) {
        long a9 = this.f17067B ^ com.anythink.core.common.s.a.a.a(1L, i);
        this.f17067B = a9;
        if (this.ac == 0) {
            this.f17130Z.putLong(4, a9);
            this.f17130Z.put(i, b9);
            this.aa.putLong(4, this.f17067B);
            this.aa.put(i, b9);
        } else {
            this.f17070E.a(4, a9);
        }
        this.f17070E.f17121a[i] = b9;
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, long j6, int i4) {
        long a9 = com.anythink.core.common.s.a.a.a(j6, i4) ^ this.f17067B;
        this.f17067B = a9;
        if (this.ac == 0) {
            this.f17130Z.putLong(4, a9);
            this.f17130Z.putInt(i4, i);
            this.aa.putLong(4, this.f17067B);
            this.aa.putInt(i4, i);
        } else {
            this.f17070E.a(4, a9);
        }
        this.f17070E.a(i4, i);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(long j6, long j9, int i) {
        long a9 = com.anythink.core.common.s.a.a.a(j9, i) ^ this.f17067B;
        this.f17067B = a9;
        if (this.ac == 0) {
            this.f17130Z.putLong(4, a9);
            this.f17130Z.putLong(i, j6);
            this.aa.putLong(4, this.f17067B);
            this.aa.putLong(i, j6);
        } else {
            this.f17070E.a(4, a9);
        }
        this.f17070E.a(i, j6);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, byte[] bArr) {
        super.a(i, bArr);
        if (this.ac == 0) {
            this.f17130Z.putInt(0, -1);
            this.f17130Z.putLong(4, this.f17067B);
            this.f17130Z.position(i);
            this.f17130Z.put(bArr);
            this.f17130Z.putInt(0, a(this.f17066A - 12));
            this.aa.putLong(4, this.f17067B);
            this.aa.position(i);
            this.aa.put(bArr);
            return;
        }
        this.f17070E.a(4, this.f17067B);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(byte b9, int i, int i4) {
        super.a(b9, i, i4);
        this.ab = i;
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, int i4, int i6) {
        int a9 = a(this.f17066A - 12);
        if (this.ac == 0) {
            this.f17130Z.putInt(0, -1);
            this.f17130Z.putLong(4, this.f17067B);
            this.f17130Z.position(i);
            this.f17130Z.put(this.f17070E.f17121a, i, i6);
            this.f17130Z.putInt(0, a9);
            this.aa.putInt(0, a9);
            this.aa.putLong(4, this.f17067B);
            this.aa.position(i);
            this.aa.put(this.f17070E.f17121a, i, i6);
        } else {
            this.f17070E.a(0, a9);
            this.f17070E.a(4, this.f17067B);
        }
        int i9 = this.f17066A + i4;
        if (this.f17070E.f17121a.length - i9 > com.anythink.core.common.s.a.a.f17063s) {
            int i10 = com.anythink.core.common.s.a.a.f17062r;
            int a10 = com.anythink.core.common.s.a.a.a(i10, i9 + i10);
            byte[] bArr = this.f17070E.f17121a;
            if (a10 < bArr.length) {
                byte[] bArr2 = new byte[a10];
                System.arraycopy(bArr, 0, bArr2, 0, this.f17066A);
                this.f17070E.f17121a = bArr2;
                if (this.ac == 0) {
                    try {
                        long j6 = a10;
                        this.f17129X.truncate(j6);
                        FileChannel fileChannel = this.f17129X;
                        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                        MappedByteBuffer map = fileChannel.map(mapMode, 0L, j6);
                        this.f17130Z = map;
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        map.order(byteOrder);
                        this.Y.truncate(j6);
                        MappedByteBuffer map2 = this.Y.map(mapMode, 0L, j6);
                        this.aa = map2;
                        map2.order(byteOrder);
                    } catch (Exception e9) {
                        a(new Exception("map failed", e9));
                        u();
                    }
                }
                c("truncate finish");
            }
        }
    }
}
