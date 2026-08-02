package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0365j5;
import io.appmetrica.analytics.impl.C0381jl;
import io.appmetrica.analytics.impl.C0454m7;
import io.appmetrica.analytics.impl.Cr;
import io.appmetrica.analytics.impl.InterfaceC0532or;
import io.appmetrica.analytics.impl.M3;
import io.appmetrica.analytics.impl.X2;
import io.appmetrica.analytics.impl.Zn;

/* loaded from: classes5.dex */
public class BooleanAttribute {
    private final C0454m7 a;

    public BooleanAttribute(String str, Cr cr, X2 x2) {
        this.a = new C0454m7(str, cr, x2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValue(boolean z) {
        C0454m7 c0454m7 = this.a;
        return new UserProfileUpdate<>(new M3(c0454m7.c, z, c0454m7.a, new C0365j5(c0454m7.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValueIfUndefined(boolean z) {
        C0454m7 c0454m7 = this.a;
        return new UserProfileUpdate<>(new M3(c0454m7.c, z, c0454m7.a, new Zn(c0454m7.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValueReset() {
        C0454m7 c0454m7 = this.a;
        return new UserProfileUpdate<>(new C0381jl(3, c0454m7.c, c0454m7.a, c0454m7.b));
    }
}
