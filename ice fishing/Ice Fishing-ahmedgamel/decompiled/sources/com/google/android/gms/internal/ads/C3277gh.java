package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3277gh implements InterfaceC3636nH {

    /* renamed from: n, reason: collision with root package name */
    public final VF f31359n;

    /* renamed from: u, reason: collision with root package name */
    public final long f31360u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC3636nH f31361v;

    /* renamed from: w, reason: collision with root package name */
    public long f31362w;

    /* renamed from: x, reason: collision with root package name */
    public Uri f31363x;

    public C3277gh(VF vf, int i, InterfaceC3636nH interfaceC3636nH) {
        this.f31359n = vf;
        this.f31360u = i;
        this.f31361v = interfaceC3636nH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final long b(C2994bJ c2994bJ) {
        C2994bJ c2994bJ2;
        C2994bJ c2994bJ3;
        C2994bJ c2994bJ4;
        Uri uri = c2994bJ.f30067a;
        this.f31363x = uri;
        long j6 = c2994bJ.f30069c;
        long j9 = this.f31360u;
        long j10 = c2994bJ.f30070d;
        if (j6 >= j9) {
            c2994bJ2 = null;
        } else {
            long j11 = j9 - j6;
            if (j10 != -1) {
                j11 = Math.min(j10, j11);
            }
            c2994bJ2 = new C2994bJ(uri, j6, j11);
        }
        if (j10 == -1 || j6 + j10 > j9) {
            c2994bJ3 = c2994bJ2;
            c2994bJ4 = new C2994bJ(uri, Math.max(j9, j6), j10 != -1 ? Math.min(j10, (j6 + j10) - j9) : -1L);
        } else {
            c2994bJ3 = c2994bJ2;
            c2994bJ4 = null;
        }
        long b9 = c2994bJ3 != null ? this.f31359n.b(c2994bJ3) : 0L;
        long b10 = c2994bJ4 != null ? this.f31361v.b(c2994bJ4) : 0L;
        this.f31362w = j6;
        if (b9 == -1 || b10 == -1) {
            return -1L;
        }
        return b9 + b10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Uri i() {
        return this.f31363x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Map j() {
        return C3793qC.f33993z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void m(InterfaceC3750pN interfaceC3750pN) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void o() {
        this.f31359n.o();
        this.f31361v.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public final int r(byte[] bArr, int i, int i4) {
        int i6;
        long j6 = this.f31362w;
        long j9 = this.f31360u;
        if (j6 < j9) {
            int r9 = this.f31359n.r(bArr, i, (int) Math.min(i4, j9 - j6));
            long j10 = this.f31362w + r9;
            this.f31362w = j10;
            i6 = r9;
            j6 = j10;
        } else {
            i6 = 0;
        }
        if (j6 < j9) {
            return i6;
        }
        int r10 = this.f31361v.r(bArr, i + i6, i4 - i6);
        int i9 = i6 + r10;
        this.f31362w += r10;
        return i9;
    }
}
