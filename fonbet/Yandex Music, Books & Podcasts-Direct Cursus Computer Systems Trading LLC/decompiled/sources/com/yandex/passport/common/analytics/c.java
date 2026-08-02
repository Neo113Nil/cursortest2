package com.yandex.passport.common.analytics;

import defpackage.hrg;
import defpackage.r7o;
import defpackage.z7o;
import defpackage.zt3;
import io.appmetrica.analytics.IParamsCallback;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class c implements IParamsCallback {
    public final zt3 a;

    public c(zt3 zt3Var) {
        this.a = zt3Var;
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onReceive(IParamsCallback.Result result) {
        zt3 zt3Var = this.a;
        if (zt3Var.w()) {
            String str = null;
            String deviceId = result != null ? result.getDeviceId() : null;
            String uuid = result != null ? result.getUuid() : null;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, hrg.r("Metrica requestStartupIdentifiers onReceive, deviceId=", deviceId, ", uuid=", uuid), 8);
            }
            if (deviceId == null) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Metrica requestStartupIdentifiers: no device id got from metrica", 8);
                }
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(null);
                return;
            }
            r7o r7oVar2 = z7o.b;
            if (StringsKt.U(deviceId)) {
                deviceId = null;
            }
            if (deviceId == null) {
                deviceId = null;
            }
            if (uuid != null) {
                if (StringsKt.U(uuid)) {
                    uuid = null;
                }
                if (uuid != null) {
                    str = uuid;
                }
            }
            zt3Var.resumeWith(new b(deviceId, str));
        }
    }

    @Override // io.appmetrica.analytics.IParamsCallback
    public final void onRequestError(IParamsCallback.Reason reason, IParamsCallback.Result result) {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Metrica requestStartupIdentifiers onRequestError, reason=" + reason, 8);
        }
        zt3 zt3Var = this.a;
        if (zt3Var.w()) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(null);
        }
    }
}
