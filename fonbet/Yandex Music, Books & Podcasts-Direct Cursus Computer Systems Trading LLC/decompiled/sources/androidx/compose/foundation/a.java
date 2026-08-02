package androidx.compose.foundation;

import android.view.KeyEvent;
import defpackage.ai3;
import defpackage.bxj;
import defpackage.cje;
import defpackage.dup;
import defpackage.faf;
import defpackage.geo;
import defpackage.j2k;
import defpackage.jic;
import defpackage.jn4;
import defpackage.jp4;
import defpackage.kjn;
import defpackage.kn4;
import defpackage.meo;
import defpackage.mvn;
import defpackage.mxo;
import defpackage.qg0;
import defpackage.saf;
import defpackage.uoi;
import defpackage.vci;
import defpackage.vnj;
import defpackage.xp3;
import defpackage.yci;
import defpackage.yie;
import defpackage.zl0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class a {
    public static yci a(yci yciVar, ai3 ai3Var) {
        return yciVar.f(new BackgroundElement(0L, ai3Var, vnj.i, 1));
    }

    public static final yci b(yci yciVar, long j, dup dupVar) {
        return yciVar.f(new BackgroundElement(j, null, dupVar, 2));
    }

    public static final yci c(yci yciVar, uoi uoiVar, yie yieVar, boolean z, String str, meo meoVar, Function0 function0) {
        yci f;
        if (yieVar instanceof cje) {
            f = new ClickableElement(uoiVar, (cje) yieVar, z, str, meoVar, function0);
        } else if (yieVar == null) {
            f = new ClickableElement(uoiVar, null, z, str, meoVar, function0);
        } else {
            vci vciVar = vci.a;
            f = uoiVar != null ? e.a(vciVar, uoiVar, yieVar).f(new ClickableElement(uoiVar, null, z, str, meoVar, function0)) : vnj.q(vciVar, new b(yieVar, z, str, meoVar, function0));
        }
        return yciVar.f(f);
    }

    public static /* synthetic */ yci d(yci yciVar, uoi uoiVar, yie yieVar, boolean z, String str, meo meoVar, Function0 function0, int i) {
        meo meoVar2;
        yci yciVar2;
        uoi uoiVar2;
        yie yieVar2;
        Function0 function02;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        String str2 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            meoVar2 = null;
            uoiVar2 = uoiVar;
            yieVar2 = yieVar;
            function02 = function0;
            yciVar2 = yciVar;
        } else {
            meoVar2 = meoVar;
            yciVar2 = yciVar;
            uoiVar2 = uoiVar;
            yieVar2 = yieVar;
            function02 = function0;
        }
        return c(yciVar2, uoiVar2, yieVar2, z2, str2, meoVar2, function02);
    }

    public static yci e(yci yciVar, boolean z, String str, meo meoVar, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            meoVar = null;
        }
        return vnj.q(yciVar, new jn4(z, str, meoVar, function0));
    }

    public static /* synthetic */ yci f(yci yciVar, uoi uoiVar, geo geoVar, boolean z, meo meoVar, Function0 function0, Function0 function02, Function0 function03, int i) {
        yci f;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        meo meoVar2 = (i & 16) != 0 ? null : meoVar;
        Function0 function04 = (i & 64) != 0 ? null : function0;
        Function0 function05 = (i & 128) != 0 ? null : function02;
        if (geoVar != null) {
            f = new CombinedClickableElement(geoVar, uoiVar, meoVar2, null, null, function03, function04, function05, z2);
        } else if (geoVar == null) {
            f = new CombinedClickableElement(null, uoiVar, meoVar2, null, null, function03, function04, function05, z2);
        } else {
            vci vciVar = vci.a;
            f = uoiVar != null ? e.a(vciVar, uoiVar, geoVar).f(new CombinedClickableElement(null, uoiVar, meoVar2, null, null, function03, function04, function05, z2)) : vnj.q(vciVar, new c(geoVar, z2, meoVar2, function03, function04, function05));
        }
        return yciVar.f(f);
    }

    public static final yci g(yci yciVar, uoi uoiVar, yie yieVar, boolean z, String str, meo meoVar, String str2, Function0 function0, Function0 function02, Function0 function03) {
        yci f;
        if (yieVar instanceof cje) {
            f = new CombinedClickableElement((cje) yieVar, uoiVar, meoVar, str, str2, function03, function0, function02, z);
        } else if (yieVar == null) {
            f = new CombinedClickableElement(null, uoiVar, meoVar, str, str2, function03, function0, function02, z);
        } else {
            vci vciVar = vci.a;
            f = uoiVar != null ? e.a(vciVar, uoiVar, yieVar).f(new CombinedClickableElement(null, uoiVar, meoVar, str, str2, function03, function0, function02, z)) : vnj.q(vciVar, new d(yieVar, z, str, meoVar, function03, str2, function0, function02));
        }
        return yciVar.f(f);
    }

    public static /* synthetic */ yci i(yci yciVar, String str, Function0 function0, Function0 function02, int i) {
        if ((i & 8) != 0) {
            str = null;
        }
        return vnj.q(yciVar, new zl0(3, str, function0, function02));
    }

    public static yci j(yci yciVar, String str, Function0 function0, Function0 function02, int i) {
        if ((i & 8) != 0) {
            str = null;
        }
        return vnj.q(yciVar, new kn4(true, null, null, str, function0, null, function02));
    }

    public static final yci k(yci yciVar, boolean z, uoi uoiVar) {
        return yciVar.f(z ? new FocusableElement(uoiVar) : vci.a);
    }

    public static yci l(yci yciVar, uoi uoiVar) {
        return yciVar.f(new HoverableElement(uoiVar));
    }

    public static final boolean m(KeyEvent keyEvent) {
        long R = saf.R(keyEvent);
        int i = faf.n;
        if (faf.a(R, faf.f) ? true : faf.a(R, faf.i) ? true : faf.a(R, faf.m)) {
            return true;
        }
        return faf.a(R, faf.h);
    }

    public static final yci n(yci yciVar, mxo mxoVar, bxj bxjVar, boolean z, boolean z2, jic jicVar, uoi uoiVar, boolean z3, qg0 qg0Var, j2k j2kVar) {
        float f = jp4.a;
        bxj bxjVar2 = bxj.a;
        vci vciVar = vci.a;
        return yciVar.f(bxjVar == bxjVar2 ? xp3.u(vciVar, kjn.i) : xp3.u(vciVar, mvn.f)).f(new ScrollingContainerElement(qg0Var, j2kVar, jicVar, uoiVar, bxjVar, mxoVar, z, z2, z3));
    }
}
