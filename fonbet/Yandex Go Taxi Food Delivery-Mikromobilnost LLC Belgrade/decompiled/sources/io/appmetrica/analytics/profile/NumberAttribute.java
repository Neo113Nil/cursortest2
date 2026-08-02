package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0332fd;
import io.appmetrica.analytics.impl.C0382h5;
import io.appmetrica.analytics.impl.C0555n5;
import io.appmetrica.analytics.impl.C0672r7;
import io.appmetrica.analytics.impl.C0744tl;
import io.appmetrica.analytics.impl.C0776uo;
import io.appmetrica.analytics.impl.C0823wd;
import io.appmetrica.analytics.impl.Hr;
import io.appmetrica.analytics.impl.Tg;

/* loaded from: classes4.dex */
public final class NumberAttribute {
    private final C0672r7 a;

    public NumberAttribute(String str, C0332fd c0332fd, C0823wd c0823wd) {
        this.a = new C0672r7(str, c0332fd, c0823wd);
    }

    public UserProfileUpdate<? extends Hr> withValue(double d) {
        return new UserProfileUpdate<>(new Tg(this.a.c, d, new C0332fd(), new C0555n5(new C0823wd(new C0382h5(100)))));
    }

    public UserProfileUpdate<? extends Hr> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new Tg(this.a.c, d, new C0332fd(), new C0776uo(new C0823wd(new C0382h5(100)))));
    }

    public UserProfileUpdate<? extends Hr> withValueReset() {
        return new UserProfileUpdate<>(new C0744tl(1, this.a.c, new C0332fd(), new C0823wd(new C0382h5(100))));
    }
}
