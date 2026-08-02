package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.bqi;
import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import defpackage.xmn;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1076i3 {
    public static final void a(yci yciVar, @NotNull H3 h3, @NotNull bqi bqiVar, @NotNull Function1 function1, @NotNull Function0 function0, @NotNull Function0 function02, hq5 hq5Var, int i) {
        int i2;
        H3 h32;
        Function0 function03;
        Function0 function04;
        yci yciVar2;
        h3.getClass();
        bqiVar.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2133387571);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(h3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(bqiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
            h32 = h3;
            function04 = function02;
            yciVar2 = yciVar;
            function03 = function0;
        } else {
            int i3 = i2 >> 9;
            h32 = h3;
            C1139ma.a(h32, function0, function02, yciVar, ild.s(oq5Var, 1557563851, new C1048g3(bqiVar, function1)), oq5Var, ((i2 >> 3) & 14) | 24576 | (i3 & 112) | (i3 & 896) | ((i2 << 9) & 7168));
            function03 = function0;
            function04 = function02;
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1062h3(yciVar2, h32, bqiVar, function1, function03, function04, i);
        }
    }
}
