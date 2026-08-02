package ru.yandex.video.m3.data;

import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/data/TargetFormat;", "", "minSize", "Lru/yandex/video/m3/data/Size;", "maxSize", "(Lru/yandex/video/m3/data/Size;Lru/yandex/video/m3/data/Size;)V", "getMaxSize", "()Lru/yandex/video/m3/data/Size;", "getMinSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TargetFormat {
    public static final int $stable = 0;
    private final Size maxSize;
    private final Size minSize;

    public TargetFormat(Size size, Size size2) {
        this.minSize = size;
        this.maxSize = size2;
    }

    public static /* synthetic */ TargetFormat copy$default(TargetFormat targetFormat, Size size, Size size2, int i, Object obj) {
        if ((i & 1) != 0) {
            size = targetFormat.minSize;
        }
        if ((i & 2) != 0) {
            size2 = targetFormat.maxSize;
        }
        return targetFormat.copy(size, size2);
    }

    /* renamed from: component1, reason: from getter */
    public final Size getMinSize() {
        return this.minSize;
    }

    /* renamed from: component2, reason: from getter */
    public final Size getMaxSize() {
        return this.maxSize;
    }

    public final TargetFormat copy(Size minSize, Size maxSize) {
        return new TargetFormat(minSize, maxSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetFormat)) {
            return false;
        }
        TargetFormat targetFormat = (TargetFormat) other;
        return jl40.l(this.minSize, targetFormat.minSize) && jl40.l(this.maxSize, targetFormat.maxSize);
    }

    public final Size getMaxSize() {
        return this.maxSize;
    }

    public final Size getMinSize() {
        return this.minSize;
    }

    public int hashCode() {
        return this.maxSize.hashCode() + (this.minSize.hashCode() * 31);
    }

    public String toString() {
        return "TargetFormat(minSize=" + this.minSize + ", maxSize=" + this.maxSize + ')';
    }
}
