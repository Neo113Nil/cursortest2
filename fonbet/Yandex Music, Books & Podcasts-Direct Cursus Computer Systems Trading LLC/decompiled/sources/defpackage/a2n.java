package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a2n implements rjc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ n74 b;

    public a2n(n74 n74Var) {
        this.b = n74Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        v54 v54Var;
        v54 v54Var2;
        int i = this.a;
        n74 n74Var = this.b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                List list = (List) pair.a;
                z64 z64Var = (z64) pair.b;
                list.getClass();
                m74 m74Var = n74Var.d;
                s9f[] s9fVarArr = n74.f;
                m74Var.setValue(n74Var, s9fVarArr[1], list);
                m74 m74Var2 = n74Var.e;
                z64 z64Var2 = (z64) m74Var2.getValue(n74Var, s9fVarArr[2]);
                if (z64Var instanceof z64) {
                    nmb nmbVar = w54.a;
                    String str = z64Var.d;
                    if (!(z64Var instanceof y64)) {
                        if (!(z64Var instanceof x64)) {
                            b6e.s();
                            break;
                        } else {
                            v54Var2 = v54.PULT_WITH_STATIONS;
                        }
                    } else {
                        v54Var2 = v54.PULT;
                    }
                    v54Var2.getClass();
                    w54.a.f(v54Var2.a, str);
                } else if ((z64Var2 instanceof z64) && z64Var == null) {
                    nmb nmbVar2 = w54.a;
                    String str2 = z64Var2.d;
                    if (!(z64Var2 instanceof y64)) {
                        if (!(z64Var2 instanceof x64)) {
                            b6e.s();
                            break;
                        } else {
                            v54Var = v54.PULT_WITH_STATIONS;
                        }
                    } else {
                        v54Var = v54.PULT;
                    }
                    v54Var.getClass();
                    w54.a.d(v54Var.a, str2);
                }
                m74Var2.setValue(n74Var, s9fVarArr[2], z64Var);
                break;
            default:
                m84 m84Var = (m84) obj;
                m84Var.getClass();
                n74Var.c.setValue(n74Var, n74.f[0], m84Var);
                break;
        }
        return Unit.a;
    }

    public a2n(n74 n74Var, j2n j2nVar) {
        this.b = n74Var;
    }
}
