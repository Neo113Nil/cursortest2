package androidx.compose.ui.focus;

import defpackage.yci;
import defpackage.yoc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {
    public static final yci a(yci yciVar, yoc yocVar) {
        return yciVar.f(new FocusRequesterElement(yocVar));
    }

    public static final yci b(yci yciVar, Function1 function1) {
        return yciVar.f(new FocusChangedElement(function1));
    }
}
