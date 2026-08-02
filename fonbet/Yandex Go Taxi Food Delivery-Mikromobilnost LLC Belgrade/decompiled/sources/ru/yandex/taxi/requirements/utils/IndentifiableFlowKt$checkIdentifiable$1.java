package ru.yandex.taxi.requirements.utils;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.requirements.utils.IndentifiableFlowKt", f = "IndentifiableFlow.kt", l = {105}, m = "checkIdentifiable", v = 2)
/* loaded from: classes6.dex */
final class IndentifiableFlowKt$checkIdentifiable$1<K, R> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(null, false, null, this);
    }
}
