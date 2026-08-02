package ru.yandex.taxi.fragment.preorder;

import defpackage.gmb0;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s31;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wpb0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.preorder.AddressMapPickupPointsController$processPickupPoints$1", f = "AddressMapPickupPointsController.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressMapPickupPointsController$processPickupPoints$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    final /* synthetic */ List<wpb0> $pickupPoints;
    Object L$0;
    int label;
    final /* synthetic */ s31 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickupPointsController$processPickupPoints$1(s31 s31Var, List list, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s31Var;
        this.$pickupPoints = list;
        this.$imageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickupPointsController$processPickupPoints$1(this.this$0, this.$pickupPoints, this.$imageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickupPointsController$processPickupPoints$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s31 s31Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                s31 s31Var2 = this.this$0;
                List<wpb0> list = this.$pickupPoints;
                String str = this.$imageTag;
                s31Var2.g.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                AddressMapPickupPointsController$processPickupPoints$1$1$pickup$1 addressMapPickupPointsController$processPickupPoints$1$1$pickup$1 = new AddressMapPickupPointsController$processPickupPoints$1$1$pickup$1(s31Var2, list, str, null);
                this.L$0 = s31Var2;
                this.label = 1;
                Object k0 = tje.k0(mdhVar, addressMapPickupPointsController$processPickupPoints$1$1$pickup$1, this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = k0;
                s31Var = s31Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s31Var = (s31) this.L$0;
                kotlin.b.b(obj);
            }
            s31Var.a.g((gmb0) obj);
            s31Var.a();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error fetching pickup points");
        }
        return zy11.a;
    }
}
