package ru.yandex.taxi.masstransit.trains.checkout;

import android.content.Context;
import defpackage.ea40;
import defpackage.h3y;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.r7s0;
import defpackage.tj60;
import defpackage.wz1;
import defpackage.x3z;
import defpackage.zy11;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$CheckoutActionType;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;

/* loaded from: classes6.dex */
public final class s {
    public final Context a;
    public final k7x0 b;
    public final ru.yandex.taxi.widget.c c;
    public final h3y d;
    public final h3y e;
    public final ea40 f;
    public final String g = UUID.randomUUID().toString();

    public s(Context context, k7x0 k7x0Var, ru.yandex.taxi.widget.c cVar, h3y h3yVar, h3y h3yVar2, ea40 ea40Var) {
        this.a = context;
        this.b = k7x0Var;
        this.c = cVar;
        this.d = h3yVar;
        this.e = h3yVar2;
        this.f = ea40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r7s0 r7s0Var, Continuation continuation) {
        MtTrainShowNotificationActionInteractor$showNotification$1 mtTrainShowNotificationActionInteractor$showNotification$1;
        int i;
        String str;
        if (continuation instanceof MtTrainShowNotificationActionInteractor$showNotification$1) {
            mtTrainShowNotificationActionInteractor$showNotification$1 = (MtTrainShowNotificationActionInteractor$showNotification$1) continuation;
            int i2 = mtTrainShowNotificationActionInteractor$showNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainShowNotificationActionInteractor$showNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainShowNotificationActionInteractor$showNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainShowNotificationActionInteractor$showNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = r7s0Var.a;
                    mtTrainShowNotificationActionInteractor$showNotification$1.L$0 = r7s0Var;
                    mtTrainShowNotificationActionInteractor$showNotification$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.c, formattedText, null, mtTrainShowNotificationActionInteractor$showNotification$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7s0Var = (r7s0) mtTrainShowNotificationActionInteractor$showNotification$1.L$0;
                    kotlin.b.b(obj);
                }
                String obj2 = obj.toString();
                String str2 = r7s0Var.b;
                String a = str2 != null ? ((m7x0) this.b).a(str2) : null;
                LocalNotificationItemComponent localNotificationItemComponent = new LocalNotificationItemComponent(this.a, null, 0, 6, null);
                x3z x3zVar = new x3z();
                x3zVar.a = obj2;
                x3zVar.e = a;
                x3zVar.d = this.g;
                localNotificationItemComponent.init(x3zVar.a(), (pav) this.d.get());
                localNotificationItemComponent.setExpiresListener(new wz1(8, this));
                h3y h3yVar = this.e;
                ((tj60) h3yVar.get()).d(localNotificationItemComponent);
                ((tj60) h3yVar.get()).f();
                TransportRouteAnalytics$CheckoutActionType transportRouteAnalytics$CheckoutActionType = TransportRouteAnalytics$CheckoutActionType.Notification;
                str = r7s0Var.d;
                if (str == null) {
                    str = "";
                }
                this.f.a(transportRouteAnalytics$CheckoutActionType, str);
                return zy11.a;
            }
        }
        mtTrainShowNotificationActionInteractor$showNotification$1 = new MtTrainShowNotificationActionInteractor$showNotification$1(this, continuation);
        Object obj3 = mtTrainShowNotificationActionInteractor$showNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainShowNotificationActionInteractor$showNotification$1.label;
        if (i != 0) {
        }
        String obj22 = obj3.toString();
        String str22 = r7s0Var.b;
        if (str22 != null) {
        }
        LocalNotificationItemComponent localNotificationItemComponent2 = new LocalNotificationItemComponent(this.a, null, 0, 6, null);
        x3z x3zVar2 = new x3z();
        x3zVar2.a = obj22;
        x3zVar2.e = a;
        x3zVar2.d = this.g;
        localNotificationItemComponent2.init(x3zVar2.a(), (pav) this.d.get());
        localNotificationItemComponent2.setExpiresListener(new wz1(8, this));
        h3y h3yVar2 = this.e;
        ((tj60) h3yVar2.get()).d(localNotificationItemComponent2);
        ((tj60) h3yVar2.get()).f();
        TransportRouteAnalytics$CheckoutActionType transportRouteAnalytics$CheckoutActionType2 = TransportRouteAnalytics$CheckoutActionType.Notification;
        str = r7s0Var.d;
        if (str == null) {
        }
        this.f.a(transportRouteAnalytics$CheckoutActionType2, str);
        return zy11.a;
    }
}
