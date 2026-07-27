package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.wO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4105wO implements InterfaceC2976bO {

    /* renamed from: n, reason: collision with root package name */
    public boolean f34832n;

    /* renamed from: u, reason: collision with root package name */
    public long f34833u;

    /* renamed from: v, reason: collision with root package name */
    public long f34834v;

    /* renamed from: w, reason: collision with root package name */
    public C3924t5 f34835w;

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public final void a(C3924t5 c3924t5) {
        if (this.f34832n) {
            b(h());
        }
        this.f34835w = c3924t5;
    }

    public final void b(long j6) {
        this.f34833u = j6;
        if (this.f34832n) {
            this.f34834v = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public final long h() {
        long j6 = this.f34833u;
        if (!this.f34832n) {
            return j6;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f34834v;
        return this.f34835w.f34216a == 1.0f ? AbstractC3159eu.u(elapsedRealtime) + j6 : (elapsedRealtime * r4.f34218c) + j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2976bO
    public final C3924t5 j() {
        return this.f34835w;
    }
}
