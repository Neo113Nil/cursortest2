package com.gamericefishpro.space.qf;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.mf.e;
import com.gamericefishpro.space.r3.g;
import com.gamericefishpro.space.r3.i;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.receivers.NotificationDismissReceiver;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.pf.a {
    private final f _applicationService;
    private final com.gamericefishpro.space.kf.a _notificationChannelManager;
    private final Class<?> notificationDismissedClass;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        private i compatBuilder;
        private boolean hasLargeIcon;

        public final i getCompatBuilder() {
            return this.compatBuilder;
        }

        public final boolean getHasLargeIcon() {
            return this.hasLargeIcon;
        }

        public final void setCompatBuilder(i iVar) {
            this.compatBuilder = iVar;
        }

        public final void setHasLargeIcon(boolean z) {
            this.hasLargeIcon = z;
        }
    }

    public b(f _applicationService, com.gamericefishpro.space.kf.a _notificationChannelManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationChannelManager, "_notificationChannelManager");
        this._applicationService = _applicationService;
        this._notificationChannelManager = _notificationChannelManager;
        this.notificationDismissedClass = NotificationDismissReceiver.class;
    }

    private final void addAlertButtons(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            addCustomAlertButtons(jSONObject, list, list2);
        } catch (Throwable th) {
            com.gamericefishpro.space.od.b.error("Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (list.size() == 0 || list.size() < 3) {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(context, "onesignal_in_app_alert_ok_button_text", "Ok");
            Intrinsics.b(resourceString);
            list.add(resourceString);
            list2.add(com.gamericefishpro.space.jf.a.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(com.gamericefishpro.space.mf.c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject2.has(com.gamericefishpro.space.jf.a.PUSH_ADDITIONAL_DATA_KEY)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(com.gamericefishpro.space.jf.a.PUSH_ADDITIONAL_DATA_KEY);
            if (jSONObject3.has("actionButtons")) {
                JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject4 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject4.optString("text");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                    list.add(strOptString);
                    String strOptString2 = jSONObject4.optString("id");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                    list2.add(strOptString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i) {
        if (i > 9) {
            return 2;
        }
        if (i > 7) {
            return 1;
        }
        if (i > 4) {
            return 0;
        }
        return i > 2 ? -1 : -2;
    }

    private final BigInteger getAccentColor(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(this._applicationService.getAppContext(), "onesignal_notification_accent_color", null);
            if (resourceString != null) {
                return new BigInteger(resourceString, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(this._applicationService.getAppContext(), "com.onesignal.NotificationAccentColor.DEFAULT");
            if (manifestMeta != null) {
                return new BigInteger(manifestMeta, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.d(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        return (kotlin.text.d.j(string, "http://") || kotlin.text.d.j(string, "https://")) ? getBitmapFromURL(string) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmapDecodeStream;
        try {
            Context currentContext = getCurrentContext();
            Intrinsics.b(currentContext);
            bitmapDecodeStream = BitmapFactory.decodeStream(currentContext.getAssets().open(str));
        } catch (Throwable unused) {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    Context currentContext2 = getCurrentContext();
                    Intrinsics.b(currentContext2);
                    bitmapDecodeStream = BitmapFactory.decodeStream(currentContext2.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
            }
            int resourceIcon = getResourceIcon(str);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(getContextResources(), resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmapFromURL(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            com.gamericefishpro.space.od.b.warn("Could not download image!", th);
            return null;
        }
    }

    private final Resources getContextResources() {
        return this._applicationService.getAppContext().getResources();
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    private final int getDrawableId(String str) {
        Resources contextResources = getContextResources();
        Intrinsics.b(contextResources);
        return contextResources.getIdentifier(str, "drawable", getPackageName());
    }

    private final Bitmap getLargeIcon(JSONObject jSONObject) {
        Bitmap bitmap = getBitmap(jSONObject.optString("licon"));
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default");
        }
        if (bitmap == null) {
            return null;
        }
        return resizeBitmapForLargeIconArea(bitmap);
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    private final int getResourceIcon(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.d(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(string)) {
            return 0;
        }
        int drawableId = getDrawableId(string);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private final int getSmallIconId(JSONObject jSONObject) {
        int resourceIcon = getResourceIcon(jSONObject.optString("sicon", null));
        return resourceIcon != 0 ? resourceIcon : getDefaultSmallIconId();
    }

    private final boolean isSoundEnabled(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("sound", null);
        return ("null".equals(strOptString) || "nil".equals(strOptString)) ? false : true;
    }

    private final Bitmap resizeBitmapForLargeIconArea(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            Resources contextResources = getContextResources();
            Intrinsics.b(contextResources);
            int dimension = (int) contextResources.getDimension(R.dimen.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            Intrinsics.b(contextResources2);
            int dimension2 = (int) contextResources2.getDimension(R.dimen.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (dimension * (width / height));
            } else if (width > height) {
                dimension = (int) (dimension2 * (height / width));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private final void setAlertnessOptions(JSONObject jSONObject, i iVar) {
        int iConvertOSToAndroidPriority = convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        iVar.j = iConvertOSToAndroidPriority;
        if (iConvertOSToAndroidPriority < 0) {
            return;
        }
        int i = 4;
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                int iIntValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                Notification notification = iVar.v;
                notification.ledARGB = iIntValue;
                notification.ledOnMS = 2000;
                notification.ledOffMS = 5000;
                notification.flags = (notification.flags & (-2)) | 1;
                i = 0;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] vibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject);
                if (vibrationPattern != null) {
                    iVar.v.vibrate = vibrationPattern;
                }
            } else {
                i |= 2;
            }
        }
        if (isSoundEnabled(jSONObject)) {
            e eVar = e.INSTANCE;
            Context currentContext = getCurrentContext();
            Intrinsics.b(currentContext);
            Uri soundUri = eVar.getSoundUri(currentContext, jSONObject.optString("sound", null));
            if (soundUri != null) {
                iVar.f(soundUri);
            } else {
                i |= 1;
            }
        }
        iVar.c(i);
    }

    @Override // com.gamericefishpro.space.pf.a
    public void addNotificationActionButtons(JSONObject fcmJson, com.gamericefishpro.space.qf.a intentGenerator, i iVar, int i, String str) {
        int resourceIcon;
        Intrinsics.checkNotNullParameter(fcmJson, "fcmJson");
        Intrinsics.checkNotNullParameter(intentGenerator, "intentGenerator");
        try {
            JSONObject jSONObject = new JSONObject(fcmJson.optString(com.gamericefishpro.space.mf.c.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject.has(com.gamericefishpro.space.jf.a.PUSH_ADDITIONAL_DATA_KEY)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(com.gamericefishpro.space.jf.a.PUSH_ADDITIONAL_DATA_KEY);
                if (jSONObject2.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                        JSONObject jSONObject3 = new JSONObject(fcmJson.toString());
                        Intent newBaseIntent = intentGenerator.getNewBaseIntent(i);
                        newBaseIntent.setAction("" + i2);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject3.put("actionId", jSONObjectOptJSONObject.optString("id"));
                        newBaseIntent.putExtra("onesignalData", jSONObject3.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (fcmJson.has("grp")) {
                            newBaseIntent.putExtra("grp", fcmJson.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(i, newBaseIntent);
                        if (jSONObjectOptJSONObject.has("icon")) {
                            try {
                                resourceIcon = getResourceIcon(jSONObjectOptJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                return;
                            }
                        } else {
                            resourceIcon = 0;
                        }
                        Intrinsics.b(iVar);
                        iVar.b.add(new com.gamericefishpro.space.r3.c(resourceIcon, jSONObjectOptJSONObject.optString("text"), newActionPendingIntent));
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.gamericefishpro.space.pf.a
    public void addXiaomiSettings(a aVar, Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.b(aVar);
        if (aVar.getHasLargeIcon()) {
            try {
                Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = objNewInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(objNewInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, objNewInstance);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.gamericefishpro.space.pf.a
    public a getBaseOneSignalNotificationBuilder(com.gamericefishpro.space.mf.d notificationJob) {
        int i;
        Intrinsics.checkNotNullParameter(notificationJob, "notificationJob");
        JSONObject jsonPayload = notificationJob.getJsonPayload();
        Intrinsics.b(jsonPayload);
        a aVar = new a();
        i iVar = new i(getCurrentContext(), this._notificationChannelManager.createNotificationChannel(notificationJob));
        String strOptString = jsonPayload.optString("alert", null);
        iVar.d(16, true);
        iVar.v.icon = getSmallIconId(jsonPayload);
        g gVar = new g(0);
        gVar.f = i.b(strOptString);
        iVar.g(gVar);
        iVar.f = i.b(strOptString);
        iVar.v.tickerText = i.b(strOptString);
        if (!Intrinsics.a(jsonPayload.optString("title"), "")) {
            iVar.e = i.b(getTitle(jsonPayload));
        }
        try {
            BigInteger accentColor = getAccentColor(jsonPayload);
            if (accentColor != null) {
                iVar.q = accentColor.intValue();
            }
        } catch (Throwable unused) {
        }
        try {
            if (jsonPayload.has("vis")) {
                String strOptString2 = jsonPayload.optString("vis");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                i = Integer.parseInt(strOptString2);
            } else {
                i = 1;
            }
            iVar.r = i;
        } catch (Throwable unused2) {
        }
        Bitmap largeIcon = getLargeIcon(jsonPayload);
        if (largeIcon != null) {
            aVar.setHasLargeIcon(true);
            iVar.e(largeIcon);
        }
        Bitmap bitmap = getBitmap(jsonPayload.optString("bicon", null));
        if (bitmap != null) {
            com.gamericefishpro.space.r3.f fVar = new com.gamericefishpro.space.r3.f();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.b = bitmap;
            fVar.e = iconCompat;
            fVar.c = i.b(strOptString);
            fVar.d = true;
            iVar.g(fVar);
        }
        if (notificationJob.getShownTimeStamp() != null) {
            try {
                Long shownTimeStamp = notificationJob.getShownTimeStamp();
                Intrinsics.b(shownTimeStamp);
                iVar.v.when = shownTimeStamp.longValue() * 1000;
            } catch (Throwable unused3) {
            }
        }
        setAlertnessOptions(jsonPayload, iVar);
        aVar.setCompatBuilder(iVar);
        return aVar;
    }

    @Override // com.gamericefishpro.space.pf.a
    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    @Override // com.gamericefishpro.space.pf.a
    public int getDefaultSmallIconId() {
        int drawableId = getDrawableId("ic_stat_onesignal_default");
        if (drawableId != 0) {
            return drawableId;
        }
        int drawableId2 = getDrawableId("corona_statusbar_icon_default");
        if (drawableId2 != 0) {
            return drawableId2;
        }
        int drawableId3 = getDrawableId("ic_os_notification_fallback_white_24dp");
        return drawableId3 != 0 ? drawableId3 : R.drawable.ic_popup_reminder;
    }

    @Override // com.gamericefishpro.space.pf.a
    public int getGroupAlertBehavior() {
        return 2;
    }

    @Override // com.gamericefishpro.space.pf.a
    public Intent getNewBaseDismissIntent(int i) {
        Intent intentPutExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra("androidNotificationId", i).putExtra("dismissed", true);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // com.gamericefishpro.space.pf.a
    public PendingIntent getNewDismissActionPendingIntent(int i, Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    @Override // com.gamericefishpro.space.pf.a
    public CharSequence getTitle(JSONObject fcmJson) {
        Intrinsics.checkNotNullParameter(fcmJson, "fcmJson");
        String strOptString = fcmJson.optString("title", null);
        if (strOptString != null) {
            return strOptString;
        }
        Context currentContext = getCurrentContext();
        Intrinsics.b(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        Intrinsics.b(currentContext2);
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        Intrinsics.checkNotNullExpressionValue(applicationLabel, "getApplicationLabel(...)");
        return applicationLabel;
    }

    @Override // com.gamericefishpro.space.pf.a
    public void removeNotifyOptions(i iVar) {
        Intrinsics.b(iVar);
        iVar.d(8, true);
        iVar.c(0);
        iVar.f(null);
        Notification notification = iVar.v;
        notification.vibrate = null;
        notification.tickerText = i.b(null);
    }
}
