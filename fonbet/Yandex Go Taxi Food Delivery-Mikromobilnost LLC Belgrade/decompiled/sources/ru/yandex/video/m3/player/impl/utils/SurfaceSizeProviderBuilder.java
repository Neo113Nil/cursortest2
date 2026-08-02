package ru.yandex.video.m3.player.impl.utils;

import android.content.Context;
import android.graphics.Point;
import defpackage.ny61;
import defpackage.tw21;
import kotlin.Metadata;
import ru.yandex.video.m3.player.provider.SurfaceSizeProvider;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/SurfaceSizeProviderBuilder;", "", "()V", "context", "Landroid/content/Context;", "initialSurfaceHeight", "", "Ljava/lang/Integer;", "initialSurfaceWidth", "build", "Lru/yandex/video/m3/player/provider/SurfaceSizeProvider;", "initialSurfaceSize", "SimpleSurfaceSizeProvider", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SurfaceSizeProviderBuilder {
    public static final int $stable = 8;
    private Context context;
    private Integer initialSurfaceHeight;
    private Integer initialSurfaceWidth;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/SurfaceSizeProviderBuilder$SimpleSurfaceSizeProvider;", "Lru/yandex/video/m3/player/provider/SurfaceSizeProvider;", "surfaceWidth", "", "surfaceHeight", "(II)V", "getSurfaceHeight", "()I", "getSurfaceWidth", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SimpleSurfaceSizeProvider implements SurfaceSizeProvider {
        public static final int $stable = 0;
        private final int surfaceHeight;
        private final int surfaceWidth;

        public SimpleSurfaceSizeProvider(int i, int i2) {
            this.surfaceWidth = i;
            this.surfaceHeight = i2;
        }

        @Override // ru.yandex.video.m3.player.provider.SurfaceSizeProvider
        public int getSurfaceHeight() {
            return this.surfaceHeight;
        }

        @Override // ru.yandex.video.m3.player.provider.SurfaceSizeProvider
        public int getSurfaceWidth() {
            return this.surfaceWidth;
        }
    }

    public final SurfaceSizeProvider build() {
        Context context = this.context;
        if (context == null && this.initialSurfaceWidth == null && this.initialSurfaceHeight == null) {
            ny61.g("context, initialSurfaceWidth and initialSurfaceHeight can not be NULL in same time");
            return null;
        }
        if (this.initialSurfaceWidth == null || this.initialSurfaceHeight == null) {
            if (context == null) {
                ny61.g("Required value was null.");
                return null;
            }
            Point z = tw21.z(context);
            int max = Math.max(z.x, z.y);
            this.initialSurfaceWidth = Integer.valueOf(max);
            this.initialSurfaceHeight = Integer.valueOf(max);
        }
        return new SimpleSurfaceSizeProvider(this.initialSurfaceWidth.intValue(), this.initialSurfaceHeight.intValue());
    }

    public final SurfaceSizeProviderBuilder context(Context context) {
        this.context = context;
        return this;
    }

    public final SurfaceSizeProviderBuilder initialSurfaceSize(int initialSurfaceWidth, int initialSurfaceHeight) {
        this.initialSurfaceWidth = Integer.valueOf(initialSurfaceWidth);
        this.initialSurfaceHeight = Integer.valueOf(initialSurfaceHeight);
        return this;
    }
}
