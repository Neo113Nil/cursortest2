package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.v;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.adjust.sdk.Constants;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.messaging.internal.authorized.chat.notifications.autocancel.CancelNotificationBroadcastReceiver;
import defpackage.guy;
import defpackage.iuy;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wzg0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/trigger_communications/abandoned_cart/domain/AbandonedCartNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AbandonedCartNotificationWorker extends CoroutineWorker {
    public final NotificationManager c;

    public AbandonedCartNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.c = (NotificationManager) context.getSystemService(NotificationManager.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AbandonedCartNotificationWorker$doWork$1 abandonedCartNotificationWorker$doWork$1;
        int i;
        String a;
        String a2;
        Intent launchIntentForPackage;
        if (continuationImpl instanceof AbandonedCartNotificationWorker$doWork$1) {
            abandonedCartNotificationWorker$doWork$1 = (AbandonedCartNotificationWorker$doWork$1) continuationImpl;
            int i2 = abandonedCartNotificationWorker$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                abandonedCartNotificationWorker$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = abandonedCartNotificationWorker$doWork$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abandonedCartNotificationWorker$doWork$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a3 = getInputData().a(CancelNotificationBroadcastReceiver.NOTIFICATION_ID);
                    if (a3 != null && (a = getInputData().a("title")) != null && (a2 = getInputData().a("body")) != null) {
                        String a4 = getInputData().a(Constants.DEEPLINK);
                        NotificationManager notificationManager = this.c;
                        if ((notificationManager != null ? notificationManager.getNotificationChannel("abandoned_cart") : null) == null) {
                            NotificationChannel notificationChannel = new NotificationChannel("abandoned_cart", "AbandonedCart", 4);
                            if (notificationManager != null) {
                                notificationManager.createNotificationChannel(notificationChannel);
                            }
                        }
                        if (a4 != null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(a4));
                            launchIntentForPackage.setFlags(DivSeparatorView.DEFAULT_DIVIDER_COLOR);
                        } else {
                            launchIntentForPackage = getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName());
                        }
                        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), a3.hashCode(), launchIntentForPackage, 201326592);
                        int i3 = wzg0.ic_box_fill;
                        v vVar = new v(getApplicationContext(), "abandoned_cart");
                        vVar.K.icon = i3;
                        vVar.e = v.d(a);
                        vVar.f = v.d(a2);
                        vVar.m = 1;
                        vVar.h(16, true);
                        vVar.h = activity;
                        Notification b = vVar.b();
                        if (notificationManager != null) {
                            notificationManager.notify(a3.hashCode(), b);
                        }
                        abandonedCartNotificationWorker$doWork$1.L$0 = null;
                        abandonedCartNotificationWorker$doWork$1.L$1 = null;
                        abandonedCartNotificationWorker$doWork$1.L$2 = null;
                        abandonedCartNotificationWorker$doWork$1.L$3 = null;
                        abandonedCartNotificationWorker$doWork$1.label = 1;
                        sjh sjhVar = uyj.a;
                        Object k0 = tje.k0(mdh.b, new AbandonedCartNotificationWorker$saveDeliveredNotification$2(this, a3, null), abandonedCartNotificationWorker$doWork$1);
                        if (k0 != obj2) {
                            k0 = zy11.a;
                        }
                        if (k0 == obj2) {
                            return obj2;
                        }
                    }
                    return new guy();
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return new iuy();
            }
        }
        abandonedCartNotificationWorker$doWork$1 = new AbandonedCartNotificationWorker$doWork$1(this, continuationImpl);
        Object obj3 = abandonedCartNotificationWorker$doWork$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abandonedCartNotificationWorker$doWork$1.label;
        if (i != 0) {
        }
        return new iuy();
    }
}
