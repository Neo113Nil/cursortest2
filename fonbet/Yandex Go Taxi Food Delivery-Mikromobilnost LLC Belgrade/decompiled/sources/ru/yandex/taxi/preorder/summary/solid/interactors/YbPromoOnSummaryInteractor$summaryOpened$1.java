package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.YbPromoOnSummaryInteractor", f = "YbPromoOnSummaryInteractor.kt", l = {17, 21}, m = "summaryOpened", v = 2)
/* loaded from: classes6.dex */
final class YbPromoOnSummaryInteractor$summaryOpened$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbPromoOnSummaryInteractor$summaryOpened$1(q0 q0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
