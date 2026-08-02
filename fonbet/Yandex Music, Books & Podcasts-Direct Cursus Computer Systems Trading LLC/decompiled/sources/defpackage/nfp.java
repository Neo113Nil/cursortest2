package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class nfp {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static final yci a(yci yciVar, Function1 function1) {
        return yciVar.f(new ClearAndSetSemanticsElement(function1));
    }

    public static final yci b(yci yciVar, boolean z, Function1 function1) {
        return yciVar.f(new AppendedSemanticsElement(z, function1));
    }
}
