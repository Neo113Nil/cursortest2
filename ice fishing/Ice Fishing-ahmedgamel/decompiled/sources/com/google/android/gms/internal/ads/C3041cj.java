package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.cj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3041cj implements InterfaceC3147ei {

    /* renamed from: b, reason: collision with root package name */
    public int f29537b;

    /* renamed from: c, reason: collision with root package name */
    public float f29538c;

    /* renamed from: d, reason: collision with root package name */
    public float f29539d;

    /* renamed from: e, reason: collision with root package name */
    public C3630nh f29540e;

    /* renamed from: f, reason: collision with root package name */
    public C3630nh f29541f;

    /* renamed from: g, reason: collision with root package name */
    public C3630nh f29542g;

    /* renamed from: h, reason: collision with root package name */
    public C3630nh f29543h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public C2675Mi f29544j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f29545k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f29546l;

    /* renamed from: m, reason: collision with root package name */
    public long f29547m;

    /* renamed from: n, reason: collision with root package name */
    public long f29548n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29549o;

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C2675Mi c2675Mi = this.f29544j;
            c2675Mi.getClass();
            this.f29547m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            InterfaceC2471Ai interfaceC2471Ai = c2675Mi.i;
            int c9 = remaining / (interfaceC2471Ai.c() * c2675Mi.f26306b);
            interfaceC2471Ai.b(c9);
            interfaceC2471Ai.k(remaining, byteBuffer);
            c2675Mi.f26313j += c9;
            c2675Mi.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final long b(long j6) {
        if (this.f29548n < 1024) {
            return (long) (j6 / this.f29538c);
        }
        long j9 = this.f29547m;
        this.f29544j.getClass();
        long c9 = j9 - (r2.i.c() * (r2.f26313j * r2.f26306b));
        int i = this.f29543h.f32749a;
        int i6 = this.f29542g.f32749a;
        return i == i6 ? AbstractC3159eu.w(j6, this.f29548n, c9, RoundingMode.DOWN) : AbstractC3159eu.w(j6, this.f29548n * i6, c9 * i, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final C3630nh c(C3630nh c3630nh) {
        int i = c3630nh.f32751c;
        if (i != 2 && i != 4) {
            throw new C2840Wh("Unhandled input format:", c3630nh);
        }
        int i6 = this.f29537b;
        if (i6 == -1) {
            i6 = c3630nh.f32749a;
        }
        this.f29540e = c3630nh;
        C3630nh c3630nh2 = new C3630nh(i6, c3630nh.f32750b, i);
        this.f29541f = c3630nh2;
        this.i = true;
        return c3630nh2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void d() {
        C2675Mi c2675Mi = this.f29544j;
        if (c2675Mi != null) {
            int i = c2675Mi.f26313j;
            int i6 = c2675Mi.f26318o;
            int i9 = c2675Mi.f26314k;
            float f3 = c2675Mi.f26307c;
            float f9 = c2675Mi.f26308d;
            int i10 = i9 + ((int) (((((((i - i6) / (f3 / f9)) + i6) + c2675Mi.f26320q) + c2675Mi.f26315l) / (c2675Mi.f26309e * f9)) + 0.5d));
            c2675Mi.f26320q = 0.0d;
            int i11 = c2675Mi.f26312h;
            int i12 = i11 + i11;
            InterfaceC2471Ai interfaceC2471Ai = c2675Mi.i;
            interfaceC2471Ai.b(i + i12);
            interfaceC2471Ai.l(i * c2675Mi.f26306b, i12);
            c2675Mi.f26313j += i12;
            c2675Mi.b();
            if (c2675Mi.f26314k > i10) {
                c2675Mi.f26314k = Math.max(i10, 0);
            }
            c2675Mi.f26313j = 0;
            c2675Mi.f26318o = 0;
            c2675Mi.f26315l = 0;
        }
        this.f29549o = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final ByteBuffer e() {
        C2675Mi c2675Mi = this.f29544j;
        if (c2675Mi != null) {
            AbstractC2772Sd.H(c2675Mi.f26314k >= 0);
            int i = c2675Mi.f26314k;
            int i6 = c2675Mi.f26306b;
            InterfaceC2471Ai interfaceC2471Ai = c2675Mi.i;
            int c9 = interfaceC2471Ai.c() * i * i6;
            if (c9 > 0) {
                if (this.f29545k.capacity() < c9) {
                    this.f29545k = ByteBuffer.allocateDirect(c9).order(ByteOrder.nativeOrder());
                } else {
                    this.f29545k.clear();
                }
                ByteBuffer byteBuffer = this.f29545k;
                AbstractC2772Sd.H(c2675Mi.f26314k >= 0);
                int min = Math.min(byteBuffer.remaining() / (interfaceC2471Ai.c() * i6), c2675Mi.f26314k);
                interfaceC2471Ai.p(min, byteBuffer);
                c2675Mi.f26314k -= min;
                System.arraycopy(interfaceC2471Ai.m(), min * i6, interfaceC2471Ai.m(), 0, c2675Mi.f26314k * i6);
                this.f29545k.flip();
                this.f29548n += c9;
                this.f29546l = this.f29545k;
            }
        }
        ByteBuffer byteBuffer2 = this.f29546l;
        this.f29546l = InterfaceC3147ei.f29965a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void f(C2640Kh c2640Kh) {
        if (i()) {
            C3630nh c3630nh = this.f29540e;
            this.f29542g = c3630nh;
            C3630nh c3630nh2 = this.f29541f;
            this.f29543h = c3630nh2;
            if (this.i) {
                this.f29544j = new C2675Mi(c3630nh.f32749a, c3630nh.f32750b, this.f29538c, this.f29539d, c3630nh2.f32749a, c3630nh.f32751c == 4);
            } else {
                C2675Mi c2675Mi = this.f29544j;
                if (c2675Mi != null) {
                    c2675Mi.f26313j = 0;
                    c2675Mi.f26314k = 0;
                    c2675Mi.f26315l = 0;
                    c2675Mi.f26316m = 0;
                    c2675Mi.f26317n = 0;
                    c2675Mi.f26318o = 0;
                    c2675Mi.f26319p = 0;
                    c2675Mi.f26320q = 0.0d;
                    c2675Mi.i.h();
                }
            }
        }
        this.f29546l = InterfaceC3147ei.f29965a;
        this.f29547m = 0L;
        this.f29548n = 0L;
        this.f29549o = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final boolean h() {
        if (this.f29549o) {
            C2675Mi c2675Mi = this.f29544j;
            if (c2675Mi != null) {
                AbstractC2772Sd.H(c2675Mi.f26314k >= 0);
                if (c2675Mi.i.c() * c2675Mi.f26314k * c2675Mi.f26306b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final boolean i() {
        if (this.f29541f.f32749a != -1) {
            return Math.abs(this.f29538c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f29539d + (-1.0f)) >= 1.0E-4f || this.f29541f.f32749a != this.f29540e.f32749a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void j() {
        this.f29538c = 1.0f;
        this.f29539d = 1.0f;
        C3630nh c3630nh = C3630nh.f32748e;
        this.f29540e = c3630nh;
        this.f29541f = c3630nh;
        this.f29542g = c3630nh;
        this.f29543h = c3630nh;
        ByteBuffer byteBuffer = InterfaceC3147ei.f29965a;
        this.f29545k = byteBuffer;
        this.f29546l = byteBuffer;
        this.f29537b = -1;
        this.i = false;
        this.f29544j = null;
        this.f29547m = 0L;
        this.f29548n = 0L;
        this.f29549o = false;
    }
}
