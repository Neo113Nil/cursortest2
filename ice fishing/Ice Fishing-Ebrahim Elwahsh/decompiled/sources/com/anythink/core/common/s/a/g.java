package com.anythink.core.common.s.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.anythink.core.common.s.a.b;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class g extends com.anythink.core.common.s.a.a {

    /* renamed from: S, reason: collision with root package name */
    public static final int f16495S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static final int f16496T = 1;

    /* renamed from: U, reason: collision with root package name */
    public static final int f16497U = 2;

    /* renamed from: W, reason: collision with root package name */
    private static final String f16498W = "g";

    /* renamed from: V, reason: collision with root package name */
    boolean f16499V;

    /* renamed from: X, reason: collision with root package name */
    private FileChannel f16500X;
    private FileChannel Y;

    /* renamed from: Z, reason: collision with root package name */
    private MappedByteBuffer f16501Z;
    private MappedByteBuffer aa;
    private int ab;
    private int ac;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final Map<String, g> f16502a = new ConcurrentHashMap();

        /* renamed from: b, reason: collision with root package name */
        private String f16503b;

        /* renamed from: c, reason: collision with root package name */
        private String f16504c;

        /* renamed from: d, reason: collision with root package name */
        private com.anythink.core.common.s.a.a.b[] f16505d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.s.a.a.a f16506e;

        /* renamed from: f, reason: collision with root package name */
        private int f16507f = 0;

        private a(Context context, String str) {
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f16503b = context.getFilesDir().getAbsolutePath() + "/tktp/";
            this.f16504c = str;
        }

        private a a(com.anythink.core.common.s.a.a.b[] bVarArr) {
            this.f16505d = bVarArr;
            return this;
        }

        private a b() {
            this.f16507f = 1;
            return this;
        }

        private g c() {
            g gVar;
            String str = this.f16503b + this.f16504c;
            Map<String, g> map = f16502a;
            g gVar2 = map.get(str);
            if (gVar2 != null) {
                return gVar2;
            }
            synchronized (a.class) {
                try {
                    gVar = map.get(str);
                    if (gVar == null) {
                        g gVar3 = new g(this.f16503b, this.f16504c, this.f16505d, this.f16506e, this.f16507f);
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
            this.f16506e = aVar;
            return this;
        }

        private a a() {
            this.f16507f = 2;
            return this;
        }

        private a(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.f16503b = str.endsWith("/") ? str : str.concat("/");
            this.f16504c = str2;
        }
    }

    public g(String str, String str2, com.anythink.core.common.s.a.a.b[] bVarArr, com.anythink.core.common.s.a.a.a aVar, int i) {
        super(str, str2, bVarArr, aVar);
        this.f16499V = true;
        this.ac = i;
        k();
    }

    private void b(MappedByteBuffer mappedByteBuffer) {
        try {
            if (mappedByteBuffer.capacity() < 12) {
                throw new IllegalArgumentException("Buffer capacity too small for checksum");
            }
            mappedByteBuffer.putLong(4, this.f16438B);
            int i = this.ab;
            if (i != 0) {
                if (i < 0 || i >= mappedByteBuffer.capacity()) {
                    throw new IllegalArgumentException("removeStart out of bounds: " + this.ab);
                }
                int i4 = this.ab;
                byte[] bArr = this.f16441E.f16492a;
                if (i4 >= bArr.length) {
                    throw new IllegalArgumentException("fastBuffer.hb index out of bounds: " + this.ab);
                }
                mappedByteBuffer.put(i4, bArr[i4]);
            }
            int i9 = this.f16443G;
            if (i9 != 0) {
                int i10 = this.f16442F;
                if (i10 < 0 || i9 < 0 || i9 + i10 > this.f16441E.f16492a.length) {
                    throw new IllegalArgumentException("Invalid update range");
                }
                if (i10 <= mappedByteBuffer.capacity()) {
                    int capacity = mappedByteBuffer.capacity();
                    int i11 = this.f16442F;
                    if (capacity - i11 >= this.f16443G) {
                        mappedByteBuffer.position(i11);
                        mappedByteBuffer.put(this.f16441E.f16492a, this.f16442F, this.f16443G);
                        return;
                    }
                }
                throw new IllegalArgumentException("buffer capacity overflow");
            }
        } catch (Throwable th) {
            com.anythink.basead.b.c.i.v("sp_mmap_error", "spName: " + this.f16457w + " errorMsg: " + th.getMessage());
        }
    }

    private void e(int i) {
        int i4 = com.anythink.core.common.s.a.a.f16433r;
        int a9 = com.anythink.core.common.s.a.a.a(i4, i + i4);
        byte[] bArr = this.f16441E.f16492a;
        if (a9 >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[a9];
        System.arraycopy(bArr, 0, bArr2, 0, this.f16437A);
        this.f16441E.f16492a = bArr2;
        if (this.ac == 0) {
            try {
                long j9 = a9;
                this.f16500X.truncate(j9);
                FileChannel fileChannel = this.f16500X;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j9);
                this.f16501Z = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.Y.truncate(j9);
                MappedByteBuffer map2 = this.Y.map(mapMode, 0L, j9);
                this.aa = map2;
                map2.order(byteOrder);
            } catch (Exception e6) {
                a(new Exception("map failed", e6));
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
        long j9;
        File file;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        FileChannel fileChannel;
        long j10;
        try {
            long nanoTime = System.nanoTime();
            if (!n() && this.ac == 0) {
                File file2 = new File(this.f16456v, this.f16457w + ".kva");
                File file3 = new File(this.f16456v, this.f16457w + ".kvb");
                try {
                } catch (Exception e6) {
                    e = e6;
                    j9 = nanoTime;
                }
                try {
                    if (l.a(file2) && l.a(file3)) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "rw");
                        long length = randomAccessFile.length();
                        long length2 = randomAccessFile2.length();
                        this.f16500X = randomAccessFile.getChannel();
                        this.Y = randomAccessFile2.getChannel();
                        try {
                            FileChannel fileChannel2 = this.f16500X;
                            mapMode = FileChannel.MapMode.READ_WRITE;
                            MappedByteBuffer map = fileChannel2.map(mapMode, 0L, length > 0 ? length : com.anythink.core.common.s.a.a.f16433r);
                            this.f16501Z = map;
                            byteOrder = ByteOrder.LITTLE_ENDIAN;
                            map.order(byteOrder);
                            fileChannel = this.Y;
                            if (length2 > 0) {
                                file = file2;
                                j10 = length2;
                            } else {
                                file = file2;
                                j10 = com.anythink.core.common.s.a.a.f16433r;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            j9 = nanoTime;
                            file = file2;
                        }
                        try {
                            MappedByteBuffer map2 = fileChannel.map(mapMode, 0L, j10);
                            this.aa = map2;
                            map2.order(byteOrder);
                            this.f16441E = new f(this.f16501Z.capacity());
                            if (length == 0 && length2 == 0) {
                                this.f16437A = 12;
                            } else {
                                int i = this.f16501Z.getInt();
                                int i4 = i & (-1073741825);
                                boolean b9 = com.anythink.core.common.s.a.a.b(i);
                                long j11 = this.f16501Z.getLong();
                                int i9 = this.aa.getInt();
                                int i10 = (-1073741825) & i9;
                                boolean b10 = com.anythink.core.common.s.a.a.b(i9);
                                long j12 = this.aa.getLong();
                                j9 = nanoTime;
                                if (i4 >= 0 && i4 <= length - 12) {
                                    this.f16437A = i4 + 12;
                                    this.f16501Z.rewind();
                                    this.f16501Z.get(this.f16441E.f16492a, 0, this.f16437A);
                                    if (j11 == this.f16441E.b(12, i4) && a(b9)) {
                                        this.f16438B = j11;
                                        if (length == length2) {
                                            if (!m()) {
                                            }
                                        }
                                        b(new Exception("B file error"));
                                        a(this.f16501Z, this.aa, this.f16437A);
                                    }
                                }
                                if (i10 >= 0 && i10 <= length2 - 12) {
                                    this.f16439C.clear();
                                    e();
                                    this.f16437A = i10 + 12;
                                    if (this.f16441E.f16492a.length != this.aa.capacity()) {
                                        this.f16441E = new f(this.aa.capacity());
                                    }
                                    this.aa.rewind();
                                    this.aa.get(this.f16441E.f16492a, 0, this.f16437A);
                                    if (j12 == this.f16441E.b(12, i10) && a(b10)) {
                                        b(new Exception("A file error"));
                                        a(this.aa, this.f16501Z, this.f16437A);
                                        this.f16438B = j12;
                                    }
                                }
                                b("both files error");
                                v();
                            }
                        } catch (IOException e10) {
                            e = e10;
                            j9 = nanoTime;
                            a(e);
                            u();
                            a(file, file3);
                            if (this.f16441E == null) {
                            }
                            if (this.f16437A == 0) {
                            }
                            if (this.f16445I) {
                            }
                            if (this.f16459y != null) {
                            }
                        }
                    } else {
                        j9 = nanoTime;
                        a(new Exception("open file failed"));
                        u();
                    }
                } catch (Exception e11) {
                    e = e11;
                    a(e);
                    c();
                    u();
                    if (this.f16441E == null) {
                    }
                    if (this.f16437A == 0) {
                    }
                    if (this.f16445I) {
                    }
                    if (this.f16459y != null) {
                    }
                }
                if (this.f16441E == null) {
                    this.f16441E = new f(com.anythink.core.common.s.a.a.f16433r);
                }
                if (this.f16437A == 0) {
                    this.f16437A = 12;
                }
                if (this.f16445I) {
                    a();
                    c("rewrite data");
                }
                if (this.f16459y != null) {
                    c("loading finish, data len:" + this.f16437A + ", get keys:" + this.f16439C.size() + ", use time:" + ((System.nanoTime() - j9) / 1000000) + " ms");
                }
            }
            j9 = nanoTime;
            if (this.f16441E == null) {
            }
            if (this.f16437A == 0) {
            }
            if (this.f16445I) {
            }
            if (this.f16459y != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void l() {
        long j9;
        File file = new File(this.f16456v, AbstractC5051n.g(new StringBuilder(), this.f16457w, ".kva"));
        File file2 = new File(this.f16456v, AbstractC5051n.g(new StringBuilder(), this.f16457w, ".kvb"));
        try {
            if (l.a(file) && l.a(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                this.f16500X = randomAccessFile.getChannel();
                this.Y = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = this.f16500X;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : com.anythink.core.common.s.a.a.f16433r);
                    this.f16501Z = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.Y.map(mapMode, 0L, length2 > 0 ? length2 : com.anythink.core.common.s.a.a.f16433r);
                    this.aa = map2;
                    map2.order(byteOrder);
                    this.f16441E = new f(this.f16501Z.capacity());
                    if (length == 0 && length2 == 0) {
                        this.f16437A = 12;
                        return;
                    }
                    int i = this.f16501Z.getInt();
                    int i4 = i & (-1073741825);
                    boolean b9 = com.anythink.core.common.s.a.a.b(i);
                    long j10 = this.f16501Z.getLong();
                    int i9 = this.aa.getInt();
                    int i10 = (-1073741825) & i9;
                    boolean b10 = com.anythink.core.common.s.a.a.b(i9);
                    long j11 = this.aa.getLong();
                    if (i4 < 0 || i4 > length - 12) {
                        j9 = 12;
                    } else {
                        this.f16437A = i4 + 12;
                        this.f16501Z.rewind();
                        j9 = 12;
                        this.f16501Z.get(this.f16441E.f16492a, 0, this.f16437A);
                        if (j10 == this.f16441E.b(12, i4) && a(b9)) {
                            this.f16438B = j10;
                            if (length == length2 && m()) {
                                return;
                            }
                            b(new Exception("B file error"));
                            a(this.f16501Z, this.aa, this.f16437A);
                            return;
                        }
                    }
                    if (i10 >= 0 && i10 <= length2 - j9) {
                        this.f16439C.clear();
                        e();
                        this.f16437A = i10 + 12;
                        if (this.f16441E.f16492a.length != this.aa.capacity()) {
                            this.f16441E = new f(this.aa.capacity());
                        }
                        this.aa.rewind();
                        this.aa.get(this.f16441E.f16492a, 0, this.f16437A);
                        if (j11 == this.f16441E.b(12, i10) && a(b10)) {
                            b(new Exception("A file error"));
                            a(this.aa, this.f16501Z, this.f16437A);
                            this.f16438B = j11;
                            return;
                        }
                    }
                    b("both files error");
                    v();
                    return;
                } catch (IOException e6) {
                    a(e6);
                    u();
                    a(file, file2);
                    return;
                }
            }
            a(new Exception("open file failed"));
            u();
        } catch (Exception e9) {
            a(e9);
            c();
            u();
        }
    }

    private boolean m() {
        f fVar = new f(this.f16437A);
        this.aa.rewind();
        this.aa.get(fVar.f16492a, 0, this.f16437A);
        byte[] bArr = this.f16441E.f16492a;
        byte[] bArr2 = fVar.f16492a;
        for (int i = 0; i < this.f16437A; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean n() {
        File file = new File(this.f16456v, AbstractC5051n.g(new StringBuilder(), this.f16457w, ".kvc"));
        File file2 = new File(this.f16456v, AbstractC5051n.g(new StringBuilder(), this.f16457w, ".tmp"));
        boolean z8 = false;
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
                    if (!a(this.f16441E)) {
                        this.ac = 1;
                        return false;
                    }
                    c("recover from c file");
                    try {
                        b();
                        return true;
                    } catch (Exception e6) {
                        e = e6;
                        z8 = true;
                        a(e);
                        return z8;
                    }
                }
            } else if (this.ac != 0) {
                File file3 = new File(this.f16456v, this.f16457w + ".kva");
                File file4 = new File(this.f16456v, this.f16457w + ".kvb");
                if (file3.exists() && file4.exists()) {
                    a(file3, file4);
                }
            }
            return false;
        } catch (Exception e9) {
            e = e9;
        }
    }

    private synchronized void o() {
        if (this.J) {
            return;
        }
        if (this.ac == 0) {
            this.f16501Z.force();
            this.aa.force();
        }
    }

    private synchronized void p() {
        this.f16499V = false;
    }

    private void q() {
        if (this.ac == 0 || !this.f16499V) {
            return;
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean s() {
        try {
            File file = new File(this.f16456v, this.f16457w + ".tmp");
            if (l.a(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile.setLength(this.f16437A);
                    randomAccessFile.write(this.f16441E.f16492a, 0, this.f16437A);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (l.a(file, new File(this.f16456v, this.f16457w + ".kvc"))) {
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
        } catch (Exception e6) {
            a(e6);
        }
        return false;
    }

    private void t() {
        if (this.f16444H.isEmpty()) {
            return;
        }
        Iterator<String> it = this.f16444H.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.f16444H.clear();
    }

    private void u() {
        this.ac = 1;
        l.a(this.f16500X);
        l.a(this.Y);
        this.f16500X = null;
        this.Y = null;
        this.f16501Z = null;
        this.aa = null;
    }

    private void v() {
        if (this.ac == 0) {
            try {
                a(this.f16501Z);
                a(this.aa);
            } catch (Exception unused) {
                u();
            }
        }
        c();
        l.c(new File(this.f16456v + this.f16457w));
    }

    private synchronized void w() {
        if (this.J) {
            return;
        }
        this.J = true;
        if (this.ac == 0) {
            try {
                this.f16500X.force(true);
                this.f16500X.close();
                this.Y.force(true);
                this.Y.close();
            } catch (Exception e6) {
                a(e6);
            }
        }
        synchronized (a.class) {
            a.f16502a.remove(this.f16456v + this.f16457w);
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(g gVar) {
        MappedByteBuffer mappedByteBuffer;
        f fVar = gVar.f16441E;
        if (this.ac == 0) {
            int length = fVar.f16492a.length;
            MappedByteBuffer mappedByteBuffer2 = this.f16501Z;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = this.aa) != null && mappedByteBuffer.capacity() == length) {
                this.f16501Z.position(0);
                this.f16501Z.put(fVar.f16492a, 0, this.f16437A);
                this.aa.position(0);
                this.aa.put(fVar.f16492a, 0, this.f16437A);
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
        this.f16499V = true;
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
        this.f16499V = true;
        return r();
    }

    @Override // com.anythink.core.common.s.a.a
    public final void d(int i) {
        int length = this.f16441E.f16492a.length;
        int i4 = this.f16437A + i;
        if (i4 >= length) {
            int i9 = this.f16451P;
            if (i9 > i && i9 > f()) {
                c(i);
                return;
            }
            int a9 = com.anythink.core.common.s.a.a.a(length, i4);
            byte[] bArr = new byte[a9];
            System.arraycopy(this.f16441E.f16492a, 0, bArr, 0, this.f16437A);
            this.f16441E.f16492a = bArr;
            if (this.ac == 0) {
                try {
                    FileChannel fileChannel = this.f16500X;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    long j9 = a9;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j9);
                    this.f16501Z = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.Y.map(mapMode, 0L, j9);
                    this.aa = map2;
                    map2.order(byteOrder);
                } catch (IOException e6) {
                    a(new Exception("map failed", e6));
                    this.f16441E.a(0, a(this.f16437A - 12));
                    this.f16441E.a(4, this.f16438B);
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
            this.f16444H.add(str);
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void h() {
        if (this.f16451P < (f() << 1)) {
            if (this.f16452Q.size() < (this.f16437A < 16384 ? 80 : 160)) {
                return;
            }
        }
        c(0);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void i() {
        this.f16438B ^= this.f16441E.b(this.f16442F, this.f16443G);
        int a9 = a(this.f16437A - 12);
        if (this.ac == 0) {
            this.f16501Z.putInt(0, -1);
            b(this.f16501Z);
            this.f16501Z.putInt(0, a9);
            this.aa.putInt(0, a9);
            b(this.aa);
        } else {
            this.f16441E.a(0, a9);
            this.f16441E.a(4, this.f16438B);
        }
        this.ab = 0;
        this.f16443G = 0;
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
            b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
            if (abstractC0097b != null) {
                this.f16439C.remove(str);
                this.f16448M.b(str);
                this.f16447L.b(str);
                byte a9 = abstractC0097b.a();
                if (a9 <= 5) {
                    int b9 = f.b(str);
                    int i = abstractC0097b.f16463a;
                    a(a9, i - (b9 + 2), i + com.anythink.core.common.s.a.a.f16431o[a9]);
                } else {
                    b.j jVar = (b.j) abstractC0097b;
                    a(a9, jVar.f16471d, jVar.f16463a + jVar.f16472e);
                    if (jVar.f16473f) {
                        str2 = (String) jVar.f16470c;
                        byte b10 = (byte) (a9 | c.f16474a);
                        if (this.ac != 0) {
                            this.f16501Z.putLong(4, this.f16438B);
                            this.f16501Z.put(this.ab, b10);
                            this.aa.putLong(4, this.f16438B);
                            this.aa.put(this.ab, b10);
                        } else {
                            this.f16441E.a(4, this.f16438B);
                        }
                        this.ab = 0;
                        if (str2 != null) {
                            if (this.ac == 0) {
                                a(str2);
                            } else {
                                this.f16444H.add(str2);
                            }
                        }
                        h();
                        q();
                    }
                }
                str2 = null;
                byte b102 = (byte) (a9 | c.f16474a);
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
        return "FastKV: path:" + this.f16456v + " name:" + this.f16457w;
    }

    private boolean r() {
        int i = this.ac;
        if (i == 1) {
            this.f16450O.execute(new p(this, 2));
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
            int length = fVar.f16492a.length;
            File file = new File(this.f16456v, this.f16457w + ".kva");
            File file2 = new File(this.f16456v, this.f16457w + ".kvb");
            if (l.a(file) && l.a(file2)) {
                randomAccessFile2 = new RandomAccessFile(file, "rw");
                long j9 = length;
                try {
                    randomAccessFile2.setLength(j9);
                    FileChannel channel = randomAccessFile2.getChannel();
                    this.f16500X = channel;
                    mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = channel.map(mapMode, 0L, j9);
                    this.f16501Z = map;
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    this.f16501Z.put(fVar.f16492a, 0, this.f16437A);
                    randomAccessFile = new RandomAccessFile(file2, "rw");
                } catch (Exception e6) {
                    exc = e6;
                    randomAccessFile = null;
                }
                try {
                    randomAccessFile.setLength(j9);
                    FileChannel channel2 = randomAccessFile.getChannel();
                    this.Y = channel2;
                    MappedByteBuffer map2 = channel2.map(mapMode, 0L, j9);
                    this.aa = map2;
                    map2.order(byteOrder);
                    this.aa.put(fVar.f16492a, 0, this.f16437A);
                    return true;
                } catch (Exception e9) {
                    exc = e9;
                    l.a(randomAccessFile2);
                    l.a(randomAccessFile);
                    this.f16500X = null;
                    this.Y = null;
                    this.f16501Z = null;
                    this.aa = null;
                    a(exc);
                    return false;
                }
            }
            throw new Exception("open file failed");
        } catch (Exception e10) {
            exc = e10;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    private void a(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.aa ? this.Y : this.f16500X).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.aa) {
                    this.aa = map;
                } else {
                    this.f16501Z = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e6) {
                a(e6);
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
                this.f16499V = false;
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
        int i = com.anythink.core.common.s.a.a.f16433r;
        if (capacity != i) {
            FileChannel fileChannel = mappedByteBuffer == this.f16501Z ? this.f16500X : this.Y;
            fileChannel.truncate(i);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.f16501Z) {
                this.f16501Z = map;
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
        long a9 = this.f16438B ^ com.anythink.core.common.s.a.a.a(1L, i);
        this.f16438B = a9;
        if (this.ac == 0) {
            this.f16501Z.putLong(4, a9);
            this.f16501Z.put(i, b9);
            this.aa.putLong(4, this.f16438B);
            this.aa.put(i, b9);
        } else {
            this.f16441E.a(4, a9);
        }
        this.f16441E.f16492a[i] = b9;
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, long j9, int i4) {
        long a9 = com.anythink.core.common.s.a.a.a(j9, i4) ^ this.f16438B;
        this.f16438B = a9;
        if (this.ac == 0) {
            this.f16501Z.putLong(4, a9);
            this.f16501Z.putInt(i4, i);
            this.aa.putLong(4, this.f16438B);
            this.aa.putInt(i4, i);
        } else {
            this.f16441E.a(4, a9);
        }
        this.f16441E.a(i4, i);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(long j9, long j10, int i) {
        long a9 = com.anythink.core.common.s.a.a.a(j10, i) ^ this.f16438B;
        this.f16438B = a9;
        if (this.ac == 0) {
            this.f16501Z.putLong(4, a9);
            this.f16501Z.putLong(i, j9);
            this.aa.putLong(4, this.f16438B);
            this.aa.putLong(i, j9);
        } else {
            this.f16441E.a(4, a9);
        }
        this.f16441E.a(i, j9);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, byte[] bArr) {
        super.a(i, bArr);
        if (this.ac == 0) {
            this.f16501Z.putInt(0, -1);
            this.f16501Z.putLong(4, this.f16438B);
            this.f16501Z.position(i);
            this.f16501Z.put(bArr);
            this.f16501Z.putInt(0, a(this.f16437A - 12));
            this.aa.putLong(4, this.f16438B);
            this.aa.position(i);
            this.aa.put(bArr);
            return;
        }
        this.f16441E.a(4, this.f16438B);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(byte b9, int i, int i4) {
        super.a(b9, i, i4);
        this.ab = i;
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, int i4, int i9) {
        int a9 = a(this.f16437A - 12);
        if (this.ac == 0) {
            this.f16501Z.putInt(0, -1);
            this.f16501Z.putLong(4, this.f16438B);
            this.f16501Z.position(i);
            this.f16501Z.put(this.f16441E.f16492a, i, i9);
            this.f16501Z.putInt(0, a9);
            this.aa.putInt(0, a9);
            this.aa.putLong(4, this.f16438B);
            this.aa.position(i);
            this.aa.put(this.f16441E.f16492a, i, i9);
        } else {
            this.f16441E.a(0, a9);
            this.f16441E.a(4, this.f16438B);
        }
        int i10 = this.f16437A + i4;
        if (this.f16441E.f16492a.length - i10 > com.anythink.core.common.s.a.a.f16434s) {
            int i11 = com.anythink.core.common.s.a.a.f16433r;
            int a10 = com.anythink.core.common.s.a.a.a(i11, i10 + i11);
            byte[] bArr = this.f16441E.f16492a;
            if (a10 < bArr.length) {
                byte[] bArr2 = new byte[a10];
                System.arraycopy(bArr, 0, bArr2, 0, this.f16437A);
                this.f16441E.f16492a = bArr2;
                if (this.ac == 0) {
                    try {
                        long j9 = a10;
                        this.f16500X.truncate(j9);
                        FileChannel fileChannel = this.f16500X;
                        FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                        MappedByteBuffer map = fileChannel.map(mapMode, 0L, j9);
                        this.f16501Z = map;
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        map.order(byteOrder);
                        this.Y.truncate(j9);
                        MappedByteBuffer map2 = this.Y.map(mapMode, 0L, j9);
                        this.aa = map2;
                        map2.order(byteOrder);
                    } catch (Exception e6) {
                        a(new Exception("map failed", e6));
                        u();
                    }
                }
                c("truncate finish");
            }
        }
    }
}
