package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import defpackage.sn5;
import defpackage.xmn;
import defpackage.yci;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.ma, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1139ma {
    public static final void a(@NotNull H3 h3, @NotNull Function0 function0, @NotNull Function0 function02, yci yciVar, @NotNull sn5 sn5Var, hq5 hq5Var, int i) {
        int i2;
        h3.getClass();
        function0.getClass();
        function02.getClass();
        sn5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1077923049);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(h3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(sn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            C1029ec.a(N4.Redesigned, ild.s(oq5Var, 641945963, new C1111ka(function0, function02, yciVar, h3, sn5Var)), oq5Var, 54);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1125la(h3, function0, function02, yciVar, sn5Var, i);
        }
    }
}
