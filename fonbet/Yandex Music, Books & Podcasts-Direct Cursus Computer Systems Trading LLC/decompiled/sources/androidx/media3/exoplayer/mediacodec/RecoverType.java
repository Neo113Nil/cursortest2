package androidx.media3.exoplayer.mediacodec;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/media3/exoplayer/mediacodec/RecoverType;", "", "(Ljava/lang/String;I)V", "STOP_AND_RESTART", "RESET_AND_RESTART", "RESET_AND_RELEASE", "RESTART_IF_RECOVERABLE", "DEFAULT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public enum RecoverType {
    STOP_AND_RESTART,
    RESET_AND_RESTART,
    RESET_AND_RELEASE,
    RESTART_IF_RECOVERABLE,
    DEFAULT
}
