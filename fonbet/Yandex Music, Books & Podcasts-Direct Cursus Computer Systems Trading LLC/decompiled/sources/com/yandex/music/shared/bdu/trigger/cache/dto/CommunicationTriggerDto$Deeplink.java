package com.yandex.music.shared.bdu.trigger.cache.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.ej5;
import defpackage.f1d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"com/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Deeplink", "Lej5;", "", "screenId", "feedbackToken", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;", "meta", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;", "c", "()Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;", "a", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class CommunicationTriggerDto$Deeplink implements ej5 {

    @SerializedName("deeplink")
    private final String deeplink;

    @SerializedName("feedbackToken")
    private final String feedbackToken;

    @SerializedName("meta")
    private final CommunicationTriggerDto$Meta meta;

    @SerializedName("screenId")
    private final String screenId;

    public CommunicationTriggerDto$Deeplink(String str, String str2, CommunicationTriggerDto$Meta communicationTriggerDto$Meta, String str3) {
        this.screenId = str;
        this.feedbackToken = str2;
        this.meta = communicationTriggerDto$Meta;
        this.deeplink = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: b, reason: from getter */
    public final String getFeedbackToken() {
        return this.feedbackToken;
    }

    /* renamed from: c, reason: from getter */
    public final CommunicationTriggerDto$Meta getMeta() {
        return this.meta;
    }

    /* renamed from: d, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunicationTriggerDto$Deeplink)) {
            return false;
        }
        CommunicationTriggerDto$Deeplink communicationTriggerDto$Deeplink = (CommunicationTriggerDto$Deeplink) obj;
        return Intrinsics.d(this.screenId, communicationTriggerDto$Deeplink.screenId) && Intrinsics.d(this.feedbackToken, communicationTriggerDto$Deeplink.feedbackToken) && Intrinsics.d(this.meta, communicationTriggerDto$Deeplink.meta) && Intrinsics.d(this.deeplink, communicationTriggerDto$Deeplink.deeplink);
    }

    public final int hashCode() {
        String str = this.screenId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feedbackToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommunicationTriggerDto$Meta communicationTriggerDto$Meta = this.meta;
        int hashCode3 = (hashCode2 + (communicationTriggerDto$Meta == null ? 0 : communicationTriggerDto$Meta.hashCode())) * 31;
        String str3 = this.deeplink;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.screenId;
        String str2 = this.feedbackToken;
        CommunicationTriggerDto$Meta communicationTriggerDto$Meta = this.meta;
        String str3 = this.deeplink;
        StringBuilder m = f1d.m("Deeplink(screenId=", str, ", feedbackToken=", str2, ", meta=");
        m.append(communicationTriggerDto$Meta);
        m.append(", deeplink=");
        m.append(str3);
        m.append(")");
        return m.toString();
    }
}
