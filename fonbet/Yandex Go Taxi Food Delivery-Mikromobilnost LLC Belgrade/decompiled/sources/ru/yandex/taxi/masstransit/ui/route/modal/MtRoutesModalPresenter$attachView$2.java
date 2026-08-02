package ru.yandex.taxi.masstransit.ui.route.modal;

import defpackage.bms;
import defpackage.lx30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.py30;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lpy30;", "routesState", "", "focusRouteVisibility", "", "badgeCount", "Llx30;", "<anonymous>", "(Lpy30;ZI)Llx30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalPresenter$attachView$2", f = "MtRoutesModalPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesModalPresenter$attachView$2 extends SuspendLambda implements bms {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        int intValue = ((Number) obj3).intValue();
        MtRoutesModalPresenter$attachView$2 mtRoutesModalPresenter$attachView$2 = new MtRoutesModalPresenter$attachView$2(4, (Continuation) obj4);
        mtRoutesModalPresenter$attachView$2.L$0 = (py30) obj;
        mtRoutesModalPresenter$attachView$2.Z$0 = booleanValue;
        mtRoutesModalPresenter$attachView$2.I$0 = intValue;
        return mtRoutesModalPresenter$attachView$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        py30 py30Var = (py30) this.L$0;
        boolean z = this.Z$0;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Throwable th = py30Var.d;
        List list = py30Var.a;
        boolean z2 = (th != null || py30Var.c || list.isEmpty()) ? false : true;
        if (list.isEmpty()) {
            z = false;
        }
        return new lx30(z2, z, i);
    }
}
