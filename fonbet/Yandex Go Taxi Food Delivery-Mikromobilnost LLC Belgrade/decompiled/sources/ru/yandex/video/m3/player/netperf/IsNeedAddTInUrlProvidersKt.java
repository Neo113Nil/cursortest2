package ru.yandex.video.m3.player.netperf;

import defpackage.j73;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"DEFAULT_VIDEO_CHUNKS_PATH_EXTENSION", "", "", "getDEFAULT_VIDEO_CHUNKS_PATH_EXTENSION", "()Ljava/util/Set;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IsNeedAddTInUrlProvidersKt {
    private static final Set<String> DEFAULT_VIDEO_CHUNKS_PATH_EXTENSION = j73.f0(new String[]{".ts", ".m4s", ".mp4"});

    public static final Set<String> getDEFAULT_VIDEO_CHUNKS_PATH_EXTENSION() {
        return DEFAULT_VIDEO_CHUNKS_PATH_EXTENSION;
    }
}
