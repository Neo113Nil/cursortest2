package ru.yandex.taxi.fragment.common;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.fragment.common.BaseWebChromeClient", f = "BaseWebChromeClient.kt", l = {182, 189}, m = "getResourceOrNull", v = 2)
/* loaded from: classes5.dex */
public final class BaseWebChromeClient$getResourceOrNull$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseWebChromeClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebChromeClient$getResourceOrNull$1(BaseWebChromeClient baseWebChromeClient, Continuation continuation) {
        super(continuation);
        this.this$0 = baseWebChromeClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object resourceOrNull;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        resourceOrNull = this.this$0.getResourceOrNull(null, this);
        return resourceOrNull;
    }
}
