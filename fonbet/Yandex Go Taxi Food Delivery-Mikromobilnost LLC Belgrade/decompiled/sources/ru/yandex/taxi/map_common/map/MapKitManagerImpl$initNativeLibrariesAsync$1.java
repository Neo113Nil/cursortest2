package ru.yandex.taxi.map_common.map;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitManagerImpl", f = "MapKitManagerImpl.kt", l = {HProv.PP_CACHE_SIZE}, m = "initNativeLibrariesAsync", v = 2)
/* loaded from: classes9.dex */
final class MapKitManagerImpl$initNativeLibrariesAsync$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapKitManagerImpl$initNativeLibrariesAsync$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n.g(this.this$0, this);
    }
}
