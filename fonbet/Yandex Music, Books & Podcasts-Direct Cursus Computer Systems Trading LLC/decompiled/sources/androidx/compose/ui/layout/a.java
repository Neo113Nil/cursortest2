package androidx.compose.ui.layout;

import defpackage.ffh;
import defpackage.pyc;
import defpackage.yci;
import defpackage.zof;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {
    public static final Object a(ffh ffhVar) {
        Object n = ffhVar.n();
        zof zofVar = n instanceof zof ? (zof) n : null;
        if (zofVar != null) {
            return zofVar.o;
        }
        return null;
    }

    public static final yci b(yci yciVar, pyc pycVar) {
        return yciVar.f(new LayoutElement(pycVar));
    }

    public static final yci c(yci yciVar, Object obj) {
        return yciVar.f(new LayoutIdElement(obj));
    }

    public static final yci d(yci yciVar, Function1 function1) {
        return yciVar.f(new OnGloballyPositionedElement(function1));
    }

    public static final yci e(yci yciVar, Function1 function1) {
        return yciVar.f(new OnPlacedElement(function1));
    }

    public static final yci f(yci yciVar, Function1 function1) {
        return yciVar.f(new OnSizeChangedModifier(function1));
    }
}
