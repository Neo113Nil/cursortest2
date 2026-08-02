package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vuf extends vut {
    public final x0 k = new x0(20, (byte) 0);
    public roi l;

    public vuf(Function1 function1) {
        function1.invoke(this);
    }

    public static /* synthetic */ void Y(vuf vufVar, String str, pyc pycVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        vufVar.X(str, pycVar);
    }

    @Override // defpackage.vut
    public final x0 G() {
        return this.k;
    }

    public final void X(Object obj, pyc pycVar) {
        this.k.n(1, new tuf(obj != null ? new xk0(3, obj) : null, new u8b(1, 11), new wn5(new lh0(2, pycVar), -1010194746, true)));
    }

    public final void Z(int i, Function1 function1, Function1 function12, wn5 wn5Var) {
        this.k.n(i, new tuf(function1, function12, wn5Var));
    }
}
