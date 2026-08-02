package ru.yandex.video.m3.ott.impl;

import android.os.Build;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.b64;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.sls;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.local.SubProfileProvider;
import ru.yandex.video.m3.ott.ott.DeviceProvider;
import ru.yandex.video.m3.ott.ott.PictureInPictureProvider;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.IsMuteProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001:\u0002EFB[\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017JI\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001c\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020!¢\u0006\u0004\b$\u0010%JI\u0010/\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010-j\u0002`.2\u0006\u0010'\u001a\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b/\u00100JI\u0010/\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010-j\u0002`.2\u0006\u00102\u001a\u0002012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b/\u00103R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010=R\u001b\u0010B\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010CR\u0016\u0010D\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010C¨\u0006G"}, d2 = {"Lru/yandex/video/m3/ott/impl/TrackingEventBuilder;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "trackingData", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "deviceProvider", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "Lru/yandex/video/m3/ott/impl/ConnectionChecker;", "connectionChecker", "Lru/yandex/video/m3/ott/data/local/SubProfileProvider;", "subProfileProvider", "Lru/yandex/video/m3/ott/ott/PictureInPictureProvider;", "pictureInPictureProvider", "Lru/yandex/video/m3/player/impl/utils/IsMuteProvider;", "isMuteProvider", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;Lru/yandex/video/m3/player/impl/utils/InfoProvider;Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lru/yandex/video/m3/ott/ott/DeviceProvider;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/ott/impl/ConnectionChecker;Lru/yandex/video/m3/ott/data/local/SubProfileProvider;Lru/yandex/video/m3/ott/ott/PictureInPictureProvider;Lru/yandex/video/m3/player/impl/utils/IsMuteProvider;)V", CA20Status.STATUS_REQUEST_K, CA20Status.STATUS_CERTIFICATE_V, "", "key", "value", "putIfNotNull", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "", "isFullscreen", "Lzy11;", "setFullscreen", "(Z)V", "updateDeviceInfoParams", "()V", "", "eventType", "errorType", "Lru/yandex/video/m3/ott/impl/TrackingEventBuilder$MultiplexParams;", "multiplexParams", "Lru/yandex/video/m3/ott/impl/TrackingEventBuilder$AdParams;", "adParams", "", "Lru/yandex/video/m3/ott/data/dto/OttTrackingEvent;", "build", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/impl/TrackingEventBuilder$MultiplexParams;Lru/yandex/video/m3/ott/impl/TrackingEventBuilder$AdParams;)Ljava/util/Map;", "Lru/yandex/video/m3/ott/impl/TrackingEventType;", "type", "(Lru/yandex/video/m3/ott/impl/TrackingEventType;Ljava/lang/String;Lru/yandex/video/m3/ott/impl/TrackingEventBuilder$MultiplexParams;Lru/yandex/video/m3/ott/impl/TrackingEventBuilder$AdParams;)Ljava/util/Map;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "Lru/yandex/video/m3/ott/impl/ConnectionChecker;", "Lru/yandex/video/m3/ott/data/local/SubProfileProvider;", "Lru/yandex/video/m3/ott/ott/PictureInPictureProvider;", "Lru/yandex/video/m3/player/impl/utils/IsMuteProvider;", "deviceId$delegate", "Li3y;", "getDeviceId", "()Ljava/lang/String;", "deviceId", "Z", "isDrmSupported", "AdParams", "MultiplexParams", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackingEventBuilder {
    public static final int $stable = 8;
    private final ConnectionChecker connectionChecker;

    /* renamed from: deviceId$delegate, reason: from kotlin metadata */
    private final i3y deviceId = a.a(new sls() { // from class: ru.yandex.video.m3.ott.impl.TrackingEventBuilder$deviceId$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final String invoke() {
            DeviceProvider deviceProvider;
            deviceProvider = TrackingEventBuilder.this.deviceProvider;
            return deviceProvider.getDeviceId().toString();
        }
    });
    private final DeviceProvider deviceProvider;
    private final InfoProvider infoProvider;
    private boolean isDrmSupported;
    private boolean isFullscreen;
    private final IsMuteProvider isMuteProvider;
    private final PictureInPictureProvider pictureInPictureProvider;
    private final YandexPlayer<?> player;
    private final ResourceProvider resourceProvider;
    private final SubProfileProvider subProfileProvider;
    private final TimeProvider timeProvider;
    private final Ott.TrackingData trackingData;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/ott/impl/TrackingEventBuilder$AdParams;", "", "adPosition", "", "clientAdSec", "", "(Ljava/lang/String;J)V", "getAdPosition", "()Ljava/lang/String;", "getClientAdSec", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AdParams {
        public static final int $stable = 0;
        private final String adPosition;
        private final long clientAdSec;

        public AdParams(String str, long j) {
            this.adPosition = str;
            this.clientAdSec = j;
        }

        public static /* synthetic */ AdParams copy$default(AdParams adParams, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = adParams.adPosition;
            }
            if ((i & 2) != 0) {
                j = adParams.clientAdSec;
            }
            return adParams.copy(str, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAdPosition() {
            return this.adPosition;
        }

        /* renamed from: component2, reason: from getter */
        public final long getClientAdSec() {
            return this.clientAdSec;
        }

        public final AdParams copy(String adPosition, long clientAdSec) {
            return new AdParams(adPosition, clientAdSec);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdParams)) {
                return false;
            }
            AdParams adParams = (AdParams) other;
            return jl40.l(this.adPosition, adParams.adPosition) && this.clientAdSec == adParams.clientAdSec;
        }

        public final String getAdPosition() {
            return this.adPosition;
        }

        public final long getClientAdSec() {
            return this.clientAdSec;
        }

        public int hashCode() {
            return Long.hashCode(this.clientAdSec) + (this.adPosition.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AdParams(adPosition=");
            sb.append(this.adPosition);
            sb.append(", clientAdSec=");
            return b64.o(sb, this.clientAdSec, ')');
        }
    }

    public TrackingEventBuilder(YandexPlayer<?> yandexPlayer, Ott.TrackingData trackingData, InfoProvider infoProvider, TimeProvider timeProvider, DeviceProvider deviceProvider, ResourceProvider resourceProvider, ConnectionChecker connectionChecker, SubProfileProvider subProfileProvider, PictureInPictureProvider pictureInPictureProvider, IsMuteProvider isMuteProvider) {
        this.player = yandexPlayer;
        this.trackingData = trackingData;
        this.infoProvider = infoProvider;
        this.timeProvider = timeProvider;
        this.deviceProvider = deviceProvider;
        this.resourceProvider = resourceProvider;
        this.connectionChecker = connectionChecker;
        this.subProfileProvider = subProfileProvider;
        this.pictureInPictureProvider = pictureInPictureProvider;
        this.isMuteProvider = isMuteProvider;
    }

    public static /* synthetic */ Map build$default(TrackingEventBuilder trackingEventBuilder, String str, String str2, MultiplexParams multiplexParams, AdParams adParams, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            multiplexParams = null;
        }
        if ((i & 8) != 0) {
            adParams = null;
        }
        return trackingEventBuilder.build(str, str2, multiplexParams, adParams);
    }

    private final String getDeviceId() {
        return (String) this.deviceId.getValue();
    }

    private final <K, V> Map<K, V> putIfNotNull(Map<K, V> map, K k, V v) {
        if (v != null) {
            map.put(k, v);
        }
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f1, code lost:
    
        if (r5 > 0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> build(String eventType, String errorType, MultiplexParams multiplexParams, AdParams adParams) {
        long fts;
        Long l;
        List W;
        List W2;
        TrackFormat selectedTrackFormat;
        TrackFormat selectedTrackFormat2;
        TrackFormat selectedTrackFormat3;
        TrackFormat selectedTrackFormat4;
        Map putIfNotNull = putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull(new LinkedHashMap(this.trackingData.getTrackings()), "eventType", eventType), "downloaded", Integer.valueOf(this.trackingData.getDownloaded() ? 1 : 0)), "fromBlock", this.trackingData.getFromBlock()), "vSid", this.player.getVideoSessionId());
        Track audioTrack = this.player.getAudioTrack();
        Long l2 = null;
        Map putIfNotNull2 = putIfNotNull(putIfNotNull, "audio-track-name", audioTrack != null ? audioTrack.getSelectedTrackName(this.resourceProvider) : null);
        Track audioTrack2 = this.player.getAudioTrack();
        Map putIfNotNull3 = putIfNotNull(putIfNotNull2, "audio-track-lang", (audioTrack2 == null || (selectedTrackFormat4 = audioTrack2.getSelectedTrackFormat()) == null) ? null : selectedTrackFormat4.getLanguage());
        Track subtitlesTrack = this.player.getSubtitlesTrack();
        Map putIfNotNull4 = putIfNotNull(putIfNotNull3, "text-track-name", subtitlesTrack != null ? subtitlesTrack.getSelectedTrackName(this.resourceProvider) : null);
        Track subtitlesTrack2 = this.player.getSubtitlesTrack();
        Map putIfNotNull5 = putIfNotNull(putIfNotNull4, "text-track-lang", (subtitlesTrack2 == null || (selectedTrackFormat3 = subtitlesTrack2.getSelectedTrackFormat()) == null) ? null : selectedTrackFormat3.getLanguage());
        Track videoTrack = this.player.getVideoTrack();
        Map putIfNotNull6 = putIfNotNull(putIfNotNull5, "bitrate_video", (videoTrack == null || (selectedTrackFormat2 = videoTrack.getSelectedTrackFormat()) == null) ? null : Integer.valueOf(selectedTrackFormat2.getBitrate()));
        Track videoTrack2 = this.player.getVideoTrack();
        Map putIfNotNull7 = putIfNotNull(putIfNotNull6, "bitrate_audio", (videoTrack2 == null || (selectedTrackFormat = videoTrack2.getSelectedTrackFormat()) == null) ? null : Integer.valueOf(selectedTrackFormat.getBitrate()));
        fts = TrackingManagerImplKt.getFts(this.player);
        Map putIfNotNull8 = putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull7, "fts", Long.valueOf(fts)), ClidProvider.TIMESTAMP, Long.valueOf(this.timeProvider.currentTimeMillis())), UgcLiveVideoData.UgcLiveStatus.OFFLINE, Integer.valueOf(!this.connectionChecker.isConnected() ? 1 : 0)), ErrorResponseData.JSON_ERROR_CODE, errorType), "subProfileId", this.subProfileProvider.getSubProfileId()), "pictureInPicture", Integer.valueOf(this.pictureInPictureProvider.getIsEnabledPictureInPictureMode() ? 1 : 0)), "appName", this.infoProvider.getAppInfo().getApplicationId()), "appVersion", this.infoProvider.getAppInfo().getAppVersionName()), "platformOs", "Android");
        String str = Build.MANUFACTURER;
        if (str == null) {
            str = "Unknown";
        }
        Map putIfNotNull9 = putIfNotNull(putIfNotNull8, "platformVendor", str);
        String str2 = Build.MODEL;
        Map putIfNotNull10 = putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull9, "platformModel", str2 != null ? str2 : "Unknown"), "deviceType", Integer.valueOf(this.trackingData.getDeviceType().getValue())), MetaDataField.DEVICE_ID_FIELD, getDeviceId()), "drm_supported", Integer.valueOf(this.isDrmSupported ? 1 : 0));
        VideoData videoDataInternal = this.player.getVideoDataInternal();
        Map putIfNotNull11 = putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull10, "drm_system_use", videoDataInternal != null ? TrackingManagerImplKt.getUseDrmType(videoDataInternal) : null), "buffering_count", multiplexParams != null ? Long.valueOf(multiplexParams.getBufferingCount()) : null), "content_sec", multiplexParams != null ? Long.valueOf(multiplexParams.getPlaybackDurationMs() / 1000) : null), "buffering_sec", multiplexParams != null ? Long.valueOf(multiplexParams.getBufferingDurationMs() / 1000) : null);
        if (multiplexParams != null) {
            long preparingStreamDurationMs = multiplexParams.getPreparingStreamDurationMs();
            l = Long.valueOf(preparingStreamDurationMs);
        }
        l = null;
        Map putIfNotNull12 = putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull11, "init_before_stream_or_ad_request_msec", l), "ad_position", adParams != null ? "Preroll".toLowerCase(Locale.ROOT) : null), "client_ad_sec", adParams != null ? Long.valueOf(adParams.getClientAdSec()) : null);
        if (multiplexParams != null) {
            long firstBufferingDurationMs = multiplexParams.getFirstBufferingDurationMs();
            Long valueOf = Long.valueOf(firstBufferingDurationMs);
            if (firstBufferingDurationMs > 0) {
                l2 = valueOf;
            }
        }
        Map putIfNotNull13 = putIfNotNull(putIfNotNull12, "stream_or_ad_initial_buffering_msec", l2);
        String str3 = Build.VERSION.RELEASE;
        W = evu0.W(str3 == null ? "" : str3, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        CharSequence charSequence = (CharSequence) kotlin.collections.a.P(W);
        if (evu0.J(charSequence)) {
            charSequence = "0";
        }
        Map putIfNotNull14 = putIfNotNull(putIfNotNull13, "platformOsVersionMajor", charSequence);
        if (str3 == null) {
            str3 = "";
        }
        W2 = evu0.W(str3, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        CharSequence charSequence2 = (CharSequence) (1 < W2.size() ? W2.get(1) : "0");
        return putIfNotNull(putIfNotNull(putIfNotNull(putIfNotNull14, "platformOsVersionMinor", evu0.J(charSequence2) ? "0" : charSequence2), "mute", Integer.valueOf(this.isMuteProvider.isPlaybackMuted() ? 1 : 0)), "fullscreen", Integer.valueOf(this.isFullscreen ? 1 : 0));
    }

    public final void setFullscreen(boolean isFullscreen) {
        this.isFullscreen = isFullscreen;
    }

    public final void updateDeviceInfoParams() {
        this.isDrmSupported = this.deviceProvider.getWidevineAvailable();
    }

    public static /* synthetic */ Map build$default(TrackingEventBuilder trackingEventBuilder, TrackingEventType trackingEventType, String str, MultiplexParams multiplexParams, AdParams adParams, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            multiplexParams = null;
        }
        if ((i & 8) != 0) {
            adParams = null;
        }
        return trackingEventBuilder.build(trackingEventType, str, multiplexParams, adParams);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lru/yandex/video/m3/ott/impl/TrackingEventBuilder$MultiplexParams;", "", "playbackDurationMs", "", "bufferingDurationMs", "firstBufferingDurationMs", "bufferingCount", "preparingStreamDurationMs", "adPosition", "", "(JJJJJLjava/lang/String;)V", "getAdPosition", "()Ljava/lang/String;", "getBufferingCount", "()J", "getBufferingDurationMs", "getFirstBufferingDurationMs", "getPlaybackDurationMs", "getPreparingStreamDurationMs", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MultiplexParams {
        public static final int $stable = 0;
        private final String adPosition;
        private final long bufferingCount;
        private final long bufferingDurationMs;
        private final long firstBufferingDurationMs;
        private final long playbackDurationMs;
        private final long preparingStreamDurationMs;

        public /* synthetic */ MultiplexParams(long j, long j2, long j3, long j4, long j5, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4, j5, (i & 32) != 0 ? null : str);
        }

        public static /* synthetic */ MultiplexParams copy$default(MultiplexParams multiplexParams, long j, long j2, long j3, long j4, long j5, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = multiplexParams.playbackDurationMs;
            }
            return multiplexParams.copy(j, (i & 2) != 0 ? multiplexParams.bufferingDurationMs : j2, (i & 4) != 0 ? multiplexParams.firstBufferingDurationMs : j3, (i & 8) != 0 ? multiplexParams.bufferingCount : j4, (i & 16) != 0 ? multiplexParams.preparingStreamDurationMs : j5, (i & 32) != 0 ? multiplexParams.adPosition : str);
        }

        /* renamed from: component1, reason: from getter */
        public final long getPlaybackDurationMs() {
            return this.playbackDurationMs;
        }

        /* renamed from: component2, reason: from getter */
        public final long getBufferingDurationMs() {
            return this.bufferingDurationMs;
        }

        /* renamed from: component3, reason: from getter */
        public final long getFirstBufferingDurationMs() {
            return this.firstBufferingDurationMs;
        }

        /* renamed from: component4, reason: from getter */
        public final long getBufferingCount() {
            return this.bufferingCount;
        }

        /* renamed from: component5, reason: from getter */
        public final long getPreparingStreamDurationMs() {
            return this.preparingStreamDurationMs;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAdPosition() {
            return this.adPosition;
        }

        public final MultiplexParams copy(long playbackDurationMs, long bufferingDurationMs, long firstBufferingDurationMs, long bufferingCount, long preparingStreamDurationMs, String adPosition) {
            return new MultiplexParams(playbackDurationMs, bufferingDurationMs, firstBufferingDurationMs, bufferingCount, preparingStreamDurationMs, adPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiplexParams)) {
                return false;
            }
            MultiplexParams multiplexParams = (MultiplexParams) other;
            return this.playbackDurationMs == multiplexParams.playbackDurationMs && this.bufferingDurationMs == multiplexParams.bufferingDurationMs && this.firstBufferingDurationMs == multiplexParams.firstBufferingDurationMs && this.bufferingCount == multiplexParams.bufferingCount && this.preparingStreamDurationMs == multiplexParams.preparingStreamDurationMs && jl40.l(this.adPosition, multiplexParams.adPosition);
        }

        public final String getAdPosition() {
            return this.adPosition;
        }

        public final long getBufferingCount() {
            return this.bufferingCount;
        }

        public final long getBufferingDurationMs() {
            return this.bufferingDurationMs;
        }

        public final long getFirstBufferingDurationMs() {
            return this.firstBufferingDurationMs;
        }

        public final long getPlaybackDurationMs() {
            return this.playbackDurationMs;
        }

        public final long getPreparingStreamDurationMs() {
            return this.preparingStreamDurationMs;
        }

        public int hashCode() {
            int c = qv10.c(qv10.c(qv10.c(qv10.c(Long.hashCode(this.playbackDurationMs) * 31, 31, this.bufferingDurationMs), 31, this.firstBufferingDurationMs), 31, this.bufferingCount), 31, this.preparingStreamDurationMs);
            String str = this.adPosition;
            return c + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MultiplexParams(playbackDurationMs=");
            sb.append(this.playbackDurationMs);
            sb.append(", bufferingDurationMs=");
            sb.append(this.bufferingDurationMs);
            sb.append(", firstBufferingDurationMs=");
            sb.append(this.firstBufferingDurationMs);
            sb.append(", bufferingCount=");
            sb.append(this.bufferingCount);
            sb.append(", preparingStreamDurationMs=");
            sb.append(this.preparingStreamDurationMs);
            sb.append(", adPosition=");
            return b64.p(sb, this.adPosition, ')');
        }

        public MultiplexParams(long j, long j2, long j3, long j4, long j5, String str) {
            this.playbackDurationMs = j;
            this.bufferingDurationMs = j2;
            this.firstBufferingDurationMs = j3;
            this.bufferingCount = j4;
            this.preparingStreamDurationMs = j5;
            this.adPosition = str;
        }
    }

    public final Map<String, Object> build(TrackingEventType type, String errorType, MultiplexParams multiplexParams, AdParams adParams) {
        return build(type.name().toLowerCase(Locale.ROOT), errorType, multiplexParams, adParams);
    }
}
