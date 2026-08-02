package ru.yandex.taxi.summary.topnotification.plus;

import com.yandex.go.payments.api.composite.CompositePaymentState;
import defpackage.ird;
import defpackage.mrd;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CompositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1 compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1;
        int i;
        CompositePaymentState compositePaymentState;
        if (continuation instanceof CompositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1) {
            compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1 = (CompositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1) continuation;
            int i2 = compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mrd mrdVar = (mrd) obj;
                    String str = mrdVar.b;
                    String str2 = mrdVar.c;
                    ird irdVar = ((str.length() == 0 && str2.length() == 0) || (compositePaymentState = mrdVar.a) == CompositePaymentState.ENABLED_CHECKED || compositePaymentState == CompositePaymentState.DISABLED || this.b.b.a.g("ru.yandex.taxi.utils.PreferenceUtils.FIELD_COMPOSITE_PAYMENT_NOTIFICATION_WAS_HIDDEN", false)) ? ird.g : new ird(true, mrdVar.e, str, str2);
                    compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.L$0 = null;
                    compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.L$1 = null;
                    compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.L$2 = null;
                    compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.L$3 = null;
                    compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(irdVar, compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1 = new CompositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositePaymentNotificationInteractor$notificationModelFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
