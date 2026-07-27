package com.anythink.core.common.n.b.a.k;

import com.anythink.core.common.n.c.c;
import com.anythink.core.common.n.c.e;
import com.anythink.core.common.n.c.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final boolean f15595a;

    /* renamed from: b, reason: collision with root package name */
    final e f15596b;

    /* renamed from: c, reason: collision with root package name */
    final a f15597c;

    /* renamed from: d, reason: collision with root package name */
    boolean f15598d;

    /* renamed from: e, reason: collision with root package name */
    int f15599e;

    /* renamed from: f, reason: collision with root package name */
    long f15600f;

    /* renamed from: g, reason: collision with root package name */
    boolean f15601g;

    /* renamed from: h, reason: collision with root package name */
    boolean f15602h;
    private final com.anythink.core.common.n.c.c i = new com.anythink.core.common.n.c.c();

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.core.common.n.c.c f15603j = new com.anythink.core.common.n.c.c();

    /* renamed from: k, reason: collision with root package name */
    private final byte[] f15604k;

    /* renamed from: l, reason: collision with root package name */
    private final c.a f15605l;

    public interface a {
        void a(int i, String str);

        void b(f fVar);

        void e();

        void f();

        void g();
    }

    public c(boolean z8, e eVar, a aVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f15595a = z8;
        this.f15596b = eVar;
        this.f15597c = aVar;
        this.f15604k = z8 ? null : new byte[4];
        this.f15605l = z8 ? null : new c.a();
    }

    private void b() {
        if (this.f15598d) {
            throw new IOException("closed");
        }
        long i_ = this.f15596b.a().i_();
        this.f15596b.a().h_();
        try {
            byte k6 = this.f15596b.k();
            this.f15596b.a().a(i_, TimeUnit.NANOSECONDS);
            this.f15599e = k6 & 15;
            boolean z8 = (k6 & com.anythink.core.common.s.a.c.f16474a) != 0;
            this.f15601g = z8;
            boolean z9 = (k6 & 8) != 0;
            this.f15602h = z9;
            if (z9 && !z8) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z10 = (k6 & com.anythink.core.common.s.a.c.f16475b) != 0;
            boolean z11 = (k6 & 32) != 0;
            boolean z12 = (k6 & 16) != 0;
            if (z10 || z11 || z12) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            byte k9 = this.f15596b.k();
            boolean z13 = (k9 & com.anythink.core.common.s.a.c.f16474a) != 0;
            if (z13 == this.f15595a) {
                throw new ProtocolException(this.f15595a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j9 = k9 & Byte.MAX_VALUE;
            this.f15600f = j9;
            if (j9 == 126) {
                this.f15600f = this.f15596b.l() & 65535;
            } else if (j9 == 127) {
                long n9 = this.f15596b.n();
                this.f15600f = n9;
                if (n9 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f15600f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f15602h && this.f15600f > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z13) {
                this.f15596b.b(this.f15604k);
            }
        } catch (Throwable th) {
            this.f15596b.a().a(i_, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void c() {
        short s3;
        String str;
        long j9 = this.f15600f;
        if (j9 > 0) {
            this.f15596b.b(this.i, j9);
            if (!this.f15595a) {
                this.i.a(this.f15605l);
                this.f15605l.a(0L);
                b.a(this.f15605l, this.f15604k);
                this.f15605l.close();
            }
        }
        switch (this.f15599e) {
            case 8:
                long b9 = this.i.b();
                if (b9 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (b9 != 0) {
                    s3 = this.i.l();
                    str = this.i.u();
                    String a9 = b.a(s3);
                    if (a9 != null) {
                        throw new ProtocolException(a9);
                    }
                } else {
                    s3 = 1005;
                    str = "";
                }
                this.f15597c.a(s3, str);
                this.f15598d = true;
                return;
            case 9:
                this.f15597c.b(this.i.t());
                return;
            case 10:
                a aVar = this.f15597c;
                this.i.t();
                aVar.g();
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f15599e));
        }
    }

    private void d() {
        int i = this.f15599e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        f();
        if (i == 1) {
            this.f15603j.u();
        } else {
            this.f15603j.t();
        }
    }

    private void e() {
        while (!this.f15598d) {
            b();
            if (!this.f15602h) {
                return;
            } else {
                c();
            }
        }
    }

    private void f() {
        while (!this.f15598d) {
            long j9 = this.f15600f;
            if (j9 > 0) {
                this.f15596b.b(this.f15603j, j9);
                if (!this.f15595a) {
                    this.f15603j.a(this.f15605l);
                    this.f15605l.a(this.f15603j.b() - this.f15600f);
                    b.a(this.f15605l, this.f15604k);
                    this.f15605l.close();
                }
            }
            if (this.f15601g) {
                return;
            }
            e();
            if (this.f15599e != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f15599e));
            }
        }
        throw new IOException("closed");
    }

    public final void a() {
        b();
        if (this.f15602h) {
            c();
            return;
        }
        int i = this.f15599e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        f();
        if (i == 1) {
            this.f15603j.u();
        } else {
            this.f15603j.t();
        }
    }
}
