package ru.yandex.taxi.scooters.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersSlowdownInteractor", f = "ScootersSlowdownInteractor.kt", l = {64}, m = "cancelSlowdown", v = 2)
/* loaded from: classes6.dex */
final class ScootersSlowdownInteractor$cancelSlowdown$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSlowdownInteractor$cancelSlowdown$1(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
