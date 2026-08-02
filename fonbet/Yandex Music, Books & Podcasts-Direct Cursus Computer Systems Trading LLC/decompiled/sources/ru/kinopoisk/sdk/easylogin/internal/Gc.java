package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.bqi;
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
public final class Gc {
    public static final void a(yci yciVar, @NotNull H3 h3, @NotNull nbt nbtVar, @NotNull bqi bqiVar, @NotNull Function0 function0, @NotNull Function0 function02, @NotNull Function0 function03, hq5 hq5Var, int i) {
        int i2;
        H3 h32;
        Function0 function04;
        Function0 function05;
        yci yciVar2;
        h3.getClass();
        nbtVar.getClass();
        bqiVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(297911083);
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
            i2 |= oq5Var.h(bqiVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.h(function03) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && oq5Var.z()) {
            oq5Var.S();
            h32 = h3;
            function05 = function03;
            yciVar2 = yciVar;
            function04 = function02;
        } else {
            int i3 = i2 >> 12;
            h32 = h3;
            C1139ma.a(h32, function02, function03, yciVar, ild.s(oq5Var, -1290772115, new Ec(bqiVar, nbtVar, function0)), oq5Var, ((i2 >> 3) & 14) | 24576 | (i3 & 112) | (i3 & 896) | ((i2 << 9) & 7168));
            function04 = function02;
            function05 = function03;
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Fc(yciVar2, h32, nbtVar, bqiVar, function0, function04, function05, i);
        }
    }
}
