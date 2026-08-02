package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.router.NddAddressMapPickerInteractor", f = "NddAddressMapPickerInteractor.kt", l = {RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND, 517}, m = "finalizeAndCheckPickupPointAddress", v = 2)
/* loaded from: classes5.dex */
final class NddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
