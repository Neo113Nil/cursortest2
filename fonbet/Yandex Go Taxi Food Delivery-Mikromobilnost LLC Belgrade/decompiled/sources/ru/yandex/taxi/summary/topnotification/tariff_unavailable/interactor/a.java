package ru.yandex.taxi.summary.topnotification.tariff_unavailable.interactor;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.fpx0;
import defpackage.hpx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, fpx0 fpx0Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1 tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        String str;
        if (continuation instanceof TariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1) {
            tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1 = (TariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = ((fnx0) obj).c.S.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((ServiceLevel.Branding) obj2).c == ServiceLevel.Branding.Type.TARIFF_UNAVAILABLE) {
                            break;
                        }
                    }
                    ServiceLevel.Branding branding = (ServiceLevel.Branding) obj2;
                    hpx0 hpx0Var = (branding == null || (str = branding.e) == null || evu0.J(str)) ? hpx0.e : new hpx0(str, branding.f, branding.k, branding.l);
                    tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(hpx0Var, tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1 = new TariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffUnavailableNotificationInteractor$initialInteractionFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
