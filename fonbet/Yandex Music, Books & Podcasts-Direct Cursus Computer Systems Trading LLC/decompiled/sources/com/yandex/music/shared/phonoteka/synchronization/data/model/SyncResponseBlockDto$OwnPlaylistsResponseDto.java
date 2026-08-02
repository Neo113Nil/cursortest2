package com.yandex.music.shared.phonoteka.synchronization.data.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.gxr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/yandex/music/shared/phonoteka/synchronization/data/model/SyncResponseBlockDto$OwnPlaylistsResponseDto", "Lgxr;", "Lcom/yandex/music/shared/phonoteka/synchronization/data/model/SyncBlockError;", "error", "Lcom/yandex/music/shared/phonoteka/synchronization/data/model/OwnPlaylistsBlockValuesDto;", "values", "<init>", "(Lcom/yandex/music/shared/phonoteka/synchronization/data/model/SyncBlockError;Lcom/yandex/music/shared/phonoteka/synchronization/data/model/OwnPlaylistsBlockValuesDto;)V", "Lcom/yandex/music/shared/phonoteka/synchronization/data/model/SyncBlockError;", "a", "()Lcom/yandex/music/shared/phonoteka/synchronization/data/model/SyncBlockError;", "Lcom/yandex/music/shared/phonoteka/synchronization/data/model/OwnPlaylistsBlockValuesDto;", "b", "()Lcom/yandex/music/shared/phonoteka/synchronization/data/model/OwnPlaylistsBlockValuesDto;", "shared-phonoteka-synchronization"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class SyncResponseBlockDto$OwnPlaylistsResponseDto implements gxr {

    @SerializedName("error")
    private final SyncBlockError error;

    @SerializedName("values")
    private final OwnPlaylistsBlockValuesDto values;

    public SyncResponseBlockDto$OwnPlaylistsResponseDto(SyncBlockError syncBlockError, OwnPlaylistsBlockValuesDto ownPlaylistsBlockValuesDto) {
        this.error = syncBlockError;
        this.values = ownPlaylistsBlockValuesDto;
    }

    /* renamed from: a, reason: from getter */
    public final SyncBlockError getError() {
        return this.error;
    }

    /* renamed from: b, reason: from getter */
    public final OwnPlaylistsBlockValuesDto getValues() {
        return this.values;
    }
}
