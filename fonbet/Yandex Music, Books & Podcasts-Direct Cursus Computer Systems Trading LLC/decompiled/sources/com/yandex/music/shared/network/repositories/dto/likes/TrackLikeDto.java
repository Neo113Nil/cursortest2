package com.yandex.music.shared.network.repositories.dto.likes;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.rc7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/network/repositories/dto/likes/TrackLikeDto;", "", "", "trackId", "Lrc7;", "clientTimestamp", "<init>", "(Ljava/lang/String;Lrc7;)V", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "Lrc7;", "getClientTimestamp", "()Lrc7;", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class TrackLikeDto {

    @SerializedName("clientTimestamp")
    private final rc7 clientTimestamp;

    @SerializedName("trackId")
    @NotNull
    private final String trackId;

    public TrackLikeDto(@NotNull String str, rc7 rc7Var) {
        str.getClass();
        this.trackId = str;
        this.clientTimestamp = rc7Var;
    }
}
