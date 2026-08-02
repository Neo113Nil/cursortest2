package com.yandex.music.core.ui.compose;

import defpackage.ex;
import defpackage.gq5;
import defpackage.h80;
import defpackage.hq5;
import defpackage.i80;
import defpackage.oq5;
import defpackage.pyc;
import defpackage.s2;
import defpackage.ug3;
import defpackage.vci;
import defpackage.xmn;
import defpackage.yci;
import defpackage.ynn;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class a {
    public static final void a(Function0 function0, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1158045792);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new ex(1, function0);
                oq5Var.k0(K);
            }
            ug3.a(androidx.compose.ui.draw.a.a(vci.a, (Function1) K), oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i80(i, 0, function0, false);
        }
    }

    public static yci b(yci yciVar, ynn ynnVar, long j, float f, Function0 function0, Function2 function2, int i) {
        if ((i & 1) != 0) {
            ynnVar = null;
        }
        ynn ynnVar2 = ynnVar;
        if ((i & 2) != 0) {
            j = 1000;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = 0.8f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            function0 = new s2(28);
        }
        Function0 function02 = function0;
        yciVar.getClass();
        function02.getClass();
        function2.getClass();
        return yciVar.f(new VisibilityChangedElement(f2, j2, new h80(function2, 0), ynnVar2, "", function02));
    }

    public static yci c(yci yciVar, ynn ynnVar, Object obj, pyc pycVar, int i) {
        if ((i & 1) != 0) {
            ynnVar = null;
        }
        s2 s2Var = new s2(28);
        yciVar.getClass();
        pycVar.getClass();
        return yciVar.f(new VisibilityChangedElement(0.8f, 1000L, pycVar, ynnVar, obj, s2Var));
    }
}
