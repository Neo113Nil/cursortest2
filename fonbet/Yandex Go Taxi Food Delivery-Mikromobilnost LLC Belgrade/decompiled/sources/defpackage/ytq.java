package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.yandex.go.feedback_common.services.FeedbackQueueService;

/* loaded from: classes12.dex */
public final class ytq {
    public static void a(Context context, Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) FeedbackQueueService.class, 28528, intent);
    }
}
