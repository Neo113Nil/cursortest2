package com.yandex.music.shared.network.retrofit;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.gfb;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/music/shared/network/retrofit/NewBackendFormatError;", "", "", "name", Constants.KEY_MESSAGE, "requestId", "Lgfb;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgfb;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "Lgfb;", "a", "()Lgfb;", "shared-network"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class NewBackendFormatError {

    @SerializedName("details")
    private final gfb details;

    @SerializedName(Constants.KEY_MESSAGE)
    private final String message;

    @SerializedName("name")
    private final String name;

    @SerializedName("requestId")
    private final String requestId;

    public NewBackendFormatError(String str, String str2, String str3, gfb gfbVar) {
        this.name = str;
        this.message = str2;
        this.requestId = str3;
        this.details = gfbVar;
    }

    /* renamed from: a, reason: from getter */
    public final gfb getDetails() {
        return this.details;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public /* synthetic */ NewBackendFormatError(String str, String str2, String str3, gfb gfbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : gfbVar);
    }
}
