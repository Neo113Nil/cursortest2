package ru.yandex.taxi.notifications.tips;

import android.app.Application;
import android.widget.RemoteViews;
import androidx.core.app.q;
import androidx.core.app.t;
import androidx.core.app.v;
import defpackage.avj0;
import defpackage.rqg0;
import defpackage.teh;
import defpackage.w511;
import defpackage.weh0;
import defpackage.zqh0;
import defpackage.zuj0;
import java.util.List;

/* loaded from: classes9.dex */
public final class b {
    public final Application a;
    public final zuj0 b;

    public b(Application application, zuj0 zuj0Var) {
        this.a = application;
        this.b = zuj0Var;
    }

    public final void a(v vVar, teh tehVar) {
        RemoteViews b = b(TipsNotificationBuilder$NotificationSize.SMALL, tehVar);
        RemoteViews b2 = tehVar.p() ? b(TipsNotificationBuilder$NotificationSize.HEADS_UP, tehVar) : b;
        RemoteViews b3 = b(TipsNotificationBuilder$NotificationSize.BIG, tehVar);
        vVar.E = b2;
        vVar.C = b;
        vVar.D = b3;
        vVar.l(new t.d());
        vVar.h(16, false);
    }

    public final RemoteViews b(TipsNotificationBuilder$NotificationSize tipsNotificationBuilder$NotificationSize, teh tehVar) {
        int i;
        int[] iArr = a.a;
        int i2 = iArr[tipsNotificationBuilder$NotificationSize.ordinal()];
        q qVar = null;
        if (i2 == 1) {
            i = zqh0.layout_notification_tips_small;
        } else if (i2 == 2) {
            i = zqh0.layout_notification_tips_heads_up;
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            i = zqh0.layout_notification_tips_big;
        }
        Application application = this.a;
        RemoteViews remoteViews = new RemoteViews(application.getPackageName(), i);
        remoteViews.setTextViewText(weh0.notification_title, tehVar.n());
        remoteViews.setTextViewText(weh0.notification_content, tehVar.m());
        if (tipsNotificationBuilder$NotificationSize == TipsNotificationBuilder$NotificationSize.SMALL) {
            remoteViews.setOnClickPendingIntent(weh0.tip_small_button, tehVar.k().h);
            return remoteViews;
        }
        int i3 = iArr[tipsNotificationBuilder$NotificationSize.ordinal()];
        List<q> f = i3 != 2 ? i3 != 3 ? null : tehVar.f() : tehVar.h();
        if (f != null) {
            remoteViews.setViewVisibility(weh0.tips_buttons_container, 0);
            for (q qVar2 : f) {
                RemoteViews remoteViews2 = new RemoteViews(application.getPackageName(), zqh0.layout_tips_button);
                remoteViews2.setTextViewText(weh0.button, qVar2.g);
                remoteViews2.setOnClickPendingIntent(weh0.button, qVar2.h);
                remoteViews2.setTextColor(weh0.button, ((avj0) this.b).a(rqg0.notification_plates_text));
                remoteViews.addView(weh0.tips_buttons_container, remoteViews2);
            }
        }
        int i4 = a.a[tipsNotificationBuilder$NotificationSize.ordinal()];
        if (i4 == 2) {
            qVar = tehVar.g();
        } else if (i4 == 3) {
            qVar = tehVar.e();
        }
        if (qVar != null) {
            remoteViews.setViewVisibility(weh0.tip_big_button, 0);
            remoteViews.setOnClickPendingIntent(weh0.tip_big_button, qVar.h);
            remoteViews.setTextViewText(weh0.tip_big_button_text, qVar.g);
        }
        return remoteViews;
    }
}
