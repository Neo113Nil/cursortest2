package defpackage;

import defpackage.yp6;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public final class ydi0 implements zj41, ik41 {
    public static final List y = Collections.singletonList(Protocol.HTTP_1_1);
    public final d5j0 a;
    public final ek41 b;
    public final Random c;
    public final long d;
    public final long f;
    public final long g;
    public final String h;
    public nci0 i;
    public xdi0 j;
    public jk41 k;
    public kk41 l;
    public final htx0 m;
    public String n;
    public jb7 o;
    public long r;
    public boolean s;
    public String u;
    public boolean v;
    public int w;
    public boolean x;
    public dk41 e = null;
    public final ArrayDeque p = new ArrayDeque();
    public final ArrayDeque q = new ArrayDeque();
    public int t = -1;

    public ydi0(mtx0 mtx0Var, d5j0 d5j0Var, ek41 ek41Var, Random random, long j, long j2, long j3) {
        this.a = d5j0Var;
        this.b = ek41Var;
        this.c = random;
        this.d = j;
        this.f = j2;
        this.g = j3;
        this.m = mtx0Var.d();
        String str = d5j0Var.b;
        if (!"GET".equals(str)) {
            w511.f(g8e.o("Request must be GET: ", str));
            throw null;
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        yp6.a aVar = j.a;
        j.b(16L, 0L, 16);
        this.h = new ByteString(f73.m(0, 16, bArr)).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, kk41] */
    public static void e(ydi0 ydi0Var, Exception exc, kvj0 kvj0Var, int i) {
        kk41 kk41Var;
        if ((i & 2) != 0) {
            kvj0Var = null;
        }
        boolean z = (i & 4) == 0;
        ydi0Var.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (ydi0Var) {
            try {
                if (ydi0Var.v) {
                    return;
                }
                ydi0Var.v = true;
                jb7 jb7Var = ydi0Var.o;
                ?? r4 = ydi0Var.l;
                ref$ObjectRef.element = r4;
                ydi0Var.l = null;
                if (!z && r4 != 0) {
                    htx0.c(ydi0Var.m, ydi0Var.n + " writer close", 0L, new z00(4, ref$ObjectRef), 2);
                }
                ydi0Var.m.g();
                try {
                    ydi0Var.b.d(ydi0Var, exc, kvj0Var);
                    if (jb7Var != null) {
                        jb7Var.cancel();
                    }
                    if (!z || (kk41Var = (kk41) ref$ObjectRef.element) == null) {
                        return;
                    }
                    yf61.b(kk41Var);
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        this.i.cancel();
    }

    public final k5t0 b(kvj0 kvj0Var) {
        meu meuVar = kvj0Var.y;
        int i = kvj0Var.w;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(HexString.CHAR_SPACE);
            throw new ProtocolException(b64.p(sb, kvj0Var.c, '\''));
        }
        String a = meuVar.a("Connection");
        if (a == null) {
            a = null;
        }
        if (!"Upgrade".equalsIgnoreCase(a)) {
            throw new ProtocolException(unr0.l('\'', "Expected 'Connection' header value 'Upgrade' but was '", a));
        }
        String a2 = meuVar.a("Upgrade");
        if (a2 == null) {
            a2 = null;
        }
        if (!"websocket".equalsIgnoreCase(a2)) {
            throw new ProtocolException(unr0.l('\'', "Expected 'Upgrade' header value 'websocket' but was '", a2));
        }
        String a3 = meuVar.a("Sec-WebSocket-Accept");
        String str = a3 != null ? a3 : null;
        String t = oyr.t(new StringBuilder(), this.h, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        ByteString byteString = new ByteString(t.getBytes(uza.a));
        byteString.b = t;
        String a4 = byteString.f("SHA-1").a();
        if (jl40.l(a4, str)) {
            k5t0 k5t0Var = kvj0Var.A;
            if (k5t0Var != null) {
                return k5t0Var;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a4 + "' but was '" + str + '\'');
    }

    public final boolean c(int i, String str) {
        String str2;
        long j = this.g;
        synchronized (this) {
            ByteString byteString = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    byteString = new ByteString(str.getBytes(uza.a));
                    byteString.b = str;
                    if (byteString.h() > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.v && !this.s) {
                    this.s = true;
                    this.q.add(new vdi0(i, j, byteString));
                    g();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void d(OkHttpClient okHttpClient) {
        d5j0 d5j0Var = this.a;
        if (d5j0Var.c.a("Sec-WebSocket-Extensions") != null) {
            e(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return;
        }
        OkHttpClient.a b = okHttpClient.b();
        b.d(bgo.NONE);
        b.f(y);
        OkHttpClient okHttpClient2 = new OkHttpClient(b);
        t4j0 b2 = d5j0Var.b();
        b2.c.g("Upgrade", "websocket");
        b2.c.g("Connection", "Upgrade");
        b2.c.g("Sec-WebSocket-Key", this.h);
        b2.c.g("Sec-WebSocket-Version", "13");
        b2.c.g("Sec-WebSocket-Extensions", "permessage-deflate");
        d5j0 d5j0Var2 = new d5j0(b2);
        nci0 nci0Var = new nci0(okHttpClient2, d5j0Var2, true);
        this.i = nci0Var;
        nci0Var.I(new o8g0(this, d5j0Var2));
    }

    public final void f() {
        int i;
        String str;
        jk41 jk41Var;
        boolean z;
        synchronized (this) {
            try {
                i = this.t;
                str = this.u;
                jk41Var = this.k;
                this.k = null;
                if (this.s && this.q.isEmpty()) {
                    kk41 kk41Var = this.l;
                    if (kk41Var != null) {
                        this.l = null;
                        htx0.c(this.m, this.n + " writer close", 0L, new vyf0(9, kk41Var), 2);
                    }
                    this.m.g();
                }
                if (!this.v && this.l == null) {
                    z = this.t != -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.b.b(this, i, str);
        }
        if (jk41Var != null) {
            yf61.b(jk41Var);
        }
    }

    public final void g() {
        TimeZone timeZone = bg61.a;
        xdi0 xdi0Var = this.j;
        if (xdi0Var != null) {
            this.m.d(xdi0Var, 0L);
        }
    }

    public final synchronized boolean h(int i, ByteString byteString) {
        if (!this.v && !this.s) {
            if (this.r + byteString.h() > 16777216) {
                c(1001, null);
                return false;
            }
            this.r += byteString.h();
            this.q.add(new wdi0(i, byteString));
            g();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00df, code lost:
    
        if (r0 < 3000) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:25:0x0082, B:29:0x008c, B:31:0x0090, B:32:0x009d, B:35:0x00ac, B:39:0x00b0, B:40:0x00b1, B:41:0x00b2, B:43:0x00b6, B:49:0x0128, B:51:0x012c, B:54:0x0138, B:55:0x013a, B:67:0x00e1, B:70:0x0106, B:71:0x010f, B:76:0x00f5, B:77:0x0110, B:79:0x011a, B:80:0x011d, B:81:0x013b, B:82:0x0140, B:48:0x0125, B:34:0x009e), top: B:23:0x0080, inners: #1, #3 }] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i() {
        kk41 kk41Var;
        wdi0 wdi0Var;
        String str;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.v) {
                    return false;
                }
                kk41 kk41Var2 = this.l;
                Object poll = this.p.poll();
                int i = 10;
                String str2 = null;
                int i2 = -1;
                if (poll == null) {
                    Object poll2 = this.q.poll();
                    if (poll2 instanceof vdi0) {
                        int i3 = this.t;
                        str = this.u;
                        if (i3 != -1) {
                            kk41 kk41Var3 = this.l;
                            this.l = null;
                            if (kk41Var3 != null && this.k == null) {
                                z = true;
                            }
                            this.m.g();
                            kk41Var = kk41Var3;
                            i2 = i3;
                            wdi0Var = poll2;
                        } else {
                            long j = ((vdi0) poll2).c;
                            htx0.c(this.m, this.n + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new vyf0(i, this), 4);
                            i2 = i3;
                            wdi0Var = poll2;
                            kk41Var = null;
                        }
                    } else {
                        if (poll2 == null) {
                            return false;
                        }
                        str = null;
                        wdi0Var = poll2;
                        kk41Var = null;
                    }
                } else {
                    kk41Var = null;
                    wdi0Var = 0;
                    str = null;
                }
                try {
                    if (poll != null) {
                        kk41Var2.a(10, (ByteString) poll);
                    } else if (wdi0Var instanceof wdi0) {
                        kk41Var2.c(wdi0Var.a, wdi0Var.b);
                        synchronized (this) {
                            this.r -= wdi0Var.b.h();
                        }
                    } else {
                        if (!(wdi0Var instanceof vdi0)) {
                            throw new AssertionError();
                        }
                        int i4 = wdi0Var.a;
                        ByteString byteString = ((vdi0) wdi0Var).b;
                        ByteString byteString2 = ByteString.c;
                        if (i4 != 0 || byteString != null) {
                            if (i4 != 0) {
                                if (i4 >= 1000 && i4 < 5000) {
                                    if (1004 <= i4) {
                                        if (i4 < 1007) {
                                            str2 = "Code " + i4 + " is reserved and may not be used.";
                                            if (str2 != null) {
                                                throw new IllegalArgumentException(str2.toString());
                                            }
                                        }
                                    }
                                    if (1015 <= i4) {
                                    }
                                    if (str2 != null) {
                                    }
                                }
                                str2 = "Code must be in range [1000,5000): " + i4;
                                if (str2 != null) {
                                }
                            }
                            yp6 yp6Var = new yp6();
                            yp6Var.u0(i4);
                            if (byteString != null) {
                                yp6Var.b0(byteString);
                            }
                            byteString2 = yp6Var.l0(yp6Var.b);
                        }
                        try {
                            kk41Var2.a(8, byteString2);
                            if (z) {
                                this.b.b(this, i2, str);
                            }
                        } finally {
                            kk41Var2.A = true;
                        }
                    }
                    return true;
                } finally {
                    if (kk41Var != null) {
                        yf61.b(kk41Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
