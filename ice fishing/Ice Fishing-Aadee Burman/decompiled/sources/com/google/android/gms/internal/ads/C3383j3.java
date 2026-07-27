package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3383j3 {

    /* renamed from: a, reason: collision with root package name */
    public int f31159a;

    /* renamed from: b, reason: collision with root package name */
    public long f31160b;

    /* renamed from: c, reason: collision with root package name */
    public int f31161c;

    /* renamed from: d, reason: collision with root package name */
    public int f31162d;

    /* renamed from: e, reason: collision with root package name */
    public int f31163e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f31164f = new int[com.anythink.basead.exoplayer.k.p.f8473b];

    /* renamed from: g, reason: collision with root package name */
    public final Cr f31165g = new Cr(com.anythink.basead.exoplayer.k.p.f8473b);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r13 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r12.f25819w >= r13) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r0 = java.lang.Math.min(r12.f25822z, 1);
        r12.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r5 = r12;
        r0 = r5.f(r12.f25816n, 0, java.lang.Math.min(1, 4096), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r0 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r5.f25819w += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r0 != (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r5 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(K0 k02, long j6) {
        boolean z3;
        AbstractC2772Sd.i(k02.f25819w == k02.q());
        Cr cr = this.f31165g;
        cr.y(4);
        while (true) {
            if (j6 != -1 && k02.f25819w + 4 >= j6) {
                break;
            }
            try {
                z3 = k02.A(cr.f24252a, 0, 4, true);
            } catch (EOFException unused) {
                z3 = false;
            }
            if (!z3) {
                break;
            }
            cr.E(0);
            if (cr.P() == 1332176723) {
                k02.f25821y = 0;
                return true;
            }
            k02.a(1, false);
        }
    }

    public final boolean b(K0 k02, boolean z3) {
        boolean z6;
        boolean z9;
        this.f31159a = 0;
        this.f31160b = 0L;
        this.f31161c = 0;
        this.f31162d = 0;
        this.f31163e = 0;
        Cr cr = this.f31165g;
        cr.y(27);
        try {
            z6 = k02.A(cr.f24252a, 0, 27, z3);
        } catch (EOFException e9) {
            if (!z3) {
                throw e9;
            }
            z6 = false;
        }
        if (z6 && cr.P() == 1332176723) {
            if (cr.K() == 0) {
                this.f31159a = cr.K();
                this.f31160b = cr.e();
                cr.a();
                cr.a();
                cr.a();
                int K7 = cr.K();
                this.f31161c = K7;
                this.f31162d = K7 + 27;
                cr.y(K7);
                try {
                    z9 = k02.A(cr.f24252a, 0, this.f31161c, z3);
                } catch (EOFException e10) {
                    if (!z3) {
                        throw e10;
                    }
                    z9 = false;
                }
                if (z9) {
                    for (int i = 0; i < this.f31161c; i++) {
                        int K8 = cr.K();
                        this.f31164f[i] = K8;
                        this.f31163e += K8;
                    }
                    return true;
                }
            } else if (!z3) {
                throw U4.c("unsupported bit stream revision");
            }
        }
        return false;
    }
}
