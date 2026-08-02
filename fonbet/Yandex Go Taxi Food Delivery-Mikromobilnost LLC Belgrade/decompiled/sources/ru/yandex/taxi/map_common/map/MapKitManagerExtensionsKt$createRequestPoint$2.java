package ru.yandex.taxi.map_common.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitManagerExtensionsKt", f = "MapKitManagerExtensions.kt", l = {173}, m = "createRequestPoint", v = 2)
/* loaded from: classes6.dex */
final class MapKitManagerExtensionsKt$createRequestPoint$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object n = k.n(null, null, null, null, this);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : new Result(n);
    }
}
