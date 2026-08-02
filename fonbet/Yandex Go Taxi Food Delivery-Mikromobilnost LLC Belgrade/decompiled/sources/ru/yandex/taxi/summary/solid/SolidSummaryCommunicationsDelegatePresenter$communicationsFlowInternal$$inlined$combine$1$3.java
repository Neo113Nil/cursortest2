package ru.yandex.taxi.summary.solid;

import defpackage.an8;
import defpackage.bvz0;
import defpackage.ce3;
import defpackage.de3;
import defpackage.dvz0;
import defpackage.euc;
import defpackage.gsc;
import defpackage.gu11;
import defpackage.jl40;
import defpackage.kb5;
import defpackage.kdj0;
import defpackage.lev0;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pd6;
import defpackage.rd6;
import defpackage.sfj;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xfj;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.summary.solid.interactor.CommunicationsPriorityInteractor$DataPriorityType;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3", f = "SolidSummaryCommunicationsDelegatePresenter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ n4u0 $tariffFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3(Continuation continuation, n4u0 n4u0Var, p pVar) {
        super(3, continuation);
        this.$tariffFlow$inlined = n4u0Var;
        this.this$0 = pVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3 solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3 = new SolidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3((Continuation) obj3, this.$tariffFlow$inlined, this.this$0);
        solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3.L$0 = (vpr) obj;
        solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return solidSummaryCommunicationsDelegatePresenter$communicationsFlowInternal$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        lev0 lev0Var;
        rd6 rd6Var;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj3 = objArr[0];
            Object obj4 = objArr[1];
            Object obj5 = objArr[2];
            Object obj6 = objArr[3];
            Object obj7 = objArr[4];
            Object obj8 = objArr[5];
            boolean booleanValue = ((Boolean) objArr[6]).booleanValue();
            gsc gscVar = (gsc) obj8;
            gsc gscVar2 = (gsc) obj7;
            gsc gscVar3 = (gsc) obj6;
            gsc gscVar4 = (gsc) obj5;
            gsc gscVar5 = (gsc) obj4;
            CommunicationsPriorityInteractor$DataPriorityType communicationsPriorityInteractor$DataPriorityType = (CommunicationsPriorityInteractor$DataPriorityType) obj3;
            kb5 kb5Var = (kb5) this.$tariffFlow$inlined.getValue();
            if (kb5Var != null && jl40.l(gscVar5.a, kb5Var) && jl40.l(gscVar4.a, kb5Var) && jl40.l(gscVar3.a, kb5Var) && jl40.l(gscVar2.a, kb5Var) && jl40.l(gscVar.a, kb5Var)) {
                an8 an8Var = this.this$0.i;
                xfj xfjVar = (xfj) gscVar5.b;
                kdj0 kdj0Var = (kdj0) gscVar4.b;
                rd6 rd6Var2 = (rd6) gscVar3.b;
                dvz0 dvz0Var = (dvz0) gscVar2.b;
                de3 de3Var = (de3) gscVar.b;
                an8Var.getClass();
                rd6 rd6Var3 = pd6.a;
                boolean l = jl40.l(rd6Var2, rd6Var3);
                bvz0 bvz0Var = bvz0.a;
                boolean z = (l && jl40.l(dvz0Var, bvz0Var)) ? false : true;
                if (!jl40.l(de3Var, ce3.a)) {
                    ((gu11) an8Var.w).getClass();
                    xfjVar = sfj.a;
                    rd6Var2 = rd6Var3;
                }
                if (kdj0Var.a.isEmpty() || !z) {
                    rd6Var = rd6Var2;
                } else {
                    int i2 = euc.a[communicationsPriorityInteractor$DataPriorityType.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            kdj0Var = kdj0.c;
                            booleanValue = true;
                        } else {
                            if (i2 != 3) {
                                w511.b();
                                return null;
                            }
                            dvz0Var = bvz0Var;
                            rd6Var = rd6Var3;
                        }
                    }
                    rd6Var3 = rd6Var2;
                    rd6Var = rd6Var3;
                }
                lev0Var = new lev0(xfjVar, kdj0Var, rd6Var, dvz0Var, de3Var, booleanValue);
                obj2 = null;
            } else {
                obj2 = null;
                lev0Var = null;
            }
            this.L$0 = obj2;
            this.L$1 = obj2;
            this.label = 1;
            if (vprVar.emit(lev0Var, this) == coroutineSingletons) {
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
