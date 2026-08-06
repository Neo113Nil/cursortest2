package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0272a8;
import io.appmetrica.analytics.impl.C0578m4;
import io.appmetrica.analytics.impl.C0733s4;
import io.appmetrica.analytics.impl.C0761t6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.InterfaceC0391eo;
import io.appmetrica.analytics.impl.Wm;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class FirstPartyDataEmailSha256Attribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0761t6 f7548a = new C0761t6("appmetrica_1pd_email_sha256", new C0272a8(), new Gb(new C0578m4(100)));

    /* renamed from: b, reason: collision with root package name */
    private final Yk f7549b;

    public FirstPartyDataEmailSha256Attribute(Yk yk) {
        this.f7549b = yk;
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withEmailValues(String... strArr) {
        return withEmailValues(Arrays.asList(strArr));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withEmailValues(Iterable<String> iterable) {
        String str = this.f7548a.f6936c;
        ArrayList a2 = this.f7549b.a(iterable);
        Xm xm = new Xm(200, "First party data emails attribute", PublicLogger.getAnonymousInstance());
        C0761t6 c0761t6 = this.f7548a;
        return new UserProfileUpdate<>(new Wm(str, a2, 10, xm, c0761t6.f6934a, new C0733s4(c0761t6.f6935b)));
    }
}
