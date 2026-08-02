package ru.yandex.taxi.hiredriver;

import defpackage.j4a;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pku;
import defpackage.qu;
import defpackage.rku;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.hiredriver.HireDriverPresenter$sendClicked$1", f = "HireDriverPresenter.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class HireDriverPresenter$sendClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $queryParams;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ rku this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HireDriverPresenter$sendClicked$1(rku rkuVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rkuVar;
        this.$queryParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HireDriverPresenter$sendClicked$1(this.this$0, this.$queryParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HireDriverPresenter$sendClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons, zc5] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rku rkuVar;
        rku rkuVar2;
        rku rkuVar3;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                rku rkuVar4 = this.this$0;
                Map<String, String> map = this.$queryParams;
                try {
                    c cVar = rkuVar4.y;
                    this.L$0 = rkuVar4;
                    this.L$1 = rkuVar4;
                    this.L$2 = rkuVar4;
                    this.label = 1;
                    if (cVar.b(map, this) == r0) {
                        return r0;
                    }
                    rkuVar3 = rkuVar4;
                    rkuVar = rkuVar3;
                    rkuVar2 = rkuVar;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    rkuVar = rkuVar4;
                    rkuVar2 = rkuVar;
                    jst.e.k(th, "failed to send user data");
                    rkuVar2.z.a().setMessage(kyh0.network_error).setPositiveButton(kyh0.common_ok).show();
                    ((pku) rkuVar.Dg()).C3(false);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rkuVar = (rku) this.L$2;
                rkuVar2 = (rku) this.L$1;
                rkuVar3 = (rku) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, "failed to send user data");
                    rkuVar2.z.a().setMessage(kyh0.network_error).setPositiveButton(kyh0.common_ok).show();
                    ((pku) rkuVar.Dg()).C3(false);
                    return zy11.a;
                }
            }
            ((j4a) rkuVar3.C.a).r(new qu(9));
            rkuVar3.B.h();
            ((pku) rkuVar.Dg()).C3(false);
            return zy11.a;
        } catch (Throwable th3) {
            ((pku) r0.Dg()).C3(false);
            throw th3;
        }
    }
}
