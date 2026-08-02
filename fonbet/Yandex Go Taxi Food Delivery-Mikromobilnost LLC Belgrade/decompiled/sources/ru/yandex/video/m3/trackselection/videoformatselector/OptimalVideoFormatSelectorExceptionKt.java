package ru.yandex.video.m3.trackselection.videoformatselector;

import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorException;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toEventName", "", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorException;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OptimalVideoFormatSelectorExceptionKt {
    public static final String toEventName(OptimalVideoFormatSelectorException optimalVideoFormatSelectorException) {
        if (optimalVideoFormatSelectorException instanceof OptimalVideoFormatSelectorException.FormatWasNotFound) {
            return "OptimalVideoFormatSelectorFormatWasNotFound";
        }
        if (optimalVideoFormatSelectorException instanceof OptimalVideoFormatSelectorException.Unknown) {
            return "OptimalVideoFormatSelectorUnknown";
        }
        if (optimalVideoFormatSelectorException instanceof OptimalVideoFormatSelectorException.Stub) {
            return "OptimalVideoFormatSelectorStub";
        }
        w511.b();
        return null;
    }
}
