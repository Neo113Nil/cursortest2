package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.BodyComponentFactory", f = "BodyComponentFactory.kt", l = {201}, m = "requestSimplifiedSelectedStateImageProvider", v = 2)
/* loaded from: classes5.dex */
final class BodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return m.g(this.this$0, null, this);
    }
}
