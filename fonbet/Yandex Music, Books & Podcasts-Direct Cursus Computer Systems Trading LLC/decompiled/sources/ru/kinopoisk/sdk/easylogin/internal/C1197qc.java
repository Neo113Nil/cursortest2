package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import defpackage.sn5;
import defpackage.xmn;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.qc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1197qc {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull Function0 function0, yci yciVar, InterfaceC1129m0 interfaceC1129m0, EnumC1087j0 enumC1087j0, boolean z, EnumC1073i0 enumC1073i0, @NotNull sn5 sn5Var, hq5 hq5Var, int i, int i2) {
        Function0 function02;
        int i3;
        InterfaceC1129m0 interfaceC1129m02;
        EnumC1073i0 enumC1073i02;
        boolean z2;
        Object K;
        EnumC1073i0 enumC1073i03;
        boolean z3;
        xmn r;
        function0.getClass();
        sn5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1657669875);
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (oq5Var.h(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            interfaceC1129m02 = interfaceC1129m0;
            i3 |= oq5Var.f(interfaceC1129m02) ? 256 : 128;
        } else {
            interfaceC1129m02 = interfaceC1129m0;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(enumC1087j0) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            enumC1073i02 = enumC1073i0;
            i4 |= oq5Var.f(enumC1073i02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                i4 |= oq5Var.h(sn5Var) ? 1048576 : 524288;
            }
            if ((599187 & i4) == 599186 || !oq5Var.z()) {
                if (i5 != 0) {
                    enumC1073i02 = EnumC1073i0.Start;
                }
                EnumC1073i0 enumC1073i04 = enumC1073i02;
                oq5Var.a0(53217758);
                z2 = (i4 & 7168) != 2048;
                K = oq5Var.K();
                if (!z2 || K == gq5.a) {
                    K = new C1068h9(enumC1087j0, enumC1073i04);
                    oq5Var.k0(K);
                }
                oq5Var.p(false);
                int i6 = i4;
                int i7 = 1572864 | (i6 & 14);
                int i8 = i6 >> 3;
                C0989c0.a(function02, interfaceC1129m02, enumC1087j0, androidx.compose.ui.platform.a.a(yciVar, "UiKitTextIconButton-BaseButton"), C1155nc.a(enumC1087j0), ild.s(oq5Var, 1797358639, new C1169oc(sn5Var, (C1068h9) K)), oq5Var, (i8 & 7168) | i7 | (i8 & 112) | (i8 & 896));
                enumC1073i03 = enumC1073i04;
                z3 = true;
            } else {
                oq5Var.S();
                enumC1073i03 = enumC1073i02;
                z3 = z;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new C1183pc(function0, yciVar, interfaceC1129m0, enumC1087j0, z3, enumC1073i03, sn5Var, i, i2);
                return;
            }
            return;
        }
        enumC1073i02 = enumC1073i0;
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
        }
        if ((599187 & i4) == 599186) {
        }
        if (i5 != 0) {
        }
        EnumC1073i0 enumC1073i042 = enumC1073i02;
        oq5Var.a0(53217758);
        if ((i4 & 7168) != 2048) {
        }
        K = oq5Var.K();
        if (!z2) {
        }
        K = new C1068h9(enumC1087j0, enumC1073i042);
        oq5Var.k0(K);
        oq5Var.p(false);
        int i62 = i4;
        int i72 = 1572864 | (i62 & 14);
        int i82 = i62 >> 3;
        C0989c0.a(function02, interfaceC1129m02, enumC1087j0, androidx.compose.ui.platform.a.a(yciVar, "UiKitTextIconButton-BaseButton"), C1155nc.a(enumC1087j0), ild.s(oq5Var, 1797358639, new C1169oc(sn5Var, (C1068h9) K)), oq5Var, (i82 & 7168) | i72 | (i82 & 112) | (i82 & 896));
        enumC1073i03 = enumC1073i042;
        z3 = true;
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
