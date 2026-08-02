package com.yandex.music.shared.wave.data.network.response;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/music/shared/wave/data/network/response/SessionTracksResponseDto;", "", "", "batchId", "", "Lcom/yandex/music/shared/wave/data/network/response/SequenceItemDto;", "sequence", "", "pumpkin", "unknownSession", "", "offlineRecommenderData", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;[I)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "e", "[I", "b", "()[I", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class SessionTracksResponseDto {

    @SerializedName("batchId")
    private final String batchId;

    @SerializedName("offlineRecommenderData")
    private final int[] offlineRecommenderData;

    @SerializedName("pumpkin")
    private final Boolean pumpkin;

    @SerializedName("sequence")
    private final List<SequenceItemDto> sequence;

    @SerializedName("unknownSession")
    private final Boolean unknownSession;

    public SessionTracksResponseDto(String str, List<SequenceItemDto> list, Boolean bool, Boolean bool2, int[] iArr) {
        this.batchId = str;
        this.sequence = list;
        this.pumpkin = bool;
        this.unknownSession = bool2;
        this.offlineRecommenderData = iArr;
    }

    /* renamed from: a, reason: from getter */
    public final String getBatchId() {
        return this.batchId;
    }

    /* renamed from: b, reason: from getter */
    public final int[] getOfflineRecommenderData() {
        return this.offlineRecommenderData;
    }

    /* renamed from: c, reason: from getter */
    public final Boolean getPumpkin() {
        return this.pumpkin;
    }

    /* renamed from: d, reason: from getter */
    public final List getSequence() {
        return this.sequence;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getUnknownSession() {
        return this.unknownSession;
    }
}
