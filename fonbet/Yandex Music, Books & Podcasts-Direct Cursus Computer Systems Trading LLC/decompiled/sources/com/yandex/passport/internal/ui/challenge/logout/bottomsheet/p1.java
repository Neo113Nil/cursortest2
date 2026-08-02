package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import defpackage.b28;
import defpackage.d85;
import defpackage.hq5;
import defpackage.ild;
import defpackage.j26;
import defpackage.knn;
import defpackage.lqv;
import defpackage.mqr;
import defpackage.mqv;
import defpackage.nqv;
import defpackage.oq5;
import defpackage.oqv;
import defpackage.q5g;
import defpackage.sbi;
import defpackage.vci;
import defpackage.wn5;
import defpackage.xmn;
import defpackage.yci;
import defpackage.zcq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class p1 {
    public static Unit a(View view, boolean z) {
        ViewParent parent = view.getParent();
        b28 b28Var = parent instanceof b28 ? (b28) parent : null;
        Window window = b28Var != null ? b28Var.getWindow() : null;
        if (window != null) {
            q5g.I(window, false);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
            if (i >= 26) {
                knn knnVar = new knn(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new oqv(window, knnVar) : i2 >= 30 ? new nqv(window, knnVar) : i2 >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar)).j0(!z);
            }
        }
        return Unit.a;
    }

    public static final void b(Function0 function0, yci yciVar, zcq zcqVar, wn5 wn5Var, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var;
        yci yciVar3;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1237746168);
        int i2 = i | (oq5Var2.h(function0) ? 4 : 2) | 48 | (oq5Var2.f(zcqVar) ? 256 : 128);
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar3 = yciVar;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                yciVar2 = vci.a;
            } else {
                oq5Var2.S();
                yciVar2 = yciVar;
            }
            oq5Var2.q();
            int i3 = (i2 & 14) | 805503024 | (i2 & 896);
            yci yciVar4 = yciVar2;
            oq5Var = oq5Var2;
            sbi.a(function0, yciVar4, zcqVar, 0.0f, null, d85.m, 0L, 0.0f, 0L, d.a, new com.yandex.passport.internal.methods.performer.v0(5), null, ild.C(-1578917595, new j26(wn5Var, 17), oq5Var2), oq5Var, i3);
            yciVar3 = yciVar4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 18, function0, yciVar3, zcqVar, wn5Var);
        }
    }
}
