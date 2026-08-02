package com.yandex.music.shared.network.api.retrofit;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import defpackage.f1d;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/music/shared/network/api/retrofit/MusicBackendHttpException;", "Ljava/io/IOException;", "shared-network"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class MusicBackendHttpException extends IOException {
    public final int a;
    public final MusicBackendInvocationError b;
    public final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicBackendHttpException(int i, MusicBackendInvocationError musicBackendInvocationError, String str) {
        super(r0.toString());
        musicBackendInvocationError.getClass();
        str.getClass();
        StringBuilder m = f1d.m("ErrorResponse: ", musicBackendInvocationError.getName(), " - ", musicBackendInvocationError.getMessage(), ", url=");
        m.append(str);
        this.a = i;
        this.b = musicBackendInvocationError;
        this.c = str;
    }
}
