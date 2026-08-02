package com.yandex.music.shared.bdui.trigger.network.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/bdui/trigger/network/dto/TriggerMetaDto;", "", "", "uiType", "", "hasTabDot", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "shared-bdui-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class TriggerMetaDto {

    @SerializedName("has_tab_dot")
    private final Boolean hasTabDot;

    @SerializedName("ui_type")
    private final String uiType;

    public TriggerMetaDto(String str, Boolean bool) {
        this.uiType = str;
        this.hasTabDot = bool;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getHasTabDot() {
        return this.hasTabDot;
    }

    /* renamed from: b, reason: from getter */
    public final String getUiType() {
        return this.uiType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggerMetaDto)) {
            return false;
        }
        TriggerMetaDto triggerMetaDto = (TriggerMetaDto) obj;
        return Intrinsics.d(this.uiType, triggerMetaDto.uiType) && Intrinsics.d(this.hasTabDot, triggerMetaDto.hasTabDot);
    }

    public final int hashCode() {
        String str = this.uiType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasTabDot;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "TriggerMetaDto(uiType=" + this.uiType + ", hasTabDot=" + this.hasTabDot + ")";
    }
}
