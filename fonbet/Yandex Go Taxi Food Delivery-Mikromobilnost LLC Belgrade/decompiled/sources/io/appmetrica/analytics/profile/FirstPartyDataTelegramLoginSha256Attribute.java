package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0382h5;
import io.appmetrica.analytics.impl.C0555n5;
import io.appmetrica.analytics.impl.C0588o9;
import io.appmetrica.analytics.impl.C0672r7;
import io.appmetrica.analytics.impl.C0720sq;
import io.appmetrica.analytics.impl.C0749tq;
import io.appmetrica.analytics.impl.C0823wd;
import io.appmetrica.analytics.impl.C0834wo;
import io.appmetrica.analytics.impl.Hr;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class FirstPartyDataTelegramLoginSha256Attribute {
    private final C0672r7 a = new C0672r7("appmetrica_1pd_telegram_sha256", new C0588o9(), new C0823wd(new C0382h5(100)));
    private final C0834wo b;

    public FirstPartyDataTelegramLoginSha256Attribute(C0834wo c0834wo) {
        this.b = c0834wo;
    }

    public UserProfileUpdate<? extends Hr> withTelegramLoginValues(Iterable<String> iterable) {
        String str = this.a.c;
        ArrayList a = this.b.a(iterable);
        C0749tq c0749tq = new C0749tq(200, "First party data telegram logins attribute", PublicLogger.getAnonymousInstance());
        C0672r7 c0672r7 = this.a;
        return new UserProfileUpdate<>(new C0720sq(str, a, 10, c0749tq, c0672r7.a, new C0555n5(c0672r7.b)));
    }

    public UserProfileUpdate<? extends Hr> withTelegramLoginValues(String... strArr) {
        return withTelegramLoginValues(Arrays.asList(strArr));
    }
}
