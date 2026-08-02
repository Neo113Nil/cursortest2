package ru.yandex.taxi.parks;

import defpackage.af90;
import defpackage.bf90;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.ze90;
import defpackage.zy11;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.parks.ParksListPresenter$loadNextPageImpl$1", f = "ParksListPresenter.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ParksListPresenter$loadNextPageImpl$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParksListPresenter$loadNextPageImpl$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ParksListPresenter$loadNextPageImpl$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ParksListPresenter$loadNextPageImpl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                ze90 ze90Var = aVar.x;
                int i2 = aVar.C + 1;
                Set set = aVar.B;
                this.label = 1;
                ze90Var.b.getClass();
                sjh sjhVar = uyj.a;
                obj = tje.k0(mdh.b, new ParksListInteractor$getPage$2(ze90Var, i2, set, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            failure = (bf90) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        a aVar2 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
            bf90 bf90Var = (bf90) failure;
            aVar2.C++;
            aVar2.z.addAll(bf90Var.a);
            aVar2.A.addAll(bf90Var.b);
            aVar2.D = bf90Var.c;
            aVar2.Mg();
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.k(a, "error loading parks");
            if (aVar3.C == -1) {
                ((af90) aVar3.Dg()).h5();
            } else {
                aVar3.Mg();
            }
        }
        return zy11.a;
    }
}
