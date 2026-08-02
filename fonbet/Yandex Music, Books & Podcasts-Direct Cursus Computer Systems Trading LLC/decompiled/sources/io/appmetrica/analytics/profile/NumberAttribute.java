package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0193d5;
import io.appmetrica.analytics.impl.C0287gd;
import io.appmetrica.analytics.impl.C0365j5;
import io.appmetrica.analytics.impl.C0381jl;
import io.appmetrica.analytics.impl.C0454m7;
import io.appmetrica.analytics.impl.Cg;
import io.appmetrica.analytics.impl.InterfaceC0532or;
import io.appmetrica.analytics.impl.Pc;
import io.appmetrica.analytics.impl.Zn;

/* loaded from: classes5.dex */
public final class NumberAttribute {
    private final C0454m7 a;

    public NumberAttribute(String str, Pc pc, C0287gd c0287gd) {
        this.a = new C0454m7(str, pc, c0287gd);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValue(double d) {
        return new UserProfileUpdate<>(new Cg(this.a.c, d, new Pc(), new C0365j5(new C0287gd(new C0193d5(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new Cg(this.a.c, d, new Pc(), new Zn(new C0287gd(new C0193d5(100)))));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValueReset() {
        return new UserProfileUpdate<>(new C0381jl(1, this.a.c, new Pc(), new C0287gd(new C0193d5(100))));
    }
}
