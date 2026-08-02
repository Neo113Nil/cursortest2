package ru.yandex.video.m3.player.impl;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/NetPerfMarker;", "", "className", "", "getClassName", "()Ljava/lang/String;", "isNetPerfEnabled", "", "()Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NetPerfMarker {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static String getClassName(NetPerfMarker netPerfMarker) {
            return NetPerfMarker.super.getClassName();
        }
    }

    default String getClassName() {
        return getClass().getName();
    }

    boolean isNetPerfEnabled();
}
