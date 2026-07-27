package com.anythink.expressad.out;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20186a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20187b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20188c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20189d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20190e = 5;

    /* renamed from: f, reason: collision with root package name */
    private int f20191f;

    /* renamed from: g, reason: collision with root package name */
    private int f20192g;

    public i(int i, int i4) {
        if (i == 1) {
            this.f20191f = 90;
            this.f20192g = 320;
            return;
        }
        if (i == 2) {
            this.f20191f = 250;
            this.f20192g = 300;
            return;
        }
        if (i == 3) {
            if (com.anythink.expressad.foundation.h.n.g(com.anythink.core.common.d.t.b().g()) < 720) {
                this.f20191f = 50;
                this.f20192g = 320;
                return;
            } else {
                this.f20191f = 90;
                this.f20192g = 728;
                return;
            }
        }
        if (i == 4) {
            this.f20191f = 50;
            this.f20192g = 320;
        } else {
            if (i != 5) {
                return;
            }
            this.f20191f = i4;
            this.f20192g = 0;
        }
    }

    private void c() {
        if (com.anythink.expressad.foundation.h.n.g(com.anythink.core.common.d.t.b().g()) < 720) {
            this.f20191f = 50;
            this.f20192g = 320;
        } else {
            this.f20191f = 90;
            this.f20192g = 728;
        }
    }

    public final int a() {
        return this.f20191f;
    }

    public final int b() {
        return this.f20192g;
    }
}
