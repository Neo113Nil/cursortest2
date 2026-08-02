package ru.yandex.taxi.settings.main;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j b;

    public h(vpr vprVar, j jVar) {
        this.a = vprVar;
        this.b = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1 nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof NativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1) {
            nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1 = (NativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1) continuation;
            int i2 = nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (this.b.d.g.a.getValue() == NativeMenuState.OPENING) {
                        nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.L$0 = null;
                        nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.L$1 = null;
                        nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.L$2 = null;
                        nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.L$3 = null;
                        nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1 = new NativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nativeMenuRouterImpl$1$invokeSuspend$lambda$2$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
