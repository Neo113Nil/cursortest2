package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.room.Room;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.analytics.ParametersBuilder;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.util.cash.Countries;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private Rpc rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return UnleashContext.getInstance().getMessagingEvent();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0190  */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Intent intent) {
        String stringExtra;
        Rpc rpc;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            Queue<String> queue = recentlyReceivedMessageIds;
            if (queue.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.rpc == null) {
                    this.rpc = new Rpc(getApplicationContext());
                }
                rpc = this.rpc;
                CloudMessage cloudMessage = new CloudMessage(intent);
                if (rpc.zzg.zza() >= 233700000) {
                    Room.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("google.message_id", cloudMessage.getMessageId());
                Integer zza = cloudMessage.zza();
                if (zza != null) {
                    bundle.putInt("google.product_id", zza.intValue());
                }
                zzv.zzb(rpc.zzf).zzc(3, bundle);
                return;
            }
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(stringExtra2);
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                Countries.logNotificationReceived(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (ParametersBuilder.isNotification(extras)) {
                    ParametersBuilder parametersBuilder = new ParametersBuilder(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
                    try {
                        if (new n(this, parametersBuilder, newSingleThreadExecutor).handleNotification()) {
                            break;
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (Countries.shouldUploadScionMetrics(intent)) {
                                Countries.logToScion(intent.getExtras(), "_nf");
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                onMessageReceived(new RemoteMessage(extras));
                break;
            case "send_error":
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("message_id");
                }
                onSendError(stringExtra3, new SendException(intent.getStringExtra(BreadcrumbHelper.Category.ERROR)));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                break;
        }
        if (this.rpc == null) {
        }
        rpc = this.rpc;
        CloudMessage cloudMessage2 = new CloudMessage(intent);
        if (rpc.zzg.zza() >= 233700000) {
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    public void setRpcForTesting(Rpc rpc) {
        this.rpc = rpc;
    }
}
