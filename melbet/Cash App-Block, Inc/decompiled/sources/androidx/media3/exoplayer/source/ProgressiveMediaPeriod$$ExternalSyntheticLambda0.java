package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.MediaPeriod;

/* loaded from: classes3.dex */
public final /* synthetic */ class ProgressiveMediaPeriod$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProgressiveMediaPeriod f$0;

    public /* synthetic */ ProgressiveMediaPeriod$$ExternalSyntheticLambda0(ProgressiveMediaPeriod progressiveMediaPeriod, int i) {
        this.$r8$classId = i;
        this.f$0 = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ProgressiveMediaPeriod progressiveMediaPeriod = this.f$0;
        switch (i) {
            case 0:
                progressiveMediaPeriod.isLengthKnown = true;
                break;
            case 1:
                progressiveMediaPeriod.maybeFinishPrepare();
                break;
            default:
                if (!progressiveMediaPeriod.released) {
                    MediaPeriod.Callback callback = progressiveMediaPeriod.callback;
                    callback.getClass();
                    callback.onContinueLoadingRequested(progressiveMediaPeriod);
                    break;
                }
                break;
        }
    }
}
