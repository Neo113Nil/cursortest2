package ru.yandex.taxi.masstransit.geopayment.checkout;

import android.graphics.drawable.Drawable;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zd30;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class m implements vpr {
    public final /* synthetic */ t a;
    public final /* synthetic */ zd30 b;

    public m(t tVar, zd30 zd30Var) {
        this.a = tVar;
        this.b = zd30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1 mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        if (continuation instanceof MtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1) {
            mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1 = (MtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1) continuation;
            int i2 = mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.design.utils.b bVar = this.a.E;
                    mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                    mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                    mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                    mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.label = 1;
                    obj2 = bVar.g(24, mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                this.b.zb((Drawable) obj2);
                return zy11.a;
            }
        }
        mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1 = new MtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCheckoutPresenter$attachView$4$invokeSuspend$$inlined$safeCollect$2$1.label;
        if (i != 0) {
        }
        this.b.zb((Drawable) obj22);
        return zy11.a;
    }
}
