package ru.yandex.taxi.persuggest.source;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.persuggest.source.ZeroSuggestRepositoryImpl", f = "ZeroSuggestRepositoryImpl.kt", l = {36, 38, 50, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 67}, m = "request", v = 2)
/* loaded from: classes6.dex */
final class ZeroSuggestRepositoryImpl$request$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroSuggestRepositoryImpl$request$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, false, false, this);
    }
}
