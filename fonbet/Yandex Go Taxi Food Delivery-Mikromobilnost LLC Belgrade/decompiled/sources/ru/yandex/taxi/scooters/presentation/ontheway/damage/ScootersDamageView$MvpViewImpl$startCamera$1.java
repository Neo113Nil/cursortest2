package ru.yandex.taxi.scooters.presentation.ontheway.damage;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamageView$MvpViewImpl", f = "ScootersDamageView.kt", l = {222}, m = "startCamera", v = 2)
/* loaded from: classes6.dex */
final class ScootersDamageView$MvpViewImpl$startCamera$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDamageView$MvpViewImpl$startCamera$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.u6(this);
    }
}
