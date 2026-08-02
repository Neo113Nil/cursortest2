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
import com.icefishingapp.icefishing.AbstractC4404f;
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

/* loaded from: classes.dex */
public final class j extends com.anythink.core.common.s.a.a {

    /* renamed from: S, reason: collision with root package name */
    private static final String f16355S = "j";

    /* renamed from: T, reason: collision with root package name */
    private static final int f16356T = 1;

    /* renamed from: U, reason: collision with root package name */
    private static final int f16357U = 2;

    /* renamed from: V, reason: collision with root package name */
    private static final int f16358V = 3000;

    /* renamed from: W, reason: collision with root package name */
    private static final Random f16359W = new Random();

    /* renamed from: X, reason: collision with root package name */
    private final boolean f16360X;
    private final File Y;

    /* renamed from: Z, reason: collision with root package name */
    private final File f16361Z;
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
        private static final Map<String, j> f16363a = new ConcurrentHashMap();

        /* renamed from: b, reason: collision with root package name */
        private String f16364b;

        /* renamed from: c, reason: collision with root package name */
        private String f16365c;

        /* renamed from: d, reason: collision with root package name */
        private com.anythink.core.common.s.a.a.b[] f16366d;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.core.common.s.a.a.a f16367e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16368f = false;

        public a(Context context, String str) {
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f16364b = context.getFilesDir().getAbsolutePath() + "/tktp/";
            this.f16365c = str;
        }

        private a a(com.anythink.core.common.s.a.a.b[] bVarArr) {
            this.f16366d = bVarArr;
            return this;
        }

