package com.yandex.music.shared.bdu.trigger.network.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/network/dto/TriggerMetaDto;", "", "", "uiType", "", "hasTabDot", "", "showAfter", "showBefore", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class TriggerMetaDto {

    @SerializedName("has_tab_dot")
    private final Boolean hasTabDot;

    @SerializedName("showAfter")
    private final Long showAfter;

    @SerializedName("showBefore")
    private final Long showBefore;

    @SerializedName("ui_type")
    private final String uiType;

    public TriggerMetaDto(String str, Boolean bool, Long l, Long l2) {
        this.uiType = str;
        this.hasTabDot = bool;
        this.showAfter = l;
        this.showBefore = l2;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getHasTabDot() {
        return this.hasTabDot;
    }

    /* renamed from: b, reason: from getter */
    public final Long getShowAfter() {
        return this.showAfter;
    }

    /* renamed from: c, reason: from getter */
    public final Long getShowBefore() {
        return this.showBefore;
    }

    /* renamed from: d, reason: from getter */
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
        return Intrinsics.d(this.uiType, triggerMetaDto.uiType) && Intrinsics.d(this.hasTabDot, triggerMetaDto.hasTabDot) && Intrinsics.d(this.showAfter, triggerMetaDto.showAfter) && Intrinsics.d(this.showBefore, triggerMetaDto.showBefore);
    }

    public final int hashCode() {
        String str = this.uiType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasTabDot;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.showAfter;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.showBefore;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "TriggerMetaDto(uiType=" + this.uiType + ", hasTabDot=" + this.hasTabDot + ", showAfter=" + this.showAfter + ", showBefore=" + this.showBefore + ")";
    }
}
