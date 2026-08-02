package ru.yandex.taxi.widgets.data.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.widgets.data.repository.WidgetsDtoRepository", f = "WidgetsDtoRepository.kt", l = {245, 326, 251, 253}, m = "processDeferRequest-CYxvcXM", v = 2)
/* loaded from: classes6.dex */
final class WidgetsDtoRepository$processDeferRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsDtoRepository$processDeferRequest$1(t tVar, Continuation continuation) {
        super(continuation);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return t.a(this.this$0, null, null, this);
    }
}
