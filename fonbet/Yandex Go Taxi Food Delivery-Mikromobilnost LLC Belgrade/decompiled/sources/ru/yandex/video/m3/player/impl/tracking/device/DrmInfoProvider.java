package ru.yandex.video.m3.player.impl.tracking.device;

import android.media.MediaDrm;
import android.util.Log;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/device/DrmInfoProvider;", "", "<init>", "()V", "Lyq11;", "mostSigBits", "leastSigBits", "Ljava/util/UUID;", "uuid-PWzV0Is", "(JJ)Ljava/util/UUID;", "uuid", "", "isWidevineDrmSupported", "()Z", "", "LOG_TAG", "Ljava/lang/String;", "DRM_SCHEME_SUPPORT_QUERY_ERROR_MESSAGE", "widevineUuid", "Ljava/util/UUID;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmInfoProvider {
    public static final int $stable;
    private static final String DRM_SCHEME_SUPPORT_QUERY_ERROR_MESSAGE = "Failed to query if Widevine crypto scheme is supported.";
    public static final DrmInfoProvider INSTANCE;
    private static final String LOG_TAG = "YP:DrmInfoProvider";
    private static final UUID widevineUuid;

    static {
        DrmInfoProvider drmInfoProvider = new DrmInfoProvider();
        INSTANCE = drmInfoProvider;
        widevineUuid = drmInfoProvider.m796uuidPWzV0Is(-1301668207276963122L, -6645017420763422227L);
        $stable = 8;
    }

    private DrmInfoProvider() {
    }

    /* renamed from: uuid-PWzV0Is, reason: not valid java name */
    private final UUID m796uuidPWzV0Is(long mostSigBits, long leastSigBits) {
        return new UUID(mostSigBits, leastSigBits);
    }

    public final boolean isWidevineDrmSupported() {
        Object failure;
        try {
            failure = Boolean.valueOf(MediaDrm.isCryptoSchemeSupported(widevineUuid));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            Log.e(LOG_TAG, DRM_SCHEME_SUPPORT_QUERY_ERROR_MESSAGE, a);
        }
        Boolean bool = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = bool;
        }
        return ((Boolean) failure).booleanValue();
    }
}
