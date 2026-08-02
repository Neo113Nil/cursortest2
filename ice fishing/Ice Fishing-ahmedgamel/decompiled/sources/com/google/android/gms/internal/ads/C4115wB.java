package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4115wB {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35571a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35572b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35573c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35574d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f35575e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35576f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35577g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f35578h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f35579j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f35580k;

    /* renamed from: l, reason: collision with root package name */
    public final byte f35581l;

    /* renamed from: m, reason: collision with root package name */
    public final byte f35582m;

    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4115wB(C3200fB c3200fB) {
        byte b9;
        boolean z6 = false;
        AbstractC2792Sd.i(c3200fB.f31021a == 1);
        ByteBuffer byteBuffer = c3200fB.f31022b;
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        C4256yr c4256yr = new C4256yr(bArr, remaining);
        this.f35577g = c4256yr.h(3);
        c4256yr.e();
        boolean g9 = c4256yr.g();
        this.f35571a = g9;
        if (g9) {
            c4256yr.h(5);
            this.f35572b = false;
            this.f35578h = false;
        } else {
            if (c4256yr.g()) {
                c4256yr.f(64);
                if (c4256yr.g()) {
                    int i = 0;
                    while (!c4256yr.g()) {
                        i++;
                    }
                    if (i < 32) {
                        c4256yr.f(i);
                    }
                }
                boolean g10 = c4256yr.g();
                this.f35572b = g10;
                if (g10) {
                    c4256yr.f(47);
                }
            } else {
                this.f35572b = false;
            }
            this.f35578h = c4256yr.g();
            int h3 = c4256yr.h(5);
            for (int i4 = 0; i4 <= h3; i4++) {
                c4256yr.f(12);
                if (i4 == 0) {
                    if (c4256yr.h(5) > 7) {
                        c4256yr.g();
                    }
                } else if (c4256yr.h(5) > 7) {
                    c4256yr.e();
                }
                if (this.f35572b) {
                    c4256yr.e();
                }
                if (this.f35578h && c4256yr.g()) {
                    if (i4 == 0) {
                        c4256yr.h(4);
                    } else {
                        c4256yr.f(4);
                    }
                }
            }
        }
        int h9 = c4256yr.h(4);
        int h10 = c4256yr.h(4);
        c4256yr.f(h9 + 1);
        c4256yr.f(h10 + 1);
        if (this.f35571a) {
            this.f35573c = false;
        } else {
            boolean g11 = c4256yr.g();
            this.f35573c = g11;
            if (g11) {
                c4256yr.f(4);
                c4256yr.f(3);
            }
        }
        c4256yr.f(3);
        if (this.f35571a) {
            this.f35575e = true;
            this.f35574d = true;
            this.f35576f = 0;
        } else {
            c4256yr.f(4);
            boolean g12 = c4256yr.g();
            if (g12) {
                c4256yr.f(2);
            }
            if (c4256yr.g()) {
                this.f35574d = true;
            } else {
                boolean g13 = c4256yr.g();
                this.f35574d = g13;
                if (!g13) {
                    this.f35575e = true;
                    if (g12) {
                        this.f35576f = 0;
                    } else {
                        this.f35576f = c4256yr.h(3) + 1;
                    }
                }
            }
            if (c4256yr.g()) {
                this.f35575e = true;
            } else {
                this.f35575e = c4256yr.g();
            }
            if (g12) {
            }
        }
        c4256yr.f(3);
        boolean g14 = c4256yr.g();
        if (this.f35577g == 2 && g14) {
            this.i = c4256yr.g();
        } else {
            this.i = false;
        }
        if (this.f35577g != 1) {
            this.f35579j = c4256yr.g();
        } else {
            this.f35579j = false;
        }
        if (c4256yr.g()) {
            this.f35581l = (byte) c4256yr.h(8);
            this.f35582m = (byte) c4256yr.h(8);
            b9 = (byte) c4256yr.h(8);
        } else {
            this.f35581l = (byte) 0;
            this.f35582m = (byte) 0;
            b9 = 0;
        }
        if (this.f35579j) {
            c4256yr.e();
            this.f35580k = false;
        } else if (this.f35581l == 1 && this.f35582m == 13 && b9 == 0) {
            this.f35580k = false;
        } else {
            c4256yr.e();
            int i6 = this.f35577g;
            if (i6 == 0) {
                this.f35580k = true;
                z6 = true;
            } else if (i6 == 1) {
                this.f35580k = false;
            } else if (this.i) {
                boolean g15 = c4256yr.g();
                this.f35580k = g15;
                if (g15) {
                    z6 = c4256yr.g();
                }
            } else {
                this.f35580k = true;
            }
            if (this.f35580k && z6) {
                c4256yr.h(2);
            }
        }
        c4256yr.e();
    }
}
