package com.yandex.music.shared.wave.data.network.response;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.wave.recommendation.WaveDto;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/yandex/music/shared/wave/data/network/response/SessionNewResponseDto;", "", "", "radioSessionId", "batchId", "", "Lcom/yandex/music/shared/wave/data/network/response/SequenceItemDto;", "sequence", "", "pumpkin", "Lcom/yandex/music/shared/dto/wave/recommendation/WaveDto;", "wave", "", "offlineRecommenderData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lcom/yandex/music/shared/dto/wave/recommendation/WaveDto;[I)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Lcom/yandex/music/shared/dto/wave/recommendation/WaveDto;", "f", "()Lcom/yandex/music/shared/dto/wave/recommendation/WaveDto;", "[I", "b", "()[I", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class SessionNewResponseDto {

    @SerializedName("batchId")
    private final String batchId;

    @SerializedName("offlineRecommenderData")
    private final int[] offlineRecommenderData;

    @SerializedName("pumpkin")
    private final Boolean pumpkin;

    @SerializedName("radioSessionId")
    private final String radioSessionId;

    @SerializedName("sequence")
    private final List<SequenceItemDto> sequence;

    @SerializedName("wave")
    private final WaveDto wave;

    public SessionNewResponseDto(String str, String str2, List<SequenceItemDto> list, Boolean bool, WaveDto waveDto, int[] iArr) {
        this.radioSessionId = str;
        this.batchId = str2;
        this.sequence = list;
        this.pumpkin = bool;
        this.wave = waveDto;
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
    public final String getRadioSessionId() {
        return this.radioSessionId;
    }

    /* renamed from: e, reason: from getter */
    public final List getSequence() {
        return this.sequence;
    }

    /* renamed from: f, reason: from getter */
    public final WaveDto getWave() {
        return this.wave;
    }
}
