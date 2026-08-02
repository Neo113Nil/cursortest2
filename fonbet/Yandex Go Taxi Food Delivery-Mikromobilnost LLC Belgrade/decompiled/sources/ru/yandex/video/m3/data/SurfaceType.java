package ru.yandex.video.m3.data;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/data/SurfaceType;", "", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public @interface SurfaceType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int SURFACE = 0;
    public static final int SURFACE_HOLDER = 2;
    public static final int SURFACE_VIEW = 1;
    public static final int TEXTURE_VIEW = 3;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/data/SurfaceType$Companion;", "", "()V", "SURFACE", "", "SURFACE_HOLDER", "SURFACE_VIEW", "TEXTURE_VIEW", "toAnalyticsString", "", "type", "(Ljava/lang/Integer;)Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int SURFACE = 0;
        public static final int SURFACE_HOLDER = 2;
        public static final int SURFACE_VIEW = 1;
        public static final int TEXTURE_VIEW = 3;

        private Companion() {
        }

        public final String toAnalyticsString(@SurfaceType Integer type) {
            return (type != null && type.intValue() == 0) ? "Surface" : (type != null && type.intValue() == 1) ? "SurfaceView" : (type != null && type.intValue() == 2) ? "SurfaceHolder" : (type != null && type.intValue() == 3) ? "TextureView" : "Empty";
        }
    }
}
