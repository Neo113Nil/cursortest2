package ru.yandex.taxi.layers.domain;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BaseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1 baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1;
        int i;
        if (continuation instanceof BaseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1) {
            baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1 = (BaseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1) continuation;
            int i2 = baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((rsn) obj).b == Screen.MAIN_V4) {
                        baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.L$0 = null;
                        baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.L$1 = null;
                        baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.L$2 = null;
                        baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.L$3 = null;
                        baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.label = 1;
                        if (this.a.emit(obj, baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1) == coroutineSingletons) {
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
        baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1 = new BaseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1(this, continuation);
        Object obj22 = baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseLayersInteractor$listenToMainScreenClear$$inlined$filter$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
