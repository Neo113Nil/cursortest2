package ru.yandex.taxi.scooters.presentation.ontheway.damage;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ybn0;
import defpackage.zgz;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.domain.model.ScootersPermissionsNotGranted;
import ru.yandex.taxi.scooters.domain.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamagePresenter$start$1", f = "ScootersDamagePresenter.kt", l = {69, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDamagePresenter$start$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDamagePresenter$start$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDamagePresenter$start$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDamagePresenter$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        d dVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (!(th instanceof ScootersPermissionsNotGranted)) {
                zgz.a(null, th);
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            if (!this.this$0.A.b.a.c()) {
                ((ybn0) this.this$0.Dg()).V();
            }
            dVar = this.this$0;
            o oVar = dVar.A;
            this.L$0 = dVar;
            this.label = 1;
            if (oVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar2 = (d) this.L$0;
                kotlin.b.b(obj);
                ((ybn0) dVar2.Dg()).setFlashlightEnabled(dVar2.D);
                return zy11.a;
            }
            d dVar3 = (d) this.L$0;
            kotlin.b.b(obj);
            dVar = dVar3;
        }
        ((ybn0) dVar.Dg()).db();
        ybn0 ybn0Var = (ybn0) dVar.Dg();
        this.L$0 = dVar;
        this.label = 2;
        if (ybn0Var.u6(this) != coroutineSingletons) {
            dVar2 = dVar;
            ((ybn0) dVar2.Dg()).setFlashlightEnabled(dVar2.D);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
