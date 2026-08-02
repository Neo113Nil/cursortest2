package com.yandex.music.shared.player.content.remote.fileinfo;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/music/shared/player/content/remote/fileinfo/GetFileInfoDto;", "", "Lcom/yandex/music/shared/player/content/remote/fileinfo/FileInfoDto;", "downloadInfo", "<init>", "(Lcom/yandex/music/shared/player/content/remote/fileinfo/FileInfoDto;)V", "Lcom/yandex/music/shared/player/content/remote/fileinfo/FileInfoDto;", "a", "()Lcom/yandex/music/shared/player/content/remote/fileinfo/FileInfoDto;", "shared-player"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class GetFileInfoDto {

    @SerializedName("downloadInfo")
    private final FileInfoDto downloadInfo;

    public GetFileInfoDto(FileInfoDto fileInfoDto) {
        this.downloadInfo = fileInfoDto;
    }

    /* renamed from: a, reason: from getter */
    public final FileInfoDto getDownloadInfo() {
        return this.downloadInfo;
    }
}
