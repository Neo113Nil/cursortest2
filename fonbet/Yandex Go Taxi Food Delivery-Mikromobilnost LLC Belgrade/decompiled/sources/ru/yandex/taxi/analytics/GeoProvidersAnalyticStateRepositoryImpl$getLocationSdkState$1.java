package ru.yandex.taxi.analytics;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.analytics.GeoProvidersAnalyticStateRepositoryImpl", f = "GeoProvidersAnalyticStateRepositoryImpl.kt", l = {BuildConfig.API_LEVEL}, m = "getLocationSdkState", v = 2)
/* loaded from: classes5.dex */
final class GeoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1 extends ContinuationImpl {
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
