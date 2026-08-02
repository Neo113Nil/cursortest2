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
    final boolean f16224a;

    /* renamed from: b, reason: collision with root package name */
    final e f16225b;

    /* renamed from: c, reason: collision with root package name */
    final a f16226c;

    /* renamed from: d, reason: collision with root package name */
    boolean f16227d;

    /* renamed from: e, reason: collision with root package name */
    int f16228e;

    /* renamed from: f, reason: collision with root package name */
    long f16229f;

    /* renamed from: g, reason: collision with root package name */
    boolean f16230g;

    /* renamed from: h, reason: collision with root package name */
    boolean f16231h;
    private final com.anythink.core.common.n.c.c i = new com.anythink.core.common.n.c.c();

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.core.common.n.c.c f16232j = new com.anythink.core.common.n.c.c();

    /* renamed from: k, reason: collision with root package name */
    private final byte[] f16233k;

    /* renamed from: l, reason: collision with root package name */
    private final c.a f16234l;

    public interface a {
        void a(int i, String str);

        void b(f fVar);

        void e();

        void f();

        void g();
    }

    public c(boolean z6, e eVar, a aVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f16224a = z6;
        this.f16225b = eVar;
        this.f16226c = aVar;
        this.f16233k = z6 ? null : new byte[4];
        this.f16234l = z6 ? null : new c.a();
    }

    private void b() {
        if (this.f16227d) {
            throw new IOException("closed");
        }
        long i_ = this.f16225b.a().i_();
        this.f16225b.a().h_();
        try {
            byte k9 = this.f16225b.k();
            this.f16225b.a().a(i_, TimeUnit.NANOSECONDS);
            this.f16228e = k9 & 15;
            boolean z6 = (k9 & com.anythink.core.common.s.a.c.f17103a) != 0;
            this.f16230g = z6;
            boolean z9 = (k9 & 8) != 0;
            this.f16231h = z9;
            if (z9 && !z6) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z10 = (k9 & com.anythink.core.common.s.a.c.f17104b) != 0;
            boolean z11 = (k9 & 32) != 0;
            boolean z12 = (k9 & 16) != 0;
            if (z10 || z11 || z12) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            byte k10 = this.f16225b.k();
            boolean z13 = (k10 & com.anythink.core.common.s.a.c.f17103a) != 0;
            if (z13 == this.f16224a) {
                throw new ProtocolException(this.f16224a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j6 = k10 & Byte.MAX_VALUE;
            this.f16229f = j6;
            if (j6 == 126) {
                this.f16229f = this.f16225b.l() & 65535;
            } else if (j6 == 127) {
                long n9 = this.f16225b.n();
                this.f16229f = n9;
                if (n9 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f16229f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f16231h && this.f16229f > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z13) {
                this.f16225b.b(this.f16233k);
            }
        } catch (Throwable th) {
            this.f16225b.a().a(i_, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void c() {
        short s9;
        String str;
        long j6 = this.f16229f;
        if (j6 > 0) {
            this.f16225b.b(this.i, j6);
            if (!this.f16224a) {
                this.i.a(this.f16234l);
                this.f16234l.a(0L);
                b.a(this.f16234l, this.f16233k);
                this.f16234l.close();
            }
        }
        switch (this.f16228e) {
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
                this.f16226c.a(s9, str);
                this.f16227d = true;
                return;
            case 9:
                this.f16226c.b(this.i.t());
                return;
            case 10:
                a aVar = this.f16226c;
                this.i.t();
                aVar.g();
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f16228e));
        }
    }

    private void d() {
        int i = this.f16228e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        f();
        if (i == 1) {
            this.f16232j.u();
        } else {
            this.f16232j.t();
        }
    }

    private void e() {
        while (!this.f16227d) {
            b();
            if (!this.f16231h) {
                return;
            } else {
                c();
            }
        }
    }

    private void f() {
        while (!this.f16227d) {
            long j6 = this.f16229f;
            if (j6 > 0) {
                this.f16225b.b(this.f16232j, j6);
                if (!this.f16224a) {
                    this.f16232j.a(this.f16234l);
                    this.f16234l.a(this.f16232j.b() - this.f16229f);
                    b.a(this.f16234l, this.f16233k);
                    this.f16234l.close();
                }
            }
            if (this.f16230g) {
                return;
            }
            e();
            if (this.f16228e != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f16228e));
            }
        }
        throw new IOException("closed");
    }

    public final void a() {
        b();
        if (this.f16231h) {
            c();
            return;
        }
        int i = this.f16228e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        f();
        if (i == 1) {
            this.f16232j.u();
        } else {
            this.f16232j.t();
        }
    }
}
