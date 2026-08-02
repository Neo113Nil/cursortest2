package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class m74 extends sij {
    public final /* synthetic */ int b;
    public final /* synthetic */ n74 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m74(n74 n74Var) {
        super(null);
        this.b = 2;
        this.c = n74Var;
    }

    @Override // defpackage.sij
    public final void afterChange(s9f s9fVar, Object obj, Object obj2) {
        int i = this.b;
        s9fVar.getClass();
        switch (i) {
            case 0:
                m84 m84Var = (m84) obj2;
                b84 b84Var = this.c.b;
                if (b84Var != null) {
                    m84Var.getClass();
                    b84Var.d.setValue(b84Var, b84.h[1], m84Var);
                    break;
                }
                break;
            case 1:
                List list = (List) obj2;
                b84 b84Var2 = this.c.b;
                if (b84Var2 != null) {
                    list.getClass();
                    b84Var2.c.setValue(b84Var2, b84.h[0], list);
                    break;
                }
                break;
            default:
                z64 z64Var = (z64) obj2;
                b84 b84Var3 = this.c.b;
                if (b84Var3 != null) {
                    b84Var3.e.setValue(b84Var3, b84.h[2], z64Var);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m74(Object obj, n74 n74Var, int i) {
        super(obj);
        this.b = i;
        this.c = n74Var;
    }
}
