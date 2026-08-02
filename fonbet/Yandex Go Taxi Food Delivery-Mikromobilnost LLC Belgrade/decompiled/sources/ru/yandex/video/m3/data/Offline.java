package ru.yandex.video.m3.data;

import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/data/Offline;", "", "()V", "DownloadItem", "DownloadState", "DrmLicense", "TrackKey", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Offline {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003Js\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00063"}, d2 = {"Lru/yandex/video/m3/data/Offline$DownloadItem;", "", "id", "", "mimeType", "manifestUrl", ClidProvider.STATE, "Lru/yandex/video/m3/data/Offline$DownloadState;", "contentLength", "", "bytesDownloaded", "percentDownloaded", "", "startTimeMs", "updateTimeMs", "trackKey", "", "Lru/yandex/video/m3/data/Offline$TrackKey;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/data/Offline$DownloadState;JJFJJLjava/util/List;)V", "getBytesDownloaded", "()J", "getContentLength", "getId", "()Ljava/lang/String;", "getManifestUrl", "getMimeType", "getPercentDownloaded", "()F", "getStartTimeMs", "getState", "()Lru/yandex/video/m3/data/Offline$DownloadState;", "getTrackKey", "()Ljava/util/List;", "getUpdateTimeMs", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DownloadItem {
        public static final int $stable = 8;
        private final long bytesDownloaded;
        private final long contentLength;
        private final String id;
        private final String manifestUrl;
        private final String mimeType;
        private final float percentDownloaded;
        private final long startTimeMs;
        private final DownloadState state;
        private final List<TrackKey> trackKey;
        private final long updateTimeMs;

        public DownloadItem(String str, String str2, String str3, DownloadState downloadState, long j, long j2, float f, long j3, long j4, List<TrackKey> list) {
            this.id = str;
            this.mimeType = str2;
            this.manifestUrl = str3;
            this.state = downloadState;
            this.contentLength = j;
            this.bytesDownloaded = j2;
            this.percentDownloaded = f;
            this.startTimeMs = j3;
            this.updateTimeMs = j4;
            this.trackKey = list;
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final List<TrackKey> component10() {
            return this.trackKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getManifestUrl() {
            return this.manifestUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final DownloadState getState() {
            return this.state;
        }

        /* renamed from: component5, reason: from getter */
        public final long getContentLength() {
            return this.contentLength;
        }

        /* renamed from: component6, reason: from getter */
        public final long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        /* renamed from: component7, reason: from getter */
        public final float getPercentDownloaded() {
            return this.percentDownloaded;
        }

        /* renamed from: component8, reason: from getter */
        public final long getStartTimeMs() {
            return this.startTimeMs;
        }

        /* renamed from: component9, reason: from getter */
        public final long getUpdateTimeMs() {
            return this.updateTimeMs;
        }

        public final DownloadItem copy(String id, String mimeType, String manifestUrl, DownloadState state, long contentLength, long bytesDownloaded, float percentDownloaded, long startTimeMs, long updateTimeMs, List<TrackKey> trackKey) {
            return new DownloadItem(id, mimeType, manifestUrl, state, contentLength, bytesDownloaded, percentDownloaded, startTimeMs, updateTimeMs, trackKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadItem)) {
                return false;
            }
            DownloadItem downloadItem = (DownloadItem) other;
            return jl40.l(this.id, downloadItem.id) && jl40.l(this.mimeType, downloadItem.mimeType) && jl40.l(this.manifestUrl, downloadItem.manifestUrl) && this.state == downloadItem.state && this.contentLength == downloadItem.contentLength && this.bytesDownloaded == downloadItem.bytesDownloaded && Float.compare(this.percentDownloaded, downloadItem.percentDownloaded) == 0 && this.startTimeMs == downloadItem.startTimeMs && this.updateTimeMs == downloadItem.updateTimeMs && jl40.l(this.trackKey, downloadItem.trackKey);
        }

        public final long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        public final long getContentLength() {
            return this.contentLength;
        }

        public final String getId() {
            return this.id;
        }

        public final String getManifestUrl() {
            return this.manifestUrl;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final float getPercentDownloaded() {
            return this.percentDownloaded;
        }

        public final long getStartTimeMs() {
            return this.startTimeMs;
        }

        public final DownloadState getState() {
            return this.state;
        }

        public final List<TrackKey> getTrackKey() {
            return this.trackKey;
        }

        public final long getUpdateTimeMs() {
            return this.updateTimeMs;
        }

        public int hashCode() {
            return this.trackKey.hashCode() + qv10.c(qv10.c(g8e.c(this.percentDownloaded, qv10.c(qv10.c((this.state.hashCode() + unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.mimeType), 31, this.manifestUrl)) * 31, 31, this.contentLength), 31, this.bytesDownloaded), 31), 31, this.startTimeMs), 31, this.updateTimeMs);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DownloadItem(id=");
            sb.append(this.id);
            sb.append(", mimeType=");
            sb.append(this.mimeType);
            sb.append(", manifestUrl=");
            sb.append(this.manifestUrl);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", contentLength=");
            sb.append(this.contentLength);
            sb.append(", bytesDownloaded=");
            sb.append(this.bytesDownloaded);
            sb.append(", percentDownloaded=");
            sb.append(this.percentDownloaded);
            sb.append(", startTimeMs=");
            sb.append(this.startTimeMs);
            sb.append(", updateTimeMs=");
            sb.append(this.updateTimeMs);
            sb.append(", trackKey=");
            return unr0.t(sb, this.trackKey, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/data/Offline$DownloadState;", "", "(Ljava/lang/String;I)V", CA20Status.STATUS_REQUEST_DESCRIPTION_Q, "Stopped", "Downloading", "Completed", "Failed", "Removing", "Restarting", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum DownloadState {
        Queued,
        Stopped,
        Downloading,
        Completed,
        Failed,
        Removing,
        Restarting
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/data/Offline$DrmLicense;", "", "keyId", "", "periodIndex", "", "properties", "", "(Ljava/lang/String;ILjava/util/Map;)V", "getKeyId", "()Ljava/lang/String;", "getPeriodIndex", "()I", "getProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DrmLicense {
        public static final int $stable = 8;
        private final String keyId;
        private final int periodIndex;
        private final Map<String, String> properties;

        public DrmLicense(String str, int i, Map<String, String> map) {
            this.keyId = str;
            this.periodIndex = i;
            this.properties = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DrmLicense copy$default(DrmLicense drmLicense, String str, int i, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = drmLicense.keyId;
            }
            if ((i2 & 2) != 0) {
                i = drmLicense.periodIndex;
            }
            if ((i2 & 4) != 0) {
                map = drmLicense.properties;
            }
            return drmLicense.copy(str, i, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKeyId() {
            return this.keyId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPeriodIndex() {
            return this.periodIndex;
        }

        public final Map<String, String> component3() {
            return this.properties;
        }

        public final DrmLicense copy(String keyId, int periodIndex, Map<String, String> properties) {
            return new DrmLicense(keyId, periodIndex, properties);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrmLicense)) {
                return false;
            }
            DrmLicense drmLicense = (DrmLicense) other;
            return jl40.l(this.keyId, drmLicense.keyId) && this.periodIndex == drmLicense.periodIndex && jl40.l(this.properties, drmLicense.properties);
        }

        public final String getKeyId() {
            return this.keyId;
        }

        public final int getPeriodIndex() {
            return this.periodIndex;
        }

        public final Map<String, String> getProperties() {
            return this.properties;
        }

        public int hashCode() {
            return this.properties.hashCode() + oyr.b(this.periodIndex, this.keyId.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DrmLicense(keyId=");
            sb.append(this.keyId);
            sb.append(", periodIndex=");
            sb.append(this.periodIndex);
            sb.append(", properties=");
            return smw0.n(sb, this.properties, ')');
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/data/Offline$TrackKey;", "", "periodIndex", "", "groupIndex", "trackIndex", "(III)V", "getGroupIndex", "()I", "getPeriodIndex", "getTrackIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TrackKey {
        public static final int $stable = 0;
        private final int groupIndex;
        private final int periodIndex;
        private final int trackIndex;

        public TrackKey(int i, int i2, int i3) {
            this.periodIndex = i;
            this.groupIndex = i2;
            this.trackIndex = i3;
        }

        public static /* synthetic */ TrackKey copy$default(TrackKey trackKey, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = trackKey.periodIndex;
            }
            if ((i4 & 2) != 0) {
                i2 = trackKey.groupIndex;
            }
            if ((i4 & 4) != 0) {
                i3 = trackKey.trackIndex;
            }
            return trackKey.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPeriodIndex() {
            return this.periodIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final int getGroupIndex() {
            return this.groupIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTrackIndex() {
            return this.trackIndex;
        }

        public final TrackKey copy(int periodIndex, int groupIndex, int trackIndex) {
            return new TrackKey(periodIndex, groupIndex, trackIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackKey)) {
                return false;
            }
            TrackKey trackKey = (TrackKey) other;
            return this.periodIndex == trackKey.periodIndex && this.groupIndex == trackKey.groupIndex && this.trackIndex == trackKey.trackIndex;
        }

        public final int getGroupIndex() {
            return this.groupIndex;
        }

        public final int getPeriodIndex() {
            return this.periodIndex;
        }

        public final int getTrackIndex() {
            return this.trackIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.trackIndex) + oyr.b(this.groupIndex, Integer.hashCode(this.periodIndex) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TrackKey(periodIndex=");
            sb.append(this.periodIndex);
            sb.append(", groupIndex=");
            sb.append(this.groupIndex);
            sb.append(", trackIndex=");
            return oyr.s(sb, this.trackIndex, ')');
        }
    }
}
