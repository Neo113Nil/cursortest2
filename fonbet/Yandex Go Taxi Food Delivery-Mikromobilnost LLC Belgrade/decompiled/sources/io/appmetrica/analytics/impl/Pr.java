package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes9.dex */
public final class Pr implements InterfaceC0504lc {
    @Override // io.appmetrica.analytics.impl.InterfaceC0504lc
    public final String a(Context context) {
        IdentifiersResult q = V4.l().b(context).q();
        if (StringUtils.isNullOrEmpty(q.id)) {
            return null;
        }
        return q.id;
    }
}
