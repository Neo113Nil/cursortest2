package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.internal.AppMetricaMainProcessService;
import io.appmetrica.analytics.internal.AppMetricaService;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.l2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0420l2 implements InterfaceC0297gn {
    public final String a = "ro.yndx.iaa.main_process";
    public final String b = "debug.yndx.iaa.main_process";

    @Override // io.appmetrica.analytics.impl.InterfaceC0297gn
    @NotNull
    public final C0268fn a(@NotNull Context context) {
        String packageName = context.getPackageName();
        String readSystemProperty = SystemPropertiesHelper.readSystemProperty(this.a);
        String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty(this.b);
        if (StringsKt.U(readSystemProperty)) {
            readSystemProperty = readSystemProperty2;
        }
        return new C0268fn(packageName, "1".equals(readSystemProperty) ? AppMetricaMainProcessService.class : AppMetricaService.class);
    }
}
