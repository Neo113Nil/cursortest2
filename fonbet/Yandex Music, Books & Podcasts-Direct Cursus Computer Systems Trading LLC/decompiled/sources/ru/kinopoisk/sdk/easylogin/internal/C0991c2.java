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

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0991c2 {
    public static final void a(yci yciVar, @NotNull nbt nbtVar, @NotNull H3 h3, @NotNull Function0 function0, @NotNull Function0 function02, @NotNull Function0 function03, @NotNull Function0 function04, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        Function0 function05;
        H3 h32;
        Function0 function06;
        nbtVar.getClass();
        h3.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1787588122);
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
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.h(function04) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            function05 = function02;
            function06 = function0;
            h32 = h3;
        } else {
            int i3 = i2 >> 6;
            yciVar2 = yciVar;
            function05 = function02;
            C1139ma.a(h3, function0, function05, yciVar2, ild.s(oq5Var, 1913209752, new C0963a2(nbtVar, function03, function04)), oq5Var, (i3 & 896) | (i3 & 14) | 24576 | (i3 & 112) | ((i2 << 9) & 7168));
            h32 = h3;
            function06 = function0;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C0977b2(yciVar2, nbtVar, h32, function06, function05, function03, function04, i);
        }
    }
}
