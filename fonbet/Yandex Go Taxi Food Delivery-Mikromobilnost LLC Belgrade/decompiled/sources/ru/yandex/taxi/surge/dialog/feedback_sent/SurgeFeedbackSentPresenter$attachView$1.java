package ru.yandex.taxi.surge.dialog.feedback_sent;

import defpackage.hpw0;
import defpackage.ipw0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nuq;
import defpackage.ny61;
import defpackage.qit0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.surge.interactor.o;
import ru.yandex.taxi.surge.interactor.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.dialog.feedback_sent.SurgeFeedbackSentPresenter$attachView$1", f = "SurgeFeedbackSentPresenter.kt", l = {31, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeFeedbackSentPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ hpw0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ipw0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeFeedbackSentPresenter$attachView$1(ipw0 ipw0Var, hpw0 hpw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ipw0Var;
        this.$mvpView = hpw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeFeedbackSentPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeFeedbackSentPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (r3.collect(r7, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ipw0 ipw0Var = this.this$0;
            p pVar = ipw0Var.z;
            nuq nuqVar = ipw0Var.x;
            this.label = 1;
            tpr t = e.t(new o(pVar.b.a(), nuqVar, pVar));
            pVar.a.getClass();
            sjh sjhVar = uyj.a;
            obj = e.F(t, mdh.b);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        hpw0 hpw0Var = this.$mvpView;
        kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o((tpr) obj, new SurgeFeedbackSentPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
        qit0 qit0Var = new qit0(25, hpw0Var);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
