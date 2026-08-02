package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0696s2 {
    public final Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
        intent.setAction(str);
        return intent;
    }
}
