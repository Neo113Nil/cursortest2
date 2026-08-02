package com.yandex.music.shared.bdu.trigger.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.k5r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"com/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta", "", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$UiType;", "uiType", "", "hasTabDot", "", "showAfter", "showBefore", "<init>", "(Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$UiType;ZLjava/lang/Long;Ljava/lang/Long;)V", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$UiType;", "d", "()Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$UiType;", "Z", "a", "()Z", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class InternalCommunicationTrigger$Meta {

    @SerializedName("hasTabDot")
    private final boolean hasTabDot;

    @SerializedName("showAfter")
    private final Long showAfter;

    @SerializedName("showBefore")
    private final Long showBefore;

    @SerializedName("uiType")
    @NotNull
    private final InternalCommunicationTrigger$UiType uiType;

    public InternalCommunicationTrigger$Meta(@NotNull InternalCommunicationTrigger$UiType internalCommunicationTrigger$UiType, boolean z, Long l, Long l2) {
        internalCommunicationTrigger$UiType.getClass();
        this.uiType = internalCommunicationTrigger$UiType;
        this.hasTabDot = z;
        this.showAfter = l;
        this.showBefore = l2;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getHasTabDot() {
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
    public final InternalCommunicationTrigger$UiType getUiType() {
        return this.uiType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalCommunicationTrigger$Meta)) {
            return false;
        }
        InternalCommunicationTrigger$Meta internalCommunicationTrigger$Meta = (InternalCommunicationTrigger$Meta) obj;
        return this.uiType == internalCommunicationTrigger$Meta.uiType && this.hasTabDot == internalCommunicationTrigger$Meta.hasTabDot && Intrinsics.d(this.showAfter, internalCommunicationTrigger$Meta.showAfter) && Intrinsics.d(this.showBefore, internalCommunicationTrigger$Meta.showBefore);
    }

    public final int hashCode() {
        int e = k5r.e(this.uiType.hashCode() * 31, 31, this.hasTabDot);
        Long l = this.showAfter;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.showBefore;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "Meta(uiType=" + this.uiType + ", hasTabDot=" + this.hasTabDot + ", showAfter=" + this.showAfter + ", showBefore=" + this.showBefore + ")";
    }
}
