package ru.yandex.taxi.map_common.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.map_common.map.MapkitDrivingRouterImpl", f = "MapkitDrivingRouterImpl.kt", l = {292}, m = "createRequestPoint", v = 2)
/* loaded from: classes6.dex */
final class MapkitDrivingRouterImpl$createRequestPoint$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapkitDrivingRouterImpl$createRequestPoint$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return o.b(this.this$0, null, this);
    }
}
