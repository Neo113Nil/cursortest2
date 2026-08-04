package com.gamericefishpro.space.mf;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import com.gamericefishpro.space.r3.p;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
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
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (!new p(context).b.areNotificationsEnabled()) {
                return false;
            }
            if (str != null) {
                NotificationManager notificationManager = getNotificationManager(context);
                NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel(str) : null;
                if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public final void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> grouplessNotifs) {
        Intrinsics.checkNotNullParameter(grouplessNotifs, "grouplessNotifs");
        int size = grouplessNotifs.size();
        int i = 0;
        while (i < size) {
            StatusBarNotification statusBarNotification = grouplessNotifs.get(i);
            i++;
            StatusBarNotification statusBarNotification2 = statusBarNotification;
            Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification2.getNotification());
            Intrinsics.checkNotNullExpressionValue(builderRecoverBuilder, "recoverBuilder(...)");
            Notification notificationBuild = builderRecoverBuilder.setGroup(GROUPLESS_SUMMARY_KEY).setOnlyAlertOnce(true).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
            Intrinsics.b(context);
            new p(context).a(statusBarNotification2.getId(), notificationBuild);
        }
    }

    public final com.gamericefishpro.space.ye.d generateNotificationOpenedResult$com_onesignal_notifications(JSONArray jsonArray, com.gamericefishpro.space.kd.a time) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        Intrinsics.checkNotNullParameter(time, "time");
        int length = jsonArray.length();
        int iOptInt = jsonArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        JSONObject jSONObject = null;
        String strOptString = null;
        for (int i = 0; i < length; i++) {
            try {
                jSONObject = jsonArray.getJSONObject(i);
                if (strOptString == null && jSONObject.has("actionId")) {
                    strOptString = jSONObject.optString("actionId", null);
                }
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new com.gamericefishpro.space.ye.c(jSONObject, time));
                }
            } catch (Throwable th) {
                com.gamericefishpro.space.od.b.error("Error parsing JSON item " + i + '/' + length + " for callback.", th);
            }
        }
        Intrinsics.b(jSONObject);
        com.gamericefishpro.space.ye.c cVar = new com.gamericefishpro.space.ye.c(arrayList, jSONObject, iOptInt, time);
        return new com.gamericefishpro.space.ye.d(cVar, new com.gamericefishpro.space.ye.e(strOptString, cVar.getLaunchURL()));
    }

    public final ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean zIsGroupSummary = isGroupSummary(statusBarNotification);
            boolean z = notification.getGroup() == null || Intrinsics.a(notification.getGroup(), GROUPLESS_SUMMARY_KEY);
            if (!zIsGroupSummary && z) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public final StatusBarNotification[] getActiveNotifications(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            StatusBarNotification[] activeNotifications = getNotificationManager(context).getActiveNotifications();
            Intrinsics.checkNotNullExpressionValue(activeNotifications, "getActiveNotifications(...)");
            return activeNotifications;
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public final String getCampaignNameFromNotification(com.gamericefishpro.space.ve.f notification) {
        String templateId;
        Intrinsics.checkNotNullParameter(notification, "notification");
        String templateName = notification.getTemplateName();
        if ((templateName == null || templateName.length() != 0) && ((templateId = notification.getTemplateId()) == null || templateId.length() != 0)) {
            return notification.getTemplateName() + " - " + notification.getTemplateId();
        }
        if (notification.getTitle() == null) {
            return "";
        }
        String title = notification.getTitle();
        Intrinsics.b(title);
        String title2 = notification.getTitle();
        Intrinsics.b(title2);
        String strSubstring = title.substring(0, Math.min(10, title2.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final JSONObject getCustomJSONObject(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    public final int getGrouplessNotifsCount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = 0;
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            if ((statusBarNotification.getNotification().flags & 512) == 0 && GROUPLESS_SUMMARY_KEY.equals(statusBarNotification.getNotification().getGroup())) {
                i++;
            }
        }
        return i;
    }

    public final String getNotificationIdFromFCMJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(c.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject2.has("i")) {
                return jSONObject2.optString("i", null);
            }
            com.gamericefishpro.space.od.b.debug$default("Not a OneSignal formatted FCM message. No 'i' field in custom.", null, 2, null);
            return null;
        } catch (JSONException unused) {
            com.gamericefishpro.space.od.b.debug$default("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.", null, 2, null);
        }
    }

    public final NotificationManager getNotificationManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("notification");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final Uri getSoundUri(Context context, String str) {
        int identifier;
        Intrinsics.checkNotNullParameter(context, "context");
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
        Intrinsics.checkNotNullParameter(notif, "notif");
        return (notif.getNotification().flags & 512) != 0;
    }

    public final long[] parseVibrationPattern(JSONObject fcmBundle) {
        JSONArray jSONArray;
        Intrinsics.checkNotNullParameter(fcmBundle, "fcmBundle");
        try {
            Object objOpt = fcmBundle.opt("vib_pt");
            if (objOpt instanceof String) {
                jSONArray = new JSONArray((String) objOpt);
            } else {
                Intrinsics.c(objOpt, "null cannot be cast to non-null type org.json.JSONArray");
                jSONArray = (JSONArray) objOpt;
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
