package ru.yandex.taxi.locationsdk.locationprovider.android.gms;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.locationsdk.locationprovider.android.gms.GoogleMobileServicesClientAdapter", f = "GoogleMobileServicesClientAdapter.kt", l = {HProv.PP_DHOID}, m = "getLastKnownLocation")
/* loaded from: classes5.dex */
final class GoogleMobileServicesClientAdapter$getLastKnownLocation$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMobileServicesClientAdapter$getLastKnownLocation$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
