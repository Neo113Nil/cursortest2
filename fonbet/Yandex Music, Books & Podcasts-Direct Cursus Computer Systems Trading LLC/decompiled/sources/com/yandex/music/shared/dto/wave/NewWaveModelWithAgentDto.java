package com.yandex.music.shared.dto.wave;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.dou;
import defpackage.hlu;
import defpackage.np;
import defpackage.w1g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/dto/wave/NewWaveModelWithAgentDto;", "", "Lcom/yandex/music/shared/dto/wave/NewWaveModelDto;", "wave", "Lcom/yandex/music/shared/dto/wave/AgentDto;", "agentDto", "<init>", "(Lcom/yandex/music/shared/dto/wave/NewWaveModelDto;Lcom/yandex/music/shared/dto/wave/AgentDto;)V", "Lcom/yandex/music/shared/dto/wave/NewWaveModelDto;", "b", "()Lcom/yandex/music/shared/dto/wave/NewWaveModelDto;", "Lcom/yandex/music/shared/dto/wave/AgentDto;", "a", "()Lcom/yandex/music/shared/dto/wave/AgentDto;", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class NewWaveModelWithAgentDto {

    @SerializedName("agent")
    private final AgentDto agentDto;

    @SerializedName("wave")
    private final NewWaveModelDto wave;

    public NewWaveModelWithAgentDto(NewWaveModelDto newWaveModelDto, AgentDto agentDto) {
        this.wave = newWaveModelDto;
        this.agentDto = agentDto;
    }

    /* renamed from: a, reason: from getter */
    public final AgentDto getAgentDto() {
        return this.agentDto;
    }

    /* renamed from: b, reason: from getter */
    public final NewWaveModelDto getWave() {
        return this.wave;
    }

    public final hlu c() {
        dou a;
        AgentDto agentDto;
        np E;
        NewWaveModelDto newWaveModelDto = this.wave;
        if (newWaveModelDto == null || (a = newWaveModelDto.a()) == null || (agentDto = this.agentDto) == null || (E = w1g.E(agentDto)) == null) {
            return null;
        }
        return new hlu(a, E);
    }
}
