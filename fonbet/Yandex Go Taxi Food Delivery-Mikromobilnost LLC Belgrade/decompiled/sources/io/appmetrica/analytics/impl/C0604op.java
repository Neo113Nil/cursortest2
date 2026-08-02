package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.op, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0604op {
    public final C0662qp a = new C0662qp();

    public final StartupParamsItem a(IdentifiersResult identifiersResult) {
        String str = identifiersResult.id;
        C0662qp c0662qp = this.a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        c0662qp.getClass();
        int i = AbstractC0633pp.a[identifierStatus.ordinal()];
        return new StartupParamsItem(str, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? StartupParamsItemStatus.UNKNOWN_ERROR : StartupParamsItemStatus.FORBIDDEN_BY_CLIENT_CONFIG : StartupParamsItemStatus.FEATURE_DISABLED : StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER : StartupParamsItemStatus.PROVIDER_UNAVAILABLE : StartupParamsItemStatus.OK, identifiersResult.errorExplanation);
    }
}
