package ru.yandex.taxi.preorder.tollroad;

import defpackage.ntk0;
import defpackage.ny61;
import defpackage.qpz0;
import defpackage.vpr;
import defpackage.wtk0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qpz0 b;

    public b(vpr vprVar, qpz0 qpz0Var) {
        this.a = vprVar;
        this.b = qpz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1 tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1) {
            tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1 = (TollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    this.b.getClass();
                    boolean Kg = qpz0.Kg(list);
                    List list2 = list;
                    boolean z = false;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((ntk0) it.next()).i) {
                                z = true;
                                break;
                            }
                        }
                    }
                    wtk0 wtk0Var = new wtk0(Kg, z);
                    tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(wtk0Var, tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1 = new TollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadDialogPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
