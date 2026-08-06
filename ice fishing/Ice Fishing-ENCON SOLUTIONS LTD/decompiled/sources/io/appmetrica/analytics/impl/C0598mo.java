package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598mo implements Ka {
    @Override // io.appmetrica.analytics.impl.Ka
    public final String a(Context context) {
        IdentifiersResult q2 = new Ve(C0294b4.l().c(context).a(context)).q();
        if (TextUtils.isEmpty(q2.id)) {
            return null;
        }
        return q2.id;
    }
}
