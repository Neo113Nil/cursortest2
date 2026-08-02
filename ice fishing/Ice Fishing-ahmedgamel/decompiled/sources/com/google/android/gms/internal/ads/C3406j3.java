package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3406j3 {

    /* renamed from: a, reason: collision with root package name */
    public int f31946a;

    /* renamed from: b, reason: collision with root package name */
    public long f31947b;

    /* renamed from: c, reason: collision with root package name */
    public int f31948c;

    /* renamed from: d, reason: collision with root package name */
    public int f31949d;

    /* renamed from: e, reason: collision with root package name */
    public int f31950e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f31951f = new int[com.anythink.basead.exoplayer.k.p.f9259b];

    /* renamed from: g, reason: collision with root package name */
    public final Cr f31952g = new Cr(com.anythink.basead.exoplayer.k.p.f9259b);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r13 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r12.f26571w >= r13) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r0 = java.lang.Math.min(r12.f26574z, 1);
        r12.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r5 = r12;
        r0 = r5.g(r12.f26568n, 0, java.lang.Math.min(1, 4096), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r0 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r5.f26571w += r0;
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
        boolean z6;
        AbstractC2792Sd.i(k02.f26571w == k02.q());
        Cr cr = this.f31952g;
        cr.y(4);
        while (true) {
            if (j6 != -1 && k02.f26571w + 4 >= j6) {
                break;
            }
            try {
                z6 = k02.E(cr.f24997a, 0, 4, true);
            } catch (EOFException unused) {
                z6 = false;
            }
            if (!z6) {
                break;
            }
            cr.E(0);
            if (cr.P() == 1332176723) {
                k02.f26573y = 0;
                return true;
            }
            k02.a(1, false);
        }
    }

    public final boolean b(K0 k02, boolean z6) {
        boolean z9;
        boolean z10;
        this.f31946a = 0;
        this.f31947b = 0L;
        this.f31948c = 0;
        this.f31949d = 0;
        this.f31950e = 0;
        Cr cr = this.f31952g;
        cr.y(27);
        try {
            z9 = k02.E(cr.f24997a, 0, 27, z6);
        } catch (EOFException e9) {
            if (!z6) {
                throw e9;
            }
            z9 = false;
        }
        if (z9 && cr.P() == 1332176723) {
            if (cr.K() == 0) {
                this.f31946a = cr.K();
                this.f31947b = cr.e();
                cr.a();
                cr.a();
                cr.a();
                int K7 = cr.K();
                this.f31948c = K7;
                this.f31949d = K7 + 27;
                cr.y(K7);
                try {
                    z10 = k02.E(cr.f24997a, 0, this.f31948c, z6);
                } catch (EOFException e10) {
                    if (!z6) {
                        throw e10;
                    }
                    z10 = false;
                }
                if (z10) {
                    for (int i = 0; i < this.f31948c; i++) {
                        int K8 = cr.K();
                        this.f31951f[i] = K8;
                        this.f31950e += K8;
                    }
                    return true;
                }
            } else if (!z6) {
                throw U4.c("unsupported bit stream revision");
            }
        }
        return false;
    }
}
