package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.DirectExecutor;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class LoudnessCodecController {
    public android.media.LoudnessCodecController loudnessCodecController;
    public final HashSet mediaCodecs;
    public final LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 updateListener;

    public LoudnessCodecController() {
        LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 = LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0.DEFAULT;
        this.mediaCodecs = new HashSet();
        this.updateListener = loudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0;
    }

    public final void addMediaCodec(MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            Trace.checkState(this.mediaCodecs.add(mediaCodec));
        }
    }

    public final void release() {
        this.mediaCodecs.clear();
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void removeMediaCodec(MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController;
        if (!this.mediaCodecs.remove(mediaCodec) || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void setAudioSessionId(int i) {
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.loudnessCodecController = null;
        }
        android.media.LoudnessCodecController create = android.media.LoudnessCodecController.create(i, DirectExecutor.INSTANCE, new LoudnessCodecController$OnLoudnessCodecUpdateListener() { // from class: androidx.media3.exoplayer.mediacodec.LoudnessCodecController.1
            public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
                LoudnessCodecController.this.updateListener.getClass();
                return bundle;
            }
        });
        this.loudnessCodecController = create;
        Iterator it = this.mediaCodecs.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
