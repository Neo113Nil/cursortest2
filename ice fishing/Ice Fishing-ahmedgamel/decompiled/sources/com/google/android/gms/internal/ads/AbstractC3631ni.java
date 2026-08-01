package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.ni, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3631ni implements InterfaceC3147ei {

    /* renamed from: b, reason: collision with root package name */
    public C3630nh f32753b;

    /* renamed from: c, reason: collision with root package name */
    public C3630nh f32754c;

    /* renamed from: d, reason: collision with root package name */
    public C3630nh f32755d;

    /* renamed from: e, reason: collision with root package name */
    public C3630nh f32756e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f32757f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f32758g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32759h;

    public AbstractC3631ni() {
        ByteBuffer byteBuffer = InterfaceC3147ei.f29965a;
        this.f32757f = byteBuffer;
        this.f32758g = byteBuffer;
        C3630nh c3630nh = C3630nh.f32748e;
        this.f32755d = c3630nh;
        this.f32756e = c3630nh;
        this.f32753b = c3630nh;
        this.f32754c = c3630nh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final C3630nh c(C3630nh c3630nh) {
        this.f32755d = c3630nh;
        this.f32756e = k(c3630nh);
        return i() ? this.f32756e : C3630nh.f32748e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void d() {
        this.f32759h = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.f32758g;
        this.f32758g = InterfaceC3147ei.f29965a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void f(C2640Kh c2640Kh) {
        this.f32758g = InterfaceC3147ei.f29965a;
        this.f32759h = false;
        this.f32753b = this.f32755d;
        this.f32754c = this.f32756e;
        m();
    }

    public final ByteBuffer g(int i) {
        if (this.f32757f.capacity() < i) {
            this.f32757f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f32757f.clear();
        }
        ByteBuffer byteBuffer = this.f32757f;
        this.f32758g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public boolean h() {
        return this.f32759h && this.f32758g == InterfaceC3147ei.f29965a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public boolean i() {
        return this.f32756e != C3630nh.f32748e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3147ei
    public final void j() {
        ByteBuffer byteBuffer = InterfaceC3147ei.f29965a;
        this.f32758g = byteBuffer;
        this.f32759h = false;
        this.f32757f = byteBuffer;
        C3630nh c3630nh = C3630nh.f32748e;
        this.f32755d = c3630nh;
        this.f32756e = c3630nh;
        this.f32753b = c3630nh;
        this.f32754c = c3630nh;
        n();
    }

    public abstract C3630nh k(C3630nh c3630nh);

    public void l() {
    }

    public void n() {
    }

    public void m() {
    }
}
