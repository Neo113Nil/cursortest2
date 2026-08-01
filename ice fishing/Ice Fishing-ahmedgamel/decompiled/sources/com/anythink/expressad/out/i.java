package com.anythink.expressad.out;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20028a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20029b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20030c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20031d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20032e = 5;

    /* renamed from: f, reason: collision with root package name */
    private int f20033f;

    /* renamed from: g, reason: collision with root package name */
    private int f20034g;

    public i(int i, int i6) {
        if (i == 1) {
            this.f20033f = 90;
            this.f20034g = 320;
            return;
        }
        if (i == 2) {
            this.f20033f = 250;
            this.f20034g = 300;
            return;
        }
        if (i == 3) {
            if (com.anythink.expressad.foundation.h.n.g(com.anythink.core.common.d.t.b().g()) < 720) {
                this.f20033f = 50;
                this.f20034g = 320;
                return;
            } else {
                this.f20033f = 90;
                this.f20034g = 728;
                return;
            }
        }
        if (i == 4) {
            this.f20033f = 50;
            this.f20034g = 320;
        } else {
            if (i != 5) {
                return;
            }
            this.f20033f = i6;
            this.f20034g = 0;
        }
    }

    private void c() {
        if (com.anythink.expressad.foundation.h.n.g(com.anythink.core.common.d.t.b().g()) < 720) {
            this.f20033f = 50;
            this.f20034g = 320;
        } else {
            this.f20033f = 90;
            this.f20034g = 728;
        }
    }

    public final int a() {
        return this.f20033f;
    }

    public final int b() {
        return this.f20034g;
    }
}
