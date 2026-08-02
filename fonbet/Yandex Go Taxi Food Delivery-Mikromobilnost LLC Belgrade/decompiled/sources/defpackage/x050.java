package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class x050 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ y050 b;

    public /* synthetic */ x050(y050 y050Var, int i) {
        this.a = i;
        this.b = y050Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        y050 y050Var = this.b;
        switch (i) {
            case 0:
                mo21 mo21Var = (mo21) ((Pair) obj).getFirst();
                boolean z = y050Var.H == null;
                y050Var.H = mo21Var;
                if (z) {
                    y050.Kg(y050Var);
                    break;
                }
                break;
            default:
                ((Number) obj).floatValue();
                y050.Kg(y050Var);
                break;
        }
        return zy11Var;
    }
}
