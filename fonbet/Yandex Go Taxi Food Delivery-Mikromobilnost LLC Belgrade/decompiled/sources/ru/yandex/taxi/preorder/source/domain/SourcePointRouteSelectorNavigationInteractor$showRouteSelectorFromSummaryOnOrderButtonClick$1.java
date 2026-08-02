package ru.yandex.taxi.preorder.source.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointRouteSelectorNavigationInteractor", f = "SourcePointRouteSelectorNavigationInteractor.kt", l = {164, 167}, m = "showRouteSelectorFromSummaryOnOrderButtonClick", v = 2)
/* loaded from: classes6.dex */
final class SourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointRouteSelectorNavigationInteractor$showRouteSelectorFromSummaryOnOrderButtonClick$1(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, this);
    }
}
