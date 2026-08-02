package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.room.TransactorKt;
import com.android.volley.Response;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda4;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class ProxyNotificationInitializer$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ProxyNotificationInitializer$$ExternalSyntheticLambda0(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        this.f$0 = context;
        this.f$1 = z;
        this.f$2 = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        boolean z = this.f$1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = TransactorKt.getPreference(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
            default:
                Response response = (Response) obj2;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                if (!z) {
                    bottomSheetBehavior.setState(3);
                    return;
                }
                UiStepBottomSheet$$ExternalSyntheticLambda4 uiStepBottomSheet$$ExternalSyntheticLambda4 = new UiStepBottomSheet$$ExternalSyntheticLambda4(bottomSheetBehavior, 1);
                Context context2 = ((ViewGroup) response.result).getContext();
                context2.getClass();
                AppCompatActivity activity = ContextUtilsKt.getActivity(context2);
                if (activity == null) {
                    return;
                }
                JobKt.launch$default(ViewModelKt.getCoroutineScope(activity.getLifecycle()), null, null, new Logger$_log$2(response, uiStepBottomSheet$$ExternalSyntheticLambda4, continuation, 28), 3);
                return;
        }
    }

    public /* synthetic */ ProxyNotificationInitializer$$ExternalSyntheticLambda0(boolean z, Response response, BottomSheetBehavior bottomSheetBehavior) {
        this.f$1 = z;
        this.f$0 = response;
        this.f$2 = bottomSheetBehavior;
    }
}
