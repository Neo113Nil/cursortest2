package ru.yandex.taxi.preorder.source.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointZoneRequestInteractor", f = "SourcePointZoneRequestInteractor.kt", l = {67, 69}, m = "request-gIAlu-s", v = 2)
/* loaded from: classes6.dex */
final class SourcePointZoneRequestInteractor$request$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointZoneRequestInteractor$request$1(w wVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = w.a(this.this$0, null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
