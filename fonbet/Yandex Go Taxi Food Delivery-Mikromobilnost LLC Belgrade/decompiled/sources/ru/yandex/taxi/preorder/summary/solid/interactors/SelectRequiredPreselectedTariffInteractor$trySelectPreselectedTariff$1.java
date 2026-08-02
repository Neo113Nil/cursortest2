package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.SelectRequiredPreselectedTariffInteractor", f = "SelectRequiredPreselectedTariffInteractor.kt", l = {28}, m = "trySelectPreselectedTariff", v = 2)
/* loaded from: classes6.dex */
final class SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1(z zVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
