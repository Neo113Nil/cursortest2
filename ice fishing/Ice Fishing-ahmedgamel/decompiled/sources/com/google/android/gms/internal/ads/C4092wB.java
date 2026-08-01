package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4092wB {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f34802a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34803b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34804c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34805d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34806e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34807f;

    /* renamed from: g, reason: collision with root package name */
    public final int f34808g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f34809h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f34810j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f34811k;

    /* renamed from: l, reason: collision with root package name */
    public final byte f34812l;

    /* renamed from: m, reason: collision with root package name */
    public final byte f34813m;

    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4092wB(C3177fB c3177fB) {
        byte b9;
        boolean z3 = false;
        AbstractC2772Sd.i(c3177fB.f30234a == 1);
        ByteBuffer byteBuffer = c3177fB.f30235b;
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        C4233yr c4233yr = new C4233yr(bArr, remaining);
        this.f34808g = c4233yr.h(3);
        c4233yr.e();
        boolean g4 = c4233yr.g();
        this.f34802a = g4;
        if (g4) {
            c4233yr.h(5);
            this.f34803b = false;
            this.f34809h = false;
        } else {
            if (c4233yr.g()) {
                c4233yr.f(64);
                if (c4233yr.g()) {
                    int i = 0;
                    while (!c4233yr.g()) {
                        i++;
                    }
                    if (i < 32) {
                        c4233yr.f(i);
                    }
                }
                boolean g9 = c4233yr.g();
                this.f34803b = g9;
                if (g9) {
                    c4233yr.f(47);
                }
            } else {
                this.f34803b = false;
            }
            this.f34809h = c4233yr.g();
            int h9 = c4233yr.h(5);
            for (int i6 = 0; i6 <= h9; i6++) {
                c4233yr.f(12);
                if (i6 == 0) {
                    if (c4233yr.h(5) > 7) {
                        c4233yr.g();
                    }
                } else if (c4233yr.h(5) > 7) {
                    c4233yr.e();
                }
                if (this.f34803b) {
                    c4233yr.e();
                }
                if (this.f34809h && c4233yr.g()) {
                    if (i6 == 0) {
                        c4233yr.h(4);
                    } else {
                        c4233yr.f(4);
                    }
                }
            }
        }
        int h10 = c4233yr.h(4);
        int h11 = c4233yr.h(4);
        c4233yr.f(h10 + 1);
        c4233yr.f(h11 + 1);
        if (this.f34802a) {
            this.f34804c = false;
        } else {
            boolean g10 = c4233yr.g();
            this.f34804c = g10;
            if (g10) {
                c4233yr.f(4);
                c4233yr.f(3);
            }
        }
        c4233yr.f(3);
        if (this.f34802a) {
            this.f34806e = true;
            this.f34805d = true;
            this.f34807f = 0;
        } else {
            c4233yr.f(4);
            boolean g11 = c4233yr.g();
            if (g11) {
                c4233yr.f(2);
            }
            if (c4233yr.g()) {
                this.f34805d = true;
            } else {
                boolean g12 = c4233yr.g();
                this.f34805d = g12;
                if (!g12) {
                    this.f34806e = true;
                    if (g11) {
                        this.f34807f = 0;
                    } else {
                        this.f34807f = c4233yr.h(3) + 1;
                    }
                }
            }
            if (c4233yr.g()) {
                this.f34806e = true;
            } else {
                this.f34806e = c4233yr.g();
            }
            if (g11) {
            }
        }
        c4233yr.f(3);
        boolean g13 = c4233yr.g();
        if (this.f34808g == 2 && g13) {
            this.i = c4233yr.g();
        } else {
            this.i = false;
        }
        if (this.f34808g != 1) {
            this.f34810j = c4233yr.g();
        } else {
            this.f34810j = false;
        }
        if (c4233yr.g()) {
            this.f34812l = (byte) c4233yr.h(8);
            this.f34813m = (byte) c4233yr.h(8);
            b9 = (byte) c4233yr.h(8);
        } else {
            this.f34812l = (byte) 0;
            this.f34813m = (byte) 0;
            b9 = 0;
        }
        if (this.f34810j) {
            c4233yr.e();
            this.f34811k = false;
        } else if (this.f34812l == 1 && this.f34813m == 13 && b9 == 0) {
            this.f34811k = false;
        } else {
            c4233yr.e();
            int i9 = this.f34808g;
            if (i9 == 0) {
                this.f34811k = true;
                z3 = true;
            } else if (i9 == 1) {
                this.f34811k = false;
            } else if (this.i) {
                boolean g14 = c4233yr.g();
                this.f34811k = g14;
                if (g14) {
                    z3 = c4233yr.g();
                }
            } else {
                this.f34811k = true;
            }
            if (this.f34811k && z3) {
                c4233yr.h(2);
            }
        }
        c4233yr.e();
    }
}
