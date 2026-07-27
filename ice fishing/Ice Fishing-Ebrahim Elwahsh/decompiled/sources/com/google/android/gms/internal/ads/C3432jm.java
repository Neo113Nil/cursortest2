package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3432jm implements InterfaceC3725p8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f32191n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3648nm f32192u;

    public C3432jm(C3648nm c3648nm, String str) {
        this.f32191n = str;
        Objects.requireNonNull(c3648nm);
        this.f32192u = c3648nm;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.Mm, com.google.android.gms.internal.ads.f8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final void A(C3671o8 c3671o8) {
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31763q2)).booleanValue()) {
            if (c3671o8.f33111j) {
                C3648nm c3648nm = this.f32192u;
                if (c3648nm.f33016w != null) {
                    c3648nm.f33003H.put(this.f32191n, Boolean.TRUE);
                    ?? r02 = c3648nm.f33016w;
                    if (r02 == 0) {
                        return;
                    }
                    c3648nm.t(r02.A0(), r02.l(), r02.h(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c3671o8.f33111j) {
                    C3648nm c3648nm2 = this.f32192u;
                    if (c3648nm2.f33016w != null) {
                        c3648nm2.f33003H.put(this.f32191n, Boolean.TRUE);
                        ?? r03 = c3648nm2.f33016w;
                        if (r03 == 0) {
                        } else {
                            c3648nm2.t(r03.A0(), c3648nm2.f33016w.l(), c3648nm2.f33016w.h(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
