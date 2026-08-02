package com.yandex.music.shared.bdu.trigger.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.mte;
import defpackage.rv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Div$WithData", "", "", "screenId", "feedbackToken", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;", "meta", "Lrv8;", "div", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;Lrv8;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;", "a", "()Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;", "Lrv8;", "c", "()Lrv8;", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class InternalCommunicationTrigger$Div$WithData implements mte {

    @SerializedName("div")
    @NotNull
    private final rv8 div;

    @SerializedName("feedbackToken")
    @NotNull
    private final String feedbackToken;

    @SerializedName("meta")
    @NotNull
    private final InternalCommunicationTrigger$Meta meta;

    @SerializedName("screenId")
    @NotNull
    private final String screenId;

    public InternalCommunicationTrigger$Div$WithData(@NotNull String str, @NotNull String str2, @NotNull InternalCommunicationTrigger$Meta internalCommunicationTrigger$Meta, @NotNull rv8 rv8Var) {
        str.getClass();
        str2.getClass();
        internalCommunicationTrigger$Meta.getClass();
        rv8Var.getClass();
        this.screenId = str;
        this.feedbackToken = str2;
        this.meta = internalCommunicationTrigger$Meta;
        this.div = rv8Var;
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
    public final rv8 getDiv() {
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
        if (!(obj instanceof InternalCommunicationTrigger$Div$WithData)) {
            return false;
        }
        InternalCommunicationTrigger$Div$WithData internalCommunicationTrigger$Div$WithData = (InternalCommunicationTrigger$Div$WithData) obj;
        return Intrinsics.d(this.screenId, internalCommunicationTrigger$Div$WithData.screenId) && Intrinsics.d(this.feedbackToken, internalCommunicationTrigger$Div$WithData.feedbackToken) && Intrinsics.d(this.meta, internalCommunicationTrigger$Div$WithData.meta) && Intrinsics.d(this.div, internalCommunicationTrigger$Div$WithData.div);
    }

    public final int hashCode() {
        return this.div.hashCode() + ((this.meta.hashCode() + k5r.c(this.screenId.hashCode() * 31, 31, this.feedbackToken)) * 31);
    }

    public final String toString() {
        String str = this.screenId;
        String str2 = this.feedbackToken;
        InternalCommunicationTrigger$Meta internalCommunicationTrigger$Meta = this.meta;
        rv8 rv8Var = this.div;
        StringBuilder m = f1d.m("WithData(screenId=", str, ", feedbackToken=", str2, ", meta=");
        m.append(internalCommunicationTrigger$Meta);
        m.append(", div=");
        m.append(rv8Var);
        m.append(")");
        return m.toString();
    }
}
