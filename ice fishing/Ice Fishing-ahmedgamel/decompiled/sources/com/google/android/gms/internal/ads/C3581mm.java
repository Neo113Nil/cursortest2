package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3581mm implements InterfaceC3927t8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f32575n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3797qm f32576u;

    public C3581mm(C3797qm c3797qm, String str) {
        this.f32575n = str;
        Objects.requireNonNull(c3797qm);
        this.f32576u = c3797qm;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final void f(C3873s8 c3873s8) {
        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32344q2)).booleanValue()) {
            if (c3873s8.f33899j) {
                C3797qm c3797qm = this.f32576u;
                if (c3797qm.f33412w != null) {
                    c3797qm.f33399H.put(this.f32575n, Boolean.TRUE);
                    ?? r02 = c3797qm.f33412w;
                    if (r02 == 0) {
                        return;
                    }
                    c3797qm.t(r02.H0(), r02.g(), r02.n(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c3873s8.f33899j) {
                    C3797qm c3797qm2 = this.f32576u;
                    if (c3797qm2.f33412w != null) {
                        c3797qm2.f33399H.put(this.f32575n, Boolean.TRUE);
                        ?? r03 = c3797qm2.f33412w;
                        if (r03 == 0) {
                        } else {
                            c3797qm2.t(r03.H0(), c3797qm2.f33412w.g(), c3797qm2.f33412w.n(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
