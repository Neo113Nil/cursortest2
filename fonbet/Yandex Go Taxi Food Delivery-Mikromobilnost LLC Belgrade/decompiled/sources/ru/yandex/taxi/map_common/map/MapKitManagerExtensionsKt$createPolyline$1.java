package ru.yandex.taxi.map_common.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitManagerExtensionsKt", f = "MapKitManagerExtensions.kt", l = {58}, m = "createPolyline", v = 2)
/* loaded from: classes6.dex */
final class MapKitManagerExtensionsKt$createPolyline$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object k = k.k(null, null, this);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : new Result(k);
    }
}
