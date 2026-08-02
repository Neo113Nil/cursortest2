package ru.yandex.video.m3.player.drm;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/drm/DrmLoadException;", "Ljava/io/IOException;", "cause", "", Constants.KEY_MESSAGE, "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "ErrorDiagnostic", "ErrorProvisionRequestException", "Lru/yandex/video/m3/player/drm/DrmLoadException$ErrorDiagnostic;", "Lru/yandex/video/m3/player/drm/DrmLoadException$ErrorProvisionRequestException;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DrmLoadException extends IOException {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/drm/DrmLoadException$ErrorDiagnostic;", "Lru/yandex/video/m3/player/drm/DrmLoadException;", "isFatal", "", "error", "", "cause", "", "(ZLjava/lang/String;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/String;", "()Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorDiagnostic extends DrmLoadException {
        public static final int $stable = 0;
        private final String error;
        private final boolean isFatal;

        public ErrorDiagnostic(boolean z, String str, Throwable th) {
            super(th, "isFatal: " + z + ", error: " + str, null);
            this.isFatal = z;
            this.error = str;
        }

        public final String getError() {
            return this.error;
        }

        /* renamed from: isFatal, reason: from getter */
        public final boolean getIsFatal() {
            return this.isFatal;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/drm/DrmLoadException$ErrorProvisionRequestException;", "Lru/yandex/video/m3/player/drm/DrmLoadException;", "cause", "", "(Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorProvisionRequestException extends DrmLoadException {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public ErrorProvisionRequestException(Throwable th) {
            super(th, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ DrmLoadException(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? null : str, null);
    }

    public /* synthetic */ DrmLoadException(Throwable th, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, str);
    }

    private DrmLoadException(Throwable th, String str) {
        super(str == null ? th.toString() : str, th);
    }
}
