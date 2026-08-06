package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Pk {

    /* renamed from: a, reason: collision with root package name */
    public final Vk f4940a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f4941b;

    public Pk(Ok ok) {
        Vk vk;
        Integer num;
        vk = ok.f4875a;
        this.f4940a = vk;
        num = ok.f4876b;
        this.f4941b = num;
    }

    public static final Ok a(Vk vk) {
        return new Ok(vk);
    }

    public final Vk b() {
        return this.f4940a;
    }

    public final Integer a() {
        return this.f4941b;
    }
}
