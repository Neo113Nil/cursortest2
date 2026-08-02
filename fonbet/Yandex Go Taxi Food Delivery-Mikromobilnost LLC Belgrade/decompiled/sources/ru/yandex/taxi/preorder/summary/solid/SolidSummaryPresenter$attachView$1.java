package ru.yandex.taxi.preorder.summary.solid;

import com.yandex.go.taxi.summary.experiments.SummaryPerformanceOptimisationsExperiment;
import com.yandex.go.taxi.summary.shared.lifecycle.SummaryElement;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tiv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$attachView$1", f = "SolidSummaryPresenter.kt", l = {IDialogId.DIALOG_PIN_WND_IDD_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryPresenter$attachView$1(Continuation continuation, l lVar) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SolidSummaryPresenter$attachView$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tiv0 tiv0Var = this.this$0.Q0;
            tiv0Var.getClass();
            o430 o430Var = e3n.b;
            long e = e3n.e(kp50.V(((SummaryPerformanceOptimisationsExperiment) tiv0Var.a.b.b()).c, DurationUnit.SECONDS));
            this.label = 1;
            if (kotlinx.coroutines.a.i(e, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        r0 r0Var = this.this$0.V1.a;
        Set N0 = kotlin.collections.a.N0(SummaryElement.a());
        r0Var.getClass();
        r0Var.m(null, N0);
        return zy11.a;
    }
}
