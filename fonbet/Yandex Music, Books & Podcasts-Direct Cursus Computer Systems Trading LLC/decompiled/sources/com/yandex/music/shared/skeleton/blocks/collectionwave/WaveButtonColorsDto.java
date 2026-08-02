package com.yandex.music.shared.skeleton.blocks.collectionwave;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.hrg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/music/shared/skeleton/blocks/collectionwave/WaveButtonColorsDto;", "", "", "average", "waveTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "shared-skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class WaveButtonColorsDto {

    @SerializedName("average")
    private final String average;

    @SerializedName("waveText")
    private final String waveTextColor;

    public WaveButtonColorsDto(String str, String str2) {
        this.average = str;
        this.waveTextColor = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAverage() {
        return this.average;
    }

    /* renamed from: b, reason: from getter */
    public final String getWaveTextColor() {
        return this.waveTextColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaveButtonColorsDto)) {
            return false;
        }
        WaveButtonColorsDto waveButtonColorsDto = (WaveButtonColorsDto) obj;
        return Intrinsics.d(this.average, waveButtonColorsDto.average) && Intrinsics.d(this.waveTextColor, waveButtonColorsDto.waveTextColor);
    }

    public final int hashCode() {
        String str = this.average;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.waveTextColor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return hrg.s("WaveButtonColorsDto(average=", this.average, ", waveTextColor=", this.waveTextColor, ")");
    }
}
