package ru.yandex.taxi.summary.topnotification;

import defpackage.ny61;
import defpackage.pk60;
import defpackage.tj60;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.NotificationItemComponent;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: ru.yandex.taxi.summary.topnotification.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0120a {
        public abstract NotificationItemComponent a();
    }

    public void a() {
        e();
    }

    public abstract AbstractC0120a b();

    public abstract String c();

    public abstract tj60 d();

    public final void e() {
        d().a(c());
        d().c(c());
    }

    public abstract Object f(NotificationItemComponent notificationItemComponent, pk60 pk60Var, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(pk60 pk60Var, ContinuationImpl continuationImpl) {
        NotificationController$showNotification$1 notificationController$showNotification$1;
        int i;
        NotificationItemComponent notificationItemComponent;
        if (continuationImpl instanceof NotificationController$showNotification$1) {
            notificationController$showNotification$1 = (NotificationController$showNotification$1) continuationImpl;
            int i2 = notificationController$showNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationController$showNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationController$showNotification$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationController$showNotification$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    NotificationItemComponent a = d().a(c());
                    if (a == null) {
                        a = b().a();
                    }
                    if (!h(a, pk60Var)) {
                        e();
                        return zy11.a;
                    }
                    notificationController$showNotification$1.L$0 = null;
                    notificationController$showNotification$1.L$1 = a;
                    notificationController$showNotification$1.label = 1;
                    if (f(a, pk60Var, notificationController$showNotification$1) == obj2) {
                        return obj2;
                    }
                    notificationItemComponent = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    notificationItemComponent = (NotificationItemComponent) notificationController$showNotification$1.L$1;
                    kotlin.b.b(obj);
                }
                d().e(notificationItemComponent);
                return zy11.a;
            }
        }
        notificationController$showNotification$1 = new NotificationController$showNotification$1(this, continuationImpl);
        Object obj3 = notificationController$showNotification$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationController$showNotification$1.label;
        if (i != 0) {
        }
        d().e(notificationItemComponent);
        return zy11.a;
    }

    public abstract boolean h(NotificationItemComponent notificationItemComponent, pk60 pk60Var);
}
