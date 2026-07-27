package com.zennvvarroo.pealkkk.data.services;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ZenvaroPeakC533PushRelay.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/zennvvarroo/pealkkk/data/services/ZenvaroPeakC533PushRelay;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "onMessageReceived", "", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZenvaroPeakC533PushRelay extends FirebaseMessagingService {
    public static final int $stable = 0;

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        Log.d("GoldenSproutFCM", "================ FIREBASE NEW TOKEN ================");
        Log.d("GoldenSproutFCM", "Firebase token length -> " + token.length());
        Log.d("GoldenSproutFCM", "Firebase token -> " + token);
        ZenvaroPeakC533LaunchRouter.INSTANCE.setFirebaseTokenLater(token);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        super.onMessageReceived(message);
        Log.d("GoldenSproutFCM", "================ FIREBASE MESSAGE RECEIVED ================");
        Log.d("GoldenSproutFCM", "From -> " + message.getFrom());
        Log.d("GoldenSproutFCM", "Data -> " + message.getData());
        RemoteMessage.Notification notification = message.getNotification();
        Log.d("GoldenSproutFCM", "Notification title -> " + (notification != null ? notification.getTitle() : null));
        RemoteMessage.Notification notification2 = message.getNotification();
        Log.d("GoldenSproutFCM", "Notification body -> " + (notification2 != null ? notification2.getBody() : null));
    }
}
