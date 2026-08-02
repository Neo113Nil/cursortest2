package io.appmetrica.analytics.profile;

import defpackage.oyr;
import io.appmetrica.analytics.impl.C0332fd;
import io.appmetrica.analytics.impl.C0382h5;
import io.appmetrica.analytics.impl.C0596oh;
import io.appmetrica.analytics.impl.C0749tq;
import io.appmetrica.analytics.impl.C0823wd;
import io.appmetrica.analytics.impl.C0834wo;
import io.appmetrica.analytics.impl.J9;
import io.appmetrica.analytics.impl.Jq;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes4.dex */
public final class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C0332fd(), new C0823wd(new C0382h5(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C0332fd(), new C0823wd(new C0382h5(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C0332fd(), new C0823wd(new C0382h5(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C0749tq(200, oyr.p("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new C0332fd(), new C0823wd(new C0382h5(100)));
    }

    public static FirstPartyDataEmailSha256Attribute emailHash() {
        return new FirstPartyDataEmailSha256Attribute(new C0834wo(new J9()));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute();
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }

    public static FirstPartyDataPhoneSha256Attribute phoneHash() {
        return new FirstPartyDataPhoneSha256Attribute(new C0834wo(new C0596oh()));
    }

    public static FirstPartyDataTelegramLoginSha256Attribute telegramLoginHash() {
        return new FirstPartyDataTelegramLoginSha256Attribute(new C0834wo(new Jq()));
    }
}
