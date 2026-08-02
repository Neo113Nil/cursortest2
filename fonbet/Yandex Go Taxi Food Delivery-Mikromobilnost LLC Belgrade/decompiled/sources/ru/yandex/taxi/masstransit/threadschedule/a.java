package ru.yandex.taxi.masstransit.threadschedule;

import androidx.lifecycle.Lifecycle;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1 mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1) {
            mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1 = (MtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1) continuation;
            int i2 = mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((Lifecycle.State) obj).a(Lifecycle.State.STARTED));
                    mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.L$0 = null;
                    mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.L$1 = null;
                    mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.L$2 = null;
                    mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.L$3 = null;
                    mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1 = new MtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtThreadScheduleRefreshInteractor$needUpdateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
