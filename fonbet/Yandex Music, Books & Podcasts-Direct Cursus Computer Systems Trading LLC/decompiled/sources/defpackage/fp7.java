package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class fp7 extends o3k {
    public static final apo K = dag.B(kb5.X, e27.E);
    public final x6k J;

    public fp7(int i, float f, Function0 function0) {
        super(i, f);
        this.J = szf.g0(function0);
    }

    @Override // defpackage.o3k
    public final int n() {
        return ((Number) ((Function0) this.J.getValue()).invoke()).intValue();
    }
}
