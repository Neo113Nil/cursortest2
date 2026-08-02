package ru.yandex.taxi.layers.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay", f = "MapObjectsOverlay.kt", l = {320, 327, 330}, m = "prepareAndShow", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsOverlay$prepareAndShow$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$prepareAndShow$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.Kg(this.this$0, this);
    }
}
