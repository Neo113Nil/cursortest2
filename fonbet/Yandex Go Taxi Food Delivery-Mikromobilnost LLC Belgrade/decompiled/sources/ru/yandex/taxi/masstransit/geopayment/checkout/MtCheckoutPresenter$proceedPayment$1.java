package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.f4a0;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.n6f;
import defpackage.ny61;
import defpackage.pd30;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$VehicleType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutPresenter$proceedPayment$1", f = "MtCheckoutPresenter.kt", l = {526}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCheckoutPresenter$proceedPayment$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $destinationStopId;
    final /* synthetic */ Object $metaPaymentInfo;
    final /* synthetic */ f4a0 $paymentMethod;
    final /* synthetic */ boolean $paymentMethodAvailable;
    final /* synthetic */ Double $price;
    final /* synthetic */ String $startingStopId;
    final /* synthetic */ int $ticketsCount;
    final /* synthetic */ String $transportId;
    final /* synthetic */ String $zoneName;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutPresenter$proceedPayment$1(t tVar, String str, int i, String str2, String str3, f4a0 f4a0Var, boolean z, Double d, String str4, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$transportId = str;
        this.$ticketsCount = i;
        this.$startingStopId = str2;
        this.$destinationStopId = str3;
        this.$paymentMethod = f4a0Var;
        this.$paymentMethodAvailable = z;
        this.$price = d;
        this.$zoneName = str4;
        this.$metaPaymentInfo = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCheckoutPresenter$proceedPayment$1(this.this$0, this.$transportId, this.$ticketsCount, this.$startingStopId, this.$destinationStopId, this.$paymentMethod, this.$paymentMethodAvailable, this.$price, this.$zoneName, this.$metaPaymentInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCheckoutPresenter$proceedPayment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        f4a0 f4a0Var;
        String str;
        Double d;
        String str2;
        Zone zone;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t tVar = this.this$0;
            k kVar = tVar.G;
            String str3 = this.$transportId;
            int i2 = this.$ticketsCount;
            String str4 = this.$startingStopId;
            String str5 = this.$destinationStopId;
            f4a0 f4a0Var2 = this.$paymentMethod;
            boolean z2 = this.$paymentMethodAvailable;
            TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason = tVar.C;
            TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = tVar.S;
            Double d2 = this.$price;
            String str6 = this.$zoneName;
            Object obj2 = this.$metaPaymentInfo;
            this.label = 1;
            e eVar = kVar.f;
            lv90 lv90Var = f4a0Var2.b;
            ZoneAddress n = kVar.a.n();
            String str7 = (n == null || (zone = n.b) == null) ? null : zone.a;
            eVar.getClass();
            String b = lv90Var.b();
            String str8 = str7;
            String str9 = b == null ? "" : b;
            String str10 = lv90Var.b;
            if (str10 == null) {
                str10 = "";
            }
            n6f.a aVar = new n6f.a(str9, str10);
            ru.yandex.taxi.masstransit.geopayment.checkout.network.a aVar2 = eVar.a;
            String uuid = UUID.randomUUID().toString();
            if (str5 != null) {
                z = z2;
                f4a0Var = f4a0Var2;
                str = uuid;
                str2 = str4;
                d = d2;
            } else {
                z = z2;
                f4a0Var = f4a0Var2;
                str = uuid;
                d = d2;
                str2 = null;
            }
            if (new d(aVar2.b(new n6f(str, str3, aVar, i2, str2, str5, str8, obj2))).collect(new pd30(kVar, str3, f4a0Var, z, transportPaymentAnalytics$CheckoutScreenOpenReason, transportPaymentAnalytics$VehicleType, d, i2, str5, str6), this) == coroutineSingletons) {
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
