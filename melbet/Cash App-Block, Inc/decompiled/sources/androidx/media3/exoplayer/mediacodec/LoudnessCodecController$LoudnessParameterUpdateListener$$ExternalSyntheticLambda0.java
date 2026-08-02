package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 implements MediaCodecUtil.ScoreProvider {
    public static final LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 DEFAULT = new LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0();
    public static final LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0 DEFAULT$1 = new LoudnessCodecController$LoudnessParameterUpdateListener$$ExternalSyntheticLambda0();

    public List getDecoderInfos(String str, boolean z, boolean z2) {
        return MediaCodecUtil.getDecoderInfos(str, z, z2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public int getScore(Object obj) {
        String str = ((MediaCodecInfo) obj).name;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }
}
