package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3331i3 {

    /* renamed from: a, reason: collision with root package name */
    public final C3383j3 f30990a = new C3383j3();

    /* renamed from: b, reason: collision with root package name */
    public final Cr f30991b = new Cr(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f30992c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f30993d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30994e;

    public final boolean a(K0 k02) {
        int i;
        boolean z3 = this.f30994e;
        Cr cr = this.f30991b;
        if (z3) {
            this.f30994e = false;
            cr.y(0);
        }
        while (true) {
            if (this.f30994e) {
                return true;
            }
            int i6 = this.f30992c;
            C3383j3 c3383j3 = this.f30990a;
            if (i6 < 0) {
                if (!c3383j3.a(k02, -1L) || !c3383j3.b(k02, true)) {
                    break;
                }
                int i9 = c3383j3.f31162d;
                if ((c3383j3.f31159a & 1) == 1 && cr.f24254c == 0) {
                    i9 += b(0);
                    i = this.f30993d;
                } else {
                    i = 0;
                }
                try {
                    k02.a(i9, false);
                    this.f30992c = i;
                    i6 = i;
                } catch (EOFException unused) {
                }
            }
            int b9 = b(i6);
            int i10 = this.f30992c + this.f30993d;
            if (b9 > 0) {
                cr.A(cr.f24254c + b9);
                k02.z(cr.f24252a, cr.f24254c, b9, false);
                cr.C(cr.f24254c + b9);
                this.f30994e = c3383j3.f31164f[i10 + (-1)] != 255;
            }
            if (i10 == c3383j3.f31161c) {
                i10 = -1;
            }
            this.f30992c = i10;
        }
        return false;
    }

    public final int b(int i) {
        int i6;
        int i9 = 0;
        this.f30993d = 0;
        do {
            int i10 = this.f30993d;
            int i11 = i + i10;
            C3383j3 c3383j3 = this.f30990a;
            if (i11 >= c3383j3.f31161c) {
                break;
            }
            this.f30993d = i10 + 1;
            i6 = c3383j3.f31164f[i11];
            i9 += i6;
        } while (i6 == 255);
        return i9;
    }
}
