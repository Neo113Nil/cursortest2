package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.j1$$ExternalSyntheticLambda7;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BrazeFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "", "handleBrazeRemoteMessage", "(Landroid/content/Context;Lcom/google/firebase/messaging/RemoteMessage;)Z", "isBrazePushNotification", "(Lcom/google/firebase/messaging/RemoteMessage;)Z", "", "classpath", "", "invokeFallbackFirebaseService$android_sdk_ui_release", "(Ljava/lang/String;Lcom/google/firebase/messaging/RemoteMessage;Landroid/content/Context;)V", "invokeFallbackFirebaseService", "FCM_SERVICE_OMR_METHOD", "Ljava/lang/String;", "CONTEXT_ATTACH_METHOD", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$0(RemoteMessage remoteMessage) {
            return "Remote message did not originate from Braze. Not consuming remote message: " + remoteMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$1(String str) {
            return Recorder$$ExternalSyntheticOutline2.m("Fallback FCM service enabled. Attempting to use fallback class at ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$2() {
            return "Fallback FCM service enabled but classpath is null. Not routing to any fallback service.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$3() {
            return "FallbackFirebaseMessagingService is not enabled";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$4(Map map) {
            return "Got remote message from FCM: " + map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$5(String str, String str2) {
            return CameraSelector$$ExternalSyntheticOutline0.m("Adding bundle item from FCM remote data with key: ", str, " and value: ", str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$0(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Fallback firebase messaging service ", str, " could not be constructed. Not routing fallback RemoteMessage.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$1(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Attempting to call ", str, " attachBaseContext");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$2(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure invoking ", str, ".attachBaseContext. Not doing anything.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$3() {
            return "Could not find attachBaseContext. Not doing anything.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$4(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Fallback firebase messaging service method ", str, ".onMessageReceived could not be retrieved. Not routing fallback RemoteMessage.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$5(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Attempting to invoke firebase messaging fallback service ", str, ".onMessageReceived");
        }

        public final boolean handleBrazeRemoteMessage(Context context, RemoteMessage remoteMessage) {
            context.getClass();
            remoteMessage.getClass();
            int i = 2;
            int i2 = 1;
            if (isBrazePushNotification(remoteMessage)) {
                HashMap data = remoteMessage.getData();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda19(data, i), 6, (Object) null);
                Intent intent = new Intent("firebase_messaging_service_routing_action");
                Bundle bundle = new Bundle();
                for (Map.Entry entry : data.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(str, str2, 25), 6, (Object) null);
                    bundle.putString(str, str2);
                }
                intent.putExtras(bundle);
                BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, context, intent, false, 4, null);
                return true;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda19(remoteMessage, i2), 6, (Object) null);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            int i3 = 3;
            if (!configurationProvider.isFallbackFirebaseMessagingServiceEnabled()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(i3), 7, (Object) null);
                return false;
            }
            String fallbackFirebaseMessagingServiceClasspath = configurationProvider.getFallbackFirebaseMessagingServiceClasspath();
            if (fallbackFirebaseMessagingServiceClasspath == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(i), 7, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(fallbackFirebaseMessagingServiceClasspath, i3), 6, (Object) null);
            invokeFallbackFirebaseService$android_sdk_ui_release(fallbackFirebaseMessagingServiceClasspath, remoteMessage, context);
            return false;
        }

        public final void invokeFallbackFirebaseService$android_sdk_ui_release(String classpath, RemoteMessage remoteMessage, Context context) {
            classpath.getClass();
            remoteMessage.getClass();
            context.getClass();
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object constructObjectQuietly$default = ReflectionUtils.constructObjectQuietly$default(reflectionUtils, classpath, null, null, 6, null);
            int i = 4;
            if (constructObjectQuietly$default == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(classpath, i), 7, (Object) null);
                return;
            }
            Method declaredMethodQuietly = reflectionUtils.getDeclaredMethodQuietly(classpath, "attachBaseContext", Context.class);
            if (declaredMethodQuietly == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(i), 7, (Object) null);
                return;
            }
            int i2 = 1;
            declaredMethodQuietly.setAccessible(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(classpath, 5), 7, (Object) null);
            if (!((Boolean) ReflectionUtils.invokeMethodQuietly(constructObjectQuietly$default, declaredMethodQuietly, context).first).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(classpath, 6), 7, (Object) null);
                return;
            }
            Method methodQuietly = ReflectionUtils.getMethodQuietly(classpath, "onMessageReceived", (Class<?>[]) new Class[]{RemoteMessage.class});
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(classpath, i2), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(classpath, 2), 7, (Object) null);
                ((Boolean) ReflectionUtils.invokeMethodQuietly(constructObjectQuietly$default, methodQuietly, remoteMessage).first).getClass();
            }
        }

        public final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
            remoteMessage.getClass();
            return "true".equals(remoteMessage.getData().get("_ab"));
        }

        private Companion() {
        }
    }
}
