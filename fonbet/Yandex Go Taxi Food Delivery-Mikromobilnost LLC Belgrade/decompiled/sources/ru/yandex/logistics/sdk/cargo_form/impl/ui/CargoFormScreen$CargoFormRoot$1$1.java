package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.jgz;
import defpackage.jqr;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oip0;
import defpackage.tip0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormScreen$CargoFormRoot$1$1", f = "CargoFormScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CargoFormScreen$CargoFormRoot$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tse $scope;
    final /* synthetic */ oip0 $scrollState;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltip0;", "it", "Lzy11;", "<anonymous>", "(Ltip0;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormScreen$CargoFormRoot$1$1$1", f = "CargoFormScreen.kt", l = {206}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormScreen$CargoFormRoot$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ oip0 $scrollState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(oip0 oip0Var, Continuation continuation) {
            super(2, continuation);
            this.$scrollState = oip0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollState, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tip0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tip0 tip0Var = (tip0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    oip0 oip0Var = this.$scrollState;
                    int i2 = tip0Var.a;
                    this.L$0 = null;
                    this.label = 1;
                    if (oip0.f(oip0Var, i2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
            } catch (CancellationException e) {
                jgz jgzVar = jgz.a;
                jgz.c(e);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFormScreen$CargoFormRoot$1$1(c cVar, tse tseVar, oip0 oip0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$scope = tseVar;
        this.$scrollState = oip0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CargoFormScreen$CargoFormRoot$1$1(this.this$0, this.$scope, this.$scrollState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CargoFormScreen$CargoFormRoot$1$1 cargoFormScreen$CargoFormRoot$1$1 = (CargoFormScreen$CargoFormRoot$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cargoFormScreen$CargoFormRoot$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.flow.e.H(this.$scope, new jqr(new mth(this.this$0.B.b, 6), new AnonymousClass1(this.$scrollState, null), 3));
        return zy11.a;
    }
}
