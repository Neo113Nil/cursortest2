package ru.cprocsp.ACSP.tools.common;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.t;
import androidx.core.app.v;
import defpackage.jzh0;
import defpackage.mjh0;
import defpackage.qog0;
import defpackage.syg0;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class CSPNotificationManager implements Constants {
    public static synchronized void createNotificationChannel(NotificationManager notificationManager, String str, String str2, int i) {
        synchronized (CSPNotificationManager.class) {
            Log.i(LogConstants.APP_LOGGER_TAG, "createNotificationChannel(), preparing channel...");
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
            notificationChannel.setLockscreenVisibility(0);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
            Log.i(LogConstants.APP_LOGGER_TAG, "createNotificationChannel(), channel has been configured.");
        }
    }

    public static synchronized void deleteCSPNotification(Context context, NotificationManager notificationManager) {
        synchronized (CSPNotificationManager.class) {
            if (context.getResources().getBoolean(qog0.ShowCSPNotification)) {
                notificationManager.cancel(context.getResources().getInteger(mjh0.CSPNotificationID));
            }
        }
    }

    public static synchronized void showCSPNotification(Context context, PendingIntent pendingIntent, Bundle bundle) {
        synchronized (CSPNotificationManager.class) {
            try {
                String string = context.getString(jzh0.CompanyName);
                String string2 = context.getString(jzh0.UserActionRequired);
                String string3 = context.getString(jzh0.CSPNotificationChannelID);
                String string4 = context.getString(jzh0.CSPNotificationChannelName);
                int integer = context.getResources().getInteger(mjh0.CSPNotificationID);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (notificationManager.getNotificationChannel(string3) == null) {
                    createNotificationChannel(notificationManager, string3, string4, 4);
                }
                t.b bVar = new t.b();
                bVar.e = v.d(string2);
                bVar.b = v.d(string);
                v vVar = new v(context, string3);
                vVar.l(bVar);
                vVar.K.icon = syg0.ic_notifications;
                vVar.m = 1;
                vVar.n = true;
                vVar.K.when = System.currentTimeMillis();
                vVar.J = false;
                vVar.h = pendingIntent;
                vVar.e = v.d(string);
                vVar.f = v.d(string2);
                vVar.x = ACSPConstants.STATUS;
                vVar.h(16, true);
                vVar.y = bundle;
                Notification b = vVar.b();
                b.flags |= 32;
                notificationManager.notify(integer, b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
