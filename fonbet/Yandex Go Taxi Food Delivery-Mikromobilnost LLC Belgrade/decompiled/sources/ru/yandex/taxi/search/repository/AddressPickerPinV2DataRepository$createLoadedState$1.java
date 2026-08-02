package ru.yandex.taxi.search.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.search.repository.AddressPickerPinV2DataRepository", f = "AddressPickerPinV2DataRepository.kt", l = {HProv.ALG_SID_SHA3_224}, m = "createLoadedState", v = 2)
/* loaded from: classes6.dex */
final class AddressPickerPinV2DataRepository$createLoadedState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressPickerPinV2DataRepository$createLoadedState$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.e(this.this$0, null, false, this);
    }
}
