package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bsf extends vut {
    public final ukn k = new ukn(this);
    public final x0 l = new x0(20, (byte) 0);
    public boolean m;

    public bsf(Function1 function1) {
        function1.invoke(this);
    }

    public static void X(bsf bsfVar, Function1 function1, wn5 wn5Var, int i) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        bsfVar.l.n(1, new asf(null, function1 != null ? new y5(17, function1) : xce.D, new u8b(1, 10), new wn5(new lh0(1, wn5Var), -34608120, true)));
        if (function1 != null) {
            bsfVar.m = true;
        }
    }

    @Override // defpackage.vut
    public final x0 G() {
        return this.l;
    }

    public final void Y(int i, u8b u8bVar, Function1 function1, wn5 wn5Var) {
        this.l.n(i, new asf(u8bVar, xce.D, function1, wn5Var));
    }
}
