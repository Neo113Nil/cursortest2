package ru.yandex.video.m3.preload_manager;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadPriority;", "", "priority", "", "(I)V", "getPriority", "()I", "compareTo", "other", "toString", "", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadPriority implements Comparable<PreloadPriority> {
    public static final int $stable = 0;
    private final int priority;

    private PreloadPriority(int i) {
        this.priority = i;
    }

    public final int getPriority() {
        return this.priority;
    }

    public String toString() {
        return String.valueOf(this.priority);
    }

    public /* synthetic */ PreloadPriority(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadPriority$Builder;", "", "preloadPriority", "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "(Lru/yandex/video/m3/preload_manager/PreloadPriority;)V", "priority", "", "(I)V", "getPriority", "()I", "setPriority", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private int priority;

        public Builder(PreloadPriority preloadPriority) {
            this(preloadPriority.getPriority());
        }

        public final PreloadPriority build$video_player_internalRelease() {
            return new PreloadPriority(this.priority, null);
        }

        public final int getPriority() {
            return this.priority;
        }

        public final void setPriority(int i) {
            this.priority = i;
        }

        public Builder(int i) {
            this.priority = i;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(PreloadPriority other) {
        return this.priority - other.priority;
    }
}
