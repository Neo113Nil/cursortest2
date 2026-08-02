package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.AppMetricaService;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0829z8 implements InterfaceC0297gn {

    @NotNull
    public static final C0801y8 a = new C0801y8();

    @NotNull
    public static final String b = "appmetrica";

    @Override // io.appmetrica.analytics.impl.InterfaceC0297gn
    @NotNull
    public final C0268fn a(@NotNull Context context) {
        return new C0268fn(context.getPackageName(), AppMetricaService.class);
    }
}
