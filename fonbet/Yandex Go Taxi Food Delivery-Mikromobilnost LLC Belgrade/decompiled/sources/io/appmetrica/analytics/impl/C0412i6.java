package io.appmetrica.analytics.impl;

import defpackage.oyr;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0412i6 {
    public final PublicLogger a;

    public C0412i6(String str) {
        this.a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i) {
        if (i < 100) {
            this.a.warning(oyr.j(i, "Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: ", ". Default value (100) will be used"), new Object[0]);
            return 100;
        }
        if (i <= 10000) {
            return i;
        }
        this.a.warning(oyr.j(i, "Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: ", ". Default value (10000) will be used"), new Object[0]);
        return 10000;
    }
}
