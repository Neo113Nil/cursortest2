package ru.yandex.taxi.preorder.source.userposition;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.CoordinateProvidersFactory", f = "CoordinateProvidersFactory.kt", l = {152}, m = "getLastKnownMapkitLocation", v = 2)
/* loaded from: classes9.dex */
final class CoordinateProvidersFactory$getLastKnownMapkitLocation$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinateProvidersFactory$getLastKnownMapkitLocation$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.f(this.this$0, this);
    }
}
