package com.anythink.expressad.out;

/* loaded from: classes.dex */
public enum u {
    FloatBall(1),
    BigView(4),
    MediumView(3),
    SmallView(2);


    /* renamed from: e, reason: collision with root package name */
    private int f20072e;

    u(int i) {
        this.f20072e = i;
    }

    private static /* synthetic */ u[] b() {
        return new u[]{FloatBall, BigView, MediumView, SmallView};
    }

    public final int a() {
        return this.f20072e;
    }
}
