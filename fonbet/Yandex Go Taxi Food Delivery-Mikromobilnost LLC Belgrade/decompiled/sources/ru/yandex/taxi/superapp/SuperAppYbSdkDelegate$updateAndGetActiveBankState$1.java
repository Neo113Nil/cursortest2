package ru.yandex.taxi.superapp;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.superapp.SuperAppYbSdkDelegate", f = "SuperAppYbSdkDelegate.kt", l = {104, 105, HProv.PP_SET_PIN}, m = "updateAndGetActiveBankState", v = 2)
/* loaded from: classes6.dex */
final class SuperAppYbSdkDelegate$updateAndGetActiveBankState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppYbSdkDelegate$updateAndGetActiveBankState$1(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return v.a(this.this$0, null, this);
    }
}
