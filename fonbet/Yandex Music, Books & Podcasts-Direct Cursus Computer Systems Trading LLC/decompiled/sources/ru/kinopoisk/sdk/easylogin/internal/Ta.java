package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.bqi;
import defpackage.hq5;
import defpackage.ild;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.xmn;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ta {
    public static final void a(@NotNull bqi bqiVar, @NotNull nbt nbtVar, boolean z, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, hq5 hq5Var, int i) {
        int i2;
        bqiVar.getClass();
        nbtVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1587865957);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(bqiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(nbtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.h(function03) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var.h(function04) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i2 & 4793491) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            C1029ec.a(N4.Redesigned, ild.s(oq5Var, 49120675, new Ra(bqiVar, function02, function0, function1, nbtVar, z, function03, function04)), oq5Var, 54);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Sa(bqiVar, nbtVar, z, function0, function02, function1, function03, function04, i);
        }
    }
}
