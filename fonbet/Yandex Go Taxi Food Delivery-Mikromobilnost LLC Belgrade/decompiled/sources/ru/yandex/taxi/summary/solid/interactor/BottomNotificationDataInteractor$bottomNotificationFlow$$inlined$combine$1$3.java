package ru.yandex.taxi.summary.solid.interactor;

import defpackage.gsc;
import defpackage.j73;
import defpackage.jl40;
import defpackage.kb5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pd6;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3", f = "BottomNotificationDataInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3 bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3 = new BottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3(3, (Continuation) obj3);
        bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return bottomNotificationDataInteractor$bottomNotificationFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gsc gscVar;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gsc[] gscVarArr = (gsc[]) objArr;
            kb5 kb5Var = ((gsc) j73.C(gscVarArr)).a;
            int length = gscVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    int length2 = gscVarArr.length;
                    while (true) {
                        if (i2 >= length2) {
                            gscVar = new gsc(kb5Var, pd6.a);
                            break;
                        }
                        gscVar = gscVarArr[i2];
                        if (gscVar.b == null) {
                            gscVar = null;
                        }
                        if (gscVar != null) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    if (!jl40.l(gscVarArr[i3].a, kb5Var)) {
                        gscVar = null;
                        break;
                    }
                    i3++;
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(gscVar, this) == coroutineSingletons) {
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
