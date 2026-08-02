package ru.yandex.taxi.cashback.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.cashback.interactors.UpdatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2", f = "UpdatePlusDataOnZoneChangeInteractor.kt", l = {44}, m = "emit", v = 2)
/* loaded from: classes9.dex */
final class UpdatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePlusDataOnZoneChangeInteractor$onFirstContentfulPaint$1$2$emit$1(l lVar, Continuation continuation) {
        super(continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
