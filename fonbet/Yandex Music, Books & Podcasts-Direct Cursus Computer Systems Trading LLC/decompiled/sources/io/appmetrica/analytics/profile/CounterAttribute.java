package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0287gd;
import io.appmetrica.analytics.impl.C0454m7;
import io.appmetrica.analytics.impl.I6;
import io.appmetrica.analytics.impl.InterfaceC0532or;
import io.appmetrica.analytics.impl.Pc;

/* loaded from: classes5.dex */
public final class CounterAttribute {
    private final C0454m7 a;

    public CounterAttribute(String str, Pc pc, C0287gd c0287gd) {
        this.a = new C0454m7(str, pc, c0287gd);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withDelta(double d) {
        return new UserProfileUpdate<>(new I6(this.a.c, d));
    }
}
