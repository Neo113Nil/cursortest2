package ru.yandex.logistics.cargo_form.async.impl.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.logistics.cargo_form.async.impl.interactor.FormAsyncInteractorImpl$poll$2", f = "FormAsyncInteractorImpl.kt", l = {MSException.ERROR_INVALID_PASSWORD, HProv.ALG_SID_KECCAK_256}, m = "emit", v = 2)
/* loaded from: classes4.dex */
final class FormAsyncInteractorImpl$poll$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormAsyncInteractorImpl$poll$2$emit$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
