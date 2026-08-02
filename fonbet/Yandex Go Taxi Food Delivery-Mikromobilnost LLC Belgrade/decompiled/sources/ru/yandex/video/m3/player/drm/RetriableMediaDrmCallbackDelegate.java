package ru.yandex.video.m3.player.drm;

import defpackage.sls;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.util.Zhdun;
import ru.yandex.video.m3.util.ZhdunImpl;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&¨\u0006("}, d2 = {"Lru/yandex/video/m3/player/drm/RetriableMediaDrmCallbackDelegate;", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "mediaDrmCallbackDelegate", "Lru/yandex/video/m3/util/Zhdun;", "zhdun", "<init>", "(Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;Lru/yandex/video/m3/util/Zhdun;)V", "Lkotlin/Function0;", "", "request", "", "retryAttemptsCount", "executeRequestWithRetries", "(Lsls;I)[B", Constants.INTENT_PARAM_RESPONSE_CODE, "", "canRetry", "(II)Z", "Lzy11;", "makeTimeout", "(I)V", "", "calculateTimeoutInMs", "(I)J", "Lru/yandex/video/m3/player/drm/HttpDataSourceDelegate;", "httpDataSourceDelegate", "", "defaultUrl", io.appmetrica.analytics.rtm.internal.Constants.KEY_DATA, "Ljava/util/UUID;", "uuid", "executeKeyRequest", "(Lru/yandex/video/m3/player/drm/HttpDataSourceDelegate;Ljava/lang/String;[BLjava/util/UUID;)[B", "executeProvisionRequest", "vsid", "setVideoSessionIdQueryParam", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "Lru/yandex/video/m3/util/Zhdun;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RetriableMediaDrmCallbackDelegate implements MediaDrmCallbackDelegate {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final long EXHAUSTED_TIMEOUT = 0;
    private static final long FIRST_RETRY_BASE_TIMEOUT = 1000;
    private static final int MAX_RECOVER_ATTEMPTS = 3;
    private static final int PHASING_END = 500;
    private static final int PHASING_START = -500;
    private static final int RECOVERABLE_RESPONSE_CODE = 429;
    private static final long SECOND_RETRY_BASE_TIMEOUT = 3000;
    private static final long THIRD_RETRY_BASE_TIMEOUT = 7000;
    private final MediaDrmCallbackDelegate mediaDrmCallbackDelegate;
    private final Zhdun zhdun;

    public /* synthetic */ RetriableMediaDrmCallbackDelegate(MediaDrmCallbackDelegate mediaDrmCallbackDelegate, Zhdun zhdun, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaDrmCallbackDelegate, (i & 2) != 0 ? new ZhdunImpl() : zhdun);
    }

    private final long calculateTimeoutInMs(int retryAttemptsCount) {
        long j;
        Random.a.getClass();
        int f = Random.b.f(PHASING_START, 500);
        if (retryAttemptsCount == 1) {
            j = 1000;
        } else if (retryAttemptsCount == 2) {
            j = 3000;
        } else {
            if (retryAttemptsCount != 3) {
                return 0L;
            }
            j = THIRD_RETRY_BASE_TIMEOUT;
        }
        return f + j;
    }

    private final boolean canRetry(int retryAttemptsCount, int responseCode) {
        return responseCode == 429 && retryAttemptsCount < 3;
    }

    private final byte[] executeRequestWithRetries(sls request, int retryAttemptsCount) {
        try {
            return (byte[]) request.invoke();
        } catch (PlaybackException.DrmThrowable.ErrorDrmProxyConnection e) {
            if (!canRetry(retryAttemptsCount, e.getResponseCode())) {
                throw e;
            }
            int i = retryAttemptsCount + 1;
            makeTimeout(i);
            return executeRequestWithRetries(request, i);
        }
    }

    private final void makeTimeout(int retryAttemptsCount) {
        this.zhdun.waitFor(calculateTimeoutInMs(retryAttemptsCount));
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate
    public byte[] executeKeyRequest(final HttpDataSourceDelegate httpDataSourceDelegate, final String defaultUrl, final byte[] data, final UUID uuid) {
        return executeRequestWithRetries(new sls() { // from class: ru.yandex.video.m3.player.drm.RetriableMediaDrmCallbackDelegate$executeKeyRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final byte[] invoke() {
                MediaDrmCallbackDelegate mediaDrmCallbackDelegate;
                mediaDrmCallbackDelegate = RetriableMediaDrmCallbackDelegate.this.mediaDrmCallbackDelegate;
                return mediaDrmCallbackDelegate.executeKeyRequest(httpDataSourceDelegate, defaultUrl, data, uuid);
            }
        }, 0);
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate
    public byte[] executeProvisionRequest(final HttpDataSourceDelegate httpDataSourceDelegate, final String defaultUrl, final byte[] data, final UUID uuid) {
        return executeRequestWithRetries(new sls() { // from class: ru.yandex.video.m3.player.drm.RetriableMediaDrmCallbackDelegate$executeProvisionRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final byte[] invoke() {
                MediaDrmCallbackDelegate mediaDrmCallbackDelegate;
                mediaDrmCallbackDelegate = RetriableMediaDrmCallbackDelegate.this.mediaDrmCallbackDelegate;
                return mediaDrmCallbackDelegate.executeProvisionRequest(httpDataSourceDelegate, defaultUrl, data, uuid);
            }
        }, 0);
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate
    public void setVideoSessionIdQueryParam(String vsid) {
        this.mediaDrmCallbackDelegate.setVideoSessionIdQueryParam(vsid);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/drm/RetriableMediaDrmCallbackDelegate$Companion;", "", "()V", "EXHAUSTED_TIMEOUT", "", "FIRST_RETRY_BASE_TIMEOUT", "MAX_RECOVER_ATTEMPTS", "", "PHASING_END", "PHASING_START", "RECOVERABLE_RESPONSE_CODE", "SECOND_RETRY_BASE_TIMEOUT", "THIRD_RETRY_BASE_TIMEOUT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RetriableMediaDrmCallbackDelegate(MediaDrmCallbackDelegate mediaDrmCallbackDelegate, Zhdun zhdun) {
        this.mediaDrmCallbackDelegate = mediaDrmCallbackDelegate;
        this.zhdun = zhdun;
    }
}
