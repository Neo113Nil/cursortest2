package com.yandex.passport.internal.network.requester;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.legacy.lx.h;
import com.yandex.passport.legacy.lx.i;
import defpackage.v2o;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class e {
    public final OkHttpClient a;
    public final v2o b = new v2o(RemoteCameraConfig.Camera.BITRATE, 1);

    public e(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
    }

    public final h a(String str) {
        i iVar = new i(new c(this, str, 0));
        return new h(iVar, iVar, new d(this, str), 0);
    }
}
