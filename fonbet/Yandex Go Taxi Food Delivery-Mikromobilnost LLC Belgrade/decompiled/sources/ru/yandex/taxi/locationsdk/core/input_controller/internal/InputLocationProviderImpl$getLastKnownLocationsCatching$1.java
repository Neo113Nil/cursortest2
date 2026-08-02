package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.locationsdk.core.input_controller.internal.InputLocationProviderImpl", f = "InputLocationProvider.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "getLastKnownLocationsCatching")
/* loaded from: classes9.dex */
final class InputLocationProviderImpl$getLastKnownLocationsCatching$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputLocationProviderImpl$getLastKnownLocationsCatching$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(this.this$0, null, this);
    }
}
