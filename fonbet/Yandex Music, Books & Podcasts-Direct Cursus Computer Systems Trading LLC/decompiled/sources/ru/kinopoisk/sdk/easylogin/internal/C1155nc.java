package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import defpackage.b6e;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.o0k;
import defpackage.oq5;
import defpackage.sn5;
import defpackage.vci;
import defpackage.xmn;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.nc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1155nc {
    public static final void a(@NotNull Function0 function0, yci yciVar, InterfaceC1129m0 interfaceC1129m0, EnumC1087j0 enumC1087j0, boolean z, @NotNull sn5 sn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        boolean z2;
        function0.getClass();
        sn5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1850883335);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(interfaceC1129m0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(enumC1087j0) ? 2048 : 1024;
        }
        int i5 = i3 | 24576;
        if ((196608 & i) == 0) {
            i5 |= oq5Var.h(sn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i5) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            z2 = z;
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            oq5Var.a0(-406639853);
            boolean z3 = (i5 & 7168) == 2048;
            Object K = oq5Var.K();
            if (z3 || K == gq5.a) {
                K = new C1026e9(enumC1087j0);
                oq5Var.k0(K);
            }
            oq5Var.p(false);
            int i6 = i5 >> 3;
            yci yciVar3 = yciVar;
            C0989c0.a(function0, interfaceC1129m0, enumC1087j0, yciVar3, a(enumC1087j0), ild.s(oq5Var, 7017239, new C1127lc(sn5Var, (C1026e9) K)), oq5Var, (i5 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (i6 & 112) | (i6 & 896) | (i6 & 7168) | ((i5 << 9) & 57344));
            yciVar2 = yciVar3;
            z2 = true;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1141mc(function0, yciVar2, interfaceC1129m0, enumC1087j0, z2, sn5Var, i, i2);
        }
    }

    @NotNull
    public static final o0k a(@NotNull EnumC1087j0 enumC1087j0) {
        int i;
        enumC1087j0.getClass();
        int ordinal = enumC1087j0.ordinal();
        if (ordinal == 0) {
            i = 12;
        } else if (ordinal == 1) {
            i = 16;
        } else if (ordinal == 2) {
            i = 18;
        } else if (ordinal == 3) {
            i = 20;
        } else {
            if (ordinal != 4) {
                b6e.s();
                return null;
            }
            i = 22;
        }
        return androidx.compose.foundation.layout.a.a(i, 0.0f, 2);
    }
}
