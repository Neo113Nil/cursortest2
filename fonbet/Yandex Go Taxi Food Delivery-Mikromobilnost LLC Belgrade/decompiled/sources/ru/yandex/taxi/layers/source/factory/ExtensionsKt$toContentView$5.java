package ru.yandex.taxi.layers.source.factory;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.layers.source.factory.ExtensionsKt", f = "Extensions.kt", l = {281}, m = "toContentView", v = 2)
/* loaded from: classes5.dex */
final class ExtensionsKt$toContentView$5 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ExtensionsKt$toContentView$5(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.i(null, null, null, this);
    }
}
