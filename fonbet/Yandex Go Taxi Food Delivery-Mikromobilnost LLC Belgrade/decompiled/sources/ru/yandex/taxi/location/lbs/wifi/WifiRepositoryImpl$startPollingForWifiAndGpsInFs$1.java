package ru.yandex.taxi.location.lbs.wifi;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.location.lbs.wifi.WifiRepositoryImpl", f = "WifiRepositoryImpl.kt", l = {58, 59}, m = "startPollingForWifiAndGpsInFs$impl", v = 2)
/* loaded from: classes9.dex */
final class WifiRepositoryImpl$startPollingForWifiAndGpsInFs$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiRepositoryImpl$startPollingForWifiAndGpsInFs$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(this);
    }
}
