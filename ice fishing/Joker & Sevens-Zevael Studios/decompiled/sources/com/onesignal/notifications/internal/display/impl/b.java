package com.onesignal.notifications.internal.display.impl;

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
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.receivers.NotificationDismissReceiver;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import na.e;
import org.json.JSONArray;
import org.json.JSONObject;
import pc.j;
import q8.f;
import x2.g;
import x2.i;
import xc.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements pa.a {
    private final f _applicationService;
    private final la.a _notificationChannelManager;
    private final Class<?> notificationDismissedClass;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
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

        public final void setHasLargeIcon(boolean z10) {
            this.hasLargeIcon = z10;
        }
    }

    public b(f fVar, la.a aVar) {
        j.e(fVar, "_applicationService");
        j.e(aVar, "_notificationChannelManager");
        this._applicationService = fVar;
        this._notificationChannelManager = aVar;
        this.notificationDismissedClass = NotificationDismissReceiver.class;
    }

    private final void addAlertButtons(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            addCustomAlertButtons(jSONObject, list, list2);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.error("Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (list.size() == 0 || list.size() < 3) {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(context, "onesignal_in_app_alert_ok_button_text", "Ok");
            j.b(resourceString);
            list.add(resourceString);
            list2.add(ka.a.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(na.c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject2.has(ka.a.PUSH_ADDITIONAL_DATA_KEY)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(ka.a.PUSH_ADDITIONAL_DATA_KEY);
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = optJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i10);
                    String optString = jSONObject4.optString("text");
                    j.d(optString, "button.optString(\"text\")");
                    list.add(optString);
                    String optString2 = jSONObject4.optString("id");
                    j.d(optString2, "button.optString(\"id\")");
                    list2.add(optString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i10) {
        if (i10 > 9) {
            return 2;
        }
        if (i10 > 7) {
            return 1;
        }
        if (i10 > 4) {
            return 0;
        }
        return i10 > 2 ? -1 : -2;
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
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = j.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String obj = str.subSequence(i10, length + 1).toString();
        return (h.x(obj, "http://") || h.x(obj, "https://")) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            j.b(currentContext);
            bitmap = BitmapFactory.decodeStream(currentContext.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    Context currentContext2 = getCurrentContext();
                    j.b(currentContext2);
                    bitmap = BitmapFactory.decodeStream(currentContext2.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
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
            com.onesignal.debug.internal.logging.b.warn("Could not download image!", th);
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
        j.b(contextResources);
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
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = j.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String obj = str.subSequence(i10, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(obj)) {
            return 0;
        }
        int drawableId = getDrawableId(obj);
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
        String optString = jSONObject.optString("sound", null);
        return ("null".equals(optString) || "nil".equals(optString)) ? false : true;
    }

    private final Bitmap resizeBitmapForLargeIconArea(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            Resources contextResources = getContextResources();
            j.b(contextResources);
            int dimension = (int) contextResources.getDimension(R.dimen.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            j.b(contextResources2);
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
        int convertOSToAndroidPriority = convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        iVar.f8245j = convertOSToAndroidPriority;
        if (convertOSToAndroidPriority < 0) {
            return;
        }
        int i10 = 4;
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                int intValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                Notification notification = iVar.f8257v;
                notification.ledARGB = intValue;
                notification.ledOnMS = 2000;
                notification.ledOffMS = 5000;
                notification.flags = (notification.flags & (-2)) | 1;
                i10 = 0;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] parseVibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject);
                if (parseVibrationPattern != null) {
                    iVar.f8257v.vibrate = parseVibrationPattern;
                }
            } else {
                i10 |= 2;
            }
        }
        if (isSoundEnabled(jSONObject)) {
            e eVar = e.INSTANCE;
            Context currentContext = getCurrentContext();
            j.b(currentContext);
            Uri soundUri = eVar.getSoundUri(currentContext, jSONObject.optString("sound", null));
            if (soundUri != null) {
                iVar.f(soundUri);
            } else {
                i10 |= 1;
            }
        }
        iVar.c(i10);
    }

    @Override // pa.a
    public void addNotificationActionButtons(JSONObject jSONObject, com.onesignal.notifications.internal.display.impl.a aVar, i iVar, int i10, String str) {
        int i11;
        j.e(jSONObject, "fcmJson");
        j.e(aVar, "intentGenerator");
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString(na.c.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject2.has(ka.a.PUSH_ADDITIONAL_DATA_KEY)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(ka.a.PUSH_ADDITIONAL_DATA_KEY);
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i12);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent newBaseIntent = aVar.getNewBaseIntent(i10);
                        newBaseIntent.setAction("" + i12);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject4.put("actionId", optJSONObject.optString("id"));
                        newBaseIntent.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            newBaseIntent.putExtra("grp", jSONObject.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(i10, newBaseIntent);
                        if (optJSONObject.has("icon")) {
                            try {
                                i11 = getResourceIcon(optJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                return;
                            }
                        } else {
                            i11 = 0;
                        }
                        j.b(iVar);
                        iVar.f8237b.add(new x2.c(i11, optJSONObject.optString("text"), newActionPendingIntent));
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // pa.a
    public void addXiaomiSettings(a aVar, Notification notification) {
        j.e(notification, "notification");
        j.b(aVar);
        if (aVar.getHasLargeIcon()) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // pa.a
    public a getBaseOneSignalNotificationBuilder(na.d dVar) {
        int i10;
        j.e(dVar, "notificationJob");
        JSONObject jsonPayload = dVar.getJsonPayload();
        j.b(jsonPayload);
        a aVar = new a();
        i iVar = new i(getCurrentContext(), this._notificationChannelManager.createNotificationChannel(dVar));
        String optString = jsonPayload.optString("alert", null);
        iVar.d(16, true);
        iVar.f8257v.icon = getSmallIconId(jsonPayload);
        g gVar = new g(0);
        gVar.f8235f = i.b(optString);
        iVar.g(gVar);
        iVar.f8241f = i.b(optString);
        iVar.f8257v.tickerText = i.b(optString);
        if (!j.a(jsonPayload.optString("title"), "")) {
            iVar.f8240e = i.b(getTitle(jsonPayload));
        }
        try {
            BigInteger accentColor = getAccentColor(jsonPayload);
            if (accentColor != null) {
                iVar.f8252q = accentColor.intValue();
            }
        } catch (Throwable unused) {
        }
        try {
            if (jsonPayload.has("vis")) {
                String optString2 = jsonPayload.optString("vis");
                j.d(optString2, "fcmJson.optString(\"vis\")");
                i10 = Integer.parseInt(optString2);
            } else {
                i10 = 1;
            }
            iVar.f8253r = i10;
        } catch (Throwable unused2) {
        }
        Bitmap largeIcon = getLargeIcon(jsonPayload);
        if (largeIcon != null) {
            aVar.setHasLargeIcon(true);
            iVar.e(largeIcon);
        }
        Bitmap bitmap = getBitmap(jsonPayload.optString("bicon", null));
        if (bitmap != null) {
            x2.f fVar = new x2.f();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f619b = bitmap;
            fVar.f8231e = iconCompat;
            fVar.f8261c = i.b(optString);
            fVar.f8262d = true;
            iVar.g(fVar);
        }
        if (dVar.getShownTimeStamp() != null) {
            try {
                Long shownTimeStamp = dVar.getShownTimeStamp();
                j.b(shownTimeStamp);
                iVar.f8257v.when = shownTimeStamp.longValue() * 1000;
            } catch (Throwable unused3) {
            }
        }
        setAlertnessOptions(jsonPayload, iVar);
        aVar.setCompatBuilder(iVar);
        return aVar;
    }

    @Override // pa.a
    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    @Override // pa.a
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

    @Override // pa.a
    public int getGroupAlertBehavior() {
        return 2;
    }

    @Override // pa.a
    public Intent getNewBaseDismissIntent(int i10) {
        Intent putExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra("androidNotificationId", i10).putExtra("dismissed", true);
        j.d(putExtra, "Intent(currentContext, n…tExtra(\"dismissed\", true)");
        return putExtra;
    }

    @Override // pa.a
    public PendingIntent getNewDismissActionPendingIntent(int i10, Intent intent) {
        j.e(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i10, intent, 201326592);
        j.d(broadcast, "getBroadcast(\n          …FLAG_IMMUTABLE,\n        )");
        return broadcast;
    }

    @Override // pa.a
    public CharSequence getTitle(JSONObject jSONObject) {
        j.e(jSONObject, "fcmJson");
        String optString = jSONObject.optString("title", null);
        if (optString != null) {
            return optString;
        }
        Context currentContext = getCurrentContext();
        j.b(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        j.b(currentContext2);
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        j.d(applicationLabel, "currentContext!!.package…cationInfo,\n            )");
        return applicationLabel;
    }

    @Override // pa.a
    public void removeNotifyOptions(i iVar) {
        j.b(iVar);
        iVar.d(8, true);
        iVar.c(0);
        iVar.f(null);
        Notification notification = iVar.f8257v;
        notification.vibrate = null;
        notification.tickerText = i.b(null);
    }
}
