package ru.yandex.taxi.masstransit.deeplink;

import com.yandex.go.deeplinks.generated.masstransit_payment_ble.MasstransitPaymentBleExitBehavior;
import defpackage.fx60;
import defpackage.h010;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.r010;
import defpackage.r310;
import defpackage.rib1;
import defpackage.s310;
import defpackage.v770;
import defpackage.w511;
import defpackage.x111;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.masstransit.model.MtInitState$GeoPayment;

/* loaded from: classes9.dex */
public final class a extends s310 {
    public final h010 b;
    public final x111 c;
    public final fx60 d;

    public a(h010 h010Var, x111 x111Var, fx60 fx60Var) {
        this.b = h010Var;
        this.c = x111Var;
        this.d = fx60Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((r310) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(r310 r310Var, ContinuationImpl continuationImpl) {
        MassTransitPaymentBleDeeplinkHandler$handleDeeplink$1 massTransitPaymentBleDeeplinkHandler$handleDeeplink$1;
        int i;
        boolean booleanValue;
        MtInitState$GeoPayment.ExitBehavior exitBehavior;
        if (continuationImpl instanceof MassTransitPaymentBleDeeplinkHandler$handleDeeplink$1) {
            massTransitPaymentBleDeeplinkHandler$handleDeeplink$1 = (MassTransitPaymentBleDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.MASSTRANSIT;
                    massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.L$1 = r310Var;
                    massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.d.c(events$Zalogin$LoginContext, massTransitPaymentBleDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r310Var = (r310) massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.L$1;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (booleanValue) {
                    return zy11Var;
                }
                this.c.a();
                MasstransitPaymentBleExitBehavior a = r310Var.a();
                int i3 = a == null ? -1 : r010.a[a.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        exitBehavior = MtInitState$GeoPayment.ExitBehavior.DismissMassTransitMode;
                        this.b.a(new MtInitState$GeoPayment(exitBehavior, rib1.e(r310Var.c(), r310Var.b())), null);
                        return zy11Var;
                    }
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                }
                exitBehavior = MtInitState$GeoPayment.ExitBehavior.OpenTransportMain;
                this.b.a(new MtInitState$GeoPayment(exitBehavior, rib1.e(r310Var.c(), r310Var.b())), null);
                return zy11Var;
            }
        }
        massTransitPaymentBleDeeplinkHandler$handleDeeplink$1 = new MassTransitPaymentBleDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = massTransitPaymentBleDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (booleanValue) {
        }
    }
}
