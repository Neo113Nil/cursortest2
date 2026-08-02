package com.braze.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\b\u0010\t\u001a\u00020\u0005H\u0014¨\u0006\n"}, d2 = {"Lcom/braze/push/NotificationTrampolineActivity;", "Landroid/app/Activity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationTrampolineActivity extends Activity {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$0() {
        return "NotificationTrampolineActivity created";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPause$lambda$0() {
        return "Notification trampoline activity paused and finishing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$0() {
        return "Notification trampoline activity received null intent. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$1() {
        return "Notification trampoline activity received intent with null action. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$2(Intent intent) {
        return "Notification trampoline activity received intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$4() {
        return "Failed to route intent to notification receiver";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onResume$lambda$5() {
        return "Notification trampoline activity finished processing. Delaying before finishing activity.";
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(PKIFailureInfo.certRevoked, PKIFailureInfo.certRevoked);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda8(5), 6, (Object) null);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda8(6), 6, (Object) null);
        finish();
    }

    @Override // android.app.Activity
    public void onResume() {
        Intent intent;
        super.onResume();
        try {
            intent = getIntent();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda8(3), 4, (Object) null);
        }
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda8(1), 7, (Object) null);
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda8(2), 7, (Object) null);
            finish();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda28(5, intent), 6, (Object) null);
        Intent intent2 = new Intent(action).setClass(this, BrazeNotificationUtils.getNotificationReceiverClass());
        intent2.getClass();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (Constants.isAmazonDevice()) {
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.INSTANCE, this, intent2, false, 4, null);
        } else {
            BrazePushReceiver.INSTANCE.handleReceivedIntent(this, intent2, false);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda8(4), 6, (Object) null);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200, null, new NotificationTrampolineActivity$onResume$7(this, null), 2, null);
    }
}
