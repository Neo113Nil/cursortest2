package ru.yandex.video.m3.preload_manager;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.ysq0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.preload_manager.DownloadResult;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001'B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b\n\u0010&R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b\u000b\u0010&¨\u0006("}, d2 = {"Lru/yandex/video/m3/preload_manager/DownloadResult;", "", "", "downloadId", "contentType", "", "bytesDownloaded", "Lru/yandex/video/m3/preload_manager/QualityInfo;", "downloadedQuality", "", "isCompleted", "isCanceled", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLru/yandex/video/m3/preload_manager/QualityInfo;ZZ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/preload_manager/DownloadResult$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/preload_manager/DownloadResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getDownloadId", "getContentType", "J", "getBytesDownloaded", "()J", "Lru/yandex/video/m3/preload_manager/QualityInfo;", "getDownloadedQuality", "()Lru/yandex/video/m3/preload_manager/QualityInfo;", "Z", "()Z", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloadResult {
    public static final int $stable = 0;

    @ysq0("bytes")
    private final long bytesDownloaded;

    @ysq0("type")
    private final String contentType;

    @ysq0("id")
    private final String downloadId;

    @ysq0("quality")
    private final QualityInfo downloadedQuality;

    @ysq0("canceled")
    private final boolean isCanceled;

    @ysq0("completed")
    private final boolean isCompleted;

    private DownloadResult(String str, String str2, long j, QualityInfo qualityInfo, boolean z, boolean z2) {
        this.downloadId = str;
        this.contentType = str2;
        this.bytesDownloaded = j;
        this.downloadedQuality = qualityInfo;
        this.isCompleted = z;
        this.isCanceled = z2;
    }

    public static /* synthetic */ DownloadResult copy$default(DownloadResult downloadResult, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.preload_manager.DownloadResult$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DownloadResult.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DownloadResult.Builder builder) {
                }
            };
        }
        return downloadResult.copy(tlsVar);
    }

    public final DownloadResult copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DownloadResult.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DownloadResult downloadResult = (DownloadResult) other;
        return this.bytesDownloaded == downloadResult.bytesDownloaded && this.isCompleted == downloadResult.isCompleted && this.isCanceled == downloadResult.isCanceled && jl40.l(this.downloadId, downloadResult.downloadId) && jl40.l(this.contentType, downloadResult.contentType) && jl40.l(this.downloadedQuality, downloadResult.downloadedQuality);
    }

    public final long getBytesDownloaded() {
        return this.bytesDownloaded;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getDownloadId() {
        return this.downloadId;
    }

    public final QualityInfo getDownloadedQuality() {
        return this.downloadedQuality;
    }

    public int hashCode() {
        return this.downloadedQuality.hashCode() + unr0.b(unr0.b(unr0.e(unr0.e(Long.hashCode(this.bytesDownloaded) * 31, 31, this.isCompleted), 31, this.isCanceled), 31, this.downloadId), 31, this.contentType);
    }

    /* renamed from: isCanceled, reason: from getter */
    public final boolean getIsCanceled() {
        return this.isCanceled;
    }

    /* renamed from: isCompleted, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadResult(downloadId='");
        sb.append(this.downloadId);
        sb.append("', contentType='");
        sb.append(this.contentType);
        sb.append("', bytesDownloaded=");
        sb.append(this.bytesDownloaded);
        sb.append(", downloadedQuality=");
        sb.append(this.downloadedQuality);
        sb.append(", isCompleted=");
        sb.append(this.isCompleted);
        sb.append(", isCanceled=");
        return unr0.u(sb, this.isCanceled, ')');
    }

    public /* synthetic */ DownloadResult(String str, String str2, long j, QualityInfo qualityInfo, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, qualityInfo, z, z2);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B7\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\r\u0010\"\u001a\u00020\u0003H\u0000¢\u0006\u0002\b#R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001e\"\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lru/yandex/video/m3/preload_manager/DownloadResult$Builder;", "", "downloadResult", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "(Lru/yandex/video/m3/preload_manager/DownloadResult;)V", "downloadId", "", "contentType", "bytesDownloaded", "", "downloadedQuality", "Lru/yandex/video/m3/preload_manager/QualityInfo;", "isCompleted", "", "isCanceled", "(Ljava/lang/String;Ljava/lang/String;JLru/yandex/video/m3/preload_manager/QualityInfo;ZZ)V", "getBytesDownloaded", "()J", "setBytesDownloaded", "(J)V", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getDownloadId", "setDownloadId", "getDownloadedQuality", "()Lru/yandex/video/m3/preload_manager/QualityInfo;", "setDownloadedQuality", "(Lru/yandex/video/m3/preload_manager/QualityInfo;)V", "()Z", "setCanceled", "(Z)V", "setCompleted", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private long bytesDownloaded;
        private String contentType;
        private String downloadId;
        private QualityInfo downloadedQuality;
        private boolean isCanceled;
        private boolean isCompleted;

        public Builder(DownloadResult downloadResult) {
            this(downloadResult.getDownloadId(), downloadResult.getContentType(), downloadResult.getBytesDownloaded(), downloadResult.getDownloadedQuality(), downloadResult.getIsCompleted(), downloadResult.getIsCanceled());
        }

        public final DownloadResult build$video_player_internalRelease() {
            return new DownloadResult(this.downloadId, this.contentType, this.bytesDownloaded, this.downloadedQuality, this.isCompleted, this.isCanceled, null);
        }

        public final long getBytesDownloaded() {
            return this.bytesDownloaded;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getDownloadId() {
            return this.downloadId;
        }

        public final QualityInfo getDownloadedQuality() {
            return this.downloadedQuality;
        }

        /* renamed from: isCanceled, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* renamed from: isCompleted, reason: from getter */
        public final boolean getIsCompleted() {
            return this.isCompleted;
        }

        public final void setBytesDownloaded(long j) {
            this.bytesDownloaded = j;
        }

        public final void setCanceled(boolean z) {
            this.isCanceled = z;
        }

        public final void setCompleted(boolean z) {
            this.isCompleted = z;
        }

        public final void setContentType(String str) {
            this.contentType = str;
        }

        public final void setDownloadId(String str) {
            this.downloadId = str;
        }

        public final void setDownloadedQuality(QualityInfo qualityInfo) {
            this.downloadedQuality = qualityInfo;
        }

        public Builder(String str, String str2, long j, QualityInfo qualityInfo, boolean z, boolean z2) {
            this.downloadId = str;
            this.contentType = str2;
            this.bytesDownloaded = j;
            this.downloadedQuality = qualityInfo;
            this.isCompleted = z;
            this.isCanceled = z2;
        }
    }
}
