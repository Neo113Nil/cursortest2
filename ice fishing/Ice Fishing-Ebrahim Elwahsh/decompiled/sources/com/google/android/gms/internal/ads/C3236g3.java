package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3236g3 {

    /* renamed from: a, reason: collision with root package name */
    public final C3290h3 f30943a = new C3290h3();

    /* renamed from: b, reason: collision with root package name */
    public final Lr f30944b = new Lr(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f30945c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f30946d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30947e;

    public final boolean a(J0 j02) {
        int i;
        boolean z8 = this.f30947e;
        Lr lr = this.f30944b;
        if (z8) {
            this.f30947e = false;
            lr.y(0);
        }
        while (true) {
            if (this.f30947e) {
                return true;
            }
            int i4 = this.f30945c;
            C3290h3 c3290h3 = this.f30943a;
            if (i4 < 0) {
                if (!c3290h3.a(j02, -1L) || !c3290h3.b(j02, true)) {
                    break;
                }
                int i9 = c3290h3.f31139d;
                if ((c3290h3.f31136a & 1) == 1 && lr.f26235c == 0) {
                    i9 += b(0);
                    i = this.f30946d;
                } else {
                    i = 0;
                }
                try {
                    j02.b(i9, false);
                    this.f30945c = i;
                    i4 = i;
                } catch (EOFException unused) {
                }
            }
            int b9 = b(i4);
            int i10 = this.f30945c + this.f30946d;
            if (b9 > 0) {
                lr.A(lr.f26235c + b9);
                j02.E(lr.f26233a, lr.f26235c, b9, false);
                lr.C(lr.f26235c + b9);
                this.f30947e = c3290h3.f31141f[i10 + (-1)] != 255;
            }
            if (i10 == c3290h3.f31138c) {
                i10 = -1;
            }
            this.f30945c = i10;
        }
        return false;
    }

    public final int b(int i) {
        int i4;
        int i9 = 0;
        this.f30946d = 0;
        do {
            int i10 = this.f30946d;
            int i11 = i + i10;
            C3290h3 c3290h3 = this.f30943a;
            if (i11 >= c3290h3.f31138c) {
                break;
            }
            this.f30946d = i10 + 1;
            i4 = c3290h3.f31141f[i11];
            i9 += i4;
        } while (i4 == 255);
        return i9;
    }
}
