package t5;

import D.I;
import D.N;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.onesignal.common.AndroidUtils;
import i5.InterfaceC4589f;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {
    public static final int GROUPLESS_SUMMARY_ID = -718463522;
    public static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";
    public static final e INSTANCE = new e();

    private e() {
    }

    public static /* synthetic */ boolean areNotificationsEnabled$default(e eVar, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return eVar.areNotificationsEnabled(context, str);
    }

    public final boolean areNotificationsEnabled(Context context, String str) {
        int importance;
        kotlin.jvm.internal.h.e(context, "context");
        try {
            if (!I.a(new N(context).f461b)) {
                return false;
            }
            if (str == null || Build.VERSION.SDK_INT < 26) {
                return true;
            }
            NotificationManager notificationManager = getNotificationManager(context);
            NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel(str) : null;
            if (notificationChannel == null) {
                return true;
            }
            importance = notificationChannel.getImportance();
            return importance != 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> grouplessNotifs) {
        kotlin.jvm.internal.h.e(grouplessNotifs, "grouplessNotifs");
        Iterator<StatusBarNotification> it = grouplessNotifs.iterator();
        while (it.hasNext()) {
            StatusBarNotification next = it.next();
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, next.getNotification());
            kotlin.jvm.internal.h.d(recoverBuilder, "recoverBuilder(...)");
            Notification build = recoverBuilder.setGroup(GROUPLESS_SUMMARY_KEY).setOnlyAlertOnce(true).build();
            kotlin.jvm.internal.h.d(build, "build(...)");
            kotlin.jvm.internal.h.b(context);
            new N(context).a(next.getId(), build);
        }
    }

    public final com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications(JSONArray jsonArray, K4.a time) {
        kotlin.jvm.internal.h.e(jsonArray, "jsonArray");
        kotlin.jvm.internal.h.e(time, "time");
        int length = jsonArray.length();
        int optInt = jsonArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        JSONObject jSONObject = null;
        String str = null;
        for (int i = 0; i < length; i++) {
            try {
                jSONObject = jsonArray.getJSONObject(i);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", null);
                }
                if (z3) {
                    z3 = false;
                } else {
                    arrayList.add(new com.onesignal.notifications.internal.c(jSONObject, time));
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error parsing JSON item " + i + '/' + length + " for callback.", th);
            }
        }
        kotlin.jvm.internal.h.b(jSONObject);
        com.onesignal.notifications.internal.c cVar = new com.onesignal.notifications.internal.c(arrayList, jSONObject, optInt, time);
        return new com.onesignal.notifications.internal.d(cVar, new com.onesignal.notifications.internal.e(str, cVar.getLaunchURL()));
    }

    public final ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean isGroupSummary = isGroupSummary(statusBarNotification);
            boolean z3 = notification.getGroup() == null || kotlin.jvm.internal.h.a(notification.getGroup(), GROUPLESS_SUMMARY_KEY);
            if (!isGroupSummary && z3) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public final StatusBarNotification[] getActiveNotifications(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            StatusBarNotification[] activeNotifications = getNotificationManager(context).getActiveNotifications();
            kotlin.jvm.internal.h.d(activeNotifications, "getActiveNotifications(...)");
            return activeNotifications;
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public final String getCampaignNameFromNotification(InterfaceC4589f notification) {
        String templateId;
        kotlin.jvm.internal.h.e(notification, "notification");
        String templateName = notification.getTemplateName();
        if ((templateName == null || templateName.length() != 0) && ((templateId = notification.getTemplateId()) == null || templateId.length() != 0)) {
            return notification.getTemplateName() + " - " + notification.getTemplateId();
        }
        if (notification.getTitle() == null) {
            return "";
        }
        String title = notification.getTitle();
        kotlin.jvm.internal.h.b(title);
        String title2 = notification.getTitle();
        kotlin.jvm.internal.h.b(title2);
        String substring = title.substring(0, Math.min(10, title2.length()));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public final JSONObject getCustomJSONObject(JSONObject jsonObject) {
        kotlin.jvm.internal.h.e(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString("custom"));
    }

    public final int getGrouplessNotifsCount(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        int i = 0;
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            if ((statusBarNotification.getNotification().flags & 512) == 0 && GROUPLESS_SUMMARY_KEY.equals(statusBarNotification.getNotification().getGroup())) {
                i++;
            }
        }
        return i;
    }

    public final String getNotificationIdFromFCMJson(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(jSONObject.getString("custom"));
        } catch (JSONException unused) {
            com.onesignal.debug.internal.logging.b.debug$default("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.", null, 2, null);
        }
        if (jSONObject2.has("i")) {
            return jSONObject2.optString("i", null);
        }
        com.onesignal.debug.internal.logging.b.debug$default("Not a OneSignal formatted FCM message. No 'i' field in custom.", null, 2, null);
        return null;
    }

    public final NotificationManager getNotificationManager(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final Uri getSoundUri(Context context, String str) {
        int identifier;
        kotlin.jvm.internal.h.e(context, "context");
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (AndroidUtils.INSTANCE.isValidResourceName(str) && (identifier = resources.getIdentifier(str, "raw", packageName)) != 0) {
            return Uri.parse("android.resource://" + packageName + '/' + identifier);
        }
        int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
        if (identifier2 == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + packageName + '/' + identifier2);
    }

    public final boolean isGroupSummary(StatusBarNotification notif) {
        kotlin.jvm.internal.h.e(notif, "notif");
        return (notif.getNotification().flags & 512) != 0;
    }

    public final long[] parseVibrationPattern(JSONObject fcmBundle) {
        JSONArray jSONArray;
        kotlin.jvm.internal.h.e(fcmBundle, "fcmBundle");
        try {
            Object opt = fcmBundle.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                kotlin.jvm.internal.h.c(opt, "null cannot be cast to non-null type org.json.JSONArray");
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }
}
