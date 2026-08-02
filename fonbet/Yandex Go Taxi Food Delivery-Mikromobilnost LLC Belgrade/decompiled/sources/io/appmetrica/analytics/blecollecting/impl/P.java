package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.blewrapper.internal.config.ScanSettingsConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes9.dex */
public final class P implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D fromModel(ScanSettingsConfig scanSettingsConfig) {
        D d = new D();
        Integer num = (Integer) Q.b.get(scanSettingsConfig.getCallbackType());
        if (num != null) {
            d.a = num.intValue();
        }
        Integer num2 = (Integer) Q.d.get(scanSettingsConfig.getMatchMode());
        if (num2 != null) {
            d.b = num2.intValue();
        }
        Integer num3 = (Integer) Q.f.get(scanSettingsConfig.getNumOfMatches());
        if (num3 != null) {
            d.c = num3.intValue();
        }
        Integer num4 = (Integer) Q.h.get(scanSettingsConfig.getScanMode());
        if (num4 != null) {
            d.d = num4.intValue();
        }
        d.e = scanSettingsConfig.getReportDelay();
        return d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ScanSettingsConfig toModel(D d) {
        return new ScanSettingsConfig((ScanSettingsConfig.CallbackType) Q.a.get(Integer.valueOf(d.a)), (ScanSettingsConfig.MatchMode) Q.c.get(Integer.valueOf(d.b)), (ScanSettingsConfig.NumOfMatches) Q.e.get(Integer.valueOf(d.c)), (ScanSettingsConfig.ScanMode) Q.g.get(Integer.valueOf(d.d)), d.e);
    }
}
