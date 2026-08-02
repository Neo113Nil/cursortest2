package com.yandex.music.shared.bdui.trigger.network.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.hrg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/music/shared/bdui/trigger/network/dto/MediaCrmEventRequestDto;", "", "", "type", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getCurrency", "shared-bdui-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class MediaCrmEventRequestDto {

    @SerializedName("currency")
    private final String currency;

    @SerializedName("type")
    @NotNull
    private final String type;

    public MediaCrmEventRequestDto(@NotNull String str, String str2) {
        str.getClass();
        this.type = str;
        this.currency = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaCrmEventRequestDto)) {
            return false;
        }
        MediaCrmEventRequestDto mediaCrmEventRequestDto = (MediaCrmEventRequestDto) obj;
        return Intrinsics.d(this.type, mediaCrmEventRequestDto.type) && Intrinsics.d(this.currency, mediaCrmEventRequestDto.currency);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.currency;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hrg.s("MediaCrmEventRequestDto(type=", this.type, ", currency=", this.currency, ")");
    }
}
