package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.s0;
import androidx.core.app.t;
import androidx.core.app.v;
import com.adjust.sdk.Constants;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.notifications.acknowledge.domain.a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes9.dex */
public final class xk60 {
    public static final int n = g0h0.notification;
    public final Application a;
    public final f b;
    public final zuj0 c;
    public final y72 d;
    public final h3y e;
    public final y72 f;
    public final ng60 g;
    public final k0b0 h;
    public final ej60 i;
    public final p0g0 j;
    public final kuq k;
    public final pw2 l;
    public final s0 m;

    public xk60(Application application, f fVar, zuj0 zuj0Var, y72 y72Var, h3y h3yVar, y72 y72Var2, ng60 ng60Var, k0b0 k0b0Var, ej60 ej60Var, p0g0 p0g0Var, kuq kuqVar, pw2 pw2Var) {
        this.a = application;
        this.b = fVar;
        this.c = zuj0Var;
        this.d = y72Var;
        this.e = h3yVar;
        this.f = y72Var2;
        this.g = ng60Var;
        this.h = k0b0Var;
        this.i = ej60Var;
        this.j = p0g0Var;
        this.k = kuqVar;
        this.l = pw2Var;
        s0 s0Var = new s0(application);
        this.m = s0Var;
        f(3, "default", true, kyh0.notification_channel_default);
        avj0 avj0Var = (avj0) zuj0Var;
        g("order", 4, avj0Var.h(kyh0.notification_channel_order), avj0Var.h(kyh0.notification_channel_order_description), false);
        g("order_progress_updates", 3, avj0Var.h(kyh0.notification_channel_order_progress_updates), avj0Var.h(kyh0.notification_channel_order_progress_updates_description), false);
        g("order_low", 2, avj0Var.h(kyh0.notification_channel_order_low), avj0Var.h(kyh0.notification_channel_order_low_description), false);
        f(4, "plus_subscription", true, kyh0.notification_channel_plus_subscription);
        f(4, "chat", true, kyh0.notification_channel_chat);
        f(3, "receipt", true, kyh0.notification_channel_receipt);
        f(4, "pay_in_partners", false, kyh0.notification_channel_cashback_title);
        f(3, "chargers", true, kyh0.notification_channel_chargers);
        f(4, "chargers_high", true, kyh0.notification_channel_chargers_high);
        s0Var.c("scooters_default");
        s0Var.c("navigator");
    }

    public final boolean a(String str) {
        NotificationChannel notificationChannel;
        return (!b() || (notificationChannel = this.m.b.getNotificationChannel(str)) == null || notificationChannel.getImportance() == 0) ? false : true;
    }

    public final boolean b() {
        return this.m.b.areNotificationsEnabled();
    }

    public final Intent c(Uri uri, NotificationShareData notificationShareData) {
        Class a = this.d.a(AndroidComponentRepository$Component.MAIN_ACTIVITY);
        Application application = this.a;
        Intent addFlags = new Intent(application, (Class<?>) a).setPackage(application.getPackageName()).setAction("android.intent.action.VIEW").setData(uri).putExtra("ru.yandex.taxi.activity.MainActivity.SURGE_FAKE_PIN", true).putExtra("deeplink_source", DeeplinkSource.PUSH).putExtra("KEY_OPEN_REASON", Constants.PUSH).addFlags(SelfTester_JCP.IMITA);
        return notificationShareData != null ? addFlags.putExtra("notification_share_data_extra", notificationShareData) : addFlags;
    }

    public final v d(String str, PendingIntent pendingIntent) {
        v vVar = new v(this.a, str);
        vVar.K.icon = n;
        vVar.z = ((avj0) this.c).a(rqg0.notification_tint_color);
        vVar.h = pendingIntent;
        vVar.h(16, true);
        vVar.h(2, false);
        vVar.g(-1);
        vVar.K.when = System.currentTimeMillis();
        return vVar;
    }

