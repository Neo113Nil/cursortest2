package com.anythink.expressad.out;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20815a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f20816b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20817c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20818d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20819e = 5;

    /* renamed from: f, reason: collision with root package name */
    private int f20820f;

    /* renamed from: g, reason: collision with root package name */
    private int f20821g;

    public i(int i, int i4) {
        if (i == 1) {
            this.f20820f = 90;
            this.f20821g = 320;
            return;
        }
        if (i == 2) {
            this.f20820f = 250;
            this.f20821g = 300;
            return;
        }
        if (i == 3) {
            if (com.anythink.expressad.foundation.h.n.g(com.anythink.core.common.d.t.b().g()) < 720) {
                this.f20820f = 50;
                this.f20821g = 320;
                return;
            } else {
                this.f20820f = 90;
                this.f20821g = 728;
                return;
            }
        }
        if (i == 4) {
            this.f20820f = 50;
            this.f20821g = 320;
        } else {
            if (i != 5) {
                return;
            }
            this.f20820f = i4;
            this.f20821g = 0;
        }
    }

    private void c() {
        if (com.anythink.expressad.foundation.h.n.g(com.anythink.core.common.d.t.b().g()) < 720) {
            this.f20820f = 50;
            this.f20821g = 320;
        } else {
            this.f20820f = 90;
            this.f20821g = 728;
        }
    }

    public final int a() {
        return this.f20820f;
    }

    public final int b() {
        return this.f20821g;
    }
}
