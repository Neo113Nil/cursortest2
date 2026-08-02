package ru.yandex.taxi.map.overlay.pickup.intersections;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.map.overlay.pickup.intersections.LayersIntersectionsResolver", f = "LayersIntersectionsResolver.kt", l = {147}, m = "isBubbleShouldBeMuted", v = 2)
/* loaded from: classes6.dex */
final class LayersIntersectionsResolver$isBubbleShouldBeMuted$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersIntersectionsResolver$isBubbleShouldBeMuted$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, null, null, this);
    }
}
