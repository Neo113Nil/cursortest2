package ru.yandex.video.m3.trackselection.videoformatselector.tracking;

import defpackage.w511;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEvent;", "", "(Ljava/lang/String;I)V", "toEventName", "", TlsConstants.TLS_FINISHED, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OptimalVideoFormatSelectorEvent {
    FINISHED;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptimalVideoFormatSelectorEvent.values().length];
            try {
                iArr[OptimalVideoFormatSelectorEvent.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String toEventName() {
        if (WhenMappings.$EnumSwitchMapping$0[ordinal()] == 1) {
            return "OptimalVideoFormatSelectionFinished";
        }
        w511.b();
        return null;
    }
}
