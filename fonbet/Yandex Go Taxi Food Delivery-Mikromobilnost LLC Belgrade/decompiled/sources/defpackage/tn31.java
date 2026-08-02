package defpackage;

import android.animation.Animator;
import android.view.View;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.VideoRecordingFragment;

/* loaded from: classes4.dex */
public final /* synthetic */ class tn31 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoRecordingFragment b;

    public /* synthetic */ tn31(VideoRecordingFragment videoRecordingFragment, int i) {
        this.a = i;
        this.b = videoRecordingFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 initView$lambda$3$lambda$1;
        zy11 initView$lambda$3$lambda$2;
        zy11 videoCapturingState$lambda$12$lambda$11;
        int i = this.a;
        VideoRecordingFragment videoRecordingFragment = this.b;
        switch (i) {
            case 0:
                initView$lambda$3$lambda$1 = VideoRecordingFragment.initView$lambda$3$lambda$1(videoRecordingFragment, (View) obj);
                return initView$lambda$3$lambda$1;
            case 1:
                initView$lambda$3$lambda$2 = VideoRecordingFragment.initView$lambda$3$lambda$2(videoRecordingFragment, (View) obj);
                return initView$lambda$3$lambda$2;
            default:
                videoCapturingState$lambda$12$lambda$11 = VideoRecordingFragment.setVideoCapturingState$lambda$12$lambda$11(videoRecordingFragment, (Animator) obj);
                return videoCapturingState$lambda$12$lambda$11;
        }
    }
}