    public final v e(u2h u2hVar, NotificationShareData.a aVar) {
        v h;
        PendingIntent pendingIntent;
        int intValue;
        PendingIntent activity = PendingIntent.getActivity(this.a, 0, c(u2hVar.h(), aVar.a()), 201326592);
        if (u2hVar.g() != null) {
            pendingIntent = activity;
            h = i(u2hVar.a(), u2hVar.g(), u2hVar.f(), u2hVar.b(), pendingIntent, u2hVar.d());
        } else {
            h = h(u2hVar.a(), u2hVar.f(), u2hVar.b(), activity, u2hVar.d());
            pendingIntent = activity;
        }
        String c = u2hVar.c();
        if (c == null || evu0.J(c)) {
            c = null;
        }
        if (c != null) {
            intValue = c.hashCode();
        } else {
            Integer e = u2hVar.e();
            intValue = e != null ? e.intValue() : pendingIntent.hashCode();
        }
        aVar.e(intValue);
        if (c != null) {
            h.h(8, true);
        }
        return h;
    }

    public final void f(int i, String str, boolean z, int i2) {
        g(str, i, ((avj0) this.c).h(i2), null, z);
    }

    public final void g(String str, int i, String str2, String str3, boolean z) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.setShowBadge(z);
        if (str3 != null) {
            notificationChannel.setDescription(str3);
        }
        if (str.length() != 0 && str2.length() != 0) {
            this.m.b(notificationChannel);
            return;
        }
        jst.e.r(unr0.p("Invalid chanel creation: id=\"", str, "\", title=\"", str2, "\""), new IllegalArgumentException());
    }

    public final v h(String str, Bitmap bitmap, String str2, PendingIntent pendingIntent, long j) {
        String str3;
        int H = evu0.H(str, "\\n", 0, false, 6);
        if (H > 0) {
            String substring = str.substring(0, H);
            str = str.substring(H + 2);
            str3 = substring;
        } else {
            str3 = null;
        }
        return i(str.length() == 0 ? null : str, str3, bitmap, str2, pendingIntent, j);
    }

    public final v i(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, String str, PendingIntent pendingIntent, long j) {
        Bitmap bitmap2;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bitmap2 = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        } else {
            bitmap2 = null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("expiration_interval", j);
        v d = d(str, pendingIntent);
        d.e = v.d(charSequence2);
        d.f = v.d(charSequence);
        d.i(bitmap2);
        t.b bVar = new t.b();
        bVar.e(charSequence);
        d.l(bVar);
        d.y = bundle;
        d.H = j;
        return d;
    }

    public final Notification j(int i) {
        StatusBarNotification[] activeNotifications = this.m.b.getActiveNotifications();
        for (StatusBarNotification statusBarNotification : activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications)) {
            if (statusBarNotification.getId() == i) {
                return statusBarNotification.getNotification();
            }
        }
        return null;
    }

    public final PendingIntent k(Uri uri, Bundle bundle, NotificationShareData.a aVar) {
        Class a = this.d.a(AndroidComponentRepository$Component.MAIN_ACTIVITY);
        Application application = this.a;
        Intent data = new Intent(application, (Class<?>) a).addFlags(SelfTester_JCP.IMITA).setAction("android.intent.action.VIEW").setData(uri);
        if (bundle != null) {
            data.putExtras(bundle);
        }
        data.putExtra("notification_share_data_extra", aVar != null ? aVar.a() : null);
        return PendingIntent.getActivity(application, 0, data, 201326592);
    }

    public final Notification l(NotificationShareData.a aVar, v vVar) {
        NotificationShareData a = aVar.a();
        Class a2 = this.f.a(AndroidComponentRepository$Component.NOTIFICATIONS_DISMISS_RECEIVER);
        Application application = this.a;
        Intent intent = new Intent(application, (Class<?>) a2);
        intent.putExtra("notification_share_data_extra", a);
        vVar.K.deleteIntent = PendingIntent.getBroadcast(application, 0, intent, 201326592);
        Notification b = vVar.b();
        String c = aVar.c();
        int b2 = aVar.b();
        String a3 = t.a(b);
        unr0.C(new Object[]{Integer.valueOf(b2), c, b.getGroup(), String.valueOf(t.e(b)), a3, t.c(b), t.b(b), Boolean.valueOf((b.flags & 2) != 0), Boolean.valueOf((b.flags & 16) != 0)}, 9, "notify_test [\nid = %d\ntag = %s\ngroup = %s\nisSummary = %s\nchannel = %s\ntitle = %s\ntext = %s\nisOngoing = %s\nautoCancel = %s\n]", jst.e);
        this.i.d(c, b2, b);
        boolean f = this.h.f();
        ng60 ng60Var = this.g;
        if (!f || (a3 != null && !a(a3))) {
            ng60Var.b(a);
        } else if (a == null) {
            ng60Var.getClass();
        } else {
            yqg yqgVar = ng60Var.b;
            Calendar calendar = Calendar.getInstance();
            yqgVar.getClass();
            String a4 = zqg.a(calendar);
            p0g0 p0g0Var = ng60Var.d;
            String valueOf = String.valueOf(a.getId());
            String pushId = a.getPushId();
            String transitId = a.getTransitId();
            String type = a.getType();
            p0g0Var.getClass();
            HashMap hashMap = new HashMap();
            if (valueOf != null) {
                hashMap.put("id", valueOf);
            }
            if (pushId != null) {
                hashMap.put("push_id", pushId);
            }
            if (a4 != null) {
                hashMap.put("shown_date", a4);
            }
            if (transitId != null) {
                hashMap.put("transit_id", transitId);
            }
            if (type != null) {
                hashMap.put("type", type);
            }
            p0g0Var.a.a("Push.Shown", hashMap, 1, new HashMap());
            String pushId2 = a.getPushId();
            if (pushId2 != null) {
                ((a) ng60Var.c.a.get()).b(pushId2, PushAckStatus.SHOWN);
            }
        }
        if (jl40.l(a3, "default")) {
            r85.f(new Exception("DEFAULT_CHANNEL_USED"), "DEFAULT_CHANNEL_USED", "Notification title: " + ((Object) t.c(b)));
            if (a != null) {
                String pushId3 = a.getPushId();
                String type2 = a.getType();
                String transitId2 = a.getTransitId();
                p0g0 p0g0Var2 = this.j;
                p0g0Var2.getClass();
                HashMap hashMap2 = new HashMap();
                if (pushId3 != null) {
                    hashMap2.put("push_id", pushId3);
                }
                if (type2 != null) {
                    hashMap2.put("type", type2);
                }
                if (transitId2 != null) {
                    hashMap2.put("transit_id", transitId2);
                }
                p0g0Var2.a.a("Push.DefaultChannelUsed.Error", hashMap2, 1, new HashMap());
            }
        }
        return b;
    }

    public final Notification m(NotificationShareData.a aVar, v vVar, String str, String str2) {
        NotificationShareData.a aVar2 = new NotificationShareData.a();
        aVar2.e(0);
        aVar2.h(str);
        v vVar2 = new v(this.a, str2);
        vVar2.K.icon = n;
        vVar2.r = str;
        vVar2.s = true;
        vVar2.h(16, true);
        vVar2.I = 2;
        vVar2.l(new t.e());
        vVar.r = str;
        Notification l = l(aVar, vVar);
        l(aVar2, vVar2);
        return l;
    }

    public final void n(u2h u2hVar, NotificationShareData.a aVar, String str) {
        if (str == null) {
            l(aVar, e(u2hVar, aVar));
            return;
        }
        v e = e(u2hVar, aVar);
        e.r = str;
        m(aVar, e, str, u2hVar.b());
    }

    public final void o(dt20 dt20Var, NotificationShareData.a aVar, long j) {
        xk60 xk60Var;
        v h;
        PendingIntent pendingIntent;
        if (aVar == null) {
            aVar = new NotificationShareData.a();
        }
        Bundle bundle = new Bundle(2);
        bundle.putBoolean("ru.yandex.taxi.activity.MainActivity.SURGE_FAKE_PIN", true);
        PendingIntent k = k(null, bundle, aVar);
        if (dt20Var.k() != null) {
            pendingIntent = k;
            xk60Var = this;
            h = xk60Var.i(dt20Var.g(), dt20Var.k(), dt20Var.j(), dt20Var.i(), pendingIntent, j);
        } else {
            xk60Var = this;
            h = xk60Var.h(dt20Var.g(), dt20Var.j(), dt20Var.i(), k, j);
            pendingIntent = k;
        }
        aVar.e(pendingIntent.hashCode());
        xk60Var.l(aVar, h);
    }
}
