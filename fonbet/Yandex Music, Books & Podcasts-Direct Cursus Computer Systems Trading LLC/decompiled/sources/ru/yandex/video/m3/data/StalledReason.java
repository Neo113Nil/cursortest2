package ru.yandex.video.m3.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/data/StalledReason;", "", "(Ljava/lang/String;I)V", "INIT", "SEEK", "VIDEO_TRACK_CHANGE", "SET_SOURCE", "RECOVER", "LIVE_EDGE", "AD_START", "AD_END", "OTHER", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public enum StalledReason {
    INIT,
    SEEK,
    VIDEO_TRACK_CHANGE,
    SET_SOURCE,
    RECOVER,
    LIVE_EDGE,
    AD_START,
    AD_END,
    OTHER
}
