package androidx.compose.foundation.selection;

import androidx.compose.foundation.e;
import defpackage.cje;
import defpackage.meo;
import defpackage.uoi;
import defpackage.vci;
import defpackage.vnj;
import defpackage.yci;
import defpackage.yie;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class b {
    public static final yci a(yci yciVar, boolean z, uoi uoiVar, yie yieVar, boolean z2, meo meoVar, Function0 function0) {
        yci f;
        if (yieVar instanceof cje) {
            f = new SelectableElement(z, uoiVar, (cje) yieVar, z2, meoVar, function0);
        } else if (yieVar == null) {
            f = new SelectableElement(z, uoiVar, null, z2, meoVar, function0);
        } else {
            vci vciVar = vci.a;
            f = uoiVar != null ? e.a(vciVar, uoiVar, yieVar).f(new SelectableElement(z, uoiVar, null, z2, meoVar, function0)) : vnj.q(vciVar, new a(yieVar, z, z2, meoVar, function0, 0));
        }
        return yciVar.f(f);
    }

    public static final yci b(boolean z, uoi uoiVar, yie yieVar, boolean z2, meo meoVar, Function1 function1) {
        if (yieVar instanceof cje) {
            return new ToggleableElement(z, uoiVar, (cje) yieVar, z2, meoVar, function1);
        }
        if (yieVar == null) {
            return new ToggleableElement(z, uoiVar, null, z2, meoVar, function1);
        }
        vci vciVar = vci.a;
        return uoiVar != null ? e.a(vciVar, uoiVar, yieVar).f(new ToggleableElement(z, uoiVar, null, z2, meoVar, function1)) : vnj.q(vciVar, new a(yieVar, z, z2, meoVar, function1, 1));
    }
}
