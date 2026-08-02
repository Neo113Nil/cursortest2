package com.yandex.passport.internal.ui.common.screen;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.common.analytics.f;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.kjn;
import defpackage.kwd;
import defpackage.oq5;
import defpackage.vkg;
import defpackage.xmn;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class e {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Throwable th, boolean z, boolean z2, Function0 function0, hq5 hq5Var, int i, int i2) {
        Throwable th2;
        int i3;
        boolean z3;
        String str;
        boolean z4;
        Object K;
        boolean h;
        Object K2;
        boolean z5;
        xmn r;
        th.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1714860254);
        if ((i & 6) == 0) {
            th2 = th;
            i3 = (oq5Var.h(th2) ? 4 : 2) | i;
        } else {
            th2 = th;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z2;
            i3 |= oq5Var.g(z3) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= oq5Var.h(function0) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                boolean z6 = i4 == 0 ? false : z3;
                com.yandex.passport.common.common.a applicationDetailsProvider = com.yandex.passport.internal.di.a.a().getApplicationDetailsProvider();
                f analyticalIdentifiersProvider = com.yandex.passport.internal.di.a.a().getAnalyticalIdentifiersProvider();
                applicationDetailsProvider.getClass();
                analyticalIdentifiersProvider.getClass();
                String a = ((com.yandex.passport.internal.common.d) applicationDetailsProvider).a();
                str = analyticalIdentifiersProvider.b().a;
                if (str == null) {
                    str = "";
                }
                c cVar = new c(th2, a, str, new SimpleDateFormat("HH:mm (z) dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime()).toString(), z, z6);
                Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                z4 = (i3 & 7168) != 2048;
                K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (!z4 || K == kjnVar) {
                    K = new d(0, function0);
                    oq5Var.k0(K);
                }
                Function0 function02 = (Function0) K;
                h = oq5Var.h(context);
                K2 = oq5Var.K();
                if (!h || K2 == kjnVar) {
                    K2 = new kwd(context, 5);
                    oq5Var.k0(K2);
                }
                b.c(cVar, function02, (Function1) K2, oq5Var, 0);
                z5 = z6;
            } else {
                oq5Var.S();
                z5 = z3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new vkg(th, z, z5, function0, i, i2, 5);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        com.yandex.passport.common.common.a applicationDetailsProvider2 = com.yandex.passport.internal.di.a.a().getApplicationDetailsProvider();
        f analyticalIdentifiersProvider2 = com.yandex.passport.internal.di.a.a().getAnalyticalIdentifiersProvider();
        applicationDetailsProvider2.getClass();
        analyticalIdentifiersProvider2.getClass();
        String a2 = ((com.yandex.passport.internal.common.d) applicationDetailsProvider2).a();
        str = analyticalIdentifiersProvider2.b().a;
        if (str == null) {
        }
        c cVar2 = new c(th2, a2, str, new SimpleDateFormat("HH:mm (z) dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime()).toString(), z, z6);
        Context context2 = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        if ((i3 & 7168) != 2048) {
        }
        K = oq5Var.K();
        kjn kjnVar2 = gq5.a;
        if (!z4) {
        }
        K = new d(0, function0);
        oq5Var.k0(K);
        Function0 function022 = (Function0) K;
        h = oq5Var.h(context2);
        K2 = oq5Var.K();
        if (!h) {
        }
        K2 = new kwd(context2, 5);
        oq5Var.k0(K2);
        b.c(cVar2, function022, (Function1) K2, oq5Var, 0);
        z5 = z6;
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
