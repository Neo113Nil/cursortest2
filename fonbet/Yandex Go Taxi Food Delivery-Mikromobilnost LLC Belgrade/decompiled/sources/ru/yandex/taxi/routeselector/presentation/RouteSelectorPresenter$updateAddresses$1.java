package ru.yandex.taxi.routeselector.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter", f = "RouteSelectorPresenter.kt", l = {273, 294}, m = "updateAddresses", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorPresenter$updateAddresses$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorPresenter$updateAddresses$1(s sVar, Continuation continuation) {
        super(continuation);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return s.Kg(this.this$0, null, null, null, this);
    }
}
