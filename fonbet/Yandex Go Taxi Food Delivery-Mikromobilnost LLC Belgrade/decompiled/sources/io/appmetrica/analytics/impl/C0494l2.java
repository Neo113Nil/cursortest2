package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.evu0;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.internal.AppMetricaMainProcessService;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.l2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0494l2 implements InterfaceC0891yn {
    public final String a = "ro.yndx.iaa.main_process";
    public final String b = "debug.yndx.iaa.main_process";

    @Override // io.appmetrica.analytics.impl.InterfaceC0891yn
    public final C0862xn a(Context context) {
        String packageName = context.getPackageName();
        String readSystemProperty = SystemPropertiesHelper.readSystemProperty(this.a);
        String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty(this.b);
        if (evu0.J(readSystemProperty)) {
            readSystemProperty = readSystemProperty2;
        }
        return new C0862xn(packageName, "1".equals(readSystemProperty) ? AppMetricaMainProcessService.class : AppMetricaService.class);
    }
}
