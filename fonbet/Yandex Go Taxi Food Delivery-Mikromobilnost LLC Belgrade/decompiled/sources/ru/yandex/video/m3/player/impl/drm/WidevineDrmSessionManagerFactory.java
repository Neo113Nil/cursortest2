package ru.yandex.video.m3.player.impl.drm;

import androidx.media3.exoplayer.drm.c;
import defpackage.b87;
import defpackage.d6z;
import defpackage.pah;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManagerFactory;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManagerListener;
import ru.yandex.video.m3.player.impl.utils.LoadErrorHandlingPolicyImpl;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/impl/drm/WidevineDrmSessionManagerFactory;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerFactory;", "Lokhttp3/OkHttpClient;", "httpClient", "", "minLoadableRetryCount", "", "preferL3DRMSecurityLevel", "<init>", "(Lokhttp3/OkHttpClient;IZ)V", "enable", "Lzy11;", "enableDrmSessionForClearVideo", "(Z)V", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", DRMInfoProvider.MediaDRMKeys.SECURITY_LEVEL, "Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerListener;", "listener", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "create", "(Lru/yandex/video/m3/player/drm/DrmSecurityLevel;Lru/yandex/video/m3/player/drm/ExoDrmSessionManagerListener;)Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "Lokhttp3/OkHttpClient;", CA20Status.STATUS_USER_I, "Z", "experimentalEnableDrmSessionForClearVideo", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidevineDrmSessionManagerFactory implements ExoDrmSessionManagerFactory {
    private static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    private boolean experimentalEnableDrmSessionForClearVideo;
    private final OkHttpClient httpClient;
    private final int minLoadableRetryCount;
    private final boolean preferL3DRMSecurityLevel;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final UUID DRM_SCHEME = b87.d;

    public /* synthetic */ WidevineDrmSessionManagerFactory(OkHttpClient okHttpClient, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, (i2 & 2) != 0 ? 3 : i, (i2 & 4) != 0 ? false : z);
    }

    @Override // ru.yandex.video.m3.player.drm.ExoDrmSessionManagerFactory
    public ExoDrmSessionManager create(DrmSecurityLevel securityLevel, ExoDrmSessionManagerListener listener) {
        MediaDrmCallbackImpl mediaDrmCallbackImpl = new MediaDrmCallbackImpl(this.httpClient);
        ExoMediaDrmProvider exoMediaDrmProvider = new ExoMediaDrmProvider(securityLevel == DrmSecurityLevel.Low || this.preferL3DRMSecurityLevel);
        LoadErrorHandlingPolicyImpl loadErrorHandlingPolicyImpl = new LoadErrorHandlingPolicyImpl(0L, this.minLoadableRetryCount, 1, null);
        pah pahVar = new pah();
        pahVar.d = true;
        UUID uuid = DRM_SCHEME;
        uuid.getClass();
        pahVar.b = uuid;
        pahVar.c = exoMediaDrmProvider;
        pahVar.g = loadErrorHandlingPolicyImpl;
        pahVar.h = -9223372036854775807L;
        if (this.experimentalEnableDrmSessionForClearVideo) {
            int[] iArr = {2};
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                d6z.l(i2 == 2 || i2 == 1);
            }
            pahVar.e = (int[]) iArr.clone();
        }
        return new ExoDrmSessionManagerImpl(mediaDrmCallbackImpl, new c(pahVar.b, pahVar.c, mediaDrmCallbackImpl, pahVar.a, pahVar.d, pahVar.e, pahVar.f, pahVar.g, pahVar.h), listener);
    }

    public final void enableDrmSessionForClearVideo(boolean enable) {
        this.experimentalEnableDrmSessionForClearVideo = enable;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/drm/WidevineDrmSessionManagerFactory$Companion;", "", "()V", "DEFAULT_MIN_LOADABLE_RETRY_COUNT", "", "DRM_SCHEME", "Ljava/util/UUID;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public WidevineDrmSessionManagerFactory(OkHttpClient okHttpClient, int i, boolean z) {
        this.httpClient = okHttpClient;
        this.minLoadableRetryCount = i;
        this.preferL3DRMSecurityLevel = z;
    }
}
