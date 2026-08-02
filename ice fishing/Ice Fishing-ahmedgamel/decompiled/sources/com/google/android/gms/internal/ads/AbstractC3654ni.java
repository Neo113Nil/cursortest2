package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.ni, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3654ni implements InterfaceC3170ei {

    /* renamed from: b, reason: collision with root package name */
    public C3653nh f33540b;

    /* renamed from: c, reason: collision with root package name */
    public C3653nh f33541c;

    /* renamed from: d, reason: collision with root package name */
    public C3653nh f33542d;

    /* renamed from: e, reason: collision with root package name */
    public C3653nh f33543e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f33544f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f33545g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33546h;

    public AbstractC3654ni() {
        ByteBuffer byteBuffer = InterfaceC3170ei.f30756a;
        this.f33544f = byteBuffer;
        this.f33545g = byteBuffer;
        C3653nh c3653nh = C3653nh.f33535e;
        this.f33542d = c3653nh;
        this.f33543e = c3653nh;
        this.f33540b = c3653nh;
        this.f33541c = c3653nh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final C3653nh c(C3653nh c3653nh) {
        this.f33542d = c3653nh;
        this.f33543e = k(c3653nh);
        return i() ? this.f33543e : C3653nh.f33535e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void d() {
        this.f33546h = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.f33545g;
        this.f33545g = InterfaceC3170ei.f30756a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void f(C2660Kh c2660Kh) {
        this.f33545g = InterfaceC3170ei.f30756a;
        this.f33546h = false;
        this.f33540b = this.f33542d;
        this.f33541c = this.f33543e;
        m();
    }

    public final ByteBuffer g(int i) {
        if (this.f33544f.capacity() < i) {
            this.f33544f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f33544f.clear();
        }
        ByteBuffer byteBuffer = this.f33544f;
        this.f33545g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public boolean h() {
        return this.f33546h && this.f33545g == InterfaceC3170ei.f30756a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public boolean i() {
        return this.f33543e != C3653nh.f33535e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3170ei
    public final void j() {
        ByteBuffer byteBuffer = InterfaceC3170ei.f30756a;
        this.f33545g = byteBuffer;
        this.f33546h = false;
        this.f33544f = byteBuffer;
        C3653nh c3653nh = C3653nh.f33535e;
        this.f33542d = c3653nh;
        this.f33543e = c3653nh;
        this.f33540b = c3653nh;
        this.f33541c = c3653nh;
        n();
    }

    public abstract C3653nh k(C3653nh c3653nh);

    public void l() {
    }

    public void n() {
    }

    public void m() {
    }
}
