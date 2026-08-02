package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0555n5;
import io.appmetrica.analytics.impl.C0672r7;
import io.appmetrica.analytics.impl.C0744tl;
import io.appmetrica.analytics.impl.C0776uo;
import io.appmetrica.analytics.impl.Hr;
import io.appmetrica.analytics.impl.M3;
import io.appmetrica.analytics.impl.Vr;
import io.appmetrica.analytics.impl.X2;

/* loaded from: classes4.dex */
public class BooleanAttribute {
    private final C0672r7 a;

    public BooleanAttribute(String str, Vr vr, X2 x2) {
        this.a = new C0672r7(str, vr, x2);
    }

    public UserProfileUpdate<? extends Hr> withValue(boolean z) {
        C0672r7 c0672r7 = this.a;
        return new UserProfileUpdate<>(new M3(c0672r7.c, z, c0672r7.a, new C0555n5(c0672r7.b)));
    }

    public UserProfileUpdate<? extends Hr> withValueIfUndefined(boolean z) {
        C0672r7 c0672r7 = this.a;
        return new UserProfileUpdate<>(new M3(c0672r7.c, z, c0672r7.a, new C0776uo(c0672r7.b)));
    }

    public UserProfileUpdate<? extends Hr> withValueReset() {
        C0672r7 c0672r7 = this.a;
        return new UserProfileUpdate<>(new C0744tl(3, c0672r7.c, c0672r7.a, c0672r7.b));
    }
}
