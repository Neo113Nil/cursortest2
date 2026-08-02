package ru.yandex.taxi.scooters.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersCurrentUserStateRepository", f = "ScootersCurrentUserStateRepository.kt", l = {43}, m = "pushUserStateResponseFromSessionsCurrent", v = 2)
/* loaded from: classes6.dex */
final class ScootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCurrentUserStateRepository$pushUserStateResponseFromSessionsCurrent$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, this);
    }
}
