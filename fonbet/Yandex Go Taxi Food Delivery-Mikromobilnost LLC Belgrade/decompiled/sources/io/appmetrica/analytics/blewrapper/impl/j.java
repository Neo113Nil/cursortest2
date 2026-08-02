package io.appmetrica.analytics.blewrapper.impl;

import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import java.util.List;

/* loaded from: classes4.dex */
public final class j implements Provider {
    public final ScanResult a;

    public j(ScanResult scanResult) {
        this.a = scanResult;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<ParcelUuid> get() {
        return new l(this.a).get();
    }
}
