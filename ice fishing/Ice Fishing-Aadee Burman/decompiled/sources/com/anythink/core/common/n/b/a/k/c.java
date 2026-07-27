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
    final boolean f15437a;

    /* renamed from: b, reason: collision with root package name */
    final e f15438b;

    /* renamed from: c, reason: collision with root package name */
    final a f15439c;

    /* renamed from: d, reason: collision with root package name */
    boolean f15440d;

    /* renamed from: e, reason: collision with root package name */
    int f15441e;

    /* renamed from: f, reason: collision with root package name */
    long f15442f;

    /* renamed from: g, reason: collision with root package name */
    boolean f15443g;

    /* renamed from: h, reason: collision with root package name */
    boolean f15444h;
    private final com.anythink.core.common.n.c.c i = new com.anythink.core.common.n.c.c();

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.core.common.n.c.c f15445j = new com.anythink.core.common.n.c.c();

    /* renamed from: k, reason: collision with root package name */
    private final byte[] f15446k;

    /* renamed from: l, reason: collision with root package name */
    private final c.a f15447l;

    public interface a {
        void a(int i, String str);

        void b(f fVar);

        void e();

        void f();

        void g();
    }

    public c(boolean z3, e eVar, a aVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f15437a = z3;
        this.f15438b = eVar;
        this.f15439c = aVar;
        this.f15446k = z3 ? null : new byte[4];
        this.f15447l = z3 ? null : new c.a();
    }

    private void b() {
        if (this.f15440d) {
            throw new IOException("closed");
        }
        long i_ = this.f15438b.a().i_();
        this.f15438b.a().h_();
        try {
            byte k9 = this.f15438b.k();
            this.f15438b.a().a(i_, TimeUnit.NANOSECONDS);
            this.f15441e = k9 & 15;
            boolean z3 = (k9 & com.anythink.core.common.s.a.c.f16316a) != 0;
            this.f15443g = z3;
            boolean z6 = (k9 & 8) != 0;
            this.f15444h = z6;
            if (z6 && !z3) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z9 = (k9 & com.anythink.core.common.s.a.c.f16317b) != 0;
            boolean z10 = (k9 & 32) != 0;
            boolean z11 = (k9 & 16) != 0;
            if (z9 || z10 || z11) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            byte k10 = this.f15438b.k();
            boolean z12 = (k10 & com.anythink.core.common.s.a.c.f16316a) != 0;
            if (z12 == this.f15437a) {
                throw new ProtocolException(this.f15437a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j6 = k10 & Byte.MAX_VALUE;
            this.f15442f = j6;
            if (j6 == 126) {
                this.f15442f = this.f15438b.l() & 65535;
            } else if (j6 == 127) {
                long n9 = this.f15438b.n();
                this.f15442f = n9;
                if (n9 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f15442f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f15444h && this.f15442f > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z12) {
                this.f15438b.b(this.f15446k);
            }
        } catch (Throwable th) {
            this.f15438b.a().a(i_, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void c() {
        short s9;
        String str;
        long j6 = this.f15442f;
        if (j6 > 0) {
            this.f15438b.b(this.i, j6);
            if (!this.f15437a) {
                this.i.a(this.f15447l);
                this.f15447l.a(0L);
                b.a(this.f15447l, this.f15446k);
                this.f15447l.close();
            }
        }
        switch (this.f15441e) {
            case 8:
                long b9 = this.i.b();
                if (b9 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (b9 != 0) {
                    s9 = this.i.l();
                    str = this.i.u();
                    String a9 = b.a(s9);
                    if (a9 != null) {
                        throw new ProtocolException(a9);
                    }
                } else {
                    s9 = 1005;
                    str = "";
                }
                this.f15439c.a(s9, str);
                this.f15440d = true;
                return;
            case 9:
                this.f15439c.b(this.i.t());
                return;
            case 10:
                a aVar = this.f15439c;
                this.i.t();
                aVar.g();
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f15441e));
        }
    }

    private void d() {
        int i = this.f15441e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        f();
        if (i == 1) {
            this.f15445j.u();
        } else {
            this.f15445j.t();
        }
    }

    private void e() {
        while (!this.f15440d) {
            b();
            if (!this.f15444h) {
                return;
            } else {
                c();
            }
        }
    }

    private void f() {
        while (!this.f15440d) {
            long j6 = this.f15442f;
            if (j6 > 0) {
                this.f15438b.b(this.f15445j, j6);
                if (!this.f15437a) {
                    this.f15445j.a(this.f15447l);
                    this.f15447l.a(this.f15445j.b() - this.f15442f);
                    b.a(this.f15447l, this.f15446k);
                    this.f15447l.close();
                }
            }
            if (this.f15443g) {
                return;
            }
            e();
            if (this.f15441e != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f15441e));
            }
        }
        throw new IOException("closed");
    }

    public final void a() {
        b();
        if (this.f15444h) {
            c();
            return;
        }
        int i = this.f15441e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        f();
        if (i == 1) {
            this.f15445j.u();
        } else {
            this.f15445j.t();
        }
    }
}
