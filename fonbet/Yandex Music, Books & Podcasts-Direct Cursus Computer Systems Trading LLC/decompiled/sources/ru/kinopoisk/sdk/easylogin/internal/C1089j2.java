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

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1089j2 {
    public static final void a(yci yciVar, @NotNull nbt nbtVar, @NotNull H3 h3, @NotNull Function0 function0, @NotNull Function0 function02, @NotNull Function0 function03, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        H3 h32;
        Function0 function04;
        Function0 function05;
        nbtVar.getClass();
        h3.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1253166143);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(nbtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(h3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            h32 = h3;
            function05 = function03;
            function04 = function02;
        } else {
            int i3 = i2 >> 9;
            yciVar2 = yciVar;
            h32 = h3;
            C1139ma.a(h32, function02, function03, yciVar2, ild.s(oq5Var, 1998420031, new C1061h2(nbtVar, function0)), oq5Var, ((i2 >> 6) & 14) | 24576 | (i3 & 112) | (i3 & 896) | ((i2 << 9) & 7168));
            function04 = function02;
            function05 = function03;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1075i2(yciVar2, nbtVar, h32, function0, function04, function05, i);
        }
    }
}
