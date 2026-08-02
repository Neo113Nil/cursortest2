package ru.yandex.video.m3.trackselection.videoformatselector;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\r\u000e\u000fB5\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", Constants.KEY_MESSAGE, "", "details", "", "", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/Map;)V", "getDetails", "()Ljava/util/Map;", "FormatWasNotFound", "Stub", "Unknown", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException$FormatWasNotFound;", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException$Stub;", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException$Unknown;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public abstract class OptimalVideoFormatSelectorException extends Exception {
    public static final int $stable = 8;
    private final Map<String, Object> details;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException$Stub;", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Stub extends OptimalVideoFormatSelectorException {
        public static final int $stable = 0;

        private Stub() {
            super(new Throwable(), null, null, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException$Unknown;", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;", "cause", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Unknown extends OptimalVideoFormatSelectorException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(Throwable th, @NotNull String str) {
            super(th, str, null, 4, null);
            str.getClass();
        }
    }

    public /* synthetic */ OptimalVideoFormatSelectorException(Throwable th, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map, null);
    }

    public final Map<String, Object> getDetails() {
        return this.details;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException$FormatWasNotFound;", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;", "cause", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class FormatWasNotFound extends OptimalVideoFormatSelectorException {
        public static final int $stable = 0;

        public FormatWasNotFound(Throwable th, String str) {
            super(th, str, null, 4, null);
        }

        public /* synthetic */ FormatWasNotFound(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : str);
        }
    }

    public /* synthetic */ OptimalVideoFormatSelectorException(Throwable th, String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, str, map);
    }

    private OptimalVideoFormatSelectorException(Throwable th, String str, Map<String, ? extends Object> map) {
        super(str, th);
        this.details = map;
    }
}
