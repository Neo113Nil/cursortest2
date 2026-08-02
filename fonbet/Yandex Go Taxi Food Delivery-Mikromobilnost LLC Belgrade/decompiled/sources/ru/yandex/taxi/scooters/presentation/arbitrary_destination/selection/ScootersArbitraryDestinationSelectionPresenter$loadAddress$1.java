package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection;

import defpackage.atd0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.mym0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin.ScootersPinStateRepository;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.ScootersArbitraryDestinationSelectionPresenter$loadAddress$1", f = "ScootersArbitraryDestinationSelectionPresenter.kt", l = {175}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersArbitraryDestinationSelectionPresenter$loadAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersArbitraryDestinationSelectionPresenter$loadAddress$1(d dVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$geoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersArbitraryDestinationSelectionPresenter$loadAddress$1(this.this$0, this.$geoPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersArbitraryDestinationSelectionPresenter$loadAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        mym0 mym0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        d dVar2 = this.label;
        try {
            if (dVar2 == 0) {
                kotlin.b.b(obj);
                ((mym0) this.this$0.Dg()).G();
                ScootersPinStateRepository scootersPinStateRepository = this.this$0.J;
                scootersPinStateRepository.getClass();
                scootersPinStateRepository.b.l(ScootersPinStateRepository.State.LOADING);
                d dVar3 = this.this$0;
                zzs zzsVar = this.$geoPoint;
                mym0 mym0Var2 = (mym0) dVar3.Dg();
                this.L$0 = dVar3;
                this.L$1 = dVar3;
                this.L$2 = mym0Var2;
                this.label = 1;
                obj = kotlinx.coroutines.flow.e.y(atd0.a(dVar3.B, zzsVar, RoutePointType.SERVICE_SCOOTERS), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                dVar = dVar3;
                mym0Var = mym0Var2;
                dVar2 = dVar3;
            } else {
                if (dVar2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mym0Var = (mym0) this.L$2;
                d dVar4 = (d) this.L$1;
                dVar = (d) this.L$0;
                kotlin.b.b(obj);
                dVar2 = dVar4;
            }
            mym0Var.U(((pv0) obj).a.D1());
            ((mym0) dVar.Dg()).Z();
            ScootersPinStateRepository scootersPinStateRepository2 = dVar.J;
            scootersPinStateRepository2.getClass();
            scootersPinStateRepository2.b.l(ScootersPinStateRepository.State.LOADED);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.c(String.format("Address loading failed while arbitrary destination selection in scooters", Arrays.copyOf(new Object[]{th}, 1)));
            ScootersPinStateRepository scootersPinStateRepository3 = dVar2.J;
            scootersPinStateRepository3.getClass();
            scootersPinStateRepository3.b.l(ScootersPinStateRepository.State.ERROR);
            ((mym0) dVar2.Dg()).Qd();
        }
        return zy11.a;
    }
}
