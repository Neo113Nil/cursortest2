package androidx.camera.video;

import android.graphics.Bitmap;
import androidx.camera.core.imagecapture.AutoValue_TakePictureRequest;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda13 implements Runnable {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda13(AutoValue_TakePictureRequest autoValue_TakePictureRequest, int i) {
        this.$r8$classId = 2;
    }

    private final void run$androidx$camera$core$imagecapture$TakePictureRequest$$ExternalSyntheticLambda1() {
    }

    private final void run$androidx$camera$core$imagecapture$TakePictureRequest$$ExternalSyntheticLambda2() {
    }

    private final void run$androidx$camera$core$processing$DefaultSurfaceProcessor$$ExternalSyntheticLambda11() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StringUtilsKt.d("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                DefaultInAppMessageViewWrapper.addDismissRunnable$lambda$0();
                break;
            default:
                int i = AlarmManagerSchedulerBroadcastReceiver.$r8$clinit;
                break;
        }
    }

    public /* synthetic */ Recorder$$ExternalSyntheticLambda13(int i) {
        this.$r8$classId = i;
    }

    public /* synthetic */ Recorder$$ExternalSyntheticLambda13(AutoValue_TakePictureRequest autoValue_TakePictureRequest, Bitmap bitmap) {
        this.$r8$classId = 1;
    }
}
