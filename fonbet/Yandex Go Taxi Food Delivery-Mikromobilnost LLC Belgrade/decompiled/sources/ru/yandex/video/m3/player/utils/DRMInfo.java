package ru.yandex.video.m3.player.utils;

import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/utils/DRMInfo;", "", "()V", "Companion", "SchemeSupported", "Supported", "Unsupported", "Lru/yandex/video/m3/player/utils/DRMInfo$SchemeSupported;", "Lru/yandex/video/m3/player/utils/DRMInfo$Supported;", "Lru/yandex/video/m3/player/utils/DRMInfo$Unsupported;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DRMInfo {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String UNKNOWN = "unknown";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/utils/DRMInfo$SchemeSupported;", "Lru/yandex/video/m3/player/utils/DRMInfo;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SchemeSupported extends DRMInfo {
        public static final int $stable = 0;
        public static final SchemeSupported INSTANCE = new SchemeSupported();

        private SchemeSupported() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/utils/DRMInfo$Unsupported;", "Lru/yandex/video/m3/player/utils/DRMInfo;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unsupported extends DRMInfo {
        public static final int $stable = 0;
        public static final Unsupported INSTANCE = new Unsupported();

        private Unsupported() {
            super(null);
        }
    }

    public /* synthetic */ DRMInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J£\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/utils/DRMInfo$Companion;", "", "<init>", "()V", "", DRMInfoProvider.MediaDRMKeys.VENDOR, "version", DRMInfoProvider.MediaDRMKeys.ALGORITHMS, DRMInfoProvider.MediaDRMKeys.SYSTEM_ID, DRMInfoProvider.MediaDRMKeys.SECURITY_LEVEL, "HDCPLevel", "maxHDCPLevel", DRMInfoProvider.MediaDRMKeys.USAGE_REPORTING_SUPPORT, "maxNumberOfOpenSessions", DRMInfoProvider.MediaDRMKeys.NUMBER_OF_OPEN_SESSIONS, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "deviceId", DRMInfoProvider.MediaDRMKeys.PROVISION_UNIQUE_ID, DRMInfoProvider.MediaDRMKeys.PRIVACY_MODE, DRMInfoProvider.MediaDRMKeys.SESSION_SHARING, DRMInfoProvider.MediaDRMKeys.OEM_CRYPTO_API_VERSION, "Lkotlin/Function1;", "Lru/yandex/video/m3/player/utils/DRMInfo$Supported$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/utils/DRMInfo$Supported;", "Supported", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltls;)Lru/yandex/video/m3/player/utils/DRMInfo$Supported;", "UNKNOWN", "Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Supported Supported(String vendor, String version, String algorithms, String systemId, String securityLevel, String HDCPLevel, String maxHDCPLevel, String usageReportingSupport, String maxNumberOfOpenSessions, String numberOfOpenSessions, String description, String deviceId, String provisioningUniqueId, String privacyMode, String sessionSharing, String oemCryptoApiVersion, tls builderAction) {
            Supported.Builder builder = new Supported.Builder(vendor, version, algorithms, systemId, securityLevel, HDCPLevel, maxHDCPLevel, usageReportingSupport, maxNumberOfOpenSessions, numberOfOpenSessions, description, deviceId, provisioningUniqueId, privacyMode, sessionSharing, oemCryptoApiVersion);
            builderAction.invoke(builder);
            return builder.build$video_player_internalRelease();
        }

        private Companion() {
        }
    }

    private DRMInfo() {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0087\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006&"}, d2 = {"Lru/yandex/video/m3/player/utils/DRMInfo$Supported;", "Lru/yandex/video/m3/player/utils/DRMInfo;", DRMInfoProvider.MediaDRMKeys.VENDOR, "", "version", DRMInfoProvider.MediaDRMKeys.ALGORITHMS, DRMInfoProvider.MediaDRMKeys.SYSTEM_ID, DRMInfoProvider.MediaDRMKeys.SECURITY_LEVEL, "HDCPLevel", "maxHDCPLevel", DRMInfoProvider.MediaDRMKeys.USAGE_REPORTING_SUPPORT, "maxNumberOfOpenSessions", DRMInfoProvider.MediaDRMKeys.NUMBER_OF_OPEN_SESSIONS, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "deviceId", DRMInfoProvider.MediaDRMKeys.PROVISION_UNIQUE_ID, DRMInfoProvider.MediaDRMKeys.PRIVACY_MODE, DRMInfoProvider.MediaDRMKeys.SESSION_SHARING, DRMInfoProvider.MediaDRMKeys.OEM_CRYPTO_API_VERSION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHDCPLevel", "()Ljava/lang/String;", "getAlgorithms", "getDescription", "getDeviceId", "getMaxHDCPLevel", "getMaxNumberOfOpenSessions", "getNumberOfOpenSessions", "getOemCryptoApiVersion", "getPrivacyMode", "getProvisioningUniqueId", "getSecurityLevel", "getSessionSharing", "getSystemId", "getUsageReportingSupport", "getVendor", "getVersion", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Supported extends DRMInfo {
        public static final int $stable = 0;
        private final String HDCPLevel;
        private final String algorithms;
        private final String description;
        private final String deviceId;
        private final String maxHDCPLevel;
        private final String maxNumberOfOpenSessions;
        private final String numberOfOpenSessions;
        private final String oemCryptoApiVersion;
        private final String privacyMode;
        private final String provisioningUniqueId;
        private final String securityLevel;
        private final String sessionSharing;
        private final String systemId;
        private final String usageReportingSupport;
        private final String vendor;
        private final String version;

        private Supported(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            super(null);
            this.vendor = str;
            this.version = str2;
            this.algorithms = str3;
            this.systemId = str4;
            this.securityLevel = str5;
            this.HDCPLevel = str6;
            this.maxHDCPLevel = str7;
            this.usageReportingSupport = str8;
            this.maxNumberOfOpenSessions = str9;
            this.numberOfOpenSessions = str10;
            this.description = str11;
            this.deviceId = str12;
            this.provisioningUniqueId = str13;
            this.privacyMode = str14;
            this.sessionSharing = str15;
            this.oemCryptoApiVersion = str16;
        }

        public final String getAlgorithms() {
            return this.algorithms;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final String getHDCPLevel() {
            return this.HDCPLevel;
        }

        public final String getMaxHDCPLevel() {
            return this.maxHDCPLevel;
        }

        public final String getMaxNumberOfOpenSessions() {
            return this.maxNumberOfOpenSessions;
        }

        public final String getNumberOfOpenSessions() {
            return this.numberOfOpenSessions;
        }

        public final String getOemCryptoApiVersion() {
            return this.oemCryptoApiVersion;
        }

        public final String getPrivacyMode() {
            return this.privacyMode;
        }

        public final String getProvisioningUniqueId() {
            return this.provisioningUniqueId;
        }

        public final String getSecurityLevel() {
            return this.securityLevel;
        }

        public final String getSessionSharing() {
            return this.sessionSharing;
        }

        public final String getSystemId() {
            return this.systemId;
        }

        public final String getUsageReportingSupport() {
            return this.usageReportingSupport;
        }

        public final String getVendor() {
            return this.vendor;
        }

        public final String getVersion() {
            return this.version;
        }

        public /* synthetic */ Supported(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b5\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0087\u0001\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0002\u0010\u0016J\r\u00109\u001a\u00020\u0003H\u0000¢\u0006\u0002\b:R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001a¨\u0006;"}, d2 = {"Lru/yandex/video/m3/player/utils/DRMInfo$Supported$Builder;", "", "drmInfo", "Lru/yandex/video/m3/player/utils/DRMInfo$Supported;", "(Lru/yandex/video/m3/player/utils/DRMInfo$Supported;)V", DRMInfoProvider.MediaDRMKeys.VENDOR, "", "version", DRMInfoProvider.MediaDRMKeys.ALGORITHMS, DRMInfoProvider.MediaDRMKeys.SYSTEM_ID, DRMInfoProvider.MediaDRMKeys.SECURITY_LEVEL, "HDCPLevel", "maxHDCPLevel", DRMInfoProvider.MediaDRMKeys.USAGE_REPORTING_SUPPORT, "maxNumberOfOpenSessions", DRMInfoProvider.MediaDRMKeys.NUMBER_OF_OPEN_SESSIONS, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "deviceId", DRMInfoProvider.MediaDRMKeys.PROVISION_UNIQUE_ID, DRMInfoProvider.MediaDRMKeys.PRIVACY_MODE, DRMInfoProvider.MediaDRMKeys.SESSION_SHARING, DRMInfoProvider.MediaDRMKeys.OEM_CRYPTO_API_VERSION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHDCPLevel", "()Ljava/lang/String;", "setHDCPLevel", "(Ljava/lang/String;)V", "getAlgorithms", "setAlgorithms", "getDescription", "setDescription", "getDeviceId", "setDeviceId", "getMaxHDCPLevel", "setMaxHDCPLevel", "getMaxNumberOfOpenSessions", "setMaxNumberOfOpenSessions", "getNumberOfOpenSessions", "setNumberOfOpenSessions", "getOemCryptoApiVersion", "setOemCryptoApiVersion", "getPrivacyMode", "setPrivacyMode", "getProvisioningUniqueId", "setProvisioningUniqueId", "getSecurityLevel", "setSecurityLevel", "getSessionSharing", "setSessionSharing", "getSystemId", "setSystemId", "getUsageReportingSupport", "setUsageReportingSupport", "getVendor", "setVendor", "getVersion", "setVersion", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private String HDCPLevel;
            private String algorithms;
            private String description;
            private String deviceId;
            private String maxHDCPLevel;
            private String maxNumberOfOpenSessions;
            private String numberOfOpenSessions;
            private String oemCryptoApiVersion;
            private String privacyMode;
            private String provisioningUniqueId;
            private String securityLevel;
            private String sessionSharing;
            private String systemId;
            private String usageReportingSupport;
            private String vendor;
            private String version;

            public Builder(Supported supported) {
                this(supported.getVendor(), supported.getVersion(), supported.getAlgorithms(), supported.getSystemId(), supported.getSecurityLevel(), supported.getHDCPLevel(), supported.getMaxHDCPLevel(), supported.getUsageReportingSupport(), supported.getMaxNumberOfOpenSessions(), supported.getNumberOfOpenSessions(), supported.getDescription(), supported.getDeviceId(), supported.getProvisioningUniqueId(), supported.getPrivacyMode(), supported.getSessionSharing(), supported.getOemCryptoApiVersion());
            }

            public final Supported build$video_player_internalRelease() {
                return new Supported(this.vendor, this.version, this.algorithms, this.systemId, this.securityLevel, this.HDCPLevel, this.maxHDCPLevel, this.usageReportingSupport, this.maxNumberOfOpenSessions, this.numberOfOpenSessions, this.description, this.deviceId, this.provisioningUniqueId, this.privacyMode, this.sessionSharing, this.oemCryptoApiVersion, null);
            }

            public final String getAlgorithms() {
                return this.algorithms;
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getDeviceId() {
                return this.deviceId;
            }

            public final String getHDCPLevel() {
                return this.HDCPLevel;
            }

            public final String getMaxHDCPLevel() {
                return this.maxHDCPLevel;
            }

            public final String getMaxNumberOfOpenSessions() {
                return this.maxNumberOfOpenSessions;
            }

            public final String getNumberOfOpenSessions() {
                return this.numberOfOpenSessions;
            }

            public final String getOemCryptoApiVersion() {
                return this.oemCryptoApiVersion;
            }

            public final String getPrivacyMode() {
                return this.privacyMode;
            }

            public final String getProvisioningUniqueId() {
                return this.provisioningUniqueId;
            }

            public final String getSecurityLevel() {
                return this.securityLevel;
            }

            public final String getSessionSharing() {
                return this.sessionSharing;
            }

            public final String getSystemId() {
                return this.systemId;
            }

            public final String getUsageReportingSupport() {
                return this.usageReportingSupport;
            }

            public final String getVendor() {
                return this.vendor;
            }

            public final String getVersion() {
                return this.version;
            }

            public final void setAlgorithms(String str) {
                this.algorithms = str;
            }

            public final void setDescription(String str) {
                this.description = str;
            }

            public final void setDeviceId(String str) {
                this.deviceId = str;
            }

            public final void setHDCPLevel(String str) {
                this.HDCPLevel = str;
            }

            public final void setMaxHDCPLevel(String str) {
                this.maxHDCPLevel = str;
            }

            public final void setMaxNumberOfOpenSessions(String str) {
                this.maxNumberOfOpenSessions = str;
            }

            public final void setNumberOfOpenSessions(String str) {
                this.numberOfOpenSessions = str;
            }

            public final void setOemCryptoApiVersion(String str) {
                this.oemCryptoApiVersion = str;
            }

            public final void setPrivacyMode(String str) {
                this.privacyMode = str;
            }

            public final void setProvisioningUniqueId(String str) {
                this.provisioningUniqueId = str;
            }

            public final void setSecurityLevel(String str) {
                this.securityLevel = str;
            }

            public final void setSessionSharing(String str) {
                this.sessionSharing = str;
            }

            public final void setSystemId(String str) {
                this.systemId = str;
            }

            public final void setUsageReportingSupport(String str) {
                this.usageReportingSupport = str;
            }

            public final void setVendor(String str) {
                this.vendor = str;
            }

            public final void setVersion(String str) {
                this.version = str;
            }

            public Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
                this.vendor = str;
                this.version = str2;
                this.algorithms = str3;
                this.systemId = str4;
                this.securityLevel = str5;
                this.HDCPLevel = str6;
                this.maxHDCPLevel = str7;
                this.usageReportingSupport = str8;
                this.maxNumberOfOpenSessions = str9;
                this.numberOfOpenSessions = str10;
                this.description = str11;
                this.deviceId = str12;
                this.provisioningUniqueId = str13;
                this.privacyMode = str14;
                this.sessionSharing = str15;
                this.oemCryptoApiVersion = str16;
            }
        }
    }
}
