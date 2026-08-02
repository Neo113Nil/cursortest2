package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0156bq;
import io.appmetrica.analytics.impl.C0185cq;
import io.appmetrica.analytics.impl.C0365j5;
import io.appmetrica.analytics.impl.C0381jl;
import io.appmetrica.analytics.impl.C0454m7;
import io.appmetrica.analytics.impl.Cr;
import io.appmetrica.analytics.impl.InterfaceC0532or;
import io.appmetrica.analytics.impl.Qq;
import io.appmetrica.analytics.impl.X2;
import io.appmetrica.analytics.impl.Zn;

/* loaded from: classes5.dex */
public class StringAttribute {
    private final Qq a;
    private final C0454m7 b;

    public StringAttribute(String str, C0156bq c0156bq, Cr cr, X2 x2) {
        this.b = new C0454m7(str, cr, x2);
        this.a = c0156bq;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValue(@NonNull String str) {
        C0454m7 c0454m7 = this.b;
        return new UserProfileUpdate<>(new C0185cq(c0454m7.c, str, this.a, c0454m7.a, new C0365j5(c0454m7.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValueIfUndefined(@NonNull String str) {
        C0454m7 c0454m7 = this.b;
        return new UserProfileUpdate<>(new C0185cq(c0454m7.c, str, this.a, c0454m7.a, new Zn(c0454m7.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValueReset() {
        C0454m7 c0454m7 = this.b;
        return new UserProfileUpdate<>(new C0381jl(0, c0454m7.c, c0454m7.a, c0454m7.b));
    }
}
