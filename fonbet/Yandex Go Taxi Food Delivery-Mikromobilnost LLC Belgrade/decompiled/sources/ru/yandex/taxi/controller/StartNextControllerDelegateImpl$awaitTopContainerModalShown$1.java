package ru.yandex.taxi.controller;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.controller.StartNextControllerDelegateImpl", f = "StartNextControllerDelegateImpl.kt", l = {HProv.PP_EXPORT_CSP}, m = "awaitTopContainerModalShown", v = 2)
/* loaded from: classes5.dex */
final class StartNextControllerDelegateImpl$awaitTopContainerModalShown$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartNextControllerDelegateImpl$awaitTopContainerModalShown$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(this.this$0, this);
    }
}
