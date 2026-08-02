package ru.yandex.taxi.preorder.summary.tariffpage.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.interactors.TariffPagerDataInteractor", f = "TariffPagerDataInteractor.kt", l = {102}, m = "waitForPagerUpdate", v = 2)
/* loaded from: classes6.dex */
final class TariffPagerDataInteractor$waitForPagerUpdate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffPagerDataInteractor$waitForPagerUpdate$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.a(this.this$0, this);
    }
}
