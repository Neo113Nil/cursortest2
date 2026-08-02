package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import com.yandex.pulse.metrics.c;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gln {
    public static final List w = t75.c(izm.HTTP_1_1);
    public final swf a;
    public final Random b;
    public final long c;
    public rcv d;
    public final long e;
    public final String f;
    public mkn g;
    public eln h;
    public vcv i;
    public wcv j;
    public final l8s k;
    public String l;
    public zp4 m;
    public final ArrayDeque n;
    public final ArrayDeque o;
    public long p;
    public boolean q;
    public int r;
    public String s;
    public boolean t;
    public int u;
    public boolean v;

    public gln(m8s m8sVar, d0o d0oVar, swf swfVar, Random random, long j, long j2) {
        m8sVar.getClass();
        this.a = swfVar;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = j2;
        this.k = m8sVar.e();
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.r = -1;
        String str = d0oVar.b;
        if (!ServiceCommand.TYPE_GET.equals(str)) {
            l1j.p(str, "Request must be GET: ");
            throw null;
        }
        pn3 pn3Var = pn3.d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f = ovn.L(-1234567890, bArr).a();
    }

    public final void a(l3o l3oVar, evj evjVar) {
        l3oVar.getClass();
        zvd zvdVar = l3oVar.f;
        int i = l3oVar.d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(dfi.i(sb, l3oVar.c, '\''));
        }
        String a = zvdVar.a("Connection");
        if (a == null) {
            a = null;
        }
        if (!"Upgrade".equalsIgnoreCase(a)) {
            throw new ProtocolException(ouj.k('\'', "Expected 'Connection' header value 'Upgrade' but was '", a));
        }
        String a2 = zvdVar.a("Upgrade");
        if (a2 == null) {
            a2 = null;
        }
        if (!"websocket".equalsIgnoreCase(a2)) {
            throw new ProtocolException(ouj.k('\'', "Expected 'Upgrade' header value 'websocket' but was '", a2));
        }
        String a3 = zvdVar.a("Sec-WebSocket-Accept");
        String str = a3 != null ? a3 : null;
        pn3 pn3Var = pn3.d;
        String a4 = ovn.C(this.f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").c("SHA-1").a();
        if (Intrinsics.d(a4, str)) {
            if (evjVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a4 + "' but was '" + str + '\'');
    }

    public final void b(int i, String str) {
        String str2;
        synchronized (this) {
            pn3 pn3Var = null;
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
                    pn3 pn3Var2 = pn3.d;
                    pn3Var = ovn.C(str);
                    if (pn3Var.a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.t && !this.q) {
                    this.q = true;
                    this.o.add(new cln(i, pn3Var));
                    f();
                }
            } finally {
            }
        }
    }

    public final void c(Exception exc, l3o l3oVar) {
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.t = true;
            zp4 zp4Var = this.m;
            this.m = null;
            vcv vcvVar = this.i;
            this.i = null;
            wcv wcvVar = this.j;
            this.j = null;
            this.k.f();
            try {
                this.a.a0(this, exc, l3oVar);
            } finally {
                if (zp4Var != null) {
                    cvt.d(zp4Var);
                }
                if (vcvVar != null) {
                    cvt.d(vcvVar);
                }
                if (wcvVar != null) {
                    cvt.d(wcvVar);
                }
            }
        }
    }

    public final void d(String str, zp4 zp4Var) {
        rcv rcvVar = this.d;
        rcvVar.getClass();
        synchronized (this) {
            try {
                this.l = str;
                this.m = zp4Var;
                this.j = new wcv((gj3) zp4Var.c, this.b, rcvVar.a, rcvVar.c, this.e);
                this.h = new eln(this);
                long j = this.c;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.k.c(new fln(str.concat(" ping"), this, nanos), nanos);
                }
                if (!this.o.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = new vcv((ij3) zp4Var.b, this, rcvVar.a, rcvVar.e);
    }

    public final void e() {
        while (this.r == -1) {
            vcv vcvVar = this.i;
            vcvVar.getClass();
            vcvVar.b();
            if (!vcvVar.i) {
                hi3 hi3Var = vcvVar.l;
                int i = vcvVar.f;
                if (i != 1 && i != 2) {
                    byte[] bArr = cvt.a;
                    String hexString = Integer.toHexString(i);
                    hexString.getClass();
                    throw new ProtocolException("Unknown opcode: ".concat(hexString));
                }
                while (!vcvVar.e) {
                    long j = vcvVar.g;
                    if (j > 0) {
                        vcvVar.a.O(hi3Var, j);
                    }
                    if (vcvVar.h) {
                        if (vcvVar.j) {
                            gzh gzhVar = vcvVar.m;
                            if (gzhVar == null) {
                                gzhVar = new gzh(1, vcvVar.d);
                                vcvVar.m = gzhVar;
                            }
                            Inflater inflater = (Inflater) gzhVar.d;
                            hi3 hi3Var2 = gzhVar.c;
                            if (hi3Var2.b != 0) {
                                xq0.x("Failed requirement.");
                                return;
                            }
                            if (gzhVar.b) {
                                inflater.reset();
                            }
                            hi3Var2.o0(hi3Var);
                            hi3Var2.P0(65535);
                            long bytesRead = inflater.getBytesRead() + hi3Var2.b;
                            do {
                                ((ake) gzhVar.e).a(hi3Var, Long.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        gln glnVar = vcvVar.b;
                        if (i == 1) {
                            String G0 = hi3Var.G0();
                            glnVar.getClass();
                            glnVar.a.c0(glnVar, G0);
                        } else {
                            pn3 g0 = hi3Var.g0(hi3Var.b);
                            glnVar.getClass();
                            g0.getClass();
                            glnVar.a.b0(glnVar, g0);
                        }
                    } else {
                        while (!vcvVar.e) {
                            vcvVar.b();
                            if (!vcvVar.i) {
                                break;
                            } else {
                                vcvVar.a();
                            }
                        }
                        if (vcvVar.f != 0) {
                            int i2 = vcvVar.f;
                            byte[] bArr2 = cvt.a;
                            String hexString2 = Integer.toHexString(i2);
                            hexString2.getClass();
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                        }
                    }
                }
                kac.f("closed");
                return;
            }
            vcvVar.a();
        }
    }

    public final void f() {
        byte[] bArr = cvt.a;
        eln elnVar = this.h;
        if (elnVar != null) {
            this.k.c(elnVar, 0L);
        }
    }

    public final synchronized boolean g(int i, pn3 pn3Var) {
        if (!this.t && !this.q) {
            if (this.p + pn3Var.d() > 16777216) {
                b(c.FINITE_SUM_FIELD_NUMBER, null);
                return false;
            }
            this.p += pn3Var.d();
            this.o.add(new dln(i, pn3Var));
            f();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c9, code lost:
    
        if (r2 < 3000) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #2 {all -> 0x007c, blocks: (B:20:0x0070, B:28:0x007f, B:30:0x0083, B:31:0x008f, B:34:0x009c, B:38:0x00a0, B:39:0x00a1, B:40:0x00a2, B:42:0x00a6, B:52:0x00cb, B:54:0x00ef, B:56:0x00f9, B:57:0x00fc, B:61:0x0107, B:63:0x010b, B:66:0x0124, B:67:0x0126, B:68:0x0127, B:69:0x0130, B:74:0x00df, B:75:0x0131, B:76:0x0136, B:60:0x0104, B:33:0x0090), top: B:18:0x006e, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[Catch: all -> 0x007c, TryCatch #2 {all -> 0x007c, blocks: (B:20:0x0070, B:28:0x007f, B:30:0x0083, B:31:0x008f, B:34:0x009c, B:38:0x00a0, B:39:0x00a1, B:40:0x00a2, B:42:0x00a6, B:52:0x00cb, B:54:0x00ef, B:56:0x00f9, B:57:0x00fc, B:61:0x0107, B:63:0x010b, B:66:0x0124, B:67:0x0126, B:68:0x0127, B:69:0x0130, B:74:0x00df, B:75:0x0131, B:76:0x0136, B:60:0x0104, B:33:0x0090), top: B:18:0x006e, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef A[Catch: all -> 0x007c, TryCatch #2 {all -> 0x007c, blocks: (B:20:0x0070, B:28:0x007f, B:30:0x0083, B:31:0x008f, B:34:0x009c, B:38:0x00a0, B:39:0x00a1, B:40:0x00a2, B:42:0x00a6, B:52:0x00cb, B:54:0x00ef, B:56:0x00f9, B:57:0x00fc, B:61:0x0107, B:63:0x010b, B:66:0x0124, B:67:0x0126, B:68:0x0127, B:69:0x0130, B:74:0x00df, B:75:0x0131, B:76:0x0136, B:60:0x0104, B:33:0x0090), top: B:18:0x006e, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127 A[Catch: all -> 0x007c, TryCatch #2 {all -> 0x007c, blocks: (B:20:0x0070, B:28:0x007f, B:30:0x0083, B:31:0x008f, B:34:0x009c, B:38:0x00a0, B:39:0x00a1, B:40:0x00a2, B:42:0x00a6, B:52:0x00cb, B:54:0x00ef, B:56:0x00f9, B:57:0x00fc, B:61:0x0107, B:63:0x010b, B:66:0x0124, B:67:0x0126, B:68:0x0127, B:69:0x0130, B:74:0x00df, B:75:0x0131, B:76:0x0136, B:60:0x0104, B:33:0x0090), top: B:18:0x006e, inners: #0, #3 }] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [wcv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        Object obj;
        String str;
        ?? r8;
        int i;
        zp4 zp4Var;
        ?? r7;
        synchronized (this) {
            try {
                if (this.t) {
                    return false;
                }
                wcv wcvVar = this.j;
                Object poll = this.n.poll();
                String str2 = null;
                try {
                    if (poll == null) {
                        obj = this.o.poll();
                        if (obj instanceof cln) {
                            i = this.r;
                            str = this.s;
                            if (i != -1) {
                                zp4Var = this.m;
                                this.m = null;
                                vcv vcvVar = this.i;
                                this.i = null;
                                r8 = this.j;
                                this.j = null;
                                this.k.f();
                                r7 = vcvVar;
                            } else {
                                this.k.c(new eln(this, this.l + " cancel"), 60000000000L);
                                zp4Var = null;
                                r7 = 0;
                                r8 = null;
                            }
                            if (poll == null) {
                                wcvVar.getClass();
                                wcvVar.a(10, (pn3) poll);
                            } else if (obj instanceof dln) {
                                dln dlnVar = (dln) obj;
                                wcvVar.getClass();
                                wcvVar.b(dlnVar.a, dlnVar.b);
                                synchronized (this) {
                                    this.p -= dlnVar.b.d();
                                }
                            } else {
                                if (!(obj instanceof cln)) {
                                    throw new AssertionError();
                                }
                                cln clnVar = (cln) obj;
                                wcvVar.getClass();
                                int i2 = clnVar.a;
                                pn3 pn3Var = clnVar.b;
                                pn3 pn3Var2 = pn3.d;
                                if (i2 >= 1000 && i2 < 5000) {
                                    if (1004 <= i2) {
                                        if (i2 < 1007) {
                                            str2 = "Code " + i2 + " is reserved and may not be used.";
                                            if (str2 != null) {
                                                throw new IllegalArgumentException(str2.toString());
                                            }
                                            hi3 hi3Var = new hi3();
                                            hi3Var.Q0(i2);
                                            if (pn3Var != null) {
                                                hi3Var.L0(pn3Var);
                                            }
                                            try {
                                                wcvVar.a(8, hi3Var.g0(hi3Var.b));
                                                if (zp4Var != null) {
                                                    swf swfVar = this.a;
                                                    str.getClass();
                                                    swfVar.Y(this, i, str);
                                                }
                                            } finally {
                                                wcvVar.h = true;
                                            }
                                        }
                                    }
                                    if (1015 <= i2) {
                                    }
                                    if (str2 != null) {
                                    }
                                }
                                str2 = "Code must be in range [1000,5000): " + i2;
                                if (str2 != null) {
                                }
                            }
                            return true;
                        }
                        if (obj == null) {
                            return false;
                        }
                        str = null;
                    } else {
                        obj = null;
                        str = null;
                    }
                    if (poll == null) {
                    }
                    return true;
                } finally {
                    if (zp4Var != null) {
                        cvt.d(zp4Var);
                    }
                    if (r7 != 0) {
                        cvt.d(r7);
                    }
                    if (r8 != null) {
                        cvt.d(r8);
                    }
                }
                String str3 = str;
                r8 = str3;
                i = -1;
                zp4Var = r8;
                r7 = str3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
