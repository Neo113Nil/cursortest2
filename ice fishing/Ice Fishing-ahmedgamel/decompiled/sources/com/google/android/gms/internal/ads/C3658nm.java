package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3658nm implements InterfaceC3950t8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f33549n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3873rm f33550u;

    public C3658nm(C3873rm c3873rm, String str) {
        this.f33549n = str;
        Objects.requireNonNull(c3873rm);
        this.f33550u = c3873rm;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final void f(C3896s8 c3896s8) {
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33124q2)).booleanValue()) {
            if (c3896s8.f34667j) {
                C3873rm c3873rm = this.f33550u;
                if (c3873rm.f34512w != null) {
                    c3873rm.f34499H.put(this.f33549n, Boolean.TRUE);
                    ?? r02 = c3873rm.f34512w;
                    if (r02 == 0) {
                        return;
                    }
                    c3873rm.t(r02.F0(), r02.g(), r02.n(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c3896s8.f34667j) {
                    C3873rm c3873rm2 = this.f33550u;
                    if (c3873rm2.f34512w != null) {
                        c3873rm2.f34499H.put(this.f33549n, Boolean.TRUE);
                        ?? r03 = c3873rm2.f34512w;
                        if (r03 == 0) {
                        } else {
                            c3873rm2.t(r03.F0(), c3873rm2.f34512w.g(), c3873rm2.f34512w.n(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
