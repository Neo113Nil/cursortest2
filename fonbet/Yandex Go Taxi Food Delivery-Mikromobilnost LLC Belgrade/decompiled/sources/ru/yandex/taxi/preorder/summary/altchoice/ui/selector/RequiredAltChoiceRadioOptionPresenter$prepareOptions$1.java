package ru.yandex.taxi.preorder.summary.altchoice.ui.selector;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceRadioOptionPresenter", f = "RequiredAltChoiceRadioOptionPresenter.kt", l = {251}, m = "prepareOptions", v = 2)
/* loaded from: classes6.dex */
final class RequiredAltChoiceRadioOptionPresenter$prepareOptions$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredAltChoiceRadioOptionPresenter$prepareOptions$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.Kg(this.this$0, null, null, null, null, null, this);
    }
}
