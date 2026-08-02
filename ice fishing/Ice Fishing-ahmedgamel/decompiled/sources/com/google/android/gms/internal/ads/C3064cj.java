package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.cj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3064cj implements InterfaceC3170ei {

    /* renamed from: b, reason: collision with root package name */
    public int f30322b;

    /* renamed from: c, reason: collision with root package name */
    public float f30323c;

    /* renamed from: d, reason: collision with root package name */
    public float f30324d;

    /* renamed from: e, reason: collision with root package name */
    public C3653nh f30325e;

    /* renamed from: f, reason: collision with root package name */
    public C3653nh f30326f;

    /* renamed from: g, reason: collision with root package name */
    public C3653nh f30327g;

    /* renamed from: h, reason: collision with root package name */
    public C3653nh f30328h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public C2695Mi f30329j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f30330k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f30331l;

    /* renamed from: m, reason: collision with root package name */
    public long f30332m;

    /* renamed from: n, reason: collision with root package name */
    public long f30333n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30334o;

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C2695Mi c2695Mi = this.f30329j;
            c2695Mi.getClass();
            this.f30332m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            InterfaceC2491Ai interfaceC2491Ai = c2695Mi.i;
            int c9 = remaining / (interfaceC2491Ai.c() * c2695Mi.f27095b);
            interfaceC2491Ai.b(c9);
            interfaceC2491Ai.k(remaining, byteBuffer);
            c2695Mi.f27102j += c9;
            c2695Mi.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final long b(long j6) {
        if (this.f30333n < 1024) {
            return (long) (j6 / this.f30323c);
        }
        long j9 = this.f30332m;
        this.f30329j.getClass();
        long c9 = j9 - (r2.i.c() * (r2.f27102j * r2.f27095b));
        int i = this.f30328h.f33536a;
        int i4 = this.f30327g.f33536a;
        return i == i4 ? AbstractC3182eu.w(j6, this.f30333n, c9, RoundingMode.DOWN) : AbstractC3182eu.w(j6, this.f30333n * i4, c9 * i, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final C3653nh c(C3653nh c3653nh) {
        int i = c3653nh.f33538c;
        if (i != 2 && i != 4) {
            throw new C2863Wh("Unhandled input format:", c3653nh);
        }
        int i4 = this.f30322b;
        if (i4 == -1) {
            i4 = c3653nh.f33536a;
        }
        this.f30325e = c3653nh;
        C3653nh c3653nh2 = new C3653nh(i4, c3653nh.f33537b, i);
        this.f30326f = c3653nh2;
        this.i = true;
        return c3653nh2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void d() {
        C2695Mi c2695Mi = this.f30329j;
        if (c2695Mi != null) {
            int i = c2695Mi.f27102j;
            int i4 = c2695Mi.f27107o;
            int i6 = c2695Mi.f27103k;
            float f2 = c2695Mi.f27096c;
            float f9 = c2695Mi.f27097d;
            int i9 = i6 + ((int) (((((((i - i4) / (f2 / f9)) + i4) + c2695Mi.f27109q) + c2695Mi.f27104l) / (c2695Mi.f27098e * f9)) + 0.5d));
            c2695Mi.f27109q = 0.0d;
            int i10 = c2695Mi.f27101h;
            int i11 = i10 + i10;
            InterfaceC2491Ai interfaceC2491Ai = c2695Mi.i;
            interfaceC2491Ai.b(i + i11);
            interfaceC2491Ai.l(i * c2695Mi.f27095b, i11);
            c2695Mi.f27102j += i11;
            c2695Mi.b();
            if (c2695Mi.f27103k > i9) {
                c2695Mi.f27103k = Math.max(i9, 0);
            }
            c2695Mi.f27102j = 0;
            c2695Mi.f27107o = 0;
            c2695Mi.f27104l = 0;
        }
        this.f30334o = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final ByteBuffer e() {
        C2695Mi c2695Mi = this.f30329j;
        if (c2695Mi != null) {
            AbstractC2792Sd.H(c2695Mi.f27103k >= 0);
            int i = c2695Mi.f27103k;
            int i4 = c2695Mi.f27095b;
            InterfaceC2491Ai interfaceC2491Ai = c2695Mi.i;
            int c9 = interfaceC2491Ai.c() * i * i4;
            if (c9 > 0) {
                if (this.f30330k.capacity() < c9) {
                    this.f30330k = ByteBuffer.allocateDirect(c9).order(ByteOrder.nativeOrder());
                } else {
                    this.f30330k.clear();
                }
                ByteBuffer byteBuffer = this.f30330k;
                AbstractC2792Sd.H(c2695Mi.f27103k >= 0);
                int min = Math.min(byteBuffer.remaining() / (interfaceC2491Ai.c() * i4), c2695Mi.f27103k);
                interfaceC2491Ai.p(min, byteBuffer);
                c2695Mi.f27103k -= min;
                System.arraycopy(interfaceC2491Ai.m(), min * i4, interfaceC2491Ai.m(), 0, c2695Mi.f27103k * i4);
                this.f30330k.flip();
                this.f30333n += c9;
                this.f30331l = this.f30330k;
            }
        }
        ByteBuffer byteBuffer2 = this.f30331l;
        this.f30331l = InterfaceC3170ei.f30756a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void f(C2660Kh c2660Kh) {
        if (i()) {
            C3653nh c3653nh = this.f30325e;
            this.f30327g = c3653nh;
            C3653nh c3653nh2 = this.f30326f;
            this.f30328h = c3653nh2;
            if (this.i) {
                this.f30329j = new C2695Mi(c3653nh.f33536a, c3653nh.f33537b, this.f30323c, this.f30324d, c3653nh2.f33536a, c3653nh.f33538c == 4);
            } else {
                C2695Mi c2695Mi = this.f30329j;
                if (c2695Mi != null) {
                    c2695Mi.f27102j = 0;
                    c2695Mi.f27103k = 0;
                    c2695Mi.f27104l = 0;
                    c2695Mi.f27105m = 0;
                    c2695Mi.f27106n = 0;
                    c2695Mi.f27107o = 0;
                    c2695Mi.f27108p = 0;
                    c2695Mi.f27109q = 0.0d;
                    c2695Mi.i.h();
                }
            }
        }
        this.f30331l = InterfaceC3170ei.f30756a;
        this.f30332m = 0L;
        this.f30333n = 0L;
        this.f30334o = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final boolean h() {
        if (this.f30334o) {
            C2695Mi c2695Mi = this.f30329j;
            if (c2695Mi != null) {
                AbstractC2792Sd.H(c2695Mi.f27103k >= 0);
                if (c2695Mi.i.c() * c2695Mi.f27103k * c2695Mi.f27095b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final boolean i() {
        if (this.f30326f.f33536a != -1) {
            return Math.abs(this.f30323c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f30324d + (-1.0f)) >= 1.0E-4f || this.f30326f.f33536a != this.f30325e.f33536a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void j() {
        this.f30323c = 1.0f;
        this.f30324d = 1.0f;
        C3653nh c3653nh = C3653nh.f33535e;
        this.f30325e = c3653nh;
        this.f30326f = c3653nh;
        this.f30327g = c3653nh;
        this.f30328h = c3653nh;
        ByteBuffer byteBuffer = InterfaceC3170ei.f30756a;
        this.f30330k = byteBuffer;
        this.f30331l = byteBuffer;
        this.f30322b = -1;
        this.i = false;
        this.f30329j = null;
        this.f30332m = 0L;
        this.f30333n = 0L;
        this.f30334o = false;
    }
}
