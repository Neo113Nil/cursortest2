package com.gamericefishpro.space.qf;

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
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.mf.e;
import com.gamericefishpro.space.r3.i;
import com.gamericefishpro.space.ve.p;
import com.gamericefishpro.space.ve.q;
import com.onesignal.common.AndroidUtils;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.pf.b {
    private final f _applicationService;
    private final com.gamericefishpro.space.pf.a _notificationDisplayBuilder;
    private final com.gamericefishpro.space.vf.b _notificationLimitManager;
    private final com.gamericefishpro.space.pf.c _summaryNotificationDisplayer;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.c {
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

        public a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.showNotification(null, this);
        }
    }

    public c(f _applicationService, com.gamericefishpro.space.vf.b _notificationLimitManager, com.gamericefishpro.space.pf.c _summaryNotificationDisplayer, com.gamericefishpro.space.pf.a _notificationDisplayBuilder) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationLimitManager, "_notificationLimitManager");
        Intrinsics.checkNotNullParameter(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        Intrinsics.checkNotNullParameter(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._notificationLimitManager = _notificationLimitManager;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final void addBackgroundImage(JSONObject jSONObject, i iVar) throws JSONException {
        Bitmap bitmapFromAssetsOrResourceName;
        JSONObject jSONObject2;
        String string;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            com.gamericefishpro.space.od.b.verbose$default("Cannot use background images in notifications for device on version: " + i, null, 2, null);
            return;
        }
        String strOptString = jSONObject.optString("bg_img", null);
        if (strOptString != null) {
            JSONObject jSONObject3 = new JSONObject(strOptString);
            bitmapFromAssetsOrResourceName = getBitmap(jSONObject3.optString("img", null));
            jSONObject2 = jSONObject3;
        } else {
            bitmapFromAssetsOrResourceName = null;
            jSONObject2 = null;
        }
        if (bitmapFromAssetsOrResourceName == null) {
            bitmapFromAssetsOrResourceName = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmapFromAssetsOrResourceName != null) {
            Context currentContext = getCurrentContext();
            Intrinsics.b(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), q.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(p.os_bgimage_notif_title, this._notificationDisplayBuilder.getTitle(jSONObject));
            remoteViews.setTextViewText(p.os_bgimage_notif_body, jSONObject.optString("alert"));
            setTextColor(remoteViews, jSONObject2, p.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject2, p.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                Resources contextResources = getContextResources();
                Intrinsics.b(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    Intrinsics.b(contextResources2);
                    string = contextResources2.getString(identifier);
                } else {
                    string = null;
                }
            } else {
                string = jSONObject2.getString("img_align");
            }
            if ("right".equals(string)) {
                remoteViews.setViewPadding(p.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(p.os_bgimage_notif_bgimage_right_aligned, bitmapFromAssetsOrResourceName);
                remoteViews.setViewVisibility(p.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(p.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(p.os_bgimage_notif_bgimage, bitmapFromAssetsOrResourceName);
            }
            Intrinsics.b(iVar);
            iVar.v.contentView = remoteViews;
            iVar.g(null);
        }
    }

    private final void applyNotificationExtender(com.gamericefishpro.space.mf.d dVar, i iVar) {
        if (dVar.hasExtender()) {
            try {
                Field declaredField = i.class.getDeclaredField("v");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(iVar);
                Intrinsics.c(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                dVar.setOrgFlags(Integer.valueOf(notification.flags));
                dVar.setOrgSound(notification.sound);
                Intrinsics.b(iVar);
                com.gamericefishpro.space.ye.c notification2 = dVar.getNotification();
                Intrinsics.b(notification2);
                notification2.getNotificationExtender();
                Intrinsics.b(null);
                throw null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(i iVar, com.gamericefishpro.space.qf.a aVar, JSONObject jSONObject, int i) {
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = aVar.getNewBaseIntent(i).putExtra("onesignalData", jSONObject.toString());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(iNextInt, intentPutExtra);
        Intrinsics.b(iVar);
        iVar.g = newActionPendingIntent;
        iVar.v.deleteIntent = this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(i));
        Notification notificationA = iVar.a();
        Intrinsics.checkNotNullExpressionValue(notificationA, "build(...)");
        return notificationA;
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

    private final void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int i, String str, String str2) {
        Integer numSafeGetColorFromHex = safeGetColorFromHex(jSONObject, str);
        if (numSafeGetColorFromHex != null) {
            remoteViews.setTextColor(i, numSafeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        Intrinsics.b(contextResources);
        int identifier = contextResources.getIdentifier(str2, "color", getPackageName());
        if (identifier != 0) {
            remoteViews.setTextColor(i, getCurrentContext().getColor(identifier));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0167, code lost:
    
        if (r4.createGrouplessSummaryNotification(r15, r18, r7, r8, r9) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016a, code lost:
    
        r5 = r0;
        r4 = r10;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0190, code lost:
    
        if (r4.createSummaryNotification(r15, r10, r7, r9) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showNotification(com.gamericefishpro.space.mf.d dVar, com.gamericefishpro.space.th.a aVar) {
        a aVar2;
        ArrayList<StatusBarNotification> activeGrouplessNotifications;
        String str;
        b.a baseOneSignalNotificationBuilder;
        JSONObject jSONObject;
        com.gamericefishpro.space.qf.a aVar3;
        c cVar;
        com.gamericefishpro.space.mf.d dVar2;
        int i;
        i iVar;
        int i2;
        Notification notificationCreateGenericPendingIntentsForNotif;
        c cVar2;
        b.a aVar4;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i3 = aVar2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i3 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(aVar);
            }
        } else {
            aVar2 = new a(aVar);
        }
        a aVar5 = aVar2;
        Object obj = aVar5.result;
        com.gamericefishpro.space.uh.a aVar6 = com.gamericefishpro.space.uh.a.d;
        int i4 = aVar5.label;
        if (i4 != 0) {
            if (i4 == 1) {
                int i5 = aVar5.I$0;
                i iVar2 = (i) aVar5.L$7;
                baseOneSignalNotificationBuilder = (b.a) aVar5.L$6;
                activeGrouplessNotifications = (ArrayList) aVar5.L$5;
                aVar3 = (com.gamericefishpro.space.qf.a) aVar5.L$4;
                str = (String) aVar5.L$3;
                jSONObject = (JSONObject) aVar5.L$2;
                dVar2 = (com.gamericefishpro.space.mf.d) aVar5.L$1;
                c cVar3 = (c) aVar5.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
                i = i5;
                iVar = iVar2;
                cVar = cVar3;
            } else {
                if (i4 != 2 && i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = aVar5.I$0;
                notificationCreateGenericPendingIntentsForNotif = (Notification) aVar5.L$2;
                aVar4 = (b.a) aVar5.L$1;
                cVar2 = (c) aVar5.L$0;
                com.gamericefishpro.space.wa.b.P(obj);
            }
            baseOneSignalNotificationBuilder = aVar4;
            cVar = cVar2;
            cVar._notificationDisplayBuilder.addXiaomiSettings(baseOneSignalNotificationBuilder, notificationCreateGenericPendingIntentsForNotif);
            Context currentContext = cVar.getCurrentContext();
            Intrinsics.b(currentContext);
            new com.gamericefishpro.space.r3.p(currentContext).a(i2, notificationCreateGenericPendingIntentsForNotif);
            e eVar = e.INSTANCE;
            Context currentContext2 = cVar.getCurrentContext();
            Intrinsics.b(currentContext2);
            return Boolean.valueOf(eVar.areNotificationsEnabled(currentContext2, notificationCreateGenericPendingIntentsForNotif.getChannelId()));
        }
        com.gamericefishpro.space.wa.b.P(obj);
        int androidId = dVar.getAndroidId();
        JSONObject jsonPayload = dVar.getJsonPayload();
        Intrinsics.b(jsonPayload);
        String strSafeString = com.gamericefishpro.space.yb.d.safeString(jsonPayload, "grp");
        com.gamericefishpro.space.qf.a aVar7 = new com.gamericefishpro.space.qf.a(getCurrentContext());
        new ArrayList();
        e eVar2 = e.INSTANCE;
        activeGrouplessNotifications = eVar2.getActiveGrouplessNotifications(getCurrentContext());
        if (strSafeString != null || activeGrouplessNotifications.size() < 3) {
            str = strSafeString;
        } else {
            eVar2.assignGrouplessNotifications(getCurrentContext(), activeGrouplessNotifications);
            str = e.GROUPLESS_SUMMARY_KEY;
        }
        baseOneSignalNotificationBuilder = this._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar);
        i compatBuilder = baseOneSignalNotificationBuilder.getCompatBuilder();
        this._notificationDisplayBuilder.addNotificationActionButtons(jsonPayload, aVar7, compatBuilder, androidId, null);
        jSONObject = jsonPayload;
        aVar3 = aVar7;
        try {
            addBackgroundImage(jSONObject, compatBuilder);
        } catch (Throwable th) {
            com.gamericefishpro.space.od.b.error("Could not set background notification image!", th);
        }
        applyNotificationExtender(dVar, compatBuilder);
        if (dVar.isRestoring()) {
            this._notificationDisplayBuilder.removeNotifyOptions(compatBuilder);
        }
        int i6 = str == null ? 1 : 2;
        com.gamericefishpro.space.vf.b bVar = this._notificationLimitManager;
        aVar5.L$0 = this;
        aVar5.L$1 = dVar;
        aVar5.L$2 = jSONObject;
        aVar5.L$3 = str;
        aVar5.L$4 = aVar3;
        aVar5.L$5 = activeGrouplessNotifications;
        aVar5.L$6 = baseOneSignalNotificationBuilder;
        aVar5.L$7 = compatBuilder;
        aVar5.I$0 = androidId;
        aVar5.label = 1;
        if (bVar.clearOldestOverLimit(i6, aVar5) != aVar6) {
            cVar = this;
            dVar2 = dVar;
            i = androidId;
            iVar = compatBuilder;
        }
        return aVar6;
        com.gamericefishpro.space.qf.a aVar8 = aVar3;
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (str2 != null) {
            cVar._summaryNotificationDisplayer.createGenericPendingIntentsForGroup(iVar, aVar8, jSONObject2, str2, i);
            i2 = i;
            Notification notificationCreateSingleNotificationBeforeSummaryBuilder = cVar._summaryNotificationDisplayer.createSingleNotificationBeforeSummaryBuilder(dVar2, iVar);
            if (str2.equals(e.GROUPLESS_SUMMARY_KEY)) {
                com.gamericefishpro.space.pf.c cVar4 = cVar._summaryNotificationDisplayer;
                int size = activeGrouplessNotifications.size() + 1;
                int groupAlertBehavior = cVar._notificationDisplayBuilder.getGroupAlertBehavior();
                aVar5.L$0 = cVar;
                aVar5.L$1 = baseOneSignalNotificationBuilder;
                aVar5.L$2 = notificationCreateSingleNotificationBeforeSummaryBuilder;
                aVar5.L$3 = null;
                aVar5.L$4 = null;
                aVar5.L$5 = null;
                aVar5.L$6 = null;
                aVar5.L$7 = null;
                aVar5.I$0 = i2;
                aVar5.label = 2;
            } else {
                com.gamericefishpro.space.pf.c cVar5 = cVar._summaryNotificationDisplayer;
                int groupAlertBehavior2 = cVar._notificationDisplayBuilder.getGroupAlertBehavior();
                aVar5.L$0 = cVar;
                aVar5.L$1 = baseOneSignalNotificationBuilder;
                aVar5.L$2 = notificationCreateSingleNotificationBeforeSummaryBuilder;
                aVar5.L$3 = null;
                aVar5.L$4 = null;
                aVar5.L$5 = null;
                aVar5.L$6 = null;
                aVar5.L$7 = null;
                aVar5.I$0 = i2;
                aVar5.label = 3;
            }
            baseOneSignalNotificationBuilder = aVar4;
            cVar = cVar2;
        } else {
            i2 = i;
            notificationCreateGenericPendingIntentsForNotif = cVar.createGenericPendingIntentsForNotif(iVar, aVar8, jSONObject2, i2);
        }
        cVar._notificationDisplayBuilder.addXiaomiSettings(baseOneSignalNotificationBuilder, notificationCreateGenericPendingIntentsForNotif);
        Context currentContext3 = cVar.getCurrentContext();
        Intrinsics.b(currentContext3);
        new com.gamericefishpro.space.r3.p(currentContext3).a(i2, notificationCreateGenericPendingIntentsForNotif);
        e eVar3 = e.INSTANCE;
        Context currentContext4 = cVar.getCurrentContext();
        Intrinsics.b(currentContext4);
        return Boolean.valueOf(eVar3.areNotificationsEnabled(currentContext4, notificationCreateGenericPendingIntentsForNotif.getChannelId()));
    }

    @Override // com.gamericefishpro.space.pf.b
    public Object displayNotification(com.gamericefishpro.space.mf.d dVar, com.gamericefishpro.space.th.a aVar) {
        isRunningOnMainThreadCheck();
        return showNotification(dVar, aVar);
    }

    public final Unit isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new com.gamericefishpro.space.ec.b("Process for showing a notification should never been done on Main Thread!");
        }
        return Unit.a;
    }
}
