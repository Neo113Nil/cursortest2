package androidx.camera.video;

import android.os.Looper;
import android.os.Process;
import android.view.View;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.imagecapture.ProcessingRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.video.Recorder;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.fillr.e0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.MonthAdapter;
import com.google.android.material.datepicker.MonthsPagerAdapter;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledFuture;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda14 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda14(MonthsPagerAdapter monthsPagerAdapter, MaterialCalendarGridView materialCalendarGridView, int i) {
        this.$r8$classId = 11;
        this.f$0 = materialCalendarGridView;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        EncoderImpl encoderImpl;
        int findNextValidDayPosition;
        int i = this.$r8$classId;
        int i2 = this.f$1;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Recorder recorder = (Recorder) obj;
                int i3 = recorder.mSourceState;
                recorder.mSourceState = i2;
                if (i3 == i2) {
                    StringUtilsKt.d("Recorder", "Video source transitions to the same state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$4(i2)));
                    break;
                } else {
                    StringUtilsKt.d("Recorder", "Video source has transitioned to state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$4(i2)));
                    if (i2 != 3) {
                        if (i2 == 2 && (scheduledFuture = recorder.mSourceNonStreamingTimeout) != null && scheduledFuture.cancel(false) && (encoderImpl = recorder.mVideoEncoder) != null) {
                            Recorder.notifyEncoderSourceStopped(encoderImpl);
                            break;
                        }
                    } else if (recorder.mActiveSurface != null) {
                        recorder.mNeedsResetBeforeNextStart = true;
                        AutoValue_Recorder_RecordingRecord autoValue_Recorder_RecordingRecord = recorder.mInProgressRecording;
                        if (autoValue_Recorder_RecordingRecord != null) {
                            recorder.onInProgressRecordingInternalError(autoValue_Recorder_RecordingRecord, 4, null);
                            break;
                        }
                    } else {
                        Recorder.SetupVideoTask setupVideoTask = recorder.mSetupVideoTask;
                        if (setupVideoTask != null) {
                            if (!setupVideoTask.mIsFailedRetryCanceled) {
                                setupVideoTask.mIsFailedRetryCanceled = true;
                                ScheduledFuture scheduledFuture2 = (ScheduledFuture) setupVideoTask.mRetryFuture;
                                if (scheduledFuture2 != null) {
                                    scheduledFuture2.cancel(false);
                                    setupVideoTask.mRetryFuture = null;
                                }
                            }
                            recorder.mSetupVideoTask = null;
                        }
                        recorder.requestReset(false);
                        break;
                    }
                }
                break;
            case 1:
                ((CameraCaptureCallback) obj).onCaptureCancelled(i2);
                break;
            case 2:
                Process.setThreadPriority(i2);
                ((Runnable) obj).run();
                break;
            case 3:
                ProcessingRequest processingRequest = (ProcessingRequest) ((e0) ((MetadataImageReader.AnonymousClass1) obj).this$0).a;
                if (processingRequest != null) {
                    processingRequest.onCaptureProcessProgressed(i2);
                    break;
                }
                break;
            case 4:
                BufferedAudioStream bufferedAudioStream = (BufferedAudioStream) obj;
                int i4 = bufferedAudioStream.mBufferSize;
                if (i4 != i2) {
                    int i5 = bufferedAudioStream.mBytesPerFrame;
                    bufferedAudioStream.mBufferSize = (i2 / i5) * i5;
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i4, "Update buffer size from ", " to ");
                    m2m.append(bufferedAudioStream.mBufferSize);
                    StringUtilsKt.d("BufferedAudioStream", m2m.toString());
                    break;
                }
                break;
            case 5:
                EncoderImpl.MediaCodecCallback mediaCodecCallback = (EncoderImpl.MediaCodecCallback) obj;
                boolean z = mediaCodecCallback.mStopped;
                EncoderImpl encoderImpl2 = EncoderImpl.this;
                if (!z) {
                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(encoderImpl2.mState)) {
                        case 0:
                        case 7:
                        case 8:
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            encoderImpl2.mFreeInputBufferIndexQueue.offer(Integer.valueOf(i2));
                            encoderImpl2.matchAcquisitionsAndFreeBufferIndexes();
                            break;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(encoderImpl2.mState)));
                            break;
                    }
                } else {
                    StringUtilsKt.w(encoderImpl2.mTag, "Receives input frame after codec is reset.");
                    break;
                }
            case 6:
                ((ResourcesCompat.FontCallback) obj).onFontRetrievalFailed(i2);
                break;
            case 7:
                ExoPlayerImplInternal exoPlayerImplInternal = (ExoPlayerImplInternal) obj;
                DefaultAnalyticsCollector defaultAnalyticsCollector = exoPlayerImplInternal.analyticsCollector;
                int i6 = ((BaseRenderer) exoPlayerImplInternal.renderers[i2].primaryRenderer).trackType;
                defaultAnalyticsCollector.sendEvent(defaultAnalyticsCollector.generateReadingMediaPeriodEventTime(), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_BGR_THUMBNAIL, new DefaultAnalyticsCollector$$ExternalSyntheticLambda3(5));
                break;
            case 8:
                ExoPlayerImpl.ComponentListener componentListener = (ExoPlayerImpl.ComponentListener) ((CallResult) obj).serviceNames;
                String str = Util.DEVICE_DEBUG_INFO;
                AdapterHelper adapterHelper = ExoPlayerImpl.this.audioSessionIdState;
                ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6 exoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6 = new ExoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6(i2);
                adapterHelper.getClass();
                Trace.checkState(Looper.myLooper() == ((SystemHandlerWrapper) adapterHelper.mPendingUpdates).handler.getLooper());
                adapterHelper.mExistingUpdateTypes++;
                adapterHelper.runInBackground(new DispatchQueue$$ExternalSyntheticLambda0(12, adapterHelper, exoPlayerImpl$ComponentListener$$ExternalSyntheticLambda6));
                adapterHelper.updateStateInForeground(Integer.valueOf(i2));
                break;
            case 9:
                ((ContentCardAdapter) obj).notifyItemChanged(i2);
                break;
            case 10:
                int[] iArr = MaterialButton.CHECKABLE_STATE_SET;
                ((MaterialButton) obj).setIconSize(i2);
                break;
            case 11:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) obj;
                if (materialCalendarGridView.hasFocus() && i2 != 0) {
                    MonthAdapter adapter = materialCalendarGridView.getAdapter();
                    if (i2 == 1) {
                        findNextValidDayPosition = adapter.findPreviousValidDayPosition(adapter.lastPositionInMonth() + 1);
                        if (findNextValidDayPosition == -1) {
                            findNextValidDayPosition = adapter.lastPositionInMonth();
                        }
                    } else {
                        findNextValidDayPosition = adapter.findNextValidDayPosition(adapter.firstPositionInMonth() - 1);
                        if (findNextValidDayPosition == -1) {
                            findNextValidDayPosition = adapter.firstPositionInMonth();
                        }
                    }
                    materialCalendarGridView.setSelection(findNextValidDayPosition);
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.viewRef;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.startSettling$1(view, i2, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ Recorder$$ExternalSyntheticLambda14(ExoPlayerImplInternal exoPlayerImplInternal, int i, boolean z) {
        this.$r8$classId = 7;
        this.f$0 = exoPlayerImplInternal;
        this.f$1 = i;
    }

    public /* synthetic */ Recorder$$ExternalSyntheticLambda14(int i, Runnable runnable) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$0 = runnable;
    }

    public /* synthetic */ Recorder$$ExternalSyntheticLambda14(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }
}
