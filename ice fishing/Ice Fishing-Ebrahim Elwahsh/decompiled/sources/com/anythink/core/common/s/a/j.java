package com.anythink.core.common.s.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.common.s.a.b;
import com.google.android.gms.internal.ads.CL;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class j extends com.anythink.core.common.s.a.a {

    /* renamed from: S, reason: collision with root package name */
    private static final String f16513S = "j";

    /* renamed from: T, reason: collision with root package name */
    private static final int f16514T = 1;

    /* renamed from: U, reason: collision with root package name */
    private static final int f16515U = 2;

    /* renamed from: V, reason: collision with root package name */
    private static final int f16516V = 3000;

    /* renamed from: W, reason: collision with root package name */
    private static final Random f16517W = new Random();

    /* renamed from: X, reason: collision with root package name */
    private final boolean f16518X;
    private final File Y;

    /* renamed from: Z, reason: collision with root package name */
    private final File f16519Z;
    private RandomAccessFile aa;
    private RandomAccessFile ab;
    private FileChannel ac;
    private FileChannel ad;
    private MappedByteBuffer ae;
    private FileLock af;
    private int[] ag;
    private int ah;
    private long ai;
    private boolean aj;
    private final Executor ak;
    private volatile b al;
    private final Set<String> am;
    private final Handler an;

    /* renamed from: com.anythink.core.common.s.a.j$1, reason: invalid class name */
    public class AnonymousClass1 extends Handler {
        public AnonymousClass1(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                j.this.ak.execute(new p(j.this, 0));
            } else {
                if (i != 2) {
                    return;
                }
                j.this.apply();
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Map<String, j> f16521a = new ConcurrentHashMap();

        /* renamed from: b, reason: collision with root package name */
        private String f16522b;

        /* renamed from: c, reason: collision with root package name */
        private String f16523c;

        /* renamed from: d, reason: collision with root package name */
        private com.anythink.core.common.s.a.a.b[] f16524d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.s.a.a.a f16525e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16526f = false;

        public a(Context context, String str) {
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f16522b = context.getFilesDir().getAbsolutePath() + "/tktp/";
            this.f16523c = str;
        }

        private a a(com.anythink.core.common.s.a.a.b[] bVarArr) {
            this.f16524d = bVarArr;
            return this;
        }

        public final j b() {
            j jVar;
            String str = this.f16522b + this.f16523c;
            Map<String, j> map = f16521a;
            j jVar2 = map.get(str);
            if (jVar2 != null) {
                return jVar2;
            }
            synchronized (a.class) {
                try {
                    jVar = map.get(str);
                    if (jVar == null) {
                        j jVar3 = new j(this.f16522b, this.f16523c, this.f16524d, this.f16525e, this.f16526f);
                        map.put(str, jVar3);
                        jVar = jVar3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jVar;
        }

        private a a(com.anythink.core.common.s.a.a.a aVar) {
            this.f16525e = aVar;
            return this;
        }

        public final a a() {
            this.f16526f = false;
            return this;
        }

        private a(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.f16522b = str.endsWith("/") ? str : str.concat("/");
            this.f16523c = str2;
        }
    }

    public class b extends FileObserver {
        public b(String str) {
            super(str, 2);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i, String str) {
            if (j.this.an.hasMessages(1)) {
                return;
            }
            j.this.an.sendEmptyMessageDelayed(1, 30L);
        }
    }

    public j(String str, String str2, com.anythink.core.common.s.a.a.b[] bVarArr, com.anythink.core.common.s.a.a.a aVar, boolean z8) {
        super(str, str2, bVarArr, aVar);
        this.ag = new int[16];
        this.ah = 0;
        this.aj = false;
        this.ak = new i();
        this.am = new HashSet();
        this.an = new AnonymousClass1(Looper.getMainLooper());
        this.Y = new File(str, CL.j(str2, ".kva"));
        this.f16519Z = new File(str, CL.j(str2, ".kvb"));
        this.f16518X = z8;
        SystemClock.currentThreadTimeMillis();
        j();
        SystemClock.currentThreadTimeMillis();
    }

    private void A() {
        c();
        try {
            p();
            this.ae.putInt(0, a(0));
            this.ae.putLong(4, 0L);
            m();
            if (l.a(this.f16519Z)) {
                e(com.anythink.core.common.s.a.a.f16433r);
                b(0, 12);
                k();
            }
        } catch (Exception e6) {
            a(e6);
            this.aj = true;
        }
        l.c(new File(this.f16456v + this.f16457w));
        e((String) null);
    }

    private void B() {
        int i = com.anythink.core.common.s.a.a.f16433r;
        int a9 = com.anythink.core.common.s.a.a.a(i, this.f16437A + i);
        byte[] bArr = this.f16441E.f16492a;
        if (a9 >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[a9];
        System.arraycopy(bArr, 0, bArr2, 0, this.f16437A);
        this.f16441E.f16492a = bArr2;
        try {
            long j9 = a9;
            this.ac.truncate(j9);
            MappedByteBuffer map = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, j9);
            this.ae = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            this.ab.setLength(j9);
            this.ad.truncate(j9);
        } catch (Exception e6) {
            a(new Exception("map failed", e6));
            this.aj = true;
        }
        c("truncate finish");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void C() {
        g();
        w();
    }

    private void e(int i) {
        if (this.ab == null) {
            this.ab = new RandomAccessFile(this.f16519Z, "rw");
        }
        if (this.ad == null) {
            this.ad = this.ab.getChannel();
        }
        long j9 = i;
        if (this.ad.size() != j9) {
            this.ab.setLength(j9);
            this.ad.truncate(j9);
        }
    }

    private synchronized void j() {
        try {
            long nanoTime = System.nanoTime();
            if (!q()) {
                l();
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
                c("loading finish, data len:" + this.f16437A + ", get keys:" + this.f16439C.size() + ", use time:" + ((System.nanoTime() - nanoTime) / 1000000) + " ms");
            }
            k();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void k() {
        File file;
        if (this.f16518X && this.al == null && (file = this.f16519Z) != null && file.exists()) {
            this.al = new b(this.f16519Z.getPath());
            this.al.startWatching();
        }
    }

    private void l() {
        int i;
        int i4 = 0;
        int i9 = 0;
        while (true) {
            try {
                if (l.a(this.Y) && l.a(this.f16519Z)) {
                    break;
                }
                if (i9 >= 3) {
                    break;
                }
                Thread.sleep(20L);
                i9++;
            } catch (Throwable th) {
                if (th instanceof Exception) {
                    a(th);
                }
                c();
                return;
            }
        }
        if (this.Y.exists() && this.f16519Z.exists()) {
            this.aa = new RandomAccessFile(this.Y, "rw");
            this.ab = new RandomAccessFile(this.f16519Z, "rw");
            long length = this.aa.length();
            long length2 = this.ab.length();
            this.ac = this.aa.getChannel();
            FileChannel channel = this.ab.getChannel();
            this.ad = channel;
            FileLock lock = channel.lock();
            try {
                try {
                    MappedByteBuffer map = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, length > 0 ? length : com.anythink.core.common.s.a.a.f16433r);
                    this.ae = map;
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    if (length == 0 && length2 == 0) {
                        this.f16437A = 12;
                        RandomAccessFile randomAccessFile = this.ab;
                        int i10 = com.anythink.core.common.s.a.a.f16433r;
                        randomAccessFile.setLength(i10);
                        this.ad.truncate(i10);
                    } else if (a(this.f16519Z)) {
                        if (length == length2 && this.f16441E.f16492a.length == this.ae.capacity()) {
                            byte[] bArr = this.f16441E.f16492a;
                            int i11 = this.f16437A;
                            byte[] bArr2 = new byte[i11];
                            this.ae.get(bArr2, 0, i11);
                            while (true) {
                                i = this.f16437A;
                                if (i4 >= i || bArr2[i4] != bArr[i4]) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (i4 == i) {
                            }
                        }
                        b(new Exception("A file error"));
                        o();
                    } else {
                        this.ah = 0;
                        d();
                        f fVar = this.f16441E;
                        if (fVar == null || fVar.f16492a.length != this.ae.capacity()) {
                            this.f16441E = new f(this.ae.capacity());
                        }
                        int i12 = this.ae.getInt();
                        int i13 = (-1073741825) & i12;
                        boolean b9 = com.anythink.core.common.s.a.a.b(i12);
                        if (i13 >= 0 && i13 <= length - 12) {
                            this.f16437A = i13 + 12;
                            long j9 = this.ae.getLong(4);
                            this.ae.rewind();
                            this.ae.get(this.f16441E.f16492a, 0, this.f16437A);
                            if (j9 == this.f16441E.b(12, i13) && a(b9)) {
                                this.f16438B = j9;
                                b(new Exception("B file error"));
                                n();
                            }
                        }
                        b("both files error");
                        A();
                    }
                    m();
                    lock.release();
                    return;
                } catch (IOException e6) {
                    a(e6);
                    a(this.Y, this.f16519Z);
                    lock.release();
                    return;
                }
            } finally {
                lock.release();
            }
        }
        a(new Exception("open file failed"));
    }

    private void m() {
        MappedByteBuffer mappedByteBuffer = this.ae;
        if (mappedByteBuffer == null || this.f16437A + 8 >= mappedByteBuffer.capacity()) {
            return;
        }
        this.ai = this.ae.getLong(this.f16437A);
    }

    private void n() {
        try {
            if (l.a(this.f16519Z)) {
                e(this.ae.capacity());
                b(0, this.f16437A);
            }
        } catch (Exception e6) {
            a(e6);
        }
    }

    private void o() {
        try {
            if (p()) {
                this.ae.position(0);
                this.ae.put(this.f16441E.f16492a, 0, this.f16437A);
            }
        } catch (Exception e6) {
            a(e6);
        }
    }

    private boolean p() {
        int length = this.f16441E.f16492a.length;
        try {
            if (this.aa == null) {
                if (!l.a(this.Y)) {
                    return false;
                }
                this.aa = new RandomAccessFile(this.Y, "rw");
            }
            long j9 = length;
            if (this.aa.length() != j9) {
                this.aa.setLength(j9);
            }
            FileChannel fileChannel = this.ac;
            if (fileChannel == null) {
                this.ac = this.aa.getChannel();
            } else if (fileChannel.size() != j9) {
                this.ac.truncate(j9);
            }
            MappedByteBuffer mappedByteBuffer = this.ae;
            if (mappedByteBuffer != null && mappedByteBuffer.capacity() == length) {
                return true;
            }
            MappedByteBuffer map = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, j9);
            this.ae = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            return true;
        } catch (Exception e6) {
            a(e6);
            return false;
        }
    }

    private boolean q() {
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
                } else if (a(this.f16441E)) {
                    c("recover from c file");
                    z8 = true;
                }
                b();
            }
            return z8;
        } catch (Exception e6) {
            a(e6);
            return z8;
        }
    }

    private synchronized void s() {
        try {
            try {
                MappedByteBuffer mappedByteBuffer = this.ae;
                if (mappedByteBuffer != null) {
                    mappedByteBuffer.force();
                }
                FileChannel fileChannel = this.ad;
                if (fileChannel != null) {
                    fileChannel.force(true);
                }
            } catch (Exception e6) {
                a(e6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean t() {
        f fVar = this.f16441E;
        fVar.f16493b = 0;
        int c4 = fVar.c() & (-1073741825);
        long d2 = this.f16441E.d();
        this.f16438B = d2;
        this.f16437A = c4 + 12;
        if (d2 == this.f16441E.b(12, c4)) {
            return a(this.f16441E);
        }
        A();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean u() {
        if (this.af == null) {
            return false;
        }
        if (this.f16441E == null || (this.ah == 0 && !this.aj)) {
            w();
            return false;
        }
        try {
            int a9 = a(this.f16437A - 12);
            this.f16441E.a(0, a9);
            this.f16441E.a(4, this.f16438B);
            if (this.aj) {
                boolean t9 = t();
                if (t9) {
                    this.aj = false;
                }
                this.ah = 0;
                if (!this.f16444H.isEmpty()) {
                    this.f16444H.clear();
                }
                v();
                w();
                r();
                return t9;
            }
            if (!p()) {
                MappedByteBuffer mappedByteBuffer = this.ae;
                if (mappedByteBuffer == null) {
                    this.aj = true;
                } else if (mappedByteBuffer != null) {
                    y();
                    m();
                    f fVar = this.f16441E;
                    fVar.f16493b = 0;
                    int c4 = fVar.c();
                    int i = (-1073741825) & c4;
                    boolean b9 = com.anythink.core.common.s.a.a.b(c4);
                    long d2 = this.f16441E.d();
                    this.f16438B = d2;
                    this.f16437A = i + 12;
                    if (d2 != this.f16441E.b(12, i) || !a(b9)) {
                        A();
                    }
                }
                return false;
            }
            e(this.ae.capacity());
            this.ae.putInt(0, a9);
            this.ae.putLong(4, this.f16438B);
            for (int i4 = 0; i4 < this.ah; i4 += 2) {
                int[] iArr = this.ag;
                int i9 = iArr[i4];
                int i10 = iArr[i4 + 1];
                byte[] bArr = this.f16441E.f16492a;
                this.ae.position(i9);
                this.ae.put(bArr, i9, i10);
            }
            if (this.f16437A + 8 < this.ae.capacity()) {
                long nextLong = f16517W.nextLong() ^ System.nanoTime();
                this.ai = nextLong;
                this.ae.putLong(this.f16437A, nextLong);
            }
            b(0, 12);
            for (int i11 = 0; i11 < this.ah; i11 += 2) {
                int[] iArr2 = this.ag;
                b(iArr2[i11], iArr2[i11 + 1]);
            }
            if (!this.f16444H.isEmpty()) {
                Iterator<String> it = this.f16444H.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            int length = this.f16441E.f16492a.length;
            int i12 = this.f16437A;
            if (length - i12 > com.anythink.core.common.s.a.a.f16434s) {
                int i13 = com.anythink.core.common.s.a.a.f16433r;
                int a10 = com.anythink.core.common.s.a.a.a(i13, i12 + i13);
                byte[] bArr2 = this.f16441E.f16492a;
                if (a10 < bArr2.length) {
                    byte[] bArr3 = new byte[a10];
                    System.arraycopy(bArr2, 0, bArr3, 0, this.f16437A);
                    this.f16441E.f16492a = bArr3;
                    try {
                        long j9 = a10;
                        this.ac.truncate(j9);
                        MappedByteBuffer map = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, j9);
                        this.ae = map;
                        map.order(ByteOrder.LITTLE_ENDIAN);
                        this.ab.setLength(j9);
                        this.ad.truncate(j9);
                    } catch (Exception e6) {
                        a(new Exception("map failed", e6));
                        this.aj = true;
                    }
                    c("truncate finish");
                }
            }
            this.ah = 0;
            if (!this.f16444H.isEmpty()) {
                this.f16444H.clear();
            }
            v();
            w();
            r();
            return true;
        } catch (Throwable th) {
            try {
                if (th instanceof Exception) {
                    a(th);
                }
                this.aj = true;
                this.ah = 0;
                if (!this.f16444H.isEmpty()) {
                    this.f16444H.clear();
                }
                v();
                w();
                r();
                return false;
            } finally {
                this.ah = 0;
                if (!this.f16444H.isEmpty()) {
                    this.f16444H.clear();
                }
                v();
                w();
                r();
            }
        }
    }

    private void v() {
        while (this.f16449N.a()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
    }

    private synchronized void w() {
        FileLock fileLock = this.af;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Exception e6) {
                a(e6);
            }
            this.af = null;
            this.an.removeMessages(2);
        }
    }

    private void x() {
        if (this.ae == null) {
            return;
        }
        y();
        m();
        f fVar = this.f16441E;
        fVar.f16493b = 0;
        int c4 = fVar.c();
        int i = (-1073741825) & c4;
        boolean b9 = com.anythink.core.common.s.a.a.b(c4);
        long d2 = this.f16441E.d();
        this.f16438B = d2;
        this.f16437A = i + 12;
        if (d2 == this.f16441E.b(12, i) && a(b9)) {
            return;
        }
        A();
    }

    private void y() {
        this.f16439C.clear();
        e();
        int capacity = this.ae.capacity();
        f fVar = this.f16441E;
        if (fVar == null) {
            this.f16441E = new f(capacity);
        } else if (fVar.f16492a.length != capacity) {
            fVar.f16492a = new byte[capacity];
        }
        this.ae.rewind();
        this.ae.get(this.f16441E.f16492a, 0, this.f16437A);
    }

    private void z() {
        File file;
        MappedByteBuffer mappedByteBuffer = this.ae;
        if (mappedByteBuffer == null || (file = this.Y) == null) {
            return;
        }
        int length = (int) file.length();
        if (length <= 0) {
            b("invalid file length");
            return;
        }
        if (this.ae.capacity() != length) {
            long j9 = length;
            this.ac.truncate(j9);
            mappedByteBuffer = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, j9);
            if (mappedByteBuffer == null) {
                return;
            }
            this.ae = mappedByteBuffer;
            mappedByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        long j10 = length;
        if (this.ad.size() != j10) {
            this.ad.truncate(j10);
        }
        int capacity = mappedByteBuffer.capacity();
        int i = mappedByteBuffer.getInt(0);
        int i4 = (-1073741825) & i;
        boolean b9 = com.anythink.core.common.s.a.a.b(i);
        if (i4 < 0 || i4 > capacity) {
            throw new IllegalStateException(AbstractC5051n.c(i4, capacity, "Invalid file, dataSize:", ", capacity:"));
        }
        long j11 = mappedByteBuffer.getLong(4);
        int i9 = i4 + 12;
        long j12 = this.ai;
        if (i9 < mappedByteBuffer.capacity() - 8) {
            j12 = mappedByteBuffer.getLong(i9);
        }
        if (i9 == this.f16437A && j11 == this.f16438B && j12 == this.ai) {
            return;
        }
        this.f16437A = i9;
        this.f16438B = j11;
        this.ai = j12;
        HashMap<String, b.AbstractC0097b> hashMap = this.f16453R.isEmpty() ? null : new HashMap<>(this.f16439C);
        y();
        if (j11 != this.f16441E.b(12, i4) || !a(b9)) {
            A();
        } else if (hashMap != null) {
            a(hashMap);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f16450O.execute(new p(this, 1));
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        g();
        A();
        w();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return u();
    }

    @Override // com.anythink.core.common.s.a.a
    public final void d() {
        super.d();
        this.ai = 0L;
    }

    @Override // com.anythink.core.common.s.a.a
    public final void f(String str) {
        if (this.f16453R.isEmpty()) {
            return;
        }
        this.am.add(str);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void g() {
        if (this.af != null) {
            return;
        }
        if (this.ad == null) {
            l();
            k();
        }
        FileChannel fileChannel = this.ad;
        if (fileChannel != null) {
            try {
                this.af = fileChannel.lock();
                try {
                    z();
                } finally {
                    this.an.sendEmptyMessageDelayed(2, com.anythink.expressad.video.module.a.a.m.ai);
                }
            } catch (Exception e6) {
                a(e6);
            }
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void h() {
        if (this.f16451P >= f() || this.f16452Q.size() >= 80) {
            c(0);
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void i() {
        this.f16438B ^= this.f16441E.b(this.f16442F, this.f16443G);
        int i = this.f16443G;
        if (i != 0) {
            d(this.f16442F, i);
            this.f16443G = 0;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            g();
            f(str);
            b.AbstractC0097b abstractC0097b = this.f16439C.get(str);
            if (abstractC0097b != null) {
                this.f16439C.remove(str);
                this.f16448M.b(str);
                this.f16447L.b(str);
                byte a9 = abstractC0097b.a();
                String str2 = null;
                if (a9 <= 5) {
                    int b9 = f.b(str);
                    int i = abstractC0097b.f16463a;
                    a(a9, i - (b9 + 2), i + com.anythink.core.common.s.a.a.f16431o[a9]);
                } else {
                    b.j jVar = (b.j) abstractC0097b;
                    a(a9, jVar.f16471d, jVar.f16463a + jVar.f16472e);
                    if (jVar.f16473f) {
                        str2 = (String) jVar.f16470c;
                    }
                }
                if (str2 != null) {
                    this.f16444H.add(str2);
                }
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "MPFastKV: path:" + this.f16456v + " name:" + this.f16457w;
    }

    private void b(int i, int i4) {
        MappedByteBuffer mappedByteBuffer = this.ae;
        mappedByteBuffer.position(i);
        mappedByteBuffer.limit(i4 + i);
        if (this.ad.size() != mappedByteBuffer.capacity()) {
            this.ad.truncate(mappedByteBuffer.capacity());
        }
        this.ad.position(i);
        while (mappedByteBuffer.hasRemaining()) {
            this.ad.write(mappedByteBuffer);
        }
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void c(int i, int i4) {
        byte[] bArr = this.f16441E.f16492a;
        this.ae.position(i);
        this.ae.put(bArr, i, i4);
    }

    private synchronized void r() {
        try {
            if (!this.am.isEmpty()) {
                Iterator<String> it = this.am.iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                this.am.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(g gVar) {
        a(gVar.f16441E);
    }

    private boolean a(f fVar) {
        int length = fVar.f16492a.length;
        try {
            if (l.a(this.Y) && l.a(this.f16519Z)) {
                if (this.ab == null) {
                    this.ab = new RandomAccessFile(this.f16519Z, "rw");
                }
                if (this.ad == null) {
                    this.ad = this.ab.getChannel();
                }
                FileLock lock = this.af == null ? this.ad.lock() : null;
                try {
                    p();
                    this.ae.put(fVar.f16492a, 0, this.f16437A);
                    m();
                    long j9 = length;
                    if (this.ab.length() != j9) {
                        this.ab.setLength(j9);
                    }
                    this.ad.truncate(j9);
                    b(0, this.f16437A);
                    this.ad.force(false);
                    if (lock != null) {
                        lock.release();
                    }
                    k();
                    return true;
                } catch (Throwable th) {
                    if (lock != null) {
                        lock.release();
                    }
                    throw th;
                }
            }
            throw new Exception("open file failed");
        } catch (Exception e6) {
            a(e6);
            return false;
        }
    }

    private void d(int i, int i4) {
        int i9 = this.ah;
        int[] iArr = this.ag;
        int length = iArr.length;
        if ((i9 << 1) >= length) {
            int[] iArr2 = new int[length << 1];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.ag = iArr2;
        }
        int[] iArr3 = this.ag;
        iArr3[i9] = i;
        iArr3[i9 + 1] = i4;
        this.ah = i9 + 2;
    }

    @Override // com.anythink.core.common.s.a.a
    public final void d(int i) {
        int length = this.f16441E.f16492a.length;
        int i4 = this.f16437A + i + 8;
        if (i4 >= length) {
            byte[] bArr = new byte[com.anythink.core.common.s.a.a.a(length, i4)];
            System.arraycopy(this.f16441E.f16492a, 0, bArr, 0, this.f16437A);
            this.f16441E.f16492a = bArr;
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void g(String str) {
        this.f16444H.add(str);
    }

    private void a(HashMap<String, b.AbstractC0097b> hashMap) {
        HashSet hashSet = new HashSet(this.f16439C.keySet());
        HashSet hashSet2 = new HashSet(hashMap.keySet());
        HashSet hashSet3 = new HashSet(hashSet);
        hashSet3.retainAll(hashSet2);
        hashSet.removeAll(hashSet3);
        hashSet2.removeAll(hashSet3);
        this.am.addAll(hashSet);
        this.am.addAll(hashSet2);
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            b.AbstractC0097b abstractC0097b = hashMap.get(str);
            b.AbstractC0097b abstractC0097b2 = this.f16439C.get(str);
            if (abstractC0097b != null && !abstractC0097b.a(abstractC0097b2)) {
                this.am.add(str);
            }
        }
        if (this.am.isEmpty()) {
            return;
        }
        r();
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(byte b9, int i) {
        this.f16438B ^= com.anythink.core.common.s.a.a.a(1L, i);
        this.f16441E.f16492a[i] = b9;
        d(i, 1);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, long j9, int i4) {
        this.f16438B = com.anythink.core.common.s.a.a.a(j9, i4) ^ this.f16438B;
        this.f16441E.a(i4, i);
        d(i4, 4);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(long j9, long j10, int i) {
        this.f16438B = com.anythink.core.common.s.a.a.a(j10, i) ^ this.f16438B;
        this.f16441E.a(i, j9);
        d(i, 8);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, byte[] bArr) {
        super.a(i, bArr);
        d(i, bArr.length);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(byte b9, int i, int i4) {
        super.a(b9, i, i4);
        d(i, 1);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, int i4, int i9) {
        for (int i10 = 0; i10 < this.ah; i10 += 2) {
            int i11 = this.ag[i10];
            if (i11 < i) {
                i = i11;
            }
        }
        int[] iArr = this.ag;
        iArr[0] = i;
        iArr[1] = this.f16437A - i;
        this.ah = 2;
    }
}
