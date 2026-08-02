package ru.yandex.video.m3.player.report;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@mvg(c = "ru.yandex.video.m3.player.report.CodecInstancesObserver", f = "CodecInstancesObserver.kt", l = {59}, m = "getCodecsForLog")
/* loaded from: classes7.dex */
public final class CodecInstancesObserver$getCodecsForLog$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CodecInstancesObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecInstancesObserver$getCodecsForLog$1(CodecInstancesObserver codecInstancesObserver, Continuation<? super CodecInstancesObserver$getCodecsForLog$1> continuation) {
        super(continuation);
        this.this$0 = codecInstancesObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getCodecsForLog(this);
    }
}
