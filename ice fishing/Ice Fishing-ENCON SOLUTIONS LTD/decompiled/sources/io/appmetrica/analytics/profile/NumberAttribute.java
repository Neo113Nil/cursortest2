package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0407fe;
import io.appmetrica.analytics.impl.C0578m4;
import io.appmetrica.analytics.impl.C0689qb;
import io.appmetrica.analytics.impl.C0733s4;
import io.appmetrica.analytics.impl.C0761t6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.InterfaceC0391eo;
import io.appmetrica.analytics.impl.Xk;

/* loaded from: classes.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0761t6 f7557a;

    public NumberAttribute(String str, C0689qb c0689qb, Gb gb) {
        this.f7557a = new C0761t6(str, c0689qb, gb);
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValue(double d2) {
        return new UserProfileUpdate<>(new C0407fe(this.f7557a.f6936c, d2, new C0689qb(), new C0733s4(new Gb(new C0578m4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValueIfUndefined(double d2) {
        return new UserProfileUpdate<>(new C0407fe(this.f7557a.f6936c, d2, new C0689qb(), new Xk(new Gb(new C0578m4(100)))));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValueReset() {
        return new UserProfileUpdate<>(new Bi(1, this.f7557a.f6936c, new C0689qb(), new Gb(new C0578m4(100))));
    }
}
