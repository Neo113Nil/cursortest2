package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269a5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5551a;

    public C0269a5(String str) {
        this.f5551a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f5551a);
    }
}
