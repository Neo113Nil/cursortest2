package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0733s4;
import io.appmetrica.analytics.impl.C0761t6;
import io.appmetrica.analytics.impl.InterfaceC0391eo;
import io.appmetrica.analytics.impl.InterfaceC0498j2;
import io.appmetrica.analytics.impl.InterfaceC0753so;
import io.appmetrica.analytics.impl.Ln;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Ym;

/* loaded from: classes.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final Ln f7558a;

    /* renamed from: b, reason: collision with root package name */
    private final C0761t6 f7559b;

    public StringAttribute(String str, Xm xm, InterfaceC0753so interfaceC0753so, InterfaceC0498j2 interfaceC0498j2) {
        this.f7559b = new C0761t6(str, interfaceC0753so, interfaceC0498j2);
        this.f7558a = xm;
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValue(String str) {
        C0761t6 c0761t6 = this.f7559b;
        return new UserProfileUpdate<>(new Ym(c0761t6.f6936c, str, this.f7558a, c0761t6.f6934a, new C0733s4(c0761t6.f6935b)));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValueIfUndefined(String str) {
        C0761t6 c0761t6 = this.f7559b;
        return new UserProfileUpdate<>(new Ym(c0761t6.f6936c, str, this.f7558a, c0761t6.f6934a, new Xk(c0761t6.f6935b)));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValueReset() {
        C0761t6 c0761t6 = this.f7559b;
        return new UserProfileUpdate<>(new Bi(0, c0761t6.f6936c, c0761t6.f6934a, c0761t6.f6935b));
    }
}
