package com.squareup.cash.inappreview.real;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import androidx.room.Room;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzc;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.cdf.app.AppNavigateReview;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;

/* loaded from: classes4.dex */
public final /* synthetic */ class RealInAppReviewLauncher$$ExternalSyntheticLambda0 implements OnCompleteListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EglCore f$0;

    public /* synthetic */ RealInAppReviewLauncher$$ExternalSyntheticLambda0(EglCore eglCore, int i) {
        this.$r8$classId = i;
        this.f$0 = eglCore;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zzw zzwVar;
        int i = this.$r8$classId;
        EglCore eglCore = this.f$0;
        switch (i) {
            case 0:
                task.getClass();
                if (task.isSuccessful()) {
                    ReviewInfo reviewInfo = (ReviewInfo) task.getResult();
                    BinaryBitmap binaryBitmap = (BinaryBitmap) eglCore.eglDisplay;
                    Activity activity = (Activity) eglCore.eglContext;
                    if (((zza) reviewInfo).zzb) {
                        zzwVar = Room.forResult(null);
                    } else {
                        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
                        intent.putExtra("confirmation_intent", ((zza) reviewInfo).zza);
                        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        intent.putExtra("result_receiver", new zzc((Handler) binaryBitmap.matrix, taskCompletionSource));
                        activity.startActivity(intent);
                        zzwVar = taskCompletionSource.zza;
                    }
                    zzwVar.addOnCompleteListener(new RealInAppReviewLauncher$$ExternalSyntheticLambda0(eglCore, 1));
                    break;
                }
                break;
            default:
                task.getClass();
                if (task.isSuccessful()) {
                    ((Analytics) eglCore.eglConfig).track(new AppNavigateReview(), null);
                    break;
                }
                break;
        }
    }
}
