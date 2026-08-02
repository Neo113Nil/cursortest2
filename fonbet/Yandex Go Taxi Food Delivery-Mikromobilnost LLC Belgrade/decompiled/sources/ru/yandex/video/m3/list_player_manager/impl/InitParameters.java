package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.list_player_manager.impl.ext_provider.ExternalMediaDataProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001:\u0001=B\u008e\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u000b\u0010\r\u001a\u00070\u000b¢\u0006\u0002\b\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b.\u0010%R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b/\u0010-R\u001c\u0010\r\u001a\u00070\u000b¢\u0006\u0002\b\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010#R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b2\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b3\u0010%R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b4\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b8\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b<\u0010-¨\u0006>"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/InitParameters;", "", "", "from", "deviceId", "", "testIds", "", "isFailFast", "yandexUid", "automaticallyHandleAudioFocus", "", "Lru/yandex/video/m3/list_player_manager/model/ListVideoSourceType;", "videoSourceType", "playerLogsEnabled", "vhBackendService", "jsonFlags", "Lru/yandex/video/m3/data/network/UrlParams;", "strmTrackingUrl", "perfTrackingUrl", "Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;", "externalMediaDataProvider", "useHardcodedRatioForBlurs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;ZIZLjava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/data/network/UrlParams;Lru/yandex/video/m3/data/network/UrlParams;Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;Z)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/list_player_manager/impl/InitParameters$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/list_player_manager/impl/InitParameters;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getFrom", "getDeviceId", "Ljava/util/List;", "getTestIds", "()Ljava/util/List;", "Z", "()Z", "getYandexUid", "getAutomaticallyHandleAudioFocus", CA20Status.STATUS_USER_I, "getVideoSourceType", "getPlayerLogsEnabled", "getVhBackendService", "getJsonFlags", "Lru/yandex/video/m3/data/network/UrlParams;", "getStrmTrackingUrl", "()Lru/yandex/video/m3/data/network/UrlParams;", "getPerfTrackingUrl", "Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;", "getExternalMediaDataProvider", "()Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;", "getUseHardcodedRatioForBlurs", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitParameters {
    public static final int $stable = 8;
    private final boolean automaticallyHandleAudioFocus;
    private final String deviceId;
    private final ExternalMediaDataProvider externalMediaDataProvider;
    private final String from;
    private final boolean isFailFast;
    private final String jsonFlags;
    private final UrlParams perfTrackingUrl;
    private final boolean playerLogsEnabled;
    private final UrlParams strmTrackingUrl;
    private final List<String> testIds;
    private final boolean useHardcodedRatioForBlurs;
    private final String vhBackendService;
    private final int videoSourceType;
    private final String yandexUid;

    private InitParameters(String str, String str2, List<String> list, boolean z, String str3, boolean z2, int i, boolean z3, String str4, String str5, UrlParams urlParams, UrlParams urlParams2, ExternalMediaDataProvider externalMediaDataProvider, boolean z4) {
        this.from = str;
        this.deviceId = str2;
        this.testIds = list;
        this.isFailFast = z;
        this.yandexUid = str3;
        this.automaticallyHandleAudioFocus = z2;
        this.videoSourceType = i;
        this.playerLogsEnabled = z3;
        this.vhBackendService = str4;
        this.jsonFlags = str5;
        this.strmTrackingUrl = urlParams;
        this.perfTrackingUrl = urlParams2;
        this.externalMediaDataProvider = externalMediaDataProvider;
        this.useHardcodedRatioForBlurs = z4;
    }

    public final InitParameters copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!InitParameters.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        InitParameters initParameters = (InitParameters) other;
        return jl40.l(this.from, initParameters.from) && jl40.l(this.deviceId, initParameters.deviceId) && jl40.l(this.testIds, initParameters.testIds) && this.isFailFast == initParameters.isFailFast && jl40.l(this.yandexUid, initParameters.yandexUid) && this.automaticallyHandleAudioFocus == initParameters.automaticallyHandleAudioFocus && this.videoSourceType == initParameters.videoSourceType && this.playerLogsEnabled == initParameters.playerLogsEnabled && jl40.l(this.vhBackendService, initParameters.vhBackendService) && jl40.l(this.jsonFlags, initParameters.jsonFlags) && jl40.l(this.strmTrackingUrl, initParameters.strmTrackingUrl) && jl40.l(this.perfTrackingUrl, initParameters.perfTrackingUrl) && jl40.l(this.externalMediaDataProvider, initParameters.externalMediaDataProvider) && this.useHardcodedRatioForBlurs == initParameters.useHardcodedRatioForBlurs;
    }

    public final boolean getAutomaticallyHandleAudioFocus() {
        return this.automaticallyHandleAudioFocus;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final ExternalMediaDataProvider getExternalMediaDataProvider() {
        return this.externalMediaDataProvider;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getJsonFlags() {
        return this.jsonFlags;
    }

    public final UrlParams getPerfTrackingUrl() {
        return this.perfTrackingUrl;
    }

    public final boolean getPlayerLogsEnabled() {
        return this.playerLogsEnabled;
    }

    public final UrlParams getStrmTrackingUrl() {
        return this.strmTrackingUrl;
    }

    public final List<String> getTestIds() {
        return this.testIds;
    }

    public final boolean getUseHardcodedRatioForBlurs() {
        return this.useHardcodedRatioForBlurs;
    }

    public final String getVhBackendService() {
        return this.vhBackendService;
    }

    public final int getVideoSourceType() {
        return this.videoSourceType;
    }

    public final String getYandexUid() {
        return this.yandexUid;
    }

    public int hashCode() {
        int e = unr0.e(unr0.c(unr0.b(this.from.hashCode() * 31, 31, this.deviceId), 31, this.testIds), 31, this.isFailFast);
        String str = this.yandexUid;
        int e2 = unr0.e((unr0.e((e + (str != null ? str.hashCode() : 0)) * 31, 31, this.automaticallyHandleAudioFocus) + this.videoSourceType) * 31, 31, this.playerLogsEnabled);
        String str2 = this.vhBackendService;
        int b = unr0.b((e2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.jsonFlags);
        UrlParams urlParams = this.strmTrackingUrl;
        int hashCode = (b + (urlParams != null ? urlParams.hashCode() : 0)) * 31;
        UrlParams urlParams2 = this.perfTrackingUrl;
        int hashCode2 = (hashCode + (urlParams2 != null ? urlParams2.hashCode() : 0)) * 31;
        ExternalMediaDataProvider externalMediaDataProvider = this.externalMediaDataProvider;
        return Boolean.hashCode(this.useHardcodedRatioForBlurs) + ((hashCode2 + (externalMediaDataProvider != null ? externalMediaDataProvider.hashCode() : 0)) * 31);
    }

    /* renamed from: isFailFast, reason: from getter */
    public final boolean getIsFailFast() {
        return this.isFailFast;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InitParameters(from='");
        sb.append(this.from);
        sb.append("', deviceId='");
        sb.append(this.deviceId);
        sb.append("', testIds=");
        sb.append(this.testIds);
        sb.append(", isFailFast=");
        sb.append(this.isFailFast);
        sb.append(", yandexUid=");
        sb.append(this.yandexUid);
        sb.append(", automaticallyHandleAudioFocus=");
        sb.append(this.automaticallyHandleAudioFocus);
        sb.append(", videoSourceType=");
        sb.append(this.videoSourceType);
        sb.append(", playerLogsEnabled=");
        sb.append(this.playerLogsEnabled);
        sb.append(", vhBackendService=");
        sb.append(this.vhBackendService);
        sb.append(", jsonFlags='");
        sb.append(this.jsonFlags);
        sb.append("', strmTrackingUrl=");
        sb.append(this.strmTrackingUrl);
        sb.append(", perfTrackingUrl=");
        sb.append(this.perfTrackingUrl);
        sb.append(", externalMediaDataProvider=");
        sb.append(this.externalMediaDataProvider);
        sb.append(", useHardcodedRatioForBlurs=");
        return unr0.u(sb, this.useHardcodedRatioForBlurs, ')');
    }

    public /* synthetic */ InitParameters(String str, String str2, List list, boolean z, String str3, boolean z2, int i, boolean z3, String str4, String str5, UrlParams urlParams, UrlParams urlParams2, ExternalMediaDataProvider externalMediaDataProvider, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, z, str3, z2, i, z3, str4, str5, urlParams, urlParams2, externalMediaDataProvider, z4);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010E\u001a\u00020\u0003R\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001a\u0010\u001f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u001c\u0010+\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00108\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010\u0015R\u001f\u0010;\u001a\u00070<¢\u0006\u0002\b=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0013\"\u0004\bD\u0010\u0015¨\u0006F"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/InitParameters$Builder;", "", "initParameters", "Lru/yandex/video/m3/list_player_manager/impl/InitParameters;", "(Lru/yandex/video/m3/list_player_manager/impl/InitParameters;)V", "from", "", "deviceId", "testIds", "", "isFailFast", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "automaticallyHandleAudioFocus", "getAutomaticallyHandleAudioFocus", "()Z", "setAutomaticallyHandleAudioFocus", "(Z)V", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "externalMediaDataProvider", "Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;", "getExternalMediaDataProvider", "()Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;", "setExternalMediaDataProvider", "(Lru/yandex/video/m3/list_player_manager/impl/ext_provider/ExternalMediaDataProvider;)V", "getFrom", "setFrom", "setFailFast", "jsonFlags", "getJsonFlags", "setJsonFlags", "perfTrackingUrl", "Lru/yandex/video/m3/data/network/UrlParams;", "getPerfTrackingUrl", "()Lru/yandex/video/m3/data/network/UrlParams;", "setPerfTrackingUrl", "(Lru/yandex/video/m3/data/network/UrlParams;)V", "playerLogsEnabled", "getPlayerLogsEnabled", "setPlayerLogsEnabled", "strmTrackingUrl", "getStrmTrackingUrl", "setStrmTrackingUrl", "getTestIds", "()Ljava/util/List;", "setTestIds", "(Ljava/util/List;)V", "useHardcodedRatioForBlurs", "getUseHardcodedRatioForBlurs", "()Ljava/lang/Boolean;", "setUseHardcodedRatioForBlurs", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "vhBackendService", "getVhBackendService", "setVhBackendService", "videoSourceType", "", "Lru/yandex/video/m3/list_player_manager/model/ListVideoSourceType;", "getVideoSourceType", "()I", "setVideoSourceType", "(I)V", "yandexUid", "getYandexUid", "setYandexUid", "build", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private boolean automaticallyHandleAudioFocus;
        private String deviceId;
        private ExternalMediaDataProvider externalMediaDataProvider;
        private String from;
        private boolean isFailFast;
        private String jsonFlags;
        private UrlParams perfTrackingUrl;
        private boolean playerLogsEnabled;
        private UrlParams strmTrackingUrl;
        private List<String> testIds;
        private Boolean useHardcodedRatioForBlurs;
        private String vhBackendService;
        private int videoSourceType;
        private String yandexUid;

        public Builder(InitParameters initParameters) {
            this(initParameters.getFrom(), initParameters.getDeviceId(), initParameters.getTestIds(), initParameters.getIsFailFast());
            this.yandexUid = initParameters.getYandexUid();
            this.automaticallyHandleAudioFocus = initParameters.getAutomaticallyHandleAudioFocus();
            this.videoSourceType = initParameters.getVideoSourceType();
            this.playerLogsEnabled = initParameters.getPlayerLogsEnabled();
            this.vhBackendService = initParameters.getVhBackendService();
            this.jsonFlags = initParameters.getJsonFlags();
            this.strmTrackingUrl = initParameters.getStrmTrackingUrl();
            this.perfTrackingUrl = initParameters.getPerfTrackingUrl();
            this.externalMediaDataProvider = initParameters.getExternalMediaDataProvider();
            this.useHardcodedRatioForBlurs = Boolean.valueOf(initParameters.getUseHardcodedRatioForBlurs());
        }

        public final InitParameters build() {
            String str = this.from;
            String str2 = this.deviceId;
            List<String> list = this.testIds;
            boolean z = this.isFailFast;
            String str3 = this.yandexUid;
            boolean z2 = this.automaticallyHandleAudioFocus;
            int i = this.videoSourceType;
            boolean z3 = this.playerLogsEnabled;
            String str4 = this.vhBackendService;
            String str5 = this.jsonFlags;
            UrlParams urlParams = this.strmTrackingUrl;
            UrlParams urlParams2 = this.perfTrackingUrl;
            ExternalMediaDataProvider externalMediaDataProvider = this.externalMediaDataProvider;
            Boolean bool = this.useHardcodedRatioForBlurs;
            return new InitParameters(str, str2, list, z, str3, z2, i, z3, str4, str5, urlParams, urlParams2, externalMediaDataProvider, bool != null ? bool.booleanValue() : false, null);
        }

        public final boolean getAutomaticallyHandleAudioFocus() {
            return this.automaticallyHandleAudioFocus;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final ExternalMediaDataProvider getExternalMediaDataProvider() {
            return this.externalMediaDataProvider;
        }

        public final String getFrom() {
            return this.from;
        }

        public final String getJsonFlags() {
            return this.jsonFlags;
        }

        public final UrlParams getPerfTrackingUrl() {
            return this.perfTrackingUrl;
        }

        public final boolean getPlayerLogsEnabled() {
            return this.playerLogsEnabled;
        }

        public final UrlParams getStrmTrackingUrl() {
            return this.strmTrackingUrl;
        }

        public final List<String> getTestIds() {
            return this.testIds;
        }

        public final Boolean getUseHardcodedRatioForBlurs() {
            return this.useHardcodedRatioForBlurs;
        }

        public final String getVhBackendService() {
            return this.vhBackendService;
        }

        public final int getVideoSourceType() {
            return this.videoSourceType;
        }

        public final String getYandexUid() {
            return this.yandexUid;
        }

        /* renamed from: isFailFast, reason: from getter */
        public final boolean getIsFailFast() {
            return this.isFailFast;
        }

        public final void setAutomaticallyHandleAudioFocus(boolean z) {
            this.automaticallyHandleAudioFocus = z;
        }

        public final void setDeviceId(String str) {
            this.deviceId = str;
        }

        public final void setExternalMediaDataProvider(ExternalMediaDataProvider externalMediaDataProvider) {
            this.externalMediaDataProvider = externalMediaDataProvider;
        }

        public final void setFailFast(boolean z) {
            this.isFailFast = z;
        }

        public final void setFrom(String str) {
            this.from = str;
        }

        public final void setJsonFlags(String str) {
            this.jsonFlags = str;
        }

        public final void setPerfTrackingUrl(UrlParams urlParams) {
            this.perfTrackingUrl = urlParams;
        }

        public final void setPlayerLogsEnabled(boolean z) {
            this.playerLogsEnabled = z;
        }

        public final void setStrmTrackingUrl(UrlParams urlParams) {
            this.strmTrackingUrl = urlParams;
        }

        public final void setTestIds(List<String> list) {
            this.testIds = list;
        }

        public final void setUseHardcodedRatioForBlurs(Boolean bool) {
            this.useHardcodedRatioForBlurs = bool;
        }

        public final void setVhBackendService(String str) {
            this.vhBackendService = str;
        }

        public final void setVideoSourceType(int i) {
            this.videoSourceType = i;
        }

        public final void setYandexUid(String str) {
            this.yandexUid = str;
        }

        public Builder(String str, String str2, List<String> list, boolean z) {
            this.from = str;
            this.deviceId = str2;
            this.testIds = list;
            this.isFailFast = z;
            this.playerLogsEnabled = true;
            this.jsonFlags = "";
        }
    }
}