        public final j b() {
            j jVar;
            String str = this.f16364b + this.f16365c;
            Map<String, j> map = f16363a;
            j jVar2 = map.get(str);
            if (jVar2 != null) {
                return jVar2;
            }
            synchronized (a.class) {
                try {
                    jVar = map.get(str);
                    if (jVar == null) {
                        j jVar3 = new j(this.f16364b, this.f16365c, this.f16366d, this.f16367e, this.f16368f);
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
            this.f16367e = aVar;
            return this;
        }

        public final a a() {
            this.f16368f = false;
            return this;
        }

        private a(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.f16364b = str.endsWith("/") ? str : str.concat("/");
            this.f16365c = str2;
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

    public j(String str, String str2, com.anythink.core.common.s.a.a.b[] bVarArr, com.anythink.core.common.s.a.a.a aVar, boolean z3) {
        super(str, str2, bVarArr, aVar);
        this.ag = new int[16];
        this.ah = 0;
        this.aj = false;
        this.ak = new i();
        this.am = new HashSet();
        this.an = new AnonymousClass1(Looper.getMainLooper());
        this.Y = new File(str, AbstractC4404f.f(str2, ".kva"));
        this.f16361Z = new File(str, AbstractC4404f.f(str2, ".kvb"));
        this.f16360X = z3;
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
            if (l.a(this.f16361Z)) {
                e(com.anythink.core.common.s.a.a.f16275r);
                b(0, 12);
                k();
            }
        } catch (Exception e9) {
            a(e9);
            this.aj = true;
        }
        l.c(new File(this.f16298v + this.f16299w));
        e((String) null);
    }

    private void B() {
        int i = com.anythink.core.common.s.a.a.f16275r;
        int a9 = com.anythink.core.common.s.a.a.a(i, this.f16279A + i);
        byte[] bArr = this.f16283E.f16334a;
        if (a9 >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[a9];
        System.arraycopy(bArr, 0, bArr2, 0, this.f16279A);
        this.f16283E.f16334a = bArr2;
        try {
            long j6 = a9;
            this.ac.truncate(j6);
            MappedByteBuffer map = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, j6);
            this.ae = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            this.ab.setLength(j6);
            this.ad.truncate(j6);
        } catch (Exception e9) {
            a(new Exception("map failed", e9));
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
            this.ab = new RandomAccessFile(this.f16361Z, "rw");
        }
        if (this.ad == null) {
            this.ad = this.ab.getChannel();
        }
        long j6 = i;
        if (this.ad.size() != j6) {
            this.ab.setLength(j6);
            this.ad.truncate(j6);
        }
    }

    private synchronized void j() {
        try {
            long nanoTime = System.nanoTime();
            if (!q()) {
                l();
            }
            if (this.f16283E == null) {
                this.f16283E = new f(com.anythink.core.common.s.a.a.f16275r);
            }
            if (this.f16279A == 0) {
                this.f16279A = 12;
            }
            if (this.f16287I) {
                a();
                c("rewrite data");
            }
            if (this.f16301y != null) {
                c("loading finish, data len:" + this.f16279A + ", get keys:" + this.f16281C.size() + ", use time:" + ((System.nanoTime() - nanoTime) / 1000000) + " ms");
            }
            k();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void k() {
        File file;
        if (this.f16360X && this.al == null && (file = this.f16361Z) != null && file.exists()) {
            this.al = new b(this.f16361Z.getPath());
            this.al.startWatching();
        }
    }

    private void l() {
        int i;
        int i6 = 0;
        int i9 = 0;
        while (true) {
            try {
                if (l.a(this.Y) && l.a(this.f16361Z)) {
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
        if (this.Y.exists() && this.f16361Z.exists()) {
            this.aa = new RandomAccessFile(this.Y, "rw");
            this.ab = new RandomAccessFile(this.f16361Z, "rw");
            long length = this.aa.length();
            long length2 = this.ab.length();
            this.ac = this.aa.getChannel();
            FileChannel channel = this.ab.getChannel();
            this.ad = channel;
            FileLock lock = channel.lock();
            try {
                try {
                    MappedByteBuffer map = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, length > 0 ? length : com.anythink.core.common.s.a.a.f16275r);
                    this.ae = map;
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    if (length == 0 && length2 == 0) {
                        this.f16279A = 12;
                        RandomAccessFile randomAccessFile = this.ab;
                        int i10 = com.anythink.core.common.s.a.a.f16275r;
                        randomAccessFile.setLength(i10);
                        this.ad.truncate(i10);
                    } else if (a(this.f16361Z)) {
                        if (length == length2 && this.f16283E.f16334a.length == this.ae.capacity()) {
                            byte[] bArr = this.f16283E.f16334a;
                            int i11 = this.f16279A;
                            byte[] bArr2 = new byte[i11];
                            this.ae.get(bArr2, 0, i11);
                            while (true) {
                                i = this.f16279A;
                                if (i6 >= i || bArr2[i6] != bArr[i6]) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            if (i6 == i) {
                            }
                        }
                        b(new Exception("A file error"));
                        o();
                    } else {
                        this.ah = 0;
                        d();
                        f fVar = this.f16283E;
                        if (fVar == null || fVar.f16334a.length != this.ae.capacity()) {
                            this.f16283E = new f(this.ae.capacity());
                        }
                        int i12 = this.ae.getInt();
                        int i13 = (-1073741825) & i12;
                        boolean b9 = com.anythink.core.common.s.a.a.b(i12);
                        if (i13 >= 0 && i13 <= length - 12) {
                            this.f16279A = i13 + 12;
                            long j6 = this.ae.getLong(4);
                            this.ae.rewind();
                            this.ae.get(this.f16283E.f16334a, 0, this.f16279A);
                            if (j6 == this.f16283E.b(12, i13) && a(b9)) {
                                this.f16280B = j6;
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
                } catch (IOException e9) {
                    a(e9);
                    a(this.Y, this.f16361Z);
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
        if (mappedByteBuffer == null || this.f16279A + 8 >= mappedByteBuffer.capacity()) {
            return;
        }
        this.ai = this.ae.getLong(this.f16279A);
    }

    private void n() {
        try {
            if (l.a(this.f16361Z)) {
                e(this.ae.capacity());
                b(0, this.f16279A);
            }
        } catch (Exception e9) {
            a(e9);
        }
    }

    private void o() {
        try {
            if (p()) {
                this.ae.position(0);
                this.ae.put(this.f16283E.f16334a, 0, this.f16279A);
            }
        } catch (Exception e9) {
            a(e9);
        }
    }

    private boolean p() {
        int length = this.f16283E.f16334a.length;
        try {
            if (this.aa == null) {
                if (!l.a(this.Y)) {
                    return false;
                }
                this.aa = new RandomAccessFile(this.Y, "rw");
            }
            long j6 = length;
            if (this.aa.length() != j6) {
                this.aa.setLength(j6);
            }
            FileChannel fileChannel = this.ac;
            if (fileChannel == null) {
                this.ac = this.aa.getChannel();
            } else if (fileChannel.size() != j6) {
                this.ac.truncate(j6);
            }
            MappedByteBuffer mappedByteBuffer = this.ae;
            if (mappedByteBuffer != null && mappedByteBuffer.capacity() == length) {
                return true;
            }
            MappedByteBuffer map = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, j6);
            this.ae = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            return true;
        } catch (Exception e9) {
            a(e9);
            return false;
        }
    }

    private boolean q() {
        File file = new File(this.f16298v, u1.h.g(new StringBuilder(), this.f16299w, ".kvc"));
        File file2 = new File(this.f16298v, u1.h.g(new StringBuilder(), this.f16299w, ".tmp"));
        boolean z3 = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!a(file)) {
                    c();
                } else if (a(this.f16283E)) {
                    c("recover from c file");
                    z3 = true;
                }
                b();
            }
            return z3;
        } catch (Exception e9) {
            a(e9);
            return z3;
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
            } catch (Exception e9) {
                a(e9);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean t() {
        f fVar = this.f16283E;
        fVar.f16335b = 0;
        int c9 = fVar.c() & (-1073741825);
        long d2 = this.f16283E.d();
        this.f16280B = d2;
        this.f16279A = c9 + 12;
        if (d2 == this.f16283E.b(12, c9)) {
            return a(this.f16283E);
        }
        A();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean u() {
        if (this.af == null) {
            return false;
        }
        if (this.f16283E == null || (this.ah == 0 && !this.aj)) {
            w();
            return false;
        }
        try {
            int a9 = a(this.f16279A - 12);
            this.f16283E.a(0, a9);
            this.f16283E.a(4, this.f16280B);
            if (this.aj) {
                boolean t6 = t();
                if (t6) {
                    this.aj = false;
                }
                this.ah = 0;
                if (!this.f16286H.isEmpty()) {
                    this.f16286H.clear();
                }
                v();
                w();
                r();
                return t6;
            }
            if (!p()) {
                MappedByteBuffer mappedByteBuffer = this.ae;
                if (mappedByteBuffer == null) {
                    this.aj = true;
                } else if (mappedByteBuffer != null) {
                    y();
                    m();
                    f fVar = this.f16283E;
                    fVar.f16335b = 0;
                    int c9 = fVar.c();
                    int i = (-1073741825) & c9;
                    boolean b9 = com.anythink.core.common.s.a.a.b(c9);
                    long d2 = this.f16283E.d();
                    this.f16280B = d2;
                    this.f16279A = i + 12;
                    if (d2 != this.f16283E.b(12, i) || !a(b9)) {
                        A();
                    }
                }
                return false;
            }
            e(this.ae.capacity());
            this.ae.putInt(0, a9);
            this.ae.putLong(4, this.f16280B);
            for (int i6 = 0; i6 < this.ah; i6 += 2) {
                int[] iArr = this.ag;
                int i9 = iArr[i6];
                int i10 = iArr[i6 + 1];
                byte[] bArr = this.f16283E.f16334a;
                this.ae.position(i9);
                this.ae.put(bArr, i9, i10);
            }
            if (this.f16279A + 8 < this.ae.capacity()) {
                long nextLong = f16359W.nextLong() ^ System.nanoTime();
                this.ai = nextLong;
                this.ae.putLong(this.f16279A, nextLong);
            }
            b(0, 12);
            for (int i11 = 0; i11 < this.ah; i11 += 2) {
                int[] iArr2 = this.ag;
                b(iArr2[i11], iArr2[i11 + 1]);
            }
            if (!this.f16286H.isEmpty()) {
                Iterator<String> it = this.f16286H.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            int length = this.f16283E.f16334a.length;
            int i12 = this.f16279A;
            if (length - i12 > com.anythink.core.common.s.a.a.f16276s) {
                int i13 = com.anythink.core.common.s.a.a.f16275r;
                int a10 = com.anythink.core.common.s.a.a.a(i13, i12 + i13);
                byte[] bArr2 = this.f16283E.f16334a;
                if (a10 < bArr2.length) {
                    byte[] bArr3 = new byte[a10];
                    System.arraycopy(bArr2, 0, bArr3, 0, this.f16279A);
                    this.f16283E.f16334a = bArr3;
                    try {
                        long j6 = a10;
                        this.ac.truncate(j6);
                        MappedByteBuffer map = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, j6);
                        this.ae = map;
                        map.order(ByteOrder.LITTLE_ENDIAN);
                        this.ab.setLength(j6);
                        this.ad.truncate(j6);
                    } catch (Exception e9) {
                        a(new Exception("map failed", e9));
                        this.aj = true;
                    }
                    c("truncate finish");
                }
            }
            this.ah = 0;
            if (!this.f16286H.isEmpty()) {
                this.f16286H.clear();
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
                if (!this.f16286H.isEmpty()) {
                    this.f16286H.clear();
                }
                v();
                w();
                r();
                return false;
            } finally {
                this.ah = 0;
                if (!this.f16286H.isEmpty()) {
                    this.f16286H.clear();
                }
                v();
                w();
                r();
            }
        }
    }

    private void v() {
        while (this.f16291N.a()) {
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
            } catch (Exception e9) {
                a(e9);
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
        f fVar = this.f16283E;
        fVar.f16335b = 0;
        int c9 = fVar.c();
        int i = (-1073741825) & c9;
        boolean b9 = com.anythink.core.common.s.a.a.b(c9);
        long d2 = this.f16283E.d();
        this.f16280B = d2;
        this.f16279A = i + 12;
        if (d2 == this.f16283E.b(12, i) && a(b9)) {
            return;
        }
        A();
    }

    private void y() {
        this.f16281C.clear();
        e();
        int capacity = this.ae.capacity();
        f fVar = this.f16283E;
        if (fVar == null) {
            this.f16283E = new f(capacity);
        } else if (fVar.f16334a.length != capacity) {
            fVar.f16334a = new byte[capacity];
        }
        this.ae.rewind();
        this.ae.get(this.f16283E.f16334a, 0, this.f16279A);
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
            long j6 = length;
            this.ac.truncate(j6);
            mappedByteBuffer = this.ac.map(FileChannel.MapMode.READ_WRITE, 0L, j6);
            if (mappedByteBuffer == null) {
                return;
            }
            this.ae = mappedByteBuffer;
            mappedByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        long j9 = length;
        if (this.ad.size() != j9) {
            this.ad.truncate(j9);
        }
        int capacity = mappedByteBuffer.capacity();
        int i = mappedByteBuffer.getInt(0);
        int i6 = (-1073741825) & i;
        boolean b9 = com.anythink.core.common.s.a.a.b(i);
        if (i6 < 0 || i6 > capacity) {
            throw new IllegalStateException(u1.h.c(i6, capacity, "Invalid file, dataSize:", ", capacity:"));
        }
        long j10 = mappedByteBuffer.getLong(4);
        int i9 = i6 + 12;
        long j11 = this.ai;
        if (i9 < mappedByteBuffer.capacity() - 8) {
            j11 = mappedByteBuffer.getLong(i9);
        }
        if (i9 == this.f16279A && j10 == this.f16280B && j11 == this.ai) {
            return;
        }
        this.f16279A = i9;
        this.f16280B = j10;
        this.ai = j11;
        HashMap<String, b.AbstractC0098b> hashMap = this.f16295R.isEmpty() ? null : new HashMap<>(this.f16281C);
        y();
        if (j10 != this.f16283E.b(12, i6) || !a(b9)) {
            A();
        } else if (hashMap != null) {
            a(hashMap);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f16292O.execute(new p(this, 1));
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
        if (this.f16295R.isEmpty()) {
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
            } catch (Exception e9) {
                a(e9);
            }
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void h() {
        if (this.f16293P >= f() || this.f16294Q.size() >= 80) {
            c(0);
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void i() {
        this.f16280B ^= this.f16283E.b(this.f16284F, this.f16285G);
        int i = this.f16285G;
        if (i != 0) {
            d(this.f16284F, i);
            this.f16285G = 0;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor remove(String str) {
        try {
            g();
            f(str);
            b.AbstractC0098b abstractC0098b = this.f16281C.get(str);
            if (abstractC0098b != null) {
                this.f16281C.remove(str);
                this.f16290M.b(str);
                this.f16289L.b(str);
                byte a9 = abstractC0098b.a();
                String str2 = null;
                if (a9 <= 5) {
                    int b9 = f.b(str);
                    int i = abstractC0098b.f16305a;
                    a(a9, i - (b9 + 2), i + com.anythink.core.common.s.a.a.f16273o[a9]);
                } else {
                    b.j jVar = (b.j) abstractC0098b;
                    a(a9, jVar.f16313d, jVar.f16305a + jVar.f16314e);
                    if (jVar.f16315f) {
                        str2 = (String) jVar.f16312c;
                    }
                }
                if (str2 != null) {
                    this.f16286H.add(str2);
                }
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final String toString() {
        return "MPFastKV: path:" + this.f16298v + " name:" + this.f16299w;
    }

    private void b(int i, int i6) {
        MappedByteBuffer mappedByteBuffer = this.ae;
        mappedByteBuffer.position(i);
        mappedByteBuffer.limit(i6 + i);
        if (this.ad.size() != mappedByteBuffer.capacity()) {
            this.ad.truncate(mappedByteBuffer.capacity());
        }
        this.ad.position(i);
        while (mappedByteBuffer.hasRemaining()) {
            this.ad.write(mappedByteBuffer);
        }
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void c(int i, int i6) {
        byte[] bArr = this.f16283E.f16334a;
        this.ae.position(i);
        this.ae.put(bArr, i, i6);
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
        a(gVar.f16283E);
    }

    private boolean a(f fVar) {
        int length = fVar.f16334a.length;
        try {
            if (l.a(this.Y) && l.a(this.f16361Z)) {
                if (this.ab == null) {
                    this.ab = new RandomAccessFile(this.f16361Z, "rw");
                }
                if (this.ad == null) {
                    this.ad = this.ab.getChannel();
                }
                FileLock lock = this.af == null ? this.ad.lock() : null;
                try {
                    p();
                    this.ae.put(fVar.f16334a, 0, this.f16279A);
                    m();
                    long j6 = length;
                    if (this.ab.length() != j6) {
                        this.ab.setLength(j6);
                    }
                    this.ad.truncate(j6);
                    b(0, this.f16279A);
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
        } catch (Exception e9) {
            a(e9);
            return false;
        }
    }

    private void d(int i, int i6) {
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
        iArr3[i9 + 1] = i6;
        this.ah = i9 + 2;
    }

    @Override // com.anythink.core.common.s.a.a
    public final void d(int i) {
        int length = this.f16283E.f16334a.length;
        int i6 = this.f16279A + i + 8;
        if (i6 >= length) {
            byte[] bArr = new byte[com.anythink.core.common.s.a.a.a(length, i6)];
            System.arraycopy(this.f16283E.f16334a, 0, bArr, 0, this.f16279A);
            this.f16283E.f16334a = bArr;
        }
    }

    @Override // com.anythink.core.common.s.a.a
    public final void g(String str) {
        this.f16286H.add(str);
    }

    private void a(HashMap<String, b.AbstractC0098b> hashMap) {
        HashSet hashSet = new HashSet(this.f16281C.keySet());
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
            b.AbstractC0098b abstractC0098b = hashMap.get(str);
            b.AbstractC0098b abstractC0098b2 = this.f16281C.get(str);
            if (abstractC0098b != null && !abstractC0098b.a(abstractC0098b2)) {
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
        this.f16280B ^= com.anythink.core.common.s.a.a.a(1L, i);
        this.f16283E.f16334a[i] = b9;
        d(i, 1);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, long j6, int i6) {
        this.f16280B = com.anythink.core.common.s.a.a.a(j6, i6) ^ this.f16280B;
        this.f16283E.a(i6, i);
        d(i6, 4);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(long j6, long j9, int i) {
        this.f16280B = com.anythink.core.common.s.a.a.a(j9, i) ^ this.f16280B;
        this.f16283E.a(i, j6);
        d(i, 8);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, byte[] bArr) {
        super.a(i, bArr);
        d(i, bArr.length);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(byte b9, int i, int i6) {
        super.a(b9, i, i6);
        d(i, 1);
    }

    @Override // com.anythink.core.common.s.a.a
    public final void a(int i, int i6, int i9) {
        for (int i10 = 0; i10 < this.ah; i10 += 2) {
            int i11 = this.ag[i10];
            if (i11 < i) {
                i = i11;
            }
        }
        int[] iArr = this.ag;
        iArr[0] = i;
        iArr[1] = this.f16279A - i;
        this.ah = 2;
    }
}
