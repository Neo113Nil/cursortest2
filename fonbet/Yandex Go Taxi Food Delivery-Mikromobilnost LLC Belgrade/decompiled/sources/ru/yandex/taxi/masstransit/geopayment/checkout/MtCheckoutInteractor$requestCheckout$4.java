package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.flb;
import defpackage.ge30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/go/address/models/Address;", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$requestCheckout$4", f = "MtCheckoutInteractor.kt", l = {263}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCheckoutInteractor$requestCheckout$4 extends SuspendLambda implements wls {
    final /* synthetic */ String $destinationStopId;
    final /* synthetic */ String $directionId;
    final /* synthetic */ String $id;
    final /* synthetic */ Object $metaCheckoutInfo;
    final /* synthetic */ String $qrUrl;
    final /* synthetic */ String $startingStopId;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutInteractor$requestCheckout$4(k kVar, Object obj, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$metaCheckoutInfo = obj;
        this.$id = str;
        this.$qrUrl = str2;
        this.$startingStopId = str3;
        this.$destinationStopId = str4;
        this.$directionId = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtCheckoutInteractor$requestCheckout$4 mtCheckoutInteractor$requestCheckout$4 = new MtCheckoutInteractor$requestCheckout$4(this.this$0, this.$metaCheckoutInfo, this.$id, this.$qrUrl, this.$startingStopId, this.$destinationStopId, this.$directionId, continuation);
        mtCheckoutInteractor$requestCheckout$4.L$0 = obj;
        return mtCheckoutInteractor$requestCheckout$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCheckoutInteractor$requestCheckout$4) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Zone zone;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Address address = (Address) pair.getFirst();
            boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
            zzs B = address.B();
            ZoneAddress n = this.this$0.a.n();
            if (n == null || (zone = n.b) == null || (str = zone.a) == null) {
                str = "";
            }
            flb flbVar = new flb(this.$id, this.$qrUrl, B, this.$startingStopId, this.$destinationStopId, this.$directionId, str, new Integer(this.this$0.a()), booleanValue ? this.$metaCheckoutInfo : null);
            ge30 ge30Var = this.this$0.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.Z$0 = booleanValue;
            this.label = 1;
            if (((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) ge30Var).b(flbVar, this) == coroutineSingletons) {
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
