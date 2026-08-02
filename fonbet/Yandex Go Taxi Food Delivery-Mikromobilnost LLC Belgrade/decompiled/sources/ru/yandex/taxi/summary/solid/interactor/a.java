package ru.yandex.taxi.summary.solid.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements tpr {
    public final /* synthetic */ tpr[] a;

    public a(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1 bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1) {
            bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1 = (BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1) continuation;
            int i2 = bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 6);
                    BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3 bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3 = new BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3(3, null);
                    bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.L$0 = null;
                    bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.L$1 = null;
                    bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.L$2 = null;
                    bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, v10Var, bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3, bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1 = new BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
