package com.yandex.metrica.push.firebase;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.common.utils.TrackersHub;
import defpackage.zun;

/* loaded from: classes3.dex */
public class MetricaMessagingService extends FirebaseMessagingService {
    public static boolean isNotificationRelatedToSDK(@NonNull zun zunVar) {
        return CoreUtils.isNotificationRelatedToSDK(CoreUtils.fromMapToBundle(zunVar.d()));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NonNull zun zunVar) {
        super.onMessageReceived(zunVar);
        processPush(this, zunVar);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NonNull String str) {
        processToken(this, str);
    }

    public void processPush(@NonNull Context context, @NonNull Bundle bundle) {
        try {
            PublicLogger.d("Receive\nfullData: %s", bundle);
            TrackersHub.getInstance().reportEvent("FirebaseMessagingService receive push");
            PushServiceFacade.processPush(context, bundle, CoreConstants.Transport.FIREBASE);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to process firebase push", th);
        }
    }

    public void processToken(@NonNull Context context, @NonNull String str) {
        try {
            TrackersHub.getInstance().reportEvent("FirebaseInstanceIdService refresh token");
            PushServiceFacade.refreshToken(context);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to refresh firebase token", th);
        }
    }

    public void processPush(@NonNull Context context, @NonNull zun zunVar) {
        try {
            processPush(context, CoreUtils.fromMapToBundle(zunVar.d()));
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Failed to process firebase push", th);
        }
    }
}
