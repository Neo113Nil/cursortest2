package ru.yandex.taxi.am.internal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.internal.PassportPartitionsUpdater$onLargestContentfulPaint$1$1", f = "PassportPartitionsUpdater.kt", l = {28, 29, 32}, m = "emit", v = 2)
/* loaded from: classes9.dex */
final class PassportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1(h hVar, Continuation continuation) {
        super(continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
