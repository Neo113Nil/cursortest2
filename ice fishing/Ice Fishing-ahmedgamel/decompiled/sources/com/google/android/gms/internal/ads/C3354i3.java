package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3354i3 {

    /* renamed from: a, reason: collision with root package name */
    public final C3406j3 f31763a = new C3406j3();

    /* renamed from: b, reason: collision with root package name */
    public final Cr f31764b = new Cr(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f31765c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f31766d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31767e;

    public final boolean a(K0 k02) {
        int i;
        boolean z6 = this.f31767e;
        Cr cr = this.f31764b;
        if (z6) {
            this.f31767e = false;
            cr.y(0);
        }
        while (true) {
            if (this.f31767e) {
                return true;
            }
            int i4 = this.f31765c;
            C3406j3 c3406j3 = this.f31763a;
            if (i4 < 0) {
                if (!c3406j3.a(k02, -1L) || !c3406j3.b(k02, true)) {
                    break;
                }
                int i6 = c3406j3.f31949d;
                if ((c3406j3.f31946a & 1) == 1 && cr.f24999c == 0) {
                    i6 += b(0);
                    i = this.f31766d;
                } else {
                    i = 0;
                }
                try {
                    k02.a(i6, false);
                    this.f31765c = i;
                    i4 = i;
                } catch (EOFException unused) {
                }
            }
            int b9 = b(i4);
            int i9 = this.f31765c + this.f31766d;
            if (b9 > 0) {
                cr.A(cr.f24999c + b9);
                k02.A(cr.f24997a, cr.f24999c, b9, false);
                cr.C(cr.f24999c + b9);
                this.f31767e = c3406j3.f31951f[i9 + (-1)] != 255;
            }
            if (i9 == c3406j3.f31948c) {
                i9 = -1;
            }
            this.f31765c = i9;
        }
        return false;
    }

    public final int b(int i) {
        int i4;
        int i6 = 0;
        this.f31766d = 0;
        do {
            int i9 = this.f31766d;
            int i10 = i + i9;
            C3406j3 c3406j3 = this.f31763a;
            if (i10 >= c3406j3.f31948c) {
                break;
            }
            this.f31766d = i9 + 1;
            i4 = c3406j3.f31951f[i10];
            i6 += i4;
        } while (i4 == 255);
        return i6;
    }
}
