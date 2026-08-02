package com.yandex.music.shared.bdu.trigger.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.mte;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"com/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Div$WithJson", "", "", "screenId", "feedbackToken", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;", "meta", "div", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;", "a", "()Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;", "c", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class InternalCommunicationTrigger$Div$WithJson implements mte {

    @SerializedName("div")
    @NotNull
    private final String div;

    @SerializedName("feedbackToken")
    @NotNull
    private final String feedbackToken;

    @SerializedName("meta")
    @NotNull
    private final InternalCommunicationTrigger$Meta meta;

    @SerializedName("screenId")
    @NotNull
    private final String screenId;

    public InternalCommunicationTrigger$Div$WithJson(@NotNull String str, @NotNull String str2, @NotNull InternalCommunicationTrigger$Meta internalCommunicationTrigger$Meta, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        internalCommunicationTrigger$Meta.getClass();
        str3.getClass();
        this.screenId = str;
        this.feedbackToken = str2;
        this.meta = internalCommunicationTrigger$Meta;
        this.div = str3;
    }

    @Override // defpackage.mte
    /* renamed from: a, reason: from getter */
    public final InternalCommunicationTrigger$Meta getMeta() {
        return this.meta;
    }

    @Override // defpackage.mte
    /* renamed from: b, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    /* renamed from: c, reason: from getter */
    public final String getDiv() {
        return this.div;
    }

    /* renamed from: d, reason: from getter */
    public final String getFeedbackToken() {
        return this.feedbackToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalCommunicationTrigger$Div$WithJson)) {
            return false;
        }
        InternalCommunicationTrigger$Div$WithJson internalCommunicationTrigger$Div$WithJson = (InternalCommunicationTrigger$Div$WithJson) obj;
        return Intrinsics.d(this.screenId, internalCommunicationTrigger$Div$WithJson.screenId) && Intrinsics.d(this.feedbackToken, internalCommunicationTrigger$Div$WithJson.feedbackToken) && Intrinsics.d(this.meta, internalCommunicationTrigger$Div$WithJson.meta) && Intrinsics.d(this.div, internalCommunicationTrigger$Div$WithJson.div);
    }

    public final int hashCode() {
        return this.div.hashCode() + ((this.meta.hashCode() + k5r.c(this.screenId.hashCode() * 31, 31, this.feedbackToken)) * 31);
    }

    public final String toString() {
        String str = this.screenId;
        String str2 = this.feedbackToken;
        InternalCommunicationTrigger$Meta internalCommunicationTrigger$Meta = this.meta;
        String str3 = this.div;
        StringBuilder m = f1d.m("WithJson(screenId=", str, ", feedbackToken=", str2, ", meta=");
        m.append(internalCommunicationTrigger$Meta);
        m.append(", div=");
        m.append(str3);
        m.append(")");
        return m.toString();
    }
}
