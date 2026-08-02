package defpackage;

import android.os.Looper;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class om3 {
    public static final PriorityQueue d = new PriorityQueue(8, new C1318t(27));
    public static final int e = 1048576;
    public static final int f = SQLiteDatabase.OPEN_PRIVATECACHE;
    public static int g = 0;
    public static int h = 0;
    public static final Object i = new Object();
    public static final ByteBuffer j = ByteBuffer.allocate(0);
    public final ay0 a = new ay0();
    public ByteOrder b = ByteOrder.BIG_ENDIAN;
    public int c = 0;

    public om3(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
    }

    public static ByteBuffer j(int i2) {
        if (i2 <= h) {
            Looper mainLooper = Looper.getMainLooper();
            PriorityQueue priorityQueue = (mainLooper == null || Thread.currentThread() != mainLooper.getThread()) ? d : null;
            if (priorityQueue != null) {
                synchronized (i) {
                    while (priorityQueue.size() > 0) {
                        try {
                            ByteBuffer byteBuffer = (ByteBuffer) priorityQueue.remove();
                            if (priorityQueue.size() == 0) {
                                h = 0;
                            }
                            g -= byteBuffer.capacity();
                            if (byteBuffer.capacity() >= i2) {
                                return byteBuffer;
                            }
                        } finally {
                        }
                    }
                }
            }
        }
        return ByteBuffer.allocate(Math.max(RemoteCameraConfig.Notification.ID, i2));
    }

    public static void m(ByteBuffer byteBuffer) {
        int i2;
        if (byteBuffer == null || byteBuffer.isDirect() || byteBuffer.arrayOffset() != 0 || byteBuffer.array().length != byteBuffer.capacity() || byteBuffer.capacity() < 8192 || byteBuffer.capacity() > f) {
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        PriorityQueue priorityQueue = (mainLooper == null || Thread.currentThread() != mainLooper.getThread()) ? d : null;
        if (priorityQueue == null) {
            return;
        }
        synchronized (i) {
            while (true) {
                try {
                    int i3 = g;
                    i2 = e;
                    if (i3 <= i2 || priorityQueue.size() <= 0 || ((ByteBuffer) priorityQueue.peek()).capacity() >= byteBuffer.capacity()) {
                        break;
                    } else {
                        g -= ((ByteBuffer) priorityQueue.remove()).capacity();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (g > i2) {
                return;
            }
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            g += byteBuffer.capacity();
            priorityQueue.add(byteBuffer);
            h = Math.max(h, byteBuffer.capacity());
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 0) {
            m(byteBuffer);
            return;
        }
        int remaining = byteBuffer.remaining();
        int i2 = this.c;
        if (i2 >= 0) {
            this.c = i2 + remaining;
        }
        ay0 ay0Var = this.a;
        if (ay0Var.size() > 0) {
            Object obj = ay0Var.a[(ay0Var.c - 1) & (r1.length - 1)];
            if (obj == null) {
                wvs.n();
                return;
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) obj;
            if (byteBuffer2.capacity() - byteBuffer2.limit() >= byteBuffer.remaining()) {
                byteBuffer2.mark();
                byteBuffer2.position(byteBuffer2.limit());
                byteBuffer2.limit(byteBuffer2.capacity());
                byteBuffer2.put(byteBuffer);
                byteBuffer2.limit(byteBuffer2.position());
                byteBuffer2.reset();
                m(byteBuffer);
                k(0);
                return;
            }
        }
        ay0Var.addLast(byteBuffer);
        k(0);
    }

    public final void b(ByteBuffer... byteBufferArr) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            a(byteBuffer);
        }
    }

    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 0) {
            m(byteBuffer);
            return;
        }
        int remaining = byteBuffer.remaining();
        int i2 = this.c;
        if (i2 >= 0) {
            this.c = i2 + remaining;
        }
        ay0 ay0Var = this.a;
        if (ay0Var.size() > 0) {
            Object obj = ay0Var.a[ay0Var.b];
            if (obj == null) {
                wvs.n();
                return;
            }
            ByteBuffer byteBuffer2 = (ByteBuffer) obj;
            if (byteBuffer2.position() >= byteBuffer.remaining()) {
                byteBuffer2.position(byteBuffer2.position() - byteBuffer.remaining());
                byteBuffer2.mark();
                byteBuffer2.put(byteBuffer);
                byteBuffer2.reset();
                m(byteBuffer);
                return;
            }
        }
        ay0Var.addFirst(byteBuffer);
    }

    public final byte d() {
        byte b = k(1).get();
        this.c--;
        return b;
    }

    public final void e(int i2, byte[] bArr) {
        if (this.c < i2) {
            xq0.x("length");
            return;
        }
        int i3 = 0;
        int i4 = i2;
        while (i4 > 0) {
            ay0 ay0Var = this.a;
            ByteBuffer byteBuffer = (ByteBuffer) ay0Var.peek();
            int min = Math.min(byteBuffer.remaining(), i4);
            if (bArr != null) {
                byteBuffer.get(bArr, i3, min);
            } else {
                byteBuffer.position(byteBuffer.position() + min);
            }
            i4 -= min;
            i3 += min;
            if (byteBuffer.remaining() == 0) {
                m(byteBuffer);
            }
        }
        this.c -= i2;
    }

    public final void f(om3 om3Var) {
        g(om3Var, this.c);
    }

    public final void g(om3 om3Var, int i2) {
        if (this.c < i2) {
            xq0.x("length");
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            ay0 ay0Var = this.a;
            ByteBuffer byteBuffer = (ByteBuffer) ay0Var.removeFirst();
            int remaining = byteBuffer.remaining();
            if (remaining == 0) {
                m(byteBuffer);
            } else {
                int i4 = remaining + i3;
                if (i4 > i2) {
                    int i5 = i2 - i3;
                    ByteBuffer j2 = j(i5);
                    j2.limit(i5);
                    byteBuffer.get(j2.array(), 0, i5);
                    om3Var.a(j2);
                    ay0Var.addFirst(byteBuffer);
                    break;
                }
                om3Var.a(byteBuffer);
                i3 = i4;
            }
        }
        this.c -= i2;
    }

    public final char h() {
        char c = (char) k(1).get();
        this.c--;
        return c;
    }

    public final boolean i() {
        return this.c > 0;
    }

    public final ByteBuffer k(int i2) {
        ByteBuffer byteBuffer;
        if (this.c < i2) {
            xq0.j(this.c, i2, "/", "count : ");
            return null;
        }
        ay0 ay0Var = this.a;
        ByteBuffer byteBuffer2 = (ByteBuffer) ay0Var.peek();
        while (byteBuffer2 != null && !byteBuffer2.hasRemaining()) {
            m((ByteBuffer) ay0Var.removeFirst());
            byteBuffer2 = (ByteBuffer) ay0Var.peek();
        }
        if (byteBuffer2 == null) {
            return j;
        }
        if (byteBuffer2.remaining() >= i2) {
            return byteBuffer2.order(this.b);
        }
        ByteBuffer j2 = j(i2);
        j2.limit(i2);
        byte[] array = j2.array();
        int i3 = 0;
        loop1: while (true) {
            byteBuffer = null;
            while (i3 < i2) {
                byteBuffer = (ByteBuffer) ay0Var.removeFirst();
                int min = Math.min(i2 - i3, byteBuffer.remaining());
                byteBuffer.get(array, i3, min);
                i3 += min;
                if (byteBuffer.remaining() == 0) {
                    break;
                }
            }
            m(byteBuffer);
        }
        if (byteBuffer != null && byteBuffer.remaining() > 0) {
            ay0Var.addFirst(byteBuffer);
        }
        ay0Var.addFirst(j2);
        return j2.order(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        defpackage.xq0.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String l(Charset charset) {
        byte[] array;
        int remaining;
        if (charset == null) {
            charset = ne4.a;
        }
        StringBuilder sb = new StringBuilder();
        ay0 ay0Var = this.a;
        ay0Var.getClass();
        int i2 = ay0Var.b;
        int i3 = ay0Var.c;
        while (true) {
            int i4 = 0;
            if (!(i2 != i3)) {
                String sb2 = sb.toString();
                n();
                return sb2;
            }
            if (i2 == i3) {
                wvs.n();
                return null;
            }
            Object[] objArr = ay0Var.a;
            Object obj = objArr[i2];
            if (ay0Var.c != i3 || obj == null) {
                break;
            }
            i2 = (i2 + 1) & (objArr.length - 1);
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (byteBuffer.isDirect()) {
                array = new byte[byteBuffer.remaining()];
                remaining = byteBuffer.remaining();
                byteBuffer.get(array);
            } else {
                array = byteBuffer.array();
                i4 = byteBuffer.arrayOffset() + byteBuffer.position();
                remaining = byteBuffer.remaining();
            }
            sb.append(new String(array, i4, remaining, charset));
        }
    }

    public final void n() {
        while (true) {
            ay0 ay0Var = this.a;
            if (ay0Var.size() <= 0) {
                this.c = 0;
                return;
            }
            m((ByteBuffer) ay0Var.removeFirst());
        }
    }

    public final ByteBuffer o() {
        ByteBuffer byteBuffer = (ByteBuffer) this.a.removeFirst();
        this.c -= byteBuffer.remaining();
        return byteBuffer;
    }

    public om3() {
    }
}
