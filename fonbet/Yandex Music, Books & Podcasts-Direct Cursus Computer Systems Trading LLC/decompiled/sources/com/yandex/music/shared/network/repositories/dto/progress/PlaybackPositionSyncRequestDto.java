package com.yandex.music.shared.network.repositories.dto.progress;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.rc7;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/music/shared/network/repositories/dto/progress/PlaybackPositionSyncRequestDto;", "", "Lrc7;", "lastSyncTimestamp", "", "Lcom/yandex/music/shared/network/repositories/dto/progress/PlaybackProgressDto;", "streams", "<init>", "(Lrc7;Ljava/util/List;)V", "Lrc7;", "getLastSyncTimestamp", "()Lrc7;", "Ljava/util/List;", "getStreams", "()Ljava/util/List;", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class PlaybackPositionSyncRequestDto {

    @SerializedName("lastSyncTimestamp")
    @NotNull
    private final rc7 lastSyncTimestamp;

    @SerializedName("trackStreams")
    @NotNull
    private final List<PlaybackProgressDto> streams;

    public PlaybackPositionSyncRequestDto(@NotNull rc7 rc7Var, @NotNull List<PlaybackProgressDto> list) {
        rc7Var.getClass();
        list.getClass();
        this.lastSyncTimestamp = rc7Var;
        this.streams = list;
    }
}
