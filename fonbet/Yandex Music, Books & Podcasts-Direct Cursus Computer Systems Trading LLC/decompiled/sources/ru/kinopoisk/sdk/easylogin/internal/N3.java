package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.hq5;
import defpackage.ild;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.xmn;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class N3 {
    public static final void a(yci yciVar, @NotNull H3 h3, @NotNull nbt nbtVar, boolean z, @NotNull Function0 function0, @NotNull Function0 function02, @NotNull Function0 function03, @NotNull Function0 function04, hq5 hq5Var, int i) {
        int i2;
        Function0 function05;
        h3.getClass();
        nbtVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-778976040);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(h3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(nbtVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function05 = function0;
            i2 |= oq5Var.h(function05) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function05 = function0;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.h(function03) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var.h(function04) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i2) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            C1139ma.a(h3, function05, function04, yciVar, ild.s(oq5Var, 2118318166, new L3(yciVar, nbtVar, h3, function02, z, function03)), oq5Var, ((i2 >> 3) & 14) | 24576 | ((i2 >> 9) & 112) | ((i2 >> 15) & 896) | ((i2 << 9) & 7168));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new M3(yciVar, h3, nbtVar, z, function0, function02, function03, function04, i);
        }
    }
}
