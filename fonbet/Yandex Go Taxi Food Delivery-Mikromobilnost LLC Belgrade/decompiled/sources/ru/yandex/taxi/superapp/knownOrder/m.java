package ru.yandex.taxi.superapp.knownOrder;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class m implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ boolean b;

    public m(kotlinx.coroutines.flow.n nVar, boolean z) {
        this.a = nVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        KnownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1 knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1;
        int i;
        if (continuation instanceof KnownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1) {
            knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1 = (KnownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1) continuation;
            int i2 = knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar, this.b);
                    knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.L$0 = null;
                    knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.L$1 = null;
                    knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.L$2 = null;
                    knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(lVar, knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1 = new KnownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1(this, continuation);
        Object obj2 = knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$observeOrderWithVersion$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
