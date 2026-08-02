package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import defpackage.hrg;
import io.appmetrica.analytics.impl.C0154bo;
import io.appmetrica.analytics.impl.C0156bq;
import io.appmetrica.analytics.impl.C0193d5;
import io.appmetrica.analytics.impl.C0287gd;
import io.appmetrica.analytics.impl.C0646sq;
import io.appmetrica.analytics.impl.D9;
import io.appmetrica.analytics.impl.Pc;
import io.appmetrica.analytics.impl.Yg;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes5.dex */
public final class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String str) {
        return new BooleanAttribute(str, new Pc(), new C0287gd(new C0193d5(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String str) {
        return new CounterAttribute(str, new Pc(), new C0287gd(new C0193d5(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String str) {
        return new NumberAttribute(str, new Pc(), new C0287gd(new C0193d5(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String str) {
        return new StringAttribute(str, new C0156bq(200, hrg.q("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new Pc(), new C0287gd(new C0193d5(100)));
    }

    @NonNull
    public static FirstPartyDataEmailSha256Attribute emailHash() {
        return new FirstPartyDataEmailSha256Attribute(new C0154bo(new D9()));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }

    @NonNull
    public static FirstPartyDataPhoneSha256Attribute phoneHash() {
        return new FirstPartyDataPhoneSha256Attribute(new C0154bo(new Yg()));
    }

    @NonNull
    public static FirstPartyDataTelegramLoginSha256Attribute telegramLoginHash() {
        return new FirstPartyDataTelegramLoginSha256Attribute(new C0154bo(new C0646sq()));
    }
}
