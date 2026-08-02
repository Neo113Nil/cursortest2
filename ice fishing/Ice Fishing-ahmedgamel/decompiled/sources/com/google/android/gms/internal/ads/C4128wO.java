package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.wO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4128wO implements InterfaceC2999bO {

    /* renamed from: n, reason: collision with root package name */
    public boolean f35601n;

    /* renamed from: u, reason: collision with root package name */
    public long f35602u;

    /* renamed from: v, reason: collision with root package name */
    public long f35603v;

    /* renamed from: w, reason: collision with root package name */
    public C3947t5 f35604w;

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public final void a(C3947t5 c3947t5) {
        if (this.f35601n) {
            b(h());
        }
        this.f35604w = c3947t5;
    }

    public final void b(long j6) {
        this.f35602u = j6;
        if (this.f35601n) {
            this.f35603v = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public final long h() {
        long j6 = this.f35602u;
        if (!this.f35601n) {
            return j6;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f35603v;
        return this.f35604w.f35002a == 1.0f ? AbstractC3182eu.u(elapsedRealtime) + j6 : (elapsedRealtime * r4.f35004c) + j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2999bO
    public final C3947t5 j() {
        return this.f35604w;
    }
}
