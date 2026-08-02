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
public final class U1 {
    public static final void a(@NotNull H3 h3, @NotNull nbt nbtVar, boolean z, @NotNull Function0 function0, @NotNull Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        H3 h32;
        Function0 function03;
        Function0 function04;
        yci yciVar2;
        h3.getClass();
        nbtVar.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(214944612);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(h3) ? 4 : 2) | i;
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
            i2 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
            h32 = h3;
            yciVar2 = yciVar;
            function04 = function02;
            function03 = function0;
        } else {
            int i3 = (i2 & 14) | 24576;
            int i4 = i2 >> 6;
            int i5 = i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168);
            h32 = h3;
            C1139ma.a(h32, function0, function02, yciVar, ild.s(oq5Var, -1770505050, new S1(nbtVar, z)), oq5Var, i5);
            function03 = function0;
            function04 = function02;
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new T1(h32, nbtVar, z, function03, function04, yciVar2, i);
        }
    }
}
