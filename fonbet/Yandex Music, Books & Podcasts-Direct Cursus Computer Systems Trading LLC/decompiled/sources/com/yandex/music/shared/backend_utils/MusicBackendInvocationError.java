package com.yandex.music.shared.backend_utils;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import defpackage.gfb;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/music/shared/backend_utils/MusicBackendInvocationError;", "", "", "name", Constants.KEY_MESSAGE, "Lgfb;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgfb;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lgfb;", "a", "()Lgfb;", "shared-music-backend-utils"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class MusicBackendInvocationError {

    @SerializedName("details")
    private final gfb details;

    @SerializedName(Constants.KEY_MESSAGE)
    private final String message;

    @SerializedName("name")
    private final String name;

    public MusicBackendInvocationError(String str, String str2, gfb gfbVar) {
        this.name = str;
        this.message = str2;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicBackendInvocationError)) {
            return false;
        }
        MusicBackendInvocationError musicBackendInvocationError = (MusicBackendInvocationError) obj;
        return Intrinsics.d(this.name, musicBackendInvocationError.name) && Intrinsics.d(this.message, musicBackendInvocationError.message) && Intrinsics.d(this.details, musicBackendInvocationError.details);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        gfb gfbVar = this.details;
        return hashCode2 + (gfbVar != null ? gfbVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.message;
        gfb gfbVar = this.details;
        StringBuilder m = f1d.m("MusicBackendInvocationError(name=", str, ", message=", str2, ", details=");
        m.append(gfbVar);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ MusicBackendInvocationError(String str, String str2, gfb gfbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : gfbVar);
    }
}
