package ru.yandex.taxi.router;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wjm;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ wjm b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable w;
    public final /* synthetic */ Runnable x;
    public final /* synthetic */ Runnable y;

    public f(tpr tprVar, wjm wjmVar, boolean z, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        this.a = tprVar;
        this.b = wjmVar;
        this.c = z;
        this.w = runnable;
        this.x = runnable2;
        this.y = runnable3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LiveLocationOptionsPopupRouter$show$$inlined$map$1$1 liveLocationOptionsPopupRouter$show$$inlined$map$1$1;
        int i;
        if (continuation instanceof LiveLocationOptionsPopupRouter$show$$inlined$map$1$1) {
            liveLocationOptionsPopupRouter$show$$inlined$map$1$1 = (LiveLocationOptionsPopupRouter$show$$inlined$map$1$1) continuation;
            int i2 = liveLocationOptionsPopupRouter$show$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                liveLocationOptionsPopupRouter$show$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = liveLocationOptionsPopupRouter$show$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = liveLocationOptionsPopupRouter$show$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b, this.c, this.w, this.x, this.y);
                    liveLocationOptionsPopupRouter$show$$inlined$map$1$1.L$0 = null;
                    liveLocationOptionsPopupRouter$show$$inlined$map$1$1.L$1 = null;
                    liveLocationOptionsPopupRouter$show$$inlined$map$1$1.L$2 = null;
                    liveLocationOptionsPopupRouter$show$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, liveLocationOptionsPopupRouter$show$$inlined$map$1$1) == coroutineSingletons) {
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
        liveLocationOptionsPopupRouter$show$$inlined$map$1$1 = new LiveLocationOptionsPopupRouter$show$$inlined$map$1$1(this, continuation);
        Object obj2 = liveLocationOptionsPopupRouter$show$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = liveLocationOptionsPopupRouter$show$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
