package androidx.compose.ui.input.key;

import defpackage.yci;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {
    public static final yci a(yci yciVar, Function1 function1) {
        return yciVar.f(new KeyInputElement(function1, null));
    }

    public static final yci b(yci yciVar, Function1 function1) {
        return yciVar.f(new KeyInputElement(null, function1));
    }
}
