package ru.yandex.video.m3.ott.data.dto;

import androidx.annotation.Keep;
import com.appsflyer.internal.k;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.eta;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.tlm;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001:\u000f\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott;", "", "()V", "toManifestLoadingError", "Lru/yandex/video/m3/data/exception/ManifestLoadingException;", "Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejection;", "ConcurrencyArbiterConfig", "DeviceType", "DrmRequirement", "MasterPlaylist", "MetadataInfo", "PlayerRestrictionConfig", "Profile", "Stream", "StreamsResponse", "Timing", "TimingsInfo", "TimingsResponse", "TrackingData", "WatchRejection", "WatchRejectionReason", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class Ott {
    public static final int $stable = 0;

    @NotNull
    public static final Ott INSTANCE = new Ott();

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$DeviceType;", "", Constants.KEY_VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "App", "Tv", "Ott", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public enum DeviceType {
        App(3),
        Tv(5),
        Ott(6);

        private final int value;

        DeviceType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$DrmRequirement;", "", "(Ljava/lang/String;I)V", "DrmNotRequired", "DrmRequiredWithFallback", "DrmRequired", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public enum DrmRequirement {
        DrmNotRequired,
        DrmRequiredWithFallback,
        DrmRequired
    }

    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0014HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u008e\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u00142\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u000bHÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006="}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$MasterPlaylist;", "", "parentContentId", "", "sessionId", "streams", "", "Lru/yandex/video/m3/ott/data/dto/Ott$Stream;", "watchProgressPosition", "", "watchProgressPercent", "", "playerRestrictionConfig", "Lru/yandex/video/m3/ott/data/dto/Ott$PlayerRestrictionConfig;", "concurrencyArbiterConfig", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "drmRequirement", "Lru/yandex/video/m3/ott/data/dto/Ott$DrmRequirement;", "restrictionAge", "multiplex", "", "contentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JILru/yandex/video/m3/ott/data/dto/Ott$PlayerRestrictionConfig;Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;Lru/yandex/video/m3/ott/data/dto/Ott$DrmRequirement;Ljava/lang/Integer;ZLjava/lang/String;)V", "getConcurrencyArbiterConfig", "()Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "getContentType", "()Ljava/lang/String;", "getDrmRequirement", "()Lru/yandex/video/m3/ott/data/dto/Ott$DrmRequirement;", "getMultiplex", "()Z", "getParentContentId", "getPlayerRestrictionConfig", "()Lru/yandex/video/m3/ott/data/dto/Ott$PlayerRestrictionConfig;", "getRestrictionAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSessionId", "getStreams", "()Ljava/util/List;", "getWatchProgressPercent", "()I", "getWatchProgressPosition", "()J", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JILru/yandex/video/m3/ott/data/dto/Ott$PlayerRestrictionConfig;Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;Lru/yandex/video/m3/ott/data/dto/Ott$DrmRequirement;Ljava/lang/Integer;ZLjava/lang/String;)Lru/yandex/video/m3/ott/data/dto/Ott$MasterPlaylist;", "equals", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class MasterPlaylist {
        public static final int $stable = 8;
        private final ConcurrencyArbiterConfig concurrencyArbiterConfig;
        private final String contentType;
        private final DrmRequirement drmRequirement;
        private final boolean multiplex;

        @SerializedName("rootUuid")
        private final String parentContentId;
        private final PlayerRestrictionConfig playerRestrictionConfig;
        private final Integer restrictionAge;

        @NotNull
        private final String sessionId;

        @NotNull
        private final List<Stream> streams;
        private final int watchProgressPercent;
        private final long watchProgressPosition;

        public MasterPlaylist(String str, @NotNull String str2, @NotNull List<Stream> list, long j, int i, PlayerRestrictionConfig playerRestrictionConfig, ConcurrencyArbiterConfig concurrencyArbiterConfig, DrmRequirement drmRequirement, Integer num, boolean z, String str3) {
            str2.getClass();
            list.getClass();
            this.parentContentId = str;
            this.sessionId = str2;
            this.streams = list;
            this.watchProgressPosition = j;
            this.watchProgressPercent = i;
            this.playerRestrictionConfig = playerRestrictionConfig;
            this.concurrencyArbiterConfig = concurrencyArbiterConfig;
            this.drmRequirement = drmRequirement;
            this.restrictionAge = num;
            this.multiplex = z;
            this.contentType = str3;
        }

        public static /* synthetic */ MasterPlaylist copy$default(MasterPlaylist masterPlaylist, String str, String str2, List list, long j, int i, PlayerRestrictionConfig playerRestrictionConfig, ConcurrencyArbiterConfig concurrencyArbiterConfig, DrmRequirement drmRequirement, Integer num, boolean z, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = masterPlaylist.parentContentId;
            }
            if ((i2 & 2) != 0) {
                str2 = masterPlaylist.sessionId;
            }
            if ((i2 & 4) != 0) {
                list = masterPlaylist.streams;
            }
            if ((i2 & 8) != 0) {
                j = masterPlaylist.watchProgressPosition;
            }
            if ((i2 & 16) != 0) {
                i = masterPlaylist.watchProgressPercent;
            }
            if ((i2 & 32) != 0) {
                playerRestrictionConfig = masterPlaylist.playerRestrictionConfig;
            }
            if ((i2 & 64) != 0) {
                concurrencyArbiterConfig = masterPlaylist.concurrencyArbiterConfig;
            }
            if ((i2 & 128) != 0) {
                drmRequirement = masterPlaylist.drmRequirement;
            }
            if ((i2 & 256) != 0) {
                num = masterPlaylist.restrictionAge;
            }
            if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                z = masterPlaylist.multiplex;
            }
            if ((i2 & 1024) != 0) {
                str3 = masterPlaylist.contentType;
            }
            boolean z2 = z;
            String str4 = str3;
            Integer num2 = num;
            ConcurrencyArbiterConfig concurrencyArbiterConfig2 = concurrencyArbiterConfig;
            int i3 = i;
            long j2 = j;
            List list2 = list;
            return masterPlaylist.copy(str, str2, list2, j2, i3, playerRestrictionConfig, concurrencyArbiterConfig2, drmRequirement, num2, z2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getParentContentId() {
            return this.parentContentId;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getMultiplex() {
            return this.multiplex;
        }

        /* renamed from: component11, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        @NotNull
        public final List<Stream> component3() {
            return this.streams;
        }

        /* renamed from: component4, reason: from getter */
        public final long getWatchProgressPosition() {
            return this.watchProgressPosition;
        }

        /* renamed from: component5, reason: from getter */
        public final int getWatchProgressPercent() {
            return this.watchProgressPercent;
        }

        /* renamed from: component6, reason: from getter */
        public final PlayerRestrictionConfig getPlayerRestrictionConfig() {
            return this.playerRestrictionConfig;
        }

        /* renamed from: component7, reason: from getter */
        public final ConcurrencyArbiterConfig getConcurrencyArbiterConfig() {
            return this.concurrencyArbiterConfig;
        }

        /* renamed from: component8, reason: from getter */
        public final DrmRequirement getDrmRequirement() {
            return this.drmRequirement;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getRestrictionAge() {
            return this.restrictionAge;
        }

        @NotNull
        public final MasterPlaylist copy(String parentContentId, @NotNull String sessionId, @NotNull List<Stream> streams, long watchProgressPosition, int watchProgressPercent, PlayerRestrictionConfig playerRestrictionConfig, ConcurrencyArbiterConfig concurrencyArbiterConfig, DrmRequirement drmRequirement, Integer restrictionAge, boolean multiplex, String contentType) {
            sessionId.getClass();
            streams.getClass();
            return new MasterPlaylist(parentContentId, sessionId, streams, watchProgressPosition, watchProgressPercent, playerRestrictionConfig, concurrencyArbiterConfig, drmRequirement, restrictionAge, multiplex, contentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MasterPlaylist)) {
                return false;
            }
            MasterPlaylist masterPlaylist = (MasterPlaylist) other;
            return Intrinsics.d(this.parentContentId, masterPlaylist.parentContentId) && Intrinsics.d(this.sessionId, masterPlaylist.sessionId) && Intrinsics.d(this.streams, masterPlaylist.streams) && this.watchProgressPosition == masterPlaylist.watchProgressPosition && this.watchProgressPercent == masterPlaylist.watchProgressPercent && Intrinsics.d(this.playerRestrictionConfig, masterPlaylist.playerRestrictionConfig) && Intrinsics.d(this.concurrencyArbiterConfig, masterPlaylist.concurrencyArbiterConfig) && this.drmRequirement == masterPlaylist.drmRequirement && Intrinsics.d(this.restrictionAge, masterPlaylist.restrictionAge) && this.multiplex == masterPlaylist.multiplex && Intrinsics.d(this.contentType, masterPlaylist.contentType);
        }

        public final ConcurrencyArbiterConfig getConcurrencyArbiterConfig() {
            return this.concurrencyArbiterConfig;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final DrmRequirement getDrmRequirement() {
            return this.drmRequirement;
        }

        public final boolean getMultiplex() {
            return this.multiplex;
        }

        public final String getParentContentId() {
            return this.parentContentId;
        }

        public final PlayerRestrictionConfig getPlayerRestrictionConfig() {
            return this.playerRestrictionConfig;
        }

        public final Integer getRestrictionAge() {
            return this.restrictionAge;
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        @NotNull
        public final List<Stream> getStreams() {
            return this.streams;
        }

        public final int getWatchProgressPercent() {
            return this.watchProgressPercent;
        }

        public final long getWatchProgressPosition() {
            return this.watchProgressPosition;
        }

        public int hashCode() {
            String str = this.parentContentId;
            int a = f1d.a(this.watchProgressPercent, tlm.c(this.watchProgressPosition, k5r.d(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.sessionId), 31, this.streams), 31), 31);
            PlayerRestrictionConfig playerRestrictionConfig = this.playerRestrictionConfig;
            int hashCode = (a + (playerRestrictionConfig == null ? 0 : playerRestrictionConfig.hashCode())) * 31;
            ConcurrencyArbiterConfig concurrencyArbiterConfig = this.concurrencyArbiterConfig;
            int hashCode2 = (hashCode + (concurrencyArbiterConfig == null ? 0 : concurrencyArbiterConfig.hashCode())) * 31;
            DrmRequirement drmRequirement = this.drmRequirement;
            int hashCode3 = (hashCode2 + (drmRequirement == null ? 0 : drmRequirement.hashCode())) * 31;
            Integer num = this.restrictionAge;
            int e = k5r.e((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.multiplex);
            String str2 = this.contentType;
            return e + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MasterPlaylist(parentContentId=");
            sb.append(this.parentContentId);
            sb.append(", sessionId=");
            sb.append(this.sessionId);
            sb.append(", streams=");
            sb.append(this.streams);
            sb.append(", watchProgressPosition=");
            sb.append(this.watchProgressPosition);
            sb.append(", watchProgressPercent=");
            sb.append(this.watchProgressPercent);
            sb.append(", playerRestrictionConfig=");
            sb.append(this.playerRestrictionConfig);
            sb.append(", concurrencyArbiterConfig=");
            sb.append(this.concurrencyArbiterConfig);
            sb.append(", drmRequirement=");
            sb.append(this.drmRequirement);
            sb.append(", restrictionAge=");
            sb.append(this.restrictionAge);
            sb.append(", multiplex=");
            sb.append(this.multiplex);
            sb.append(", contentType=");
            return dfi.i(sb, this.contentType, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$MetadataInfo;", "", "parentContentId", "", "duration", "", "restrictionAge", "", "contentType", "(Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "getDuration", "()J", "getParentContentId", "getRestrictionAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;)Lru/yandex/video/m3/ott/data/dto/Ott$MetadataInfo;", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class MetadataInfo {
        public static final int $stable = 0;
        private final String contentType;
        private final long duration;

        @SerializedName("rootContentId")
        private final String parentContentId;
        private final Integer restrictionAge;

        public MetadataInfo(String str, long j, Integer num, String str2) {
            this.parentContentId = str;
            this.duration = j;
            this.restrictionAge = num;
            this.contentType = str2;
        }

        public static /* synthetic */ MetadataInfo copy$default(MetadataInfo metadataInfo, String str, long j, Integer num, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metadataInfo.parentContentId;
            }
            if ((i & 2) != 0) {
                j = metadataInfo.duration;
            }
            if ((i & 4) != 0) {
                num = metadataInfo.restrictionAge;
            }
            if ((i & 8) != 0) {
                str2 = metadataInfo.contentType;
            }
            return metadataInfo.copy(str, j, num, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getParentContentId() {
            return this.parentContentId;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getRestrictionAge() {
            return this.restrictionAge;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        @NotNull
        public final MetadataInfo copy(String parentContentId, long duration, Integer restrictionAge, String contentType) {
            return new MetadataInfo(parentContentId, duration, restrictionAge, contentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MetadataInfo)) {
                return false;
            }
            MetadataInfo metadataInfo = (MetadataInfo) other;
            return Intrinsics.d(this.parentContentId, metadataInfo.parentContentId) && this.duration == metadataInfo.duration && Intrinsics.d(this.restrictionAge, metadataInfo.restrictionAge) && Intrinsics.d(this.contentType, metadataInfo.contentType);
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final String getParentContentId() {
            return this.parentContentId;
        }

        public final Integer getRestrictionAge() {
            return this.restrictionAge;
        }

        public int hashCode() {
            String str = this.parentContentId;
            int c = tlm.c(this.duration, (str == null ? 0 : str.hashCode()) * 31, 31);
            Integer num = this.restrictionAge;
            int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.contentType;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("MetadataInfo(parentContentId=");
            sb.append(this.parentContentId);
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", restrictionAge=");
            sb.append(this.restrictionAge);
            sb.append(", contentType=");
            return dfi.i(sb, this.contentType, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$PlayerRestrictionConfig;", "", "subtitlesButtonEnable", "", "(Z)V", "getSubtitlesButtonEnable", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class PlayerRestrictionConfig {
        public static final int $stable = 0;
        private final boolean subtitlesButtonEnable;

        public PlayerRestrictionConfig(boolean z) {
            this.subtitlesButtonEnable = z;
        }

        public static /* synthetic */ PlayerRestrictionConfig copy$default(PlayerRestrictionConfig playerRestrictionConfig, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = playerRestrictionConfig.subtitlesButtonEnable;
            }
            return playerRestrictionConfig.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSubtitlesButtonEnable() {
            return this.subtitlesButtonEnable;
        }

        @NotNull
        public final PlayerRestrictionConfig copy(boolean subtitlesButtonEnable) {
            return new PlayerRestrictionConfig(subtitlesButtonEnable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PlayerRestrictionConfig) && this.subtitlesButtonEnable == ((PlayerRestrictionConfig) other).subtitlesButtonEnable;
        }

        public final boolean getSubtitlesButtonEnable() {
            return this.subtitlesButtonEnable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.subtitlesButtonEnable);
        }

        @NotNull
        public String toString() {
            return dfi.j(new StringBuilder("PlayerRestrictionConfig(subtitlesButtonEnable="), this.subtitlesButtonEnable, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$Profile;", "", ConnectableDevice.KEY_ID, "", "hashedId", "(Ljava/lang/String;Ljava/lang/String;)V", "getHashedId", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class Profile {
        public static final int $stable = 0;
        private final String hashedId;

        @NotNull
        private final String id;

        public Profile(@NotNull String str, String str2) {
            str.getClass();
            this.id = str;
            this.hashedId = str2;
        }

        public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = profile.id;
            }
            if ((i & 2) != 0) {
                str2 = profile.hashedId;
            }
            return profile.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHashedId() {
            return this.hashedId;
        }

        @NotNull
        public final Profile copy(@NotNull String id, String hashedId) {
            id.getClass();
            return new Profile(id, hashedId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) other;
            return Intrinsics.d(this.id, profile.id) && Intrinsics.d(this.hashedId, profile.hashedId);
        }

        public final String getHashedId() {
            return this.hashedId;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.hashedId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Profile(id=");
            sb.append(this.id);
            sb.append(", hashedId=");
            return dfi.i(sb, this.hashedId, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$Stream;", "", "uri", "", "drmType", "Lru/yandex/video/m3/ott/data/dto/DrmType;", "streamType", "Lru/yandex/video/m3/data/StreamType;", "drmConfig", "Lru/yandex/video/m3/ott/data/dto/DrmParams;", "trackings", "", "(Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/DrmType;Lru/yandex/video/m3/data/StreamType;Lru/yandex/video/m3/ott/data/dto/DrmParams;Ljava/util/Map;)V", "getDrmConfig", "()Lru/yandex/video/m3/ott/data/dto/DrmParams;", "getDrmType", "()Lru/yandex/video/m3/ott/data/dto/DrmType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "getTrackings", "()Ljava/util/Map;", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class Stream {
        public static final int $stable = 8;
        private final DrmParams drmConfig;
        private final DrmType drmType;
        private final StreamType streamType;
        private final Map<String, Object> trackings;

        @NotNull
        private final String uri;

        public Stream(@NotNull String str, DrmType drmType, StreamType streamType, DrmParams drmParams, Map<String, ? extends Object> map) {
            str.getClass();
            this.uri = str;
            this.drmType = drmType;
            this.streamType = streamType;
            this.drmConfig = drmParams;
            this.trackings = map;
        }

        public static /* synthetic */ Stream copy$default(Stream stream, String str, DrmType drmType, StreamType streamType, DrmParams drmParams, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stream.uri;
            }
            if ((i & 2) != 0) {
                drmType = stream.drmType;
            }
            if ((i & 4) != 0) {
                streamType = stream.streamType;
            }
            if ((i & 8) != 0) {
                drmParams = stream.drmConfig;
            }
            if ((i & 16) != 0) {
                map = stream.trackings;
            }
            Map map2 = map;
            StreamType streamType2 = streamType;
            return stream.copy(str, drmType, streamType2, drmParams, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* renamed from: component2, reason: from getter */
        public final DrmType getDrmType() {
            return this.drmType;
        }

        /* renamed from: component3, reason: from getter */
        public final StreamType getStreamType() {
            return this.streamType;
        }

        /* renamed from: component4, reason: from getter */
        public final DrmParams getDrmConfig() {
            return this.drmConfig;
        }

        public final Map<String, Object> component5() {
            return this.trackings;
        }

        @NotNull
        public final Stream copy(@NotNull String uri, DrmType drmType, StreamType streamType, DrmParams drmConfig, Map<String, ? extends Object> trackings) {
            uri.getClass();
            return new Stream(uri, drmType, streamType, drmConfig, trackings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stream)) {
                return false;
            }
            Stream stream = (Stream) other;
            return Intrinsics.d(this.uri, stream.uri) && this.drmType == stream.drmType && this.streamType == stream.streamType && Intrinsics.d(this.drmConfig, stream.drmConfig) && Intrinsics.d(this.trackings, stream.trackings);
        }

        public final DrmParams getDrmConfig() {
            return this.drmConfig;
        }

        public final DrmType getDrmType() {
            return this.drmType;
        }

        public final StreamType getStreamType() {
            return this.streamType;
        }

        public final Map<String, Object> getTrackings() {
            return this.trackings;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            DrmType drmType = this.drmType;
            int hashCode2 = (hashCode + (drmType == null ? 0 : drmType.hashCode())) * 31;
            StreamType streamType = this.streamType;
            int hashCode3 = (hashCode2 + (streamType == null ? 0 : streamType.hashCode())) * 31;
            DrmParams drmParams = this.drmConfig;
            int hashCode4 = (hashCode3 + (drmParams == null ? 0 : drmParams.hashCode())) * 31;
            Map<String, Object> map = this.trackings;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Stream(uri=");
            sb.append(this.uri);
            sb.append(", drmType=");
            sb.append(this.drmType);
            sb.append(", streamType=");
            sb.append(this.streamType);
            sb.append(", drmConfig=");
            sb.append(this.drmConfig);
            sb.append(", trackings=");
            return k5r.p(sb, this.trackings, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0017Jh\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$StreamsResponse;", "", "playerRestrictionConfig", "Lru/yandex/video/m3/ott/data/dto/Ott$PlayerRestrictionConfig;", "sessionId", "", "streams", "", "Lru/yandex/video/m3/ott/data/dto/Ott$Stream;", "watchingRejection", "Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejection;", "concurrencyArbiterConfig", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "drmRequirement", "Lru/yandex/video/m3/ott/data/dto/Ott$DrmRequirement;", "multiplex", "", "(Lru/yandex/video/m3/ott/data/dto/Ott$PlayerRestrictionConfig;Ljava/lang/String;Ljava/util/List;Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejection;Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;Lru/yandex/video/m3/ott/data/dto/Ott$DrmRequirement;Ljava/lang/Boolean;)V", "getConcurrencyArbiterConfig", "()Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "getDrmRequirement", "()Lru/yandex/video/m3/ott/data/dto/Ott$DrmRequirement;", "getMultiplex", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPlayerRestrictionConfig", "()Lru/yandex/video/m3/ott/data/dto/Ott$PlayerRestrictionConfig;", "getSessionId", "()Ljava/lang/String;", "getStreams", "()Ljava/util/List;", "getWatchingRejection", "()Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejection;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/yandex/video/m3/ott/data/dto/Ott$PlayerRestrictionConfig;Ljava/lang/String;Ljava/util/List;Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejection;Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;Lru/yandex/video/m3/ott/data/dto/Ott$DrmRequirement;Ljava/lang/Boolean;)Lru/yandex/video/m3/ott/data/dto/Ott$StreamsResponse;", "equals", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class StreamsResponse {
        public static final int $stable = 8;
        private final ConcurrencyArbiterConfig concurrencyArbiterConfig;
        private final DrmRequirement drmRequirement;
        private final Boolean multiplex;
        private final PlayerRestrictionConfig playerRestrictionConfig;
        private final String sessionId;
        private final List<Stream> streams;
        private final WatchRejection watchingRejection;

        public StreamsResponse(PlayerRestrictionConfig playerRestrictionConfig, String str, List<Stream> list, WatchRejection watchRejection, ConcurrencyArbiterConfig concurrencyArbiterConfig, DrmRequirement drmRequirement, Boolean bool) {
            this.playerRestrictionConfig = playerRestrictionConfig;
            this.sessionId = str;
            this.streams = list;
            this.watchingRejection = watchRejection;
            this.concurrencyArbiterConfig = concurrencyArbiterConfig;
            this.drmRequirement = drmRequirement;
            this.multiplex = bool;
        }

        public static /* synthetic */ StreamsResponse copy$default(StreamsResponse streamsResponse, PlayerRestrictionConfig playerRestrictionConfig, String str, List list, WatchRejection watchRejection, ConcurrencyArbiterConfig concurrencyArbiterConfig, DrmRequirement drmRequirement, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                playerRestrictionConfig = streamsResponse.playerRestrictionConfig;
            }
            if ((i & 2) != 0) {
                str = streamsResponse.sessionId;
            }
            if ((i & 4) != 0) {
                list = streamsResponse.streams;
            }
            if ((i & 8) != 0) {
                watchRejection = streamsResponse.watchingRejection;
            }
            if ((i & 16) != 0) {
                concurrencyArbiterConfig = streamsResponse.concurrencyArbiterConfig;
            }
            if ((i & 32) != 0) {
                drmRequirement = streamsResponse.drmRequirement;
            }
            if ((i & 64) != 0) {
                bool = streamsResponse.multiplex;
            }
            DrmRequirement drmRequirement2 = drmRequirement;
            Boolean bool2 = bool;
            ConcurrencyArbiterConfig concurrencyArbiterConfig2 = concurrencyArbiterConfig;
            List list2 = list;
            return streamsResponse.copy(playerRestrictionConfig, str, list2, watchRejection, concurrencyArbiterConfig2, drmRequirement2, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final PlayerRestrictionConfig getPlayerRestrictionConfig() {
            return this.playerRestrictionConfig;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public final List<Stream> component3() {
            return this.streams;
        }

        /* renamed from: component4, reason: from getter */
        public final WatchRejection getWatchingRejection() {
            return this.watchingRejection;
        }

        /* renamed from: component5, reason: from getter */
        public final ConcurrencyArbiterConfig getConcurrencyArbiterConfig() {
            return this.concurrencyArbiterConfig;
        }

        /* renamed from: component6, reason: from getter */
        public final DrmRequirement getDrmRequirement() {
            return this.drmRequirement;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getMultiplex() {
            return this.multiplex;
        }

        @NotNull
        public final StreamsResponse copy(PlayerRestrictionConfig playerRestrictionConfig, String sessionId, List<Stream> streams, WatchRejection watchingRejection, ConcurrencyArbiterConfig concurrencyArbiterConfig, DrmRequirement drmRequirement, Boolean multiplex) {
            return new StreamsResponse(playerRestrictionConfig, sessionId, streams, watchingRejection, concurrencyArbiterConfig, drmRequirement, multiplex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StreamsResponse)) {
                return false;
            }
            StreamsResponse streamsResponse = (StreamsResponse) other;
            return Intrinsics.d(this.playerRestrictionConfig, streamsResponse.playerRestrictionConfig) && Intrinsics.d(this.sessionId, streamsResponse.sessionId) && Intrinsics.d(this.streams, streamsResponse.streams) && Intrinsics.d(this.watchingRejection, streamsResponse.watchingRejection) && Intrinsics.d(this.concurrencyArbiterConfig, streamsResponse.concurrencyArbiterConfig) && this.drmRequirement == streamsResponse.drmRequirement && Intrinsics.d(this.multiplex, streamsResponse.multiplex);
        }

        public final ConcurrencyArbiterConfig getConcurrencyArbiterConfig() {
            return this.concurrencyArbiterConfig;
        }

        public final DrmRequirement getDrmRequirement() {
            return this.drmRequirement;
        }

        public final Boolean getMultiplex() {
            return this.multiplex;
        }

        public final PlayerRestrictionConfig getPlayerRestrictionConfig() {
            return this.playerRestrictionConfig;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final List<Stream> getStreams() {
            return this.streams;
        }

        public final WatchRejection getWatchingRejection() {
            return this.watchingRejection;
        }

        public int hashCode() {
            PlayerRestrictionConfig playerRestrictionConfig = this.playerRestrictionConfig;
            int hashCode = (playerRestrictionConfig == null ? 0 : playerRestrictionConfig.hashCode()) * 31;
            String str = this.sessionId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<Stream> list = this.streams;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            WatchRejection watchRejection = this.watchingRejection;
            int hashCode4 = (hashCode3 + (watchRejection == null ? 0 : watchRejection.hashCode())) * 31;
            ConcurrencyArbiterConfig concurrencyArbiterConfig = this.concurrencyArbiterConfig;
            int hashCode5 = (hashCode4 + (concurrencyArbiterConfig == null ? 0 : concurrencyArbiterConfig.hashCode())) * 31;
            DrmRequirement drmRequirement = this.drmRequirement;
            int hashCode6 = (hashCode5 + (drmRequirement == null ? 0 : drmRequirement.hashCode())) * 31;
            Boolean bool = this.multiplex;
            return hashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("StreamsResponse(playerRestrictionConfig=");
            sb.append(this.playerRestrictionConfig);
            sb.append(", sessionId=");
            sb.append(this.sessionId);
            sb.append(", streams=");
            sb.append(this.streams);
            sb.append(", watchingRejection=");
            sb.append(this.watchingRejection);
            sb.append(", concurrencyArbiterConfig=");
            sb.append(this.concurrencyArbiterConfig);
            sb.append(", drmRequirement=");
            sb.append(this.drmRequirement);
            sb.append(", multiplex=");
            return k.p(sb, this.multiplex, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$Timing;", "", "time", "", "(J)V", "getTime", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class Timing {
        public static final int $stable = 0;
        private final long time;

        public Timing(long j) {
            this.time = j;
        }

        public static /* synthetic */ Timing copy$default(Timing timing, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timing.time;
            }
            return timing.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        @NotNull
        public final Timing copy(long time) {
            return new Timing(time);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Timing) && this.time == ((Timing) other).time;
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            return Long.hashCode(this.time);
        }

        @NotNull
        public String toString() {
            return eta.g(new StringBuilder("Timing(time="), this.time, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$TimingsInfo;", "", "profileId", "", "contentGroupUuid", "serialContentGroupUuid", "time", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getContentGroupUuid", "()Ljava/lang/String;", "getProfileId", "getSerialContentGroupUuid", "getTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class TimingsInfo {
        public static final int $stable = 0;

        @NotNull
        private final String contentGroupUuid;

        @NotNull
        private final String profileId;
        private final String serialContentGroupUuid;
        private final long time;

        public TimingsInfo(@NotNull String str, @NotNull String str2, String str3, long j) {
            str.getClass();
            str2.getClass();
            this.profileId = str;
            this.contentGroupUuid = str2;
            this.serialContentGroupUuid = str3;
            this.time = j;
        }

        public static /* synthetic */ TimingsInfo copy$default(TimingsInfo timingsInfo, String str, String str2, String str3, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timingsInfo.profileId;
            }
            if ((i & 2) != 0) {
                str2 = timingsInfo.contentGroupUuid;
            }
            if ((i & 4) != 0) {
                str3 = timingsInfo.serialContentGroupUuid;
            }
            if ((i & 8) != 0) {
                j = timingsInfo.time;
            }
            String str4 = str3;
            return timingsInfo.copy(str, str2, str4, j);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getProfileId() {
            return this.profileId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getContentGroupUuid() {
            return this.contentGroupUuid;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSerialContentGroupUuid() {
            return this.serialContentGroupUuid;
        }

        /* renamed from: component4, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        @NotNull
        public final TimingsInfo copy(@NotNull String profileId, @NotNull String contentGroupUuid, String serialContentGroupUuid, long time) {
            profileId.getClass();
            contentGroupUuid.getClass();
            return new TimingsInfo(profileId, contentGroupUuid, serialContentGroupUuid, time);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimingsInfo)) {
                return false;
            }
            TimingsInfo timingsInfo = (TimingsInfo) other;
            return Intrinsics.d(this.profileId, timingsInfo.profileId) && Intrinsics.d(this.contentGroupUuid, timingsInfo.contentGroupUuid) && Intrinsics.d(this.serialContentGroupUuid, timingsInfo.serialContentGroupUuid) && this.time == timingsInfo.time;
        }

        @NotNull
        public final String getContentGroupUuid() {
            return this.contentGroupUuid;
        }

        @NotNull
        public final String getProfileId() {
            return this.profileId;
        }

        public final String getSerialContentGroupUuid() {
            return this.serialContentGroupUuid;
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            int c = k5r.c(this.profileId.hashCode() * 31, 31, this.contentGroupUuid);
            String str = this.serialContentGroupUuid;
            return Long.hashCode(this.time) + ((c + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("TimingsInfo(profileId=");
            sb.append(this.profileId);
            sb.append(", contentGroupUuid=");
            sb.append(this.contentGroupUuid);
            sb.append(", serialContentGroupUuid=");
            sb.append(this.serialContentGroupUuid);
            sb.append(", time=");
            return eta.g(sb, this.time, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$TimingsResponse;", "", "timings", "", "Lru/yandex/video/m3/ott/data/dto/Ott$Timing;", "(Ljava/util/List;)V", "getTimings", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class TimingsResponse {
        public static final int $stable = 8;

        @NotNull
        private final List<Timing> timings;

        public TimingsResponse(@NotNull List<Timing> list) {
            list.getClass();
            this.timings = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimingsResponse copy$default(TimingsResponse timingsResponse, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = timingsResponse.timings;
            }
            return timingsResponse.copy(list);
        }

        @NotNull
        public final List<Timing> component1() {
            return this.timings;
        }

        @NotNull
        public final TimingsResponse copy(@NotNull List<Timing> timings) {
            timings.getClass();
            return new TimingsResponse(timings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TimingsResponse) && Intrinsics.d(this.timings, ((TimingsResponse) other).timings);
        }

        @NotNull
        public final List<Timing> getTimings() {
            return this.timings;
        }

        public int hashCode() {
            return this.timings.hashCode();
        }

        @NotNull
        public String toString() {
            return eta.h(new StringBuilder("TimingsResponse(timings="), this.timings, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003J[\u0010\u001e\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "", "trackings", "", "", "Lru/yandex/video/m3/ott/data/dto/OttTrackingEvent;", "downloaded", "", "fromBlock", "sid", "kpId", SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE, "Lru/yandex/video/m3/ott/data/dto/Ott$DeviceType;", "(Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/Ott$DeviceType;)V", "getDeviceType", "()Lru/yandex/video/m3/ott/data/dto/Ott$DeviceType;", "getDownloaded", "()Z", "getFromBlock", "()Ljava/lang/String;", "getKpId", "getSid", "getTrackings", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class TrackingData {
        public static final int $stable = 8;

        @NotNull
        private final DeviceType deviceType;
        private final boolean downloaded;
        private final String fromBlock;
        private final String kpId;
        private final String sid;

        @NotNull
        private final Map<String, Object> trackings;

        public TrackingData(@NotNull Map<String, ? extends Object> map, boolean z, String str, String str2, String str3, @NotNull DeviceType deviceType) {
            map.getClass();
            deviceType.getClass();
            this.trackings = map;
            this.downloaded = z;
            this.fromBlock = str;
            this.sid = str2;
            this.kpId = str3;
            this.deviceType = deviceType;
        }

        public static /* synthetic */ TrackingData copy$default(TrackingData trackingData, Map map, boolean z, String str, String str2, String str3, DeviceType deviceType, int i, Object obj) {
            if ((i & 1) != 0) {
                map = trackingData.trackings;
            }
            if ((i & 2) != 0) {
                z = trackingData.downloaded;
            }
            if ((i & 4) != 0) {
                str = trackingData.fromBlock;
            }
            if ((i & 8) != 0) {
                str2 = trackingData.sid;
            }
            if ((i & 16) != 0) {
                str3 = trackingData.kpId;
            }
            if ((i & 32) != 0) {
                deviceType = trackingData.deviceType;
            }
            String str4 = str3;
            DeviceType deviceType2 = deviceType;
            return trackingData.copy(map, z, str, str2, str4, deviceType2);
        }

        @NotNull
        public final Map<String, Object> component1() {
            return this.trackings;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDownloaded() {
            return this.downloaded;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFromBlock() {
            return this.fromBlock;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSid() {
            return this.sid;
        }

        /* renamed from: component5, reason: from getter */
        public final String getKpId() {
            return this.kpId;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final DeviceType getDeviceType() {
            return this.deviceType;
        }

        @NotNull
        public final TrackingData copy(@NotNull Map<String, ? extends Object> trackings, boolean downloaded, String fromBlock, String sid, String kpId, @NotNull DeviceType deviceType) {
            trackings.getClass();
            deviceType.getClass();
            return new TrackingData(trackings, downloaded, fromBlock, sid, kpId, deviceType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingData)) {
                return false;
            }
            TrackingData trackingData = (TrackingData) other;
            return Intrinsics.d(this.trackings, trackingData.trackings) && this.downloaded == trackingData.downloaded && Intrinsics.d(this.fromBlock, trackingData.fromBlock) && Intrinsics.d(this.sid, trackingData.sid) && Intrinsics.d(this.kpId, trackingData.kpId) && this.deviceType == trackingData.deviceType;
        }

        @NotNull
        public final DeviceType getDeviceType() {
            return this.deviceType;
        }

        public final boolean getDownloaded() {
            return this.downloaded;
        }

        public final String getFromBlock() {
            return this.fromBlock;
        }

        public final String getKpId() {
            return this.kpId;
        }

        public final String getSid() {
            return this.sid;
        }

        @NotNull
        public final Map<String, Object> getTrackings() {
            return this.trackings;
        }

        public int hashCode() {
            int e = k5r.e(this.trackings.hashCode() * 31, 31, this.downloaded);
            String str = this.fromBlock;
            int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sid;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.kpId;
            return this.deviceType.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "TrackingData(trackings=" + this.trackings + ", downloaded=" + this.downloaded + ", fromBlock=" + this.fromBlock + ", sid=" + this.sid + ", kpId=" + this.kpId + ", deviceType=" + this.deviceType + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejection;", "", "reason", "Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejectionReason;", "details", "", "(Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejectionReason;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "getReason", "()Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejectionReason;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class WatchRejection {
        public static final int $stable = 0;
        private final String details;

        @NotNull
        private final WatchRejectionReason reason;

        public WatchRejection(@NotNull WatchRejectionReason watchRejectionReason, String str) {
            watchRejectionReason.getClass();
            this.reason = watchRejectionReason;
            this.details = str;
        }

        public static /* synthetic */ WatchRejection copy$default(WatchRejection watchRejection, WatchRejectionReason watchRejectionReason, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                watchRejectionReason = watchRejection.reason;
            }
            if ((i & 2) != 0) {
                str = watchRejection.details;
            }
            return watchRejection.copy(watchRejectionReason, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final WatchRejectionReason getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        @NotNull
        public final WatchRejection copy(@NotNull WatchRejectionReason reason, String details) {
            reason.getClass();
            return new WatchRejection(reason, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WatchRejection)) {
                return false;
            }
            WatchRejection watchRejection = (WatchRejection) other;
            return this.reason == watchRejection.reason && Intrinsics.d(this.details, watchRejection.details);
        }

        public final String getDetails() {
            return this.details;
        }

        @NotNull
        public final WatchRejectionReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.details;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("WatchRejection(reason=");
            sb.append(this.reason);
            sb.append(", details=");
            return dfi.i(sb, this.details, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$WatchRejectionReason;", "", "(Ljava/lang/String;I)V", "PurchaseNotFound", "PurchaseExpired", "SubscriptionNotFound", "GeoConstraintViolation", "LicensesNotFound", "ServiceConstraintViolation", "ProductConstraintViolation", "MonetizationModelConstraintViolation", "AuthTokenSignatureFailed", "SupportedStreamsNotFound", "StreamsNotFound", "ContentNotFound", "IntersectionBetweenLicenseAndStreamsNotFound", "WrongSubscription", "LicenseTypesNotAvailable", "WatchableConstraintViolation", "Unexplainable", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public enum WatchRejectionReason {
        PurchaseNotFound,
        PurchaseExpired,
        SubscriptionNotFound,
        GeoConstraintViolation,
        LicensesNotFound,
        ServiceConstraintViolation,
        ProductConstraintViolation,
        MonetizationModelConstraintViolation,
        AuthTokenSignatureFailed,
        SupportedStreamsNotFound,
        StreamsNotFound,
        ContentNotFound,
        IntersectionBetweenLicenseAndStreamsNotFound,
        WrongSubscription,
        LicenseTypesNotAvailable,
        WatchableConstraintViolation,
        Unexplainable
    }

    private Ott() {
    }

    @NotNull
    public final ManifestLoadingException toManifestLoadingError(@NotNull WatchRejection watchRejection) {
        watchRejection.getClass();
        switch (a.a[watchRejection.getReason().ordinal()]) {
            case 1:
                return new ManifestLoadingException.PurchaseNotFoundError(null, watchRejection.getDetails(), 1, null);
            case 2:
                return new ManifestLoadingException.PurchaseExpiredError(null, watchRejection.getDetails(), 1, null);
            case 3:
                return new ManifestLoadingException.SubscriptionNotFoundError(null, watchRejection.getDetails(), 1, null);
            case 4:
                return new ManifestLoadingException.GeoConstraintViolationError(null, watchRejection.getDetails(), 1, null);
            case 5:
                return new ManifestLoadingException.LicensesNotFoundError(null, watchRejection.getDetails(), 1, null);
            case 6:
                return new ManifestLoadingException.LicenseTypesNotAvailable(null, watchRejection.getDetails(), 1, null);
            case 7:
                return new ManifestLoadingException.ServiceConstraintViolationError(null, watchRejection.getDetails(), 1, null);
            case 8:
            case 9:
            case 10:
                return new ManifestLoadingException.SupportedStreamsNotFoundError(null, watchRejection.getDetails(), 1, null);
            case 11:
                return new ManifestLoadingException.ProductConstraintViolationError(null, watchRejection.getDetails(), 1, null);
            case 12:
                return new ManifestLoadingException.MonetizationModelConstraintViolationError(null, watchRejection.getDetails(), 1, null);
            case 13:
                return new ManifestLoadingException.WrongSubscription(null, watchRejection.getDetails(), 1, null);
            case 14:
                return new ManifestLoadingException.Forbidden(null, watchRejection.getDetails(), 1, null);
            case 15:
                return new ManifestLoadingException.NotFound(null, watchRejection.getDetails(), 1, null);
            case 16:
                return new ManifestLoadingException.WatchableConstraintViolation(null, watchRejection.getDetails(), 1, null);
            case 17:
                return new ManifestLoadingException.UnknownError(null, watchRejection.getDetails(), 1, null);
            default:
                b6e.s();
                return null;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "", "server", "", "requestParams", "", "handleArbiterErrors", "", "(Ljava/lang/String;Ljava/util/Map;Z)V", "getHandleArbiterErrors", "()Z", "getRequestParams", "()Ljava/util/Map;", "getServer", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class ConcurrencyArbiterConfig {
        public static final int $stable = 8;
        private final boolean handleArbiterErrors;
        private final Map<String, Object> requestParams;

        @NotNull
        private final String server;

        public ConcurrencyArbiterConfig(@NotNull String str, Map<String, ? extends Object> map, boolean z) {
            str.getClass();
            this.server = str;
            this.requestParams = map;
            this.handleArbiterErrors = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConcurrencyArbiterConfig copy$default(ConcurrencyArbiterConfig concurrencyArbiterConfig, String str, Map map, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = concurrencyArbiterConfig.server;
            }
            if ((i & 2) != 0) {
                map = concurrencyArbiterConfig.requestParams;
            }
            if ((i & 4) != 0) {
                z = concurrencyArbiterConfig.handleArbiterErrors;
            }
            return concurrencyArbiterConfig.copy(str, map, z);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getServer() {
            return this.server;
        }

        public final Map<String, Object> component2() {
            return this.requestParams;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHandleArbiterErrors() {
            return this.handleArbiterErrors;
        }

        @NotNull
        public final ConcurrencyArbiterConfig copy(@NotNull String server, Map<String, ? extends Object> requestParams, boolean handleArbiterErrors) {
            server.getClass();
            return new ConcurrencyArbiterConfig(server, requestParams, handleArbiterErrors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConcurrencyArbiterConfig)) {
                return false;
            }
            ConcurrencyArbiterConfig concurrencyArbiterConfig = (ConcurrencyArbiterConfig) other;
            return Intrinsics.d(this.server, concurrencyArbiterConfig.server) && Intrinsics.d(this.requestParams, concurrencyArbiterConfig.requestParams) && this.handleArbiterErrors == concurrencyArbiterConfig.handleArbiterErrors;
        }

        public final boolean getHandleArbiterErrors() {
            return this.handleArbiterErrors;
        }

        public final Map<String, Object> getRequestParams() {
            return this.requestParams;
        }

        @NotNull
        public final String getServer() {
            return this.server;
        }

        public int hashCode() {
            int hashCode = this.server.hashCode() * 31;
            Map<String, Object> map = this.requestParams;
            return Boolean.hashCode(this.handleArbiterErrors) + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ConcurrencyArbiterConfig(server=");
            sb.append(this.server);
            sb.append(", requestParams=");
            sb.append(this.requestParams);
            sb.append(", handleArbiterErrors=");
            return dfi.j(sb, this.handleArbiterErrors, ')');
        }

        public /* synthetic */ ConcurrencyArbiterConfig(String str, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, map, (i & 4) != 0 ? false : z);
        }
    }
}
