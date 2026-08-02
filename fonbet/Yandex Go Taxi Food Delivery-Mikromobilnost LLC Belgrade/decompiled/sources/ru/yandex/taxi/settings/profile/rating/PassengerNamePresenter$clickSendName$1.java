package ru.yandex.taxi.settings.profile.rating;

import defpackage.avj0;
import defpackage.bl90;
import defpackage.dl90;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.profile.rating.PassengerNamePresenter$clickSendName$1", f = "PassengerNamePresenter.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class PassengerNamePresenter$clickSendName$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ dl90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengerNamePresenter$clickSendName$1(dl90 dl90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dl90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassengerNamePresenter$clickSendName$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassengerNamePresenter$clickSendName$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dl90 dl90Var;
        dl90 dl90Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ((bl90) this.this$0.Dg()).showLoading();
                dl90 dl90Var3 = this.this$0;
                try {
                    ru.yandex.taxi.profile.a aVar = dl90Var3.x;
                    String str = dl90Var3.C;
                    this.L$0 = dl90Var3;
                    this.L$1 = dl90Var3;
                    this.label = 1;
                    if (aVar.c(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dl90Var = dl90Var3;
                    dl90Var2 = dl90Var;
                } catch (Throwable unused) {
                    dl90Var = dl90Var3;
                    ((bl90) dl90Var.Dg()).showError(((avj0) dl90Var.y).h(kyh0.promocode_toooften));
                    ((bl90) this.this$0.Dg()).hideLoading();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dl90Var = (dl90) this.L$1;
                dl90Var2 = (dl90) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    ((bl90) dl90Var.Dg()).showError(((avj0) dl90Var.y).h(kyh0.promocode_toooften));
                    ((bl90) this.this$0.Dg()).hideLoading();
                    return zy11.a;
                }
            }
            dl90Var2.B.b();
            ((bl90) dl90Var2.Dg()).onSuccessfulUpdate();
            ((bl90) this.this$0.Dg()).hideLoading();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
