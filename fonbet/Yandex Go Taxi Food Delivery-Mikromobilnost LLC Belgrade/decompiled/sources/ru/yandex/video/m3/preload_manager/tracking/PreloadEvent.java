package ru.yandex.video.m3.preload_manager.tracking;

import defpackage.w511;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/preload_manager/tracking/PreloadEvent;", "", "(Ljava/lang/String;I)V", "toEventName", "", "QUEUED", "STARTED", "CANCELED", TlsConstants.TLS_FINISHED, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum PreloadEvent {
    QUEUED,
    STARTED,
    CANCELED,
    FINISHED;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreloadEvent.values().length];
            try {
                iArr[PreloadEvent.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreloadEvent.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreloadEvent.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreloadEvent.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String toEventName() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "PreloadQueued";
        }
        if (i == 2) {
            return "PreloadStarted";
        }
        if (i == 3) {
            return "PreloadCanceled";
        }
        if (i == 4) {
            return "PreloadFinished";
        }
        w511.b();
        return null;
    }
}
