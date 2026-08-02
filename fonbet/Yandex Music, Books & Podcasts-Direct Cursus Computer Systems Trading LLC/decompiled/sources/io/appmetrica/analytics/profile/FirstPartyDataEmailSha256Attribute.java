package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0127aq;
import io.appmetrica.analytics.impl.C0154bo;
import io.appmetrica.analytics.impl.C0156bq;
import io.appmetrica.analytics.impl.C0193d5;
import io.appmetrica.analytics.impl.C0287gd;
import io.appmetrica.analytics.impl.C0341i9;
import io.appmetrica.analytics.impl.C0365j5;
import io.appmetrica.analytics.impl.C0454m7;
import io.appmetrica.analytics.impl.InterfaceC0532or;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class FirstPartyDataEmailSha256Attribute {
    private final C0454m7 a = new C0454m7("appmetrica_1pd_email_sha256", new C0341i9(), new C0287gd(new C0193d5(100)));
    private final C0154bo b;

    public FirstPartyDataEmailSha256Attribute(C0154bo c0154bo) {
        this.b = c0154bo;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withEmailValues(@NonNull Iterable<String> iterable) {
        String str = this.a.c;
        ArrayList a = this.b.a(iterable);
        C0156bq c0156bq = new C0156bq(200, "First party data emails attribute", PublicLogger.getAnonymousInstance());
        C0454m7 c0454m7 = this.a;
        return new UserProfileUpdate<>(new C0127aq(str, a, 10, c0156bq, c0454m7.a, new C0365j5(c0454m7.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withEmailValues(@NonNull String... strArr) {
        return withEmailValues(Arrays.asList(strArr));
    }
}
