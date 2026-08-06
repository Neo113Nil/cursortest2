package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0733s4;
import io.appmetrica.analytics.impl.C0761t6;
import io.appmetrica.analytics.impl.InterfaceC0391eo;
import io.appmetrica.analytics.impl.InterfaceC0498j2;
import io.appmetrica.analytics.impl.InterfaceC0753so;
import io.appmetrica.analytics.impl.X2;
import io.appmetrica.analytics.impl.Xk;

/* loaded from: classes.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0761t6 f7546a;

    public BooleanAttribute(String str, InterfaceC0753so interfaceC0753so, InterfaceC0498j2 interfaceC0498j2) {
        this.f7546a = new C0761t6(str, interfaceC0753so, interfaceC0498j2);
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValue(boolean z2) {
        C0761t6 c0761t6 = this.f7546a;
        return new UserProfileUpdate<>(new X2(c0761t6.f6936c, z2, c0761t6.f6934a, new C0733s4(c0761t6.f6935b)));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValueIfUndefined(boolean z2) {
        C0761t6 c0761t6 = this.f7546a;
        return new UserProfileUpdate<>(new X2(c0761t6.f6936c, z2, c0761t6.f6934a, new Xk(c0761t6.f6935b)));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValueReset() {
        C0761t6 c0761t6 = this.f7546a;
        return new UserProfileUpdate<>(new Bi(3, c0761t6.f6936c, c0761t6.f6934a, c0761t6.f6935b));
    }
}
