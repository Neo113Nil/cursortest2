package com.gamericefishpro.space.lf;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.mf.d;
import com.gamericefishpro.space.mf.e;
import com.gamericefishpro.space.od.b;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.kf.a {
    private static final String CHANNEL_PREFIX = "OS_";
    public static final C0033a Companion = new C0033a(null);
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private final f _applicationService;
    private final com.gamericefishpro.space.zc.a _languageContext;
    private final Pattern hexPattern;

    /* JADX INFO: renamed from: com.gamericefishpro.space.lf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0033a {
        public /* synthetic */ C0033a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0033a() {
        }
    }

    public a(f _applicationService, com.gamericefishpro.space.zc.a _languageContext) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_languageContext, "_languageContext");
        this._applicationService = _applicationService;
        this._languageContext = _languageContext;
        this.hexPattern = Pattern.compile("^([A-Fa-f0-9]{8})$");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    private final String createChannel(Context context, NotificationManager notificationManager, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        long[] vibrationPattern;
        Object objOpt = jSONObject.opt("chnl");
        if (objOpt instanceof String) {
            jSONObject2 = new JSONObject((String) objOpt);
        } else {
            Intrinsics.c(objOpt, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject2 = (JSONObject) objOpt;
        }
        String str = DEFAULT_CHANNEL_ID;
        String strOptString = jSONObject2.optString("id", DEFAULT_CHANNEL_ID);
        if (!Intrinsics.a(strOptString, "miscellaneous")) {
            str = strOptString;
        }
        if (jSONObject2.has("langs")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("langs");
            String language = this._languageContext.getLanguage();
            if (jSONObject3.has(language)) {
                jSONObjectOptJSONObject = jSONObject3.optJSONObject(language);
            } else {
                jSONObjectOptJSONObject = jSONObject2;
            }
        } else {
            jSONObjectOptJSONObject = jSONObject2;
        }
        Intrinsics.b(jSONObjectOptJSONObject);
        NotificationChannel notificationChannel = new NotificationChannel(str, jSONObjectOptJSONObject.optString("nm", "Miscellaneous"), priorityToImportance(jSONObject.optInt("pri", 6)));
        notificationChannel.setDescription(jSONObjectOptJSONObject.optString("dscr", null));
        if (jSONObject2.has("grp_id")) {
            String strOptString2 = jSONObject2.optString("grp_id");
            String strOptString3 = jSONObjectOptJSONObject.optString("grp_nm");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(strOptString2, strOptString3));
            notificationChannel.setGroup(strOptString2);
        }
        if (jSONObject.has("ledc")) {
            String strOptString4 = jSONObject.optString("ledc");
            if (!this.hexPattern.matcher(strOptString4).matches()) {
                b.warn$default("OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)", null, 2, null);
                strOptString4 = "FFFFFFFF";
            }
            try {
                notificationChannel.setLightColor(new BigInteger(strOptString4, 16).intValue());
            } catch (Throwable th) {
                b.error("Couldn't convert ARGB Hex value to BigInteger:", th);
            }
        }
        notificationChannel.enableLights(jSONObject.optInt("led", 1) == 1);
        if (jSONObject.has("vib_pt") && (vibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject)) != null) {
            notificationChannel.setVibrationPattern(vibrationPattern);
        }
        notificationChannel.enableVibration(jSONObject.optInt("vib", 1) == 1);
        if (jSONObject.has("sound")) {
            String strOptString5 = jSONObject.optString("sound", null);
            Uri soundUri = e.INSTANCE.getSoundUri(context, strOptString5);
            if (soundUri != null) {
                notificationChannel.setSound(soundUri, null);
            } else if ("null".equals(strOptString5) || "nil".equals(strOptString5)) {
                notificationChannel.setSound(null, null);
            }
        }
        notificationChannel.setLockscreenVisibility(jSONObject.optInt("vis", 0));
        notificationChannel.setShowBadge(jSONObject.optInt("bdg", 1) == 1);
        notificationChannel.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
        b.verbose$default("Creating notification channel with channel:\n" + notificationChannel, null, 2, null);
        try {
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        Intrinsics.b(str);
        return str;
    }

    private final String createDefaultChannel(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel(DEFAULT_CHANNEL_ID, "Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return DEFAULT_CHANNEL_ID;
    }

    private final String createRestoreChannel(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel(RESTORE_CHANNEL_ID, "Restored", 2));
        return RESTORE_CHANNEL_ID;
    }

    private final int priorityToImportance(int i) {
        if (i > 9) {
            return 5;
        }
        if (i > 7) {
            return 4;
        }
        if (i > 5) {
            return 3;
        }
        if (i > 3) {
            return 2;
        }
        return i > 1 ? 1 : 0;
    }

    @Override // com.gamericefishpro.space.kf.a
    public String createNotificationChannel(d notificationJob) {
        Intrinsics.checkNotNullParameter(notificationJob, "notificationJob");
        Context appContext = this._applicationService.getAppContext();
        JSONObject jsonPayload = notificationJob.getJsonPayload();
        Intrinsics.b(jsonPayload);
        NotificationManager notificationManager = e.INSTANCE.getNotificationManager(appContext);
        if (notificationJob.isRestoring()) {
            return createRestoreChannel(notificationManager);
        }
        if (jsonPayload.has("oth_chnl")) {
            String strOptString = jsonPayload.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(strOptString) != null) {
                Intrinsics.b(strOptString);
                return strOptString;
            }
        }
        if (!jsonPayload.has("chnl")) {
            return createDefaultChannel(notificationManager);
        }
        try {
            return createChannel(appContext, notificationManager, jsonPayload);
        } catch (JSONException e) {
            b.error("Could not create notification channel due to JSON payload error!", e);
            return DEFAULT_CHANNEL_ID;
        }
    }

    @Override // com.gamericefishpro.space.kf.a
    public void processChannelList(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        NotificationManager notificationManager = e.INSTANCE.getNotificationManager(this._applicationService.getAppContext());
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                Context appContext = this._applicationService.getAppContext();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                hashSet.add(createChannel(appContext, notificationManager, jSONObject));
            } catch (JSONException e) {
                b.error("Could not create notification channel due to JSON payload error!", e);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        List<NotificationChannel> arrayList = new ArrayList<>();
        try {
            List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
            Intrinsics.checkNotNullExpressionValue(notificationChannels, "getNotificationChannels(...)");
            arrayList = notificationChannels;
        } catch (NullPointerException e2) {
            b.error$default("Error when trying to delete notification channel: " + e2.getMessage(), null, 2, null);
        }
        Iterator<NotificationChannel> it = arrayList.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            Intrinsics.b(id);
            if (kotlin.text.d.j(id, CHANNEL_PREFIX) && !hashSet.contains(id)) {
                notificationManager.deleteNotificationChannel(id);
            }
        }
    }
}
