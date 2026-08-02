package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.utils.CodecUtil;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoEncoderInfoImpl$$ExternalSyntheticLambda0 {
    public static VideoEncoderInfo find(String str) {
        str.getClass();
        try {
            return MoneybotTheme.from(new VideoEncoderInfoImpl(CodecUtil.findCodecAndGetCodecInfo(str), str), null);
        } catch (InvalidConfigException e) {
            StringUtilsKt.w("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
            return null;
        }
    }
}
