package ru.yandex.taxi.combo.ui;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.taxi.tariffs.internal.repository.m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wb;
import defpackage.wls;
import defpackage.x5;
import defpackage.zb;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.combo.ui.AcceptComboOrderPresenter$attachView$1", f = "AcceptComboOrderPresenter.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AcceptComboOrderPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ wb $mvpView;
    int label;
    final /* synthetic */ zb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptComboOrderPresenter$attachView$1(zb zbVar, wb wbVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zbVar;
        this.$mvpView = wbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcceptComboOrderPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcceptComboOrderPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        if (i == 0) {
            b.b(obj);
            m g = ((k) this.this$0.x).g();
            x5 x5Var = new x5(i2, this.$mvpView);
            this.label = 1;
            Object collect = g.collect(new r(x5Var, new Ref$IntRef()), this);
            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                collect = zy11Var;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11Var;
    }
}
