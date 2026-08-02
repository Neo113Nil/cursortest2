package androidx.camera.video;

import android.net.Uri;
import androidx.camera.core.AutoValue_SurfaceRequest_Result;
import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda3;
import androidx.camera.core.processing.util.AutoValue_OutConfig;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.core.util.Consumer;
import com.squareup.scannerview.TextSetter;
import com.withpersona.sdk2.camera.FinalizeRecordingError;
import com.withpersona.sdk2.camera.RecordingHelper$RecordingState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlowImpl;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda17 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda17(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Recorder) obj2).mOutputUri = (Uri) obj;
                break;
            case 1:
                AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = (AutoValue_SurfaceRequest_TransformationInfo) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i2 = autoValue_SurfaceRequest_TransformationInfo.getRotationDegrees - ((AutoValue_OutConfig) entry.getKey()).getRotationDegrees;
                    if (((AutoValue_OutConfig) entry.getKey()).isMirroring) {
                        i2 = -i2;
                    }
                    int within360 = TransformUtils.within360(i2);
                    SurfaceEdge surfaceEdge = (SurfaceEdge) entry.getValue();
                    surfaceEdge.getClass();
                    Threads.runOnMain(new SurfaceEdge$$ExternalSyntheticLambda3(surfaceEdge, within360, -1));
                }
                break;
            case 2:
                VideoEncoderSession videoEncoderSession = (VideoEncoderSession) obj2;
                StringUtilsKt.d("VideoEncoderSession", "Surface can be closed: " + ((AutoValue_SurfaceRequest_Result) obj).surface);
                videoEncoderSession.mActiveSurface = null;
                ((CallbackToFutureAdapter$Completer) videoEncoderSession.mReadyToReleaseCompleter).set((EncoderImpl) videoEncoderSession.mVideoEncoder);
                videoEncoderSession.closeInternal();
                break;
            case 3:
                PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = (PreviewView$1$$ExternalSyntheticLambda2) obj2;
                StringUtilsKt.d("SurfaceViewImpl", "Safe to release surface.");
                if (previewView$1$$ExternalSyntheticLambda2 != null) {
                    previewView$1$$ExternalSyntheticLambda2.onSurfaceNotInUse();
                    break;
                }
                break;
            case 4:
                ((CallbackToFutureAdapter$Completer) obj2).set((AutoValue_SurfaceRequest_Result) obj);
                break;
            default:
                TextSetter textSetter = (TextSetter) obj2;
                VideoRecordEvent videoRecordEvent = (VideoRecordEvent) obj;
                videoRecordEvent.getClass();
                TextSetter textSetter2 = (TextSetter) textSetter.scannerText;
                StateFlowImpl stateFlowImpl = (StateFlowImpl) textSetter.textSwitcher;
                if (videoRecordEvent instanceof VideoRecordEvent.Start) {
                    RecordingHelper$RecordingState recordingHelper$RecordingState = RecordingHelper$RecordingState.Started;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, recordingHelper$RecordingState);
                    break;
                } else if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                    VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) videoRecordEvent;
                    int i3 = finalize.mError;
                    if (i3 != 0) {
                        if (textSetter2 != null) {
                            textSetter2.scannerText = new FinalizeRecordingError(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Recording completed with error code "), finalize.mCause);
                        }
                        if (textSetter2 != null) {
                            ((File) textSetter2.textSwitcher).delete();
                        }
                    }
                    if (textSetter2 != null) {
                        ((Recording) textSetter2.textView).close();
                    }
                    textSetter.scannerText = null;
                    RecordingHelper$RecordingState recordingHelper$RecordingState2 = RecordingHelper$RecordingState.Finalized;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, recordingHelper$RecordingState2);
                    break;
                }
                break;
        }
    }
}
