package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0689qb;
import io.appmetrica.analytics.impl.C0761t6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.InterfaceC0391eo;
import io.appmetrica.analytics.impl.Q5;

/* loaded from: classes.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0761t6 f7547a;

    public CounterAttribute(String str, C0689qb c0689qb, Gb gb) {
        this.f7547a = new C0761t6(str, c0689qb, gb);
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withDelta(double d2) {
        return new UserProfileUpdate<>(new Q5(this.f7547a.f6936c, d2));
    }
}
