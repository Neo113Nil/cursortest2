package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xaf extends xci implements waf {
    public Function1 o;
    public Function1 p;

    @Override // defpackage.waf
    public final boolean Q(KeyEvent keyEvent) {
        Function1 function1 = this.p;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new qaf(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.waf
    public final boolean Y(KeyEvent keyEvent) {
        Function1 function1 = this.o;
        if (function1 != null) {
            return ((Boolean) function1.invoke(new qaf(keyEvent))).booleanValue();
        }
        return false;
    }
}
