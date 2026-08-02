package androidx.dynamicanimation.animation;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.view.Choreographer;
import androidx.camera.video.Recorder;
import androidx.collection.SimpleArrayMap;
import androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class AnimationHandler {
    public static final ThreadLocal sAnimatorHandler = new ThreadLocal();
    public DefaultAudioOffloadSupportProvider mDurationScaleChangeListener;
    public final Recorder.AnonymousClass1 mScheduler;
    public final SimpleArrayMap mDelayedCallbackStartTime = new SimpleArrayMap(0);
    public final ArrayList mAnimationCallbacks = new ArrayList();
    public final Recorder.AnonymousClass6 mCallbackDispatcher = new Recorder.AnonymousClass6(this, 22);
    public final AFd1lSDK$$ExternalSyntheticLambda0 mRunnable = new AFd1lSDK$$ExternalSyntheticLambda0(this, 3);
    public boolean mListDirty = false;
    public float mDurationScale = 1.0f;

    public AnimationHandler(Recorder.AnonymousClass1 anonymousClass1) {
        this.mScheduler = anonymousClass1;
    }

    public final void addAnimationFrameCallback(SpringAnimation springAnimation) {
        ArrayList arrayList = this.mAnimationCallbacks;
        if (arrayList.size() == 0) {
            ((Choreographer) this.mScheduler.val$videoEncoderSession).postFrameCallback(new HandlerDispatcherKt$$ExternalSyntheticLambda0(this.mRunnable, 1));
            if (Build.VERSION.SDK_INT >= 33) {
                this.mDurationScale = ValueAnimator.getDurationScale();
                if (this.mDurationScaleChangeListener == null) {
                    DefaultAudioOffloadSupportProvider defaultAudioOffloadSupportProvider = new DefaultAudioOffloadSupportProvider();
                    defaultAudioOffloadSupportProvider.isOffloadVariableRateSupported = this;
                    this.mDurationScaleChangeListener = defaultAudioOffloadSupportProvider;
                }
                final DefaultAudioOffloadSupportProvider defaultAudioOffloadSupportProvider2 = this.mDurationScaleChangeListener;
                if (((AnimationHandler$DurationScaleChangeListener33$$ExternalSyntheticLambda0) defaultAudioOffloadSupportProvider2.context) == null) {
                    ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: androidx.dynamicanimation.animation.AnimationHandler$DurationScaleChangeListener33$$ExternalSyntheticLambda0
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            ((AnimationHandler) DefaultAudioOffloadSupportProvider.this.isOffloadVariableRateSupported).mDurationScale = f;
                        }
                    };
                    defaultAudioOffloadSupportProvider2.context = durationScaleChangeListener;
                    ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
                }
            }
        }
        if (arrayList.contains(springAnimation)) {
            return;
        }
        arrayList.add(springAnimation);
    }

    public final boolean isCurrentThread() {
        Recorder.AnonymousClass1 anonymousClass1 = this.mScheduler;
        anonymousClass1.getClass();
        return Thread.currentThread() == ((Looper) anonymousClass1.this$0).getThread();
    }
}
