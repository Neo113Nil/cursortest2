package ru.yandex.video.m3.player.utils;

import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import defpackage.tls;
import defpackage.uza;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.player.utils.DRMInfo;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\b*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\b*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0010*\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0011H\u0083\b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0006J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/utils/DRMInfoProvider;", "", "<init>", "()V", "Lru/yandex/video/m3/player/utils/DRMInfo;", "getDRMInfoV18", "()Lru/yandex/video/m3/player/utils/DRMInfo;", "Landroid/media/MediaDrm;", "", "propertyName", "getPropertyStringOrUnknown", "(Landroid/media/MediaDrm;Ljava/lang/String;)Ljava/lang/String;", "getPropertyStringOrUnknownFromByteArray", "Lru/yandex/video/m3/player/utils/DRMInfo$Unsupported;", "getDRMInfoV0", "()Lru/yandex/video/m3/player/utils/DRMInfo$Unsupported;", "R", "Lkotlin/Function1;", "block", "use", "(Landroid/media/MediaDrm;Ltls;)Ljava/lang/Object;", "", "isDrmSchemeSupported", "()Z", "getDRMInfo", "createWideVineMediaDRM", "()Landroid/media/MediaDrm;", "MediaDRMKeys", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DRMInfoProvider {
    public static final int $stable = 0;
    public static final DRMInfoProvider INSTANCE = new DRMInfoProvider();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/player/utils/DRMInfoProvider$MediaDRMKeys;", "", "()V", "ALGORITHMS", "", "DEVICE_ID", "HDCP_LEVEL", "MAX_HDCP_LEVEL", "MAX_NUMBER_OF_SESSIONS", "NUMBER_OF_OPEN_SESSIONS", "OEM_CRYPTO_API_VERSION", "PLUGIN_DESCRIPTION", "PRIVACY_MODE", "PROVISION_UNIQUE_ID", "SECURITY_LEVEL", "SESSION_SHARING", "SYSTEM_ID", "USAGE_REPORTING_SUPPORT", "VENDOR", "VERSION", "WIDEVINE_UUID", "Ljava/util/UUID;", "getWIDEVINE_UUID", "()Ljava/util/UUID;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MediaDRMKeys {
        public static final String ALGORITHMS = "algorithms";
        public static final String DEVICE_ID = "deviceUniqueId";
        public static final String HDCP_LEVEL = "hdcpLevel";
        public static final String MAX_HDCP_LEVEL = "maxHdcpLevel";
        public static final String MAX_NUMBER_OF_SESSIONS = "maxNumberOfSessions";
        public static final String NUMBER_OF_OPEN_SESSIONS = "numberOfOpenSessions";
        public static final String OEM_CRYPTO_API_VERSION = "oemCryptoApiVersion";
        public static final String PLUGIN_DESCRIPTION = "description";
        public static final String PRIVACY_MODE = "privacyMode";
        public static final String PROVISION_UNIQUE_ID = "provisioningUniqueId";
        public static final String SECURITY_LEVEL = "securityLevel";
        public static final String SESSION_SHARING = "sessionSharing";
        public static final String SYSTEM_ID = "systemId";
        public static final String USAGE_REPORTING_SUPPORT = "usageReportingSupport";
        public static final String VENDOR = "vendor";
        public static final String VERSION = "version";
        public static final MediaDRMKeys INSTANCE = new MediaDRMKeys();
        private static final UUID WIDEVINE_UUID = UUID.fromString("EDEF8BA9-79D6-4ACE-A3C8-27DCD51D21ED");

        private MediaDRMKeys() {
        }

        public final UUID getWIDEVINE_UUID() {
            return WIDEVINE_UUID;
        }
    }

    private DRMInfoProvider() {
    }

    private final DRMInfo.Unsupported getDRMInfoV0() {
        return DRMInfo.Unsupported.INSTANCE;
    }

    private final DRMInfo getDRMInfoV18() {
        DRMInfo.Supported Supported;
        MediaDrm createWideVineMediaDRM = createWideVineMediaDRM();
        if (createWideVineMediaDRM != null) {
            try {
                DRMInfo.Companion companion = DRMInfo.INSTANCE;
                DRMInfoProvider dRMInfoProvider = INSTANCE;
                Supported = companion.Supported(dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.VENDOR), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, "version"), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.ALGORITHMS), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.SYSTEM_ID), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.SECURITY_LEVEL), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.HDCP_LEVEL), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.MAX_HDCP_LEVEL), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.USAGE_REPORTING_SUPPORT), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.MAX_NUMBER_OF_SESSIONS), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.NUMBER_OF_OPEN_SESSIONS), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.PLUGIN_DESCRIPTION), dRMInfoProvider.getPropertyStringOrUnknownFromByteArray(createWideVineMediaDRM, MediaDRMKeys.DEVICE_ID), dRMInfoProvider.getPropertyStringOrUnknownFromByteArray(createWideVineMediaDRM, MediaDRMKeys.PROVISION_UNIQUE_ID), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.PRIVACY_MODE), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.SESSION_SHARING), dRMInfoProvider.getPropertyStringOrUnknown(createWideVineMediaDRM, MediaDRMKeys.OEM_CRYPTO_API_VERSION), (r37 & 65536) != 0 ? new tls() { // from class: ru.yandex.video.m3.player.utils.DRMInfo$Companion$Supported$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DRMInfo.Supported.Builder) obj);
                        return zy11.a;
                    }

                    public final void invoke(DRMInfo.Supported.Builder builder) {
                    }
                } : null);
                if (Supported != null) {
                    return Supported;
                }
            } finally {
                try {
                    createWideVineMediaDRM.close();
                } catch (Throwable unused) {
                }
            }
        }
        return isDrmSchemeSupported() ? DRMInfo.SchemeSupported.INSTANCE : DRMInfo.Unsupported.INSTANCE;
    }

    private final String getPropertyStringOrUnknown(MediaDrm mediaDrm, String str) {
        try {
            return mediaDrm.getPropertyString(str);
        } catch (Exception unused) {
            return "unknown";
        }
    }

    private final String getPropertyStringOrUnknownFromByteArray(MediaDrm mediaDrm, String str) {
        try {
            return new String(mediaDrm.getPropertyByteArray(str), uza.a);
        } catch (Exception unused) {
            return "unknown";
        }
    }

    private final boolean isDrmSchemeSupported() {
        return MediaDrm.isCryptoSchemeSupported(MediaDRMKeys.INSTANCE.getWIDEVINE_UUID());
    }

    private final <R> R use(MediaDrm mediaDrm, tls tlsVar) {
        try {
            return (R) tlsVar.invoke(mediaDrm);
        } finally {
            try {
                mediaDrm.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final MediaDrm createWideVineMediaDRM() {
        Object failure;
        Object failure2;
        try {
            failure = new MediaDrm(MediaDRMKeys.INSTANCE.getWIDEVINE_UUID());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            DRMInfoProvider dRMInfoProvider = INSTANCE;
            if (a instanceof UnsupportedSchemeException) {
                dRMInfoProvider = null;
            }
            if (dRMInfoProvider != null) {
                try {
                    failure2 = new MediaDrm(MediaDRMKeys.INSTANCE.getWIDEVINE_UUID());
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                failure = (MediaDrm) (failure2 instanceof Result.Failure ? null : failure2);
            } else {
                failure = null;
            }
        }
        return (MediaDrm) failure;
    }

    public final DRMInfo getDRMInfo() {
        return getDRMInfoV18();
    }
}
