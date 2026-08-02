package ru.yandex.taxi.plus.sdk.micro_widget.composite;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xe20;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ xe20 b;

    public f(tpr tprVar, xe20 xe20Var) {
        this.a = tprVar;
        this.b = xe20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MicroWidgetBadgeInteractor$special$$inlined$map$2$1 microWidgetBadgeInteractor$special$$inlined$map$2$1;
        int i;
        if (continuation instanceof MicroWidgetBadgeInteractor$special$$inlined$map$2$1) {
            microWidgetBadgeInteractor$special$$inlined$map$2$1 = (MicroWidgetBadgeInteractor$special$$inlined$map$2$1) continuation;
            int i2 = microWidgetBadgeInteractor$special$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeInteractor$special$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = microWidgetBadgeInteractor$special$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeInteractor$special$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    microWidgetBadgeInteractor$special$$inlined$map$2$1.L$0 = null;
                    microWidgetBadgeInteractor$special$$inlined$map$2$1.L$1 = null;
                    microWidgetBadgeInteractor$special$$inlined$map$2$1.L$2 = null;
                    microWidgetBadgeInteractor$special$$inlined$map$2$1.label = 1;
                    if (this.a.collect(eVar, microWidgetBadgeInteractor$special$$inlined$map$2$1) == coroutineSingletons) {
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
        microWidgetBadgeInteractor$special$$inlined$map$2$1 = new MicroWidgetBadgeInteractor$special$$inlined$map$2$1(this, continuation);
        Object obj2 = microWidgetBadgeInteractor$special$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeInteractor$special$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
