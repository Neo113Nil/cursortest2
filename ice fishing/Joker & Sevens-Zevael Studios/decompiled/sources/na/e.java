package na;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.j;
import x2.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {
    public static final int GROUPLESS_SUMMARY_ID = -718463522;
    public static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";
    public static final e INSTANCE = new e();

    private e() {
    }

    public static /* synthetic */ boolean areNotificationsEnabled$default(e eVar, Context context, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return eVar.areNotificationsEnabled(context, str);
    }

    public final boolean areNotificationsEnabled(Context context, String str) {
        j.e(context, "context");
        if (!new q(context).f8283b.areNotificationsEnabled()) {
            return false;
        }
        if (str != null) {
            NotificationManager notificationManager = getNotificationManager(context);
            NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel(str) : null;
            if (notificationChannel != null) {
                if (notificationChannel.getImportance() == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> arrayList) {
        j.e(arrayList, "grouplessNotifs");
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StatusBarNotification statusBarNotification = arrayList.get(i10);
            i10++;
            StatusBarNotification statusBarNotification2 = statusBarNotification;
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification2.getNotification());
            j.d(recoverBuilder, "recoverBuilder(context, …uplessNotif.notification)");
            Notification build = recoverBuilder.setGroup(GROUPLESS_SUMMARY_KEY).setOnlyAlertOnce(true).build();
            j.d(build, "grouplessNotifBuilder\n  …                 .build()");
            j.b(context);
            new q(context).a(statusBarNotification2.getId(), build);
        }
    }

    public final com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications(JSONArray jSONArray, e9.a aVar) {
        j.e(jSONArray, "jsonArray");
        j.e(aVar, bb.e.TIME);
        int length = jSONArray.length();
        int optInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        JSONObject jSONObject = null;
        String str = null;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jSONObject = jSONArray.getJSONObject(i10);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", null);
                }
                if (z10) {
                    z10 = false;
                } else {
                    arrayList.add(new com.onesignal.notifications.internal.c(jSONObject, aVar));
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error parsing JSON item " + i10 + '/' + length + " for callback.", th);
            }
        }
        j.b(jSONObject);
        com.onesignal.notifications.internal.c cVar = new com.onesignal.notifications.internal.c(arrayList, jSONObject, optInt, aVar);
        return new com.onesignal.notifications.internal.d(cVar, new com.onesignal.notifications.internal.e(str, cVar.getLaunchURL()));
    }

    public final ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        j.e(context, "context");
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean isGroupSummary = isGroupSummary(statusBarNotification);
            boolean z10 = notification.getGroup() == null || j.a(notification.getGroup(), GROUPLESS_SUMMARY_KEY);
            if (!isGroupSummary && z10) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public final StatusBarNotification[] getActiveNotifications(Context context) {
        j.e(context, "context");
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            StatusBarNotification[] activeNotifications = getNotificationManager(context).getActiveNotifications();
            j.d(activeNotifications, "getNotificationManager(c…text).activeNotifications");
            return activeNotifications;
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public final String getCampaignNameFromNotification(ca.f fVar) {
        String templateId;
        j.e(fVar, "notification");
        String templateName = fVar.getTemplateName();
        if ((templateName == null || templateName.length() != 0) && ((templateId = fVar.getTemplateId()) == null || templateId.length() != 0)) {
            return fVar.getTemplateName() + " - " + fVar.getTemplateId();
        }
        if (fVar.getTitle() == null) {
            return "";
        }
        String title = fVar.getTitle();
        j.b(title);
        String title2 = fVar.getTitle();
        j.b(title2);
        String substring = title.substring(0, Math.min(10, title2.length()));
        j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final JSONObject getCustomJSONObject(JSONObject jSONObject) {
        j.e(jSONObject, "jsonObject");
        return new JSONObject(jSONObject.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    public final int getGrouplessNotifsCount(Context context) {
        j.e(context, "context");
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            if ((statusBarNotification.getNotification().flags & 512) == 0 && GROUPLESS_SUMMARY_KEY.equals(statusBarNotification.getNotification().getGroup())) {
                i10++;
            }
        }
        return i10;
    }

    public final String getNotificationIdFromFCMJson(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(jSONObject.getString(c.PAYLOAD_OS_ROOT_CUSTOM));
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
        j.e(context, "context");
        Object systemService = context.getSystemService("notification");
        j.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final Uri getSoundUri(Context context, String str) {
        int identifier;
        j.e(context, "context");
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

    public final boolean isGroupSummary(StatusBarNotification statusBarNotification) {
        j.e(statusBarNotification, "notif");
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }

    public final long[] parseVibrationPattern(JSONObject jSONObject) {
        JSONArray jSONArray;
        j.e(jSONObject, "fcmBundle");
        try {
            Object opt = jSONObject.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                j.c(opt, "null cannot be cast to non-null type org.json.JSONArray");
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArray.optLong(i10);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }
}
