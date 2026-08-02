package io.appmetrica.analytics.blecollecting.impl;

import defpackage.scc;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lio/appmetrica/analytics/blecollecting/impl/k;", "Lio/appmetrica/analytics/coreapi/internal/backport/Provider;", "", "", "a", "<init>", "()V", "ble-collecting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: io.appmetrica.analytics.blecollecting.impl.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C0156k implements Provider<List<? extends String>> {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<String> get() {
        return scc.g("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.BLUETOOTH_ADMIN");
    }
}
