package ru.yandex.video.m3.player.impl.tracking;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0081\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/UriQueryParams;", "", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public @interface UriQueryParams {
    public static final int BUFSIZE = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int ENABLE_HEVC = 1;
    public static final int ENABLE_MULTI_BASE_URLS = 2;
    public static final int ENABLE_SEVERAL_AUDIO_TRACKS = 3;
    public static final int FROM = 4;
    public static final int LOWLATENCY = 5;
    public static final int MAX_RES_HEIGHT = 6;
    public static final int MIN_RES_HEIGHT = 7;
    public static final int OTT_SESSION = 8;
    public static final int PACKAGER = 9;
    public static final int PARTNER_ID = 10;
    public static final int PREVIEW = 11;
    public static final int SECONDARY_VIDEO_TRACKS = 12;
    public static final int SOURCE_INDEX = 13;
    public static final int TARGET_REF = 14;
    public static final int TIMESTAMP = 15;
    public static final int UUID = 16;
    public static final int VIDEO_CATEGORY_ID = 17;
    public static final int VIDEO_CONTENT_ID = 18;
    public static final int VPUID = 19;
    public static final int VSID = 20;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/UriQueryParams$Companion;", "", "()V", "BUFSIZE", "", "ENABLE_HEVC", "ENABLE_MULTI_BASE_URLS", "ENABLE_SEVERAL_AUDIO_TRACKS", "FROM", "LOWLATENCY", "MAX_RES_HEIGHT", "MIN_RES_HEIGHT", "OTT_SESSION", "PACKAGER", "PARTNER_ID", "PREVIEW", "SECONDARY_VIDEO_TRACKS", "SOURCE_INDEX", "TARGET_REF", "TIMESTAMP", "UUID", "VIDEO_CATEGORY_ID", "VIDEO_CONTENT_ID", "VPUID", "VSID", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BUFSIZE = 0;
        public static final int ENABLE_HEVC = 1;
        public static final int ENABLE_MULTI_BASE_URLS = 2;
        public static final int ENABLE_SEVERAL_AUDIO_TRACKS = 3;
        public static final int FROM = 4;
        public static final int LOWLATENCY = 5;
        public static final int MAX_RES_HEIGHT = 6;
        public static final int MIN_RES_HEIGHT = 7;
        public static final int OTT_SESSION = 8;
        public static final int PACKAGER = 9;
        public static final int PARTNER_ID = 10;
        public static final int PREVIEW = 11;
        public static final int SECONDARY_VIDEO_TRACKS = 12;
        public static final int SOURCE_INDEX = 13;
        public static final int TARGET_REF = 14;
        public static final int TIMESTAMP = 15;
        public static final int UUID = 16;
        public static final int VIDEO_CATEGORY_ID = 17;
        public static final int VIDEO_CONTENT_ID = 18;
        public static final int VPUID = 19;
        public static final int VSID = 20;

        private Companion() {
        }
    }
}
