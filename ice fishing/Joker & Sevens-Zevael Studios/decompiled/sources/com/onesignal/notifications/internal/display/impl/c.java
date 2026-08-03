package com.onesignal.notifications.internal.display.impl;

import ac.o;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import ca.p;
import ca.q;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.internal.display.impl.b;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import na.e;
import org.json.JSONObject;
import pc.j;
import q8.f;
import x2.i;
import xc.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements pa.b {
    private final f _applicationService;
    private final pa.a _notificationDisplayBuilder;
    private final sa.b _notificationLimitManager;
    private final pa.c _summaryNotificationDisplayer;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showNotification(null, this);
        }
    }

    public c(f fVar, sa.b bVar, pa.c cVar, pa.a aVar) {
        j.e(fVar, "_applicationService");
        j.e(bVar, "_notificationLimitManager");
        j.e(cVar, "_summaryNotificationDisplayer");
        j.e(aVar, "_notificationDisplayBuilder");
        this._applicationService = fVar;
        this._notificationLimitManager = bVar;
        this._summaryNotificationDisplayer = cVar;
        this._notificationDisplayBuilder = aVar;
    }

    private final void addBackgroundImage(JSONObject jSONObject, i iVar) {
        Bitmap bitmap;
        JSONObject jSONObject2;
        String str;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            com.onesignal.debug.internal.logging.b.verbose$default("Cannot use background images in notifications for device on version: " + i10, null, 2, null);
            return;
        }
        String optString = jSONObject.optString("bg_img", null);
        if (optString != null) {
            JSONObject jSONObject3 = new JSONObject(optString);
            bitmap = getBitmap(jSONObject3.optString("img", null));
            jSONObject2 = jSONObject3;
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            Context currentContext = getCurrentContext();
            j.b(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), q.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(p.os_bgimage_notif_title, this._notificationDisplayBuilder.getTitle(jSONObject));
            remoteViews.setTextViewText(p.os_bgimage_notif_body, jSONObject.optString("alert"));
            setTextColor(remoteViews, jSONObject2, p.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject2, p.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                Resources contextResources = getContextResources();
                j.b(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    j.b(contextResources2);
                    str = contextResources2.getString(identifier);
                } else {
                    str = null;
                }
            } else {
                str = jSONObject2.getString("img_align");
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(p.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(p.os_bgimage_notif_bgimage_right_aligned, bitmap);
                remoteViews.setViewVisibility(p.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(p.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(p.os_bgimage_notif_bgimage, bitmap);
            }
            j.b(iVar);
            iVar.f8257v.contentView = remoteViews;
            iVar.g(null);
        }
    }

    private final void applyNotificationExtender(na.d dVar, i iVar) {
        if (dVar.hasExtender()) {
            try {
                Field declaredField = i.class.getDeclaredField("v");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(iVar);
                j.c(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                dVar.setOrgFlags(Integer.valueOf(notification.flags));
                dVar.setOrgSound(notification.sound);
                j.b(iVar);
                com.onesignal.notifications.internal.c notification2 = dVar.getNotification();
                j.b(notification2);
                notification2.getNotificationExtender();
                j.b(null);
                throw null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(i iVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, int i10) {
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = aVar.getNewBaseIntent(i10).putExtra("onesignalData", jSONObject.toString());
        j.d(putExtra, "intentGenerator.getNewBa…TA, gcmBundle.toString())");
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(nextInt, putExtra);
        j.b(iVar);
        iVar.f8242g = newActionPendingIntent;
        iVar.f8257v.deleteIntent = this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(i10));
        Notification a6 = iVar.a();
        j.d(a6, "notifBuilder.build()");
        return a6;
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

    private final Integer safeGetColorFromHex(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i10, String str, String str2) {
        Integer safeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (safeGetColorFromHex != null) {
            remoteViews.setTextColor(i10, safeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        j.b(contextResources);
        int identifier = contextResources.getIdentifier(str2, "color", getPackageName());
        if (identifier != 0) {
            remoteViews.setTextColor(i10, getCurrentContext().getColor(identifier));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0167, code lost:
    
        if (r4.createGrouplessSummaryNotification(r15, r18, r7, r8, r9) == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x016a, code lost:
    
        r4 = r0;
        r5 = r2;
        r2 = r3;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0192, code lost:
    
        if (r4.createSummaryNotification(r15, r0, r7, r9) == r10) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showNotification(na.d dVar, fc.d dVar2) {
        a aVar;
        int i10;
        ArrayList<StatusBarNotification> activeGrouplessNotifications;
        String str;
        b.a baseOneSignalNotificationBuilder;
        JSONObject jSONObject;
        com.onesignal.notifications.internal.display.impl.a aVar2;
        na.d dVar3;
        int i11;
        i iVar;
        c cVar;
        b.a aVar3;
        String str2;
        int i12;
        Notification createGenericPendingIntentsForNotif;
        if (dVar2 instanceof a) {
            aVar = (a) dVar2;
            int i13 = aVar.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.label = i13 - Integer.MIN_VALUE;
                a aVar4 = aVar;
                Object obj = aVar4.result;
                i10 = aVar4.label;
                gc.a aVar5 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    int androidId = dVar.getAndroidId();
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    j.b(jsonPayload);
                    String safeString = com.onesignal.common.f.safeString(jsonPayload, "grp");
                    com.onesignal.notifications.internal.display.impl.a aVar6 = new com.onesignal.notifications.internal.display.impl.a(getCurrentContext());
                    new ArrayList();
                    e eVar = e.INSTANCE;
                    activeGrouplessNotifications = eVar.getActiveGrouplessNotifications(getCurrentContext());
                    if (safeString != null || activeGrouplessNotifications.size() < 3) {
                        str = safeString;
                    } else {
                        eVar.assignGrouplessNotifications(getCurrentContext(), activeGrouplessNotifications);
                        str = e.GROUPLESS_SUMMARY_KEY;
                    }
                    baseOneSignalNotificationBuilder = this._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar);
                    i compatBuilder = baseOneSignalNotificationBuilder.getCompatBuilder();
                    this._notificationDisplayBuilder.addNotificationActionButtons(jsonPayload, aVar6, compatBuilder, androidId, null);
                    jSONObject = jsonPayload;
                    aVar2 = aVar6;
                    try {
                        addBackgroundImage(jSONObject, compatBuilder);
                    } catch (Throwable th) {
                        com.onesignal.debug.internal.logging.b.error("Could not set background notification image!", th);
                    }
                    applyNotificationExtender(dVar, compatBuilder);
                    if (dVar.isRestoring()) {
                        this._notificationDisplayBuilder.removeNotifyOptions(compatBuilder);
                    }
                    int i14 = str == null ? 1 : 2;
                    sa.b bVar = this._notificationLimitManager;
                    aVar4.L$0 = this;
                    aVar4.L$1 = dVar;
                    aVar4.L$2 = jSONObject;
                    aVar4.L$3 = str;
                    aVar4.L$4 = aVar2;
                    aVar4.L$5 = activeGrouplessNotifications;
                    aVar4.L$6 = baseOneSignalNotificationBuilder;
                    aVar4.L$7 = compatBuilder;
                    aVar4.I$0 = androidId;
                    aVar4.label = 1;
                    if (bVar.clearOldestOverLimit(i14, aVar4) != aVar5) {
                        dVar3 = dVar;
                        i11 = androidId;
                        iVar = compatBuilder;
                        cVar = this;
                    }
                    return aVar5;
                }
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i15 = aVar4.I$0;
                    createGenericPendingIntentsForNotif = (Notification) aVar4.L$2;
                    b.a aVar7 = (b.a) aVar4.L$1;
                    c cVar2 = (c) aVar4.L$0;
                    v6.a.W(obj);
                    aVar3 = aVar7;
                    i12 = i15;
                    cVar = cVar2;
                    cVar._notificationDisplayBuilder.addXiaomiSettings(aVar3, createGenericPendingIntentsForNotif);
                    Context currentContext = cVar.getCurrentContext();
                    j.b(currentContext);
                    new x2.q(currentContext).a(i12, createGenericPendingIntentsForNotif);
                    e eVar2 = e.INSTANCE;
                    Context currentContext2 = cVar.getCurrentContext();
                    j.b(currentContext2);
                    return Boolean.valueOf(eVar2.areNotificationsEnabled(currentContext2, createGenericPendingIntentsForNotif.getChannelId()));
                }
                int i16 = aVar4.I$0;
                i iVar2 = (i) aVar4.L$7;
                baseOneSignalNotificationBuilder = (b.a) aVar4.L$6;
                activeGrouplessNotifications = (ArrayList) aVar4.L$5;
                aVar2 = (com.onesignal.notifications.internal.display.impl.a) aVar4.L$4;
                str = (String) aVar4.L$3;
                jSONObject = (JSONObject) aVar4.L$2;
                dVar3 = (na.d) aVar4.L$1;
                c cVar3 = (c) aVar4.L$0;
                v6.a.W(obj);
                i11 = i16;
                iVar = iVar2;
                cVar = cVar3;
                aVar3 = baseOneSignalNotificationBuilder;
                com.onesignal.notifications.internal.display.impl.a aVar8 = aVar2;
                str2 = str;
                JSONObject jSONObject2 = jSONObject;
                if (str2 != null) {
                    int i17 = i11;
                    i12 = i17;
                    createGenericPendingIntentsForNotif = cVar.createGenericPendingIntentsForNotif(iVar, aVar8, jSONObject2, i17);
                    cVar._notificationDisplayBuilder.addXiaomiSettings(aVar3, createGenericPendingIntentsForNotif);
                    Context currentContext3 = cVar.getCurrentContext();
                    j.b(currentContext3);
                    new x2.q(currentContext3).a(i12, createGenericPendingIntentsForNotif);
                    e eVar22 = e.INSTANCE;
                    Context currentContext22 = cVar.getCurrentContext();
                    j.b(currentContext22);
                    return Boolean.valueOf(eVar22.areNotificationsEnabled(currentContext22, createGenericPendingIntentsForNotif.getChannelId()));
                }
                cVar._summaryNotificationDisplayer.createGenericPendingIntentsForGroup(iVar, aVar8, jSONObject2, str2, i11);
                int i18 = i11;
                Notification createSingleNotificationBeforeSummaryBuilder = cVar._summaryNotificationDisplayer.createSingleNotificationBeforeSummaryBuilder(dVar3, iVar);
                if (str2.equals(e.GROUPLESS_SUMMARY_KEY)) {
                    pa.c cVar4 = cVar._summaryNotificationDisplayer;
                    int size = 1 + activeGrouplessNotifications.size();
                    int groupAlertBehavior = cVar._notificationDisplayBuilder.getGroupAlertBehavior();
                    aVar4.L$0 = cVar;
                    aVar4.L$1 = aVar3;
                    aVar4.L$2 = createSingleNotificationBeforeSummaryBuilder;
                    aVar4.L$3 = null;
                    aVar4.L$4 = null;
                    aVar4.L$5 = null;
                    aVar4.L$6 = null;
                    aVar4.L$7 = null;
                    aVar4.I$0 = i18;
                    aVar4.label = 2;
                } else {
                    pa.c cVar5 = cVar._summaryNotificationDisplayer;
                    int groupAlertBehavior2 = cVar._notificationDisplayBuilder.getGroupAlertBehavior();
                    aVar4.L$0 = cVar;
                    aVar4.L$1 = aVar3;
                    aVar4.L$2 = createSingleNotificationBeforeSummaryBuilder;
                    aVar4.L$3 = null;
                    aVar4.L$4 = null;
                    aVar4.L$5 = null;
                    aVar4.L$6 = null;
                    aVar4.L$7 = null;
                    aVar4.I$0 = i18;
                    aVar4.label = 3;
                }
                aVar3 = aVar7;
                i12 = i15;
                cVar = cVar2;
                cVar._notificationDisplayBuilder.addXiaomiSettings(aVar3, createGenericPendingIntentsForNotif);
                Context currentContext32 = cVar.getCurrentContext();
                j.b(currentContext32);
                new x2.q(currentContext32).a(i12, createGenericPendingIntentsForNotif);
                e eVar222 = e.INSTANCE;
                Context currentContext222 = cVar.getCurrentContext();
                j.b(currentContext222);
                return Boolean.valueOf(eVar222.areNotificationsEnabled(currentContext222, createGenericPendingIntentsForNotif.getChannelId()));
            }
        }
        aVar = new a(dVar2);
        a aVar42 = aVar;
        Object obj2 = aVar42.result;
        i10 = aVar42.label;
        gc.a aVar52 = gc.a.f2559g;
        if (i10 != 0) {
        }
        aVar3 = baseOneSignalNotificationBuilder;
        com.onesignal.notifications.internal.display.impl.a aVar82 = aVar2;
        str2 = str;
        JSONObject jSONObject22 = jSONObject;
        if (str2 != null) {
        }
    }

    @Override // pa.b
    public Object displayNotification(na.d dVar, fc.d dVar2) {
        isRunningOnMainThreadCheck();
        return showNotification(dVar, dVar2);
    }

    public final o isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new l8.b("Process for showing a notification should never been done on Main Thread!");
        }
        return o.f277a;
    }
}
