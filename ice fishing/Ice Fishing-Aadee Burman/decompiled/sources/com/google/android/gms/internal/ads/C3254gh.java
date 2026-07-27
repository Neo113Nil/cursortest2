package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3254gh implements InterfaceC3613nH {

    /* renamed from: n, reason: collision with root package name */
    public final VF f30592n;

    /* renamed from: u, reason: collision with root package name */
    public final long f30593u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC3613nH f30594v;

    /* renamed from: w, reason: collision with root package name */
    public long f30595w;

    /* renamed from: x, reason: collision with root package name */
    public Uri f30596x;

    public C3254gh(VF vf, int i, InterfaceC3613nH interfaceC3613nH) {
        this.f30592n = vf;
        this.f30593u = i;
        this.f30594v = interfaceC3613nH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final long g(C2971bJ c2971bJ) {
        C2971bJ c2971bJ2;
        C2971bJ c2971bJ3;
        C2971bJ c2971bJ4;
        Uri uri = c2971bJ.f29279a;
        this.f30596x = uri;
        long j6 = c2971bJ.f29281c;
        long j9 = this.f30593u;
        long j10 = c2971bJ.f29282d;
        if (j6 >= j9) {
            c2971bJ2 = null;
        } else {
            long j11 = j9 - j6;
            if (j10 != -1) {
                j11 = Math.min(j10, j11);
            }
            c2971bJ2 = new C2971bJ(uri, j6, j11);
        }
        if (j10 == -1 || j6 + j10 > j9) {
            c2971bJ3 = c2971bJ2;
            c2971bJ4 = new C2971bJ(uri, Math.max(j9, j6), j10 != -1 ? Math.min(j10, (j6 + j10) - j9) : -1L);
        } else {
            c2971bJ3 = c2971bJ2;
            c2971bJ4 = null;
        }
        long g4 = c2971bJ3 != null ? this.f30592n.g(c2971bJ3) : 0L;
        long g9 = c2971bJ4 != null ? this.f30594v.g(c2971bJ4) : 0L;
        this.f30595w = j6;
        if (g4 == -1 || g9 == -1) {
            return -1L;
        }
        return g4 + g9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Uri i() {
        return this.f30596x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Map j() {
        return C3770qC.f33209z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void k(InterfaceC3727pN interfaceC3727pN) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public final int m(byte[] bArr, int i, int i6) {
        int i9;
        long j6 = this.f30595w;
        long j9 = this.f30593u;
        if (j6 < j9) {
            int m4 = this.f30592n.m(bArr, i, (int) Math.min(i6, j9 - j6));
            long j10 = this.f30595w + m4;
            this.f30595w = j10;
            i9 = m4;
            j6 = j10;
        } else {
            i9 = 0;
        }
        if (j6 < j9) {
            return i9;
        }
        int m9 = this.f30594v.m(bArr, i + i9, i6 - i9);
        int i10 = i9 + m9;
        this.f30595w += m9;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void o() {
        this.f30592n.o();
        this.f30594v.o();
    }
}
