package io.appmetrica.analytics.blewrapper.impl;

import android.bluetooth.le.ScanResult;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a implements Provider {
    public final ScanResult a;

    public a(ScanResult scanResult) {
        this.a = scanResult;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<Integer, byte[]> get() {
        return AndroidUtils.isApiAchieved(33) ? new c(this.a).get() : new b().get();
    }
}
