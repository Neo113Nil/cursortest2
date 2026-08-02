package ru.yandex.video.m3.offline;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectory;", "", "isActive", "", "isExternal", "isCreated", "file", "Ljava/io/File;", "(ZZZLjava/io/File;)V", "getFile", "()Ljava/io/File;", "()Z", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloadDirectory {
    public static final int $stable = 8;
    private final File file;
    private final boolean isActive;
    private final boolean isCreated;
    private final boolean isExternal;

    private DownloadDirectory(boolean z, boolean z2, boolean z3, File file) {
        this.isActive = z;
        this.isExternal = z2;
        this.isCreated = z3;
        this.file = file;
    }

    public final File getFile() {
        return this.file;
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: isCreated, reason: from getter */
    public final boolean getIsCreated() {
        return this.isCreated;
    }

    /* renamed from: isExternal, reason: from getter */
    public final boolean getIsExternal() {
        return this.isExternal;
    }

    public /* synthetic */ DownloadDirectory(boolean z, boolean z2, boolean z3, File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, file);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u0015\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0010\"\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/offline/DownloadDirectory$Builder;", "", "downloadDirectory", "Lru/yandex/video/m3/offline/DownloadDirectory;", "(Lru/yandex/video/m3/offline/DownloadDirectory;)V", "isActive", "", "isExternal", "isCreated", "file", "Ljava/io/File;", "(ZZZLjava/io/File;)V", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "()Z", "setActive", "(Z)V", "setCreated", "setExternal", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private File file;
        private boolean isActive;
        private boolean isCreated;
        private boolean isExternal;

        public Builder(DownloadDirectory downloadDirectory) {
            this(downloadDirectory.getIsActive(), downloadDirectory.getIsExternal(), downloadDirectory.getIsCreated(), downloadDirectory.getFile());
        }

        public final DownloadDirectory build$video_player_internalRelease() {
            return new DownloadDirectory(this.isActive, this.isExternal, this.isCreated, this.file, null);
        }

        public final File getFile() {
            return this.file;
        }

        /* renamed from: isActive, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: isCreated, reason: from getter */
        public final boolean getIsCreated() {
            return this.isCreated;
        }

        /* renamed from: isExternal, reason: from getter */
        public final boolean getIsExternal() {
            return this.isExternal;
        }

        public final void setActive(boolean z) {
            this.isActive = z;
        }

        public final void setCreated(boolean z) {
            this.isCreated = z;
        }

        public final void setExternal(boolean z) {
            this.isExternal = z;
        }

        public final void setFile(File file) {
            this.file = file;
        }

        public Builder(boolean z, boolean z2, boolean z3, File file) {
            this.isActive = z;
            this.isExternal = z2;
            this.isCreated = z3;
            this.file = file;
        }
    }
}
