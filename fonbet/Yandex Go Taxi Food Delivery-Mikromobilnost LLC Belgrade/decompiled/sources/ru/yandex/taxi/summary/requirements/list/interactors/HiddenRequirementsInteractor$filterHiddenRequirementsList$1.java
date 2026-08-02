package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.HiddenRequirementsInteractor", f = "HiddenRequirementsInteractor.kt", l = {52}, m = "filterHiddenRequirementsList", v = 2)
/* loaded from: classes6.dex */
final class HiddenRequirementsInteractor$filterHiddenRequirementsList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiddenRequirementsInteractor$filterHiddenRequirementsList$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
