package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.wr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0763wr implements Wb {
    @Override // io.appmetrica.analytics.impl.Wb
    public final String a(@NonNull Context context) {
        IdentifiersResult q = new C0608rh(R4.l().c(context).a(context)).q();
        if (TextUtils.isEmpty(q.id)) {
            return null;
        }
        return q.id;
    }
}
