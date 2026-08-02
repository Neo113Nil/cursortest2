package com.braze.support;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.jg$$ExternalSyntheticLambda1;
import bo.app.sb;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/app/Activity;", "", "requestPushPermissionPrompt", "(Landroid/app/Activity;)V", "wouldPushPermissionPromptDisplay", "(Landroid/app/Activity;)Z", "context", "", "getPermissionRequestCount", "(Landroid/content/Context;Ljava/lang/String;)I", "incrementPermissionRequestCount", "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PermissionUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("PermissionUtils");

    public static final int getPermissionRequestCount(Context context, String str) {
        context.getClass();
        str.getClass();
        return new com.braze.storage.i(context).a(str);
    }

    public static final boolean hasPermission(Context context, String str) {
        str.getClass();
        if (context != null) {
            try {
                if (context.checkCallingOrSelfPermission(str) == 0) {
                    return true;
                }
            } catch (Throwable th) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (Function0) new b$$ExternalSyntheticLambda1(str, 16), 8, (Object) null);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hasPermission$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failure checking permission ", str);
    }

    public static final void incrementPermissionRequestCount(Context context, String str) {
        context.getClass();
        str.getClass();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new sb(new com.braze.storage.i(context), str, null));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(str, 15), 12, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementPermissionRequestCount$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Incremented permission request counter for ", str, ".");
    }

    public static final void requestPushPermissionPrompt(Activity activity) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = TAG;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(10), 12, (Object) null);
        if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(11), 14, (Object) null);
            return;
        }
        if (!wouldPushPermissionPromptDisplay(activity) || Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(6), 14, (Object) null);
            return;
        }
        incrementPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(12), 12, (Object) null);
        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, IntentUtils.getRequestCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$0() {
        return "Attempting to execute requestPushPermissionPrompt()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$1() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$2() {
        return "Permission prompt would not display, not attempting to request push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$3() {
        return "Requesting push permission from system.";
    }

    public static final boolean wouldPushPermissionPromptDisplay(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(5), 14, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(7), 12, (Object) null);
            return false;
        }
        int i = activity.getApplicationInfo().targetSdkVersion;
        if (i < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(i, 15), 12, (Object) null);
            return false;
        }
        if (hasPermission(activity, "android.permission.POST_NOTIFICATIONS")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(8), 12, (Object) null);
            return false;
        }
        int permissionRequestCount = getPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
        if (permissionRequestCount >= 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(permissionRequestCount, 16), 12, (Object) null);
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(9), 12, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$0() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$1() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Build.VERSION.SDK_INT, "Device API version of ", " is too low to display push permission prompt.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$2(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "App Target API version of ", " is too low to display push permission prompt.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$3() {
        return "Notification permission already granted, doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$4(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Notification permission request count is ", ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$5() {
        return "Push Prompt can be shown on this device, within a reasonable confidence.";
    }
}
