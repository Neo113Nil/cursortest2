package com.onesignal.notifications.internal.display.impl;

import D.C0285o;
import D.r;
import D.s;
import D.u;
import Q7.q;
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
import com.anythink.basead.exoplayer.k.o;
import com.anythink.expressad.foundation.h.k;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.receivers.NotificationDismissReceiver;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C4876a;
import r5.InterfaceC4909a;
import t5.e;
import v5.InterfaceC5105a;
import x4.f;

/* loaded from: classes2.dex */
public final class b implements InterfaceC5105a {
    private final f _applicationService;
    private final InterfaceC4909a _notificationChannelManager;
    private final Class<?> notificationDismissedClass;

    public static final class a {
        private u compatBuilder;
        private boolean hasLargeIcon;

        public final u getCompatBuilder() {
            return this.compatBuilder;
        }

        public final boolean getHasLargeIcon() {
            return this.hasLargeIcon;
        }

        public final void setCompatBuilder(u uVar) {
            this.compatBuilder = uVar;
        }

        public final void setHasLargeIcon(boolean z6) {
            this.hasLargeIcon = z6;
        }
    }

    public b(f _applicationService, InterfaceC4909a _notificationChannelManager) {
        h.e(_applicationService, "_applicationService");
        h.e(_notificationChannelManager, "_notificationChannelManager");
        this._applicationService = _applicationService;
        this._notificationChannelManager = _notificationChannelManager;
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
            h.b(resourceString);
            list.add(resourceString);
            list2.add(C4876a.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
        if (jSONObject2.has("a")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i);
                    String optString = jSONObject4.optString(o.f9232c);
                    h.d(optString, "optString(...)");
                    list.add(optString);
                    String optString2 = jSONObject4.optString("id");
                    h.d(optString2, "optString(...)");
                    list2.add(optString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i) {
        return t5.f.INSTANCE.toAndroidPriority(i);
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
        boolean z6 = false;
        while (i <= length) {
            boolean z9 = h.f(str.charAt(!z6 ? i : length), 32) <= 0;
            if (z6) {
                if (!z9) {
                    break;
                }
                length--;
            } else if (z9) {
                i++;
            } else {
                z6 = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
        return (q.h0(obj, "http://") || q.h0(obj, "https://")) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            h.b(currentContext);
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
                    h.b(currentContext2);
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
        h.b(contextResources);
        return contextResources.getIdentifier(str, k.f20419c, getPackageName());
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
        boolean z6 = false;
        while (i <= length) {
            boolean z9 = h.f(str.charAt(!z6 ? i : length), 32) <= 0;
            if (z6) {
                if (!z9) {
                    break;
                }
                length--;
            } else if (z9) {
                i++;
            } else {
                z6 = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
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
            h.b(contextResources);
            int dimension = (int) contextResources.getDimension(R.dimen.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            h.b(contextResources2);
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

    private final void setAlertnessOptions(JSONObject jSONObject, u uVar) {
        int convertOSToAndroidPriority = convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        uVar.f397j = convertOSToAndroidPriority;
        if (convertOSToAndroidPriority < 0) {
            return;
        }
        int i = 4;
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                int intValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                Notification notification = uVar.f409v;
                notification.ledARGB = intValue;
                notification.ledOnMS = 2000;
                notification.ledOffMS = 5000;
                notification.flags = (notification.flags & (-2)) | 1;
                i = 0;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] parseVibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject);
                if (parseVibrationPattern != null) {
                    uVar.f409v.vibrate = parseVibrationPattern;
                }
            } else {
                i |= 2;
            }
        }
        if (isSoundEnabled(jSONObject)) {
            e eVar = e.INSTANCE;
            Context currentContext = getCurrentContext();
            h.b(currentContext);
            Uri soundUri = eVar.getSoundUri(currentContext, jSONObject.optString("sound", null));
            if (soundUri != null) {
                uVar.f(soundUri);
            } else {
                i |= 1;
            }
        }
        uVar.c(i);
    }

    @Override // v5.InterfaceC5105a
    public void addNotificationActionButtons(JSONObject fcmJson, com.onesignal.notifications.internal.display.impl.a intentGenerator, u uVar, int i, String str) {
        int i4;
        h.e(fcmJson, "fcmJson");
        h.e(intentGenerator, "intentGenerator");
        try {
            JSONObject jSONObject = new JSONObject(fcmJson.optString("custom"));
            if (jSONObject.has("a")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("a");
                if (jSONObject2.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i6 = 0; i6 < length; i6++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                        JSONObject jSONObject3 = new JSONObject(fcmJson.toString());
                        Intent newBaseIntent = intentGenerator.getNewBaseIntent(i);
                        newBaseIntent.setAction("" + i6);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject3.put("actionId", optJSONObject.optString("id"));
                        newBaseIntent.putExtra("onesignalData", jSONObject3.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (fcmJson.has("grp")) {
                            newBaseIntent.putExtra("grp", fcmJson.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(i, newBaseIntent);
                        if (optJSONObject.has("icon")) {
                            try {
                                i4 = getResourceIcon(optJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                return;
                            }
                        } else {
                            i4 = 0;
                        }
                        h.b(uVar);
                        uVar.f390b.add(new C0285o(i4, newActionPendingIntent, optJSONObject.optString(o.f9232c)));
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // v5.InterfaceC5105a
    public void addXiaomiSettings(a aVar, Notification notification) {
        h.e(notification, "notification");
        h.b(aVar);
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

    @Override // v5.InterfaceC5105a
    public a getBaseOneSignalNotificationBuilder(t5.d notificationJob) {
        int i;
        h.e(notificationJob, "notificationJob");
        JSONObject jsonPayload = notificationJob.getJsonPayload();
        h.b(jsonPayload);
        a aVar = new a();
        u uVar = new u(getCurrentContext(), this._notificationChannelManager.createNotificationChannel(notificationJob));
        String optString = jsonPayload.optString("alert", null);
        uVar.d(16, true);
        uVar.f409v.icon = getSmallIconId(jsonPayload);
        s sVar = new s(0);
        sVar.f388f = u.b(optString);
        uVar.g(sVar);
        uVar.f394f = u.b(optString);
        uVar.f409v.tickerText = u.b(optString);
        if (!h.a(jsonPayload.optString("title"), "")) {
            uVar.f393e = u.b(getTitle(jsonPayload));
        }
        try {
            BigInteger accentColor = getAccentColor(jsonPayload);
            if (accentColor != null) {
                uVar.f404q = accentColor.intValue();
            }
        } catch (Throwable unused) {
        }
        try {
            if (jsonPayload.has("vis")) {
                String optString2 = jsonPayload.optString("vis");
                h.d(optString2, "optString(...)");
                i = Integer.parseInt(optString2);
            } else {
                i = 1;
            }
            uVar.f405r = i;
        } catch (Throwable unused2) {
        }
        Bitmap largeIcon = getLargeIcon(jsonPayload);
        if (largeIcon != null) {
            aVar.setHasLargeIcon(true);
            uVar.e(largeIcon);
        }
        Bitmap bitmap = getBitmap(jsonPayload.optString("bicon", null));
        if (bitmap != null) {
            r rVar = new r();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f4658b = bitmap;
            rVar.f384e = iconCompat;
            rVar.f413c = u.b(optString);
            rVar.f414d = true;
            uVar.g(rVar);
        }
        if (notificationJob.getShownTimeStamp() != null) {
            try {
                Long shownTimeStamp = notificationJob.getShownTimeStamp();
                h.b(shownTimeStamp);
                uVar.f409v.when = shownTimeStamp.longValue() * 1000;
            } catch (Throwable unused3) {
            }
        }
        setAlertnessOptions(jsonPayload, uVar);
        aVar.setCompatBuilder(uVar);
        return aVar;
    }

    @Override // v5.InterfaceC5105a
    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    @Override // v5.InterfaceC5105a
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

    @Override // v5.InterfaceC5105a
    public int getGroupAlertBehavior() {
        return 2;
    }

    @Override // v5.InterfaceC5105a
    public Intent getNewBaseDismissIntent(int i) {
        Intent putExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra("androidNotificationId", i).putExtra("dismissed", true);
        h.d(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // v5.InterfaceC5105a
    public PendingIntent getNewDismissActionPendingIntent(int i, Intent intent) {
        h.e(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i, intent, 201326592);
        h.d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    @Override // v5.InterfaceC5105a
    public CharSequence getTitle(JSONObject fcmJson) {
        h.e(fcmJson, "fcmJson");
        String optString = fcmJson.optString("title", null);
        if (optString != null) {
            return optString;
        }
        Context currentContext = getCurrentContext();
        h.b(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        h.b(currentContext2);
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        h.d(applicationLabel, "getApplicationLabel(...)");
        return applicationLabel;
    }

    @Override // v5.InterfaceC5105a
    public void removeNotifyOptions(u uVar) {
        h.b(uVar);
        uVar.d(8, true);
        uVar.c(0);
        uVar.f(null);
        Notification notification = uVar.f409v;
        notification.vibrate = null;
        notification.tickerText = u.b(null);
    }
}
