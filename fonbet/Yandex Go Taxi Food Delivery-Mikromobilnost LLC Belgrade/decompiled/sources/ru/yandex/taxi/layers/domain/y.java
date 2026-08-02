package ru.yandex.taxi.layers.domain;

import defpackage.ha2;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class y implements tpr {
    public final /* synthetic */ ha2 a;
    public final /* synthetic */ z b;

    public y(ha2 ha2Var, z zVar) {
        this.a = ha2Var;
        this.b = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ZoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1 zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ZoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1) {
            zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1 = (ZoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x xVar = new x(vprVar, this.b);
                    zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(xVar, zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1 = new ZoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneModeAndScreenChangeInteractor$attach$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
