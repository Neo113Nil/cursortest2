package ru.yandex.taxi.preorder.summary.solid.interactors;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.summary.models.ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink;
import defpackage.a60;
import defpackage.d2s;
import defpackage.egw;
import defpackage.f2s;
import defpackage.g2s;
import defpackage.hxx;
import defpackage.m950;
import defpackage.mvg;
import defpackage.nnw;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.rnw;
import defpackage.tse;
import defpackage.v770;
import defpackage.w511;
import defpackage.wls;
import defpackage.y50;
import defpackage.zfw;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.ForceTariffSwitchOrderInteractor$onSummaryShown$2", f = "ForceTariffSwitchOrderInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ForceTariffSwitchOrderInteractor$onSummaryShown$2 extends SuspendLambda implements wls {
    final /* synthetic */ f2s $action;
    final /* synthetic */ g2s $tariffSwitchInfo;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceTariffSwitchOrderInteractor$onSummaryShown$2(f2s f2sVar, y yVar, g2s g2sVar, Continuation continuation) {
        super(2, continuation);
        this.$action = f2sVar;
        this.this$0 = yVar;
        this.$tariffSwitchInfo = g2sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ForceTariffSwitchOrderInteractor$onSummaryShown$2(this.$action, this.this$0, this.$tariffSwitchInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ForceTariffSwitchOrderInteractor$onSummaryShown$2 forceTariffSwitchOrderInteractor$onSummaryShown$2 = (ForceTariffSwitchOrderInteractor$onSummaryShown$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        forceTariffSwitchOrderInteractor$onSummaryShown$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzs B;
        Address a;
        zzs B2;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f2s f2sVar = this.$action;
        if (f2sVar instanceof d2s) {
            this.this$0.d.a.b = true;
            y yVar = this.this$0;
            String str = this.$tariffSwitchInfo.a.b;
            Address e = yVar.b.e();
            if (e != null && (B = e.B()) != null && (a = yVar.b.a()) != null && (B2 = a.B()) != null) {
                egw egwVar = new egw("intercity", zfw.a, new rnw(new nnw(B.a, B.b), new nnw(B2.a, B2.b)), str);
                yVar.d.a.c = true;
                ((pep0) yVar.i).f((m950) yVar.j.get(), egwVar, hxx.a);
                return zy11Var;
            }
        } else {
            if (!(f2sVar instanceof ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink)) {
                w511.b();
                return null;
            }
            if (((ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink) f2sVar).a.length() != 0) {
                this.this$0.d.a.b = true;
                ((a60) ((y50) this.this$0.k.get())).c(((ForceTariffSwitchForIntercityOrdersExperiment$AfterSwitchToTariffAction$Deeplink) this.$action).a, v770.c);
                return zy11Var;
            }
        }
        return zy11Var;
    }
}
