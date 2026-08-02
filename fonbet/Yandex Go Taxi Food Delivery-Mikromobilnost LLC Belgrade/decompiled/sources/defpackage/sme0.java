package defpackage;

import java.util.Set;

/* loaded from: classes10.dex */
public final class sme0 implements xbi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ cne0 c;
    public final /* synthetic */ cne0 w;

    public /* synthetic */ sme0(int i, cne0 cne0Var, cne0 cne0Var2, String str) {
        this.a = i;
        this.b = str;
        this.c = cne0Var;
        this.w = cne0Var2;
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        int i = this.a;
        cne0 cne0Var = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(cne0Var.j(str, 0L));
            default:
                return cne0Var.n(str);
        }
    }

    @Override // defpackage.xbi0
    public final void setValue(Object obj, kgx kgxVar, Object obj2) {
        int i = this.a;
        cne0 cne0Var = this.w;
        String str = this.b;
        switch (i) {
            case 0:
                cne0Var.q(((Number) obj2).longValue(), str);
                break;
            default:
                cne0Var.t(str, (Set) obj2);
                break;
        }
    }
}
