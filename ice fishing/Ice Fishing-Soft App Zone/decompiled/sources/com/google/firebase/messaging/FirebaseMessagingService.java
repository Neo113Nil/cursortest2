package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.datatransport.WinterFlowCompilerScheduler;
import com.google.android.datatransport.WinterFlowEncryptionSubsystem;
import com.google.android.datatransport.WinterFlowHookProcessor;
import com.google.android.datatransport.WinterFlowJSONDecorator;
import com.google.android.datatransport.WinterFlowObjectPackage;
import com.google.android.datatransport.WinterFlowProtocolPlatform;
import com.google.android.datatransport.WinterFlowProviderUserManager;
import com.google.android.datatransport.WinterFlowSchedulerMicroservice;
import com.google.android.datatransport.WinterFlowStackProvider;
import com.google.android.datatransport.WinterFlowWidgetUtility;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final ArrayDeque WinterFlowServerProtocol = new ArrayDeque(10);
    public WinterFlowProviderUserManager WinterFlowTransactionAgent;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowCacheManagerAgent(Intent intent) {
        FirebaseMessagingService firebaseMessagingService;
        WinterFlowProviderUserManager winterFlowProviderUserManager;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                intent.getStringExtra("token");
                return;
            }
            if ("com.google.firebase.messaging.FCM_REGISTERED".equals(action)) {
                intent.getStringExtra("token");
                return;
            } else if ("com.google.firebase.messaging.FCM_UNREGISTERED".equals(action)) {
                intent.getStringExtra("token");
                return;
            } else {
                intent.getAction();
                return;
            }
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayDeque arrayDeque = WinterFlowServerProtocol;
            if (!arrayDeque.contains(stringExtra)) {
                if (arrayDeque.size() >= 10) {
                    arrayDeque.remove();
                }
                arrayDeque.add(stringExtra);
            }
            firebaseMessagingService = this;
            winterFlowProviderUserManager = firebaseMessagingService.WinterFlowTransactionAgent;
            if (winterFlowProviderUserManager == null) {
                winterFlowProviderUserManager = new WinterFlowProviderUserManager(firebaseMessagingService.getApplicationContext());
                firebaseMessagingService.WinterFlowTransactionAgent = winterFlowProviderUserManager;
            }
            if (winterFlowProviderUserManager.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread() >= 233700000) {
                WinterFlowHookProcessor.WinterFlowSyntax(new IOException("SERVICE_NOT_AVAILABLE"));
                return;
            }
            Bundle bundle = new Bundle();
            String stringExtra2 = intent.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            WinterFlowProtocolPlatform WinterFlowTransactionAgent = WinterFlowProtocolPlatform.WinterFlowTransactionAgent(winterFlowProviderUserManager.WinterFlowHookDataSource);
            synchronized (WinterFlowTransactionAgent) {
                i = WinterFlowTransactionAgent.WinterFlowRouterStructure;
                WinterFlowTransactionAgent.WinterFlowRouterStructure = i + 1;
            }
            WinterFlowTransactionAgent.WinterFlowServerProtocol(new WinterFlowWidgetUtility(i, 3, bundle, 0));
            return;
        }
        String stringExtra3 = intent.getStringExtra("message_type");
        if (stringExtra3 == null) {
            stringExtra3 = "gcm";
        }
        switch (stringExtra3) {
            case "gcm":
                WinterFlowEncryptionSubsystem.WinterFlowSoftwareEngine(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (WinterFlowJSONDecorator.WinterFlowThreadListener(extras)) {
                    WinterFlowJSONDecorator winterFlowJSONDecorator = new WinterFlowJSONDecorator(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new WinterFlowCompilerScheduler("Firebase-Messaging-Network-Io"));
                    firebaseMessagingService = this;
                    try {
                        if (!new WinterFlowObjectPackage(firebaseMessagingService, winterFlowJSONDecorator, newSingleThreadExecutor, 9, false).WinterFlowServiceUtility()) {
                            newSingleThreadExecutor.shutdown();
                            if (WinterFlowEncryptionSubsystem.WinterFlowCacheTool(intent)) {
                                WinterFlowEncryptionSubsystem.WinterFlowSyntaxSubsystem(intent.getExtras(), "_nf");
                            }
                        }
                        winterFlowProviderUserManager = firebaseMessagingService.WinterFlowTransactionAgent;
                        if (winterFlowProviderUserManager == null) {
                        }
                        if (winterFlowProviderUserManager.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread() >= 233700000) {
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                firebaseMessagingService = this;
                winterFlowProviderUserManager = firebaseMessagingService.WinterFlowTransactionAgent;
                if (winterFlowProviderUserManager == null) {
                }
                if (winterFlowProviderUserManager.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread() >= 233700000) {
                }
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new WinterFlowSchedulerMicroservice(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                }
                firebaseMessagingService = this;
                winterFlowProviderUserManager = firebaseMessagingService.WinterFlowTransactionAgent;
                if (winterFlowProviderUserManager == null) {
                }
                if (winterFlowProviderUserManager.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread() >= 233700000) {
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                firebaseMessagingService = this;
                winterFlowProviderUserManager = firebaseMessagingService.WinterFlowTransactionAgent;
                if (winterFlowProviderUserManager == null) {
                }
                if (winterFlowProviderUserManager.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread() >= 233700000) {
                }
                break;
            default:
                firebaseMessagingService = this;
                winterFlowProviderUserManager = firebaseMessagingService.WinterFlowTransactionAgent;
                if (winterFlowProviderUserManager == null) {
                }
                if (winterFlowProviderUserManager.WinterFlowCacheManagerAgent.WinterFlowConcurrencyThread() >= 233700000) {
                }
                break;
        }
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public final Intent WinterFlowHookDataSource(Intent intent) {
        return (Intent) ((ArrayDeque) WinterFlowStackProvider.WinterFlowServerProtocol().WinterFlowRouterRouter).poll();
    }
}
