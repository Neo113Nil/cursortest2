package ru.yandex.video.m3.preload_manager;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\b\b\t\n\u000b\f\r\u000e\u000fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ApiCallError", "CacheInitException", "CanceledOperationException", "EmptyTrackListSelectedError", "ManifestDownloadError", "TracksDownloadError", "TracksDownloadTimeout", "UnknownError", "Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException;", "Lru/yandex/video/m3/preload_manager/PreloadException$EmptyTrackListSelectedError;", "Lru/yandex/video/m3/preload_manager/PreloadException$ManifestDownloadError;", "Lru/yandex/video/m3/preload_manager/PreloadException$TracksDownloadError;", "Lru/yandex/video/m3/preload_manager/PreloadException$TracksDownloadTimeout;", "Lru/yandex/video/m3/preload_manager/PreloadException$UnknownError;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PreloadException extends Exception {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$TracksDownloadTimeout;", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TracksDownloadTimeout extends PreloadException {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public TracksDownloadTimeout(String str) {
            super(str, null, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ PreloadException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "InitFailed", "StorageNotMounted", "StorageReadOnly", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException$InitFailed;", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException$StorageNotMounted;", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException$StorageReadOnly;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class CacheInitException extends PreloadException {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException$InitFailed;", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InitFailed extends CacheInitException {
            public static final int $stable = 0;

            public InitFailed(String str, Throwable th) {
                super(str, th, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException$StorageNotMounted;", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class StorageNotMounted extends CacheInitException {
            public static final int $stable = 0;

            /* JADX WARN: Multi-variable type inference failed */
            public StorageNotMounted(String str) {
                super(str, null, 0 == true ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException$StorageReadOnly;", "Lru/yandex/video/m3/preload_manager/PreloadException$CacheInitException;", Constants.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class StorageReadOnly extends CacheInitException {
            public static final int $stable = 0;

            /* JADX WARN: Multi-variable type inference failed */
            public StorageReadOnly(String str) {
                super(str, null, 0 == true ? 1 : 0);
            }
        }

        private CacheInitException(String str, Throwable th) {
            super(str, th, null);
        }

        public /* synthetic */ CacheInitException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th);
        }
    }

    private PreloadException(String str, Throwable th) {
        super(str, th);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException;", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_MESSAGE, "", "cause", "", "results", "", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;)V", "getResults", "()Ljava/util/List;", "CanceledManifestDownload", "CanceledPendingRequest", "CanceledTracksDownload", "UnsupportedMediaType", "Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException$CanceledManifestDownload;", "Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException$CanceledPendingRequest;", "Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException$CanceledTracksDownload;", "Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException$UnsupportedMediaType;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class CanceledOperationException extends PreloadException {
        public static final int $stable = 8;
        private final List<DownloadResult> results;

        public /* synthetic */ CanceledOperationException(String str, Throwable th, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th, (i & 4) != 0 ? EmptyList.a : list, null);
        }

        public final List<DownloadResult> getResults() {
            return this.results;
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException$CanceledTracksDownload;", "Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException;", Constants.KEY_MESSAGE, "", "cause", "", "results", "", "Lru/yandex/video/m3/preload_manager/DownloadResult;", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CanceledTracksDownload extends CanceledOperationException {
            public static final int $stable = 0;

            public /* synthetic */ CanceledTracksDownload(String str, Throwable th, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : th, list);
            }

            public CanceledTracksDownload(String str, Throwable th, List<DownloadResult> list) {
                super(str, th, list, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException$UnsupportedMediaType;", "Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class UnsupportedMediaType extends CanceledOperationException {
            public static final int $stable = 0;

            public /* synthetic */ UnsupportedMediaType(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : th);
            }

            public UnsupportedMediaType(String str, Throwable th) {
                super(str, th, EmptyList.a, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException$CanceledManifestDownload;", "Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CanceledManifestDownload extends CanceledOperationException {
            public static final int $stable = 0;

            public CanceledManifestDownload(String str, Throwable th) {
                super(str, th, null, 4, null);
            }

            public /* synthetic */ CanceledManifestDownload(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : th);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException$CanceledPendingRequest;", "Lru/yandex/video/m3/preload_manager/PreloadException$CanceledOperationException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CanceledPendingRequest extends CanceledOperationException {
            public static final int $stable = 0;

            public CanceledPendingRequest(String str, Throwable th) {
                super(str, th, null, 4, null);
            }

            public /* synthetic */ CanceledPendingRequest(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : th);
            }
        }

        public /* synthetic */ CanceledOperationException(String str, Throwable th, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th, list);
        }

        private CanceledOperationException(String str, Throwable th, List<DownloadResult> list) {
            super(str, th, null);
            this.results = list;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$EmptyTrackListSelectedError;", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EmptyTrackListSelectedError extends PreloadException {
        public static final int $stable = 0;

        public /* synthetic */ EmptyTrackListSelectedError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public EmptyTrackListSelectedError(String str, Throwable th) {
            super(str, th, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$ManifestDownloadError;", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ManifestDownloadError extends PreloadException {
        public static final int $stable = 0;

        public /* synthetic */ ManifestDownloadError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public ManifestDownloadError(String str, Throwable th) {
            super(str, th, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$TracksDownloadError;", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TracksDownloadError extends PreloadException {
        public static final int $stable = 0;

        public /* synthetic */ TracksDownloadError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public TracksDownloadError(String str, Throwable th) {
            super(str, th, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$UnknownError;", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownError extends PreloadException {
        public static final int $stable = 0;

        public /* synthetic */ UnknownError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public UnknownError(String str, Throwable th) {
            super(str, th, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadException$ApiCallError;", "Lru/yandex/video/m3/preload_manager/PreloadException;", Constants.KEY_MESSAGE, "", "cause", "", ClidProvider.TIMESTAMP, "", "(Ljava/lang/String;Ljava/lang/Throwable;J)V", "getTimestamp", "()J", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ApiCallError extends PreloadException {
        public static final int $stable = 0;
        private final long timestamp;

        public /* synthetic */ ApiCallError(String str, Throwable th, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? System.currentTimeMillis() : j);
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public ApiCallError(String str, Throwable th, long j) {
            super(str, th, null);
            this.timestamp = j;
        }
    }
}
