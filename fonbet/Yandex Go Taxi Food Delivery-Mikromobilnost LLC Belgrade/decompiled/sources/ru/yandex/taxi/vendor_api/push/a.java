package ru.yandex.taxi.vendor_api.push;

import android.app.NotificationChannel;
import android.os.Looper;
import defpackage.b64;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mdh;
import defpackage.p0g0;
import defpackage.r85;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.xk60;
import defpackage.y4g0;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes10.dex */
public final class a implements PushFilter {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;

    public a(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.e = h3yVar5;
        this.f = h3yVar6;
    }

    public final boolean a(String str) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            return ((Boolean) tje.Y(EmptyCoroutineContext.a, new AppMetricaPushFilter$fetchPushNotificationChannels$2(this, str, null))).booleanValue();
        }
        r85.f(null, "APP_METRICA_PUSH_WRONG_THREAD", "'" + str + "' is missed and failed to create sync because of MainThread");
        tse tseVar = (tse) this.d.get();
        ((tt2) this.e.get()).getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, mdh.b, null, new AppMetricaPushFilter$fetchPushNotificationChannels$1(this, str, null), 2);
        return false;
    }

    public final boolean b(String str) {
        List<NotificationChannel> notificationChannels = ((xk60) this.c.get()).m.b.getNotificationChannels();
        if ((notificationChannels instanceof Collection) && notificationChannels.isEmpty()) {
            return true;
        }
        Iterator<T> it = notificationChannels.iterator();
        while (it.hasNext()) {
            if (jl40.l(((NotificationChannel) it.next()).getId(), str)) {
                return false;
            }
        }
        return true;
    }

    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        PushNotification notification = pushMessage.getNotification();
        String channelId = notification != null ? notification.getChannelId() : null;
        String notificationId = pushMessage.getNotificationId();
        h3y h3yVar = this.f;
        if (channelId != null && b(channelId)) {
            boolean a = a(channelId);
            if (b(channelId)) {
                if (a) {
                    ((p0g0) h3yVar.get()).b(notificationId, "APP_METRICA_PUSH", null, Collections.singletonList(channelId));
                    String contentTitle = notification.getContentTitle();
                    StringBuilder v = b64.v("\"", channelId, "\" is missed after update. '", notificationId, "'/'");
                    v.append(contentTitle);
                    r85.f(null, "APP_METRICA_PUSH_WRONG_CHANNEL", v.toString());
                }
                return PushFilter.FilterResult.silence("Filtered: " + channelId + " is missed in the app", null);
            }
        }
        if (channelId == null || evu0.J(channelId)) {
            r85.f(null, "APP_METRICA_PUSH_NO_CHANNEL", "Blocked: channelId is null or blank - '" + notificationId + "'");
            return PushFilter.FilterResult.silence("Blocked: channelId is null or blank", null);
        }
        if (((y4g0) this.a.get()).c(channelId)) {
            return PushFilter.FilterResult.show();
        }
        ((p0g0) h3yVar.get()).a(notificationId, "APP_METRICA_PUSH", null, Collections.singletonList(channelId));
        jst.e.o("APP_METRICA_PUSH_DISABLED_CHANNEL", unr0.p("Filtered: '", channelId, "' is disabled in the app - '", notificationId, "'"));
        return PushFilter.FilterResult.silence("Filtered: " + channelId + " is disabled in the app", null);
    }
}
