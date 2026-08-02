package ru.yandex.video.m3.ott.data.dto;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.dfi;
import defpackage.tlm;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.StreamType;

@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/ExtendedVh;", "", "()V", "ActualEpisode", "Content", "DrmParamsWithFreeMap", "ExtendedVhResponse", "Stream", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ExtendedVh {
    public static final int $stable = 0;

    @NotNull
    public static final ExtendedVh INSTANCE = new ExtendedVh();

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u00107\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012HÆ\u0003JÀ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\n\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR*\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001b¨\u0006?"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/ExtendedVh$Content;", "", "contentId", "", "contentUrl", "streams", "", "Lru/yandex/video/m3/ott/data/dto/ExtendedVh$Stream;", "actualEpisode", "Lru/yandex/video/m3/ott/data/dto/ExtendedVh$ActualEpisode;", "isUgcLive", "", "isUgcLiveStatus", "viewers", "", "xivaSubscriptionId", "ottParams", "", "Lru/yandex/video/m3/ott/data/dto/OttTrackingEvent;", "firstFrameUrl", "firstFrameHash", "title", "thumbnail", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/yandex/video/m3/ott/data/dto/ExtendedVh$ActualEpisode;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActualEpisode", "()Lru/yandex/video/m3/ott/data/dto/ExtendedVh$ActualEpisode;", "getContentId", "()Ljava/lang/String;", "getContentUrl", "getFirstFrameHash", "getFirstFrameUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOttParams", "()Ljava/util/Map;", "getStreams", "()Ljava/util/List;", "getThumbnail", "getTitle", "getViewers", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getXivaSubscriptionId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/yandex/video/m3/ott/data/dto/ExtendedVh$ActualEpisode;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/yandex/video/m3/ott/data/dto/ExtendedVh$Content;", "equals", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class Content {
        public static final int $stable = 8;

        @SerializedName("actual_episode")
        private final ActualEpisode actualEpisode;

        @SerializedName("content_id")
        @NotNull
        private final String contentId;

        @SerializedName("content_url")
        private final String contentUrl;

        @SerializedName("first_frame_hash")
        private final String firstFrameHash;

        @SerializedName("first_frame_url")
        private final String firstFrameUrl;

        @SerializedName("ugc_live")
        private final Boolean isUgcLive;

        @SerializedName("ugc_live_status")
        private final String isUgcLiveStatus;

        @SerializedName("ottParams")
        private final Map<String, Object> ottParams;
        private final List<Stream> streams;

        @SerializedName("thumbnail")
        private final String thumbnail;

        @SerializedName("title")
        private final String title;

        @SerializedName("viewers")
        private final Long viewers;

        @SerializedName("xiva_id")
        private final String xivaSubscriptionId;

        public /* synthetic */ Content(String str, String str2, List list, ActualEpisode actualEpisode, Boolean bool, String str3, Long l, String str4, Map map, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : actualEpisode, bool, str3, (i & 64) != 0 ? null : l, str4, map, (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8);
        }

        public static /* synthetic */ Content copy$default(Content content, String str, String str2, List list, ActualEpisode actualEpisode, Boolean bool, String str3, Long l, String str4, Map map, String str5, String str6, String str7, String str8, int i, Object obj) {
            if ((i & 1) != 0) {
                str = content.contentId;
            }
            return content.copy(str, (i & 2) != 0 ? content.contentUrl : str2, (i & 4) != 0 ? content.streams : list, (i & 8) != 0 ? content.actualEpisode : actualEpisode, (i & 16) != 0 ? content.isUgcLive : bool, (i & 32) != 0 ? content.isUgcLiveStatus : str3, (i & 64) != 0 ? content.viewers : l, (i & 128) != 0 ? content.xivaSubscriptionId : str4, (i & 256) != 0 ? content.ottParams : map, (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? content.firstFrameUrl : str5, (i & 1024) != 0 ? content.firstFrameHash : str6, (i & 2048) != 0 ? content.title : str7, (i & 4096) != 0 ? content.thumbnail : str8);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getContentId() {
            return this.contentId;
        }

        /* renamed from: component10, reason: from getter */
        public final String getFirstFrameUrl() {
            return this.firstFrameUrl;
        }

        /* renamed from: component11, reason: from getter */
        public final String getFirstFrameHash() {
            return this.firstFrameHash;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component13, reason: from getter */
        public final String getThumbnail() {
            return this.thumbnail;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContentUrl() {
            return this.contentUrl;
        }

        public final List<Stream> component3() {
            return this.streams;
        }

        /* renamed from: component4, reason: from getter */
        public final ActualEpisode getActualEpisode() {
            return this.actualEpisode;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIsUgcLive() {
            return this.isUgcLive;
        }

        /* renamed from: component6, reason: from getter */
        public final String getIsUgcLiveStatus() {
            return this.isUgcLiveStatus;
        }

        /* renamed from: component7, reason: from getter */
        public final Long getViewers() {
            return this.viewers;
        }

        /* renamed from: component8, reason: from getter */
        public final String getXivaSubscriptionId() {
            return this.xivaSubscriptionId;
        }

        public final Map<String, Object> component9() {
            return this.ottParams;
        }

        @NotNull
        public final Content copy(@NotNull String contentId, String contentUrl, List<Stream> streams, ActualEpisode actualEpisode, Boolean isUgcLive, String isUgcLiveStatus, Long viewers, String xivaSubscriptionId, Map<String, ? extends Object> ottParams, String firstFrameUrl, String firstFrameHash, String title, String thumbnail) {
            contentId.getClass();
            return new Content(contentId, contentUrl, streams, actualEpisode, isUgcLive, isUgcLiveStatus, viewers, xivaSubscriptionId, ottParams, firstFrameUrl, firstFrameHash, title, thumbnail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.contentId, content.contentId) && Intrinsics.d(this.contentUrl, content.contentUrl) && Intrinsics.d(this.streams, content.streams) && Intrinsics.d(this.actualEpisode, content.actualEpisode) && Intrinsics.d(this.isUgcLive, content.isUgcLive) && Intrinsics.d(this.isUgcLiveStatus, content.isUgcLiveStatus) && Intrinsics.d(this.viewers, content.viewers) && Intrinsics.d(this.xivaSubscriptionId, content.xivaSubscriptionId) && Intrinsics.d(this.ottParams, content.ottParams) && Intrinsics.d(this.firstFrameUrl, content.firstFrameUrl) && Intrinsics.d(this.firstFrameHash, content.firstFrameHash) && Intrinsics.d(this.title, content.title) && Intrinsics.d(this.thumbnail, content.thumbnail);
        }

        public final ActualEpisode getActualEpisode() {
            return this.actualEpisode;
        }

        @NotNull
        public final String getContentId() {
            return this.contentId;
        }

        public final String getContentUrl() {
            return this.contentUrl;
        }

        public final String getFirstFrameHash() {
            return this.firstFrameHash;
        }

        public final String getFirstFrameUrl() {
            return this.firstFrameUrl;
        }

        public final Map<String, Object> getOttParams() {
            return this.ottParams;
        }

        public final List<Stream> getStreams() {
            return this.streams;
        }

        public final String getThumbnail() {
            return this.thumbnail;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Long getViewers() {
            return this.viewers;
        }

        public final String getXivaSubscriptionId() {
            return this.xivaSubscriptionId;
        }

        public int hashCode() {
            int hashCode = this.contentId.hashCode() * 31;
            String str = this.contentUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<Stream> list = this.streams;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            ActualEpisode actualEpisode = this.actualEpisode;
            int hashCode4 = (hashCode3 + (actualEpisode == null ? 0 : actualEpisode.hashCode())) * 31;
            Boolean bool = this.isUgcLive;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.isUgcLiveStatus;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.viewers;
            int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
            String str3 = this.xivaSubscriptionId;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, Object> map = this.ottParams;
            int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
            String str4 = this.firstFrameUrl;
            int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.firstFrameHash;
            int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.title;
            int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.thumbnail;
            return hashCode12 + (str7 != null ? str7.hashCode() : 0);
        }

        public final Boolean isUgcLive() {
            return this.isUgcLive;
        }

        public final String isUgcLiveStatus() {
            return this.isUgcLiveStatus;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Content(contentId=");
            sb.append(this.contentId);
            sb.append(", contentUrl=");
            sb.append(this.contentUrl);
            sb.append(", streams=");
            sb.append(this.streams);
            sb.append(", actualEpisode=");
            sb.append(this.actualEpisode);
            sb.append(", isUgcLive=");
            sb.append(this.isUgcLive);
            sb.append(", isUgcLiveStatus=");
            sb.append(this.isUgcLiveStatus);
            sb.append(", viewers=");
            sb.append(this.viewers);
            sb.append(", xivaSubscriptionId=");
            sb.append(this.xivaSubscriptionId);
            sb.append(", ottParams=");
            sb.append(this.ottParams);
            sb.append(", firstFrameUrl=");
            sb.append(this.firstFrameUrl);
            sb.append(", firstFrameHash=");
            sb.append(this.firstFrameHash);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", thumbnail=");
            return dfi.i(sb, this.thumbnail, ')');
        }

        public Content(@NotNull String str, String str2, List<Stream> list, ActualEpisode actualEpisode, Boolean bool, String str3, Long l, String str4, Map<String, ? extends Object> map, String str5, String str6, String str7, String str8) {
            str.getClass();
            this.contentId = str;
            this.contentUrl = str2;
            this.streams = list;
            this.actualEpisode = actualEpisode;
            this.isUgcLive = bool;
            this.isUgcLiveStatus = str3;
            this.viewers = l;
            this.xivaSubscriptionId = str4;
            this.ottParams = map;
            this.firstFrameUrl = str5;
            this.firstFrameHash = str6;
            this.title = str7;
            this.thumbnail = str8;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR(\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/ExtendedVh$DrmParamsWithFreeMap;", "", "requestParams", "", "", "servers", "Lru/yandex/video/m3/ott/data/dto/DrmServers;", "advanced", "Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;", "(Ljava/util/Map;Lru/yandex/video/m3/ott/data/dto/DrmServers;Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;)V", "getAdvanced", "()Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;", "getRequestParams", "()Ljava/util/Map;", "setRequestParams", "(Ljava/util/Map;)V", "getServers", "()Lru/yandex/video/m3/ott/data/dto/DrmServers;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class DrmParamsWithFreeMap {
        public static final int $stable = 8;
        private final DrmAdvanced advanced;
        private Map<String, String> requestParams;
        private final DrmServers servers;

        public DrmParamsWithFreeMap(Map<String, String> map, DrmServers drmServers, DrmAdvanced drmAdvanced) {
            this.requestParams = map;
            this.servers = drmServers;
            this.advanced = drmAdvanced;
        }

        public final DrmAdvanced getAdvanced() {
            return this.advanced;
        }

        public final Map<String, String> getRequestParams() {
            return this.requestParams;
        }

        public final DrmServers getServers() {
            return this.servers;
        }

        public final void setRequestParams(Map<String, String> map) {
            this.requestParams = map;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/ExtendedVh$Stream;", "", "streamType", "Lru/yandex/video/m3/data/StreamType;", "url", "", "drmConfig", "Lru/yandex/video/m3/ott/data/dto/ExtendedVh$DrmParamsWithFreeMap;", "(Lru/yandex/video/m3/data/StreamType;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/ExtendedVh$DrmParamsWithFreeMap;)V", "getDrmConfig", "()Lru/yandex/video/m3/ott/data/dto/ExtendedVh$DrmParamsWithFreeMap;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class Stream {
        public static final int $stable = 8;
        private final DrmParamsWithFreeMap drmConfig;

        @SerializedName("stream_type")
        private final StreamType streamType;
        private final String url;

        public Stream(StreamType streamType, String str, DrmParamsWithFreeMap drmParamsWithFreeMap) {
            this.streamType = streamType;
            this.url = str;
            this.drmConfig = drmParamsWithFreeMap;
        }

        public static /* synthetic */ Stream copy$default(Stream stream, StreamType streamType, String str, DrmParamsWithFreeMap drmParamsWithFreeMap, int i, Object obj) {
            if ((i & 1) != 0) {
                streamType = stream.streamType;
            }
            if ((i & 2) != 0) {
                str = stream.url;
            }
            if ((i & 4) != 0) {
                drmParamsWithFreeMap = stream.drmConfig;
            }
            return stream.copy(streamType, str, drmParamsWithFreeMap);
        }

        /* renamed from: component1, reason: from getter */
        public final StreamType getStreamType() {
            return this.streamType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component3, reason: from getter */
        public final DrmParamsWithFreeMap getDrmConfig() {
            return this.drmConfig;
        }

        @NotNull
        public final Stream copy(StreamType streamType, String url, DrmParamsWithFreeMap drmConfig) {
            return new Stream(streamType, url, drmConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stream)) {
                return false;
            }
            Stream stream = (Stream) other;
            return this.streamType == stream.streamType && Intrinsics.d(this.url, stream.url) && Intrinsics.d(this.drmConfig, stream.drmConfig);
        }

        public final DrmParamsWithFreeMap getDrmConfig() {
            return this.drmConfig;
        }

        public final StreamType getStreamType() {
            return this.streamType;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            StreamType streamType = this.streamType;
            int hashCode = (streamType == null ? 0 : streamType.hashCode()) * 31;
            String str = this.url;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DrmParamsWithFreeMap drmParamsWithFreeMap = this.drmConfig;
            return hashCode2 + (drmParamsWithFreeMap != null ? drmParamsWithFreeMap.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Stream(streamType=" + this.streamType + ", url=" + this.url + ", drmConfig=" + this.drmConfig + ')';
        }
    }

    private ExtendedVh() {
    }

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\tJ,\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/ExtendedVh$ActualEpisode;", "", "streams", "", "Lru/yandex/video/m3/ott/data/dto/ExtendedVh$Stream;", "startPosition", "", "(Ljava/util/List;Ljava/lang/Long;)V", "getStartPosition", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStreams", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Long;)Lru/yandex/video/m3/ott/data/dto/ExtendedVh$ActualEpisode;", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class ActualEpisode {
        public static final int $stable = 8;

        @SerializedName("start_position")
        private final Long startPosition;
        private final List<Stream> streams;

        public /* synthetic */ ActualEpisode(List list, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActualEpisode copy$default(ActualEpisode actualEpisode, List list, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                list = actualEpisode.streams;
            }
            if ((i & 2) != 0) {
                l = actualEpisode.startPosition;
            }
            return actualEpisode.copy(list, l);
        }

        public final List<Stream> component1() {
            return this.streams;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getStartPosition() {
            return this.startPosition;
        }

        @NotNull
        public final ActualEpisode copy(List<Stream> streams, Long startPosition) {
            return new ActualEpisode(streams, startPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActualEpisode)) {
                return false;
            }
            ActualEpisode actualEpisode = (ActualEpisode) other;
            return Intrinsics.d(this.streams, actualEpisode.streams) && Intrinsics.d(this.startPosition, actualEpisode.startPosition);
        }

        public final Long getStartPosition() {
            return this.startPosition;
        }

        public final List<Stream> getStreams() {
            return this.streams;
        }

        public int hashCode() {
            List<Stream> list = this.streams;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Long l = this.startPosition;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ActualEpisode(streams=");
            sb.append(this.streams);
            sb.append(", startPosition=");
            return tlm.k(sb, this.startPosition, ')');
        }

        public ActualEpisode(List<Stream> list, Long l) {
            this.streams = list;
            this.startPosition = l;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ActualEpisode() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/ExtendedVh$ExtendedVhResponse;", "", "content", "Lru/yandex/video/m3/ott/data/dto/ExtendedVh$Content;", "error", "", "error_cause", "(Lru/yandex/video/m3/ott/data/dto/ExtendedVh$Content;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Lru/yandex/video/m3/ott/data/dto/ExtendedVh$Content;", "getError", "()Ljava/lang/String;", "getError_cause", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class ExtendedVhResponse {
        public static final int $stable = 8;

        @NotNull
        private final Content content;
        private final String error;
        private final String error_cause;

        public /* synthetic */ ExtendedVhResponse(Content content, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(content, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public static /* synthetic */ ExtendedVhResponse copy$default(ExtendedVhResponse extendedVhResponse, Content content, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                content = extendedVhResponse.content;
            }
            if ((i & 2) != 0) {
                str = extendedVhResponse.error;
            }
            if ((i & 4) != 0) {
                str2 = extendedVhResponse.error_cause;
            }
            return extendedVhResponse.copy(content, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Content getContent() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: component3, reason: from getter */
        public final String getError_cause() {
            return this.error_cause;
        }

        @NotNull
        public final ExtendedVhResponse copy(@NotNull Content content, String error, String error_cause) {
            content.getClass();
            return new ExtendedVhResponse(content, error, error_cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtendedVhResponse)) {
                return false;
            }
            ExtendedVhResponse extendedVhResponse = (ExtendedVhResponse) other;
            return Intrinsics.d(this.content, extendedVhResponse.content) && Intrinsics.d(this.error, extendedVhResponse.error) && Intrinsics.d(this.error_cause, extendedVhResponse.error_cause);
        }

        @NotNull
        public final Content getContent() {
            return this.content;
        }

        public final String getError() {
            return this.error;
        }

        public final String getError_cause() {
            return this.error_cause;
        }

        public int hashCode() {
            int hashCode = this.content.hashCode() * 31;
            String str = this.error;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.error_cause;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ExtendedVhResponse(content=");
            sb.append(this.content);
            sb.append(", error=");
            sb.append(this.error);
            sb.append(", error_cause=");
            return dfi.i(sb, this.error_cause, ')');
        }

        public ExtendedVhResponse(@NotNull Content content, String str, String str2) {
            content.getClass();
            this.content = content;
            this.error = str;
            this.error_cause = str2;
        }
    }
}
