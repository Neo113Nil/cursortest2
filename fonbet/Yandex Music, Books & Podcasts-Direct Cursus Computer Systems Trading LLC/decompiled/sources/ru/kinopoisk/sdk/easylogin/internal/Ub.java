package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aae;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.nfp;
import defpackage.oq5;
import defpackage.rvf;
import defpackage.xmn;
import defpackage.yci;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;

/* loaded from: classes5.dex */
public final class Ub {
    public static final void a(yci yciVar, long j, long j2, @NotNull Function0 function0, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(391372709);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.e(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            String M = rvf.M(R.string.close, oq5Var);
            yci a = androidx.compose.ui.platform.a.a(yciVar, "UiKitCloseButton");
            oq5Var.a0(1881498516);
            boolean f = oq5Var.f(M);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new Rb(M);
                oq5Var.k0(K);
            }
            oq5Var.p(false);
            aae.a(function0, nfp.b(a, false, (Function1) K), false, ild.s(oq5Var, -1402678647, new Sb(j2, j)), oq5Var, ((i2 >> 9) & 14) | 24576, 12);
            function02 = function0;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Tb(yciVar, j, j2, function02, i);
        }
    }
}
