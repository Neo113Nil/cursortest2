package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0555n5;
import io.appmetrica.analytics.impl.C0672r7;
import io.appmetrica.analytics.impl.C0744tl;
import io.appmetrica.analytics.impl.C0749tq;
import io.appmetrica.analytics.impl.C0776uo;
import io.appmetrica.analytics.impl.C0778uq;
import io.appmetrica.analytics.impl.Hr;
import io.appmetrica.analytics.impl.InterfaceC0461jr;
import io.appmetrica.analytics.impl.Vr;
import io.appmetrica.analytics.impl.X2;

/* loaded from: classes4.dex */
public class StringAttribute {
    private final InterfaceC0461jr a;
    private final C0672r7 b;

    public StringAttribute(String str, C0749tq c0749tq, Vr vr, X2 x2) {
        this.b = new C0672r7(str, vr, x2);
        this.a = c0749tq;
    }

    public UserProfileUpdate<? extends Hr> withValue(String str) {
        C0672r7 c0672r7 = this.b;
        return new UserProfileUpdate<>(new C0778uq(c0672r7.c, str, this.a, c0672r7.a, new C0555n5(c0672r7.b)));
    }

    public UserProfileUpdate<? extends Hr> withValueIfUndefined(String str) {
        C0672r7 c0672r7 = this.b;
        return new UserProfileUpdate<>(new C0778uq(c0672r7.c, str, this.a, c0672r7.a, new C0776uo(c0672r7.b)));
    }

    public UserProfileUpdate<? extends Hr> withValueReset() {
        C0672r7 c0672r7 = this.b;
        return new UserProfileUpdate<>(new C0744tl(0, c0672r7.c, c0672r7.a, c0672r7.b));
    }
}
