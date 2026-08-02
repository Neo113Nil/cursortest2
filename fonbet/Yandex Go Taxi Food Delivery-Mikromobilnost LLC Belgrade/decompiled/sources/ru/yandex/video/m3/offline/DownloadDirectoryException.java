package ru.yandex.video.m3.offline;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectoryException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "StorageChangeAtDownloadingException", "StorageLowSpaceException", "StorageMountedException", "Lru/yandex/video/m3/offline/DownloadDirectoryException$StorageChangeAtDownloadingException;", "Lru/yandex/video/m3/offline/DownloadDirectoryException$StorageLowSpaceException;", "Lru/yandex/video/m3/offline/DownloadDirectoryException$StorageMountedException;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DownloadDirectoryException extends Exception {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectoryException$StorageChangeAtDownloadingException;", "Lru/yandex/video/m3/offline/DownloadDirectoryException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StorageChangeAtDownloadingException extends DownloadDirectoryException {
        public static final int $stable = 0;

        public StorageChangeAtDownloadingException() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectoryException$StorageLowSpaceException;", "Lru/yandex/video/m3/offline/DownloadDirectoryException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StorageLowSpaceException extends DownloadDirectoryException {
        public static final int $stable = 0;

        public StorageLowSpaceException() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectoryException$StorageMountedException;", "Lru/yandex/video/m3/offline/DownloadDirectoryException;", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StorageMountedException extends DownloadDirectoryException {
        public static final int $stable = 0;

        public StorageMountedException() {
            super(null);
        }
    }

    public /* synthetic */ DownloadDirectoryException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DownloadDirectoryException() {
    }
}
