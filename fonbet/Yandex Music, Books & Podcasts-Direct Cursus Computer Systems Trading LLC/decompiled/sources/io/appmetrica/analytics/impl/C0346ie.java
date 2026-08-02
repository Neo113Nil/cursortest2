package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import ru.yandex.quasar.glagol.impl.ConversationImpl;

/* renamed from: io.appmetrica.analytics.impl.ie, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0346ie {
    public final C0156bq a;
    public final C0156bq b;
    public final C0193d5 c;
    public final PublicLogger d;
    public final String e;

    public C0346ie(String str, PublicLogger publicLogger) {
        this(new C0193d5(30), new C0156bq(50, str.concat("map key"), publicLogger), new C0156bq(ConversationImpl.INCORRECT_TOKEN, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public C0346ie(C0193d5 c0193d5, C0156bq c0156bq, C0156bq c0156bq2, String str, PublicLogger publicLogger) {
        this.c = c0193d5;
        this.a = c0156bq;
        this.b = c0156bq2;
        this.e = str;
        this.d = publicLogger;
    }
}
